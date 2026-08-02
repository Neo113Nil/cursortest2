package com.yandex.go.design.compose.haptic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/design/compose/haptic/HapticEffect;", "", "PromoAppear", "ClickLight", "ClickMedium", "ClickHard", "Tick", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HapticEffect {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HapticEffect[] $VALUES;
    public static final HapticEffect ClickHard;
    public static final HapticEffect ClickLight;
    public static final HapticEffect ClickMedium;
    public static final HapticEffect PromoAppear;
    public static final HapticEffect Tick;

    static {
        HapticEffect hapticEffect = new HapticEffect("PromoAppear", 0);
        PromoAppear = hapticEffect;
        HapticEffect hapticEffect2 = new HapticEffect("ClickLight", 1);
        ClickLight = hapticEffect2;
        HapticEffect hapticEffect3 = new HapticEffect("ClickMedium", 2);
        ClickMedium = hapticEffect3;
        HapticEffect hapticEffect4 = new HapticEffect("ClickHard", 3);
        ClickHard = hapticEffect4;
        HapticEffect hapticEffect5 = new HapticEffect("Tick", 4);
        Tick = hapticEffect5;
        HapticEffect[] hapticEffectArr = {hapticEffect, hapticEffect2, hapticEffect3, hapticEffect4, hapticEffect5};
        $VALUES = hapticEffectArr;
        $ENTRIES = a.a(hapticEffectArr);
    }

    public static HapticEffect valueOf(String str) {
        return (HapticEffect) Enum.valueOf(HapticEffect.class, str);
    }

    public static HapticEffect[] values() {
        return (HapticEffect[]) $VALUES.clone();
    }
}
