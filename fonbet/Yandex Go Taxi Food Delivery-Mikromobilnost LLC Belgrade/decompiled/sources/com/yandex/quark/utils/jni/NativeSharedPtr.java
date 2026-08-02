package com.yandex.quark.utils.jni;

/* loaded from: classes2.dex */
public final class NativeSharedPtr {
    public final long address;

    public static class CleanAction implements Runnable {
        private final long address;

        public CleanAction(long j) {
            this.address = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeSharedPtr.nativeFree(this.address);
        }
    }

    private NativeSharedPtr(long j) {
        this.address = j;
        IoCleaner.register(this, new CleanAction(j));
    }

    public static NativeSharedPtr makeNull() {
        return new NativeSharedPtr(0L);
    }

    private static native boolean nativeEquals(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFree(long j);

    private static native int nativeHashCode(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NativeSharedPtr.class != obj.getClass()) {
            return false;
        }
        return nativeEquals(this.address, ((NativeSharedPtr) obj).address);
    }

    public int hashCode() {
        return nativeHashCode(this.address);
    }
}
