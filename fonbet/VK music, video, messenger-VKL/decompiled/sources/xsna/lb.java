package xsna;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.appredirects.filter.AppRedirectOverrides;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.archive.impl.ArchiveWithChannelsFragment;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListState;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.media.MediaFilteringStrategy;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.story.api.di.StoriesComponent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.ca9;
import xsna.coc;
import xsna.h7u0;
import xsna.iw2;
import xsna.m99;
import xsna.ogb;
import xsna.r1r0;
import xsna.saf;
import xsna.tj50;
import xsna.vp1;
import xsna.y7f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class lb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lb(ArchiveWithChannelsFragment archiveWithChannelsFragment, Toolbar toolbar) {
        this.b = 6;
        this.c = toolbar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v122, types: [xsna.dqb$a, xsna.j8i] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Iterable iterable;
        Iterable iterable2;
        List list;
        int i;
        int i2 = this.b;
        int i3 = 5;
        int i4 = 0;
        int i5 = 4;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                rb rbVar = (rb) obj2;
                return rsg0.w0(yfb.x(r1r0.a.b(rbVar.d, Collections.singletonList(rbVar.a), rbVar.g, null, null, 58))).l(new h8(new qb(i4), i7));
            case 1:
                Pair pair = (Pair) obj;
                ((wzs) obj2).invoke(pair.i(), pair.j());
                return s3q0.a;
            case 2:
                h30 h30Var = (h30) obj2;
                ActionLinks actionLinks = (ActionLinks) obj;
                ActionLinks actionLinks2 = h30Var.i;
                if (actionLinks2 == null || (iterable = actionLinks2.d) == null) {
                    iterable = EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ActionLinkSnippet actionLinkSnippet = ((ActionLink) it.next()).f;
                    Good good = actionLinkSnippet != null ? actionLinkSnippet.j : null;
                    if (good != null) {
                        arrayList.add(good);
                    }
                }
                h30Var.i = actionLinks;
                Iterator it2 = h30Var.t.iterator();
                while (it2.hasNext()) {
                    c30 c30Var = (c30) it2.next();
                    ActionLinks actionLinks3 = h30Var.i;
                    if (actionLinks3 == null || (list = actionLinks3.d) == null) {
                        list = EmptyList.b;
                    }
                    if (list.isEmpty() && h30Var.h == null) {
                        c30Var.O();
                    } else {
                        c30Var.L();
                    }
                }
                if (actionLinks == null || (iterable2 = actionLinks.d) == null) {
                    iterable2 = EmptyList.b;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = iterable2.iterator();
                while (it3.hasNext()) {
                    ActionLinkSnippet actionLinkSnippet2 = ((ActionLink) it3.next()).f;
                    Good good2 = actionLinkSnippet2 != null ? actionLinkSnippet2.j : null;
                    if (good2 != null) {
                        arrayList2.add(good2);
                    }
                }
                VideoFile videoFile = h30Var.c;
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((Good) it4.next()).Ab());
                    }
                    d30 d30Var = h30Var.l;
                    int o0 = videoFile.o0();
                    UserId I0 = videoFile.I0();
                    d30Var.getClass();
                    ?? r10 = d30Var.b;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(((Good) it5.next()).Ab());
                    }
                    if (isEmpty) {
                        ((lt00) r10.getValue()).b(new zz00(o0, I0.b, arrayList4));
                    } else {
                        ((lt00) r10.getValue()).e(new zz00(o0, I0.b, arrayList4));
                    }
                    io.reactivex.rxjava3.disposables.c cVar = h30Var.n;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    UserId I02 = videoFile.I0();
                    int o02 = videoFile.o0();
                    tfx tfxVar = new tfx("market.setItemsByVideo", new hq(21), new iq(17));
                    tfx.n(tfxVar, "owner_id", I02, 0L, 0L, 12);
                    tfx.l(tfxVar, "video_id", o02, 0, 0, 12);
                    tfxVar.i("item_ids", arrayList3);
                    h30Var.n = rsg0.Z(yfb.x(tfxVar)).subscribe(new g30(h30Var, i4), new defpackage.d(new com.vk.movika.sdk.base.observable.m(h30Var, i6), i7));
                }
                return s3q0.a;
            case 3:
                ((com.vk.movika.sdk.base.logic.interactor.p) obj2).invoke(new vp1.c((PhotoAlbum) obj));
                return s3q0.a;
            case 4:
                bw2 bw2Var = (bw2) obj2;
                tj50.a aVar = (tj50.a) obj;
                com.vk.movika.sdk.base.observable.k kVar = new com.vk.movika.sdk.base.observable.k(bw2Var, i3);
                ao8 ao8Var = ao8.d;
                return new iw2.a.C3085a(aVar.a(kVar, ao8Var), aVar.a(new mb(bw2Var, i5), ao8Var), aVar.a(new n82(i7), ao8Var));
            case 5:
                AppRedirectsSettingsFragment appRedirectsSettingsFragment = (AppRedirectsSettingsFragment) obj2;
                Throwable th = (Throwable) obj;
                int i8 = AppRedirectsSettingsFragment.L0;
                View view = appRedirectsSettingsFragment.b0;
                if (view != null) {
                    xo2.f(view, false, true, 300L);
                }
                String string = th instanceof AppRedirectOverrides.VersionTooLowException ? appRedirectsSettingsFragment.getString(R.string.app_redirects_version_too_low_message, ((AppRedirectOverrides.VersionTooLowException) th).d()) : appRedirectsSettingsFragment.getString(R.string.app_redirects_setting_change_failed);
                int i9 = h7u0.p;
                h7u0.a c = h7u0.b.c(appRedirectsSettingsFragment.requireContext());
                c.a.f = string;
                c.c0(R.string.vk_ok, null);
                appRedirectsSettingsFragment.J0 = c.m();
                return s3q0.a;
            case 6:
                Toolbar toolbar = (Toolbar) obj2;
                int i10 = ArchiveWithChannelsFragment.V;
                int i11 = ArchiveWithChannelsFragment.c.$EnumSwitchMapping$0[((u180) obj).b.a(LongPollType.CHANNELS).ordinal()];
                if (i11 == 1) {
                    i = R.string.vkim_sync_state_refreshing_dots;
                } else if (i11 == 2 || i11 == 3) {
                    i = R.string.vkim_dialogs_header_filter_archive;
                } else {
                    i = R.string.vkim_sync_state_connecting_dots;
                    if (i11 == 4 || i11 == 5) {
                        r6m.a.getClass();
                        if (!r6m.j()) {
                            i = R.string.vkim_sync_state_wait_for_network_dots;
                        }
                    }
                }
                toolbar.setTitle(i);
                return s3q0.a;
            case 7:
                return ((qw4) obj2).d();
            case 8:
                si5 si5Var = (si5) obj2;
                List list2 = (List) obj;
                Trace.beginSection("warmUpAutoPlays");
                try {
                    ri5 ri5Var = new ri5(list2, new Ref$IntRef(), new Handler(Looper.getMainLooper()), si5Var);
                    si5Var.b.add(ri5Var);
                    Looper.getMainLooper().getQueue().addIdleHandler(ri5Var);
                    s3q0 s3q0Var = s3q0.a;
                    Trace.endSection();
                    return s3q0.a;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 9:
                awt0.r((am) obj, ((ry5) obj2).itemView.getContext());
                return s3q0.a;
            case 10:
                ((p66) obj2).e.getClass();
                return s3q0.a;
            case 11:
                rm6 rm6Var = (rm6) obj2;
                ImageView imageView = rm6Var.K;
                SnippetAttachment snippetAttachment = (SnippetAttachment) rm6Var.C;
                if (snippetAttachment != null) {
                    if (imageView != null) {
                        imageView.setActivated(snippetAttachment.w.booleanValue());
                    }
                    if (imageView != null) {
                        imageView.setContentDescription(snippetAttachment.w.booleanValue() ? rm6Var.v6(R.string.fave_accessibility_remove_from_favorite) : rm6Var.v6(R.string.fave_accessibility_add_to_favorite));
                    }
                }
                return s3q0.a;
            case 12:
                oio.P((oio) obj, ((l5g) ((mtk0) obj2).getValue()).a, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return s3q0.a;
            case 13:
                VkBlurView vkBlurView = (VkBlurView) obj2;
                float measuredHeight = vkBlurView.getMeasuredHeight();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                int[] iArr = k0v0.c;
                float[] fArr = k0v0.d;
                vkBlurView.setColorOverlayShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight, iArr, fArr, tileMode));
                vkBlurView.setFallbackColorOverlay(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, vkBlurView.getMeasuredHeight(), iArr, fArr, tileMode));
                return s3q0.a;
            case 14:
                n3g n3gVar = (n3g) obj2;
                f0g f0gVar = h0g.a.get(((Integer) obj).intValue());
                com.vk.photo.editor.ivm.d dVar = n3gVar.b;
                if (dVar == null) {
                    dVar = null;
                }
                bc0 i12 = n3g.i(dVar);
                if (i12 != null) {
                    com.vk.photo.editor.ivm.d dVar2 = n3gVar.b;
                    if (dVar2 == null) {
                        dVar2 = null;
                    }
                    dVar2.a(new EditorMessage.i(w1g.a(i12, null, null, null, null, f0gVar, null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), EditorMessage.Source.UserInput, 4));
                }
                c5p c5pVar = n3gVar.f;
                (c5pVar != null ? c5pVar : null).b(CollageStatEvent.b.a);
                return s3q0.a;
            case 15:
                r480 r480Var = (r480) obj;
                ca9 ca9Var = ((m99) obj2).j().c;
                ca9.c cVar2 = ca9Var instanceof ca9.c ? (ca9.c) ca9Var : null;
                Dialog dialog = cVar2 != null ? cVar2.c : null;
                if (dialog == null) {
                    return new m99.a(null);
                }
                Dialog dialog2 = (Dialog) r480Var.c.c.get(dialog.Sb());
                if (dialog2 == null) {
                    return new m99.a(null);
                }
                ChatSettings Hb = dialog.Hb();
                Boolean valueOf = Hb != null ? Boolean.valueOf(Hb.n) : null;
                return new m99.a(Boolean.valueOf(!epx.f(valueOf, dialog2.Hb() != null ? Boolean.valueOf(r0.n) : null)));
            case 16:
                return Boolean.valueOf(!((StoriesComponent) ((com.vk.cameraui.impl.a) obj2).e.d.getValue()).F8().b((List) obj, MediaFilteringStrategy.VIDEO_AVC).isEmpty());
            case 17:
                ((zak0) ((noa) obj2).n).setValue((String) obj);
                return s3q0.a;
            case 18:
                wgb wgbVar = (wgb) obj2;
                Throwable th3 = (Throwable) obj;
                wgbVar.d();
                if (!sv1.t(th3)) {
                    wgbVar.b.c(th3, new f5(wgbVar, 15));
                    wgbVar.m.onNext(new ogb.b.a(th3));
                }
                return s3q0.a;
            case 19:
                ((dqb) obj2).c.m();
                return s3q0.a;
            case 20:
                uwb.b1((uwb) obj2, (Throwable) obj, null, 2);
                return s3q0.a;
            case 21:
                return Long.valueOf(new nv8(((vhc) obj2).c).c((List) obj));
            case 22:
                return ClipCoauthorListState.a((ClipCoauthorListState) obj, ((coc.f) ((coc) obj2)).b);
            case 23:
                return new ClipsFavoriteFolderContentListViewState.d(((tj50.a) obj).a(new com.vk.movika.sdk.base.observable.q((com.vk.clips.favorites.impl.ui.folders.content.f) obj2, 26), ao8.d));
            case 24:
                w1f w1fVar = (w1f) obj2;
                new iof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.TOP, SchemeStat$TypeClipViewerItem.EventType.CLIPS_RETENTION_BLOCK_EVENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem(MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem.ObjectType.CLICK_TO_STUB_CLIP, w1fVar.n), null, null, null, null, null, null, null, null, null, null, null, 1073479676, null)).q();
                ClipFeedTab.TopVideo topVideo = new ClipFeedTab.TopVideo(ClipFeedTab.TopVideo.Mode.FROM_RETENTION_BLOCK, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 30, 0 == true ? 1 : 0);
                pkd f = g620.f();
                int i13 = pkd.a;
                List<ClipFeedTab> p = f.p(null);
                ArrayList arrayList5 = new ArrayList(c5g.u(p, 10));
                for (ClipFeedTab clipFeedTab : p) {
                    if (clipFeedTab instanceof ClipFeedTab.TopVideo) {
                        clipFeedTab = topVideo;
                    }
                    arrayList5.add(clipFeedTab);
                }
                ClipsRouter.c(g620.f().a(), w1fVar.itemView.getContext(), arrayList5, null, null, null, null, null, false, null, 2044);
                return s3q0.a;
            case 25:
                m8f m8fVar = (m8f) obj2;
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    z7f z7fVar = (z7f) ((Pair) optional.get()).i();
                    y7f.j jVar = m8fVar.c;
                    y7f y7fVar = y7f.this;
                    y7f y7fVar2 = y7f.this;
                    y7fVar.C(z7fVar);
                    y7fVar2.a.Mm((List) ((Pair) optional.get()).j());
                    if (y7fVar2.e.c && !y7fVar2.a.B8()) {
                        y7fVar2.a.q9();
                    }
                }
                return s3q0.a;
            case 26:
                ((saf) obj2).b = null;
                saf.e = saf.a.C3655a.a;
                return s3q0.a;
            case 27:
                int i14 = com.vk.attachpicker.collages.a.k1;
                ((lds0) obj2).E();
                return s3q0.a;
            case 28:
                io.reactivex.rxjava3.subjects.d<kgg> dVar3 = ((xeg) obj2).i;
                dVar3.onNext(dVar3.P0() != null ? new kgg(Boolean.TRUE) : null);
                return s3q0.a;
            default:
                e2h.a(((j7h) obj2).a, (Throwable) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ lb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
