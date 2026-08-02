package xsna;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes13.dex */
public final class p5q0 extends q5q0 {
    @Override // xsna.q5q0
    public final <T> T b(Class<T> cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}
