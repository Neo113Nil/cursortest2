package xsna;

import java.nio.ByteBuffer;

/* compiled from: RegularWritable.kt */
/* loaded from: classes8.dex */
public final class rrf0 implements yzx0 {
    public final t3j a;

    public rrf0(t3j t3jVar) {
        this.a = t3jVar;
    }

    @Override // xsna.yzx0
    public final int write(ByteBuffer byteBuffer) {
        return this.a.f.a.write(byteBuffer);
    }
}
