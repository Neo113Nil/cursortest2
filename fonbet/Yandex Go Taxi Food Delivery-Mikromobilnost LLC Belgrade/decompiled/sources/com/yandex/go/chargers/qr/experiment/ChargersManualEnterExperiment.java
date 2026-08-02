package com.yandex.go.chargers.qr.experiment;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/qr/experiment/ChargersManualEnterExperiment;", "Lw96;", "Companion", "ChargersManualEnterLimitations", "com/yandex/go/chargers/qr/experiment/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChargersManualEnterExperiment extends w96 {
    public static final b Companion = new b();
    public static final ChargersManualEnterExperiment d = new ChargersManualEnterExperiment(0);
    public final boolean b;
    public final ChargersManualEnterLimitations c;

    public /* synthetic */ ChargersManualEnterExperiment(int i, boolean z, ChargersManualEnterLimitations chargersManualEnterLimitations) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = new ChargersManualEnterLimitations(0);
        } else {
            this.c = chargersManualEnterLimitations;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/qr/experiment/ChargersManualEnterExperiment$ChargersManualEnterLimitations;", "", "Companion", "$serializer", "com/yandex/go/chargers/qr/experiment/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChargersManualEnterLimitations {
        public static final a Companion = new a();
        public final int a;
        public final int b;

        public /* synthetic */ ChargersManualEnterLimitations(int i, int i2, int i3) {
            this.a = (i & 1) == 0 ? 1 : i2;
            if ((i & 2) == 0) {
                this.b = 6;
            } else {
                this.b = i3;
            }
        }

        public ChargersManualEnterLimitations(int i) {
            this.a = 1;
            this.b = 6;
        }

        public ChargersManualEnterLimitations() {
            this(0);
        }
    }

    public ChargersManualEnterExperiment() {
        this(0);
    }

    public ChargersManualEnterExperiment(int i) {
        ChargersManualEnterLimitations chargersManualEnterLimitations = new ChargersManualEnterLimitations(0);
        this.b = false;
        this.c = chargersManualEnterLimitations;
    }
}
