package xsna;

import android.view.ViewGroup;
import com.vk.dto.masks.Mask;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.fmw0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class wlw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wlw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ylw0 ylw0Var = (ylw0) obj2;
                fmw0 fmw0Var = (fmw0) obj;
                int i2 = ylw0.x1;
                if (!(fmw0Var instanceof fmw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                enj.r(ylw0Var.requireContext(), j03.g(ylw0Var.mo2getContext(), ((fmw0.a) fmw0Var).a, R.string.error), 0);
                return s3q0.a;
            case 1:
                vnw0 vnw0Var = (vnw0) obj2;
                Mask mask = (Mask) obj;
                qh10 qh10Var = vnw0Var.b;
                qh10Var.b.b(qh10Var.a.g(mask).subscribe(new jz(new a5(13, mask, new lyb0(7, vnw0Var, mask)), 24)));
                return s3q0.a;
            case 2:
                muw0 muw0Var = (muw0) obj2;
                return new kuw0((ViewGroup) obj, muw0Var.i, muw0Var.k);
            case 3:
                return new VoipScheduleCallViewState.a(((tj50.a) obj).a(new vww0(1, ((www0) obj2).e, kww0.class, "toViewState", "toViewState(Lcom/vk/voip/ui/scheduled/creation/feature/VoipScheduleCallState;)Lcom/vk/voip/ui/scheduled/creation/ui/VoipScheduleCallViewState$ScreenState;", 0), ao8.d));
            default:
                ((xkx0) obj2).B0();
                return s3q0.a;
        }
    }
}
