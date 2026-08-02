package com.yandex.go.scooters.passes.model;

import defpackage.aw80;
import defpackage.ek90;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/passes/model/PassPaymentType;", "", "Companion", "ek90", "CARD", "GOOGLE_PAY", "CORP", "NEQUI_TOKEN", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PassPaymentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassPaymentType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PassPaymentType CARD;
    public static final PassPaymentType CORP;
    public static final ek90 Companion;
    public static final PassPaymentType GOOGLE_PAY;
    public static final PassPaymentType NEQUI_TOKEN;

    static {
        PassPaymentType passPaymentType = new PassPaymentType("CARD", 0);
        CARD = passPaymentType;
        PassPaymentType passPaymentType2 = new PassPaymentType("GOOGLE_PAY", 1);
        GOOGLE_PAY = passPaymentType2;
        PassPaymentType passPaymentType3 = new PassPaymentType("CORP", 2);
        CORP = passPaymentType3;
        PassPaymentType passPaymentType4 = new PassPaymentType("NEQUI_TOKEN", 3);
        NEQUI_TOKEN = passPaymentType4;
        PassPaymentType[] passPaymentTypeArr = {passPaymentType, passPaymentType2, passPaymentType3, passPaymentType4};
        $VALUES = passPaymentTypeArr;
        $ENTRIES = kotlin.enums.a.a(passPaymentTypeArr);
        Companion = new ek90();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(27));
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static PassPaymentType valueOf(String str) {
        return (PassPaymentType) Enum.valueOf(PassPaymentType.class, str);
    }

    public static PassPaymentType[] values() {
        return (PassPaymentType[]) $VALUES.clone();
    }
}
