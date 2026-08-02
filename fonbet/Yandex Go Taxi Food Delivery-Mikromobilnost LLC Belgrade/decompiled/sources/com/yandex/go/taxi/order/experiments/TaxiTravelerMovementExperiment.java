package com.yandex.go.taxi.order.experiments;

import defpackage.gsq0;
import defpackage.uby0;
import defpackage.xn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/TaxiTravelerMovementExperiment;", "Lxn11;", "Companion", "TurboMode", "Teleporting", "uby0", "com/yandex/go/taxi/order/experiments/j", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaxiTravelerMovementExperiment implements xn11 {
    public static final j Companion = new j();
    public static final TaxiTravelerMovementExperiment f = new TaxiTravelerMovementExperiment(0);
    public final Double b;
    public final TurboMode c;
    public final Teleporting d;
    public final uby0 e;

    public /* synthetic */ TaxiTravelerMovementExperiment(int i, Double d, TurboMode turboMode, Teleporting teleporting, uby0 uby0Var) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = turboMode;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = teleporting;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = uby0Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/TaxiTravelerMovementExperiment$TurboMode;", "", "Companion", "com/yandex/go/taxi/order/experiments/r", "$serializer", "com/yandex/go/taxi/order/experiments/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class TurboMode {
        public static final l Companion = new l();
        public final r a;
        public final Integer b;

        public /* synthetic */ TurboMode(int i, r rVar, Integer num) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = rVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
        }

        public TurboMode() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/TaxiTravelerMovementExperiment$Teleporting;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/experiments/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class Teleporting {
        public static final k Companion = new k();
        public final Double a;
        public final Integer b;
        public final boolean c;

        public /* synthetic */ Teleporting(int i, Double d, Integer num, boolean z) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = d;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public Teleporting() {
            this.a = null;
            this.b = null;
            this.c = false;
        }
    }

    public TaxiTravelerMovementExperiment(int i) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public TaxiTravelerMovementExperiment() {
        this(0);
    }
}
