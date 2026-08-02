package com.yandex.payment.sdk.ui;

import android.content.Context;
import defpackage.bwy0;
import defpackage.cvy0;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/payment/sdk/ui/DefaultTheme;", "Lcvy0;", "", "LIGHT", "DARK", "SYSTEM_DEFAULT", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class DefaultTheme implements cvy0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultTheme[] $VALUES;
    public static final DefaultTheme DARK;
    public static final DefaultTheme LIGHT;
    public static final DefaultTheme SYSTEM_DEFAULT;

    static {
        DefaultTheme defaultTheme = new DefaultTheme() { // from class: com.yandex.payment.sdk.ui.DefaultTheme.LIGHT
            @Override // defpackage.cvy0
            public final bwy0 a(Context context) {
                return new b();
            }
        };
        LIGHT = defaultTheme;
        DefaultTheme defaultTheme2 = new DefaultTheme() { // from class: com.yandex.payment.sdk.ui.DefaultTheme.DARK
            @Override // defpackage.cvy0
            public final bwy0 a(Context context) {
                return new a();
            }
        };
        DARK = defaultTheme2;
        DefaultTheme defaultTheme3 = new DefaultTheme() { // from class: com.yandex.payment.sdk.ui.DefaultTheme.SYSTEM_DEFAULT
            @Override // defpackage.cvy0
            public final bwy0 a(Context context) {
                int i = context.getResources().getConfiguration().uiMode & 48;
                return (i != 16 ? i != 32 ? DefaultTheme.LIGHT : DefaultTheme.DARK : DefaultTheme.LIGHT).a(context);
            }
        };
        SYSTEM_DEFAULT = defaultTheme3;
        DefaultTheme[] defaultThemeArr = {defaultTheme, defaultTheme2, defaultTheme3};
        $VALUES = defaultThemeArr;
        $ENTRIES = kotlin.enums.a.a(defaultThemeArr);
    }

    public static DefaultTheme valueOf(String str) {
        return (DefaultTheme) Enum.valueOf(DefaultTheme.class, str);
    }

    public static DefaultTheme[] values() {
        return (DefaultTheme[]) $VALUES.clone();
    }
}
