package com.yandex.go.taxi.order.models.api.response;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.yandex.go.taxi.order.models.api.response.progress_bar.ProgressBarDto;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.sjk0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$StatusProgress", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "com/yandex/go/taxi/order/models/api/response/d6", "ExpiredDto", "StatusTextDto", "State", "$serializer", "com/yandex/go/taxi/order/models/api/response/w5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$StatusProgress extends a7 {
    public static final w5 Companion = new w5();
    public static final i3y[] k;
    public final String a;
    public final String b;
    public final StatusTextDto c;
    public final StatusTextDto d;
    public final ExpiredDto e;
    public final List f;
    public final ProgressBarDto g;
    public final RideCardTimerDto h;
    public final d6 i;
    public final State j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$StatusProgress$State;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/y5", "UNKNOWN", Card.ACTIVE, "LOADING", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final State ACTIVE;
        public static final y5 Companion;
        public static final State LOADING;
        public static final State UNKNOWN;

        static {
            State state = new State("UNKNOWN", 0);
            UNKNOWN = state;
            State state2 = new State(Card.ACTIVE, 1);
            ACTIVE = state2;
            State state3 = new State("LOADING", 2);
            LOADING = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
            Companion = new y5();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(1));
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new jjk0(29)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new sjk0(0))};
    }

    public RideCardItemDto$StatusProgress(int i, String str, String str2, StatusTextDto statusTextDto, StatusTextDto statusTextDto2, ExpiredDto expiredDto, List list, ProgressBarDto progressBarDto, RideCardTimerDto rideCardTimerDto, d6 d6Var, State state) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            StatusTextDto.Companion.getClass();
            this.c = StatusTextDto.c;
        } else {
            this.c = statusTextDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = statusTextDto2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = expiredDto;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = progressBarDto;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = rideCardTimerDto;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d6Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = state;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$StatusProgress)) {
            return false;
        }
        RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress = (RideCardItemDto$StatusProgress) obj;
        return jl40.l(this.a, rideCardItemDto$StatusProgress.a) && jl40.l(this.b, rideCardItemDto$StatusProgress.b) && jl40.l(this.c, rideCardItemDto$StatusProgress.c) && jl40.l(this.d, rideCardItemDto$StatusProgress.d) && jl40.l(this.e, rideCardItemDto$StatusProgress.e) && jl40.l(this.f, rideCardItemDto$StatusProgress.f) && jl40.l(this.g, rideCardItemDto$StatusProgress.g) && jl40.l(this.h, rideCardItemDto$StatusProgress.h) && jl40.l(this.i, rideCardItemDto$StatusProgress.i) && this.j == rideCardItemDto$StatusProgress.j;
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        StatusTextDto statusTextDto = this.d;
        int hashCode3 = (hashCode2 + (statusTextDto == null ? 0 : statusTextDto.hashCode())) * 31;
        ExpiredDto expiredDto = this.e;
        int hashCode4 = (hashCode3 + (expiredDto == null ? 0 : expiredDto.hashCode())) * 31;
        List list = this.f;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ProgressBarDto progressBarDto = this.g;
        int hashCode6 = (hashCode5 + (progressBarDto == null ? 0 : progressBarDto.hashCode())) * 31;
        RideCardTimerDto rideCardTimerDto = this.h;
        int hashCode7 = (hashCode6 + (rideCardTimerDto == null ? 0 : rideCardTimerDto.hashCode())) * 31;
        d6 d6Var = this.i;
        int hashCode8 = (hashCode7 + (d6Var == null ? 0 : d6Var.hashCode())) * 31;
        State state = this.j;
        return hashCode8 + (state != null ? state.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("StatusProgress(id=", this.a, ", analyticsId=", this.b, ", title=");
        v.append(this.c);
        v.append(", subtitle=");
        v.append(this.d);
        v.append(", expired=");
        v.append(this.e);
        v.append(", expiredStates=");
        v.append(this.f);
        v.append(", progressBar=");
        v.append(this.g);
        v.append(", timer=");
        v.append(this.h);
        v.append(", trail=");
        v.append(this.i);
        v.append(", state=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$StatusProgress$StatusTextDto;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/z5", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class StatusTextDto {
        public static final z5 Companion = new z5();
        public static final StatusTextDto c = new StatusTextDto(0);
        public final FormattedText a;
        public final com.yandex.go.slot.dto.b2 b;

        public /* synthetic */ StatusTextDto(int i, FormattedText formattedText, com.yandex.go.slot.dto.b2 b2Var) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = b2Var;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusTextDto)) {
                return false;
            }
            StatusTextDto statusTextDto = (StatusTextDto) obj;
            return jl40.l(this.a, statusTextDto.a) && jl40.l(this.b, statusTextDto.b);
        }

        public final int hashCode() {
            int hashCode = this.a.a.hashCode() * 31;
            com.yandex.go.slot.dto.b2 b2Var = this.b;
            return hashCode + (b2Var == null ? 0 : b2Var.hashCode());
        }

        public final String toString() {
            return "StatusTextDto(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
        }

        public StatusTextDto() {
            this(0);
        }

        public StatusTextDto(FormattedText formattedText, com.yandex.go.slot.dto.b2 b2Var) {
            this.a = formattedText;
            this.b = b2Var;
        }

        public /* synthetic */ StatusTextDto(int i) {
            this(FormattedText.c, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$StatusProgress$ExpiredDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/x5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ExpiredDto {
        public static final x5 Companion = new x5();
        public final Long a;
        public final StatusTextDto b;
        public final StatusTextDto c;

        public ExpiredDto(int i, Long l, StatusTextDto statusTextDto, StatusTextDto statusTextDto2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = l;
            }
            if ((i & 2) == 0) {
                StatusTextDto.Companion.getClass();
                this.b = StatusTextDto.c;
            } else {
                this.b = statusTextDto;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = statusTextDto2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpiredDto)) {
                return false;
            }
            ExpiredDto expiredDto = (ExpiredDto) obj;
            return jl40.l(this.a, expiredDto.a) && jl40.l(this.b, expiredDto.b) && jl40.l(this.c, expiredDto.c);
        }

        public final int hashCode() {
            Long l = this.a;
            int hashCode = (this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31)) * 31;
            StatusTextDto statusTextDto = this.c;
            return hashCode + (statusTextDto != null ? statusTextDto.hashCode() : 0);
        }

        public final String toString() {
            return "ExpiredDto(intervalMillis=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + Extension.C_BRAKE;
        }

        public ExpiredDto() {
            StatusTextDto.Companion.getClass();
            StatusTextDto statusTextDto = StatusTextDto.c;
            this.a = null;
            this.b = statusTextDto;
            this.c = null;
        }
    }

    public RideCardItemDto$StatusProgress() {
        StatusTextDto.Companion.getClass();
        StatusTextDto statusTextDto = StatusTextDto.c;
        this.a = "";
        this.b = null;
        this.c = statusTextDto;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }
}
