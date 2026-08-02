package com.yandex.go.ai_widget.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationRequestBody;", "", "Companion", "$serializer", "com/yandex/go/ai_widget/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AiWidgetEvaluationRequestBody {
    public static final e Companion = new e();
    public final AiWidgetEvaluationGeopointWrapper a;
    public final Integer b;
    public final String c;
    public final AiWidgetEvaluationState d;

    public /* synthetic */ AiWidgetEvaluationRequestBody(int i, AiWidgetEvaluationGeopointWrapper aiWidgetEvaluationGeopointWrapper, Integer num, String str, AiWidgetEvaluationState aiWidgetEvaluationState) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, AiWidgetEvaluationRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = aiWidgetEvaluationGeopointWrapper;
        this.b = num;
        this.c = str;
        this.d = aiWidgetEvaluationState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiWidgetEvaluationRequestBody)) {
            return false;
        }
        AiWidgetEvaluationRequestBody aiWidgetEvaluationRequestBody = (AiWidgetEvaluationRequestBody) obj;
        return jl40.l(this.a, aiWidgetEvaluationRequestBody.a) && jl40.l(this.b, aiWidgetEvaluationRequestBody.b) && jl40.l(this.c, aiWidgetEvaluationRequestBody.c) && jl40.l(this.d, aiWidgetEvaluationRequestBody.d);
    }

    public final int hashCode() {
        AiWidgetEvaluationGeopointWrapper aiWidgetEvaluationGeopointWrapper = this.a;
        int hashCode = (aiWidgetEvaluationGeopointWrapper == null ? 0 : aiWidgetEvaluationGeopointWrapper.a.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AiWidgetEvaluationState aiWidgetEvaluationState = this.d;
        return hashCode3 + (aiWidgetEvaluationState != null ? aiWidgetEvaluationState.hashCode() : 0);
    }

    public final String toString() {
        return "AiWidgetEvaluationRequestBody(position=" + this.a + ", userPowerPrc=" + this.b + ", userPluggedState=" + this.c + ", state=" + this.d + Extension.C_BRAKE;
    }

    public AiWidgetEvaluationRequestBody(AiWidgetEvaluationGeopointWrapper aiWidgetEvaluationGeopointWrapper, Integer num, String str, AiWidgetEvaluationState aiWidgetEvaluationState) {
        this.a = aiWidgetEvaluationGeopointWrapper;
        this.b = num;
        this.c = str;
        this.d = aiWidgetEvaluationState;
    }
}
