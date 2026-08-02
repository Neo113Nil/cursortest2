package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainSchedulerResponse;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtTrainSchedulerResponse {
    public static final u Companion = new u();
    public final CurrencyRulesDto a;
    public final FormattedText b;
    public final MtTrainSchedulerDateButtonBarDto c;
    public final MtTrainDateSelector d;
    public final MtTrainStations e;
    public final MtTrainFilters f;
    public final MtTrainScheduleDto g;

    public MtTrainSchedulerResponse(int i, CurrencyRulesDto currencyRulesDto, FormattedText formattedText, MtTrainSchedulerDateButtonBarDto mtTrainSchedulerDateButtonBarDto, MtTrainDateSelector mtTrainDateSelector, MtTrainStations mtTrainStations, MtTrainFilters mtTrainFilters, MtTrainScheduleDto mtTrainScheduleDto) {
        this.a = (i & 1) == 0 ? CurrencyRulesDto.e : currencyRulesDto;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            MtTrainSchedulerDateButtonBarDto.Companion.getClass();
            this.c = MtTrainSchedulerDateButtonBarDto.e;
        } else {
            this.c = mtTrainSchedulerDateButtonBarDto;
        }
        if ((i & 8) == 0) {
            MtTrainDateSelector.Companion.getClass();
            this.d = MtTrainDateSelector.f;
        } else {
            this.d = mtTrainDateSelector;
        }
        if ((i & 16) == 0) {
            MtTrainStations.Companion.getClass();
            this.e = MtTrainStations.c;
        } else {
            this.e = mtTrainStations;
        }
        if ((i & 32) == 0) {
            MtTrainFilters.Companion.getClass();
            this.f = MtTrainFilters.d;
        } else {
            this.f = mtTrainFilters;
        }
        if ((i & 64) != 0) {
            this.g = mtTrainScheduleDto;
        } else {
            MtTrainScheduleDto.Companion.getClass();
            this.g = MtTrainScheduleDto.c;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainSchedulerResponse)) {
            return false;
        }
        MtTrainSchedulerResponse mtTrainSchedulerResponse = (MtTrainSchedulerResponse) obj;
        return jl40.l(this.a, mtTrainSchedulerResponse.a) && jl40.l(this.b, mtTrainSchedulerResponse.b) && jl40.l(this.c, mtTrainSchedulerResponse.c) && jl40.l(this.d, mtTrainSchedulerResponse.d) && jl40.l(this.e, mtTrainSchedulerResponse.e) && jl40.l(this.f, mtTrainSchedulerResponse.f) && jl40.l(this.g, mtTrainSchedulerResponse.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return this.g.a.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MtTrainSchedulerResponse(currencyRulesDto=" + this.a + ", name=" + this.b + ", dateButtonsBar=" + this.c + ", dateSelector=" + this.d + ", stations=" + this.e + ", filters=" + this.f + ", scheduler=" + this.g + Extension.C_BRAKE;
    }

    public MtTrainSchedulerResponse() {
        MtTrainSchedulerDateButtonBarDto.Companion.getClass();
        MtTrainSchedulerDateButtonBarDto mtTrainSchedulerDateButtonBarDto = MtTrainSchedulerDateButtonBarDto.e;
        MtTrainDateSelector.Companion.getClass();
        MtTrainDateSelector mtTrainDateSelector = MtTrainDateSelector.f;
        MtTrainStations.Companion.getClass();
        MtTrainStations mtTrainStations = MtTrainStations.c;
        MtTrainFilters.Companion.getClass();
        MtTrainFilters mtTrainFilters = MtTrainFilters.d;
        MtTrainScheduleDto.Companion.getClass();
        MtTrainScheduleDto mtTrainScheduleDto = MtTrainScheduleDto.c;
        this.a = CurrencyRulesDto.e;
        this.b = null;
        this.c = mtTrainSchedulerDateButtonBarDto;
        this.d = mtTrainDateSelector;
        this.e = mtTrainStations;
        this.f = mtTrainFilters;
        this.g = mtTrainScheduleDto;
    }
}
