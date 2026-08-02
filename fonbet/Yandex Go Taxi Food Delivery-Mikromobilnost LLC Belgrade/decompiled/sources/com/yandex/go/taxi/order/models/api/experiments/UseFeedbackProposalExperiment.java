package com.yandex.go.taxi.order.models.api.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xn11;
import defpackage.z121;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/experiments/UseFeedbackProposalExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/order/models/api/experiments/i", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UseFeedbackProposalExperiment implements xn11 {
    public static final i Companion = new i();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z121(23)), null};
    public static final UseFeedbackProposalExperiment f = new UseFeedbackProposalExperiment(0);
    public final boolean b;
    public final jsq0 c;
    public final boolean d;

    public /* synthetic */ UseFeedbackProposalExperiment(int i, boolean z, jsq0 jsq0Var, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = ksq0.a;
        } else {
            this.c = jsq0Var;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UseFeedbackProposalExperiment)) {
            return false;
        }
        UseFeedbackProposalExperiment useFeedbackProposalExperiment = (UseFeedbackProposalExperiment) obj;
        return this.b == useFeedbackProposalExperiment.b && jl40.l(this.c, useFeedbackProposalExperiment.c) && this.d == useFeedbackProposalExperiment.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.c(Boolean.hashCode(this.b) * 31, 31, this.c.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseFeedbackProposalExperiment(isEnabled=");
        sb.append(this.b);
        sb.append(", statuses=");
        sb.append(this.c);
        sb.append(", isNewSurvey=");
        return x4e.i(sb, this.d, Extension.C_BRAKE);
    }

    public UseFeedbackProposalExperiment() {
        this(0);
    }

    public UseFeedbackProposalExperiment(int i) {
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = jsq0Var;
        this.d = false;
    }
}
