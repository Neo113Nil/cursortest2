package defpackage;

import com.yandex.go.taxi.order.chat.call_feedback.experiments.BadFeedback;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.CallFeedbackExperiment;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.CallFeedbackTexts;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.GoodFeedback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class kh7 extends bd5 {
    public final m2v w;

    public kh7(m2v m2vVar) {
        super(jh7.class);
        this.w = m2vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.collections.EmptyList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Hg() {
        String str;
        boolean isEmpty;
        List list;
        CallFeedbackTexts callFeedbackTexts;
        CallFeedbackTexts callFeedbackTexts2;
        CallFeedbackTexts callFeedbackTexts3;
        jh7 jh7Var = (jh7) Dg();
        m2v m2vVar = this.w;
        zuj0 zuj0Var = (zuj0) m2vVar.b;
        CallFeedbackExperiment p = m2vVar.p();
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        if (p != null) {
            CallFeedbackTexts callFeedbackTexts4 = p.d;
            BadFeedback a = callFeedbackTexts4 != null ? callFeedbackTexts4.getA() : null;
            if (a != null) {
                str = a.a;
                String q = m2vVar.q(p, str, kyh0.call_feedback_title_of_feedback);
                String q2 = m2vVar.q(p, (p != null || (callFeedbackTexts3 = p.d) == null) ? null : callFeedbackTexts3.getF(), kyh0.call_feedback_send);
                m2v.r(p, (p != null || (callFeedbackTexts2 = p.d) == null) ? null : callFeedbackTexts2.getD(), "👎");
                m2v.r(p, (p != null || (callFeedbackTexts = p.d) == null) ? null : callFeedbackTexts.getE(), "👍");
                if (p != null) {
                    CallFeedbackTexts callFeedbackTexts5 = p.d;
                    BadFeedback a2 = callFeedbackTexts5 != null ? callFeedbackTexts5.getA() : null;
                    if (a2 != null && (list = a2.b) != null) {
                        r3 = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) p.c.get((String) it.next());
                            if (str2 != null) {
                                r3.add(str2);
                            }
                        }
                    }
                }
                if (r3 == 0) {
                    r3 = EmptyList.a;
                }
                Collection collection = (Collection) r3;
                isEmpty = collection.isEmpty();
                Collection collection2 = collection;
                if (isEmpty) {
                    avj0 avj0Var = (avj0) zuj0Var;
                    collection2 = scc.g(avj0Var.h(kyh0.call_feedback_reason_1), avj0Var.h(kyh0.call_feedback_reason_2), avj0Var.h(kyh0.call_feedback_reason_3));
                }
                jh7Var.y5(new mrj(23, q, (List) collection2, q2));
                ((mh7) m2vVar.w).c = 0;
            }
        }
        str = null;
        String q3 = m2vVar.q(p, str, kyh0.call_feedback_title_of_feedback);
        String q22 = m2vVar.q(p, (p != null || (callFeedbackTexts3 = p.d) == null) ? null : callFeedbackTexts3.getF(), kyh0.call_feedback_send);
        m2v.r(p, (p != null || (callFeedbackTexts2 = p.d) == null) ? null : callFeedbackTexts2.getD(), "👎");
        m2v.r(p, (p != null || (callFeedbackTexts = p.d) == null) ? null : callFeedbackTexts.getE(), "👍");
        if (p != null) {
        }
        if (r3 == 0) {
        }
        Collection collection3 = (Collection) r3;
        isEmpty = collection3.isEmpty();
        Collection collection22 = collection3;
        if (isEmpty) {
        }
        jh7Var.y5(new mrj(23, q3, (List) collection22, q22));
        ((mh7) m2vVar.w).c = 0;
    }

    public final void Ig() {
        String str;
        CallFeedbackTexts callFeedbackTexts;
        m2v m2vVar = this.w;
        ((mh7) m2vVar.w).c = 1;
        jh7 jh7Var = (jh7) Dg();
        CallFeedbackExperiment p = m2vVar.p();
        String str2 = null;
        if (p != null) {
            CallFeedbackTexts callFeedbackTexts2 = p.d;
            GoodFeedback b = callFeedbackTexts2 != null ? callFeedbackTexts2.getB() : null;
            if (b != null) {
                str = b.a;
                String q = m2vVar.q(p, str, kyh0.call_feedback_glad_to_hear);
                if (p != null && (callFeedbackTexts = p.d) != null) {
                    str2 = callFeedbackTexts.getF();
                }
                jh7Var.R2(new rbh(q, m2vVar.q(p, str2, kyh0.call_feedback_send), 2));
            }
        }
        str = null;
        String q2 = m2vVar.q(p, str, kyh0.call_feedback_glad_to_hear);
        if (p != null) {
            str2 = callFeedbackTexts.getF();
        }
        jh7Var.R2(new rbh(q2, m2vVar.q(p, str2, kyh0.call_feedback_send), 2));
    }
}
