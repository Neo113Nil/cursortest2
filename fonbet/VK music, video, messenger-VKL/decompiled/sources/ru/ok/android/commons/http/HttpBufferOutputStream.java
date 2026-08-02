package ru.ok.android.commons.http;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import xsna.zcl;

/* compiled from: HttpBufferOutputStream.kt */
/* loaded from: classes9.dex */
public final class HttpBufferOutputStream extends ByteArrayOutputStream {
    public static final Companion Companion = new Companion(null);

    /* compiled from: HttpBufferOutputStream.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final HttpBufferOutputStream withContentLength(long j) {
            zcl zclVar = null;
            return j >= 0 ? new HttpBufferOutputStream((int) j, zclVar) : new HttpBufferOutputStream(zclVar);
        }

        private Companion() {
        }
    }

    public /* synthetic */ HttpBufferOutputStream(int i, zcl zclVar) {
        this(i);
    }

    public final byte[] getBytes() {
        int i = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        return i == bArr.length ? bArr : Arrays.copyOf(bArr, i);
    }

    public /* synthetic */ HttpBufferOutputStream(zcl zclVar) {
        this();
    }

    private HttpBufferOutputStream() {
    }

    private HttpBufferOutputStream(int i) {
        super(i);
    }
}
