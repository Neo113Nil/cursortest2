package xsna;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: BufferRecycler.java */
/* loaded from: classes12.dex */
public final class im8 {
    public static final int[] c = {8000, 8000, 2000, 2000};
    public static final int[] d = {4000, 4000, 200, 200};
    public final AtomicReferenceArray<byte[]> a = new AtomicReferenceArray<>(4);
    public final AtomicReferenceArray<char[]> b = new AtomicReferenceArray<>(4);

    public final char[] a(int i, int i2) {
        int i3 = d[i];
        if (i2 < i3) {
            i2 = i3;
        }
        char[] andSet = this.b.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? new char[i2] : andSet;
    }
}
