package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellButtonGroup.kt */
/* loaded from: classes17.dex */
public final class hmu {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ hmu[] $VALUES;
    public static final hmu Button;
    public static final hmu Divider;

    static {
        hmu hmuVar = new hmu("Button", 0);
        Button = hmuVar;
        hmu hmuVar2 = new hmu("Divider", 1);
        Divider = hmuVar2;
        hmu[] hmuVarArr = {hmuVar, hmuVar2};
        $VALUES = hmuVarArr;
        $ENTRIES = new asp(hmuVarArr);
    }

    public hmu() {
        throw null;
    }

    public static hmu valueOf(String str) {
        return (hmu) Enum.valueOf(hmu.class, str);
    }

    public static hmu[] values() {
        return (hmu[]) $VALUES.clone();
    }
}
