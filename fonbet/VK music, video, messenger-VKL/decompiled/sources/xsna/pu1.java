package xsna;

import com.vk.dto.uxpolls.PollAnswer;
import com.vk.dto.uxpolls.PollQuestion;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ctb0;
import xsna.trb0;
import xsna.xpe0;

/* compiled from: AllInOneViewStateMapper.kt */
/* loaded from: classes6.dex */
public final class pu1 extends dtb0 {
    @Override // xsna.dtb0
    public final ctb0.b b(trb0.a aVar) {
        Object obj;
        String str;
        List<PollQuestion> list = this.a.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        boolean z = true;
        for (PollQuestion pollQuestion : list) {
            PollAnswer pollAnswer = aVar.b.get(Integer.valueOf(pollQuestion.getId()));
            if (pollAnswer != null) {
                List<Integer> list2 = pollAnswer.b;
                if (pollQuestion instanceof PollQuestion.Chips) {
                    obj = dtb0.d(this, pollAnswer);
                } else {
                    boolean z2 = pollQuestion instanceof PollQuestion.Grade;
                    aq0 aq0Var = xpe0.a.a;
                    if (z2) {
                        PollQuestion.Grade grade = (PollQuestion.Grade) pollQuestion;
                        Integer num = (Integer) j5g.a0(list2);
                        obj = new xpe0.c(num != null ? num.intValue() : grade.e / 2, aq0Var);
                    } else if (pollQuestion instanceof PollQuestion.RatingStar) {
                        Integer num2 = (Integer) j5g.a0(list2);
                        int intValue = num2 != null ? num2.intValue() : 0;
                        obj = new xpe0.e(intValue, aq0Var);
                        z = z && intValue > 0;
                    } else {
                        if (!(pollQuestion instanceof PollQuestion.Open)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PollQuestion.Open open = (PollQuestion.Open) pollQuestion;
                        xpe0.d c = c(open, aVar.b, aq0Var);
                        PollQuestion.Open.OpenFeedback openFeedback = open.e;
                        z = z && !((openFeedback != null ? openFeedback.d : false) && c.a && ((str = pollAnswer.c) == null || str.length() == 0));
                        obj = c;
                    }
                }
            } else {
                obj = xpe0.f.a;
            }
            arrayList.add(obj);
        }
        return new ctb0.b.a(arrayList, z);
    }
}
