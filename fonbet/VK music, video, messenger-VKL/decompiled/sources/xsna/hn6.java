package xsna;

import com.vk.sharing.core.view.IntentAction;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hn6 implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((IntentAction) obj) != IntentAction.SHARE_TO_WALL;
            default:
                return ((pt50) obj) instanceof acy;
        }
    }
}
