package com.objsys.asn1j.runtime;

import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: classes11.dex */
public class Asn1XerDecodeBuffer {
    private static Asn1RunTime rt = Asn1RunTime.instance();
    protected InputSource mInputSource;

    public Asn1XerDecodeBuffer(String str) throws IOException, SAXException {
        this.mInputSource = new InputSource(str);
    }

    public InputSource getInputSource() {
        return this.mInputSource;
    }
}
