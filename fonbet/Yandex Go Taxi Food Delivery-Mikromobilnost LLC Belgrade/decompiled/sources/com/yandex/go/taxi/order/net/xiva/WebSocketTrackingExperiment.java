package com.yandex.go.taxi.order.net.xiva;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.xn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/net/xiva/WebSocketTrackingExperiment;", "Lxn11;", "Companion", "FallbackPolicy", "com/yandex/go/taxi/order/net/xiva/o", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebSocketTrackingExperiment implements xn11 {
    public static final o Companion = new o();
    public static final WebSocketTrackingExperiment f = new WebSocketTrackingExperiment(0);
    public final boolean b;
    public final FallbackPolicy c;
    public final boolean d;
    public final int e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/net/xiva/WebSocketTrackingExperiment$FallbackPolicy;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/net/xiva/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class FallbackPolicy {
        public static final p Companion = new p();
        public final String a;

        public /* synthetic */ FallbackPolicy(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                qje.Z(i, 1, WebSocketTrackingExperiment$FallbackPolicy$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }
    }

    public /* synthetic */ WebSocketTrackingExperiment(int i, boolean z, FallbackPolicy fallbackPolicy, boolean z2, int i2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = fallbackPolicy;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
    }

    public WebSocketTrackingExperiment(int i) {
        this.b = false;
        this.c = null;
        this.d = false;
        this.e = 0;
    }

    public WebSocketTrackingExperiment() {
        this(0);
    }
}
