package xsna;

import android.view.View;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.flx0;
import xsna.t70;

/* compiled from: WhiteboardActions.kt */
/* loaded from: classes7.dex */
public final class glx0 extends t70 {
    public final cxq d;
    public final w30 e;
    public final sy f;
    public final ty g;
    public final c00 h;
    public final k40 i;
    public final r00 j;
    public ga40 k;

    public glx0() {
        cxq cxqVar = new cxq(null);
        this.d = cxqVar;
        int b = cn70.b(3);
        Integer valueOf = Integer.valueOf(R.drawable.voip_whiteboard_primary_button);
        this.e = new w30(b, valueOf, new rqs0(this, 10));
        this.f = new sy(valueOf, new sgt0(this, 12));
        this.g = new ty(cn70.b(3), valueOf, new hri0(this, 26));
        this.h = new c00(cn70.b(3), valueOf, new mll0(this, 23));
        this.i = new k40(Integer.valueOf(R.drawable.voip_reactions_hand_button_background_whiteboard), new fem0(this, 20));
        this.j = new r00(valueOf, new k0m0(this));
        com.vk.voip.ui.c.b.getClass();
        cxqVar.j(new s5r(com.vk.voip.ui.c.X));
    }

    @Override // xsna.t70
    public final List<ku<? extends Object, ? extends View>> a() {
        return e43.l(this.f, this.g, this.h, this.i, this.j, this.e);
    }

    @Override // xsna.t70
    public final List<ku<? extends Object, ? extends View>> b() {
        return Collections.singletonList(this.h);
    }

    @Override // xsna.t70
    public final ku<? extends t70.c, ? extends View> c() {
        return this.d;
    }

    public final void e(j9d0 j9d0Var) {
        ga40 ga40Var = this.k;
        if (ga40Var != null) {
            ((com.vk.voip.ui.whiteboard.presentation.main.ui.a) ga40Var.c).c.invoke(new flx0.a(j9d0Var));
        }
    }
}
