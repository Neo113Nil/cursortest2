package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.e540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainSchedulerDateButtonBarDto;", "", "Companion", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/r", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtTrainSchedulerDateButtonBarDto {
    public static final r Companion = new r();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(23))};
    public static final MtTrainSchedulerDateButtonBarDto e = new MtTrainSchedulerDateButtonBarDto(0);
    public final String a;
    public final MtTrainDateSelectorDto b;
    public final List c;

    public /* synthetic */ MtTrainSchedulerDateButtonBarDto(int i, String str, MtTrainDateSelectorDto mtTrainDateSelectorDto, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = mtTrainDateSelectorDto;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainSchedulerDateButtonBarDto)) {
            return false;
        }
        MtTrainSchedulerDateButtonBarDto mtTrainSchedulerDateButtonBarDto = (MtTrainSchedulerDateButtonBarDto) obj;
        return jl40.l(this.a, mtTrainSchedulerDateButtonBarDto.a) && jl40.l(this.b, mtTrainSchedulerDateButtonBarDto.b) && jl40.l(this.c, mtTrainSchedulerDateButtonBarDto.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MtTrainDateSelectorDto mtTrainDateSelectorDto = this.b;
        return this.c.hashCode() + ((hashCode + (mtTrainDateSelectorDto == null ? 0 : mtTrainDateSelectorDto.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtTrainSchedulerDateButtonBarDto(selectedButtonId=");
        sb.append(this.a);
        sb.append(", actionButton=");
        sb.append(this.b);
        sb.append(", dateButtons=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public MtTrainSchedulerDateButtonBarDto(int i) {
        this.a = "";
        this.b = null;
        this.c = EmptyList.a;
    }

    public MtTrainSchedulerDateButtonBarDto() {
        this(0);
    }
}
