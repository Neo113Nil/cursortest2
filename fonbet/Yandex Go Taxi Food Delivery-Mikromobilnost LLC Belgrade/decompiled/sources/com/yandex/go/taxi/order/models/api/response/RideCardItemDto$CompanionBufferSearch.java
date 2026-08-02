package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.qjk0;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xuc;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$CompanionBufferSearch", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Lqjk0;", "Companion", "CompanionSearchState", "$serializer", "com/yandex/go/taxi/order/models/api/response/t4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$CompanionBufferSearch extends a7 implements qjk0 {
    public static final t4 Companion = new t4();
    public static final i3y[] h = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(18)), null};
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final SlotItemDto e;
    public final List f;
    public final RideCardTimerDto g;

    public RideCardItemDto$CompanionBufferSearch(int i, String str, String str2, String str3, Boolean bool, SlotItemDto slotItemDto, List list, RideCardTimerDto rideCardTimerDto) {
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
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = slotItemDto;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = rideCardTimerDto;
        }
    }

    @Override // defpackage.qjk0
    /* renamed from: d, reason: from getter */
    public final RideCardTimerDto getE() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$CompanionBufferSearch)) {
            return false;
        }
        RideCardItemDto$CompanionBufferSearch rideCardItemDto$CompanionBufferSearch = (RideCardItemDto$CompanionBufferSearch) obj;
        return jl40.l(this.a, rideCardItemDto$CompanionBufferSearch.a) && jl40.l(this.b, rideCardItemDto$CompanionBufferSearch.b) && jl40.l(this.c, rideCardItemDto$CompanionBufferSearch.c) && jl40.l(this.d, rideCardItemDto$CompanionBufferSearch.d) && jl40.l(this.e, rideCardItemDto$CompanionBufferSearch.e) && jl40.l(this.f, rideCardItemDto$CompanionBufferSearch.f) && jl40.l(this.g, rideCardItemDto$CompanionBufferSearch.g);
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
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        SlotItemDto slotItemDto = this.e;
        int c = unr0.c((hashCode4 + (slotItemDto == null ? 0 : slotItemDto.hashCode())) * 31, 31, this.f);
        RideCardTimerDto rideCardTimerDto = this.g;
        return c + (rideCardTimerDto != null ? rideCardTimerDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CompanionBufferSearch(id=", this.a, ", analyticsId=", this.b, ", selectedStateId=");
        tse0.A(v, this.c, ", companionFound=", this.d, ", header=");
        v.append(this.e);
        v.append(", states=");
        v.append(this.f);
        v.append(", timer=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$CompanionBufferSearch$CompanionSearchState;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/u4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CompanionSearchState {
        public static final u4 Companion = new u4();
        public final String a;
        public final xuc b;

        public /* synthetic */ CompanionSearchState(int i, String str, xuc xucVar) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = xucVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompanionSearchState)) {
                return false;
            }
            CompanionSearchState companionSearchState = (CompanionSearchState) obj;
            return jl40.l(this.a, companionSearchState.a) && jl40.l(this.b, companionSearchState.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            xuc xucVar = this.b;
            return hashCode + (xucVar == null ? 0 : xucVar.hashCode());
        }

        public final String toString() {
            return "CompanionSearchState(id=" + this.a + ", lottie=" + this.b + Extension.C_BRAKE;
        }

        public CompanionSearchState() {
            this.a = "";
            this.b = null;
        }
    }

    public RideCardItemDto$CompanionBufferSearch() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = EmptyList.a;
        this.g = null;
    }
}
