package com.yandex.go.scooters.passes.data.model;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/ScootersPassesBduiExperiment;", "Lw96;", "Companion", "Flows", "Packages", "Superpasses", "$serializer", "com/yandex/go/scooters/passes/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPassesBduiExperiment extends w96 {
    public static final e Companion = new e();
    public final boolean b;
    public final Flows c;

    public /* synthetic */ ScootersPassesBduiExperiment(int i, boolean z, Flows flows) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = new Flows(0);
        } else {
            this.c = flows;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/ScootersPassesBduiExperiment$Packages;", "", "Companion", "$serializer", "com/yandex/go/scooters/passes/data/model/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Packages {
        public static final g Companion = new g();
        public final boolean a;
        public final boolean b;

        public /* synthetic */ Packages(int i, boolean z, boolean z2) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
        }

        public Packages(int i) {
            this.a = false;
            this.b = false;
        }

        public Packages() {
            this(0);
        }
    }

    public ScootersPassesBduiExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/ScootersPassesBduiExperiment$Flows;", "", "Companion", "$serializer", "com/yandex/go/scooters/passes/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Flows {
        public static final f Companion = new f();
        public final Packages a;
        public final Superpasses b;

        public /* synthetic */ Flows(int i, Packages packages, Superpasses superpasses) {
            this.a = (i & 1) == 0 ? new Packages(0) : packages;
            if ((i & 2) == 0) {
                this.b = new Superpasses(0);
            } else {
                this.b = superpasses;
            }
        }

        public Flows() {
            this(0);
        }

        public Flows(int i) {
            Packages packages = new Packages(0);
            Superpasses superpasses = new Superpasses(0);
            this.a = packages;
            this.b = superpasses;
        }
    }

    public ScootersPassesBduiExperiment(int i) {
        Flows flows = new Flows(0);
        this.b = false;
        this.c = flows;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/ScootersPassesBduiExperiment$Superpasses;", "", "Companion", "$serializer", "com/yandex/go/scooters/passes/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Superpasses {
        public static final h Companion = new h();
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public /* synthetic */ Superpasses(int i, boolean z, boolean z2, boolean z3) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z3;
            }
        }

        public Superpasses(int i) {
            this.a = false;
            this.b = false;
            this.c = false;
        }

        public Superpasses() {
            this(0);
        }
    }
}
