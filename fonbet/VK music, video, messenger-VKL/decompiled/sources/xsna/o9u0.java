package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.vk.dto.common.Peer;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import xsna.bwm;
import xsna.mwv;

/* compiled from: VkAppDialogsToolbarComponent.kt */
/* loaded from: classes18.dex */
public final class o9u0 extends yj50<hwm, pwm, owm, q9u0, Object, kwm, lwm> {
    public final MultiComponentFragment n;
    public final com.vk.dialogsscreen.impl.a o;
    public final b25 p;
    public final fwm q;
    public final mwv<mwv.a> r;

    public o9u0(MultiComponentFragment multiComponentFragment, com.vk.dialogsscreen.impl.a aVar, b25 b25Var, fwm fwmVar, mwv mwvVar) {
        super(multiComponentFragment, multiComponentFragment, owm.class, true);
        this.n = multiComponentFragment;
        this.o = aVar;
        this.p = b25Var;
        this.q = fwmVar;
        this.r = mwvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r2.Ab(r1) != false) goto L15;
     */
    @Override // xsna.yj50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hwm a(Bundle bundle) {
        bwm q1tVar;
        ww50<?> Y;
        com.vk.dialogsscreen.impl.a aVar = this.o;
        Peer q = aVar.a.q();
        q.getClass();
        Peer.Type type = Peer.Type.GROUP;
        boolean Ab = q.Ab(type);
        di3 di3Var = aVar.f;
        a1w a1wVar = aVar.a;
        io.reactivex.rxjava3.core.q<a1s> qVar = aVar.i;
        MultiComponentFragment multiComponentFragment = this.n;
        multiComponentFragment.requireContext();
        b25 b25Var = this.p;
        mwm mwmVar = new mwm(b25Var, a1wVar, qVar);
        ko8 ko8Var = aVar.g;
        d7p d7pVar = aVar.h;
        LayoutInflater.Factory kn = multiComponentFragment.kn();
        ey50 ey50Var = kn instanceof ey50 ? (ey50) kn : null;
        boolean z = false;
        if (!((ey50Var == null || (Y = ey50Var.Y()) == null) ? false : Y.D(multiComponentFragment, false))) {
            Peer q2 = a1wVar.q();
            q2.getClass();
        }
        z = true;
        if (z) {
            Peer q3 = a1wVar.q();
            q3.getClass();
            q1tVar = q3.Ab(type) ? new q1t(a1wVar) : new cwm(a1wVar, b25Var);
        } else {
            q1tVar = bwm.a.a;
        }
        return new hwm(di3Var, mwmVar, ko8Var, d7pVar, q1tVar, this.r, aVar.i, Ab);
    }

    @Override // xsna.yj50
    public final lwm b() {
        return new lwm(this.n.requireContext(), this.o);
    }

    @Override // xsna.yj50
    public final q9u0 d() {
        ImFeatures imFeatures = ImFeatures.REDESIGN_TOPBAR_VKUI;
        imFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(imFeatures);
        int i = a ? R.layout.vk_app_dialogs_toolbar : R.layout.vk_app_dialogs_toolbar_legacy;
        n9u0 n9u0Var = new n9u0(this);
        MultiComponentFragment multiComponentFragment = this.n;
        MultiComponentFragment multiComponentFragment2 = multiComponentFragment != null ? multiComponentFragment : null;
        mbs mbsVar = multiComponentFragment2 != null ? multiComponentFragment2.D : null;
        multiComponentFragment.requireContext();
        return new q9u0(i, this.q, mbsVar, a, n9u0Var);
    }
}
