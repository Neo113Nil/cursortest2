package defpackage;

/* loaded from: classes13.dex */
public final class e1n0 {
    public final String a;
    public final boolean b;

    public e1n0(String str, int i) {
        str = (i & 1) != 0 ? null : str;
        boolean z = (i & 2) == 0;
        this.a = str;
        this.b = z;
    }

    public e1n0() {
        this(null, 3);
    }
}
