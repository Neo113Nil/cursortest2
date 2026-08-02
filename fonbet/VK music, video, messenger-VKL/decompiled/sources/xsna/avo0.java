package xsna;

/* compiled from: TimeProvider.kt */
/* loaded from: classes.dex */
public final class avo0 implements zuo0 {
    public static final avo0 a = new avo0();

    @Override // xsna.zuo0
    public final long a() {
        return System.currentTimeMillis() * 1000;
    }
}
