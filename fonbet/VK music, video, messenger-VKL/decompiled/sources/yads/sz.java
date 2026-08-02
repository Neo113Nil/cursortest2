package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class sz {
    public static final sz b;
    public static final /* synthetic */ sz[] c;

    static {
        sz szVar = new sz();
        b = szVar;
        c = new sz[]{szVar};
    }

    public static sz valueOf(String str) {
        return (sz) Enum.valueOf(sz.class, str);
    }

    public static sz[] values() {
        return (sz[]) c.clone();
    }
}
