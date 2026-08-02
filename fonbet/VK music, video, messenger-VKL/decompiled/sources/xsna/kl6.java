package xsna;

import com.vk.masks.MasksController;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import xsna.bre;
import xsna.ol6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kl6 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kl6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((ol6.d) this.c).invoke(obj);
                return;
            case 1:
                az2 az2Var = (az2) this.c;
                int i = CallParticipantsFragment.W;
                az2Var.invoke(obj);
                return;
            case 2:
                ((g20) this.c).invoke(obj);
                return;
            case 3:
                ((jm0) this.c).invoke(obj);
                return;
            case 4:
                xyb xybVar = (xyb) this.c;
                Throwable th = (Throwable) obj;
                xyb.C.a(th);
                xybVar.q = zyb.a(xybVar.q, null, false, false, null, false, th, 951);
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    xybVar.a1(azbVar);
                    return;
                }
                return;
            case 5:
                ((az2) this.c).invoke(obj);
                return;
            case 6:
                ((rge) this.c).invoke(obj);
                return;
            case 7:
                jm0 jm0Var = (jm0) this.c;
                bre.b bVar = bre.s1;
                jm0Var.invoke(obj);
                return;
            case 8:
                ((q45) this.c).invoke(obj);
                return;
            case 9:
                ((tb4) this.c).invoke(obj);
                return;
            case 10:
                ((jm0) this.c).invoke(obj);
                return;
            case 11:
                ((dkg) this.c).invoke(obj);
                return;
            case 12:
                ((s6k) this.c).invoke(obj);
                return;
            case 13:
                ((jm0) this.c).invoke(obj);
                return;
            case 14:
                ((o1g) this.c).invoke(obj);
                return;
            case 15:
                ((tcn) this.c).invoke(obj);
                return;
            case 16:
                ((tb4) this.c).invoke(obj);
                return;
            case 17:
                ((az2) this.c).invoke(obj);
                return;
            case 18:
                ((az2) this.c).invoke(obj);
                return;
            case 19:
                ((com.vk.movika.sdk.base.logic.processor.d) this.c).invoke(obj);
                return;
            case 20:
                ((tb4) this.c).invoke(obj);
                return;
            case 21:
                ((zlu) this.c).invoke(obj);
                return;
            case 22:
                ((tb4) this.c).invoke(obj);
                return;
            case 23:
                ((tcn) this.c).invoke(obj);
                return;
            case 24:
                MasksController masksController = (MasksController) this.c;
                masksController.h = null;
                synchronized (masksController) {
                    masksController.i = null;
                }
                return;
            case 25:
                ((ui10) this.c).invoke(obj);
                return;
            case 26:
                ((tcn) this.c).invoke(obj);
                return;
            case 27:
                ((p330) this.c).invoke(obj);
                return;
            case 28:
                ((tcn) this.c).invoke(obj);
                return;
            default:
                ((mea) this.c).invoke(obj);
                return;
        }
    }
}
