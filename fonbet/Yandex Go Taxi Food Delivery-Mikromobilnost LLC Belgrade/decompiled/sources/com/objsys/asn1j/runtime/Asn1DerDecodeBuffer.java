package com.objsys.asn1j.runtime;

import java.io.InputStream;

/* loaded from: classes4.dex */
public class Asn1DerDecodeBuffer extends Asn1BerDecodeBuffer {
    public Asn1DerDecodeBuffer(byte[] bArr) {
        super(bArr);
    }

    public Asn1DerDecodeBuffer(InputStream inputStream) {
        super(inputStream);
    }
}
