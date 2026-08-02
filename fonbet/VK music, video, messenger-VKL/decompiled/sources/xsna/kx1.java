package xsna;

import com.vk.uxpolls.api.models.UxPollsAnswer;
import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.presentation.view.PollsWebView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.gx1;

/* compiled from: AnalyticsControllerImpl.kt */
/* loaded from: classes6.dex */
public final class kx1 {
    public final PollsWebView a;
    public com.vk.uxpolls.presentation.js.model.a b;
    public final bpn0 c = new bpn0(new com.vk.movika.sdk.base.ui.o0(2));
    public final bpn0 d = new bpn0(new lk(1));
    public final bpn0 e = new bpn0(new com.vk.movika.sdk.base.logic.interactor.l(2));

    public kx1(PollsWebView pollsWebView) {
        this.a = pollsWebView;
    }

    public final void a(gx1 gx1Var) {
        String a;
        com.vk.uxpolls.presentation.js.model.a aVar;
        UxPollsPoll uxPollsPoll;
        String str;
        String a2;
        com.vk.uxpolls.presentation.js.model.a aVar2;
        UxPollsPoll uxPollsPoll2;
        String str2;
        UxPollsPoll uxPollsPoll3;
        String str3;
        boolean z = gx1Var instanceof gx1.b;
        PollsWebView pollsWebView = this.a;
        if (z) {
            List<UxPollsAnswer> list = ((gx1.b) gx1Var).a;
            com.vk.uxpolls.presentation.js.model.a aVar3 = this.b;
            if (aVar3 == null || (uxPollsPoll3 = aVar3.a) == null || (str3 = (String) j5g.a0(uxPollsPoll3.f())) == null) {
                return;
            }
            myc0.h(vwt0.a(pollsWebView), l4r0.c, null, new ix1(this, uxPollsPoll3, str3, list, null), 2);
            return;
        }
        if (gx1Var instanceof gx1.c) {
            d4e0 d4e0Var = l4r0.b;
            if (d4e0Var == null || (a2 = d4e0Var.a()) == null || (aVar2 = this.b) == null || (uxPollsPoll2 = aVar2.a) == null || (str2 = (String) j5g.a0(uxPollsPoll2.f())) == null) {
                return;
            }
            ((v5r0) this.e.getValue()).a.l();
            s3q0 s3q0Var = s3q0.a;
            myc0.h(vwt0.a(pollsWebView), l4r0.c, null, new jx1(this, uxPollsPoll2, str2, a2, null, null), 2);
            return;
        }
        if (!(gx1Var instanceof gx1.a)) {
            throw new NoWhenBranchMatchedException();
        }
        d4e0 d4e0Var2 = l4r0.b;
        if (d4e0Var2 == null || (a = d4e0Var2.a()) == null || (aVar = this.b) == null || (uxPollsPoll = aVar.a) == null || (str = (String) j5g.a0(uxPollsPoll.f())) == null) {
            return;
        }
        myc0.h(vwt0.a(pollsWebView), l4r0.c, null, new hx1(this, uxPollsPoll, str, a, null, null), 2);
    }
}
