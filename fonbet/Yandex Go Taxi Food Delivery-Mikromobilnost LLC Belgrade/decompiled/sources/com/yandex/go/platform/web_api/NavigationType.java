package com.yandex.go.platform.web_api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ia50;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/platform/web_api/NavigationType;", "", "Companion", "ia50", "EXTERNAL_DEEPLINK", "INTERNAL_DEEPLINK", "PUSH", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavigationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ia50 Companion;
    public static final NavigationType EXTERNAL_DEEPLINK;
    public static final NavigationType INTERNAL_DEEPLINK;
    public static final NavigationType PUSH;

    static {
        NavigationType navigationType = new NavigationType("EXTERNAL_DEEPLINK", 0);
        EXTERNAL_DEEPLINK = navigationType;
        NavigationType navigationType2 = new NavigationType("INTERNAL_DEEPLINK", 1);
        INTERNAL_DEEPLINK = navigationType2;
        NavigationType navigationType3 = new NavigationType("PUSH", 2);
        PUSH = navigationType3;
        NavigationType[] navigationTypeArr = {navigationType, navigationType2, navigationType3};
        $VALUES = navigationTypeArr;
        $ENTRIES = kotlin.enums.a.a(navigationTypeArr);
        Companion = new ia50();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, NavigationType$Companion$1.w);
    }

    public static NavigationType valueOf(String str) {
        return (NavigationType) Enum.valueOf(NavigationType.class, str);
    }

    public static NavigationType[] values() {
        return (NavigationType[]) $VALUES.clone();
    }
}
