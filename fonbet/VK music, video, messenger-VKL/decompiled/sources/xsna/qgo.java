package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimelineView.kt */
/* loaded from: classes2.dex */
public final class qgo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ qgo[] $VALUES;
    public static final qgo FullOverlay;
    public static final qgo NoState;
    public static final qgo OnlyPreviewBehind;

    static {
        qgo qgoVar = new qgo("NoState", 0);
        NoState = qgoVar;
        qgo qgoVar2 = new qgo("OnlyPreviewBehind", 1);
        OnlyPreviewBehind = qgoVar2;
        qgo qgoVar3 = new qgo("FullOverlay", 2);
        FullOverlay = qgoVar3;
        qgo[] qgoVarArr = {qgoVar, qgoVar2, qgoVar3};
        $VALUES = qgoVarArr;
        $ENTRIES = new asp(qgoVarArr);
    }

    public qgo() {
        throw null;
    }

    public static qgo valueOf(String str) {
        return (qgo) Enum.valueOf(qgo.class, str);
    }

    public static qgo[] values() {
        return (qgo[]) $VALUES.clone();
    }
}
