package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.qv10;
import defpackage.thp;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/FeedbackChoices;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/n", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FeedbackChoices {
    public static final n Companion = new n();
    public static final i3y[] f;
    public final List a;
    public final List b;
    public final Map c;
    public final List d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new thp(25)), kotlin.a.b(lazyThreadSafetyMode, new thp(26)), kotlin.a.b(lazyThreadSafetyMode, new thp(27)), kotlin.a.b(lazyThreadSafetyMode, new thp(28)), kotlin.a.b(lazyThreadSafetyMode, new thp(29))};
    }

    public /* synthetic */ FeedbackChoices(int i, List list, List list2, Map map, List list3, List list4) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list3;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list4;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final List getE() {
        return this.e;
    }

    public final FeedbackChoices c(Map map) {
        return new FeedbackChoices(this.a, this.b, map, this.d, this.e);
    }

    public final FeedbackChoices d(List list) {
        return new FeedbackChoices(Collections.unmodifiableList(new ArrayList(list)), this.b, this.c, this.d, this.e);
    }

    public final FeedbackChoices e(ArrayList arrayList) {
        return new FeedbackChoices(this.a, this.b, this.c, Collections.unmodifiableList(new ArrayList(arrayList)), this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackChoices)) {
            return false;
        }
        FeedbackChoices feedbackChoices = (FeedbackChoices) obj;
        return jl40.l(this.a, feedbackChoices.a) && jl40.l(this.b, feedbackChoices.b) && jl40.l(this.c, feedbackChoices.c) && jl40.l(this.d, feedbackChoices.d) && jl40.l(this.e, feedbackChoices.e);
    }

    public final FeedbackChoices f(ArrayList arrayList) {
        return new FeedbackChoices(this.a, this.b, this.c, this.d, Collections.unmodifiableList(new ArrayList(arrayList)));
    }

    public final FeedbackChoices g(List list) {
        return new FeedbackChoices(this.a, list, this.c, this.d, this.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.c;
        return this.e.hashCode() + unr0.c((hashCode2 + (map != null ? map.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = qv10.v("FeedbackChoices(cancellationReasons=", this.a, ", selectedGroups=", this.b, ", cancelReasonsRating=");
        v.append(this.c);
        v.append(", lowRatingReasons=");
        v.append(this.d);
        v.append(", ratingReasons=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }

    public FeedbackChoices() {
        this((List) null, (List) null, (Map) null, (List) null, 31);
    }

    public FeedbackChoices(List list, List list2, Map map, List list3, List list4) {
        this.a = list;
        this.b = list2;
        this.c = map;
        this.d = list3;
        this.e = list4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FeedbackChoices(List list, List list2, Map map, List list3, int i) {
        this(r0 != 0 ? r7 : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : map, r7, (i & 16) != 0 ? r7 : list3);
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
    }
}
