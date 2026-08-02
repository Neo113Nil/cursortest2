package xsna;

import com.vk.dto.reactions.ReactionSet;
import java.util.ArrayList;

/* compiled from: PostActivitiesInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class b0c0 implements a0c0 {
    public final lj70 a;

    public b0c0(lj70 lj70Var) {
        this.a = lj70Var;
    }

    @Override // xsna.a0c0
    public final io.reactivex.rxjava3.core.x a(ArrayList arrayList, ReactionSet reactionSet) {
        c0c0 c0c0Var;
        lj70 lj70Var = this.a;
        synchronized (lj70Var) {
            try {
                c0c0Var = (c0c0) lj70Var.b;
                if (c0c0Var == null && arrayList.size() == 1) {
                    lj70Var.b = (c0c0) j5g.a0(arrayList);
                    c0c0Var = null;
                } else {
                    lj70Var.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (arrayList.isEmpty() || (arrayList.size() == 1 && c0c0Var == null)) ? io.reactivex.rxjava3.core.x.k(jgp.b) : c0c0Var != null ? lj70Var.c(j5g.v0(c0c0Var, arrayList), reactionSet) : lj70Var.c(arrayList, reactionSet);
    }
}
