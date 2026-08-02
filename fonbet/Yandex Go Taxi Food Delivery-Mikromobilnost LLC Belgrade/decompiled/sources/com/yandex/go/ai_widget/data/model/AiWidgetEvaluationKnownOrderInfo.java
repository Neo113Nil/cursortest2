package com.yandex.go.ai_widget.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationKnownOrderInfo;", "", "Companion", "$serializer", "com/yandex/go/ai_widget/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AiWidgetEvaluationKnownOrderInfo {
    public static final d Companion = new d();
    public final String a;

    public /* synthetic */ AiWidgetEvaluationKnownOrderInfo(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, AiWidgetEvaluationKnownOrderInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AiWidgetEvaluationKnownOrderInfo) && jl40.l(this.a, ((AiWidgetEvaluationKnownOrderInfo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("AiWidgetEvaluationKnownOrderInfo(service=", this.a, Extension.C_BRAKE);
    }

    public AiWidgetEvaluationKnownOrderInfo(String str) {
        this.a = str;
    }
}
