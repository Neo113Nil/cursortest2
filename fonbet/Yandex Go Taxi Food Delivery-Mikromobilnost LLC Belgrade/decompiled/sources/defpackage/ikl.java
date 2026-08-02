package defpackage;

import androidx.transition.Transition;
import java.util.Comparator;

/* loaded from: classes11.dex */
public final class ikl implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj;
        return Long.valueOf(transition.b + transition.c).compareTo(Long.valueOf(transition2.b + transition2.c));
    }
}
