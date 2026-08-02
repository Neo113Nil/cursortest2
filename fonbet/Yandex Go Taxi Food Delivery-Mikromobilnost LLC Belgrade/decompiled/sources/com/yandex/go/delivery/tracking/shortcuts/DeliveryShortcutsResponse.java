package com.yandex.go.delivery.tracking.shortcuts;

import defpackage.dii;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/delivery/tracking/shortcuts/DeliveryShortcutsResponse;", "", "Companion", "com/yandex/go/delivery/tracking/shortcuts/d", "$serializer", "tracking"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryShortcutsResponse {
    public static final d Companion = new d();
    public static final i3y[] c;
    public static final DeliveryShortcutsResponse d;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new dii(11)), kotlin.a.b(lazyThreadSafetyMode, new dii(12))};
        d = new DeliveryShortcutsResponse(0);
    }

    public /* synthetic */ DeliveryShortcutsResponse(List list, List list2, int i) {
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
    }

    /* renamed from: a, reason: from getter */
    public final List getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public DeliveryShortcutsResponse(int i) {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
    }

    public DeliveryShortcutsResponse() {
        this(0);
    }
}
