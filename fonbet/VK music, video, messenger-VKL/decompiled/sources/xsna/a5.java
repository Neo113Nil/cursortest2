package xsna;

import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.o;
import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.music.snippet.ui.presentation.base.view.SnippetTrackItemView$Companion$ButtonAddAction;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.reefton.Reef;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.core.js.bridge.api.events.CallAPIMethod$Parameters;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vk.voip.ui.broadcast.list.ui.a;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.gleffects.EffectRegistry;
import xsna.b4;
import xsna.bzr;
import xsna.cca0;
import xsna.dug0;
import xsna.hoo;
import xsna.jto0;
import xsna.kyh;
import xsna.obe0;
import xsna.p2s;
import xsna.pyn;
import xsna.s2s;
import xsna.w4;
import xsna.wk50;
import xsna.x4d0;
import xsna.ylw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AboutVideoItem.d.InterfaceC1215d interfaceC1215d;
        AboutVideoItem.d.a aVar;
        AboutVideoItem.d.b bVar;
        SubscriptionAction subscriptionAction;
        boolean z;
        MobileOfficialAppsCoreNavStat$EventScreen h;
        String name;
        ww50 v;
        String e;
        int i = 0;
        r5 = null;
        pyn pynVar = null;
        switch (this.b) {
            case 0:
                w4 w4Var = (w4) this.c;
                c4 c4Var = w4Var.b;
                w4.b bVar2 = (w4.b) this.d;
                VideoAuthorView.Action action = (VideoAuthorView.Action) obj;
                switch (w4.b.a.$EnumSwitchMapping$1[action.ordinal()]) {
                    case 1:
                        c4Var.d(b4.c.f.a);
                        break;
                    case 2:
                        c4Var.d(b4.c.C2586c.a);
                        break;
                    case 3:
                    case 4:
                        c4Var.d(new b4.c.h(null, w4Var.g, new b5(action, w4Var, bVar2, i)));
                        break;
                    case 5:
                        AboutVideoItem.d dVar = bVar2.l;
                        if (dVar != null && (interfaceC1215d = dVar.m) != null) {
                            AboutVideoItem.d.InterfaceC1215d.b bVar3 = interfaceC1215d instanceof AboutVideoItem.d.InterfaceC1215d.b ? (AboutVideoItem.d.InterfaceC1215d.b) interfaceC1215d : null;
                            if (bVar3 != null) {
                                c4Var.d(new b4.c.d(bVar3.a));
                                break;
                            }
                        }
                        break;
                    case 6:
                        AboutVideoItem.d dVar2 = bVar2.l;
                        if (dVar2 != null && (aVar = dVar2.e) != null) {
                            pynVar = aVar.a;
                        }
                        if (pynVar instanceof pyn.b) {
                            c4Var.d(new b4.c.e(((pyn.b) pynVar).c));
                            break;
                        }
                        break;
                    case 7:
                        AboutVideoItem.d dVar3 = bVar2.l;
                        if (dVar3 == null || (bVar = dVar3.d) == null || !(bVar instanceof com.vk.libvideo.bottomsheet.about.delegate.o)) {
                            bVar = null;
                        }
                        com.vk.libvideo.bottomsheet.about.delegate.o oVar = bVar instanceof com.vk.libvideo.bottomsheet.about.delegate.o ? (com.vk.libvideo.bottomsheet.about.delegate.o) bVar : null;
                        if (oVar == null) {
                            return s3q0.a;
                        }
                        if (oVar.equals(o.a.C1219a.a)) {
                            subscriptionAction = SubscriptionAction.FULLY_ENABLED_NOTIFICATIONS;
                        } else if (oVar.equals(o.a.b.a)) {
                            subscriptionAction = SubscriptionAction.DISABLED_NOTIFICATIONS;
                        } else {
                            if (!oVar.equals(o.a.c.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            subscriptionAction = SubscriptionAction.PREFERRED_VIDEOS_NOTIFICATIONS;
                        }
                        SubscriptionAction subscriptionAction2 = subscriptionAction;
                        Context h2 = e3m.h(bVar2.itemView.getContext());
                        if (h2 == null && (h2 = g2u0.c(bVar2.itemView)) == null) {
                            h2 = bVar2.itemView.getContext();
                        }
                        gk70 gk70Var = (gk70) bVar2.n.getValue();
                        lpj lpjVar = h2 instanceof lpj ? (lpj) h2 : null;
                        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                        dhr0.a.getClass();
                        Context l7sVar = (valueOf != null && valueOf.intValue() == dhr0.u().c) ? h2 : new l7s(h2, dhr0.u().c);
                        VideoFeatures videoFeatures = VideoFeatures.VIDEO_HIDE_CREATOR_FROM_SUBSCRIPTIONS;
                        videoFeatures.getClass();
                        if (com.vk.toggle.b.A.a(videoFeatures) && !bVar2.m) {
                            gzs<String> gzsVar = w4.this.d;
                            if (epx.f(gzsVar != null ? gzsVar.invoke() : null, "video_subscriptions_creators")) {
                                z = true;
                                new io.reactivex.rxjava3.internal.operators.single.o(gk70Var.a.a(l7sVar), new l8w(new agh(gk70Var, l7sVar, subscriptionAction2, z, new c5(subscriptionAction2, w4Var, h2, i)), 12)).subscribe();
                                break;
                            }
                        }
                        z = false;
                        new io.reactivex.rxjava3.internal.operators.single.o(gk70Var.a.a(l7sVar), new l8w(new agh(gk70Var, l7sVar, subscriptionAction2, z, new c5(subscriptionAction2, w4Var, h2, i)), 12)).subscribe();
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 1:
                return rsg0.w0(yfb.x(zga0.p(((kq5) this.c).e, (UserId) this.d, null, (List) obj, 2)));
            case 2:
                ((ds8) this.c).T6((ButtonsFeedback) this.d);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 3:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                TabsRecycler tabsRecycler = (TabsRecycler) this.d;
                int intValue = ((Integer) obj).intValue();
                float f = CameraUIView.w1;
                StoryCameraParams cameraParams = cameraUIView.getCameraParams();
                if (cameraParams != null && cameraParams.Tb()) {
                    return epx.f(cameraParams.Ob(), com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE)) ? new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.QR_PROFILE) : new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.QR_SCANNER);
                }
                if (cameraParams != null && cameraParams.Ub()) {
                    return new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.VMOJI_CAMERA);
                }
                StoryCameraMode storyCameraMode = (StoryCameraMode) j5g.b0(intValue, tabsRecycler.getItems());
                if ((storyCameraMode != null ? storyCameraMode.h() : null) == MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA) {
                    return new UiTrackingScreen(tabsRecycler.getItems().get(intValue).h());
                }
                StoryCameraMode storyCameraMode2 = (StoryCameraMode) j5g.b0(intValue, tabsRecycler.getItems());
                if (storyCameraMode2 == null || (h = storyCameraMode2.h()) == null) {
                    return null;
                }
                return new UiTrackingScreen(h);
            case 4:
                zld zldVar = (zld) this.c;
                x4d0.a aVar2 = (x4d0.a) this.d;
                zldVar.o = (List) obj;
                zldVar.b(aVar2);
                return s3q0.a;
            case 5:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                List<? extends hfz> list = (List) obj;
                int i2 = CommunityCheckListFragment.Y;
                mzp0 mzp0Var = communityCheckListFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.d(recyclerView);
                }
                communityCheckListFragment.On().a();
                ((ovg) communityCheckListFragment.Q.getValue()).setItems(list);
                return s3q0.a;
            case 6:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar3 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) this.c;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d((wk50.a) this.d, false);
                aVar3.c.b(kyh.a.m.a);
                return s3q0.a;
            case 7:
                o9h o9hVar = (o9h) this.c;
                osh oshVar = (osh) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Good good = o9hVar.a;
                if (good.J == booleanValue) {
                    return s3q0.a;
                }
                oshVar.f.invoke(new d.n.c.a.i(good.b, booleanValue));
                return s3q0.a;
            case 8:
                hoo hooVar = (hoo) this.c;
                int bindingAdapterPosition = ((hoo.a) this.d).getBindingAdapterPosition();
                int i3 = hooVar.e;
                if (i3 != -1) {
                    hooVar.notifyItemChanged(i3);
                }
                hooVar.e = bindingAdapterPosition;
                hooVar.notifyItemChanged(bindingAdapterPosition);
                hooVar.c.invoke(hooVar.d.get(hooVar.e));
                return s3q0.a;
            case 9:
                r2s r2sVar = (r2s) this.c;
                s2s.b bVar4 = (s2s.b) this.d;
                if (!(((bzr) obj) instanceof bzr.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                r2sVar.a.onNext(new p2s.b(bVar4.a));
                return s3q0.a;
            case 10:
                CallAPIMethod$Parameters callAPIMethod$Parameters = (CallAPIMethod$Parameters) this.c;
                p3y p3yVar = (p3y) this.d;
                Throwable th = (Throwable) obj;
                if (fco0.d(th)) {
                    p3yVar.L0().b(fco0.h(callAPIMethod$Parameters.e(), th));
                } else {
                    p3yVar.L0().a(fco0.g(th), callAPIMethod$Parameters.e());
                }
                return s3q0.a;
            case 11:
                wbz wbzVar = (wbz) this.c;
                izs izsVar = (izs) this.d;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, ygi.a, 3);
                nvy.g(nvyVar, null, null, ygi.b, 3);
                nvy.g(nvyVar, null, null, ygi.c, 3);
                nvy.g(nvyVar, null, null, ygi.d, 3);
                nvy.g(nvyVar, null, null, ygi.e, 3);
                nvy.g(nvyVar, null, null, ygi.f, 3);
                ArrayList arrayList = wbzVar.a;
                wow wowVar = new wow(arrayList);
                nvyVar.e(arrayList.size(), null, new ioj(wowVar, 2), new jai(2039820996, new ybz(wowVar, wbzVar, izsVar), true));
                return s3q0.a;
            case 12:
                kg50 kg50Var = (kg50) this.c;
                kg50 kg50Var2 = (kg50) this.d;
                kg50Var.g(((Float) obj).floatValue());
                kg50Var2.g(Math.min(kg50Var2.getFloatValue(), kg50Var.getFloatValue()));
                return s3q0.a;
            case 13:
                Mask mask = (Mask) this.c;
                izs izsVar2 = (izs) this.d;
                dug0.c cVar = (dug0.c) obj;
                if (cVar.c()) {
                    boolean z2 = mask.u;
                    int i4 = mask.d;
                    if (z2) {
                        EffectRegistry.EffectId b = pw70.b(i4);
                        name = b != null ? b.name() : null;
                        if (name != null && pw70.a(i4)) {
                            name = name + i4;
                        }
                    } else {
                        name = cVar.c.getName();
                    }
                    izsVar2.invoke(name);
                }
                return s3q0.a;
            case 14:
                ((um50) this.c).c(new ks2(22, (h7f0) obj, (yl50) this.d));
                return s3q0.a;
            case 15:
                Context context = (Context) this.c;
                qw60 qw60Var = (qw60) this.d;
                ((Boolean) obj).getClass();
                Activity h3 = e3m.h(context);
                if (h3 != null && (v = s200.v(h3)) != null) {
                    v.H(qw60Var);
                }
                return s3q0.a;
            case 16:
                return ((wz80) this.c).g.a((zqa) this.d);
            case 17:
                PastBroadcastsFragment pastBroadcastsFragment = (PastBroadcastsFragment) this.c;
                PastBroadcastsFragment.c cVar2 = (PastBroadcastsFragment.c) this.d;
                int i5 = PastBroadcastsFragment.U;
                pastBroadcastsFragment.fo((a.d) obj, cVar2);
                return s3q0.a;
            case 18:
                com.vk.lists.c cVar3 = (com.vk.lists.c) this.c;
                wba0 wba0Var = (wba0) this.d;
                cVar3.r(false);
                wba0Var.g.invoke(new cca0.j((List) obj));
                return s3q0.a;
            case 19:
                SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) this.c;
                String str = (String) this.d;
                tgi0 tgi0Var = (tgi0) obj;
                if (semanticsConfiguration != null) {
                    semanticsConfiguration.invoke(tgi0Var);
                }
                qgi0.h(tgi0Var, str);
                return s3q0.a;
            case 20:
                bn50 bn50Var = (bn50) this.c;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(bn50Var), ((obe0) this.d).b);
                g47Var.a(tci.k(bn50Var));
                g47Var.d(new obe0.a(bn50Var));
                return s3q0.a;
            case 21:
                dof0 dof0Var = (dof0) this.c;
                TelephonyManager telephonyManager = (TelephonyManager) this.d;
                jof0 jof0Var = (jof0) obj;
                try {
                } catch (Throwable unused) {
                    dof0Var.d.b();
                    AtomicInteger atomicInteger = Reef.i;
                    com.vk.reefton.c cVar4 = Reef.j;
                    if (cVar4 != null) {
                        cVar4.m.incrementAndGet();
                    }
                }
                if (!dof0Var.h) {
                    return s3q0.a;
                }
                if (dof0Var.c.a()) {
                    telephonyManager.listen(jof0Var, 336);
                } else {
                    telephonyManager.listen(jof0Var, 64);
                }
                return s3q0.a;
            case 22:
                ku1 ku1Var = (ku1) this.c;
                SnippetTrackItemView$Companion$ButtonAddAction snippetTrackItemView$Companion$ButtonAddAction = (SnippetTrackItemView$Companion$ButtonAddAction) this.d;
                ((View) obj).performHapticFeedback(0);
                ku1Var.invoke(snippetTrackItemView$Companion$ButtonAddAction);
                return s3q0.a;
            case 23:
                ((izs) this.c).invoke(((StoryViewHeader) this.d).b);
                return s3q0.a;
            case 24:
                ((i0b0) this.c).invoke(jto0.b.a((jto0.b) this.d, null, null, null, null, false, null, false, false, false, false, null, false, false, ((Boolean) obj).booleanValue(), null, false, 57343));
                return s3q0.a;
            case 25:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.d;
                VideoFileOld b2 = com.vk.dto.common.c.b((JSONObject) obj);
                b2.p0 = (String) linkedHashMap.get(b2.b);
                b2.q0 = (String) linkedHashMap2.get(b2.b);
                return b2;
            default:
                lcw0 lcw0Var = (lcw0) this.c;
                VoipChangeNameConfig.PreselectedUser preselectedUser = (VoipChangeNameConfig.PreselectedUser) this.d;
                whr0 whr0Var = (whr0) ((it80) obj).a;
                if (whr0Var == null || (e = whr0Var.q) == null) {
                    e = whr0Var != null ? whr0Var.e() : null;
                }
                Context requireContext = lcw0Var.a.requireContext();
                com.vk.voip.ui.c.b.getClass();
                CallId b3 = com.vk.voip.ui.c.r.b();
                if (e == null) {
                    e = null;
                }
                new ylw0.a(requireContext, new VoipChangeNameConfig(b3, null, preselectedUser, false, false, false, R.string.voip_change_name_in_call_toolbar_title, new VoipChangeNameConfig.OpenedFrom.ActiveCall(e), 50, null)).I0(null);
                return s3q0.a;
        }
    }

    public /* synthetic */ a5(com.vk.newsfeed.impl.fragments.a aVar, Context context, qw60 qw60Var) {
        this.b = 15;
        this.c = context;
        this.d = qw60Var;
    }
}
