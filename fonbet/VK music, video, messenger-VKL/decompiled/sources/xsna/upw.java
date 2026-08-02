package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipScreenContent.kt */
/* loaded from: classes18.dex */
public final class upw {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ upw[] $VALUES;
    public static final upw Compose;
    public static final upw View;

    static {
        upw upwVar = new upw("View", 0);
        View = upwVar;
        upw upwVar2 = new upw("Compose", 1);
        Compose = upwVar2;
        upw[] upwVarArr = {upwVar, upwVar2};
        $VALUES = upwVarArr;
        $ENTRIES = new asp(upwVarArr);
    }

    public upw() {
        throw null;
    }

    public static zrp<upw> h() {
        return $ENTRIES;
    }

    public static upw valueOf(String str) {
        return (upw) Enum.valueOf(upw.class, str);
    }

    public static upw[] values() {
        return (upw[]) $VALUES.clone();
    }
}
