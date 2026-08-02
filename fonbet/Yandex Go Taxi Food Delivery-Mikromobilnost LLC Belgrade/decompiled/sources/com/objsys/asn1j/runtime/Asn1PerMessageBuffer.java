package com.objsys.asn1j.runtime;

import java.io.InputStream;

/* loaded from: classes11.dex */
public interface Asn1PerMessageBuffer {
    void byteAlign();

    InputStream getInputStream();

    int getMsgBitCnt();

    Asn1PerTraceHandler getTraceHandler();

    boolean isAligned();
}
