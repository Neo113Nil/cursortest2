package defpackage;

/* loaded from: classes12.dex */
public abstract class n3f {
    public static final int[] a = new int[256];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i << 8;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 = (32768 & i2) != 0 ? (i2 << 1) ^ 4129 : i2 << 1;
            }
            a[i] = i2 & 65535;
        }
    }
}
