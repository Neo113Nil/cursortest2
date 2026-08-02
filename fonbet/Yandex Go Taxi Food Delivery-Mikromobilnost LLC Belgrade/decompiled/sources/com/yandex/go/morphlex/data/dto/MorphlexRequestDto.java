package com.yandex.go.morphlex.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.qje;
import defpackage.rfa0;
import defpackage.z530;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto;", "", "Companion", "Location", "AdditionalPreorderInfo", "OrderComment", "$serializer", "com/yandex/go/morphlex/data/dto/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MorphlexRequestDto {
    public static final d Companion = new d();
    public static final i3y[] k;
    public final Location a;
    public final Location b;
    public final rfa0 c;
    public final String d;
    public final Calendar e;
    public final AdditionalPreorderInfo f;
    public final List g;
    public final List h;
    public final OrderComment i;
    public final String j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z530(4)), kotlin.a.b(lazyThreadSafetyMode, new z530(5)), null, null};
    }

    public /* synthetic */ MorphlexRequestDto(int i, Location location, Location location2, rfa0 rfa0Var, String str, Calendar calendar, AdditionalPreorderInfo additionalPreorderInfo, List list, List list2, OrderComment orderComment, String str2) {
        if (732 != (i & 732)) {
            qje.Z(i, 732, MorphlexRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = location;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = location2;
        }
        this.c = rfa0Var;
        this.d = str;
        this.e = calendar;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = additionalPreorderInfo;
        }
        this.g = list;
        this.h = list2;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = orderComment;
        }
        this.j = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MorphlexRequestDto)) {
            return false;
        }
        MorphlexRequestDto morphlexRequestDto = (MorphlexRequestDto) obj;
        return jl40.l(this.a, morphlexRequestDto.a) && jl40.l(this.b, morphlexRequestDto.b) && jl40.l(this.c, morphlexRequestDto.c) && jl40.l(this.d, morphlexRequestDto.d) && jl40.l(this.e, morphlexRequestDto.e) && jl40.l(this.f, morphlexRequestDto.f) && jl40.l(this.g, morphlexRequestDto.g) && jl40.l(this.h, morphlexRequestDto.h) && jl40.l(this.i, morphlexRequestDto.i) && jl40.l(this.j, morphlexRequestDto.j);
    }

    public final int hashCode() {
        Location location = this.a;
        int hashCode = (location == null ? 0 : location.hashCode()) * 31;
        Location location2 = this.b;
        int hashCode2 = (hashCode + (location2 == null ? 0 : location2.hashCode())) * 31;
        rfa0 rfa0Var = this.c;
        int hashCode3 = (hashCode2 + (rfa0Var == null ? 0 : rfa0Var.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Calendar calendar = this.e;
        int hashCode5 = (hashCode4 + (calendar == null ? 0 : calendar.hashCode())) * 31;
        AdditionalPreorderInfo additionalPreorderInfo = this.f;
        int hashCode6 = (hashCode5 + (additionalPreorderInfo == null ? 0 : additionalPreorderInfo.hashCode())) * 31;
        List list = this.g;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        OrderComment orderComment = this.i;
        int hashCode9 = (hashCode8 + (orderComment == null ? 0 : orderComment.hashCode())) * 31;
        String str2 = this.j;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MorphlexRequestDto(userLocation=");
        sb.append(this.a);
        sb.append(", pointA=");
        sb.append(this.b);
        sb.append(", paymentMethod=");
        sb.append(this.c);
        sb.append(", selectedTariffClass=");
        sb.append(this.d);
        sb.append(", preorderDue=");
        sb.append(this.e);
        sb.append(", additionalPreorderInfo=");
        sb.append(this.f);
        sb.append(", route=");
        nnm.w(sb, this.g, ", tariffRequirements=", this.h, ", orderComment=");
        sb.append(this.i);
        sb.append(", openReason=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto$OrderComment;", "", "Companion", "$serializer", "com/yandex/go/morphlex/data/dto/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class OrderComment {
        public static final f Companion = new f();
        public final String a;

        public /* synthetic */ OrderComment(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public OrderComment(String str) {
            this.a = str;
        }

        public OrderComment() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto$Location;", "", "Companion", "$serializer", "com/yandex/go/morphlex/data/dto/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Location {
        public static final e Companion = new e();
        public final double a;
        public final double b;

        public /* synthetic */ Location(double d, double d2, int i) {
            if ((i & 1) == 0) {
                this.a = 0.0d;
            } else {
                this.a = d;
            }
            if ((i & 2) == 0) {
                this.b = 0.0d;
            } else {
                this.b = d2;
            }
        }

        public Location(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public Location() {
            this(0.0d, 0.0d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto$AdditionalPreorderInfo;", "", "Companion", "$serializer", "com/yandex/go/morphlex/data/dto/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AdditionalPreorderInfo {
        public static final c Companion = new c();
        public final String a;
        public final String b;
        public final Boolean c;
        public final Calendar d;

        public /* synthetic */ AdditionalPreorderInfo(int i, String str, String str2, Boolean bool, Calendar calendar) {
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
                this.c = bool;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = calendar;
            }
        }

        public AdditionalPreorderInfo(String str, String str2, Boolean bool, Calendar calendar) {
            this.a = str;
            this.b = str2;
            this.c = bool;
            this.d = calendar;
        }

        public AdditionalPreorderInfo() {
            this(null, null, null, null);
        }
    }

    public MorphlexRequestDto(Location location, Location location2, rfa0 rfa0Var, String str, Calendar calendar, AdditionalPreorderInfo additionalPreorderInfo, List list, ArrayList arrayList, OrderComment orderComment, String str2) {
        this.a = location;
        this.b = location2;
        this.c = rfa0Var;
        this.d = str;
        this.e = calendar;
        this.f = additionalPreorderInfo;
        this.g = list;
        this.h = arrayList;
        this.i = orderComment;
        this.j = str2;
    }
}
