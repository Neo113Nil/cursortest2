package one.video.calls.sdk_private;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InetTools.java */
/* loaded from: classes8.dex */
public final class cY$a {
    public static final cY$a a;
    public static final cY$a b;
    public static final cY$a c;
    public static final cY$a d;
    private static final /* synthetic */ cY$a[] e;

    static {
        cY$a cy_a = new cY$a("UseIPv4", 0);
        a = cy_a;
        cY$a cy_a2 = new cY$a("UseIPv6", 1);
        b = cy_a2;
        cY$a cy_a3 = new cY$a("PreferIPv4", 2);
        c = cy_a3;
        cY$a cy_a4 = new cY$a("PreferIPv6", 3);
        d = cy_a4;
        e = new cY$a[]{cy_a, cy_a2, cy_a3, cy_a4};
    }

    public cY$a() {
        throw null;
    }

    public static cY$a valueOf(String str) {
        return (cY$a) Enum.valueOf(cY$a.class, str);
    }

    public static cY$a[] values() {
        return (cY$a[]) e.clone();
    }
}
