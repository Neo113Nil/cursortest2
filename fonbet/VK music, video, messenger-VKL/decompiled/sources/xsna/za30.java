package xsna;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.aa30;
import xsna.nb30;
import xsna.nmp0;
import xsna.uny;
import xsna.vmp0;

/* compiled from: MotionLayoutScene.kt */
/* loaded from: classes7.dex */
public final class za30 {
    public final HashMap a;
    public final HashMap b;
    public final wvs0 c;
    public final ArrayList d;
    public final uny f;
    public aa30 h;
    public ValueAnimator i;
    public final ArrayList e = new ArrayList();
    public izs<? super aa30, s3q0> g = new x8m(21);

    public za30(nb30 nb30Var, HashMap hashMap, HashMap hashMap2, wvs0 wvs0Var, ArrayList arrayList) {
        this.a = hashMap;
        this.b = hashMap2;
        this.c = wvs0Var;
        this.d = arrayList;
        this.f = new uny(nb30Var, hashMap2, hashMap, arrayList);
        this.h = new aa30.a(nb30Var);
        hashMap2.put(nb30.a.a, new b8o0(jgp.b));
        hashMap.put(nmp0.a.b, new vmp0.a(nb30Var));
        wvs0Var.b = new b1z(this, 6);
    }

    public final ValueAnimator a(vmp0 vmp0Var, nb30 nb30Var, nb30 nb30Var2) {
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Pair pair = epx.f(vmp0Var.a.c, nb30Var2) ? new Pair(valueOf2, valueOf) : new Pair(valueOf, valueOf2);
        float floatValue = ((Number) pair.d()).floatValue();
        float floatValue2 = ((Number) pair.g()).floatValue();
        hq2 hq2Var = vmp0Var.b;
        int i = 5;
        r9e r9eVar = new r9e(this, vmp0Var, nb30Var2, i);
        kk kkVar = new kk(this, nb30Var, nb30Var2, i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.setDuration(hq2Var.a);
        ofFloat.setInterpolator(hq2Var.b);
        ofFloat.addListener(new ya30(kkVar));
        ofFloat.addUpdateListener(new ys5(r9eVar, 3));
        return ofFloat;
    }

    public final ValueAnimator b(vmp0 vmp0Var, float f, boolean z) {
        float f2 = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        long c = an10.c(Math.abs(f2 - f) * vmp0Var.b.a);
        TimeInterpolator timeInterpolator = vmp0Var.b.b;
        xa30 xa30Var = new xa30(this, vmp0Var, z);
        com.vk.movika.sdk.base.logic.interactor.m mVar = new com.vk.movika.sdk.base.logic.interactor.m(20);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(c);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addListener(new ya30(mVar));
        ofFloat.addUpdateListener(new ys5(xa30Var, 3));
        return ofFloat;
    }

    public final void c(aa30 aa30Var) {
        uny.a.C3814a a;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"MotionLayoutScene.animationState = " + this.h});
        }
        if (epx.f(this.h, aa30Var)) {
            return;
        }
        this.h = aa30Var;
        boolean z = aa30Var instanceof aa30.a;
        ArrayList arrayList = this.e;
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((bb30) it.next()).a(((aa30.a) aa30Var).a);
            }
        } else {
            if (!(aa30Var instanceof aa30.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                bb30 bb30Var = (bb30) it2.next();
                aa30.b bVar = (aa30.b) aa30Var;
                ei eiVar = bVar.a;
                bb30Var.c(eiVar.b, eiVar.c, bVar.b);
            }
        }
        uny unyVar = this.f;
        aa30 aa30Var2 = unyVar.e;
        vpy vpyVar = unyVar.f;
        if (!epx.f(aa30Var2, aa30Var)) {
            unyVar.e = aa30Var;
            uny.a aVar = unyVar.d;
            if (z) {
                if (!(aVar instanceof uny.a.b) || !epx.f(((uny.a.b) aVar).a.b, ((aa30.a) aa30Var).a)) {
                    ob30 ob30Var = (ob30) unyVar.a.get(((aa30.a) aa30Var).a);
                    ob30Var.c();
                    unyVar.d = new uny.a.b(ob30Var);
                    vpyVar.c = false;
                }
            } else {
                if (!(aa30Var instanceof aa30.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (aVar instanceof uny.a.C3814a) {
                    uny.a.C3814a c3814a = (uny.a.C3814a) aVar;
                    nmp0 nmp0Var = c3814a.a;
                    Pair<Float, pny<?>> pair = c3814a.c;
                    Pair<Float, pny<?>> pair2 = c3814a.b;
                    aa30.b bVar2 = (aa30.b) aa30Var;
                    if (epx.f(nmp0Var, bVar2.a.a)) {
                        float floatValue = pair2.i().floatValue();
                        float floatValue2 = pair.i().floatValue();
                        float f = bVar2.b;
                        a = (f < floatValue || f > floatValue2) ? unyVar.a(bVar2) : new uny.a.C3814a(c3814a.a, pair2, pair, f);
                        unyVar.d = a;
                        vpyVar.c = false;
                    }
                }
                a = unyVar.a((aa30.b) aa30Var);
                unyVar.d = a;
                vpyVar.c = false;
            }
        }
        this.g.invoke(aa30Var);
    }
}
