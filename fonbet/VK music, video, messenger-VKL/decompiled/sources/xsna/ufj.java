package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidContentCaptureManager.android.kt */
/* loaded from: classes11.dex */
public final class ufj {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ufj[] $VALUES;
    public static final ufj VIEW_APPEAR;
    public static final ufj VIEW_DISAPPEAR;

    static {
        ufj ufjVar = new ufj("VIEW_APPEAR", 0);
        VIEW_APPEAR = ufjVar;
        ufj ufjVar2 = new ufj("VIEW_DISAPPEAR", 1);
        VIEW_DISAPPEAR = ufjVar2;
        ufj[] ufjVarArr = {ufjVar, ufjVar2};
        $VALUES = ufjVarArr;
        $ENTRIES = new asp(ufjVarArr);
    }

    public ufj() {
        throw null;
    }

    public static ufj valueOf(String str) {
        return (ufj) Enum.valueOf(ufj.class, str);
    }

    public static ufj[] values() {
        return (ufj[]) $VALUES.clone();
    }
}
