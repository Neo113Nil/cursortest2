package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public interface Asn1InputStream {
    int available() throws IOException;

    void close() throws IOException;

    void mark(int i);

    boolean markSupported();

    void reset();

    long skip(long j) throws IOException;
}
