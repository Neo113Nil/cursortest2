package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EduOrganizationDb.kt */
/* loaded from: classes2.dex */
public final class m6p implements qgl0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ m6p[] $VALUES;
    public static final m6p ORGANIZATION_ID;
    public static final m6p ORGANIZATION_NAME;
    public static final m6p ORGANIZATION_TYPE;
    private final String key;

    static {
        m6p m6pVar = new m6p("ORGANIZATION_ID", 0, "id");
        ORGANIZATION_ID = m6pVar;
        m6p m6pVar2 = new m6p("ORGANIZATION_TYPE", 1, "type");
        ORGANIZATION_TYPE = m6pVar2;
        m6p m6pVar3 = new m6p("ORGANIZATION_NAME", 2, "name");
        ORGANIZATION_NAME = m6pVar3;
        m6p[] m6pVarArr = {m6pVar, m6pVar2, m6pVar3};
        $VALUES = m6pVarArr;
        $ENTRIES = new asp(m6pVarArr);
    }

    public m6p(String str, int i, String str2) {
        this.key = str2;
    }

    public static m6p valueOf(String str) {
        return (m6p) Enum.valueOf(m6p.class, str);
    }

    public static m6p[] values() {
        return (m6p[]) $VALUES.clone();
    }

    @Override // xsna.qgl0
    public final String getKey() {
        return this.key;
    }
}
