package com.yandex.go.deeplinks.generated.scooters;

import defpackage.hgo0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/deeplinks/generated/scooters/ScootersPassesSection;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "hgo0", "PASSES", "ACTIVE_PASSES", "SUPERPASS", "ACTIVE_SUPERPASS", "deeplinks"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScootersPassesSection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPassesSection[] $VALUES;
    public static final ScootersPassesSection ACTIVE_PASSES;
    public static final ScootersPassesSection ACTIVE_SUPERPASS;
    public static final hgo0 Companion;
    public static final ScootersPassesSection PASSES;
    public static final ScootersPassesSection SUPERPASS;
    private final String value;

    static {
        ScootersPassesSection scootersPassesSection = new ScootersPassesSection("PASSES", 0, "passes");
        PASSES = scootersPassesSection;
        ScootersPassesSection scootersPassesSection2 = new ScootersPassesSection("ACTIVE_PASSES", 1, "active_passes");
        ACTIVE_PASSES = scootersPassesSection2;
        ScootersPassesSection scootersPassesSection3 = new ScootersPassesSection("SUPERPASS", 2, "superpass");
        SUPERPASS = scootersPassesSection3;
        ScootersPassesSection scootersPassesSection4 = new ScootersPassesSection("ACTIVE_SUPERPASS", 3, "active_superpass");
        ACTIVE_SUPERPASS = scootersPassesSection4;
        ScootersPassesSection[] scootersPassesSectionArr = {scootersPassesSection, scootersPassesSection2, scootersPassesSection3, scootersPassesSection4};
        $VALUES = scootersPassesSectionArr;
        $ENTRIES = a.a(scootersPassesSectionArr);
        Companion = new hgo0();
    }

    public ScootersPassesSection(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ScootersPassesSection valueOf(String str) {
        return (ScootersPassesSection) Enum.valueOf(ScootersPassesSection.class, str);
    }

    public static ScootersPassesSection[] values() {
        return (ScootersPassesSection[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
