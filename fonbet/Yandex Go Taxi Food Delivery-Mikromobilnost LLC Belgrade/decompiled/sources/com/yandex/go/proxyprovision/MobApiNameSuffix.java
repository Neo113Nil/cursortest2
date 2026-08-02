package com.yandex.go.proxyprovision;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/proxyprovision/MobApiNameSuffix;", "", "", "prodSuffix", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "testingSuffix", "b", "Billing", "BillingInternational", "Taxi", "TaxiV4", "WebAm", "Legal", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobApiNameSuffix {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobApiNameSuffix[] $VALUES;
    public static final MobApiNameSuffix Billing;
    public static final MobApiNameSuffix BillingInternational;
    public static final MobApiNameSuffix Legal;
    public static final MobApiNameSuffix Taxi;
    public static final MobApiNameSuffix TaxiV4;
    public static final MobApiNameSuffix WebAm;
    private final String prodSuffix;
    private final String testingSuffix;

    static {
        MobApiNameSuffix mobApiNameSuffix = new MobApiNameSuffix("Billing", 0, "/api", "/api");
        Billing = mobApiNameSuffix;
        MobApiNameSuffix mobApiNameSuffix2 = new MobApiNameSuffix("BillingInternational", 1, "/api", "");
        BillingInternational = mobApiNameSuffix2;
        MobApiNameSuffix mobApiNameSuffix3 = new MobApiNameSuffix("Taxi", 2, "/3.0", "/3.0");
        Taxi = mobApiNameSuffix3;
        MobApiNameSuffix mobApiNameSuffix4 = new MobApiNameSuffix("TaxiV4", 3, "/4.0", "/4.0");
        TaxiV4 = mobApiNameSuffix4;
        MobApiNameSuffix mobApiNameSuffix5 = new MobApiNameSuffix("WebAm", 4, "/am", "/am");
        WebAm = mobApiNameSuffix5;
        MobApiNameSuffix mobApiNameSuffix6 = new MobApiNameSuffix("Legal", 5, "/legal", "/legal");
        Legal = mobApiNameSuffix6;
        MobApiNameSuffix[] mobApiNameSuffixArr = {mobApiNameSuffix, mobApiNameSuffix2, mobApiNameSuffix3, mobApiNameSuffix4, mobApiNameSuffix5, mobApiNameSuffix6};
        $VALUES = mobApiNameSuffixArr;
        $ENTRIES = kotlin.enums.a.a(mobApiNameSuffixArr);
    }

    public MobApiNameSuffix(String str, int i, String str2, String str3) {
        this.prodSuffix = str2;
        this.testingSuffix = str3;
    }

    public static MobApiNameSuffix valueOf(String str) {
        return (MobApiNameSuffix) Enum.valueOf(MobApiNameSuffix.class, str);
    }

    public static MobApiNameSuffix[] values() {
        return (MobApiNameSuffix[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getProdSuffix() {
        return this.prodSuffix;
    }

    /* renamed from: b, reason: from getter */
    public final String getTestingSuffix() {
        return this.testingSuffix;
    }
}
