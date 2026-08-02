package com.yandex.go.tariffcard.experiment;

import defpackage.gsq0;
import defpackage.n96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment;", "Ln96;", "Companion", "ShowPolicy", "com/yandex/go/tariffcard/experiment/l", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RequirementsScrollButtonExperiment extends n96 {
    public static final l Companion = new l();
    public final boolean b;
    public final ShowPolicy c;

    public /* synthetic */ RequirementsScrollButtonExperiment(int i, boolean z, ShowPolicy showPolicy) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = new ShowPolicy(0);
        } else {
            this.c = showPolicy;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public RequirementsScrollButtonExperiment() {
        this(0);
    }

    public RequirementsScrollButtonExperiment(int i) {
        ShowPolicy showPolicy = new ShowPolicy(0);
        this.b = false;
        this.c = showPolicy;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment$ShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/tariffcard/experiment/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ShowPolicy {
        public static final m Companion = new m();
        public final int a;
        public final int b;
        public final int c;

        public /* synthetic */ ShowPolicy(int i, int i2, int i3, int i4) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = -1;
            } else {
                this.b = i3;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i4;
            }
        }

        public ShowPolicy(int i) {
            this.a = 0;
            this.b = -1;
            this.c = 0;
        }

        public ShowPolicy() {
            this(0);
        }
    }
}
