package xsna;

import com.vk.sharing.core.view.IntentAction;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dn6 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((IntentAction) obj) != IntentAction.SHARE_IN_STORY;
    }
}
