package com.ybsdk.feature.passport.api.adapter;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/passport/api/adapter/PassportTheme;", "", "<init>", "(Ljava/lang/String;I)V", "DARK", "LIGHT", "LIGHT_CUSTOM", "FOLLOW_SYSTEM", "feature-passport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PassportTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportTheme[] $VALUES;
    public static final PassportTheme DARK = new PassportTheme("DARK", 0);
    public static final PassportTheme LIGHT = new PassportTheme("LIGHT", 1);
    public static final PassportTheme LIGHT_CUSTOM = new PassportTheme("LIGHT_CUSTOM", 2);
    public static final PassportTheme FOLLOW_SYSTEM = new PassportTheme("FOLLOW_SYSTEM", 3);

    private static final /* synthetic */ PassportTheme[] $values() {
        return new PassportTheme[]{DARK, LIGHT, LIGHT_CUSTOM, FOLLOW_SYSTEM};
    }

    static {
        PassportTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PassportTheme(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PassportTheme valueOf(String str) {
        return (PassportTheme) Enum.valueOf(PassportTheme.class, str);
    }

    public static PassportTheme[] values() {
        return (PassportTheme[]) $VALUES.clone();
    }
}
