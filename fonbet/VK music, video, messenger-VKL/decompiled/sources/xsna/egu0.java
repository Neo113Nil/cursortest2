package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.report.dialog.VoipReportSuspiciousCallActivity;
import com.vk.voip.ui.report.dialog.VoipReportSuspiciousCallActivity.a;
import xsna.l5x0;
import xsna.l5x0.c;
import xsna.rhw0;
import xsna.shw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class egu0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ egu0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Void A;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ggu0) obj).b;
            case 1:
                qro0.c(new u7v0((pvv0) obj, 1));
                return s3q0.a;
            case 2:
                lcw0 lcw0Var = (lcw0) obj;
                lcw0Var.g.a(vv3.a);
                lcw0Var.a.dismiss();
                return s3q0.a;
            case 3:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i2 = VoipCallServiceFragment.Y;
                rhw0.i iVar = new rhw0.i(shw0.c.a);
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, iVar);
                return s3q0.a;
            case 4:
                mjw0 mjw0Var = (mjw0) obj;
                mjw0Var.r.bringToFront();
                FrameLayout frameLayout = mjw0Var.o;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -1;
                layoutParams.height = -1;
                frameLayout.setLayoutParams(layoutParams);
                return s3q0.a;
            case 5:
                int i3 = VoipReportSuspiciousCallActivity.q;
                return ((VoipReportSuspiciousCallActivity) obj).new a();
            case 6:
                l5x0 l5x0Var = (l5x0) obj;
                l5x0Var.a.getClass();
                z0w0 a = com.vk.voip.ui.c.R().a();
                l5x0.c cVar = l5x0Var.new c();
                a.getClass();
                return new vnw0(cVar);
            default:
                A = ((ru.mail.libverify.api.s) obj).A();
                return A;
        }
    }
}
