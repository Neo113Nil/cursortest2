package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class Asn1OpenExt extends Asn1Type {
    private static final long serialVersionUID = -920914778083127823L;
    public transient ArrayList value = new ArrayList();
    private transient boolean[] mOptBits = null;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.value = (ArrayList) objectInputStream.readObject();
        this.mOptBits = (boolean[]) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeObject(this.value);
        objectOutputStream.writeObject(this.mOptBits);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeSmallNonNegWholeNumber = asn1PerDecodeBuffer.decodeSmallNonNegWholeNumber() + 1;
        boolean[] zArr = this.mOptBits;
        if (zArr == null || zArr.length < decodeSmallNonNegWholeNumber) {
            this.mOptBits = new boolean[decodeSmallNonNegWholeNumber];
        }
        int i = 0;
        for (int i2 = 0; i2 < decodeSmallNonNegWholeNumber; i2++) {
            this.mOptBits[i2] = asn1PerDecodeBuffer.decodeBit("optbit");
        }
        while (i < decodeSmallNonNegWholeNumber) {
            decodeOpenType(asn1PerDecodeBuffer, this.mOptBits[i], i);
            i++;
        }
        shrinkArray(i);
    }

    public void decodeComponent(Asn1BerDecodeBuffer asn1BerDecodeBuffer) throws Asn1Exception, IOException {
        Asn1OpenType asn1OpenType = new Asn1OpenType();
        asn1OpenType.decode(asn1BerDecodeBuffer, false, 0);
        this.value.add(asn1OpenType);
    }

    public void decodeEventComponent(Asn1BerDecodeBuffer asn1BerDecodeBuffer) throws Asn1Exception, IOException {
        asn1BerDecodeBuffer.invokeStartElement("...", -1);
        Asn1OpenType asn1OpenType = new Asn1OpenType();
        asn1OpenType.decode(asn1BerDecodeBuffer, false, 0);
        this.value.add(asn1OpenType);
        asn1BerDecodeBuffer.invokeCharacters(asn1OpenType.toString());
        asn1BerDecodeBuffer.invokeEndElement("...", -1);
    }

    public Asn1OpenType decodeOpenType(Asn1PerDecodeBuffer asn1PerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        ArrayList arrayList = this.value;
        if (!z) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.value;
            if (i < size) {
                arrayList2.set(i, null);
                return null;
            }
            arrayList2.add(null);
            return null;
        }
        if (i >= arrayList.size()) {
            Asn1OpenType asn1OpenType = new Asn1OpenType();
            asn1OpenType.decode(asn1PerDecodeBuffer);
            this.value.add(asn1OpenType);
            return asn1OpenType;
        }
        Asn1OpenType asn1OpenType2 = (Asn1OpenType) this.value.get(i);
        if (asn1OpenType2 == null) {
            asn1OpenType2 = new Asn1OpenType();
        }
        asn1OpenType2.decode(asn1PerDecodeBuffer);
        this.value.set(i, asn1OpenType2);
        return asn1OpenType2;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder) throws IOException, Asn1Exception {
        for (int i = 0; i < this.value.size(); i++) {
            Asn1OpenType asn1OpenType = (Asn1OpenType) this.value.get(i);
            if (asn1OpenType != null) {
                asn1XerEncoder.encodeStartElement(null);
                asn1XerEncoder.copy(asn1OpenType.value);
                asn1XerEncoder.encodeEndElement(null);
                asn1XerEncoder.setState(3);
            }
        }
    }

    public void encodeExtBits(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        for (int i = 0; i < this.value.size(); i++) {
            asn1PerEncodeBuffer.encodeBit(this.value.get(i) != null, "optbit");
        }
    }

    public void setOpenType(Asn1OpenType asn1OpenType, int i) {
        int size = this.value.size();
        ArrayList arrayList = this.value;
        if (i < size) {
            arrayList.set(i, asn1OpenType);
        } else {
            arrayList.add(asn1OpenType);
        }
    }

    public void shrinkArray(int i) {
        for (int i2 = i; i2 < this.value.size(); i2++) {
            this.value.remove(i);
        }
    }

    public String toString() {
        if (this.value == null) {
            return "<null>";
        }
        StringBuffer stringBuffer = new StringBuffer(100);
        for (int i = 0; i < this.value.size(); i++) {
            String asn1OpenType = ((Asn1OpenType) this.value.get(i)).toString();
            if (asn1OpenType.length() + stringBuffer.length() + 2 >= stringBuffer.capacity()) {
                stringBuffer.ensureCapacity(100);
            }
            if (i != 0) {
                stringBuffer.append(Extension.FIX_SPACE);
            }
            stringBuffer.append(asn1OpenType);
        }
        return stringBuffer.toString();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        for (int i = 0; i < this.value.size(); i++) {
            Asn1OpenType asn1OpenType = (Asn1OpenType) this.value.get(i);
            if (asn1OpenType != null) {
                asn1OpenType.encode(asn1PerEncodeBuffer);
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        for (int i = 0; i < this.value.size(); i++) {
            Asn1OpenType asn1OpenType = (Asn1OpenType) this.value.get(i);
            if (asn1OpenType != null) {
                asn1OpenType.encode(asn1BerOutputStream, false);
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        for (int i = 0; i < this.value.size(); i++) {
            Asn1OpenType asn1OpenType = (Asn1OpenType) this.value.get(i);
            if (asn1OpenType != null) {
                asn1OpenType.encode(asn1PerOutputStream);
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = 0;
        for (int size = this.value.size() - 1; size >= 0; size--) {
            i += ((Asn1OpenType) this.value.get(size)).encode(asn1BerEncodeBuffer, false);
        }
        return i;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        decodeComponent(asn1BerDecodeBuffer);
    }
}
