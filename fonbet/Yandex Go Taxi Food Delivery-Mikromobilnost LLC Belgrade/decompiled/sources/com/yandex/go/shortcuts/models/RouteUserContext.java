package com.yandex.go.shortcuts.models;

import defpackage.b7l0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ofl0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/shortcuts/models/RouteUserContext;", "", "", "context", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "Companion", "ofl0", "Shortcuts", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RouteUserContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteUserContext[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ofl0 Companion;
    public static final RouteUserContext Shortcuts;
    private final String context = "shortcuts";

    static {
        RouteUserContext routeUserContext = new RouteUserContext();
        Shortcuts = routeUserContext;
        RouteUserContext[] routeUserContextArr = {routeUserContext};
        $VALUES = routeUserContextArr;
        $ENTRIES = kotlin.enums.a.a(routeUserContextArr);
        Companion = new ofl0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(10));
    }

    public static RouteUserContext valueOf(String str) {
        return (RouteUserContext) Enum.valueOf(RouteUserContext.class, str);
    }

    public static RouteUserContext[] values() {
        return (RouteUserContext[]) $VALUES.clone();
    }
}
