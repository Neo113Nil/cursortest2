package xsna;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.common.view.EditText;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.bij0;
import xsna.gm50;
import xsna.gyw0;
import xsna.ifk0;
import xsna.iyw0;
import xsna.jto0;
import xsna.plw0;
import xsna.sum0;
import xsna.yks0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class whi0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ whi0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i2 = yhi0.f1;
                view.setEnabled(false);
                yhi0.Zn(drm0.p0(((EditText) obj2).getText().toString()).toString(), new hj60((yhi0) obj3, 24), new f550(view, 25));
                break;
            case 1:
                UIBlockActionFilter uIBlockActionFilter = ((bij0.d) obj2).a;
                String str = uIBlockActionFilter.z.b;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeVideoKidsAgeFilterSelect(str), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                bij0.b bVar = ((bij0.e) obj3).m;
                bVar.a.a(uIBlockActionFilter, false);
                bVar.b.invoke();
                break;
            case 2:
                pbl0 pbl0Var = (pbl0) obj3;
                val0 val0Var = ((wbl0) obj2).l;
                pbl0Var.a((val0Var != null ? val0Var : null).b);
                break;
            case 3:
                ((wd3) obj3).invoke(((ifk0.a) obj).b);
                dw20 dw20Var = ((fml0) obj2).b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            case 4:
                ((Boolean) obj).getClass();
                ((izs) obj3).invoke(sum0.d.a((sum0.d) obj2, null, null, null, !r6.d, null, false, null, false, 0, null, false, false, 4087));
                break;
            case 5:
                ((kwm0) obj3).a.b(new kym0(SubscribeStatus.FRIEND_STATUS_NOT_FRIENDS, (UserId) obj2, null, Peer.Type.USER, 4));
                break;
            case 6:
                com.vk.superapp.ui.a aVar = (com.vk.superapp.ui.a) obj3;
                Activity activity = (Activity) obj2;
                SelectedDataSource selectedDataSource = (SelectedDataSource) obj;
                if (selectedDataSource != SelectedDataSource.UNKNOWN) {
                    aVar.g.g(new e9q0(activity, VkStepsSyncReason.WIDGET_UPDATE, selectedDataSource));
                }
                break;
            case 7:
                ((i0b0) obj3).invoke(jto0.b.a((jto0.b) obj2, null, null, null, null, false, null, false, false, false, false, null, false, false, false, null, ((Boolean) obj).booleanValue(), OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND));
                break;
            case 8:
                yks0 yks0Var = (yks0) obj3;
                yg5 yg5Var = (yg5) obj2;
                VideoFile videoFile = (VideoFile) obj;
                yks0Var.j(videoFile);
                String r = yg5Var.A().r();
                yg5Var.N(videoFile);
                yg5Var.A().setTrackCode(r);
                Iterator<T> it = yks0Var.f.iterator();
                while (it.hasNext()) {
                    ((yks0.a) it.next()).He(EmptyList.b, videoFile);
                }
                break;
            case 9:
                ykw0 ykw0Var = (ykw0) obj3;
                olw0 olw0Var = (olw0) obj2;
                plw0.b bVar2 = (plw0.b) obj;
                int i3 = ykw0.j1;
                gm50.a.a(ykw0Var, bVar2.a, new zkw0(1, olw0Var, olw0.class, "accept", "accept(Lcom/vk/voip/calls/join/impl/presentation/link/bypassword/ui/state/VoipCallsJoinToCallByPasswordViewState$Link;)V", 0));
                gm50.a.a(ykw0Var, bVar2.b, new alw0(1, olw0Var, olw0.class, "accept", "accept(Lcom/vk/voip/calls/join/impl/presentation/link/bypassword/ui/state/VoipCallsJoinToCallByPasswordViewState$Password;)V", 0));
                gm50.a.a(ykw0Var, bVar2.c, new blw0(1, olw0Var, olw0.class, "accept", "accept(Lcom/vk/voip/calls/join/impl/presentation/link/bypassword/ui/state/VoipCallsJoinToCallByPasswordViewState$Button;)V", 0));
                break;
            case 10:
                int i4 = otw0.i1;
                ((izs) obj3).invoke(Boolean.valueOf(!((SwitchCompat) obj2).isChecked()));
                break;
            default:
                cyw0 cyw0Var = (cyw0) obj3;
                iyw0.a aVar2 = (iyw0.a) obj;
                boolean z = !aVar2.d;
                cyw0Var.T(new gyw0.e(z));
                cyw0.V(cyw0Var, null, null, Boolean.valueOf(z), null, null, null, null, null, null, aVar2, 507);
                break;
        }
        return s3q0.a;
    }
}
