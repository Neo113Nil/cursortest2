package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model;

import defpackage.du1;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ro1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/webview/model/AllowNewTabType;", "", "Companion", "du1", "BROWSER", "INPLACE", "SYSTEM_TAB", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AllowNewTabType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AllowNewTabType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final AllowNewTabType BROWSER;
    public static final du1 Companion;
    public static final AllowNewTabType INPLACE;
    public static final AllowNewTabType SYSTEM_TAB;

    static {
        AllowNewTabType allowNewTabType = new AllowNewTabType("BROWSER", 0);
        BROWSER = allowNewTabType;
        AllowNewTabType allowNewTabType2 = new AllowNewTabType("INPLACE", 1);
        INPLACE = allowNewTabType2;
        AllowNewTabType allowNewTabType3 = new AllowNewTabType("SYSTEM_TAB", 2);
        SYSTEM_TAB = allowNewTabType3;
        AllowNewTabType[] allowNewTabTypeArr = {allowNewTabType, allowNewTabType2, allowNewTabType3};
        $VALUES = allowNewTabTypeArr;
        $ENTRIES = a.a(allowNewTabTypeArr);
        Companion = new du1();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(8));
    }

    public static AllowNewTabType valueOf(String str) {
        return (AllowNewTabType) Enum.valueOf(AllowNewTabType.class, str);
    }

    public static AllowNewTabType[] values() {
        return (AllowNewTabType[]) $VALUES.clone();
    }
}
