package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EqualizerSlider.kt */
/* loaded from: classes3.dex */
public final class mtp {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ mtp[] $VALUES;
    public static final mtp LABEL;
    public static final mtp THUMB;
    public static final mtp TRACK;

    static {
        mtp mtpVar = new mtp("THUMB", 0);
        THUMB = mtpVar;
        mtp mtpVar2 = new mtp("TRACK", 1);
        TRACK = mtpVar2;
        mtp mtpVar3 = new mtp("LABEL", 2);
        LABEL = mtpVar3;
        mtp[] mtpVarArr = {mtpVar, mtpVar2, mtpVar3};
        $VALUES = mtpVarArr;
        $ENTRIES = new asp(mtpVarArr);
    }

    public mtp() {
        throw null;
    }

    public static mtp valueOf(String str) {
        return (mtp) Enum.valueOf(mtp.class, str);
    }

    public static mtp[] values() {
        return (mtp[]) $VALUES.clone();
    }
}
