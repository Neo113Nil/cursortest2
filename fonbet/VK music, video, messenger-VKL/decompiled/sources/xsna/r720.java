package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfflineVideoMenuBottomSheet.kt */
/* loaded from: classes3.dex */
public final class r720 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ r720[] $VALUES;
    public static final r720 OpenDownloads;
    public static final r720 PauseResume;
    public static final r720 Remove;

    static {
        r720 r720Var = new r720("Remove", 0);
        Remove = r720Var;
        r720 r720Var2 = new r720("PauseResume", 1);
        PauseResume = r720Var2;
        r720 r720Var3 = new r720("OpenDownloads", 2);
        OpenDownloads = r720Var3;
        r720[] r720VarArr = {r720Var, r720Var2, r720Var3};
        $VALUES = r720VarArr;
        $ENTRIES = new asp(r720VarArr);
    }

    public r720() {
        throw null;
    }

    public static r720 valueOf(String str) {
        return (r720) Enum.valueOf(r720.class, str);
    }

    public static r720[] values() {
        return (r720[]) $VALUES.clone();
    }
}
