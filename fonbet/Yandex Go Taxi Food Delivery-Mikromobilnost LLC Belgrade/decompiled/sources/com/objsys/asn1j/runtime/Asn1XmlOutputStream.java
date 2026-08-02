package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes11.dex */
public class Asn1XmlOutputStream extends Asn1XerOutputStream {
    private static Asn1RunTime rt = Asn1RunTime.instance();

    public Asn1XmlOutputStream(OutputStream outputStream, int i) {
        super(outputStream, false, i);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerOutputStream, com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeEndElement(String str) throws Asn1Exception, IOException {
        if (str == null || str.length() <= 0) {
            return;
        }
        if (this.mState == 3) {
            indent();
        }
        StringBuffer stringBuffer = new StringBuffer("</");
        stringBuffer.append(str);
        stringBuffer.append(">");
        copy(new String(stringBuffer.toString()));
        this.mState = 3;
        rt.lcheck(4);
    }

    @Override // com.objsys.asn1j.runtime.Asn1XerOutputStream, com.objsys.asn1j.runtime.Asn1XerEncoder
    public void encodeNamedValueElement(String str) throws Asn1Exception, IOException {
        write(str);
        this.mState = 2;
    }

    public Asn1XmlOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public Asn1XmlOutputStream(OutputStream outputStream, boolean z, int i) {
        super(outputStream, z, i);
    }
}
