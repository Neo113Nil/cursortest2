package one.video.calls.sdk_private;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QuicConnection.java */
/* loaded from: classes8.dex */
public final class ao$a {
    public static final ao$a a;
    public static final ao$a b;
    private static final /* synthetic */ ao$a[] c;

    static {
        ao$a ao_a = new ao$a("V1", 0);
        a = ao_a;
        ao$a ao_a2 = new ao$a("V2", 1);
        b = ao_a2;
        c = new ao$a[]{ao_a, ao_a2};
    }

    public ao$a() {
        throw null;
    }

    public static ao$a valueOf(String str) {
        return (ao$a) Enum.valueOf(ao$a.class, str);
    }

    public static ao$a[] values() {
        return (ao$a[]) c.clone();
    }
}
