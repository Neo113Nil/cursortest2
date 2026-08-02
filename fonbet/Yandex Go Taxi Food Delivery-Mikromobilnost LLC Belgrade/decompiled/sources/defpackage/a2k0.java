package defpackage;

/* loaded from: classes10.dex */
public final class a2k0 {
    public static final a2k0 d = new a2k0(false, 0, false);
    public static final a2k0 e = new a2k0(true, 500, false);
    public static final a2k0 f;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new a2k0(true, 100L, false);
        f = new a2k0(false, 0L, true);
    }

    public a2k0(boolean z, long j, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            d6z.m("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
