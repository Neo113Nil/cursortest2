package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkFragment;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.j;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bjw0;
import xsna.c8x0;
import xsna.d1x0;
import xsna.daw0;
import xsna.gm50;
import xsna.hdw0;
import xsna.lpw0;
import xsna.o0r0;
import xsna.tj50;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class aer0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aer0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ber0) obj2).c.A(JsApiMethodType.DENY_NOTIFICATIONS, (Throwable) obj);
                return s3q0.a;
            case 1:
                com.vk.voip.ui.settings.participants_view.l lVar = (com.vk.voip.ui.settings.participants_view.l) obj2;
                CallSettingsItem.CallParticipant callParticipant = lVar.w;
                com.vk.movika.sdk.base.observable.a aVar = lVar.x;
                if (callParticipant != null && aVar != null) {
                    aVar.invoke(new j.k(callParticipant.a));
                }
                return s3q0.a;
            case 2:
                ((com.vk.video.ui.discovery.minimizable.g) obj2).C(new c.j0((com.vk.video.ui.discovery.recommendations.a) obj));
                return s3q0.a;
            case 3:
                com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b bVar = (com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b) obj2;
                ((zak0) bVar.m).setValue(g5t0.a(bVar.getViewState().getValue(), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, ((Boolean) obj).booleanValue(), null, 47));
                return s3q0.a;
            case 4:
                FragmentActivity activity = ((com.vk.superapp.browser.ui.a) obj2).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 5:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                ((wzs) obj2).invoke((String) obj, SearchInputMethod.Keyboard);
                return s3q0.a;
            case 6:
                daw0.a aVar2 = ((daw0) obj2).k;
                aVar2.getClass();
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new l9w0((VmojiProductModel) it.next(), false));
                }
                aVar2.setItems(arrayList);
                return s3q0.a;
            case 7:
                ((VoipActionMultiLineView) obj2).h.setChecked(!r13.isChecked());
                return s3q0.a;
            case 8:
                cdw0 cdw0Var = (cdw0) obj2;
                int i2 = cdw0.o1;
                gm50.a.a(cdw0Var, ((hdw0.b) obj).a, new mvl0(cdw0Var, 17));
                return s3q0.a;
            case 9:
                zhw0 zhw0Var = (zhw0) obj2;
                xiw0 xiw0Var = (xiw0) obj;
                String str = xiw0Var.a;
                String str2 = xiw0Var.b;
                cjw0 cjw0Var = zhw0Var.i;
                ArrayList arrayList2 = xiw0Var.c;
                cjw0Var.getClass();
                zhw0Var.T(new kiw0(str, str2, cjw0.d(arrayList2)));
                return s3q0.a;
            case 10:
                return new bjw0.e(((tj50.a) obj).a(new uiw0(1, (viw0) obj2, viw0.class, "composeSearchState", "composeSearchState(Lcom/vk/voip/ui/calls/presentation/model/state/VoipCallServiceState$Search;)Ljava/util/List;", 0), ao8.d));
            case 11:
                bi8 bi8Var = ((dkw0) obj2).e;
                di8 di8Var = (di8) ((it80) obj).a;
                if (!bi8Var.m) {
                    throw new IllegalStateException("Instance is destroyed");
                }
                if (!epx.f(bi8Var.k, di8Var)) {
                    bi8Var.k = di8Var;
                    bi8Var.b(di8Var);
                    bi8Var.n = false;
                }
                return s3q0.a;
            case 12:
                vlw0 vlw0Var = (vlw0) obj2;
                vlw0Var.k.b(vlw0Var.V(null));
                return s3q0.a;
            case 13:
                VoipHistoryFriendsFragment voipHistoryFriendsFragment = (VoipHistoryFriendsFragment) obj2;
                lpw0 lpw0Var = (lpw0) obj;
                int i3 = VoipHistoryFriendsFragment.U;
                if (lpw0Var instanceof lpw0.b) {
                    new VoipCallByLinkFragment().Fn(voipHistoryFriendsFragment.In(), "VoipCallByLinkFragment");
                } else if (lpw0Var instanceof lpw0.c) {
                    o0r0 e = xwk.e();
                    Context requireContext = voipHistoryFriendsFragment.requireContext();
                    UserId b = com.vk.voip.userid.a.b(((lpw0.c) lpw0Var).a);
                    if (b == null) {
                        return s3q0.a;
                    }
                    e.m(requireContext, b, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else {
                    if (!(lpw0Var instanceof lpw0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zls a = ams.a();
                    Context requireContext2 = voipHistoryFriendsFragment.requireContext();
                    lpw0.a aVar3 = (lpw0.a) lpw0Var;
                    UserId b2 = com.vk.voip.userid.a.b(aVar3.a);
                    if (b2 == null) {
                        return s3q0.a;
                    }
                    a.d(requireContext2, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY_FRIENDS_LIST, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_FRIENDS), b2, aVar3.b);
                }
                return s3q0.a;
            case 14:
                ((nrw0) obj2).q(xcw0.g0.a);
                return s3q0.a;
            case 15:
                return new d1x0.a(((tj50.a) obj).a(new a1x0(1, ((b1x0) obj2).d, y0x0.class, "toViewState", "toViewState(Lcom/vk/voip/ui/watchmovie/selectsource/tabs/feature/VoipSelectVideoTabState;)Lcom/vk/voip/ui/watchmovie/selectsource/tabs/VoipSelectVideoTabViewState$ScreenState$Content;", 0), ao8.d));
            default:
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.x.onNext(new c8x0.f(0));
                ((g8x0) obj2).g = false;
                return s3q0.a;
        }
    }
}
