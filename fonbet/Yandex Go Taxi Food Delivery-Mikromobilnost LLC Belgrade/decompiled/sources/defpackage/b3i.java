package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.delivery.tracking.courier_chat.DeliveryCourierChatModalView;
import com.yandex.go.superapp.web_chat.ui.EatsOrderWebChatModalView;
import com.yandex.messenger.websdk.api.WebMessenger;

/* loaded from: classes12.dex */
public final class b3i extends k0p {
    public final /* synthetic */ int H = 0;
    public final w030 I;
    public final FragmentActivity J;
    public final boolean K;
    public final Object L;
    public final Object M;

    public b3i(FragmentActivity fragmentActivity, h3y h3yVar, w030 w030Var, apf apfVar) {
        super(3);
        this.J = fragmentActivity;
        this.L = h3yVar;
        this.I = w030Var;
        this.M = apfVar;
        this.K = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.H) {
        }
        return this.I;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.H) {
        }
        return this.K;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i = this.H;
        Object obj2 = this.M;
        switch (i) {
            case 0:
                y2i y2iVar = (y2i) obj;
                a3i a3iVar = new a3i(this);
                apf apfVar = (apf) obj2;
                y2iVar.getClass();
                apfVar.getClass();
                FragmentActivity fragmentActivity = (FragmentActivity) apfVar.b;
                q5z.h(fragmentActivity);
                pho phoVar = (pho) apfVar.c;
                q5z.h(phoVar);
                z2i z2iVar = new z2i(y2iVar, new j0g(new pj(phoVar), new o61(phoVar)), a3iVar);
                pav pavVar = (pav) apfVar.w;
                q5z.h(pavVar);
                k7x0 k7x0Var = (k7x0) apfVar.x;
                q5z.h(k7x0Var);
                return new DeliveryCourierChatModalView(fragmentActivity, z2iVar, pavVar, k7x0Var);
            default:
                rfn rfnVar = (rfn) obj;
                ybn ybnVar = new ybn(rfnVar.b, rfnVar.c, rfnVar.d, rfnVar.e);
                am2 am2Var = ((acn) obj2).a;
                return new EatsOrderWebChatModalView(this.J, new zbn((wpy0) ((jv21) am2Var.a).get(), (yi7) ((xvf0) am2Var.b).get(), ybnVar, (pwy0) ((xvf0) am2Var.c).get()));
        }
    }

    @Override // defpackage.k0p
    public final FragmentActivity T() {
        switch (this.H) {
        }
        return this.J;
    }

    @Override // defpackage.k0p
    public final Fragment U(Object obj) {
        int i = this.H;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                y2i y2iVar = (y2i) obj;
                return WebMessenger.c((WebMessenger) ((h3y) obj2).get(), y2iVar.b(), y2iVar.c(), 4);
            default:
                return WebMessenger.c((WebMessenger) obj2, new f8b(((rfn) obj).a), null, 6);
        }
    }

    public b3i(w030 w030Var, FragmentActivity fragmentActivity, WebMessenger webMessenger, acn acnVar) {
        super(3);
        this.I = w030Var;
        this.J = fragmentActivity;
        this.L = webMessenger;
        this.M = acnVar;
        this.K = true;
    }
}
