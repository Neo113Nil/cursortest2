package xsna;

import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: ReductionRulesValidatorDelegate.kt */
/* loaded from: classes4.dex */
public final class tmf0 {
    public final b990 a;

    public tmf0(b990 b990Var) {
        this.a = b990Var;
    }

    public static boolean a(LinkedHashSet linkedHashSet, RuleAttachment ruleAttachment) {
        if (linkedHashSet.isEmpty()) {
            return false;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((nrg0) it.next()).a == ruleAttachment) {
                return true;
            }
        }
        return false;
    }
}
