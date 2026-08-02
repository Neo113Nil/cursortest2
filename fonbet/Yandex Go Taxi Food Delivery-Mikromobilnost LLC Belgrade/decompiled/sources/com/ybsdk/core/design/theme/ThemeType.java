package com.ybsdk.core.design.theme;

import defpackage.k4o;
import defpackage.l1i0;
import defpackage.qwy0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/design/theme/ThemeType;", "", "", "styleRes", "<init>", "(Ljava/lang/String;II)V", CA20Status.STATUS_USER_I, "getStyleRes", "()I", "Companion", "qwy0", "LIGHT", "DARK", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThemeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ThemeType[] $VALUES;
    public static final qwy0 Companion;
    public static final ThemeType DARK;
    private static final ThemeType DEFAULT_THEME_TYPE;
    public static final ThemeType LIGHT;
    private final int styleRes;

    private static final /* synthetic */ ThemeType[] $values() {
        return new ThemeType[]{LIGHT, DARK};
    }

    static {
        ThemeType themeType = new ThemeType("LIGHT", 0, l1i0.Theme_YB_Widgets_Common_Light);
        LIGHT = themeType;
        DARK = new ThemeType("DARK", 1, l1i0.Theme_YB_Widgets_Common_Dark);
        ThemeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new qwy0();
        DEFAULT_THEME_TYPE = themeType;
    }

    private ThemeType(String str, int i, int i2) {
        this.styleRes = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ThemeType valueOf(String str) {
        return (ThemeType) Enum.valueOf(ThemeType.class, str);
    }

    public static ThemeType[] values() {
        return (ThemeType[]) $VALUES.clone();
    }

    public final int getStyleRes() {
        return this.styleRes;
    }
}
