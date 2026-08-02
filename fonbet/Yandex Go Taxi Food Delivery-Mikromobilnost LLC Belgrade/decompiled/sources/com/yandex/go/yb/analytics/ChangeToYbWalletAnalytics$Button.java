package com.yandex.go.yb.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/yb/analytics/ChangeToYbWalletAnalytics$Button", "", "Lcom/yandex/go/yb/analytics/ChangeToYbWalletAnalytics$Button;", "", "buttonName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CHANGE", "CLOSE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChangeToYbWalletAnalytics$Button {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangeToYbWalletAnalytics$Button[] $VALUES;
    public static final ChangeToYbWalletAnalytics$Button CHANGE;
    public static final ChangeToYbWalletAnalytics$Button CLOSE;
    private final String buttonName;

    static {
        ChangeToYbWalletAnalytics$Button changeToYbWalletAnalytics$Button = new ChangeToYbWalletAnalytics$Button("CHANGE", 0, "change_now");
        CHANGE = changeToYbWalletAnalytics$Button;
        ChangeToYbWalletAnalytics$Button changeToYbWalletAnalytics$Button2 = new ChangeToYbWalletAnalytics$Button("CLOSE", 1, "change_after");
        CLOSE = changeToYbWalletAnalytics$Button2;
        ChangeToYbWalletAnalytics$Button[] changeToYbWalletAnalytics$ButtonArr = {changeToYbWalletAnalytics$Button, changeToYbWalletAnalytics$Button2};
        $VALUES = changeToYbWalletAnalytics$ButtonArr;
        $ENTRIES = a.a(changeToYbWalletAnalytics$ButtonArr);
    }

    public ChangeToYbWalletAnalytics$Button(String str, int i, String str2) {
        this.buttonName = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static ChangeToYbWalletAnalytics$Button valueOf(String str) {
        return (ChangeToYbWalletAnalytics$Button) Enum.valueOf(ChangeToYbWalletAnalytics$Button.class, str);
    }

    public static ChangeToYbWalletAnalytics$Button[] values() {
        return (ChangeToYbWalletAnalytics$Button[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }
}
