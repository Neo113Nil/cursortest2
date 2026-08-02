package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.progress_bar.ProgressBarDto;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qjk0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$ProgressBarItem", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Lqjk0;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/j5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$ProgressBarItem extends a7 implements qjk0 {
    public static final j5 Companion = new j5();
    public final String a;
    public final String b;
    public final String c;
    public final SlotItemDto d;
    public final RideCardTimerDto e;
    public final ProgressBarDto f;

    public RideCardItemDto$ProgressBarItem(int i, String str, String str2, String str3, SlotItemDto slotItemDto, RideCardTimerDto rideCardTimerDto, ProgressBarDto progressBarDto) {
        this.a = (i & 1) == 0 ? "" : str;
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
            this.d = slotItemDto;
        }
        if ((i & 16) == 0) {
            this.e = new RideCardTimerDto(0);
        } else {
            this.e = rideCardTimerDto;
        }
        if ((i & 32) == 0) {
            this.f = new ProgressBarDto(0);
        } else {
            this.f = progressBarDto;
        }
    }

    @Override // defpackage.qjk0
    /* renamed from: d, reason: from getter */
    public final RideCardTimerDto getG() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$ProgressBarItem)) {
            return false;
        }
        RideCardItemDto$ProgressBarItem rideCardItemDto$ProgressBarItem = (RideCardItemDto$ProgressBarItem) obj;
        return jl40.l(this.a, rideCardItemDto$ProgressBarItem.a) && jl40.l(this.b, rideCardItemDto$ProgressBarItem.b) && jl40.l(this.c, rideCardItemDto$ProgressBarItem.c) && jl40.l(this.d, rideCardItemDto$ProgressBarItem.d) && jl40.l(this.e, rideCardItemDto$ProgressBarItem.e) && jl40.l(this.f, rideCardItemDto$ProgressBarItem.f);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SlotItemDto slotItemDto = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (slotItemDto != null ? slotItemDto.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ProgressBarItem(id=", this.a, ", analyticsId=", this.b, ", accessibility=");
        v.append(this.c);
        v.append(", slot=");
        v.append(this.d);
        v.append(", timer=");
        v.append(this.e);
        v.append(", progressBar=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$ProgressBarItem() {
        RideCardTimerDto rideCardTimerDto = new RideCardTimerDto(0);
        ProgressBarDto progressBarDto = new ProgressBarDto(0);
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = rideCardTimerDto;
        this.f = progressBarDto;
    }
}
