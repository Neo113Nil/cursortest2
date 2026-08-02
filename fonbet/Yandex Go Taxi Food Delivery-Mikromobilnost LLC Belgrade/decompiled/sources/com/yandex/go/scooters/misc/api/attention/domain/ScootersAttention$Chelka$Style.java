package com.yandex.go.scooters.misc.api.attention.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/misc/api/attention/domain/ScootersAttention$Chelka$Style", "", "Lcom/yandex/go/scooters/misc/api/attention/domain/ScootersAttention$Chelka$Style;", "PROMO", "INFO", "ERROR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAttention$Chelka$Style {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAttention$Chelka$Style[] $VALUES;
    public static final ScootersAttention$Chelka$Style ERROR;
    public static final ScootersAttention$Chelka$Style INFO;
    public static final ScootersAttention$Chelka$Style PROMO;

    static {
        ScootersAttention$Chelka$Style scootersAttention$Chelka$Style = new ScootersAttention$Chelka$Style("PROMO", 0);
        PROMO = scootersAttention$Chelka$Style;
        ScootersAttention$Chelka$Style scootersAttention$Chelka$Style2 = new ScootersAttention$Chelka$Style("INFO", 1);
        INFO = scootersAttention$Chelka$Style2;
        ScootersAttention$Chelka$Style scootersAttention$Chelka$Style3 = new ScootersAttention$Chelka$Style("ERROR", 2);
        ERROR = scootersAttention$Chelka$Style3;
        ScootersAttention$Chelka$Style[] scootersAttention$Chelka$StyleArr = {scootersAttention$Chelka$Style, scootersAttention$Chelka$Style2, scootersAttention$Chelka$Style3};
        $VALUES = scootersAttention$Chelka$StyleArr;
        $ENTRIES = a.a(scootersAttention$Chelka$StyleArr);
    }

    public static ScootersAttention$Chelka$Style valueOf(String str) {
        return (ScootersAttention$Chelka$Style) Enum.valueOf(ScootersAttention$Chelka$Style.class, str);
    }

    public static ScootersAttention$Chelka$Style[] values() {
        return (ScootersAttention$Chelka$Style[]) $VALUES.clone();
    }
}
