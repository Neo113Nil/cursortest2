package xsna;

import com.vk.video.ui.discovery.minimizable.dialog.related_videos.b;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipEditTimeScheduledCallFragment;
import com.vk.voip.ui.view.VoipActionSingleLineView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ci8;
import xsna.fh8;
import xsna.fmw0;
import xsna.giw0;
import xsna.m5x0;
import xsna.pxw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lbt0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lbt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 b;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((wv2) obj2).invoke(b.h.b);
                ((ikv0) obj).a();
                return s3q0.a;
            case 1:
                com.vk.superapp.verification.account.d dVar = ((tyv0) obj2).e;
                if (dVar != null) {
                    dVar.e0();
                }
                return s3q0.a;
            case 2:
                ((daw0) obj2).h.setRefreshing(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 3:
                ((VoipActionSingleLineView) obj2).g.setChecked(!r5.isChecked());
                return s3q0.a;
            case 4:
                cdw0 cdw0Var = (cdw0) obj2;
                fmw0 fmw0Var = (fmw0) obj;
                int i2 = cdw0.o1;
                if (!(fmw0Var instanceof fmw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                enj.r(cdw0Var.requireContext(), j03.g(cdw0Var.mo2getContext(), ((fmw0.a) fmw0Var).a, R.string.error), 0);
                return s3q0.a;
            case 5:
                ((zhw0) obj2).T(new giw0.e((VoipCallServiceBannerHandler.a) obj));
                return s3q0.a;
            case 6:
                ((dkw0) obj2).getClass();
                if (((ci8) obj) instanceof ci8.a) {
                    return new it80(fh8.b.C2873b.a);
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                int i3 = VoipEditTimeScheduledCallFragment.X;
                ((VoipEditTimeScheduledCallFragment) obj2).Q.a(pxw0.a.a);
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((o4x0) obj2).a());
            case 9:
                v5x0 v5x0Var = (v5x0) obj2;
                w5w0 w5w0Var = (w5w0) obj;
                if (epx.f(w5w0Var, va9.r)) {
                    v5x0Var.C(m5x0.j.b);
                } else {
                    v5x0Var.C(new m5x0.k(w5w0Var));
                }
                return s3q0.a;
            case 10:
                xkx0 xkx0Var = (xkx0) obj2;
                i270.a(xkx0Var.a, xkx0Var.x.b, xkx0Var.y, null);
                return s3q0.a;
            default:
                b = ((ru.mail.libverify.b0.a) obj2).b((Exception) obj);
                return b;
        }
    }
}
