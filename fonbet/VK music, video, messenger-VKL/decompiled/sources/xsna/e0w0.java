package xsna;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentManager;
import com.vk.libvideo.ui.vkvideopromo.VkVideoPromoFragment;
import com.vk.log.L;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import xsna.adw0;
import xsna.f6x0;
import xsna.ptw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0w0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0w0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.voip.ui.sessionrooms.c cVar;
        ViewGroup viewGroup;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                VkVideoPromoFragment vkVideoPromoFragment = (VkVideoPromoFragment) obj2;
                int i2 = VkVideoPromoFragment.Q;
                ((VideoGrowthComponent) vkVideoPromoFragment.O.getValue()).Z7().d(vkVideoPromoFragment.eo().d().f);
                gzs<s3q0> gzsVar = vkVideoPromoFragment.P;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 1:
                lcw0 lcw0Var = (lcw0) obj2;
                FragmentManager parentFragmentManager = lcw0Var.a.getParentFragmentManager();
                if (parentFragmentManager != null) {
                    cVar = new com.vk.voip.ui.sessionrooms.b(parentFragmentManager);
                } else {
                    com.vk.voip.ui.c.b.getClass();
                    cVar = com.vk.voip.ui.c.B0;
                }
                cVar.g();
                lcw0Var.c.invoke();
                return s3q0.a;
            case 2:
                int i3 = cdw0.o1;
                xn50.a.c((cdw0) obj2, new adw0.b.C2537b((String) obj));
                return s3q0.a;
            case 3:
                L.f("VoipCallHints", "Can't get info about broadcast initiator " + ((uj8) obj2).b.getId(), (Throwable) obj);
                return s3q0.a;
            case 4:
                final dkw0 dkw0Var = (dkw0) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ViewGroup viewGroup2 = dkw0Var.c;
                ViewParent parent = viewGroup2.getParent();
                ViewGroup viewGroup3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup3 == null) {
                    viewGroup3 = viewGroup2;
                }
                mk5 mk5Var = new mk5();
                mk5Var.g(0);
                zmp0.a(viewGroup3, mk5Var);
                if (booleanValue) {
                    bwt0.p0(viewGroup2, true);
                    bi8 bi8Var = new bi8(dkw0Var.a);
                    dkw0Var.e = bi8Var;
                    viewGroup2.addView(bi8Var.b);
                    int i4 = 8;
                    io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.i0(dkw0Var.b.c().a0(asu0.a.d()).U(new xq70(new wss0(dkw0Var, 8), 26)), new n5j0(new ygm0(9), 12)).subscribe(new bkw0(new aer0(dkw0Var, 11), 0));
                    io.reactivex.rxjava3.disposables.b bVar = dkw0Var.g;
                    bVar.b(subscribe);
                    bi8 bi8Var2 = dkw0Var.e;
                    if (!bi8Var2.m) {
                        throw new IllegalStateException("Instance is destroyed");
                    }
                    bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(bi8Var2.j.U(new s1j0(new lbt0(dkw0Var, 6), 14)), new sqk0(new riw0(1), 10)).subscribe(new i3q0(new rtg0(dkw0Var, 27), i4)));
                    bi8 bi8Var3 = dkw0Var.e;
                    if (bi8Var3 != null && (viewGroup = bi8Var3.b) != null) {
                        r0u0.a(viewGroup, new a0t() { // from class: xsna.ckw0
                            @Override // xsna.a0t
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                                int intValue = ((Integer) obj4).intValue();
                                int intValue2 = ((Integer) obj5).intValue();
                                int intValue3 = ((Integer) obj6).intValue();
                                int intValue4 = ((Integer) obj7).intValue();
                                s1j0 s1j0Var = dkw0.this.d;
                                if (s1j0Var != null) {
                                    s1j0Var.a(intValue, intValue2, intValue3, intValue4);
                                }
                                return s3q0.a;
                            }
                        });
                    }
                } else {
                    bwt0.p0(viewGroup2, false);
                    dkw0Var.a();
                }
                return s3q0.a;
            case 5:
                ((cuw0) obj2).c.invoke(ptw0.e.b);
                return s3q0.a;
            case 6:
                ssw sswVar = (ssw) obj2;
                fjw0 fjw0Var = (fjw0) obj;
                ((upj) sswVar.a).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                Long l = (Long) sswVar.c;
                if (l != null) {
                    L.e("voip state change " + fjw0Var.b + " -> " + fjw0Var.a + " in " + (currentTimeMillis - l.longValue()) + " ms");
                }
                sswVar.c = Long.valueOf(currentTimeMillis);
                return s3q0.a;
            default:
                int i5 = y5x0.l1;
                ((f6x0) obj2).n.onNext(f6x0.b.LOADING);
                return s3q0.a;
        }
    }
}
