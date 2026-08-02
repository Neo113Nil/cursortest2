package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1XmlEncodeBuffer extends Asn1XerEncodeBuffer {
    private static Asn1RunTime rt = Asn1RunTime.instance();

    public Asn1XmlEncodeBuffer(boolean z) {
        super(z, 0);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncodeBuffer, com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeEndElement(String str) throws Asn1Exception {
        if (str == null || str.length() <= 0) {
            return;
        }
        if (this.mState == 3) {
            indent();
        }
        rt.lcheck(4);
        StringBuffer stringBuffer = new StringBuffer("</");
        stringBuffer.append(str);
        stringBuffer.append(">");
        copy(new String(stringBuffer.toString()));
        this.mState = 3;
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerEncodeBuffer, com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeNamedValueElement(String str) throws Asn1Exception {
        copy(str);
        this.mState = 2;
    }

    public Asn1XmlEncodeBuffer() {
    }

    public Asn1XmlEncodeBuffer(boolean z, int i) {
        super(z, i);
    }
}
