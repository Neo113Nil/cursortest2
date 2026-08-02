package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1EndOfBufferException extends Asn1Exception {
    public Asn1EndOfBufferException(Asn1DecodeBuffer asn1DecodeBuffer) {
        super(asn1DecodeBuffer, "Unexpected end-of-buffer encountered.");
    }
}
