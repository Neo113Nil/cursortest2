package defpackage;

import android.content.Context;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.Slide;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivSlideTransition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class jkl {
    public final Context a;
    public final ipl b;

    public jkl(Context context, ipl iplVar) {
        this.a = context;
        this.b = iplVar;
    }

    public static Transition d(DivChangeTransition divChangeTransition, rvo rvoVar) {
        if (divChangeTransition instanceof hik) {
            TransitionSet transitionSet = new TransitionSet();
            Iterator it = ((hik) divChangeTransition).c().a.iterator();
            while (it.hasNext()) {
                transitionSet.Z(d((DivChangeTransition) it.next(), rvoVar));
            }
            return transitionSet;
        }
        if (!(divChangeTransition instanceof gik)) {
            w511.b();
            return null;
        }
        ChangeBounds changeBounds = new ChangeBounds();
        gik gikVar = (gik) divChangeTransition;
        changeBounds.c = ((Number) gikVar.c().b().a(rvoVar)).longValue();
        changeBounds.b = ((Number) gikVar.c().d().a(rvoVar)).longValue();
        changeBounds.w = uml.e((DivAnimationInterpolator) gikVar.c().c().a(rvoVar));
        return changeBounds;
    }

    public final void a(TransitionSet transitionSet, gy01 gy01Var) {
        Transition d;
        int a = this.b.a(gy01Var.c());
        for (gkl gklVar : gy01Var.b()) {
            rvo a2 = gy01Var.a();
            if (gklVar instanceof ekl) {
                ekl eklVar = (ekl) gklVar;
                d = c(eklVar.b(), eklVar.a(), a2);
            } else {
                if (!(gklVar instanceof fkl)) {
                    w511.b();
                    return;
                }
                d = d(((fkl) gklVar).a(), a2);
            }
            d.c(a);
            transitionSet.Z(d);
        }
    }

    public final TransitionSet b(qrq0 qrq0Var, qrq0 qrq0Var2) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.d0(0);
        if (qrq0Var != null) {
            Iterator it = qrq0Var.iterator();
            while (it.hasNext()) {
                a(transitionSet, (gy01) it.next());
            }
        }
        if (qrq0Var2 != null) {
            Iterator it2 = qrq0Var2.iterator();
            while (it2.hasNext()) {
                a(transitionSet, (gy01) it2.next());
            }
        }
        return transitionSet;
    }

    public final Transition c(DivAppearanceTransition divAppearanceTransition, int i, rvo rvoVar) {
        if (divAppearanceTransition instanceof qek) {
            TransitionSet transitionSet = new TransitionSet();
            List list = ((qek) divAppearanceTransition).b.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c((DivAppearanceTransition) it.next(), i, rvoVar));
            }
            Iterator it2 = a.x0(arrayList, new ikl()).iterator();
            while (it2.hasNext()) {
                transitionSet.Z((Transition) it2.next());
            }
            return transitionSet;
        }
        if (divAppearanceTransition instanceof oek) {
            hpk hpkVar = ((oek) divAppearanceTransition).b;
            Fade fade = new Fade((float) ((Number) hpkVar.a.a(rvoVar)).doubleValue());
            fade.d0(i);
            fade.c = ((Number) hpkVar.b.a(rvoVar)).longValue();
            fade.b = ((Number) hpkVar.d.a(rvoVar)).longValue();
            fade.w = uml.e((DivAnimationInterpolator) hpkVar.c.a(rvoVar));
            return fade;
        }
        if (divAppearanceTransition instanceof pek) {
            pek pekVar = (pek) divAppearanceTransition;
            com.yandex.div.core.view2.animations.a aVar = new com.yandex.div.core.view2.animations.a((float) ((Number) pekVar.d().e.a(rvoVar)).doubleValue(), (float) ((Number) pekVar.d().c.a(rvoVar)).doubleValue(), (float) ((Number) pekVar.d().d.a(rvoVar)).doubleValue());
            aVar.d0(i);
            aVar.c = ((Number) pekVar.d().b().a(rvoVar)).longValue();
            aVar.b = ((Number) pekVar.d().d().a(rvoVar)).longValue();
            aVar.w = uml.e((DivAnimationInterpolator) pekVar.d().c().a(rvoVar));
            return aVar;
        }
        if (!(divAppearanceTransition instanceof rek)) {
            w511.b();
            return null;
        }
        DivSlideTransition divSlideTransition = ((rek) divAppearanceTransition).b;
        jnk jnkVar = divSlideTransition.a;
        int G = jnkVar != null ? com.yandex.div.core.view2.divs.a.G(jnkVar, this.a.getResources().getDisplayMetrics(), rvoVar) : -1;
        int i2 = hkl.a[((DivSlideTransition.Edge) divSlideTransition.c.a(rvoVar)).ordinal()];
        int i3 = 3;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 48;
            } else if (i2 == 3) {
                i3 = 5;
            } else {
                if (i2 != 4) {
                    w511.b();
                    return null;
                }
                i3 = 80;
            }
        }
        Slide slide = new Slide(G, i3);
        slide.d0(i);
        slide.c = ((Number) divSlideTransition.b.a(rvoVar)).longValue();
        slide.b = ((Number) divSlideTransition.e.a(rvoVar)).longValue();
        slide.w = uml.e((DivAnimationInterpolator) divSlideTransition.d.a(rvoVar));
        return slide;
    }
}
