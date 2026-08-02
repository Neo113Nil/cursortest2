package xsna;

import com.vk.dto.uxpolls.Condition;
import com.vk.dto.uxpolls.PollAnswer;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.dto.uxpolls.PollTranslations;
import com.vk.dto.uxpolls.UxPoll;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.ctb0;
import xsna.trb0;
import xsna.xpe0;

/* compiled from: OneByOneGroupedPollStateMapper.kt */
/* loaded from: classes6.dex */
public final class li80 extends dtb0 {
    public static boolean e(s3j s3jVar) {
        ArrayList arrayList = s3jVar.d;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((xpe0) it.next()).isAnswered()) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.dtb0
    public final ctb0.b b(trb0.a aVar) {
        xpe0 c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UxPoll uxPoll = this.a;
        List<PollQuestion> list = uxPoll.d;
        PollTranslations pollTranslations = uxPoll.h;
        int i = 0;
        for (PollQuestion pollQuestion : list) {
            PollAnswer pollAnswer = aVar.b.get(Integer.valueOf(pollQuestion.getId()));
            if (pollAnswer != null) {
                List<Integer> list2 = pollAnswer.b;
                Map<Integer, PollAnswer> map = aVar.b;
                if (pollQuestion instanceof PollQuestion.RatingStar) {
                    ki80 ki80Var = new ki80(0, list2, b5g.class, "isNotEmpty", "isNotEmpty(Ljava/util/Collection;)Z", 1, 0);
                    Integer num = (Integer) j5g.a0(list2);
                    c = new xpe0.e(num != null ? num.intValue() : 0, ki80Var);
                } else if (pollQuestion instanceof PollQuestion.Chips) {
                    c = dtb0.d(this, pollAnswer);
                } else if (pollQuestion instanceof PollQuestion.Grade) {
                    PollQuestion.Grade grade = (PollQuestion.Grade) pollQuestion;
                    kn0 kn0Var = new kn0(0, list2, b5g.class, "isNotEmpty", "isNotEmpty(Ljava/util/Collection;)Z", 1, 3);
                    Integer num2 = (Integer) j5g.a0(list2);
                    c = new xpe0.c(num2 != null ? num2.intValue() : grade.e / 2, kn0Var);
                } else {
                    if (!(pollQuestion instanceof PollQuestion.Open)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c = c((PollQuestion.Open) pollQuestion, map, new yu60(pollAnswer, 4));
                }
                Condition D2 = pollQuestion.D2();
                if (D2 instanceof Condition.SimpleWithId) {
                    s3j s3jVar = (s3j) linkedHashMap.get(Integer.valueOf(((Condition.SimpleWithId) D2).n0()));
                    if (s3jVar != null) {
                        ArrayList arrayList = s3jVar.c;
                        if (!ttp0.f(arrayList)) {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            arrayList.add(pollQuestion);
                        }
                        ArrayList arrayList2 = s3jVar.d;
                        ArrayList arrayList3 = ttp0.f(arrayList2) ? arrayList2 : null;
                        if (arrayList3 != null) {
                            arrayList3.add(c);
                        }
                    }
                } else if (D2 == null) {
                    Integer valueOf = Integer.valueOf(pollQuestion.getId());
                    if (linkedHashMap.get(valueOf) == null) {
                        linkedHashMap.put(valueOf, new s3j(i, e43.o(pollQuestion), e43.o(c)));
                        i++;
                    }
                }
            }
        }
        Collection<s3j> values = linkedHashMap.values();
        ArrayList arrayList4 = new ArrayList(c5g.u(values, 10));
        int i2 = 0;
        for (s3j s3jVar2 : values) {
            if (e(s3jVar2)) {
                i2++;
            }
            arrayList4.add(s3jVar2);
        }
        int i3 = aVar.c;
        if (i2 >= i3) {
            i2 = i3;
        }
        return new ctb0.b.C2682b(i2, arrayList4, i2 >= linkedHashMap.size() - 1 ? pollTranslations.d : pollTranslations.c, e((s3j) arrayList4.get(i2)));
    }

    @Override // xsna.dtb0
    public final xpe0.d c(PollQuestion.Open open, Map map, gzs gzsVar) {
        return new xpe0.d(true, gzsVar);
    }
}
