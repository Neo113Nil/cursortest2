package com.yandex.go.taxi.order.feedback.data.model;

import defpackage.b64;
import defpackage.dvw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/feedback/data/model/SurveyQuestion;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/feedback/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SurveyQuestion {
    public static final d Companion = new d();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(3))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ SurveyQuestion(int i, String str, String str2, List list) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyQuestion)) {
            return false;
        }
        SurveyQuestion surveyQuestion = (SurveyQuestion) obj;
        return jl40.l(this.a, surveyQuestion.a) && jl40.l(this.b, surveyQuestion.b) && jl40.l(this.c, surveyQuestion.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("SurveyQuestion(id=", this.a, ", text=", this.b, ", options="), this.c, Extension.C_BRAKE);
    }

    public SurveyQuestion() {
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
    }
}
