package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.communities.CatalogGetSearchGroupsRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockQuestionnaire;
import com.vk.catalog2.common.ui.holders.search.SearchEntityPersonAnswerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.QuestionnaireVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.clips.design.view.filter.CorrectionsView;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.banner.VkNotificationBanner;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.skeleton.VkTextSkeleton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.reefton.trackers.ReefContentStateTracker;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.vkclient.js.bridge.api.events.AllowMessagesFromGroup$Parameters;
import com.vk.toggle.features.SearchFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.aa30;
import xsna.fh8;
import xsna.gh8;
import xsna.nb30;
import xsna.nmp0;
import xsna.p53;
import xsna.pgn0;
import xsna.vmp0;
import xsna.xn50;
import xsna.ypt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jl4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        vmp0 vmp0Var;
        Activity h;
        PostingUserMessage postingUserMessage;
        int i = this.b;
        int i2 = 21;
        int i3 = 19;
        is4 is4Var = null;
        Object obj = null;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        int i4 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ml4 ml4Var = (ml4) obj3;
                el4 el4Var = (el4) obj2;
                if (ml4Var.isInterrupted()) {
                    ml4Var.quit();
                    return s3q0.a;
                }
                ml4Var.g();
                try {
                    is4 is4Var2 = ml4Var.l;
                    if (is4Var2 != null) {
                        is4Var = is4Var2;
                    }
                    is4Var.f = 0;
                    is4Var.e.a = el4Var;
                    is4Var.j = true;
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    ml4Var.d.b(th);
                    ml4Var.quit();
                }
                ml4Var.m = 0;
                return s3q0.a;
            case 1:
                va9 va9Var = (va9) obj3;
                FragmentManager fragmentManager = (FragmentManager) obj2;
                if (((or2) va9Var.b.invoke()).c()) {
                    y5x0 y5x0Var = new y5x0();
                    y5x0Var.k1 = va9Var;
                    y5x0Var.Td(fragmentManager, y5x0.class.getSimpleName());
                }
                return s3q0.a;
            case 2:
                CameraUIView cameraUIView = (CameraUIView) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                float f = CameraUIView.w1;
                float a = cameraUIView.Q(false).a();
                float f2 = cameraUIView.A;
                if (a <= f2) {
                    f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                f4m.q((int) f2, viewGroup);
                return s3q0.a;
            case 3:
                ClipsPlaylist clipsPlaylist = (ClipsPlaylist) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null) {
                    ClipsRouter.c(g620.f().a(), b, Collections.singletonList(new ClipFeedTab.Playlist.FromMiddle(ClipsPlaylist.a(clipsPlaylist, clipsPlaylist.e + 1), videoFile.a1())), null, null, fpf0.a(ClipFeedTab.Playlist.FromBeginning.class), null, null, true, null, 1900);
                }
                return s3q0.a;
            case 4:
                ((r4) obj3).onClick((VkNotificationBanner) obj2);
                return s3q0.a;
            case 5:
                cih cihVar = (cih) obj3;
                return new okh(cihVar.a, cihVar.b, cihVar.c, cihVar.d, (po5) obj2, false);
            case 6:
                ((CorrectionsView) obj3).t.h.H0(new i50(((lwj) obj2).a, i2), new ci3(18));
                return s3q0.a;
            case 7:
                asm asmVar = (asm) obj3;
                io.reactivex.rxjava3.internal.operators.single.f0 q = asmVar.b.C(asmVar, new zbg0(((DialogExt) obj2).f)).q(asu0.a.c());
                int i5 = kwg0.a;
                asmVar.h.b(q.subscribe(new iwg0(), new tp0(new gv3(i3), i2)));
                return s3q0.a;
            case 8:
                ((izs) obj3).invoke((ypt.a) obj2);
                return s3q0.a;
            case 9:
                Bundle bundle = (Bundle) obj2;
                wba N = ((GlobalSearchGroupsCatalogRootVh) obj3).m.b.s.N();
                CatalogGetSearchGroupsRequestFactory.SearchGroupsEntrypoint searchGroupsEntrypoint = CatalogGetSearchGroupsRequestFactory.SearchGroupsEntrypoint.GlobalSearchTab;
                String string = bundle != null ? bundle.getString("KEY_AD_CAMPAIGN_SOURCE") : null;
                SearchFeatures searchFeatures = SearchFeatures.GLOBAL_SEARCH_GROUPS_SUGGESTER;
                searchFeatures.getClass();
                return new CatalogGetSearchGroupsRequestFactory(N, searchGroupsEntrypoint, null, string, com.vk.toggle.b.A.a(searchFeatures), 4);
            case 10:
                AllowMessagesFromGroup$Parameters allowMessagesFromGroup$Parameters = (AllowMessagesFromGroup$Parameters) ((p2y) obj3).a();
                dv1 dv1Var = (dv1) ((x7y) obj2).k.getValue();
                dv1Var.getClass();
                long d = allowMessagesFromGroup$Parameters.d();
                List<String> e = allowMessagesFromGroup$Parameters.e();
                if (e == null) {
                    e = EmptyList.b;
                }
                dv1Var.e = new ev1(d, allowMessagesFromGroup$Parameters.f(), p53.a.c(e, allowMessagesFromGroup$Parameters.h()));
                wdx0 wdx0Var = e370.f;
                if (wdx0Var == null) {
                    wdx0Var = null;
                }
                int i6 = pgn0.a.a;
                w25 c3 = wdx0Var.c();
                ev1 ev1Var = dv1Var.e;
                if (ev1Var != null) {
                    long j = ev1Var.a;
                    String g = allowMessagesFromGroup$Parameters.g();
                    if (j < 1) {
                        dv1Var.d.a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), g, 1, null));
                    } else {
                        vdx0 vdx0Var = e370.e;
                        io.reactivex.rxjava3.disposables.c subscribe = (vdx0Var != null ? vdx0Var : null).l().a(j, c3.b, ev1Var.b).subscribe(new xz(new av1(dv1Var, ev1Var, g, j), c2 == true ? 1 : 0), new k41(new bv1(i4, dv1Var, g), c == true ? 1 : 0));
                        xwv0 xwv0Var = (xwv0) dv1Var.a.invoke();
                        if (xwv0Var != null && (view = xwv0Var.getView()) != null && (D6 = view.D6()) != null) {
                            D6.b(subscribe);
                        }
                    }
                }
                return s3q0.a;
            case 11:
                uhz uhzVar = (uhz) obj3;
                uhzVar.l.l0(((com.vk.newsfeed.common.posting.listfriends.a) obj2).b, uhzVar.getBindingAdapterPosition());
                return s3q0.a;
            case 12:
                za30 za30Var = (za30) obj3;
                nb30 nb30Var = (nb30) obj2;
                aa30 aa30Var = za30Var.h;
                aa30.a aVar = aa30Var instanceof aa30.a ? (aa30.a) aa30Var : null;
                if (!epx.f(aVar != null ? aVar.a : null, nb30Var)) {
                    aa30 aa30Var2 = za30Var.h;
                    HashMap hashMap = za30Var.a;
                    ValueAnimator valueAnimator = za30Var.i;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (aa30Var2 instanceof aa30.a) {
                        nb30 nb30Var2 = ((aa30.a) aa30Var2).a;
                        for (Object obj4 : hashMap.values()) {
                            ei eiVar = ((vmp0) obj4).a;
                            nb30 nb30Var3 = eiVar.b;
                            nb30 nb30Var4 = eiVar.c;
                            if ((epx.f(nb30Var3, nb30Var2) && epx.f(nb30Var4, nb30Var)) || (epx.f(eiVar.b, nb30Var) && epx.f(nb30Var4, nb30Var2))) {
                                obj = obj4;
                                vmp0Var = (vmp0) obj;
                                if (vmp0Var != null) {
                                    Iterator it = za30Var.e.iterator();
                                    while (it.hasNext()) {
                                        ((bb30) it.next()).d(nb30Var2, nb30Var);
                                    }
                                    ValueAnimator a2 = za30Var.a(vmp0Var, nb30Var2, nb30Var);
                                    a2.start();
                                    za30Var.i = a2;
                                }
                            }
                        }
                        vmp0Var = (vmp0) obj;
                        if (vmp0Var != null) {
                        }
                    } else {
                        if (!(aa30Var2 instanceof aa30.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aa30.b bVar = (aa30.b) aa30Var2;
                        ei eiVar2 = bVar.a;
                        float f3 = bVar.b;
                        nb30 nb30Var5 = eiVar2.b;
                        nmp0 nmp0Var = eiVar2.a;
                        if (epx.f(nb30Var5, nb30Var)) {
                            ValueAnimator b2 = za30Var.b((vmp0) hashMap.get(nmp0Var), f3, false);
                            b2.start();
                            za30Var.i = b2;
                        } else if (epx.f(eiVar2.c, nb30Var)) {
                            ValueAnimator b3 = za30Var.b((vmp0) hashMap.get(nmp0Var), f3, true);
                            b3.start();
                            za30Var.i = b3;
                        } else {
                            HashMap hashMap2 = za30Var.b;
                            b8o0 b8o0Var = new b8o0(za30Var.f.f.b);
                            nb30.a.C3393a c3393a = nb30.a.a;
                            hashMap2.put(c3393a, b8o0Var);
                            vmp0.a aVar2 = new vmp0.a(nb30Var);
                            nmp0.a aVar3 = nmp0.a.b;
                            hashMap.put(aVar3, aVar2);
                            ValueAnimator a3 = za30Var.a((vmp0) hashMap.get(aVar3), c3393a, nb30Var);
                            a3.start();
                            za30Var.i = a3;
                        }
                    }
                }
                return s3q0.a;
            case 13:
                m340 m340Var = (m340) obj3;
                m340Var.d(new g84(i3, m340Var, (wxi0) obj2));
                return s3q0.a;
            case 14:
                la60 la60Var = (la60) obj3;
                Context context = (Context) obj2;
                if (la60Var.a != null && (h = e3m.h(context)) != null && !h.isFinishing() && !h.isDestroyed()) {
                    try {
                        com.vk.core.view.components.spinner.c cVar = la60Var.a;
                        if (cVar != null) {
                            cVar.show();
                        }
                    } catch (RuntimeException e2) {
                        L.i(e2);
                    }
                }
                return s3q0.a;
            case 15:
                int i7 = PhotoFlowFragment.m0;
                xn50.a.c((PhotoFlowFragment) obj3, new a.g.b((List) obj2));
                return s3q0.a;
            case 16:
                izs izsVar = (izs) obj3;
                ActionsAvailabilityState.Availability availability = ((dpc0) obj2).c;
                PostingAction.Navigation.NextStep nextStep = PostingAction.Navigation.NextStep.b;
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(nextStep);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, nextStep, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                return s3q0.a;
            case 17:
                ((QuestionnaireVh) obj3).m.b(new xxf0(((UIBlockQuestionnaire) ((UIBlock) obj2)).y.b), false);
                return s3q0.a;
            case 18:
                ((vof0) obj3).a(ykj.a(((ReefContentStateTracker) obj2).c, null, null, null, null, null, null, null, 127));
                return s3q0.a;
            case 19:
                ((SearchEntityPersonAnswerVh) obj3).a(((VkAvatar) obj2).getContext());
                return s3q0.a;
            case 20:
                gh8.f.a aVar4 = (gh8.f.a) obj2;
                ((clj0) obj3).e.invoke(new fh8.m.c(aVar4.a, aVar4.b));
                return s3q0.a;
            case 21:
                arl0 arl0Var = (arl0) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                opl0 opl0Var = arl0Var.x;
                if (arl0Var.n) {
                    wql0 wql0Var = arl0Var.v;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((Boolean) wql0Var.invoke(it2.next())).booleanValue()) {
                                if (z != opl0Var.t) {
                                    opl0Var.t = z;
                                    if (z) {
                                        opl0Var.notifyItemInserted(0);
                                    } else {
                                        opl0Var.notifyItemRemoved(0);
                                    }
                                }
                                arl0Var.o6();
                                arl0Var.A.l();
                                return s3q0.a;
                            }
                        }
                    }
                }
                z = false;
                if (z != opl0Var.t) {
                }
                arl0Var.o6();
                arl0Var.A.l();
                return s3q0.a;
            case 22:
                VkInputSelect vkInputSelect = (VkInputSelect) obj3;
                mhy.j(vkInputSelect);
                vkInputSelect.postDelayed(new m50((tcm0) obj2, 8), 100L);
                return s3q0.a;
            case 23:
                nqo nqoVar = (nqo) obj2;
                izs<? super nqo, s3q0> izsVar2 = ((rim0) obj3).f;
                if (izsVar2 != null) {
                    izsVar2.invoke(nqoVar);
                }
                return s3q0.a;
            case 24:
                uvm0 uvm0Var = (uvm0) obj3;
                ClipsAuthor clipsAuthor = (ClipsAuthor) obj2;
                uvm0Var.e(clipsAuthor, false);
                e4h.l(xwk.e().h0(), uvm0Var.a, clipsAuthor.b.b, new ovm0(clipsAuthor.f, 0, clipsAuthor, uvm0Var, clipsAuthor.k()), null, 24);
                return s3q0.a;
            case 25:
                b9w b9wVar = (b9w) obj3;
                return b9wVar != null ? b9wVar.f(AttachVideo.class) : new p0x(((ViewGroup) obj2).getContext());
            case 26:
                ((VideoItemListSmallVh) obj3).n.d((VideoFile) obj2);
                return s3q0.a;
            default:
                com.vk.core.view.components.group.header.f fVar = (com.vk.core.view.components.group.header.f) obj2;
                VkTextSkeleton vkTextSkeleton = new VkTextSkeleton((Context) obj3, null, 6, 0);
                vkTextSkeleton.setId(R.id.ds_internal_group_header_title);
                vkTextSkeleton.setArea(fVar.getArea());
                vkTextSkeleton.setShimmer(fVar.b);
                vkTextSkeleton.setShimmerManagedExternally(true);
                vkTextSkeleton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                vkTextSkeleton.setIncludeFontPadding(false);
                return vkTextSkeleton;
        }
    }
}
