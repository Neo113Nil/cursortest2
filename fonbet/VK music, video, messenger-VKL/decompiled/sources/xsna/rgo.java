package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToRemoveTrackContainer.kt */
/* loaded from: classes3.dex */
public final class rgo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ rgo[] $VALUES;
    public static final rgo Center;
    public static final rgo End;

    static {
        rgo rgoVar = new rgo("Center", 0);
        Center = rgoVar;
        rgo rgoVar2 = new rgo("End", 1);
        End = rgoVar2;
        rgo[] rgoVarArr = {rgoVar, rgoVar2};
        $VALUES = rgoVarArr;
        $ENTRIES = new asp(rgoVarArr);
    }

    public rgo() {
        throw null;
    }

    public static rgo valueOf(String str) {
        return (rgo) Enum.valueOf(rgo.class, str);
    }

    public static rgo[] values() {
        return (rgo[]) $VALUES.clone();
    }
}
