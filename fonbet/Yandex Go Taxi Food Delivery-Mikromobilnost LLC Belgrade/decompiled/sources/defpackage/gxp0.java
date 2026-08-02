package defpackage;

import android.animation.AnimatorSet;
import com.google.android.material.animation.a;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.search.e;
import com.google.android.material.search.g;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final /* synthetic */ class gxp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ gxp0(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                gVar.l();
                break;
            default:
                gVar.getClass();
                a aVar = new a();
                nxp0 nxp0Var = gVar.u;
                AnimatorSet d = nxp0Var.d(true);
                if (gVar.r == null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    gVar.h(animatorSet);
                    animatorSet.setDuration(300L);
                    animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(true, mj2.b));
                    d.playTogether(animatorSet);
                }
                aVar.a.add(d);
                Iterator it = nxp0Var.e(true).iterator();
                while (it.hasNext()) {
                    aVar.b.add((nwt0) it.next());
                }
                aVar.c.add(new e(gVar, aVar));
                aVar.a();
                gVar.o = aVar;
                break;
        }
    }
}
