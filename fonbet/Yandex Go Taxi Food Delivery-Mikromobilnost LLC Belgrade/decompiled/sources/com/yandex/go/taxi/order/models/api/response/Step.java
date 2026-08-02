package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/Step;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/x7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Step {
    public static final x7 Companion = new x7();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final StepImage d;

    public /* synthetic */ Step(int i, String str, FormattedText formattedText, FormattedText formattedText2, StepImage stepImage) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = stepImage;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step)) {
            return false;
        }
        Step step = (Step) obj;
        return jl40.l(this.a, step.a) && jl40.l(this.b, step.b) && jl40.l(this.c, step.c) && jl40.l(this.d, step.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        FormattedText formattedText = this.c;
        int hashCode = (c + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        StepImage stepImage = this.d;
        return hashCode + (stepImage != null ? stepImage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("Step(icon=", this.a, ", title=", ", subtitle=", this.b);
        q.append(this.c);
        q.append(", image=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public Step() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = null;
        this.d = null;
    }
}
