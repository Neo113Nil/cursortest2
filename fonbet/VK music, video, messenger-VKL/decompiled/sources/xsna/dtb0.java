package xsna;

import com.vk.dto.uxpolls.Condition;
import com.vk.dto.uxpolls.PollAnswer;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.dto.uxpolls.UxPoll;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.ctb0;
import xsna.trb0;
import xsna.xpe0;

/* compiled from: PollViewStateMapper.kt */
/* loaded from: classes6.dex */
public abstract class dtb0 {
    public final UxPoll a;

    public dtb0(UxPoll uxPoll) {
        this.a = uxPoll;
    }

    public static boolean a(Condition condition, Map map) {
        if (condition instanceof Condition.SimpleWithId.HasAnswers) {
            PollAnswer pollAnswer = (PollAnswer) map.get(Integer.valueOf(((Condition.SimpleWithId.HasAnswers) condition).b));
            if (pollAnswer != null) {
                return p4g.b(((Condition.SimpleWithId.HasAnswers) condition).c, pollAnswer.b);
            }
            return false;
        }
        if (condition instanceof Condition.SimpleWithId.AnswerIsEmpty) {
            PollAnswer pollAnswer2 = (PollAnswer) map.get(Integer.valueOf(((Condition.SimpleWithId.AnswerIsEmpty) condition).b));
            if (pollAnswer2 != null) {
                return pollAnswer2.b.isEmpty();
            }
            return false;
        }
        if (condition instanceof Condition.SimpleWithId.HasWords) {
            int i = ((Condition.SimpleWithId.HasWords) condition).b;
            i750 i750Var = new i750(condition, 12);
            PollAnswer pollAnswer3 = (PollAnswer) map.get(Integer.valueOf(i));
            if (pollAnswer3 != null) {
                return ((Boolean) i750Var.invoke(pollAnswer3)).booleanValue();
            }
            return false;
        }
        if (condition instanceof Condition.And) {
            List<Condition> list = ((Condition.And) condition).b;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!a((Condition) it.next(), map)) {
                }
            }
            return true;
        }
        if (condition instanceof Condition.Or) {
            List<Condition> list2 = ((Condition.Or) condition).b;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (a((Condition) it2.next(), map)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static xpe0.b d(dtb0 dtb0Var, PollAnswer pollAnswer) {
        return new xpe0.b(pollAnswer.b);
    }

    public abstract ctb0.b b(trb0.a aVar);

    public xpe0.d c(PollQuestion.Open open, Map map, gzs gzsVar) {
        Condition condition = open.d;
        return new xpe0.d(condition != null ? a(condition, map) : true, gzsVar);
    }
}
