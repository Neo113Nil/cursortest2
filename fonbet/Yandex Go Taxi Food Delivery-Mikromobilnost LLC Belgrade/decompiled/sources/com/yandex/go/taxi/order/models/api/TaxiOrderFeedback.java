package com.yandex.go.taxi.order.models.api;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mpx0;
import defpackage.nnm;
import defpackage.unr0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrderFeedback;", "", "Companion", "com/yandex/go/taxi/order/models/api/g", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxiOrderFeedback {
    public static final g Companion = new g();
    public static final i3y[] i;
    public static final TaxiOrderFeedback j;
    public final Integer a;
    public final List b;
    public final List c;
    public final List d;
    public final Map e;
    public final String f;
    public final TaxiOrderTipsState g;
    public final List h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new mpx0(23)), kotlin.a.b(lazyThreadSafetyMode, new mpx0(24)), kotlin.a.b(lazyThreadSafetyMode, new mpx0(25)), kotlin.a.b(lazyThreadSafetyMode, new mpx0(26)), null, null, kotlin.a.b(lazyThreadSafetyMode, new mpx0(27))};
        j = new TaxiOrderFeedback(null, null, 255);
    }

    public TaxiOrderFeedback(int i2, Integer num, List list, List list2, List list3, Map map, String str, TaxiOrderTipsState taxiOrderTipsState, List list4) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        int i3 = i2 & 2;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i2 & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = list3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = map;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i2 & 64) == 0) {
            TaxiOrderTipsState.Companion.getClass();
            this.g = TaxiOrderTipsState.f;
        } else {
            this.g = taxiOrderTipsState;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list4;
        }
    }

    public static TaxiOrderFeedback a(TaxiOrderFeedback taxiOrderFeedback, Integer num, List list, List list2, List list3, Map map, String str, TaxiOrderTipsState taxiOrderTipsState, List list4, int i2) {
        if ((i2 & 1) != 0) {
            num = taxiOrderFeedback.a;
        }
        Integer num2 = num;
        if ((i2 & 2) != 0) {
            list = taxiOrderFeedback.b;
        }
        List list5 = list;
        if ((i2 & 4) != 0) {
            list2 = taxiOrderFeedback.c;
        }
        List list6 = list2;
        if ((i2 & 8) != 0) {
            list3 = taxiOrderFeedback.d;
        }
        List list7 = list3;
        if ((i2 & 16) != 0) {
            map = taxiOrderFeedback.e;
        }
        Map map2 = map;
        if ((i2 & 32) != 0) {
            str = taxiOrderFeedback.f;
        }
        String str2 = str;
        TaxiOrderTipsState taxiOrderTipsState2 = (i2 & 64) != 0 ? taxiOrderFeedback.g : taxiOrderTipsState;
        List list8 = (i2 & 128) != 0 ? taxiOrderFeedback.h : list4;
        taxiOrderFeedback.getClass();
        return new TaxiOrderFeedback(num2, list5, list6, list7, map2, str2, taxiOrderTipsState2, list8);
    }

    /* renamed from: b, reason: from getter */
    public final Map getE() {
        return this.e;
    }

    /* renamed from: c, reason: from getter */
    public final List getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderFeedback)) {
            return false;
        }
        TaxiOrderFeedback taxiOrderFeedback = (TaxiOrderFeedback) obj;
        return jl40.l(this.a, taxiOrderFeedback.a) && jl40.l(this.b, taxiOrderFeedback.b) && jl40.l(this.c, taxiOrderFeedback.c) && jl40.l(this.d, taxiOrderFeedback.d) && jl40.l(this.e, taxiOrderFeedback.e) && jl40.l(this.f, taxiOrderFeedback.f) && jl40.l(this.g, taxiOrderFeedback.g) && jl40.l(this.h, taxiOrderFeedback.h);
    }

    /* renamed from: f, reason: from getter */
    public final List getD() {
        return this.d;
    }

    /* renamed from: g, reason: from getter */
    public final List getB() {
        return this.b;
    }

    /* renamed from: h, reason: from getter */
    public final List getH() {
        return this.h;
    }

    public final int hashCode() {
        Integer num = this.a;
        int c = unr0.c(unr0.c((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31, this.c);
        List list = this.d;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.e;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (this.g.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list2 = this.h;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final TaxiOrderTipsState getG() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiOrderFeedback(rating=");
        sb.append(this.a);
        sb.append(", selectedRatingReasonsNames=");
        sb.append(this.b);
        sb.append(", cancellationReasons=");
        nnm.w(sb, this.c, ", selectedCancelReasonGroups=", this.d, ", cancelReasonsRating=");
        sb.append(this.e);
        sb.append(", comment=");
        sb.append(this.f);
        sb.append(", tipsState=");
        sb.append(this.g);
        sb.append(", surveyInfo=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public TaxiOrderFeedback() {
        this(null, null, 255);
    }

    public TaxiOrderFeedback(Integer num, List list, List list2, List list3, Map map, String str, TaxiOrderTipsState taxiOrderTipsState, List list4) {
        this.a = num;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = map;
        this.f = str;
        this.g = taxiOrderTipsState;
        this.h = list4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TaxiOrderFeedback(Integer num, TaxiOrderTipsState taxiOrderTipsState, int i2) {
        this(r1, r2, r2, null, null, null, taxiOrderTipsState, null);
        Integer num2 = (i2 & 1) != 0 ? null : num;
        if ((i2 & 64) != 0) {
            TaxiOrderTipsState.Companion.getClass();
            taxiOrderTipsState = TaxiOrderTipsState.f;
        }
        EmptyList emptyList = EmptyList.a;
    }
}
