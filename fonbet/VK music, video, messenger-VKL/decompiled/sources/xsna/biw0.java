package xsna;

import com.vk.log.L;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import xsna.e2x0;
import xsna.fmw0;
import xsna.ghw0;
import xsna.gm50;
import xsna.rhw0;
import xsna.spw0;
import xsna.xcw0;
import xsna.xn50;
import xsna.ytw0;
import xsna.zh8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class biw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ biw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj2;
                int i2 = VoipCallServiceFragment.Y;
                rhw0.b0 b0Var = rhw0.b0.b;
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, b0Var);
                break;
            case 1:
                ((mjw0) obj2).T0.d.a(ghw0.s.a);
                break;
            case 2:
                akw0 akw0Var = (akw0) obj2;
                if (!((zh8.b) obj).a) {
                    l7s l7sVar = akw0Var.a;
                    ng8 ng8Var = new ng8(l7sVar.getString(R.string.voip_broadcast), l7sVar.getString(R.string.voip_broadcast_label_stats), 1012);
                    int i3 = StreamInfoFragment.S;
                    StreamInfoFragment.a.a(akw0Var.b, ng8Var);
                }
                break;
            case 3:
                ((vlw0) obj2).m.b(new fmw0.a((Throwable) obj));
                break;
            case 4:
                ((kpw0) obj2).T(new spw0.a.C3685a((Throwable) obj));
                break;
            case 5:
                ((nrw0) obj2).q(xcw0.o.a);
                break;
            case 6:
                stw0 stw0Var = (stw0) obj2;
                Throwable th = (Throwable) obj;
                stw0Var.T(new ytw0.c(false));
                stw0Var.T(new ytw0.b(th));
                L.C("VoipParticipantSettingsFeature", th);
                break;
            case 7:
                ((gvw0) obj2).g = false;
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                break;
            case 8:
                d2x0 d2x0Var = (d2x0) obj2;
                int i4 = d2x0.j1;
                gm50.a.a(d2x0Var, ((e2x0.b) obj).a, new egt0(d2x0Var, 14));
                break;
            default:
                Object obj3 = ((vkx0) obj2).o;
                if (obj3 == null) {
                    obj3 = null;
                }
                ((skx0) obj3).C();
                break;
        }
        return s3q0.a;
    }
}
