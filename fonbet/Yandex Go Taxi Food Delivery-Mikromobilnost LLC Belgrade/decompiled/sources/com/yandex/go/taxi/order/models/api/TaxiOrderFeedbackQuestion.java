package com.yandex.go.taxi.order.models.api;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mpx0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrderFeedbackQuestion;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/h", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxiOrderFeedbackQuestion {
    public static final h Companion = new h();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mpx0(29)), null};
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;

    public /* synthetic */ TaxiOrderFeedbackQuestion(int i, String str, String str2, List list, boolean z) {
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
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderFeedbackQuestion)) {
            return false;
        }
        TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion = (TaxiOrderFeedbackQuestion) obj;
        return jl40.l(this.a, taxiOrderFeedbackQuestion.a) && jl40.l(this.b, taxiOrderFeedbackQuestion.b) && jl40.l(this.c, taxiOrderFeedbackQuestion.c) && this.d == taxiOrderFeedbackQuestion.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("TaxiOrderFeedbackQuestion(questionId=", this.a, ", text=", this.b, ", answers=");
        v.append(this.c);
        v.append(", isNewSurvey=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public TaxiOrderFeedbackQuestion(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    public TaxiOrderFeedbackQuestion() {
        this("", "", EmptyList.a, false);
    }
}
