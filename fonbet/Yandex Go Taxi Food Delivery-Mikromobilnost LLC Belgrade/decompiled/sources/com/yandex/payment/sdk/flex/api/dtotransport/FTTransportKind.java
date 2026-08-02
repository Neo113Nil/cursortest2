package com.yandex.payment.sdk.flex.api.dtotransport;

import defpackage.d6p;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.t6p;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/payment/sdk/flex/api/dtotransport/FTTransportKind;", "", "Companion", "t6p", "variable", "oauth_token", "gen_uuid", "flex-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FTTransportKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FTTransportKind[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final t6p Companion;
    public static final FTTransportKind gen_uuid;
    public static final FTTransportKind oauth_token;
    public static final FTTransportKind variable;

    static {
        FTTransportKind fTTransportKind = new FTTransportKind("variable", 0);
        variable = fTTransportKind;
        FTTransportKind fTTransportKind2 = new FTTransportKind("oauth_token", 1);
        oauth_token = fTTransportKind2;
        FTTransportKind fTTransportKind3 = new FTTransportKind("gen_uuid", 2);
        gen_uuid = fTTransportKind3;
        FTTransportKind[] fTTransportKindArr = {fTTransportKind, fTTransportKind2, fTTransportKind3};
        $VALUES = fTTransportKindArr;
        $ENTRIES = a.a(fTTransportKindArr);
        Companion = new t6p();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new d6p(20));
    }

    public static FTTransportKind valueOf(String str) {
        return (FTTransportKind) Enum.valueOf(FTTransportKind.class, str);
    }

    public static FTTransportKind[] values() {
        return (FTTransportKind[]) $VALUES.clone();
    }
}
