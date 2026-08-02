package com.yandex.go.deeplinks.generated.chargers;

import defpackage.k4o;
import defpackage.ova;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/deeplinks/generated/chargers/ChargersSuperpassSection;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "ova", "SUPERPASS", "ACTIVE_SUPERPASS", "deeplinks"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersSuperpassSection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersSuperpassSection[] $VALUES;
    public static final ChargersSuperpassSection ACTIVE_SUPERPASS;
    public static final ova Companion;
    public static final ChargersSuperpassSection SUPERPASS;
    private final String value;

    static {
        ChargersSuperpassSection chargersSuperpassSection = new ChargersSuperpassSection("SUPERPASS", 0, "superpass");
        SUPERPASS = chargersSuperpassSection;
        ChargersSuperpassSection chargersSuperpassSection2 = new ChargersSuperpassSection("ACTIVE_SUPERPASS", 1, "active_superpass");
        ACTIVE_SUPERPASS = chargersSuperpassSection2;
        ChargersSuperpassSection[] chargersSuperpassSectionArr = {chargersSuperpassSection, chargersSuperpassSection2};
        $VALUES = chargersSuperpassSectionArr;
        $ENTRIES = a.a(chargersSuperpassSectionArr);
        Companion = new ova();
    }

    public ChargersSuperpassSection(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ChargersSuperpassSection valueOf(String str) {
        return (ChargersSuperpassSection) Enum.valueOf(ChargersSuperpassSection.class, str);
    }

    public static ChargersSuperpassSection[] values() {
        return (ChargersSuperpassSection[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
