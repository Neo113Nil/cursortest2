package com.yandex.go.taxi.order.feedback.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/feedback/data/model/FeedbackProposalParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/feedback/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FeedbackProposalParam {
    public static final a Companion = new a();
    public final String a;

    public /* synthetic */ FeedbackProposalParam(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, FeedbackProposalParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedbackProposalParam) && jl40.l(this.a, ((FeedbackProposalParam) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("FeedbackProposalParam(orderId=", this.a, Extension.C_BRAKE);
    }

    public FeedbackProposalParam(String str) {
        this.a = str;
    }
}
