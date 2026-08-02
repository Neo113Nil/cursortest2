package com.yandex.go.preorder.source.altpins;

import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.f5;
import java.util.List;

/* loaded from: classes13.dex */
public abstract class a {
    public static final Alternatives.AltpinBOptionDto a(Alternatives.CommonOptionLegacyDto commonOptionLegacyDto) {
        return new Alternatives.AltpinBOptionDto(commonOptionLegacyDto.a.getValue(), commonOptionLegacyDto.b, commonOptionLegacyDto.v, commonOptionLegacyDto.d, commonOptionLegacyDto.m, commonOptionLegacyDto.e, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
    }

    public static final Alternatives.ComboOptionDto b(Alternatives.CommonOptionLegacyDto commonOptionLegacyDto) {
        return new Alternatives.ComboOptionDto(commonOptionLegacyDto.a.getValue(), commonOptionLegacyDto.b, commonOptionLegacyDto.m, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
    }

    public static final Alternatives.MulticlassOptionDto c(Alternatives.CommonOptionLegacyDto commonOptionLegacyDto) {
        String value = commonOptionLegacyDto.a.getValue();
        Alternatives.RouteStatsMulticlassDetails routeStatsMulticlassDetails = commonOptionLegacyDto.k;
        f5 f5Var = commonOptionLegacyDto.l;
        String str = commonOptionLegacyDto.i;
        TariffUnavailable tariffUnavailable = commonOptionLegacyDto.o;
        return new Alternatives.MulticlassOptionDto(value, commonOptionLegacyDto.b, str, routeStatsMulticlassDetails, f5Var, tariffUnavailable, commonOptionLegacyDto.m, commonOptionLegacyDto.D, commonOptionLegacyDto.c, commonOptionLegacyDto.n, commonOptionLegacyDto.p, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
    }

    public static final Alternatives.PlusPromoOptionDto d(Alternatives.CommonOptionLegacyDto commonOptionLegacyDto) {
        String value = commonOptionLegacyDto.a.getValue();
        List list = commonOptionLegacyDto.b;
        return new Alternatives.PlusPromoOptionDto(value, commonOptionLegacyDto.u, commonOptionLegacyDto.s, commonOptionLegacyDto.t, list);
    }

    public static final Alternatives.RequirementOptionDto e(Alternatives.CommonOptionLegacyDto commonOptionLegacyDto) {
        String value = commonOptionLegacyDto.a.getValue();
        List list = commonOptionLegacyDto.b;
        String str = commonOptionLegacyDto.t;
        int i = commonOptionLegacyDto.u;
        return new Alternatives.RequirementOptionDto(value, list, commonOptionLegacyDto.y, commonOptionLegacyDto.A, commonOptionLegacyDto.B, commonOptionLegacyDto.w, commonOptionLegacyDto.x, commonOptionLegacyDto.E, commonOptionLegacyDto.C, commonOptionLegacyDto.z, str, i);
    }

    public static final Alternatives.TariffSelectorOptionDto f(Alternatives.CommonOptionLegacyDto commonOptionLegacyDto) {
        return new Alternatives.TariffSelectorOptionDto(commonOptionLegacyDto.a.getValue(), commonOptionLegacyDto.b, commonOptionLegacyDto.m, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
    }
}
