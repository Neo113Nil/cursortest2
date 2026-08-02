package xsna;

import com.vk.dto.uxpolls.PollAnswer;
import com.vk.dto.uxpolls.PollQuestion;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ctb0;
import xsna.trb0;
import xsna.xpe0;

/* compiled from: OneInOneViewStateMapper.kt */
/* loaded from: classes6.dex */
public final class si80 extends dtb0 {
    @Override // xsna.dtb0
    public final ctb0.b b(trb0.a aVar) {
        xpe0 xpe0Var;
        PollQuestion pollQuestion = (PollQuestion) j5g.Y(this.a.d);
        PollAnswer pollAnswer = aVar.b.get(Integer.valueOf(pollQuestion.getId()));
        if (pollAnswer != null) {
            List<Integer> list = pollAnswer.b;
            if (pollQuestion instanceof PollQuestion.Chips) {
                xpe0Var = dtb0.d(this, pollAnswer);
            } else {
                boolean z = pollQuestion instanceof PollQuestion.Grade;
                aq0 aq0Var = xpe0.a.a;
                if (z) {
                    PollQuestion.Grade grade = (PollQuestion.Grade) pollQuestion;
                    Integer num = (Integer) j5g.a0(list);
                    xpe0Var = new xpe0.c(num != null ? num.intValue() : grade.e / 2, aq0Var);
                } else if (pollQuestion instanceof PollQuestion.RatingStar) {
                    Integer num2 = (Integer) j5g.a0(list);
                    xpe0Var = new xpe0.e(num2 != null ? num2.intValue() : 0, aq0Var);
                } else {
                    if (!(pollQuestion instanceof PollQuestion.Open)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xpe0Var = c((PollQuestion.Open) pollQuestion, aVar.b, aq0Var);
                }
            }
        } else {
            xpe0Var = xpe0.f.a;
        }
        return new ctb0.b.c(xpe0Var);
    }
}
