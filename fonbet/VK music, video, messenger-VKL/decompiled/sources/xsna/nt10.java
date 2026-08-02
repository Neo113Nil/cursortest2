package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.catalog2.common.ui.holders.search.SearchSliderSuggestionVh;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.music.Playlist;
import com.vk.dto.polls.PollFilterParams;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.messages.Msg;
import com.vk.instantjobs.InstantJob;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.offline.api.model.storage.StorageEvent;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.PostingType;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.search.params.api.City;
import com.vk.search.params.api.VkPollSearchParams;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoModalSharingClick;
import com.vk.stickers.settings.StickerSettingsFeature;
import com.vk.stickers.settings.c;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.share.api.ShareItemType;
import com.vk.video.ui.share.api.VideoShareArguments;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.by40;
import xsna.cqb0;
import xsna.cqc0;
import xsna.d4k0;
import xsna.d5c0;
import xsna.df50;
import xsna.ikv0;
import xsna.k7j0;
import xsna.pvc0;
import xsna.qy40;
import xsna.sg60;
import xsna.tj50;
import xsna.tyk0;
import xsna.v6j0;
import xsna.v7h0;
import xsna.wk50;
import xsna.xu70;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nt10(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WebCity webCity;
        cqc0.c cVar;
        cqc0.c cVar2;
        Context context;
        int i = this.b;
        int i2 = 8;
        int i3 = 16;
        String str = null;
        Object[] objArr = 0;
        int i4 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qt10 qt10Var = (qt10) obj2;
                return new cn50(up2.d(new com.vk.movika.sdk.android.defaultplayer.container.e(15, (gzs) obj, qt10Var), new e2m(qt10Var, i4), svj.b));
            case 1:
                h420 h420Var = (h420) obj2;
                h420Var.l = true;
                h420Var.a.v5((Throwable) obj);
                return s3q0.a;
            case 2:
                ((gt20) obj2).g = null;
                return mcr0.h(Uri.parse((String) obj));
            case 3:
                bt30 bt30Var = (bt30) obj2;
                pk30 pk30Var = bt30Var.k;
                ct30 ct30Var = bt30Var.l;
                Msg msg = ct30Var != null ? ct30Var.p : null;
                Attach attach = ct30Var != null ? ct30Var.r : null;
                Attach attach2 = attach instanceof AttachSticker ? (AttachSticker) attach : null;
                if (pk30Var != null && msg != null && attach2 != null) {
                    pk30Var.M(attach2, msg, ct30Var != null ? ct30Var.q : null);
                }
                return s3q0.a;
            case 4:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof xiu) && epx.f(((xiu) instantJob).c, ((pz30) obj2).b));
            case 5:
                rw40 rw40Var = (rw40) obj2;
                AudioPlaylistDto audioPlaylistDto = (AudioPlaylistDto) obj;
                rw40Var.T(new by40.f0(false));
                rw40Var.w.b(qy40.a.n.b);
                rw40Var.B = new Playlist(audioPlaylistDto.getId(), audioPlaylistDto.q(), 0, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, false, 0, 0, 0L, null, null, null, null, null, false, false, false, null, null, null, 0, false, null, null, false, null, 0, -4, 255, null);
                rw40Var.x.b(MusicHapticEvent.SUCCESS);
                return s3q0.a;
            case 6:
                v0q<? extends kw40> v0qVar = (v0q) obj;
                px40 px40Var = ((ty40) obj2).p;
                if (px40Var != null) {
                    px40Var.D(v0qVar);
                }
                return s3q0.a;
            case 7:
                vgl0 vgl0Var = (vgl0) obj;
                for (StorageEvent storageEvent : (StorageEvent[]) obj2) {
                    vgl0Var.getClass();
                    storageEvent.ordinal();
                }
                return s3q0.a;
            case 8:
                df50.a.C2730a c2730a = (df50.a.C2730a) obj;
                bf50 bf50Var = ((ve50) obj2).i1;
                (bf50Var == null ? null : bf50Var).a(c2730a);
                return s3q0.a;
            case 9:
                ((sg60.a) obj2).a();
                return s3q0.a;
            case 10:
                ((wk50.a) obj2).b(new ClipItemPatch.k((n0x) obj));
                return s3q0.a;
            case 11:
                ev70 ev70Var = (ev70) obj2;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new fm20(ev70Var, 9), f9t.z(ev70Var), new xmz(16));
                l370.m(g47Var, f9t.w(ev70Var));
                g47Var.d(new xu70.a(ev70Var));
                return s3q0.a;
            case 12:
                kn20 kn20Var = (kn20) obj2;
                VkPollSearchParams vkPollSearchParams = ((cqb0.a) obj).a;
                PollFilterParams pollFilterParams = new PollFilterParams();
                pollFilterParams.b = vkPollSearchParams.d();
                City city = vkPollSearchParams.b;
                if (city != null) {
                    webCity = new WebCity();
                    webCity.b = city.b;
                    webCity.c = city.c;
                } else {
                    webCity = null;
                }
                pollFilterParams.c = webCity;
                pollFilterParams.d = vkPollSearchParams.c;
                pollFilterParams.e = vkPollSearchParams.d;
                kn20Var.invoke(pollFilterParams);
                return s3q0.a;
            case 13:
                l6c0 l6c0Var = (l6c0) obj2;
                List<ol60> list = ((m5c0) l6c0Var.b.getCurrentState()).h.b.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof z1c0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((z1c0) it.next()).h.h);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof vt80) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it3.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList4.add(x9v0Var);
                    }
                }
                l6c0Var.c(new d5c0.a(new yo60.i.a(arrayList4)));
                return s3q0.a;
            case 14:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "PostingToolbarButtonClose");
                qgi0.h(tgi0Var, ((enc0) obj2).c.getContext().getString(R.string.post_exit_posts_editing_content_description));
                return s3q0.a;
            case 15:
                cqc0 cqc0Var = (cqc0) obj2;
                olc0 olc0Var = (olc0) obj;
                List<ListFriends> list2 = olc0Var.h;
                boolean z = olc0Var.j;
                List<ProfileFriendItem> list3 = olc0Var.i;
                VkPaginationList<UserProfile> vkPaginationList = olc0Var.b;
                VkPaginationList<ProfileFriendItem> vkPaginationList2 = olc0Var.g;
                List<Integer> list4 = cqc0Var.q;
                PostingType postingType = cqc0Var.g;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list4) {
                    int intValue = ((Number) obj4).intValue();
                    List<ListFriends> list5 = list2;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator<T> it4 = list5.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((ListFriends) it4.next()).b == intValue) {
                                arrayList5.add(obj4);
                            }
                        }
                    }
                }
                cqc0Var.q = arrayList5;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Set<String> c = g620.f().e().c();
                boolean z2 = false;
                for (String str2 : c) {
                    List<ListFriends> list6 = list2;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator<T> it5 = list6.iterator();
                        while (it5.hasNext()) {
                            if (epx.f(String.valueOf(((ListFriends) it5.next()).b), str2)) {
                                break;
                            }
                        }
                    }
                    linkedHashSet.add(str2);
                    z2 = true;
                }
                if (z2) {
                    g620.f().e().B(izi0.g(c, linkedHashSet));
                }
                if (z2) {
                    cqc0Var.h.invoke(g620.f().getPrivacy().h());
                }
                boolean isEmpty = vkPaginationList2.b.isEmpty();
                boolean isEmpty2 = vkPaginationList.b.isEmpty();
                boolean z3 = (list2.isEmpty() || cqc0Var.q.isEmpty()) ? false : true;
                boolean z4 = (list3.isEmpty() || cqc0Var.p.isEmpty()) ? false : true;
                cqc0Var.k = new ss3(19, list2, cqc0Var);
                int i5 = cqc0.d.$EnumSwitchMapping$0[postingType.ordinal()];
                if (i5 == 1) {
                    cqc0Var.S0(new aj50(cqc0Var, 10));
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    if (i5 != 2 && i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cqc0Var.S0(new pf40(cqc0Var, i2));
                    s3q0 s3q0Var2 = s3q0.a;
                }
                if (z && ((postingType == PostingType.CLIP || postingType == PostingType.LIVE_RECORDING) && (cVar2 = cqc0Var.o) != null)) {
                    bwt0.p0(cVar2.n, true);
                    bwt0.p0(cVar2.b(), false);
                    bwt0.p0(cVar2.d(), false);
                    bwt0.p0(cVar2.e(), false);
                    f4m.t((int) cqc0Var.c.getResources().getDimension(R.dimen.clips_privacy_bottomsheet_unavailable_title_close_profile), cVar2.o);
                }
                o25.a().S(z);
                if (!isEmpty) {
                    cqc0Var.S0(new h57(21, cqc0Var, vkPaginationList2.b));
                } else if (postingType == PostingType.POST && !isEmpty2) {
                    cqc0Var.S0(new mi10(vkPaginationList.b, 16));
                } else if (postingType == PostingType.CLIP) {
                    cqc0.c cVar3 = cqc0Var.o;
                    if (cVar3 != null) {
                        bwt0.p0((ModalSettingsPrivacyOption) cVar3.B.getValue(), true);
                    }
                } else if (postingType == PostingType.LIVE_RECORDING && (cVar = cqc0Var.o) != null) {
                    bwt0.p0((ModalSettingsPrivacyOption) cVar.B.getValue(), true);
                }
                if (z3 || z4) {
                    cqc0Var.S0(new bqc0(cqc0Var.q, cqc0Var.p, list3, list2, cqc0Var));
                } else {
                    cqc0.c cVar4 = cqc0Var.o;
                    if (cVar4 != null) {
                        bwt0.p0(cVar4.g(), false);
                        bwt0.p0(cVar4.c(), true);
                    }
                }
                return s3q0.a;
            case 16:
                pvc0.b bVar = (pvc0.b) obj2;
                pvc0.b.a(bVar, new gd70(pvc0.this, i3));
                return s3q0.a;
            case 17:
                ((io.reactivex.rxjava3.disposables.c) obj2).dispose();
                return s3q0.a;
            case 18:
                qcy<Object>[] qcyVarArr = PublishFragment.Q;
                ((PublishFragment) obj2).fo().b(new kbe0((PrivacySetting) obj));
                return s3q0.a;
            case 19:
                return new v7h0.a(((tj50.a) obj).a(((o7h0) obj2).e, ao8.d));
            case 20:
                bth0 bth0Var = (bth0) obj2;
                int intValue2 = ((Integer) obj).intValue();
                VideoSearchFiltersImpl videoSearchFiltersImpl = bth0Var.v;
                int i6 = bth0Var.x[intValue2];
                videoSearchFiltersImpl.b = i6;
                videoSearchFiltersImpl.c = intValue2;
                videoSearchFiltersImpl.o = String.valueOf(i6);
                return s3q0.a;
            case 21:
                ((SearchSliderSuggestionVh) obj2).onClick((View) obj);
                return s3q0.a;
            case 22:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                i6i0 i6i0Var = ((SelectAlbumBottomSheet) obj2).j1;
                if (i6i0Var != null) {
                    i6i0Var.c.setEnabled(booleanValue);
                }
                return s3q0.a;
            case 23:
                v6j0 v6j0Var = (v6j0) obj2;
                bpn0 bpn0Var = v6j0Var.n1;
                bpn0 bpn0Var2 = v6j0Var.o1;
                k7j0 k7j0Var = (k7j0) obj;
                v6j0.c cVar5 = v6j0.p1;
                if (k7j0Var instanceof k7j0.a) {
                    v6j0Var.dismiss();
                    k7j0.a aVar = (k7j0.a) k7j0Var;
                    String str3 = aVar.a;
                    boolean z5 = aVar.b;
                    Context mo2getContext = v6j0Var.mo2getContext();
                    if (mo2getContext != null) {
                        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
                        videoFeatures.getClass();
                        if (com.vk.toggle.b.A.a(videoFeatures)) {
                            str3 = ((com.vk.video.ui.share.api.b) bpn0Var2.getValue()).c(str3);
                        }
                        Object systemService = mo2getContext.getSystemService("clipboard");
                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                        if (clipboardManager != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("VK link", str3));
                        }
                        if (v6j0Var.j1) {
                            dhr0.a.getClass();
                            context = dhr0.t(mo2getContext);
                        } else {
                            context = mo2getContext;
                        }
                        ikv0.a aVar2 = new ikv0.a(context);
                        float f = 28;
                        aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), new Size(iah0.a(f), iah0.a(f)), i2);
                        aVar2.u = new ikv0.d(mo2getContext.getString(R.string.video_share_dialog_link_copied), str, (ikv0.d.a) (objArr == true ? 1 : 0), 6);
                        pkv0.e(aVar2);
                        if (fnj.d(mo2getContext)) {
                            aVar2.k = 1;
                            aVar2.g(1);
                        }
                        pkv0.f(aVar2);
                        v7j0 v7j0Var = v6j0Var.k1;
                        if (v7j0Var != null) {
                            v7j0Var.c(v7j0Var.a(MobileOfficialAppsVideoStat$TypeVideoModalSharingClick.EventSubtype.COPY_LINK, z5));
                        }
                    }
                } else if (k7j0Var instanceof k7j0.c) {
                    v6j0Var.dismiss();
                    String str4 = ((k7j0.c) k7j0Var).a;
                    Context mo2getContext2 = v6j0Var.mo2getContext();
                    if (mo2getContext2 != null) {
                        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
                        videoFeatures2.getClass();
                        if (com.vk.toggle.b.A.a(videoFeatures2)) {
                            str4 = ((com.vk.video.ui.share.api.b) bpn0Var2.getValue()).b(str4, null);
                        }
                        VideoShareArguments videoShareArguments = v6j0Var.l1;
                        if (videoShareArguments == null) {
                            videoShareArguments = null;
                        }
                        int a = e7j0.a(videoShareArguments.e.b);
                        Bundle bundle = new Bundle();
                        VideoShareArguments videoShareArguments2 = v6j0Var.l1;
                        long j = (videoShareArguments2 == null ? null : videoShareArguments2).e.c;
                        if (videoShareArguments2 == null) {
                            videoShareArguments2 = null;
                        }
                        long j2 = videoShareArguments2.e.d;
                        bundle.putParcelable("attachments", new LinkAttachment(str4));
                        bundle.putString("link", str4);
                        VideoShareArguments videoShareArguments3 = v6j0Var.l1;
                        if (videoShareArguments3 == null) {
                            videoShareArguments3 = null;
                        }
                        bundle.putString("trackCode", videoShareArguments3.e.e);
                        VideoShareArguments videoShareArguments4 = v6j0Var.l1;
                        if (videoShareArguments4 == null) {
                            videoShareArguments4 = null;
                        }
                        if (videoShareArguments4.e.b == ShareItemType.EPISODE) {
                            bundle.putInt("type_link", 3);
                        }
                        AttachmentInfo attachmentInfo = new AttachmentInfo(a, j, j2, null, bundle);
                        tbj0 a2 = ((SharingComponent) bpn0Var.getValue()).F2().a(mo2getContext2);
                        a2.c = attachmentInfo;
                        a2.g();
                    }
                } else if (k7j0Var instanceof k7j0.d) {
                    v6j0Var.dismiss();
                    k7j0.d dVar = (k7j0.d) k7j0Var;
                    boolean z6 = dVar.d;
                    String str5 = dVar.b;
                    String str6 = dVar.c;
                    if (str6.equals("com.vkontakte.android")) {
                        VideoFile videoFile = v6j0Var.m1;
                        tbj0 a3 = ((SharingComponent) bpn0Var.getValue()).F2().a(v6j0Var.requireContext());
                        VideoShareArguments videoShareArguments5 = v6j0Var.l1;
                        if (videoShareArguments5 == null) {
                            videoShareArguments5 = null;
                        }
                        int a4 = e7j0.a(videoShareArguments5.e.b);
                        Bundle bundle2 = new Bundle();
                        VideoShareArguments videoShareArguments6 = v6j0Var.l1;
                        long j3 = (videoShareArguments6 == null ? null : videoShareArguments6).e.c;
                        long j4 = (videoShareArguments6 == null ? null : videoShareArguments6).e.d;
                        if (videoShareArguments6 == null) {
                            videoShareArguments6 = null;
                        }
                        bundle2.putString("trackCode", videoShareArguments6.e.e);
                        bundle2.putString("link", str5);
                        bundle2.putParcelable("attachments", videoFile != null ? new VideoAttachment(videoFile) : new LinkAttachment(str5));
                        a3.c = new AttachmentInfo(a4, j3, j4, null, bundle2);
                        a3.d = ((SharingComponent) bpn0Var.getValue()).v().j();
                        a3.o = true;
                        a3.c();
                        v7j0 v7j0Var2 = v6j0Var.k1;
                        if (v7j0Var2 != null) {
                            v7j0Var2.b(str6, z6);
                        }
                    } else {
                        VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
                        videoFeatures3.getClass();
                        if (com.vk.toggle.b.A.a(videoFeatures3)) {
                            str5 = ((com.vk.video.ui.share.api.b) bpn0Var2.getValue()).b(str5, null);
                        }
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", str5);
                        intent.setPackage(str6);
                        v6j0Var.startActivity(intent);
                        v7j0 v7j0Var3 = v6j0Var.k1;
                        if (v7j0Var3 != null) {
                            v7j0Var3.b(str6, z6);
                        }
                    }
                } else {
                    if (!(k7j0Var instanceof k7j0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v6j0Var.dismiss();
                }
                return s3q0.a;
            case 24:
                ShutterButton shutterButton = (ShutterButton) obj2;
                if (!shutterButton.q && shutterButton.p && !shutterButton.s && !shutterButton.u && !shutterButton.w) {
                    shutterButton.t = true;
                    shutterButton.s = true;
                    ShutterButton.a aVar3 = shutterButton.f;
                    if (aVar3 != null) {
                        aVar3.g(shutterButton.c);
                    }
                }
                return s3q0.a;
            case 25:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, ((d4k0.h) ((d4k0) obj2)).b, null, false, false, null, 1983);
            case 26:
                return ((Uri.Builder) obj).appendEncodedPath(((tyk0.a) obj2).i());
            case 27:
                StickerSettingsFeature stickerSettingsFeature = (StickerSettingsFeature) obj2;
                stickerSettingsFeature.T(new c.C1803c(stickerSettingsFeature.U()));
                return s3q0.a;
            case 28:
                k8l0 k8l0Var = (k8l0) obj2;
                g8l0 g8l0Var = k8l0Var.h;
                g8l0Var.getClass();
                g8l0Var.setItems(EmptyList.b);
                k8l0Var.g.dismiss();
                return s3q0.a;
            default:
                ((ncl0) obj2).c.set(true);
                return s3q0.a;
        }
    }

    public /* synthetic */ nt10(kn20 kn20Var, mub0 mub0Var) {
        this.b = 12;
        this.c = kn20Var;
    }

    public /* synthetic */ nt10(StorageEvent[] storageEventArr, Activity activity, n850 n850Var) {
        this.b = 7;
        this.c = storageEventArr;
    }
}
