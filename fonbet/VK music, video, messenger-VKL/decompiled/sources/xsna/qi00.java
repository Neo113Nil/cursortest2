package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.zxing.pdf417.PDF417Common;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketCountersFilterDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.badges.fragments.OneTimeDonutFragment;
import com.vk.bridges.ImageViewer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.components.card.VkCard;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.messages.MsgTextFormatItem;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.feed.settings.impl.presentation.filtered.e;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.msg_search.vc.HideReason;
import com.vk.log.L;
import com.vk.managed_groups.impl.list.h;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.onboarding.impl.MusicRecommendationOnboardingContract$Presenter;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySimilarTracksSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import com.vk.newsfeed.impl.fragments.PostPreviewFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.onetimedonut.api.events.OneTimeDonutEventStatus;
import com.vk.photos.legacy.PhotoListFragment;
import com.vk.textformat.format_span.FormatLinkSpan;
import com.vk.textformat.format_span.FormatStyleSpan;
import com.vk.textformat.format_span.FormatUnderlineSpan;
import com.vk.voip.ui.picture_in_picture.overlay.PictureInPictureOverlayService;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ed50;
import xsna.fn20;
import xsna.ij20;
import xsna.k840;
import xsna.kq30;
import xsna.qr80;
import xsna.u3e0;
import xsna.wy30;
import xsna.y050;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qi00(com.vk.lists.c cVar, MusicRecommendationOnboardingContract$Presenter musicRecommendationOnboardingContract$Presenter) {
        this.b = 12;
        this.c = cVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v101, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        pk30 pk30Var;
        String string;
        String string2;
        String string3;
        pcc0 pcc0Var;
        a4d0 a4d0Var;
        Attachment attachment;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                L.j((Throwable) obj, "Error turning on notifications");
                ((com.vk.managed_groups.impl.list.c) obj2).i.b(h.a.a);
                return s3q0.a;
            case 1:
                wr00 wr00Var = (wr00) obj2;
                return new ps00((ViewGroup) obj, wr00Var.j, wr00Var.i);
            case 2:
                return ((lw00) obj2).b.a(MarketCountersFilterDto.BOOKMARK_ITEMS_COUNT).U(new q7(new pey(4), 28));
            case 3:
                ((vb20) obj2).a.c1();
                return s3q0.a;
            case 4:
                ((ij20.a) obj).l(((bf20) obj2).d);
                return s3q0.a;
            case 5:
                fn20.a aVar = (fn20.a) obj2;
                Iterator kxt0Var = new kxt0((FrameLayout) obj);
                ArrayList arrayList = new ArrayList();
                while (kxt0Var.hasNext()) {
                    View view = (View) kxt0Var.next();
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    kxt0 kxt0Var2 = viewGroup != null ? new kxt0(viewGroup) : null;
                    if (kxt0Var2 == null || !kxt0Var2.hasNext()) {
                        while (!kxt0Var.hasNext() && !arrayList.isEmpty()) {
                            kxt0Var = (Iterator) j5g.i0(arrayList);
                            g5g.I(arrayList);
                        }
                    } else {
                        arrayList.add(kxt0Var);
                        kxt0Var = kxt0Var2;
                    }
                    if (view instanceof VkCard) {
                        VkCard vkCard = (VkCard) view;
                        fn20 fn20Var = fn20.a;
                        vkCard.setBackgroundColorAttr(fn20.e((String) ((zak0) aVar.c).getValue()));
                        vkCard.setElevation(iah0.b(aVar.b() ? 4.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        vkCard.setDrawBorder(aVar.a());
                    } else if (view instanceof TextView) {
                        TextView textView = (TextView) view;
                        textView.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, textView.getContext()));
                    }
                }
                return s3q0.a;
            case 6:
                q010 q010Var = (q010) obj2;
                if (f4m.g((View) obj)) {
                    q010Var.invoke();
                }
                return s3q0.a;
            case 7:
                mq30 mq30Var = (mq30) obj2;
                kq30 kq30Var = mq30Var.i;
                Object obj3 = kq30Var != null ? kq30Var.b : null;
                kq30.a.C3197a c3197a = obj3 instanceof kq30.a.C3197a ? (kq30.a.C3197a) obj3 : null;
                if (c3197a != null && (str = c3197a.a) != null && (pk30Var = mq30Var.h) != null) {
                    pk30Var.d(0, str);
                }
                return s3q0.a;
            case 8:
                rw30 rw30Var = (rw30) obj2;
                Throwable th = (Throwable) obj;
                iy30 b1 = rw30Var.b1();
                ikv0 ikv0Var = b1.p;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                b1.p = null;
                zk70.e(th);
                if (rw30Var.o.c()) {
                    rw30Var.b1().b(HideReason.ERROR, false);
                }
                return s3q0.a;
            case 9:
                wy30.a aVar2 = (wy30.a) obj;
                aVar2.e = SystemClock.uptimeMillis();
                aVar2.f = dni0.b((Msg) obj2).length;
                return s3q0.a;
            case 10:
                hlv0 hlv0Var = (hlv0) obj;
                for (MsgTextFormatItem msgTextFormatItem : (List) obj2) {
                    int i2 = msgTextFormatItem.b;
                    int i3 = msgTextFormatItem.c + i2;
                    String str2 = msgTextFormatItem.d;
                    switch (str2.hashCode()) {
                        case -1178781136:
                            if (str2.equals(TtmlNode.ITALIC)) {
                                jlv0 jlv0Var = new jlv0(new FormatStyleSpan(2));
                                hlv0Var.b.add(jlv0Var);
                                jlv0Var.b(i2);
                                jlv0Var.a(i3);
                                s3q0 s3q0Var = s3q0.a;
                                break;
                            } else {
                                break;
                            }
                        case -1026963764:
                            if (str2.equals(TtmlNode.UNDERLINE)) {
                                jlv0 jlv0Var2 = new jlv0(new FormatUnderlineSpan());
                                hlv0Var.b.add(jlv0Var2);
                                jlv0Var2.b(i2);
                                jlv0Var2.a(i3);
                                s3q0 s3q0Var2 = s3q0.a;
                                break;
                            } else {
                                break;
                            }
                        case 116079:
                            if (str2.equals("url")) {
                                String str3 = msgTextFormatItem.e;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                jlv0 jlv0Var3 = new jlv0(new FormatLinkSpan(str3));
                                hlv0Var.b.add(jlv0Var3);
                                jlv0Var3.b(i2);
                                jlv0Var3.a(i3);
                                s3q0 s3q0Var3 = s3q0.a;
                                break;
                            } else {
                                break;
                            }
                        case 3029637:
                            if (str2.equals(TtmlNode.BOLD)) {
                                jlv0 jlv0Var4 = new jlv0(new FormatStyleSpan(1));
                                hlv0Var.b.add(jlv0Var4);
                                jlv0Var4.b(i2);
                                jlv0Var4.a(i3);
                                s3q0 s3q0Var4 = s3q0.a;
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return s3q0.a;
            case 11:
                ((m840) obj2).d.b(MusicHapticEvent.SUCCESS);
                return s3q0.a;
            case 12:
                MusicRecommendationOnboardingContract$Presenter.b((VKList) obj, (com.vk.lists.c) obj2);
                return s3q0.a;
            case 13:
                yc50 yc50Var = (yc50) obj2;
                ?? r1 = yc50Var.r1;
                ed50 ed50Var = (ed50) obj;
                int i4 = yc50.x1;
                if (ed50Var instanceof ed50.a) {
                    yc50Var.hide();
                } else if (ed50Var instanceof ed50.f) {
                    y501.a().h(yc50Var.kn(), ((ed50.f) ed50Var).a);
                } else if (ed50Var instanceof ed50.c) {
                    ed50.c cVar = (ed50.c) ed50Var;
                    ((BridgeComponent) r1.getValue()).Le().m(yc50Var.kn(), cVar.a, yc50Var.requireArguments().getBoolean("FORCE_DARK_THEME", false), cVar.b);
                } else if (ed50Var instanceof ed50.b) {
                    y050 U = ((BridgeComponent) r1.getValue()).Le().U();
                    FragmentActivity kn = yc50Var.kn();
                    ed50.b bVar = (ed50.b) ed50Var;
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext = bVar.b;
                    AlbumLink albumLink = bVar.a;
                    U.a(kn, new y050.b.C4065b(albumLink.c, albumLink.b, albumLink.d, musicPlaybackLaunchContext.t(), null, musicPlaybackLaunchContext.Gb(), 48));
                } else if (ed50Var instanceof ed50.e) {
                    MusicTrack musicTrack = ((ed50.e) ed50Var).a;
                    if (ob50.d(musicTrack)) {
                        com.vk.music.notifications.restriction.a aVar3 = k840.a.d;
                        (aVar3 != null ? aVar3 : null).g(musicTrack);
                    } else {
                        fl4 Le = ((BridgeComponent) r1.getValue()).Le();
                        FragmentActivity kn2 = yc50Var.kn();
                        String Fb = musicTrack.Fb();
                        MusicBottomSheetActionTracker musicBottomSheetActionTracker = yc50Var.p1;
                        Le.M(kn2, Fb, musicBottomSheetActionTracker != null ? musicBottomSheetActionTracker.a() : null, Boolean.valueOf(jnj.g(musicTrack.V)));
                    }
                } else if (ed50Var instanceof ed50.h) {
                    MusicTrack co = yc50.co(yc50Var.requireArguments());
                    boolean d = ob50.d(co);
                    int i5 = co.V;
                    if (d) {
                        com.vk.music.notifications.restriction.a aVar4 = k840.a.d;
                        (aVar4 != null ? aVar4 : null).g(co);
                    } else if (jnj.g(i5)) {
                        u2b0 eo = yc50Var.eo();
                        String str4 = co.d;
                        eo.N0(new lqk0(new StartPlaySimilarTracksSource(new PlaySourceMeta.SimilarTrackPlaySourceMeta(str4 != null ? str4 : "", co.Fb(), jnj.g(i5))), (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.F.Cb(jnj.a(i5)), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
                    } else {
                        u2b0 eo2 = yc50Var.eo();
                        Bundle arguments = yc50Var.getArguments();
                        String str5 = (arguments == null || (string2 = arguments.getString("BLOCK_ID")) == null) ? "" : string2;
                        Bundle arguments2 = yc50Var.getArguments();
                        String str6 = (arguments2 == null || (string = arguments2.getString("SECTION_ID")) == null) ? "" : string;
                        String Hb = co.Hb();
                        String str7 = co.d;
                        eo2.N0(new lqk0((StartPlaySource) new StartPlayVkMixSource(str5, str6, "track_mix", false, str7 == null ? "" : str7, null, Hb, null, null, null, PDF417Common.MAX_CODEWORDS_IN_BARCODE, null), (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.F, (int) (false ? 1 : 0), (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
                    }
                } else if (ed50Var.equals(ed50.d.a)) {
                    ((BridgeComponent) r1.getValue()).Le().w().b(yc50Var.kn(), yc50Var.requireArguments().getBoolean("FORCE_DARK_THEME", false));
                } else {
                    if (!ed50Var.equals(ed50.g.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i0q0.f(new i3r(yc50Var.kn(), 2));
                }
                return s3q0.a;
            case 14:
                NewsfeedFilteredSourcesFragment newsfeedFilteredSourcesFragment = (NewsfeedFilteredSourcesFragment) obj2;
                com.vk.feed.settings.impl.presentation.filtered.e eVar = (com.vk.feed.settings.impl.presentation.filtered.e) obj;
                int i6 = NewsfeedFilteredSourcesFragment.a0;
                if (!(eVar instanceof e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                e.a aVar5 = (e.a) eVar;
                mzp0 mzp0Var = newsfeedFilteredSourcesFragment.Z;
                if (epx.f(aVar5, e.a.C1059a.a)) {
                    mzp0Var.f();
                    newsfeedFilteredSourcesFragment.On().stop();
                } else if (epx.f(aVar5, e.a.b.a)) {
                    mzp0Var.a();
                } else {
                    if (!epx.f(aVar5, e.a.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mzp0Var.c(false);
                }
                return s3q0.a;
            case 15:
                OneTimeDonutFragment oneTimeDonutFragment = (OneTimeDonutFragment) obj2;
                int i7 = OneTimeDonutFragment.V;
                if (((i9x0) obj).r() == OneTimeDonutEventStatus.SUCCESS) {
                    Parcelable parcelable = (Badgeable) oneTimeDonutFragment.requireArguments().getParcelable("badgeable");
                    NewsEntry newsEntry = parcelable instanceof NewsEntry ? (NewsEntry) parcelable : null;
                    if (newsEntry != null) {
                        ((NewsfeedRouter) oneTimeDonutFragment.T.getValue()).b0(oneTimeDonutFragment.requireContext(), (NewsEntry) ((Badgeable) oneTimeDonutFragment.requireArguments().getParcelable("badgeable")), ModalPostDestination.REACTIONS_DONATS, false, null, null, newsEntry.Cb().b, qr80.c.a);
                    }
                    ((p870) oneTimeDonutFragment.U.getValue()).e(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, (NewsEntry) ((Badgeable) oneTimeDonutFragment.requireArguments().getParcelable("badgeable")));
                }
                oneTimeDonutFragment.finish();
                Bundle arguments3 = oneTimeDonutFragment.getArguments();
                Long valueOf = arguments3 != null ? Long.valueOf(arguments3.getLong("app_id")) : null;
                if (valueOf != null) {
                    jgn0.b().remove(valueOf.longValue());
                }
                return s3q0.a;
            case 16:
                abo aboVar = ((com.vk.music.player.playback.b) obj2).c;
                List<xd50> list = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((xd50) it.next()).a);
                }
                LinkedHashMap e = aboVar.e(arrayList2);
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (xd50 xd50Var : list) {
                    MusicTrack musicTrack2 = (MusicTrack) e.get(xd50Var.a.Fb());
                    if (musicTrack2 == null) {
                        musicTrack2 = xd50Var.a;
                    }
                    arrayList3.add(new xd50(musicTrack2, xd50Var.b));
                }
                return arrayList3;
            case 17:
                z5x z5xVar = (z5x) obj;
                z5xVar.getClass();
                z5xVar.a.c("paddingValues", (s890) obj2);
                return s3q0.a;
            case 18:
                ((f540) obj2).invoke();
                return s3q0.a;
            case 19:
                int i8 = PhotoListFragment.S0;
                ((PhotoListFragment) obj2).finish();
                return null;
            case 20:
                dea0 dea0Var = (dea0) obj2;
                VKList vKList = (VKList) obj;
                dea0Var.c = vKList.j();
                dea0Var.b = vKList.size() + dea0Var.b;
                dea0Var.a = vKList.i();
                ImageViewer.c<Photo> cVar2 = dea0Var.j;
                if (cVar2 != null) {
                    cVar2.c(vKList);
                }
                return s3q0.a;
            case 21:
                gvw0 gvw0Var = ((PictureInPictureOverlayService) obj2).c;
                return Boolean.valueOf(Settings.canDrawOverlays((gvw0Var != null ? gvw0Var : null).a));
            case 22:
                dra0.this.a.a(new g.d(PlacePickerState.LoadingState.RELOADING));
                return s3q0.a;
            case 23:
                ((k2b0) obj).w((com.vk.movika.sdk.player.base.model.a) obj2);
                return s3q0.a;
            case 24:
                PlaylistPermissions playlistPermissions = (PlaylistPermissions) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.b(Boolean.valueOf(playlistPermissions.b), "play");
                w9yVar.b(Boolean.valueOf(playlistPermissions.c), "edit");
                w9yVar.b(Boolean.valueOf(playlistPermissions.d), "follow");
                w9yVar.b(Boolean.valueOf(playlistPermissions.e), "share");
                w9yVar.b(Boolean.valueOf(playlistPermissions.f), "boom_download");
                w9yVar.b(Boolean.valueOf(playlistPermissions.g), "delete");
                w9yVar.b(Boolean.valueOf(playlistPermissions.h), "save_as_copy");
                return s3q0.a;
            case 25:
                Throwable th2 = (Throwable) obj;
                PostPreviewFragment postPreviewFragment = ((u6c0) obj2).a;
                postPreviewFragment.jo(true);
                if (th2 instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th2;
                    if (vKApiExecutionException.s() > 0) {
                        postPreviewFragment.io(Integer.valueOf(vKApiExecutionException.s()), vKApiExecutionException.getMessage());
                    } else {
                        cvk.w(j03.d(postPreviewFragment.getActivity(), vKApiExecutionException), false);
                    }
                } else {
                    FragmentActivity activity = postPreviewFragment.getActivity();
                    if (activity != null && (string3 = activity.getString(R.string.error)) != null) {
                        cvk.w(string3, false);
                    }
                }
                return s3q0.a;
            case 26:
                ((qkc0) obj2).d.getClass();
                PostEditableData postEditableData = ((PostingState.Editing) obj).i;
                PhotoTagsData photoTagsData = postEditableData.r;
                if (photoTagsData != null) {
                    return new d020(photoTagsData, postEditableData.p);
                }
                return null;
            case 27:
                enc0 enc0Var = (enc0) obj2;
                if (((Boolean) obj).booleanValue() && (pcc0Var = enc0Var.p.g) != null && (a4d0Var = pcc0Var.n.g) != null) {
                    Iterator it2 = a4d0Var.G.o.iterator();
                    while (it2.hasNext()) {
                        ce6 ce6Var = (ce6) it2.next();
                        if (ce6Var instanceof ykw) {
                            ykw ykwVar = (ykw) ce6Var;
                            if (ykwVar.v instanceof u3e0.b) {
                                Attachment attachment2 = ce6Var.c;
                                if (attachment2 != null) {
                                    ykwVar.m(attachment2);
                                }
                            }
                        }
                        if (ce6Var instanceof uu90) {
                            uu90 uu90Var = (uu90) ce6Var;
                            if (uu90Var.v instanceof u3e0.b) {
                                Attachment attachment3 = ce6Var.c;
                                if (attachment3 != null) {
                                    uu90Var.m(attachment3);
                                }
                            }
                        }
                        if ((ce6Var instanceof mps0) && (attachment = ce6Var.c) != null) {
                            ((mps0) ce6Var).m(attachment);
                        }
                    }
                }
                return s3q0.a;
            case 28:
                s5d0 s5d0Var = (s5d0) obj2;
                MediaStoreEntry mediaStoreEntry = ((a8f) s5d0Var.m).b;
                if (mediaStoreEntry != null) {
                    s5d0Var.n.a(mediaStoreEntry);
                }
                return s3q0.a;
            default:
                g9d0 g9d0Var = (g9d0) obj2;
                nvy nvyVar = (nvy) obj;
                int intValue = (((Number) ((zak0) g9d0Var.d).getValue()).intValue() / ((int) g9d0Var.b)) + 2;
                for (int i9 = 0; i9 < intValue; i9++) {
                    nvy.g(nvyVar, null, null, new jai(1190169792, new ze4(g9d0Var, 5), true), 3);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ qi00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ qi00(List list, s040 s040Var) {
        this.b = 10;
        this.c = list;
    }

    public /* synthetic */ qi00(boolean z, fn20.a aVar) {
        this.b = 5;
        this.c = aVar;
    }
}
