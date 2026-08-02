package com.yandex.go.superapp.discovery.map.scooters.impl.experiments;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/scooters/impl/experiments/SuperAppDiscoveryMapScootersExperiment;", "Lw96;", "Companion", "EboksParams", "com/yandex/go/superapp/discovery/map/scooters/impl/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppDiscoveryMapScootersExperiment extends w96 {
    public static final a Companion = new a();
    public static final SuperAppDiscoveryMapScootersExperiment d = new SuperAppDiscoveryMapScootersExperiment(0);
    public final boolean b;
    public final EboksParams c;

    public /* synthetic */ SuperAppDiscoveryMapScootersExperiment(int i, boolean z, EboksParams eboksParams) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = new EboksParams(0);
        } else {
            this.c = eboksParams;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/scooters/impl/experiments/SuperAppDiscoveryMapScootersExperiment$EboksParams;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/scooters/impl/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class EboksParams {
        public static final b Companion = new b();
        public final String a;
        public final String b;

        public /* synthetic */ EboksParams(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public EboksParams(int i) {
            this.a = "";
            this.b = "";
        }

        public EboksParams() {
            this(0);
        }
    }

    public SuperAppDiscoveryMapScootersExperiment() {
        this(0);
    }

    public SuperAppDiscoveryMapScootersExperiment(int i) {
        EboksParams eboksParams = new EboksParams(0);
        this.b = false;
        this.c = eboksParams;
    }
}
