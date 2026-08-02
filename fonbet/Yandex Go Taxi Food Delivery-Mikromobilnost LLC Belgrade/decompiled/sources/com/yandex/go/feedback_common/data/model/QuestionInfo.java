package com.yandex.go.feedback_common.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/feedback_common/data/model/QuestionInfo;", "", "Companion", "$serializer", "com/yandex/go/feedback_common/data/model/b", "feedback_common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class QuestionInfo {
    public static final b Companion = new b();
    public final String a;
    public final String b;

    public /* synthetic */ QuestionInfo(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, QuestionInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionInfo)) {
            return false;
        }
        QuestionInfo questionInfo = (QuestionInfo) obj;
        return jl40.l(this.a, questionInfo.a) && jl40.l(this.b, questionInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("QuestionInfo(questionId=", this.a, ", answerId=", this.b, Extension.C_BRAKE);
    }

    public QuestionInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
