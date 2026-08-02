package xsna;

import java.nio.ByteBuffer;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ArcNative.kt */
/* loaded from: classes2.dex */
public final class dg3 {
    public final wek a;
    public volatile int b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new xm1(this, 1));

    public dg3(wek wekVar) {
        this.a = wekVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public final synchronized ByteBuffer a() {
        if (this.b <= 0 && this.c.isInitialized()) {
            throw new IllegalStateException("Array has already dealloc!");
        }
        this.b++;
        return (ByteBuffer) this.c.getValue();
    }
}
