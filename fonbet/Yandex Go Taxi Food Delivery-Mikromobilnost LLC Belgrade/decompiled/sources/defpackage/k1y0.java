package defpackage;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.feedback_common.data.model.QuestionInfo;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderFeedbackQuestionInfoState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes8.dex */
public final class k1y0 {
    public final h a;
    public final jtq0 b;
    public final i3y c = a.b(LazyThreadSafetyMode.NONE, new gjx0(10));

    public k1y0(h hVar, jtq0 jtq0Var) {
        this.a = hVar;
        this.b = jtq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        if (r0 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FeedbackParam a(String str, TaxiOrderFeedback taxiOrderFeedback) {
        TaxiOrderSelectedTipsChoiceState d;
        String c;
        TipsType tipsType;
        Tips tips;
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType b;
        h hVar = this.a;
        if (hVar.Hg() == null) {
            a3y0 a3y0Var = (a3y0) this.c.getValue();
            String l = a3y0Var.l(new String[]{"fromOrder"});
            hst hstVar = jst.e;
            String str2 = a3y0Var.a;
            hstVar.getClass();
            ist m = hstVar.m(l);
            ke00 a = m.b.a();
            if (a != null && a.b(15)) {
                a.a(15, str2, null, "Launch id is null", m.a);
            }
        }
        String Hg = hVar.Hg();
        if (Hg == null) {
            Hg = "";
        }
        String str3 = Hg;
        TaxiOrderTipsState g = taxiOrderFeedback.getG();
        ArrayList arrayList = null;
        if (g.getD() == null || (d = g.getD()) == null || (c = d.getC()) == null) {
            tips = null;
        } else {
            TaxiOrderSelectedTipsChoiceState d2 = g.getD();
            if (d2 != null && (b = d2.getB()) != null) {
                int i = j1y0.a[b.ordinal()];
                if (i == 1) {
                    tipsType = TipsType.FLAT;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    tipsType = TipsType.PERCENT;
                }
            }
            tipsType = TipsType.PERCENT;
            tips = new Tips(c, tipsType);
        }
        Integer a2 = taxiOrderFeedback.getA();
        if (a2 != null && a2.intValue() == 0) {
            a2 = null;
        }
        String f = taxiOrderFeedback.getF();
        FeedbackChoices feedbackChoices = new FeedbackChoices(taxiOrderFeedback.getC(), taxiOrderFeedback.getD(), taxiOrderFeedback.getE(), taxiOrderFeedback.getB(), 8);
        Calendar b2 = this.b.b(null);
        List h = taxiOrderFeedback.getH();
        if (h != null) {
            List<TaxiOrderFeedbackQuestionInfoState> list = h;
            arrayList = new ArrayList(tcc.n(list, 10));
            for (TaxiOrderFeedbackQuestionInfoState taxiOrderFeedbackQuestionInfoState : list) {
                arrayList.add(new QuestionInfo(taxiOrderFeedbackQuestionInfoState.getA(), taxiOrderFeedbackQuestionInfoState.getB()));
            }
        }
        return new FeedbackParam(str3, tips, a2, str, f, feedbackChoices, b2, arrayList, null);
    }
}
