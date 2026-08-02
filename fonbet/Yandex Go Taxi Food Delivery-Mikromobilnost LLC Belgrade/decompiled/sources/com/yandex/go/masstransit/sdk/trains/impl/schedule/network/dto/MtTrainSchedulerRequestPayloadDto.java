package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.ah40;
import defpackage.b64;
import defpackage.e540;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainSchedulerRequestPayloadDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtTrainSchedulerRequestPayloadDto {
    public static final t Companion = new t();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final MtScheduleScenario f;
    public final boolean g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new e540(29)), kotlin.a.b(lazyThreadSafetyMode, new ah40(1)), null};
    }

    public /* synthetic */ MtTrainSchedulerRequestPayloadDto(int i, String str, String str2, String str3, String str4, Map map, MtScheduleScenario mtScheduleScenario, boolean z) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = kotlin.collections.b.f();
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = MtScheduleScenario.UNKNOWN;
        } else {
            this.f = mtScheduleScenario;
        }
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainSchedulerRequestPayloadDto)) {
            return false;
        }
        MtTrainSchedulerRequestPayloadDto mtTrainSchedulerRequestPayloadDto = (MtTrainSchedulerRequestPayloadDto) obj;
        return jl40.l(this.a, mtTrainSchedulerRequestPayloadDto.a) && jl40.l(this.b, mtTrainSchedulerRequestPayloadDto.b) && jl40.l(this.c, mtTrainSchedulerRequestPayloadDto.c) && jl40.l(this.d, mtTrainSchedulerRequestPayloadDto.d) && jl40.l(this.e, mtTrainSchedulerRequestPayloadDto.e) && this.f == mtTrainSchedulerRequestPayloadDto.f && this.g == mtTrainSchedulerRequestPayloadDto.g;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + unr0.d((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtTrainSchedulerRequestPayloadDto(date=", this.a, ", startingStopId=", this.b, ", destinationStopId=");
        g8e.D(v, this.c, ", lineId=", this.d, ", selectedFilterIds=");
        v.append(this.e);
        v.append(", scenario=");
        v.append(this.f);
        v.append(", includeUnpurchasableTrips=");
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }

    public MtTrainSchedulerRequestPayloadDto() {
        Map f = kotlin.collections.b.f();
        MtScheduleScenario mtScheduleScenario = MtScheduleScenario.UNKNOWN;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = f;
        this.f = mtScheduleScenario;
        this.g = true;
    }
}
