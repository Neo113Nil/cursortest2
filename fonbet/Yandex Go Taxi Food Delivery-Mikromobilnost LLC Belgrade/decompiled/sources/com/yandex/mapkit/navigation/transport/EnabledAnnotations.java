package com.yandex.mapkit.navigation.transport;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EVERYTHING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes12.dex */
public final class EnabledAnnotations {
    private static final /* synthetic */ EnabledAnnotations[] $VALUES;
    public static final EnabledAnnotations DISMOUNT;
    public static final EnabledAnnotations EVERYTHING;
    public static final EnabledAnnotations MANOEUVRES;
    public final int value;

    private static /* synthetic */ EnabledAnnotations[] $values() {
        return new EnabledAnnotations[]{MANOEUVRES, DISMOUNT, EVERYTHING};
    }

    static {
        EnabledAnnotations enabledAnnotations = new EnabledAnnotations("MANOEUVRES", 0, 1);
        MANOEUVRES = enabledAnnotations;
        EnabledAnnotations enabledAnnotations2 = new EnabledAnnotations("DISMOUNT", 1, 2);
        DISMOUNT = enabledAnnotations2;
        EVERYTHING = new EnabledAnnotations("EVERYTHING", 2, enabledAnnotations.value | enabledAnnotations2.value);
        $VALUES = $values();
    }

    private EnabledAnnotations(String str, int i, int i2) {
        this.value = i2;
    }

    public static EnabledAnnotations valueOf(String str) {
        return (EnabledAnnotations) Enum.valueOf(EnabledAnnotations.class, str);
    }

    public static EnabledAnnotations[] values() {
        return (EnabledAnnotations[]) $VALUES.clone();
    }
}
