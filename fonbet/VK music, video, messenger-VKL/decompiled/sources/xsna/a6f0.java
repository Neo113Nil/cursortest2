package xsna;

import android.animation.AnimatorSet;
import com.vk.core.view.components.badge.VkContentBadge;
import java.util.ArrayList;

/* compiled from: ReactionsPopupViewAnimator.kt */
/* loaded from: classes18.dex */
public final class a6f0 {
    public final m6f0 a;
    public final y5f0 b;
    public final p6f0 c;
    public final b3f0 d;

    public a6f0(m3r m3rVar, k6f0 k6f0Var, VkContentBadge[] vkContentBadgeArr, ArrayList arrayList, y6f0 y6f0Var, x2f0 x2f0Var, nij nijVar) {
        m6f0 m6f0Var = new m6f0(m3rVar, k6f0Var, vkContentBadgeArr, arrayList, y6f0Var);
        this.a = m6f0Var;
        this.b = new y5f0(m3rVar, k6f0Var, y6f0Var, x2f0Var, arrayList);
        this.c = new p6f0(m3rVar, k6f0Var, vkContentBadgeArr, y6f0Var, x2f0Var, nijVar, m6f0Var);
        this.d = new b3f0(m3rVar, k6f0Var, x2f0Var, nijVar);
    }

    public final boolean a() {
        return (this.b.g.isRunning() || ((AnimatorSet) this.c.q.getValue()).isRunning() || ((AnimatorSet) this.d.k.getValue()).isRunning()) ? false : true;
    }

    public final void b() {
        b3f0 b3f0Var = this.d;
        ((AnimatorSet) b3f0Var.k.getValue()).cancel();
        b3f0Var.a.removeCallbacks(b3f0Var.j);
        p6f0 p6f0Var = this.c;
        ((AnimatorSet) p6f0Var.q.getValue()).cancel();
        p6f0Var.a.removeCallbacks(p6f0Var.p);
        y5f0 y5f0Var = this.b;
        y5f0Var.g.cancel();
        y5f0Var.a.removeCallbacks(y5f0Var.f);
        m6f0 m6f0Var = this.a;
        ((AnimatorSet) m6f0Var.z.getValue()).cancel();
        m6f0Var.a.removeCallbacks(m6f0Var.x);
    }
}
