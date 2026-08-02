package com.yandex.go.ugc;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import defpackage.k4o;
import defpackage.ks11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/ugc/UgcWebViewTheme;", "", "Companion", "ks11", "LIGHT", "DARK", "DEFAULT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UgcWebViewTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UgcWebViewTheme[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ks11 Companion;
    public static final UgcWebViewTheme DARK;
    public static final UgcWebViewTheme DEFAULT;
    public static final UgcWebViewTheme LIGHT;

    static {
        UgcWebViewTheme ugcWebViewTheme = new UgcWebViewTheme("LIGHT", 0);
        LIGHT = ugcWebViewTheme;
        UgcWebViewTheme ugcWebViewTheme2 = new UgcWebViewTheme("DARK", 1);
        DARK = ugcWebViewTheme2;
        UgcWebViewTheme ugcWebViewTheme3 = new UgcWebViewTheme("DEFAULT", 2);
        DEFAULT = ugcWebViewTheme3;
        UgcWebViewTheme[] ugcWebViewThemeArr = {ugcWebViewTheme, ugcWebViewTheme2, ugcWebViewTheme3};
        $VALUES = ugcWebViewThemeArr;
        $ENTRIES = kotlin.enums.a.a(ugcWebViewThemeArr);
        Companion = new ks11();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(10));
    }

    public static UgcWebViewTheme valueOf(String str) {
        return (UgcWebViewTheme) Enum.valueOf(UgcWebViewTheme.class, str);
    }

    public static UgcWebViewTheme[] values() {
        return (UgcWebViewTheme[]) $VALUES.clone();
    }
}
