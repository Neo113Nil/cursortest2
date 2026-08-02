package com.yandex.plus.webview.internal.security;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/webview/internal/security/CombinedWebViewRequestSecurityChecker$Strategy", "", "Lcom/yandex/plus/webview/internal/security/CombinedWebViewRequestSecurityChecker$Strategy;", "ALL", "ANY", "plus-core-webview-contracts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CombinedWebViewRequestSecurityChecker$Strategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CombinedWebViewRequestSecurityChecker$Strategy[] $VALUES;
    public static final CombinedWebViewRequestSecurityChecker$Strategy ALL;
    public static final CombinedWebViewRequestSecurityChecker$Strategy ANY;

    static {
        CombinedWebViewRequestSecurityChecker$Strategy combinedWebViewRequestSecurityChecker$Strategy = new CombinedWebViewRequestSecurityChecker$Strategy("ALL", 0);
        ALL = combinedWebViewRequestSecurityChecker$Strategy;
        CombinedWebViewRequestSecurityChecker$Strategy combinedWebViewRequestSecurityChecker$Strategy2 = new CombinedWebViewRequestSecurityChecker$Strategy("ANY", 1);
        ANY = combinedWebViewRequestSecurityChecker$Strategy2;
        CombinedWebViewRequestSecurityChecker$Strategy[] combinedWebViewRequestSecurityChecker$StrategyArr = {combinedWebViewRequestSecurityChecker$Strategy, combinedWebViewRequestSecurityChecker$Strategy2};
        $VALUES = combinedWebViewRequestSecurityChecker$StrategyArr;
        $ENTRIES = a.a(combinedWebViewRequestSecurityChecker$StrategyArr);
    }

    public static CombinedWebViewRequestSecurityChecker$Strategy valueOf(String str) {
        return (CombinedWebViewRequestSecurityChecker$Strategy) Enum.valueOf(CombinedWebViewRequestSecurityChecker$Strategy.class, str);
    }

    public static CombinedWebViewRequestSecurityChecker$Strategy[] values() {
        return (CombinedWebViewRequestSecurityChecker$Strategy[]) $VALUES.clone();
    }
}
