package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.Iterator;
import xsna.swe0;
import xsna.z8x;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public final class StringFunctionsKt {
    /* renamed from: buildRepeatableString-zb-MA7A, reason: not valid java name */
    public static final String m154buildRepeatableStringzbMA7A(EvaluationContext evaluationContext, Evaluable evaluable, int i, String str) {
        if (str.length() == 0 || i <= 0) {
            if (str.length() != 0) {
                return "";
            }
            evaluationContext.getWarningSender().mo113sendBIH1yYw(evaluable, "String for padding is empty.");
            return "";
        }
        StringBuilder sb = new StringBuilder(i);
        Iterator<Integer> it = swe0.q(0, i).iterator();
        while (it.hasNext()) {
            sb.append(str.charAt(((z8x) it).nextInt() % str.length()));
        }
        return sb.toString();
    }
}
