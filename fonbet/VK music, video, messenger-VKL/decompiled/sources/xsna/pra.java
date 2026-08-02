package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionTarget;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.Pair;

/* compiled from: ChainsSearch.kt */
/* loaded from: classes16.dex */
public final class pra {
    public static int a(InternalNpsQuestions internalNpsQuestions) {
        Map<String, InternalNpsQuestion> map = internalNpsQuestions.d;
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Stack stack = new Stack();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 1;
        stack.push(new Pair(internalNpsQuestions.c, 1));
        while (!stack.empty()) {
            Pair pair = (Pair) stack.pop();
            String str = (String) pair.d();
            int intValue = ((Number) pair.g()).intValue();
            Integer num = (Integer) linkedHashMap.get(str);
            if ((num != null ? num.intValue() : 0) < intValue) {
                linkedHashMap.put(str, Integer.valueOf(intValue));
                InternalNpsQuestion internalNpsQuestion = map.get(str);
                if (internalNpsQuestion == null) {
                    throw new IllegalStateException(go9.b("Bad question code ", str));
                }
                List<InternalNpsQuestionTarget> list = internalNpsQuestion.f;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    stack.push(new Pair(((InternalNpsQuestionTarget) it.next()).b, Integer.valueOf(intValue + 1)));
                }
                if (list.isEmpty()) {
                    i = Math.max(i, intValue);
                }
            }
        }
        return i;
    }
}
