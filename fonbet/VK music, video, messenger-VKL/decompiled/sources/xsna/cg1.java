package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.view.Choreographer;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog.mvi.block.video.impl.movies.detail.description.a;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.community.strikes.impl.di.CommunityStrikesComponentImpl;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.b;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.a;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.qrcode.QRStatsTracker;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.StopStepsPermissions$Response;
import com.vk.video.growth.api.data.VideoGrowthCommunitySource;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.djc;
import xsna.ig3;
import xsna.m8v;
import xsna.mnb;
import xsna.r2c;
import xsna.sst0;
import xsna.v8v;
import xsna.w8v;
import xsna.zfs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cg1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cg1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, xsna.jv20] */
    @Override // xsna.gzs
    public final Object invoke() {
        FragmentEntry Cb;
        Object aVar;
        yvj initialize$lambda$220$lambda$5;
        int i = 0;
        switch (this.b) {
            case 0:
                ((gg1) this.c).p.b(new i.b.a(((a.j.AbstractC1478a.C1479a) ((a.j) this.d)).b));
                return s3q0.a;
            case 1:
                ((rh3) this.c).C(new ig3.e.C3054e((Set) this.d));
                return s3q0.a;
            case 2:
                BaseSharingExternalActivity baseSharingExternalActivity = (BaseSharingExternalActivity) this.c;
                com.vk.storycamera.builder.a aVar2 = (com.vk.storycamera.builder.a) this.d;
                int i2 = BaseSharingExternalActivity.Z;
                baseSharingExternalActivity.getClass();
                aVar2.C(baseSharingExternalActivity);
                return null;
            case 3:
                ((izs) this.c).invoke(((a.InterfaceC0987a.b) ((com.vk.ecomm.onlinebooking.impl.services.presentation.model.a) this.d).d).a.b);
                return s3q0.a;
            case 4:
                com.vk.search.fragment.a aVar3 = (com.vk.search.fragment.a) this.c;
                aVar3.e.post(new si0(2, (DiscoverSearchFragment) this.d, aVar3));
                return s3q0.a;
            case 5:
                ymb ymbVar = (ymb) this.c;
                DialogExt dialogExt = (DialogExt) this.d;
                DialogExt dialogExt2 = ymbVar.i;
                if (dialogExt2 == null) {
                    ymbVar.i = dialogExt;
                } else {
                    ProfilesInfo profilesInfo = dialogExt2.b;
                    if (profilesInfo != null) {
                        profilesInfo.Hb(dialogExt.b);
                    }
                }
                ymbVar.T(new mnb.h(dialogExt));
                ymbVar.V();
                return s3q0.a;
            case 6:
                ((izs) this.c).invoke(new r2c.e(((x2c) this.d).b));
                return s3q0.a;
            case 7:
                e1d e1dVar = (e1d) this.c;
                w6d w6dVar = (w6d) this.d;
                ClipActionButton clipActionButton = new ClipActionButton(e1dVar.p.getContext());
                jjc.g(clipActionButton, new h5(w6dVar, 28));
                return clipActionButton;
            case 8:
                com.vk.profile.community.impl.ui.profile.a aVar4 = (com.vk.profile.community.impl.ui.profile.a) this.c;
                VideoGrowthCommunitySource videoGrowthCommunitySource = (VideoGrowthCommunitySource) this.d;
                VideoPipStateHolder videoPipStateHolder = VideoPipStateHolder.a;
                videoPipStateHolder.getClass();
                yg5 c = VideoPipStateHolder.c();
                VideoFile A = c != null ? c.A() : null;
                String a1 = A != null ? A.a1() : null;
                Long valueOf = c != null ? Long.valueOf(c.getPosition()) : null;
                ((VideoGrowthComponent) aVar4.k.a1.getValue()).B6().b(aVar4.g, (a1 == null || valueOf == null) ? null : new VideoGrowthVideoParams(a1, valueOf.longValue(), false, false, 12, null), aVar4.i.a.b, videoGrowthCommunitySource, new k3b(videoPipStateHolder, 3));
                return s3q0.a;
            case 9:
                sst0.b bVar = (sst0.b) this.c;
                avh avhVar = (avh) this.d;
                sst0.b.C3688b c3688b = bVar.c;
                if (c3688b != null) {
                    avhVar.o.c(c3688b);
                }
                return s3q0.a;
            case 10:
                DataRepositoryComponent dataRepositoryComponent = (DataRepositoryComponent) this.c;
                CommunityStrikesComponentImpl communityStrikesComponentImpl = (CommunityStrikesComponentImpl) this.d;
                qcy<Object>[] qcyVarArr = CommunityStrikesComponentImpl.c;
                return new r2i(new bpn0(new defpackage.k(communityStrikesComponentImpl, 25)), dataRepositoryComponent.C());
            case 11:
                f6i f6iVar = (f6i) this.c;
                SnippetAttachment snippetAttachment = (SnippetAttachment) this.d;
                f6iVar.Y6(snippetAttachment);
                PostInteract postInteract = f6iVar.w;
                if (postInteract != null) {
                    postInteract.Db(PostInteract.Type.link_click, snippetAttachment.f.b);
                }
                return s3q0.a;
            case 12:
                a0r a0rVar = (a0r) this.c;
                Tag tag = (Tag) this.d;
                exi0 exi0Var = a0rVar.f;
                if (exi0Var != null) {
                    exi0Var.invoke(tag);
                }
                return s3q0.a;
            case 13:
                com.vk.core.fragments.b bVar2 = (com.vk.core.fragments.b) this.c;
                FragmentEntry fragmentEntry = (FragmentEntry) this.d;
                vbs vbsVar = bVar2.a;
                vbsVar.c();
                FStack Cb2 = bVar2.e.c.Cb(fragmentEntry, new b.h(2, bVar2.d, xas.class, "areFragmentsEquals", "areFragmentsEquals(Lcom/vk/core/fragments/FragmentEntry;Lcom/vk/core/fragments/FragmentEntry;)Z", 0));
                if (Cb2 != null && Cb2.c.isEmpty()) {
                    FragmentEntry fragmentEntry2 = Cb2.b;
                    fragmentEntry2.c.clear();
                    fragmentEntry2.c.putAll(new Bundle(fragmentEntry.c));
                    Cb2.Bb(fragmentEntry2);
                }
                if (Cb2 != null && (Cb = Cb2.Cb()) != null) {
                    fragmentEntry = Cb;
                }
                String str = fragmentEntry.d;
                FragmentImpl b = vbsVar.b(str);
                if (b == null) {
                    FragmentImpl Ab = fragmentEntry.Ab();
                    vbsVar.a(bVar2.c.a(Ab), Ab, str, true);
                } else {
                    vbsVar.n(b, null, true);
                }
                vbsVar.d();
                return s3q0.a;
            case 14:
                ((Choreographer) this.c).removeFrameCallback((zfs.a.ChoreographerFrameCallbackC4178a) this.d);
                return s3q0.a;
            case 15:
                ((w8t) this.c).a.invoke(new djc.f(((s90) this.d).c.a));
                return s3q0.a;
            case 16:
                ((qmu) this.c).q6((Group) this.d, false);
                return s3q0.a;
            case 17:
                w920 w920Var = (w920) this.c;
                m8v.a aVar5 = (m8v.a) this.d;
                ReentrantReadWriteLock reentrantReadWriteLock = w920Var.t;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    Attach copy = aVar5.a.copy();
                    gj30 c2 = w920Var.c();
                    c2.getClass();
                    gj30 gj30Var = new gj30(c2);
                    int t = gj30Var.t(copy.xb());
                    if (t < 0) {
                        aVar = new v8v.b("History does not contain attach = " + copy);
                    } else {
                        gj30 gj30Var2 = new gj30(gj30Var);
                        Msg zb = ((Msg) ((btx0) gj30Var2.k().get(t))).zb();
                        if (!(zb instanceof com.vk.im.engine.models.messages.a)) {
                            throw new IllegalStateException("message with localId = " + zb.b + " without attach");
                        }
                        if (((com.vk.im.engine.models.messages.a) zb).X9(new ebx(copy, 6)).equals(copy)) {
                            aVar = new v8v.b("attach not changed");
                        } else {
                            ((com.vk.im.engine.models.messages.a) zb).L2(copy);
                            gj30Var2.u(zb);
                            w920Var.h(gj30Var2);
                            aVar = new v8v.a(new w8v.f(gj30Var, gj30Var2, copy));
                        }
                    }
                    return aVar;
                } finally {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            case 18:
                wv20 wv20Var = (wv20) this.c;
                ?? r2 = wv20Var.b;
                vgg vggVar = (vgg) this.d;
                nly nlyVar = new nly(wv20Var, 7);
                Throwable th = vggVar.a;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 15 && vKApiExecutionException.C() == 1174) {
                        nlyVar.invoke();
                    } else {
                        r2.G8();
                        s3q0 s3q0Var = s3q0.a;
                    }
                } else {
                    r2.G8();
                    s3q0 s3q0Var2 = s3q0.a;
                }
                return s3q0.a;
            case 19:
                ((izs) this.c).invoke(new a.C0460a(((md30) this.d).b));
                return s3q0.a;
            case 20:
                ((izs) this.c).invoke(new DraftShortVideoListView.c.a(((DraftShortVideoListView.d.c) this.d).b));
                return s3q0.a;
            case 21:
                NewsfeedRouter.E(((NewsfeedRouterComponent) ((k7m) m7m.f(com.vk.qrcode.d.b)).a(fpf0.a(NewsfeedRouterComponent.class))).l0(), (Activity) this.c, (Post) this.d, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_POST);
                return s3q0.a;
            case 22:
                ((izs) this.c).invoke((iph0) this.d);
                return s3q0.a;
            case 23:
                initialize$lambda$220$lambda$5 = ServiceProvider.initialize$lambda$220$lambda$5((UnityAdsModule) this.c, (ServicesRegistry) this.d);
                return initialize$lambda$220$lambda$5;
            case 24:
                znj0 znj0Var = (znj0) this.c;
                whp whpVar = (whp) this.d;
                HorizontalRecyclerPaginationView a = znj0Var.h().a();
                if (a != null) {
                    a.qg(whpVar);
                }
                return s3q0.a;
            case 25:
                fgl0 fgl0Var = (fgl0) this.c;
                String str2 = (String) this.d;
                com.vk.superapp.base.js.bridge.b.p(fgl0Var.b, new JsMethod("VKWebAppStopStepsPermissions"), new StopStepsPermissions$Response(null, new StopStepsPermissions$Response.Data(true, str2), str2, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 26:
                rg50 rg50Var = (rg50) this.c;
                wh50 wh50Var = (wh50) this.d;
                rg50Var.C(0);
                wh50Var.setValue(Boolean.TRUE);
                return s3q0.a;
            case 27:
                xsq0 xsq0Var = (xsq0) this.c;
                xsq0Var.m.b(xsq0Var.d.a, MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, true).h((FragmentActivity) this.d, 3238);
                return s3q0.a;
            default:
                ((u8r0) this.c).a.m((ArrayList) this.d);
                return s3q0.a;
        }
    }
}
