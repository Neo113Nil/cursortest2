package com.yandex.go.feedback_common.data.model;

import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nsq;
import defpackage.nzs;
import defpackage.tse0;
import defpackage.unr0;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/feedback_common/data/model/FeedbackParam;", "", "Companion", "a", "com/yandex/go/feedback_common/data/model/a", "$serializer", "feedback_common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FeedbackParam {
    public static final com.yandex.go.feedback_common.data.model.a Companion = new com.yandex.go.feedback_common.data.model.a();
    public static final i3y[] j = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(4)), null};
    public String a;
    public Tips b;
    public Integer c;
    public String d;
    public String e;
    public FeedbackChoices f;
    public Calendar g;
    public List h;
    public Boolean i;

    public static final class a {
        public String a;
        public Tips b;
        public Integer c;
        public String e;
        public Calendar g;
        public List h;
        public Boolean i;
        public String d = "";
        public FeedbackChoices f = new FeedbackChoices((List) null, (List) null, (Map) null, (List) null, 31);
    }

    public FeedbackParam() {
        this("", null, null, "", null, new FeedbackChoices((List) null, (List) null, (Map) null, (List) null, 31), null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackParam)) {
            return false;
        }
        FeedbackParam feedbackParam = (FeedbackParam) obj;
        return jl40.l(this.a, feedbackParam.a) && jl40.l(this.b, feedbackParam.b) && jl40.l(this.c, feedbackParam.c) && jl40.l(this.d, feedbackParam.d) && jl40.l(this.e, feedbackParam.e) && jl40.l(this.f, feedbackParam.f) && jl40.l(this.g, feedbackParam.g) && jl40.l(this.h, feedbackParam.h) && jl40.l(this.i, feedbackParam.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Tips tips = this.b;
        int hashCode2 = (hashCode + (tips == null ? 0 : tips.hashCode())) * 31;
        Integer num = this.c;
        int b = unr0.b((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode3 = (this.f.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Calendar calendar = this.g;
        int hashCode4 = (hashCode3 + (calendar == null ? 0 : calendar.hashCode())) * 31;
        List list = this.h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.i;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        Tips tips = this.b;
        Integer num = this.c;
        String str2 = this.d;
        String str3 = this.e;
        FeedbackChoices feedbackChoices = this.f;
        Calendar calendar = this.g;
        List list = this.h;
        Boolean bool = this.i;
        StringBuilder sb = new StringBuilder("FeedbackParam(id=");
        sb.append(str);
        sb.append(", tips=");
        sb.append(tips);
        sb.append(", rating=");
        tse0.w(num, ", orderId=", str2, ", message=", sb);
        sb.append(str3);
        sb.append(", choices=");
        sb.append(feedbackChoices);
        sb.append(", createdTime=");
        sb.append(calendar);
        sb.append(", surveyInfo=");
        sb.append(list);
        sb.append(", feedbackQuestionAnswer=");
        return nzs.d(sb, bool, Extension.C_BRAKE);
    }

    public FeedbackParam(String str, Tips tips, Integer num, String str2, String str3, FeedbackChoices feedbackChoices, Calendar calendar, List list, Boolean bool) {
        this.a = str;
        this.b = tips;
        this.c = num;
        this.d = str2;
        this.e = str3;
        this.f = feedbackChoices;
        this.g = calendar;
        this.h = list;
        this.i = bool;
    }
}
