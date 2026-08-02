package xsna;

import android.content.Context;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.voip.ui.report.dialog.VoipReportSuspiciousCallActivity;
import xsna.v1t0;
import xsna.yx50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sh1 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sh1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                th1 th1Var = (th1) this.c;
                th1Var.b.b(i.j.a);
                th1Var.b.b(i.C1485i.a);
                break;
            case 1:
                i0q0.e(new g0((yx50.d) this.c, 17));
                break;
            case 2:
                ni60 ni60Var = (ni60) this.c;
                ((NewsFeedComponent) ni60Var.h.getValue()).w().g((rt60) ni60Var.i.getValue());
                ni60Var.s().g(ni60Var.k);
                ni60Var.s().g(ni60Var.j);
                ni60Var.s().g(ni60Var.l);
                ni60Var.s().g(ni60Var.m);
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                enj.s(context, ni60Var.n);
                break;
            case 3:
                k0p0 k0p0Var = (k0p0) this.c;
                k0p0Var.e.b(new v1t0.b(false));
                break;
            default:
                VoipReportSuspiciousCallActivity voipReportSuspiciousCallActivity = (VoipReportSuspiciousCallActivity) this.c;
                dw20 dw20Var = voipReportSuspiciousCallActivity.l;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                voipReportSuspiciousCallActivity.finish();
                break;
        }
    }
}
