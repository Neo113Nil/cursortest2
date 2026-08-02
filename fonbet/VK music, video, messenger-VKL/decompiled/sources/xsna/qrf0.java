package xsna;

import java.nio.ByteBuffer;

/* compiled from: RegularReadable.kt */
/* loaded from: classes8.dex */
public final class qrf0 implements t7f0 {
    public final t3j a;

    public qrf0(t3j t3jVar) {
        this.a = t3jVar;
    }

    @Override // xsna.t7f0
    public final int read(ByteBuffer byteBuffer) {
        return this.a.f.a.read(byteBuffer);
    }
}
