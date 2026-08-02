package xsna;

import android.location.Location;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.articles.ArticleFragment;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.music.Genre;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.fcmerrorhandler.debug.FcmErrorsDebug;
import com.vk.log.L;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bhd;
import xsna.ltq;
import xsna.m1j;
import xsna.n610;
import xsna.nxz;
import xsna.tj50;
import xsna.xwg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class b40 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ b40(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 10;
        switch (this.b) {
            case 0:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 1:
                int i2 = ArticleFragment.E0;
                new dqu();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d)).e;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 2:
                Integer num = (Integer) obj;
                return new nd4(num != null && num.intValue() == 1);
            case 3:
                return (com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d) obj;
            case 4:
                return Boolean.valueOf(((ChannelActionInProgress) obj) != ChannelActionInProgress.NONE);
            case 5:
                return s3q0.a;
            case 6:
                int i3 = tzc.b;
                return new RLottieDrawable((String) obj, "HEART_ANIMATION_NAME", i3, i3, null, false, false, null, 496);
            case 7:
                tj50.a aVar = (tj50.a) obj;
                int i4 = 11;
                com.vk.movika.sdk.base.observable.e0 e0Var = new com.vk.movika.sdk.base.observable.e0(i4);
                ao8 ao8Var = ao8.d;
                return new bhd.a(aVar.a(e0Var, ao8Var), aVar.a(new tr0(3), ao8Var), aVar.a(new d40(i), ao8Var), aVar.a(new ur0(6), ao8Var), aVar.a(new vr0(i4), ao8Var));
            case 8:
                qgi0.r((tgi0) obj, "COMMON_GRID_TOOLBAR_BACK_BUTTON_TEST_TAG");
                return s3q0.a;
            case 9:
                int i5 = ClipsTemplateEditorFragmentsBottomView.j;
                return Boolean.valueOf(((o7f) obj).d);
            case 10:
                qgi0.r((tgi0) obj, "CommunityChannelTitle");
                return s3q0.a;
            case 11:
                return new xwg.c(((tj50.a) obj).a(new d40(18), ao8.d));
            case 12:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 13:
                return m1j.a.a;
            case 14:
                int i6 = 15;
                qeh0 qeh0Var = new qeh0(new pr1(i6), new pr1(i6));
                qcy<Object>[] qcyVarArr = qgi0.a;
                sgi0<qeh0> sgi0Var = ngi0.v;
                qcy<Object> qcyVar = qgi0.a[12];
                ((tgi0) obj).a(sgi0Var, qeh0Var);
                return s3q0.a;
            case 15:
                String[] strArr = DebugDevSettingsFragment.t0;
                Throwable th = new Throwable(String.valueOf((FcmErrorsDebug) obj));
                ptq ptqVar = q6x.n;
                if (ptqVar != null) {
                    ptqVar.getClass();
                    if (th.getMessage() != null) {
                        ltq.a a = ttq.b(th).a();
                        i35 i35Var = new i35();
                        ltq ltqVar = ltq.this;
                        ltqVar.b = i35Var;
                        ltq.a aVar2 = ltqVar.e;
                        pq3 pq3Var = new pq3();
                        ltq ltqVar2 = ltq.this;
                        ltqVar2.d = pq3Var;
                        ltqVar2.e.a();
                    }
                }
                return null;
            case 16:
                String str = ((Genre) obj).c;
                return str == null ? "" : str;
            case 17:
                androidx.media3.common.a aVar3 = (androidx.media3.common.a) obj;
                String str2 = aVar3.a;
                return new one.video.player.tracks.c(str2 != null ? str2 : "", fr10.d(aVar3), true);
            case 18:
                iqq iqqVar = (iqq) obj;
                List<FaveItem> list = iqqVar.a;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (FaveItem faveItem : list) {
                    gnq.a.getClass();
                    arrayList.add(new FaveEntry(faveItem, true, gnq.b(faveItem.f)));
                }
                return new crq(arrayList, null, iqqVar.d);
            case 19:
                a5w a5wVar = (a5w) obj;
                return a5wVar.t3() + " : " + com.vk.im.engine.models.im_item.b.a(a5wVar.y9());
            case 20:
                L.i((Throwable) obj);
                cvk.u(R.string.error, false);
                return s3q0.a;
            case 21:
                Pair pair = (Pair) obj;
                return ((String) pair.i()) + ':' + ((Number) pair.j()).intValue();
            case 22:
                String str3 = nxz.q;
                return GeoLocation.zb(nxz.b.a(nxz.b.b((Location) obj)), -1, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, null, 8190);
            case 23:
                tj50.a aVar4 = (tj50.a) obj;
                quz quzVar = new quz(2);
                ao8 ao8Var2 = ao8.d;
                return new n610.a(aVar4.a(quzVar, ao8Var2), aVar4.a(fnb.d, ao8Var2));
            case 24:
                return ((tam0) obj).a;
            case 25:
                k720.B = null;
                L.i((Throwable) obj);
                return s3q0.a;
            case 26:
                return ((e430) obj).c;
            case 27:
                Integer num2 = (Integer) obj;
                num2.intValue();
                return num2;
            case 28:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            default:
                h03.b((Throwable) obj);
                return s3q0.a;
        }
    }
}
