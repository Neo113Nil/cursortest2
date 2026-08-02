package com.yandex.quark.utils.jni;

/* loaded from: classes2.dex */
final class NativeWeakPtr {
    public final long address;

    public static class CleanAction implements Runnable {
        private final long address;

        public CleanAction(long j) {
            this.address = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeWeakPtr.nativeFree(this.address);
        }
    }

    private NativeWeakPtr(long j) {
        this.address = j;
        IoCleaner.register(this, new CleanAction(j));
    }

    private static native boolean nativeEquals(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFree(long j);

    private static native int nativeHashCode(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NativeWeakPtr.class != obj.getClass()) {
            return false;
        }
        return nativeEquals(this.address, ((NativeWeakPtr) obj).address);
    }

    public int hashCode() {
        return nativeHashCode(this.address);
    }
}
