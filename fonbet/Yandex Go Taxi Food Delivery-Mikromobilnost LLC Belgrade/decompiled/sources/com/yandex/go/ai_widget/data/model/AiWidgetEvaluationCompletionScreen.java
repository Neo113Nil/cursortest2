package com.yandex.go.ai_widget.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationCompletionScreen;", "", "Companion", "$serializer", "com/yandex/go/ai_widget/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AiWidgetEvaluationCompletionScreen {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ AiWidgetEvaluationCompletionScreen(int i, String str, String str2, String str3) {
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
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiWidgetEvaluationCompletionScreen)) {
            return false;
        }
        AiWidgetEvaluationCompletionScreen aiWidgetEvaluationCompletionScreen = (AiWidgetEvaluationCompletionScreen) obj;
        return jl40.l(this.a, aiWidgetEvaluationCompletionScreen.a) && jl40.l(this.b, aiWidgetEvaluationCompletionScreen.b) && jl40.l(this.c, aiWidgetEvaluationCompletionScreen.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("AiWidgetEvaluationCompletionScreen(title=", this.a, ", subtitle=", this.b, ", buttonText="), this.c, Extension.C_BRAKE);
    }

    public AiWidgetEvaluationCompletionScreen() {
        this.a = "";
        this.b = "";
        this.c = "";
    }
}
