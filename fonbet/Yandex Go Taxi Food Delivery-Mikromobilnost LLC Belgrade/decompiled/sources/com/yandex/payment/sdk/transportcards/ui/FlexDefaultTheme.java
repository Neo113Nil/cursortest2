package com.yandex.payment.sdk.transportcards.ui;

import android.content.Context;
import defpackage.bwy0;
import defpackage.cvy0;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/payment/sdk/transportcards/ui/FlexDefaultTheme;", "Lcvy0;", "", "LIGHT", "DARK", "SYSTEM_DEFAULT", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FlexDefaultTheme implements cvy0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FlexDefaultTheme[] $VALUES;
    public static final FlexDefaultTheme DARK;
    public static final FlexDefaultTheme LIGHT;
    public static final FlexDefaultTheme SYSTEM_DEFAULT;

    static {
        FlexDefaultTheme flexDefaultTheme = new FlexDefaultTheme() { // from class: com.yandex.payment.sdk.transportcards.ui.FlexDefaultTheme.LIGHT
            @Override // defpackage.cvy0
            public final bwy0 a(Context context) {
                return new b();
            }
        };
        LIGHT = flexDefaultTheme;
        FlexDefaultTheme flexDefaultTheme2 = new FlexDefaultTheme() { // from class: com.yandex.payment.sdk.transportcards.ui.FlexDefaultTheme.DARK
            @Override // defpackage.cvy0
            public final bwy0 a(Context context) {
                return new a();
            }
        };
        DARK = flexDefaultTheme2;
        FlexDefaultTheme flexDefaultTheme3 = new FlexDefaultTheme() { // from class: com.yandex.payment.sdk.transportcards.ui.FlexDefaultTheme.SYSTEM_DEFAULT
            @Override // defpackage.cvy0
            public final bwy0 a(Context context) {
                return new c(context);
            }
        };
        SYSTEM_DEFAULT = flexDefaultTheme3;
        FlexDefaultTheme[] flexDefaultThemeArr = {flexDefaultTheme, flexDefaultTheme2, flexDefaultTheme3};
        $VALUES = flexDefaultThemeArr;
        $ENTRIES = kotlin.enums.a.a(flexDefaultThemeArr);
    }

    public static FlexDefaultTheme valueOf(String str) {
        return (FlexDefaultTheme) Enum.valueOf(FlexDefaultTheme.class, str);
    }

    public static FlexDefaultTheme[] values() {
        return (FlexDefaultTheme[]) $VALUES.clone();
    }
}
