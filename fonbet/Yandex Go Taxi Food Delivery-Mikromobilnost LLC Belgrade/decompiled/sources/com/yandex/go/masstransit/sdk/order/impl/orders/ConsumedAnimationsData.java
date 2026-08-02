package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.m3e;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/ConsumedAnimationsData;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConsumedAnimationsData {
    public static final b Companion = new b();
    public static final i3y[] c;
    public final Set a;
    public final Set b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new m3e(6)), kotlin.a.b(lazyThreadSafetyMode, new m3e(7))};
    }

    public /* synthetic */ ConsumedAnimationsData(int i, Set set, Set set2) {
        int i2 = i & 1;
        EmptySet emptySet = EmptySet.a;
        if (i2 == 0) {
            this.a = emptySet;
        } else {
            this.a = set;
        }
        if ((i & 2) == 0) {
            this.b = emptySet;
        } else {
            this.b = set2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set] */
    public static ConsumedAnimationsData a(ConsumedAnimationsData consumedAnimationsData, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, int i) {
        LinkedHashSet linkedHashSet3 = linkedHashSet;
        if ((i & 1) != 0) {
            linkedHashSet3 = consumedAnimationsData.a;
        }
        LinkedHashSet linkedHashSet4 = linkedHashSet2;
        if ((i & 2) != 0) {
            linkedHashSet4 = consumedAnimationsData.b;
        }
        return new ConsumedAnimationsData(linkedHashSet3, linkedHashSet4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumedAnimationsData)) {
            return false;
        }
        ConsumedAnimationsData consumedAnimationsData = (ConsumedAnimationsData) obj;
        return jl40.l(this.a, consumedAnimationsData.a) && jl40.l(this.b, consumedAnimationsData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConsumedAnimationsData(ticketIds=" + this.a + ", seenActiveTicketIds=" + this.b + Extension.C_BRAKE;
    }

    public ConsumedAnimationsData() {
        this(0);
    }

    public ConsumedAnimationsData(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ConsumedAnimationsData(int i) {
        this(r1, r1);
        EmptySet emptySet = EmptySet.a;
    }
}
