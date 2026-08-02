package com.yandex.go.ai_widget.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.ro1;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationResponse;", "", "Companion", "$serializer", "com/yandex/go/ai_widget/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AiWidgetEvaluationResponse {
    public static final f Companion = new f();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(0))};
    public final String a;
    public final AiWidgetEvaluationCompletionScreen b;
    public final List c;

    public /* synthetic */ AiWidgetEvaluationResponse(int i, String str, AiWidgetEvaluationCompletionScreen aiWidgetEvaluationCompletionScreen, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = aiWidgetEvaluationCompletionScreen;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiWidgetEvaluationResponse)) {
            return false;
        }
        AiWidgetEvaluationResponse aiWidgetEvaluationResponse = (AiWidgetEvaluationResponse) obj;
        return jl40.l(this.a, aiWidgetEvaluationResponse.a) && jl40.l(this.b, aiWidgetEvaluationResponse.b) && jl40.l(this.c, aiWidgetEvaluationResponse.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AiWidgetEvaluationCompletionScreen aiWidgetEvaluationCompletionScreen = this.b;
        return this.c.hashCode() + ((hashCode + (aiWidgetEvaluationCompletionScreen != null ? aiWidgetEvaluationCompletionScreen.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiWidgetEvaluationResponse(screenTitle=");
        sb.append(this.a);
        sb.append(", completionScreen=");
        sb.append(this.b);
        sb.append(", items=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public AiWidgetEvaluationResponse() {
        this.a = null;
        this.b = null;
        this.c = EmptyList.a;
    }
}
