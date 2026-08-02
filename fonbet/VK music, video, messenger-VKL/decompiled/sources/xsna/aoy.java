package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class aoy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ aoy[] $VALUES;
    public static final aoy InnerCircle;
    public static final aoy Selector;

    static {
        aoy aoyVar = new aoy("Selector", 0);
        Selector = aoyVar;
        aoy aoyVar2 = new aoy("InnerCircle", 1);
        InnerCircle = aoyVar2;
        aoy[] aoyVarArr = {aoyVar, aoyVar2};
        $VALUES = aoyVarArr;
        $ENTRIES = new asp(aoyVarArr);
    }

    public aoy() {
        throw null;
    }

    public static aoy valueOf(String str) {
        return (aoy) Enum.valueOf(aoy.class, str);
    }

    public static aoy[] values() {
        return (aoy[]) $VALUES.clone();
    }
}
