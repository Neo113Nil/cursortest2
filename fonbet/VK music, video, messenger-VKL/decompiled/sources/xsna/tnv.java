package xsna;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.io.ContentReference;

/* compiled from: IOContext.java */
/* loaded from: classes12.dex */
public final class tnv {
    public final ContentReference a;

    @Deprecated
    public final Object b;
    public JsonEncoding c;
    public final boolean d;
    public final im8 e;
    public final StreamReadConstraints f;
    public byte[] g;
    public byte[] h;
    public char[] i;
    public char[] j;
    public char[] k;

    public tnv(StreamReadConstraints streamReadConstraints, im8 im8Var, ContentReference contentReference, boolean z) {
        this.f = streamReadConstraints == null ? StreamReadConstraints.b : streamReadConstraints;
        this.e = im8Var;
        this.a = contentReference;
        this.b = contentReference.b;
        this.d = z;
    }

    public static void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final void b(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = this.g;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            this.g = null;
            this.e.a.set(0, bArr);
        }
    }
}
