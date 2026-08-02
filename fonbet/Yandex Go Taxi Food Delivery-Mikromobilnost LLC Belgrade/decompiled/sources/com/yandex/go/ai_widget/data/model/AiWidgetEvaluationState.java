package com.yandex.go.ai_widget.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.ro1;
import defpackage.tse0;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationState;", "", "Companion", "$serializer", "com/yandex/go/ai_widget/data/model/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AiWidgetEvaluationState {
    public static final g Companion = new g();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(1))};
    public final AiWidgetEvaluationGeopointWrapper a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ AiWidgetEvaluationState(int i, AiWidgetEvaluationGeopointWrapper aiWidgetEvaluationGeopointWrapper, String str, String str2, List list) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, AiWidgetEvaluationState$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = aiWidgetEvaluationGeopointWrapper;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiWidgetEvaluationState)) {
            return false;
        }
        AiWidgetEvaluationState aiWidgetEvaluationState = (AiWidgetEvaluationState) obj;
        return jl40.l(this.a, aiWidgetEvaluationState.a) && jl40.l(this.b, aiWidgetEvaluationState.b) && jl40.l(this.c, aiWidgetEvaluationState.c) && jl40.l(this.d, aiWidgetEvaluationState.d);
    }

    public final int hashCode() {
        AiWidgetEvaluationGeopointWrapper aiWidgetEvaluationGeopointWrapper = this.a;
        int hashCode = (aiWidgetEvaluationGeopointWrapper == null ? 0 : aiWidgetEvaluationGeopointWrapper.a.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiWidgetEvaluationState(location=");
        sb.append(this.a);
        sb.append(", chooseAppearanceMode=");
        sb.append(this.b);
        sb.append(", ultimaMode=");
        return tse0.j(this.c, ", knownOrdersInfo=", Extension.C_BRAKE, sb, this.d);
    }

    public AiWidgetEvaluationState(AiWidgetEvaluationGeopointWrapper aiWidgetEvaluationGeopointWrapper, String str, String str2, ArrayList arrayList) {
        this.a = aiWidgetEvaluationGeopointWrapper;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }
}
