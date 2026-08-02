package com.yandex.go.plus.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.r66;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.cashback.models.response.CashbackInactiveTariffBadgeStyleDto;
import ru.yandex.taxi.cashback.models.response.CashbackTariffBadgeStyleDto;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/plus/experiment/CashbackStyleScheme;", "", "Companion", "$serializer", "com/yandex/go/plus/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CashbackStyleScheme {
    public static final b Companion = new b();
    public static final i3y[] c;
    public final CashbackInactiveTariffBadgeStyleDto a;
    public final CashbackTariffBadgeStyleDto b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new r66(25)), kotlin.a.b(lazyThreadSafetyMode, new r66(26))};
    }

    public /* synthetic */ CashbackStyleScheme(int i, CashbackInactiveTariffBadgeStyleDto cashbackInactiveTariffBadgeStyleDto, CashbackTariffBadgeStyleDto cashbackTariffBadgeStyleDto) {
        this.a = (i & 1) == 0 ? CashbackInactiveTariffBadgeStyleDto.DISABLED : cashbackInactiveTariffBadgeStyleDto;
        if ((i & 2) == 0) {
            this.b = CashbackTariffBadgeStyleDto.DARK;
        } else {
            this.b = cashbackTariffBadgeStyleDto;
        }
    }

    public CashbackStyleScheme() {
        this(0);
    }

    public CashbackStyleScheme(int i) {
        CashbackInactiveTariffBadgeStyleDto cashbackInactiveTariffBadgeStyleDto = CashbackInactiveTariffBadgeStyleDto.DISABLED;
        CashbackTariffBadgeStyleDto cashbackTariffBadgeStyleDto = CashbackTariffBadgeStyleDto.DARK;
        this.a = cashbackInactiveTariffBadgeStyleDto;
        this.b = cashbackTariffBadgeStyleDto;
    }
}
