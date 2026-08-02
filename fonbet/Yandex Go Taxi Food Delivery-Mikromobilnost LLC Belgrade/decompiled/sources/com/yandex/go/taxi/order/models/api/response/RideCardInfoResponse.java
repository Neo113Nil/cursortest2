package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardDto;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.n7v;
import defpackage.qv10;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.zfj0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse;", "", "Companion", "PresentationsDto", "$serializer", "com/yandex/go/taxi/order/models/api/response/u3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardInfoResponse {
    public static final u3 Companion = new u3();
    public static final i3y[] d;
    public final List a;
    public final List b;
    public final PresentationsDto c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new zfj0(29)), kotlin.a.b(lazyThreadSafetyMode, new jjk0(0)), null};
    }

    public /* synthetic */ RideCardInfoResponse(int i, List list, List list2, PresentationsDto presentationsDto) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = new PresentationsDto(null, null, 15);
        } else {
            this.c = presentationsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardInfoResponse)) {
            return false;
        }
        RideCardInfoResponse rideCardInfoResponse = (RideCardInfoResponse) obj;
        return jl40.l(this.a, rideCardInfoResponse.a) && jl40.l(this.b, rideCardInfoResponse.b) && jl40.l(this.c, rideCardInfoResponse.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = qv10.v("RideCardInfoResponse(items=", this.a, ", dividers=", this.b, ", presentations=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto;", "", "Companion", "Compact", "Sharing", "Details", "DecorationsDto", "com/yandex/go/taxi/order/models/api/response/z3", "$serializer", "com/yandex/go/taxi/order/models/api/response/b4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PresentationsDto {
        public static final b4 Companion = new b4();
        public final Compact a;
        public final Details b;
        public final Sharing c;
        public final TrackingCardDto d;

        public /* synthetic */ PresentationsDto(int i, Compact compact, Details details, Sharing sharing, TrackingCardDto trackingCardDto) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            this.a = i2 == 0 ? new Compact(emptyList, 6) : compact;
            if ((i & 2) == 0) {
                this.b = new Details(emptyList, 18);
            } else {
                this.b = details;
            }
            if ((i & 4) == 0) {
                this.c = new Sharing(emptyList);
            } else {
                this.c = sharing;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = trackingCardDto;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PresentationsDto)) {
                return false;
            }
            PresentationsDto presentationsDto = (PresentationsDto) obj;
            return jl40.l(this.a, presentationsDto.a) && jl40.l(this.b, presentationsDto.b) && jl40.l(this.c, presentationsDto.c) && jl40.l(this.d, presentationsDto.d);
        }

        public final int hashCode() {
            int c = unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a);
            TrackingCardDto trackingCardDto = this.d;
            return c + (trackingCardDto == null ? 0 : trackingCardDto.hashCode());
        }

        public final String toString() {
            return "PresentationsDto(compact=" + this.a + ", details=" + this.b + ", sharing=" + this.c + ", superapp=" + this.d + Extension.C_BRAKE;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto$DecorationsDto;", "", "Companion", "TopDecoration", "$serializer", "com/yandex/go/taxi/order/models/api/response/c4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class DecorationsDto {
            public static final c4 Companion = new c4();
            public final TopDecoration a;

            public /* synthetic */ DecorationsDto(int i, TopDecoration topDecoration) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = topDecoration;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DecorationsDto) && jl40.l(this.a, ((DecorationsDto) obj).a);
            }

            public final int hashCode() {
                TopDecoration topDecoration = this.a;
                if (topDecoration == null) {
                    return 0;
                }
                return topDecoration.a.hashCode();
            }

            public final String toString() {
                return "DecorationsDto(topDecoration=" + this.a + Extension.C_BRAKE;
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto$DecorationsDto$TopDecoration;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/d4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class TopDecoration {
                public static final d4 Companion = new d4();
                public final n7v a;

                public /* synthetic */ TopDecoration(int i, n7v n7vVar) {
                    if ((i & 1) == 0) {
                        this.a = n7v.f;
                    } else {
                        this.a = n7vVar;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof TopDecoration) && jl40.l(this.a, ((TopDecoration) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "TopDecoration(image=" + this.a + Extension.C_BRAKE;
                }

                public TopDecoration() {
                    this.a = n7v.f;
                }
            }

            public DecorationsDto(int i) {
                this.a = null;
            }

            public DecorationsDto() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto$Sharing;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/f4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Sharing {
            public static final f4 Companion = new f4();
            public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(5))};
            public final List a;

            public /* synthetic */ Sharing(int i, List list) {
                if ((i & 1) == 0) {
                    this.a = EmptyList.a;
                } else {
                    this.a = list;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Sharing) && jl40.l(this.a, ((Sharing) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tse0.k("Sharing(items=", Extension.C_BRAKE, this.a);
            }

            public Sharing(List list) {
                this.a = list;
            }

            public Sharing() {
                this(EmptyList.a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto$Compact;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/a4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Compact {
            public static final a4 Companion = new a4();
            public static final i3y[] d;
            public final List a;
            public final DecorationsDto b;
            public final List c;

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new jjk0(1)), null, kotlin.a.b(lazyThreadSafetyMode, new jjk0(2))};
            }

            public /* synthetic */ Compact(int i, List list, DecorationsDto decorationsDto, List list2) {
                int i2 = i & 1;
                EmptyList emptyList = EmptyList.a;
                if (i2 == 0) {
                    this.a = emptyList;
                } else {
                    this.a = list;
                }
                if ((i & 2) == 0) {
                    this.b = new DecorationsDto(0);
                } else {
                    this.b = decorationsDto;
                }
                if ((i & 4) == 0) {
                    this.c = emptyList;
                } else {
                    this.c = list2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Compact)) {
                    return false;
                }
                Compact compact = (Compact) obj;
                return jl40.l(this.a, compact.a) && jl40.l(this.b, compact.b) && jl40.l(this.c, compact.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Compact(items=");
                sb.append(this.a);
                sb.append(", decorations=");
                sb.append(this.b);
                sb.append(", accessibilityAnnouncement=");
                return ly3.s(sb, this.c, Extension.C_BRAKE);
            }

            public Compact() {
                this(null, 7);
            }

            public Compact(List list, int i) {
                int i2 = i & 1;
                EmptyList emptyList = EmptyList.a;
                list = i2 != 0 ? emptyList : list;
                DecorationsDto decorationsDto = new DecorationsDto(0);
                this.a = list;
                this.b = decorationsDto;
                this.c = emptyList;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto$Details;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/e4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Details {
            public static final e4 Companion = new e4();
            public static final i3y[] f;
            public final List a;
            public final DecorationsDto b;
            public final String c;
            public final String d;
            public final List e;

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                f = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new jjk0(3)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new jjk0(4))};
            }

            public /* synthetic */ Details(int i, List list, DecorationsDto decorationsDto, String str, String str2, List list2) {
                int i2 = i & 1;
                EmptyList emptyList = EmptyList.a;
                if (i2 == 0) {
                    this.a = emptyList;
                } else {
                    this.a = list;
                }
                if ((i & 2) == 0) {
                    this.b = new DecorationsDto(0);
                } else {
                    this.b = decorationsDto;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = str2;
                }
                if ((i & 16) == 0) {
                    this.e = emptyList;
                } else {
                    this.e = list2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Details)) {
                    return false;
                }
                Details details = (Details) obj;
                return jl40.l(this.a, details.a) && jl40.l(this.b, details.b) && jl40.l(this.c, details.c) && jl40.l(this.d, details.d) && jl40.l(this.e, details.e);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                String str = this.c;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                return this.e.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Details(items=");
                sb.append(this.a);
                sb.append(", decorations=");
                sb.append(this.b);
                sb.append(", defaultScreenRatioDecimal=");
                g8e.D(sb, this.c, ", minimizedScreenRatioDecimal=", this.d, ", accessibilityAnnouncement=");
                return ly3.s(sb, this.e, Extension.C_BRAKE);
            }

            public Details() {
                this(null, 31);
            }

            public Details(List list, int i) {
                int i2 = i & 1;
                EmptyList emptyList = EmptyList.a;
                list = i2 != 0 ? emptyList : list;
                DecorationsDto decorationsDto = new DecorationsDto(0);
                this.a = list;
                this.b = decorationsDto;
                this.c = null;
                this.d = null;
                this.e = emptyList;
            }
        }

        public PresentationsDto() {
            this(null, null, 15);
        }

        public PresentationsDto(Compact compact, Details details, int i) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            compact = i2 != 0 ? new Compact(emptyList, 6) : compact;
            details = (i & 2) != 0 ? new Details(emptyList, 18) : details;
            Sharing sharing = new Sharing(emptyList);
            this.a = compact;
            this.b = details;
            this.c = sharing;
            this.d = null;
        }
    }

    public RideCardInfoResponse(List list, List list2, PresentationsDto presentationsDto) {
        this.a = list;
        this.b = list2;
        this.c = presentationsDto;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RideCardInfoResponse() {
        this(r1, r1, r0);
        PresentationsDto presentationsDto = new PresentationsDto(null, null, 15);
        EmptyList emptyList = EmptyList.a;
    }
}
