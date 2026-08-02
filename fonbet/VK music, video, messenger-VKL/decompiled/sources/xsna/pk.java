package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.call_by_link.feature.events.VoipCallByLinkNavigationEvent;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkFragment;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import com.vk.voip.ui.group_selector.ui.VoipGroupSelectorFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import xsna.awr0;
import xsna.fpe;
import xsna.k840;
import xsna.lfe;
import xsna.m5u;
import xsna.qtt0;
import xsna.r2c;
import xsna.srw0;
import xsna.uzc;
import xsna.wqs0;
import xsna.y1h;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class pk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pk(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        ExposedFunction invoke$lambda$43;
        fvk initialize$lambda$220$lambda$25;
        int i = this.b;
        boolean z = true;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) obj2;
                ArrayList arrayList = (ArrayList) obj;
                accessibilityEvents.c("usersLowerHand(" + arrayList.size() + ')');
                accessibilityEvents.b(AccessibilityEvents.Event.HAND_LOWERED, AccessibilityEvents.Event.HAND_RAISED, arrayList);
                break;
            case 1:
                jsa jsaVar = (jsa) obj2;
                com.vk.movika.sdk.base.utils.b bVar = new com.vk.movika.sdk.base.utils.b(5);
                jsaVar.getClass();
                jsa.c(bVar);
                qaj0.c(jsaVar.b.c(), "changed_name", ((esa) obj).a);
                break;
            case 2:
                ((izs) obj2).invoke(new r2c.g(((p4c) obj).b));
                break;
            case 3:
                View view = (View) obj2;
                c1d c1dVar = (c1d) obj;
                view.setVisibility(0);
                if (view instanceof lfe) {
                    uzc.a.C3859a c3859a = uzc.a.C3859a.a;
                    lfe.b bVar2 = ((lfe) view).c;
                    if (bVar2 != null) {
                        bVar2.c(c3859a);
                    }
                }
                c1dVar.d(view);
                break;
            case 4:
                ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = (ClipsOwnerSwipeFragment) obj2;
                fpe.b bVar3 = (fpe.b) obj;
                ViewPager2 viewPager23 = clipsOwnerSwipeFragment.d0;
                if (viewPager23 != null && viewPager23.getScrollState() == 0 && (((viewPager2 = clipsOwnerSwipeFragment.d0) == null || viewPager2.getCurrentItem() != bVar3.a()) && (viewPager22 = clipsOwnerSwipeFragment.d0) != null)) {
                    viewPager22.setCurrentItem(bVar3.a());
                }
                break;
            case 5:
                ((y1h.a) obj2).q6((y1h) obj, true);
                break;
            case 6:
                cih cihVar = (cih) obj2;
                break;
            case 7:
                xvy xvyVar = (xvy) obj2;
                yvj yvjVar = (yvj) obj;
                if (xvyVar.e()) {
                    myc0.h(yvjVar, null, null, new d1l(xvyVar, null), 3);
                } else {
                    z = false;
                }
                break;
            case 8:
                hgm hgmVar = (hgm) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(hgmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_muted_icon);
                Pair pair = new Pair(Integer.valueOf(R.drawable.vk_icon_muted_16), Integer.valueOf(R.attr.vk_ui_icon_tertiary));
                int intValue = ((Number) pair.d()).intValue();
                int intValue2 = ((Number) pair.g()).intValue();
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                omw.d(vkImageSimple, intValue, intValue2);
                vkImageSimple.setContentDescription(null);
                int i2 = hgmVar.n0;
                vkImageSimple.setLayoutParams(egm.W(hgmVar, i2, i2, hgmVar.g0, 0, 0, hgmVar.v0, 24));
                viewGroup.addView(vkImageSimple);
                break;
            case 9:
                ArrayList arrayList2 = (ArrayList) obj;
                StringBuilder sb = new StringBuilder("feedbackListeners: ");
                CopyOnWriteArraySet<f39> copyOnWriteArraySet = ((i6r) obj2).b;
                L.e("FeedbackListenerProxyImpl", fw3.d(copyOnWriteArraySet, sb));
                Iterator<f39> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().n(arrayList2);
                }
                break;
            case 10:
                sop sopVar = ((z5u) obj2).l;
                Good good = ((q5u) obj).b.a;
                sopVar.invoke(new m5u.a(good.b, good.c));
                break;
            case 11:
                invoke$lambda$43 = HandleInvocationsFromAdViewer.invoke$lambda$43((HandleInvocationsFromAdViewer) obj2, (AdObject) obj);
                break;
            case 12:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                VideoFile videoFile = ((kz20) obj2).g;
                if (videoFile != null) {
                    g7s0.m(fxc0.B(), fragmentActivity, videoFile, UserId.d, null, null, 24);
                }
                break;
            case 13:
                zl40 zl40Var = (zl40) obj2;
                Context context = (Context) obj;
                if (k840.a.i.b()) {
                    yok0 yok0Var = zl40Var.g;
                    if (yok0Var != null) {
                        yok0Var.b(null);
                    }
                    zl40Var.g = myc0.h(zl40Var.f, null, null, new gm40(zl40Var, context, null, null, null), 3);
                } else {
                    zl40.f(context);
                }
                break;
            case 14:
                break;
            case 15:
                cs60 cs60Var = (cs60) obj2;
                break;
            case 16:
                ox60 ox60Var = (ox60) obj2;
                fq60 fq60Var = (fq60) ox60Var.e.getValue();
                gq60 gq60Var = ox60Var.c;
                fq60Var.getClass();
                fq60.c((yo60.j) obj, gq60Var);
                break;
            case 17:
                ((du90) obj2).l.c((wt90) obj);
                break;
            case 18:
                initialize$lambda$220$lambda$25 = ServiceProvider.initialize$lambda$220$lambda$25((UnityAdsModule) obj2, (ServicesRegistry) obj);
                break;
            case 19:
                ((rlq0) obj2).g((ExtendedUserProfile) obj);
                break;
            case 20:
                ((izs) obj2).invoke(new wqs0.l.b((BlockId.CompositeId) obj));
                break;
            case 21:
                ((izs) obj2).invoke(new awr0.a(((dqt0) obj).b));
                break;
            case 22:
                ((izs) obj2).invoke(new qtt0.d(((rtt0) obj).b));
                break;
            case 23:
                wjg0 wjg0Var = (wjg0) obj;
                Iterator<T> it2 = ((d7v0) obj2).b.iterator();
                while (it2.hasNext()) {
                    ((xjg0) it2.next()).a(wjg0Var);
                }
                break;
            case 24:
                int i3 = VoipCallByLinkFragment.T;
                VoipGroupSelectorConfig voipGroupSelectorConfig = new VoipGroupSelectorConfig("REQUEST_KEY_CALL_AS", ((VoipCallByLinkNavigationEvent.c) ((VoipCallByLinkNavigationEvent) obj2)).a, new VoipGroupSelectorConfig.TitleConfig.ResId(R.string.voip_call_by_link_call_as), new VoipGroupSelectorConfig.ButtonConfig.ResId(R.string.voip_call_by_link_call_as_button), true, false, 32, null);
                vbs In = ((VoipCallByLinkFragment) obj).In();
                VoipGroupSelectorFragment voipGroupSelectorFragment = new VoipGroupSelectorFragment();
                voipGroupSelectorFragment.setArguments(yfb.b(new Pair("arg_config", voipGroupSelectorConfig)));
                voipGroupSelectorFragment.Fn(In, "VoipGroupSelectorFragment");
                break;
            default:
                a3x0.p(((srw0) obj2).a, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ASK_ALL_TO_UNMUTE_AUDIO, ((srw0.b.a) obj).a, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741682);
                break;
        }
        return s3q0.a;
    }
}
