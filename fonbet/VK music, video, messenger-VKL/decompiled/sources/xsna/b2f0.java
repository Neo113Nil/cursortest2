package xsna;

import android.content.Context;
import com.vk.dto.reactions.ReactionMeta;
import java.lang.ref.WeakReference;

/* compiled from: ReactionSender.kt */
/* loaded from: classes5.dex */
public final class b2f0 {
    public final x6f0 a;
    public final x2f0 b;
    public u5f0 c;

    public b2f0(x6f0 x6f0Var, x2f0 x2f0Var) {
        this.a = x6f0Var;
        this.b = x2f0Var;
    }

    public final void a(Context context, p2f0 p2f0Var, ReactionMeta reactionMeta, u5f0 u5f0Var, boolean z) {
        WeakReference<p2f0> weakReference = this.a.j;
        p2f0 p2f0Var2 = weakReference != null ? weakReference.get() : null;
        if (p2f0Var2 != null) {
            p2f0Var2.S4(false);
        }
        a2f0 h = this.b.h(u5f0Var, reactionMeta, z);
        this.b.i(context, u5f0Var, reactionMeta, h, p2f0Var);
        p2f0Var.T1(u5f0Var, reactionMeta, h);
    }
}
