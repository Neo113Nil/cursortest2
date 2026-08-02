package xsna;

import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.polls.PollOption;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.share.link.pager_new.model.SharingReason;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.j1x0;
import xsna.srw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class csk0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ csk0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 2;
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                fsk0 fsk0Var = (fsk0) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (gzsVar != null) {
                    izs[] izsVarArr = {new zlu(fsk0Var, booleanValue), new agk(fsk0Var, booleanValue, i)};
                    AtomicInteger atomicInteger = new AtomicInteger(2);
                    for (int i2 = 0; i2 < 2; i2++) {
                        izsVarArr[i2].invoke(new hn9(28, atomicInteger, gzsVar));
                    }
                } else {
                    fsk0.k(fsk0Var, booleanValue, false, null, 6);
                    fsk0.i(fsk0Var, booleanValue, false, null, 6);
                }
                return s3q0.a;
            case 1:
                ((ebl0) this.c).a((PollOption) ((ibl0) this.d).m);
                return s3q0.a;
            case 2:
                dhl0 dhl0Var = (dhl0) this.c;
                Collection collection = (Collection) this.d;
                synchronized (dhl0Var.g) {
                    for (Object obj2 : collection) {
                        dhl0Var.g.put(dhl0Var.c.invoke(obj2), obj2);
                    }
                }
                return s3q0.a;
            case 3:
                wlp0 wlp0Var = (wlp0) this.c;
                wlp0<?> wlp0Var2 = (wlp0) this.d;
                wlp0Var.j.add(wlp0Var2);
                return new qmp0(wlp0Var, wlp0Var2);
            case 4:
                myc0.h((yvj) this.c, null, null, new s9v0((z4p0) obj, (wh50) this.d, null), 3);
                return s3q0.a;
            case 5:
                VkTopBar.Middle.d dVar = (VkTopBar.Middle.d) this.c;
                wh50 wh50Var = (wh50) this.d;
                tho0 tho0Var = (tho0) obj;
                int i3 = VkTopBar.I;
                wh50Var.setValue(tho0Var);
                dVar.e.invoke(tho0Var);
                return s3q0.a;
            case 6:
                lcw0 lcw0Var = (lcw0) this.c;
                m99 m99Var = (m99) this.d;
                lcw0Var.n.dispose();
                lcw0Var.n = io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.i0(m99Var.f.U(new ful0(new puq0(8))), new osk0(new zlm0(14), 16)).t0(1L), new t5n0(new g99(m99Var, 1), 4), io.reactivex.rxjava3.internal.functions.a.c), null, new fxi0(12), new h99(m99Var, 1));
                return s3q0.a;
            case 7:
                srw0 srw0Var = (srw0) this.c;
                srw0.b.C3687b c3687b = (srw0.b.C3687b) this.d;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                a3x0.p(srw0Var.a, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ALL_VIDEO_DISABLED, c3687b.a, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, bool, 1073479538);
                return s3q0.a;
            default:
                ((n1x0) this.c).h.b(new j1x0.b.C3092b((SharingReason) this.d));
                return s3q0.a;
        }
    }
}
