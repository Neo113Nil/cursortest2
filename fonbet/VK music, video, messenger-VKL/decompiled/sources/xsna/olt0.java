package xsna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.money.createtransfer.people.VkPayInfo;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vkontakte.android.R;
import xsna.cvw0;
import xsna.lgw0;
import xsna.nqw0;
import xsna.owm;
import xsna.pxw0;
import xsna.tj50;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class olt0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ olt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                plt0 plt0Var = (plt0) obj2;
                l8l l8lVar = (l8l) obj;
                ejp0 ejp0Var = (ejp0) plt0Var.e.a;
                Integer num = plt0Var.m;
                ejp0Var.k.add(pq20.d(l8lVar, num != null ? num.intValue() : 0));
                return s3q0.a;
            case 1:
                uxt0 uxt0Var = (uxt0) obj2;
                Context context = ((ViewGroup) obj).getContext();
                int i2 = uxt0Var.c;
                ClipFeedTab clipFeedTab = uxt0Var.f.a;
                zof zofVar = uxt0Var.t;
                ClipsViewerComponentImpl clipsViewerComponentImpl = uxt0Var.p;
                vp00 vp00Var = new vp00(context, i2, clipFeedTab, zofVar, clipsViewerComponentImpl.pe(), uxt0Var.k, clipsViewerComponentImpl.Mf(), (kp00) uxt0Var.Z.getValue(), uxt0Var.r, (uvx) uxt0Var.b0.getValue(), uxt0Var.c0, uxt0Var.F);
                vp00Var.m.b();
                return vp00Var;
            case 2:
                ((q9u0) obj2).O(owm.c.b);
                return Boolean.TRUE;
            case 3:
                ccv0 ccv0Var = (ccv0) obj2;
                izs<VkPayInfo, s3q0> izsVar = ccv0Var.p;
                fcv0 fcv0Var = ccv0Var.r;
                throw null;
            case 4:
                ngw0 ngw0Var = (ngw0) obj2;
                int i3 = ngw0.n1;
                lgw0.c cVar = lgw0.c.b;
                ngw0Var.getClass();
                xn50.a.c(ngw0Var, cVar);
                return s3q0.a;
            case 5:
                int i4 = VoipCreateScheduleCallFragment.S;
                ((VoipCreateScheduleCallFragment) obj2).Q.a(new pxw0.b((ScheduledAudioMuteOption) obj));
                return s3q0.a;
            case 6:
                ((drw0) obj2).d.invoke(nqw0.c.b);
                return s3q0.a;
            case 7:
                zuw0 zuw0Var = (zuw0) obj2;
                tj50.a aVar = (tj50.a) obj;
                yuw0 yuw0Var = new yuw0(1, zuw0Var.e, uuw0.class, "toViewState", "toViewState(Lcom/vk/voip/ui/history/past/presentation/model/state/VoipPastCallsState$Content;)Lcom/vk/voip/ui/call_list/common/ui/state/CallListViewState;", 0);
                ao8 ao8Var = ao8.d;
                return new cvw0.a(aVar.a(yuw0Var, ao8Var), aVar.a(new lyl0(zuw0Var, 24), ao8Var));
            case 8:
                c2x0 c2x0Var = (c2x0) obj2;
                View view = c2x0Var.h1;
                if (view != null) {
                    bwt0.p0(view, false);
                }
                View view2 = c2x0Var.i1;
                if (view2 != null) {
                    bwt0.p0(view2, false);
                }
                View view3 = c2x0Var.j1;
                if (view3 != null) {
                    bwt0.p0(view3, true);
                }
                View view4 = c2x0Var.g1;
                if (view4 != null) {
                    view4.setEnabled(false);
                }
                return s3q0.a;
            case 9:
                o7x0 o7x0Var = (o7x0) obj2;
                ikv0 ikv0Var = o7x0Var.f;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                try {
                    Intent intent = new Intent("android.net.vpn.SETTINGS");
                    intent.setFlags(268435456);
                    o7x0Var.a.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    cvk.u(R.string.vk_error, false);
                }
                return s3q0.a;
            default:
                ((com.vk.superapp.widget_settings.p004new.b) obj2).e.onNext(Boolean.TRUE);
                return s3q0.a;
        }
    }
}
