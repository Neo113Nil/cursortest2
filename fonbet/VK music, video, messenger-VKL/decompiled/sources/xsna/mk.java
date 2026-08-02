package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.auth.verification.libverify.LibverifyPresenter;
import com.vk.catalog2.feature.music.holders.ComposeMusicActionPlayAudiosFromBlockIdVh;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.common.Direction;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonView;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.List;
import xsna.hyn;
import xsna.ksf;
import xsna.rv9;
import xsna.sx40;
import xsna.xn50;
import xsna.z0o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class mk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mk(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ByteStringDataSource initialize$lambda$220$lambda$21;
        int i = this.b;
        boolean z = false;
        Rect rect = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) obj2;
                Collection<CallMemberId> collection = (Collection) obj;
                accessibilityEvents.c("usersStopMovie(" + collection.size() + ')');
                accessibilityEvents.b(AccessibilityEvents.Event.MOVIE_STOPPED, AccessibilityEvents.Event.MOVIE_STARTED, collection);
                return s3q0.a;
            case 1:
                ((izs) obj2).invoke(new rv9.i.d((a.C0919a) obj));
                return s3q0.a;
            case 2:
                ((oyd) obj2).b((Context) obj);
                return s3q0.a;
            case 3:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj;
                int i2 = ClipsWrapperFragment.Q0;
                npf npfVar = ((ksf.b) ((ksf) obj2)).b;
                if (npfVar != null) {
                    clipsWrapperFragment.getClass();
                    xn50.a.c(clipsWrapperFragment, npfVar);
                }
                return s3q0.a;
            case 4:
                nek0 nek0Var = (nek0) obj2;
                vvr vvrVar = (vvr) obj;
                if (nek0Var != null) {
                    nek0Var.show();
                }
                vvrVar.y(false);
                return s3q0.a;
            case 5:
                ((d3h) obj2).h((String) obj, true);
                return s3q0.a;
            case 6:
                cih cihVar = (cih) obj2;
                return new chh(cihVar.a, cihVar.b, cihVar.c, cihVar.d, (po5) obj, cihVar.f);
            case 7:
                h7m h7mVar = (h7m) obj;
                return new nrh((com.vk.im.engine.models.c) ((ynh) obj2).s0.getValue(), new nhe(h7mVar, 6), new zt4(h7mVar, 22));
            case 8:
                ((ComposeMusicActionPlayAudiosFromBlockIdVh) obj2).onClick((View) obj);
                return s3q0.a;
            case 9:
                z0o.a aVar = (z0o.a) obj2;
                Rect rect2 = (Rect) obj;
                Rect rect3 = aVar.p;
                if (rect3 != null) {
                    Rect c = f4m.c(aVar.itemView);
                    rect = new Rect(rect3);
                    rect.offset(c.left, c.top);
                }
                return rect == null ? rect2 : rect;
            case 10:
                ((izs) obj2).invoke((String) obj);
                return s3q0.a;
            case 11:
                Long l = (Long) obj2;
                String str = (String) obj;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge != null ? superappUiRouterBridge : null;
                long longValue = l.longValue();
                q19 q19Var = q19.a;
                superappUiRouterBridge2.f(longValue, str);
                return s3q0.a;
            case 12:
                String[] strArr = LibverifyPresenter.d0;
                ((LibverifyPresenter) obj2).I0((String) obj);
                return s3q0.a;
            case 13:
                ((uhz) obj2).i6((com.vk.newsfeed.common.posting.listfriends.a) obj);
                return s3q0.a;
            case 14:
                return "loadNext: direction=" + ((Direction) obj2) + " historySize=" + ((w920) obj).c().size();
            case 15:
                MsgSkeletonView msgSkeletonView = (MsgSkeletonView) ((ViewStub) ((View) obj2).findViewById(R.id.msg_skeleton_view_viewstub)).inflate();
                wz30 wz30Var = ((an30) obj).b;
                if (wz30Var != null) {
                    msgSkeletonView.setSkeletonConfig(wz30Var);
                }
                return msgSkeletonView;
            case 16:
                List list = (List) obj;
                if (((xvy) obj2).h() == 0 && !list.isEmpty()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                ((izs) obj2).invoke(new a.e(!((hh80) obj).e));
                return s3q0.a;
            case 18:
                int i3 = PhotoFlowFragment.m0;
                xn50.a.c((PhotoFlowFragment) obj2, new a.s.c((String) obj));
                return s3q0.a;
            case 19:
                izs izsVar = (izs) obj2;
                kg50 kg50Var = (kg50) obj;
                if (kg50Var.getFloatValue() > 100.0f) {
                    izsVar.invoke(new sx40.h0(PlayerContext.FULL));
                } else if (kg50Var.getFloatValue() < -100.0f) {
                    izsVar.invoke(new sx40.g0(PlayerContext.FULL));
                }
                return s3q0.a;
            case 20:
                com.vk.ecomm.market.good.ui.e eVar = (com.vk.ecomm.market.good.ui.e) obj2;
                CallProducerButton callProducerButton = (CallProducerButton) obj;
                com.vk.ecomm.market.good.ui.c cVar = eVar.l;
                eVar.f(callProducerButton, cVar != null ? cVar.j : null, true, eVar.h.getContext());
                return s3q0.a;
            case 21:
                initialize$lambda$220$lambda$21 = ServiceProvider.initialize$lambda$220$lambda$21((UnityAdsModule) obj2, (ServicesRegistry) obj);
                return initialize$lambda$220$lambda$21;
            case 22:
                com.vk.clips.sdk.shared.item.static_ads.c cVar2 = (com.vk.clips.sdk.shared.item.static_ads.c) obj;
                return new nxk0((Context) obj2, cVar2.C, cVar2.m.b());
            case 23:
                izs izsVar2 = (izs) obj;
                String str2 = ((hyn.b) ((hyn) obj2)).a.h;
                if (str2 != null) {
                    izsVar2.invoke(new UserProfileAction.DonutBanner.UrlClick(str2, UserProfileAction.DonutBanner.UrlClick.Source.Goals));
                }
                return s3q0.a;
            default:
                b9w b9wVar = (b9w) obj2;
                return b9wVar != null ? b9wVar.b(AdapterEntryType.TYPE_INTERACTIVE_VIDEO) : new p0x(((ViewGroup) obj).getContext());
        }
    }
}
