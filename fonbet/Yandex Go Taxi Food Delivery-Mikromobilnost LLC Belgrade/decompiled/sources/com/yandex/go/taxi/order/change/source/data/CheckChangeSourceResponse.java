package com.yandex.go.taxi.order.change.source.data;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/data/CheckChangeSourceResponse;", "", "Companion", "Point", "$serializer", "com/yandex/go/taxi/order/change/source/data/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CheckChangeSourceResponse {
    public static final g Companion = new g();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(20)), null, null};
    public final boolean a;
    public final List b;
    public final String c;
    public final ChangeSourceMessageResponse d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/data/CheckChangeSourceResponse$Point;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/change/source/data/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Point {
        public static final h Companion = new h();
        public final boolean a;
        public final Double b;

        public /* synthetic */ Point(int i, boolean z, Double d) {
            if (1 != (i & 1)) {
                qje.Z(i, 1, CheckChangeSourceResponse$Point$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = z;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = d;
            }
        }
    }

    public /* synthetic */ CheckChangeSourceResponse(int i, boolean z, List list, String str, ChangeSourceMessageResponse changeSourceMessageResponse) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, CheckChangeSourceResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = list;
        this.c = str;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = changeSourceMessageResponse;
        }
    }
}
