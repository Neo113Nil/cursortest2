package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EduContactSectionDb.kt */
/* loaded from: classes2.dex */
public final class x5p implements qgl0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ x5p[] $VALUES;
    public static final x5p ORGANIZATION_ID;
    public static final x5p ORGANIZATION_PEER_IDS;
    public static final x5p ORGANIZATION_SECTION_NAME;
    public static final x5p ORGANIZATION_SECTION_ORDER;
    private final String key;

    static {
        x5p x5pVar = new x5p("ORGANIZATION_ID", 0, "organization_id");
        ORGANIZATION_ID = x5pVar;
        x5p x5pVar2 = new x5p("ORGANIZATION_SECTION_NAME", 1, "section_name");
        ORGANIZATION_SECTION_NAME = x5pVar2;
        x5p x5pVar3 = new x5p("ORGANIZATION_SECTION_ORDER", 2, "section_order");
        ORGANIZATION_SECTION_ORDER = x5pVar3;
        x5p x5pVar4 = new x5p("ORGANIZATION_PEER_IDS", 3, "peer_ids");
        ORGANIZATION_PEER_IDS = x5pVar4;
        x5p[] x5pVarArr = {x5pVar, x5pVar2, x5pVar3, x5pVar4};
        $VALUES = x5pVarArr;
        $ENTRIES = new asp(x5pVarArr);
    }

    public x5p(String str, int i, String str2) {
        this.key = str2;
    }

    public static x5p valueOf(String str) {
        return (x5p) Enum.valueOf(x5p.class, str);
    }

    public static x5p[] values() {
        return (x5p[]) $VALUES.clone();
    }

    @Override // xsna.qgl0
    public final String getKey() {
        return this.key;
    }
}
