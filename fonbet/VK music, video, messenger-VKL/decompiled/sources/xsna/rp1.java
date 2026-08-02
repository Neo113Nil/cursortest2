package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.api.base.Document;
import com.vk.catalog.mvi.block.impl.OpenSectionArrowButtonView;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.newsfeed.impl.fragments.VideoBottomSheetTreeCommentsFragment;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import xsna.dz40;
import xsna.ksf;
import xsna.swi0;
import xsna.sx40;
import xsna.wml0;
import xsna.wwi0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rp1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rp1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$39;
        yvj initialize$lambda$220$lambda$9;
        int i = 8;
        int i2 = 6;
        int i3 = 1;
        switch (this.b) {
            case 0:
                up1 up1Var = (up1) this.c;
                return rsg0.T(yfb.x(zga0.c(up1Var.a, (UserId) this.d, null, null, 20, Boolean.TRUE, 6))).U(new rx0(new vs(up1Var, 3), i3));
            case 1:
                ((ct4) this.c).e((gt4) this.d, true);
                return s3q0.a;
            case 2:
                dx5 dx5Var = (dx5) this.c;
                toy toyVar = (toy) this.d;
                dx5Var.x = dx5Var.s.a(toyVar.b.d(), toyVar.getLayoutDirection(), toyVar);
                return s3q0.a;
            case 3:
                return "loadByNetwork(): missing channelIds = " + j5g.g0((ArrayList) this.c, null, null, null, 0, null, 63) + "\nrequestedIds = " + j5g.g0((List) this.d, null, null, null, 0, new ci3(8), 31);
            case 4:
                ChatFragment chatFragment = (ChatFragment) this.c;
                Peer peer = (Peer) this.d;
                ChatFragment.d dVar = ChatFragment.w1;
                io.reactivex.rxjava3.internal.operators.single.f0 q = chatFragment.jo().C(chatFragment, new zbg0(peer)).q(asu0.a.c());
                int i4 = kwg0.a;
                chatFragment.D0.b(q.subscribe(new iwg0(), new np3(new wh6(i2), i2)));
                return s3q0.a;
            case 5:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                ksf ksfVar = (ksf) this.d;
                int i5 = ClipsWrapperFragment.Q0;
                npf npfVar = ((ksf.b) ksfVar).a;
                clipsWrapperFragment.getClass();
                xn50.a.c(clipsWrapperFragment, npfVar);
                return s3q0.a;
            case 6:
                ((d3h) this.c).h((String) this.d, false);
                return s3q0.a;
            case 7:
                cih cihVar = (cih) this.c;
                return new tjh(cihVar.a, cihVar.b, cihVar.c, cihVar.d, (po5) this.d, cihVar.f);
            case 8:
                com.vk.profile.community.impl.ui.profile.actions.e eVar = (com.vk.profile.community.impl.ui.profile.actions.e) this.c;
                d.b bVar = (d.b) this.d;
                com.vk.profile.community.impl.ui.profile.c cVar = eVar.b;
                String str = ((d.b.C1592b) bVar).a;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null) {
                    StoryViewerRouter.d((StoryViewerRouter) cVar.d.n.getValue(), b, null, str, MobileOfficialAppsConStoriesStat$ViewEntryPoint.REPOST_AUTO_TO_STORY_ACTIVITY, LoadContext.Owner.b, "story_view", null, null, null, 3906);
                }
                return s3q0.a;
            case 9:
                Document document = (Document) this.c;
                Context context = (Context) this.d;
                Uri parse = Uri.parse(document.k);
                String str2 = document.l;
                String str3 = document.m;
                String lastPathSegment = (str2 == null || drm0.N(str2)) ? parse.getLastPathSegment() : drm0.p0(str2).toString().replace('/', '_');
                if (str3 != null) {
                    String concat = ".".concat(str3);
                    if (lastPathSegment != null && !brm0.v(lastPathSegment, concat, false)) {
                        lastPathSegment = fo8.a(lastPathSegment, concat);
                    }
                }
                ArrayList a = e43.a("vk.com", "vk.ru");
                if (!a.contains(a0a.d)) {
                    a.add(a0a.d);
                }
                vao.b(context, lastPathSegment, document.k, false, null, Boolean.TRUE, j5g.P(a, parse.getHost()));
                return s3q0.a;
            case 10:
                u7r u7rVar = (u7r) this.c;
                File file = (File) this.d;
                return "Can not rename file " + u7rVar.a + " to " + file;
            case 11:
                ((q7u) this.c).n.a((Context) this.d);
                return s3q0.a;
            case 12:
                invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39((HandleInvocationsFromAdViewer) this.c, (AdObject) this.d);
                return invoke$lambda$39;
            case 13:
                View view = (View) this.c;
                an30 an30Var = (an30) this.d;
                ProgressWheel progressWheel = (ProgressWheel) ((ViewStub) view.findViewById(R.id.progress_viewstub)).inflate();
                kkm kkmVar = an30Var.a;
                if (kkmVar != null) {
                    kkmVar.e(progressWheel, new uhd(i2));
                }
                return progressWheel;
            case 14:
                ((izs) this.c).invoke(new OpenSectionArrowButtonView.b(((OpenSectionArrowButtonView.d) this.d).b));
                return s3q0.a;
            case 15:
                j7b0 j7b0Var = (j7b0) this.c;
                j7b0Var.R().subscribe(new ubq(new l22(25, j7b0Var, (Context) this.d), 24), new fl30(new wo40(i), 13));
                return s3q0.a;
            case 16:
                bue0 bue0Var = (bue0) this.c;
                izs izsVar = (izs) this.d;
                if (((Boolean) ((zak0) bue0Var.b).getValue()).booleanValue()) {
                    izsVar.invoke(sx40.p0.b);
                } else {
                    izsVar.invoke(new sx40.l(((dz40.o.d) ((zak0) bue0Var.a).getValue()).a));
                }
                return s3q0.a;
            case 17:
                ((nth0) this.c).f.b((rth0) this.d);
                return s3q0.a;
            case 18:
                initialize$lambda$220$lambda$9 = ServiceProvider.initialize$lambda$220$lambda$9((UnityAdsModule) this.c, (ServicesRegistry) this.d);
                return initialize$lambda$220$lambda$9;
            case 19:
                ((izs) this.c).invoke(new wml0.a.i(((zni0) this.d).a));
                return s3q0.a;
            case 20:
                ((mwi0) this.c).T(new swi0.g(((wwi0.b.C3961b) ((wwi0) this.d).e).a, wwi0.c.b.a));
                return s3q0.a;
            case 21:
                rg50 rg50Var = (rg50) this.c;
                rg50Var.C((rg50Var.getIntValue() + 1) % ((List) this.d).size());
                return s3q0.a;
            case 22:
                pb pbVar = (pb) this.c;
                com.vk.clips.sdk.shared.item.static_ads.c cVar2 = (com.vk.clips.sdk.shared.item.static_ads.c) this.d;
                return new com.vk.clips.sdk.shared.item.static_ads.events.a(pbVar, cVar2, cVar2.l, cVar2.C, cVar2.m.e(), cVar2.B);
            case 23:
                ((izs) this.c).invoke(new UserProfileAction.DonutBanner.UrlClick((String) this.d, null));
                return s3q0.a;
            case 24:
                ((utq0) this.c).n.a(new UserProfileAction.w.a(((UserProfileAdapterItem.PromoButtons.BirthdayPromo.a) this.d).g));
                return s3q0.a;
            case 25:
                b9w b9wVar = (b9w) this.c;
                return b9wVar != null ? b9wVar.b(AdapterEntryType.TYPE_PUBLIC_VIDEO) : new p0x(((ViewGroup) this.d).getContext());
            default:
                u3g0 u3g0Var = (u3g0) this.c;
                View view2 = (View) this.d;
                int i6 = VideoBottomSheetTreeCommentsFragment.l1;
                u3g0Var.r();
                mhy.d(view2);
                return s3q0.a;
        }
    }
}
