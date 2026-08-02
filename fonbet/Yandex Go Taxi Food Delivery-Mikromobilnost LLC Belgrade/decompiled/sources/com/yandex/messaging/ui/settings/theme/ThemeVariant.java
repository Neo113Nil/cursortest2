package com.yandex.messaging.ui.settings.theme;

import defpackage.k4o;
import defpackage.w0i0;
import defpackage.wwy0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/ui/settings/theme/ThemeVariant;", "", "", "themeResId", CA20Status.STATUS_USER_I, "b", "()I", "Companion", "wwy0", "System", "Light", "Dark", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ThemeVariant {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ThemeVariant[] $VALUES;
    public static final wwy0 Companion;
    public static final ThemeVariant Dark;
    public static final ThemeVariant Light;
    public static final ThemeVariant System;
    private final int themeResId;

    static {
        ThemeVariant themeVariant = new ThemeVariant("System", 0, w0i0.Messaging_ThemeOverlay_DayNight);
        System = themeVariant;
        ThemeVariant themeVariant2 = new ThemeVariant("Light", 1, w0i0.Messaging_ThemeOverlay);
        Light = themeVariant2;
        ThemeVariant themeVariant3 = new ThemeVariant("Dark", 2, w0i0.Messaging_ThemeOverlay_Dark);
        Dark = themeVariant3;
        ThemeVariant[] themeVariantArr = {themeVariant, themeVariant2, themeVariant3};
        $VALUES = themeVariantArr;
        $ENTRIES = a.a(themeVariantArr);
        Companion = new wwy0();
    }

    public ThemeVariant(String str, int i, int i2) {
        this.themeResId = i2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ThemeVariant valueOf(String str) {
        return (ThemeVariant) Enum.valueOf(ThemeVariant.class, str);
    }

    public static ThemeVariant[] values() {
        return (ThemeVariant[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getThemeResId() {
        return this.themeResId;
    }
}
