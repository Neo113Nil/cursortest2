package xsna;

import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.Size;
import android.view.ViewGroup;
import android.view.Window;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.vk.api.comments.CommentsOrder;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.attachpicker.impl.fragment.video.VideoData;
import com.vk.billing.GoogleStorePurchasesManagerImpl;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.feature.music.holders.MusicShimmerVkMixVh;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryOtherVh;
import com.vk.clips.favorites.impl.ui.folders.content.d;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.notifications.settings.NotificationSettingsCategory;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.dto.video.VideoAlbum;
import com.vk.dzenarticle.impl.ui.view.ad.BaseTopAdView;
import com.vk.dzenarticle.impl.ui.view.ad.MiddleAdView;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.libvideo.bottomsheet.about.delegate.f;
import com.vk.log.L;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$SubTitleParams;
import com.vk.music.ui.subscription.BuyMusicSubscriptionComposeButtonKt;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.photos.root.albumssettings.presentation.view.AlbumsSettingsRecyclerPaginatedView;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.photos.root.selectalbum.domain.f;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.photos.ui.editalbum.domain.Mode;
import com.vk.photos.ui.editalbum.domain.PrivacySettingData;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.photos.ui.editalbum.presentation.EditAlbumPrivacyFragment;
import com.vk.pushes.NotificationUtils;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.multiaccount.api.f;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.avh0;
import xsna.b4;
import xsna.cor;
import xsna.cp20;
import xsna.cro;
import xsna.drz;
import xsna.f0r;
import xsna.h7u0;
import xsna.ikv0;
import xsna.l0d;
import xsna.m1s;
import xsna.o930;
import xsna.p8a0;
import xsna.q8a0;
import xsna.qfa0;
import xsna.qo20;
import xsna.wk50;
import xsna.xfg;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x042f, code lost:
    
        r13.e(5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04a0 A[LOOP:4: B:257:0x049a->B:259:0x04a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04e1 A[LOOP:5: B:265:0x04db->B:267:0x04e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04f9  */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.content.BroadcastReceiver, com.vk.music.ui.subscription.BuyMusicSubscriptionComposeButtonKt$NetworkStatusListener$1$1$receiver$1] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        xfg.a aVar;
        int i;
        String str;
        PrivacySettingData privacySettingData;
        PrivacySettingData privacySettingData2;
        PrivacySettingData privacySettingData3;
        int i2;
        Integer num;
        int e;
        Iterator it;
        xyr xyrVar;
        Object obj2;
        qo20 qo20Var;
        PostingUserMessage postingUserMessage;
        Window window;
        int i3 = this.b;
        int i4 = 10;
        int i5 = 5;
        int i6 = 1;
        Object obj3 = null;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i3) {
            case 0:
                f.a aVar2 = (f.a) obj4;
                q530 q530Var = aVar2.m;
                ProductVideoAttach productVideoAttach = (ProductVideoAttach) obj;
                Good good = (Good) ((LinkedHashMap) obj5).get(productVideoAttach);
                if (good != null) {
                    c530 b = e530.b(good, null);
                    ModerationRestriction a = q530Var.a(b);
                    if (productVideoAttach.b != ProductVideoAttach.StatusType.Adult || !q530Var.b(b, a)) {
                        aVar2.l.d(new b4.f.a(new rz00(good, CommonMarketStat$TypeRefSource.VIDEO_ATTACHED_ITEMS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532)));
                    }
                }
                return s3q0.a;
            case 1:
                AttachVideoFragment.b bVar = (AttachVideoFragment.b) obj5;
                ViewGroup viewGroup = (ViewGroup) obj4;
                VideoData videoData = (VideoData) bVar.m;
                VideoFile videoFile = videoData.b;
                if (videoFile != null) {
                    fxc0.B().Y().k(viewGroup.getContext(), videoFile, (r43 & 4) != 0 ? null : "videos_user", (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                } else {
                    VideoAlbum videoAlbum = videoData.c;
                    if (videoAlbum != null) {
                        bVar.o.invoke(videoAlbum);
                    }
                }
                return s3q0.a;
            case 2:
                Context context = (Context) obj5;
                final gzs gzsVar = (gzs) obj4;
                ?? r0 = new BroadcastReceiver() { // from class: com.vk.music.ui.subscription.BuyMusicSubscriptionComposeButtonKt$NetworkStatusListener$1$1$receiver$1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context2, Intent intent) {
                        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || intent.getBooleanExtra("noConnectivity", false)) {
                            return;
                        }
                        gzsVar.invoke();
                    }
                };
                context.registerReceiver(r0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return new BuyMusicSubscriptionComposeButtonKt.b(context, r0);
            case 3:
                ClickableHashtag clickableHashtag = (ClickableHashtag) obj;
                Context context2 = ((o1d) obj4).getContext();
                l0d.a aVar3 = ((l0d) obj5).d;
                if (aVar3 != null) {
                    aVar3.r();
                }
                ClipsRouter.j(g620.f().a(), context2, new ClipGridParams.OnlyId.Hashtag(clickableHashtag.e), false, null, null, 60);
                return Boolean.TRUE;
            case 4:
                com.vk.clips.favorites.impl.ui.folders.content.b bVar2 = (com.vk.clips.favorites.impl.ui.folders.content.b) obj4;
                if (((String) obj5) == null) {
                    bVar2.T(d.c.a.b);
                } else {
                    bVar2.T(d.c.b.b);
                }
                return s3q0.a;
            case 5:
                ClipsInterestsFragment.b bVar3 = (ClipsInterestsFragment.b) obj5;
                ClipsInterestsFragment clipsInterestsFragment = (ClipsInterestsFragment) obj4;
                int i7 = ClipsInterestsFragment.Y;
                bwt0.p0(bVar3.c, false);
                bwt0.p0(bVar3.g, false);
                bwt0.p0(bVar3.h, false);
                bwt0.p0(bVar3.j, true);
                bwt0.p0(bVar3.i, false);
                xn50.a.a(clipsInterestsFragment, ((ClipsInterestsViewState.e) obj).a, new u6(i4, clipsInterestsFragment, bVar3.f));
                return s3q0.a;
            case 6:
                xfg xfgVar = (xfg) obj4;
                CommentsOrder.Item item = (CommentsOrder.Item) ((xfg.b) obj5).m;
                if (item != null && (aVar = xfgVar.f) != null) {
                    aVar.a(item);
                }
                return s3q0.a;
            case 7:
                Context context3 = (Context) obj5;
                vmh vmhVar = (vmh) obj4;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                ArrayList<Artist> arrayList = extendedCommunityProfile.l2;
                if (arrayList == null || arrayList.isEmpty()) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new wr9(context3.getString(R.string.group_artists), Integer.valueOf(arrayList.size()), null, null, 28));
                Iterator<Artist> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Artist next = it2.next();
                    String str2 = next.c;
                    Image image = next.f;
                    if (image != null) {
                        i = 1;
                        ImageSize Cb = image.Cb(context3.getResources().getDimensionPixelSize(R.dimen.community_contact_avatar_size), true, false);
                        if (Cb != null) {
                            str = Cb.d.d;
                            arrayList2.add(new y7j(str2, null, str, R.drawable.vk_icon_music_mic_24, new ba(i, vmhVar, next), null, extendedCommunityProfile.a.c, "event_artist", 142));
                        }
                    } else {
                        i = 1;
                    }
                    str = null;
                    arrayList2.add(new y7j(str2, null, str, R.drawable.vk_icon_music_mic_24, new ba(i, vmhVar, next), null, extendedCommunityProfile.a.c, "event_artist", 142));
                }
                return arrayList2;
            case 8:
                int i8 = 2;
                CreateAlbumFragment createAlbumFragment = (CreateAlbumFragment) obj5;
                bpn0 bpn0Var = createAlbumFragment.V;
                bpn0 bpn0Var2 = createAlbumFragment.W;
                final kzo kzoVar = (kzo) obj4;
                Context context4 = kzoVar.c;
                com.vk.photos.ui.editalbum.domain.g gVar = (com.vk.photos.ui.editalbum.domain.g) obj;
                int i9 = CreateAlbumFragment.Z;
                if (gVar instanceof g.i) {
                    ((qfa0.a) bpn0Var2.getValue()).f();
                    Mode mode = ((g.i) gVar).a.g;
                    Mode.User user = mode instanceof Mode.User ? (Mode.User) mode : null;
                    if (user != null && (privacySettingData3 = user.c) != null) {
                        EditAlbumPrivacyFragment.a aVar4 = new EditAlbumPrivacyFragment.a();
                        aVar4.y(MobileOfficialAppsCoreNavStat$EventScreen.SETTINGS_PRIVACY_PHOTO_COMMENTS);
                        aVar4.z(createAlbumFragment.fo(privacySettingData3.b));
                        aVar4.g(8296, createAlbumFragment);
                    }
                } else if (gVar instanceof g.j) {
                    com.vk.photos.ui.editalbum.domain.h hVar = ((g.j) gVar).a;
                    ((qfa0.a) bpn0Var2.getValue()).d();
                    Mode mode2 = hVar.g;
                    Mode.User user2 = mode2 instanceof Mode.User ? (Mode.User) mode2 : null;
                    if (user2 != null && (privacySettingData2 = user2.b) != null) {
                        EditAlbumPrivacyFragment.a aVar5 = new EditAlbumPrivacyFragment.a();
                        aVar5.y(MobileOfficialAppsCoreNavStat$EventScreen.SETTINGS_PRIVACY_PHOTO);
                        aVar5.z(createAlbumFragment.fo(privacySettingData2.b));
                        aVar5.g(8295, createAlbumFragment);
                    }
                    Mode mode3 = hVar.g;
                    Mode.SystemAlbum systemAlbum = mode3 instanceof Mode.SystemAlbum ? (Mode.SystemAlbum) mode3 : null;
                    if (systemAlbum != null && (privacySettingData = systemAlbum.b) != null) {
                        PhotoAlbum photoAlbum = hVar.c;
                        if (photoAlbum == null || photoAlbum.b != -9000) {
                            EditAlbumPrivacyFragment.a aVar6 = new EditAlbumPrivacyFragment.a();
                            aVar6.y(MobileOfficialAppsCoreNavStat$EventScreen.SETTINGS_PRIVACY_PHOTO);
                            aVar6.z(createAlbumFragment.fo(privacySettingData.b));
                            aVar6.g(8295, createAlbumFragment);
                        } else {
                            ((oga0) bpn0Var.getValue()).h(createAlbumFragment.kn());
                        }
                    }
                } else if (gVar instanceof g.a) {
                    createAlbumFragment.Mf(-1, new Intent().putExtra("album", ((g.a) gVar).a));
                } else if (gVar instanceof g.c) {
                    createAlbumFragment.Mf(-1, new Intent().putExtra("album", ((g.c) gVar).a));
                } else if (gVar.equals(g.d.a)) {
                    Intent intent = new Intent();
                    List list = (List) createAlbumFragment.X.getValue();
                    createAlbumFragment.Mf(0, intent.putExtra("photos", list != null ? p4g.q(list) : null));
                } else if (gVar instanceof g.C1518g) {
                    PhotoAlbum photoAlbum2 = ((g.C1518g) gVar).a;
                    int i10 = (!photoAlbum2.x || photoAlbum2.w) ? R.string.delete_album_dialog_description : R.string.delete_album_dialog_description_flow;
                    int i11 = h7u0.p;
                    h7u0.a c = h7u0.b.c(context4);
                    c.g0(R.string.delete_album_dialog_title);
                    c.U(i10);
                    c.c0(R.string.delete_album_dialog_delete, new DialogInterface.OnClickListener() { // from class: xsna.jzo
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            kzo.this.b.invoke(a.c.b);
                        }
                    });
                    c.W(R.string.delete_album_dialog_cancel, null);
                    c.m();
                } else if (gVar.equals(g.b.a)) {
                    createAlbumFragment.Mf(-1, new Intent().putExtra("album", (Parcelable) null));
                } else if (gVar instanceof g.f) {
                    xt9 xt9Var = ((g.f) gVar).a;
                    int i12 = h7u0.p;
                    h7u0.a c2 = h7u0.b.c(context4);
                    c2.g0(R.string.create_album_close_confirmation_title);
                    c2.U(R.string.create_album_close_confirmation_message);
                    c2.c0(R.string.create_album_close_confirmation_ok, new kp3(xt9Var, i8));
                    c2.W(R.string.create_album_close_confirmation_cancel, null);
                    c2.m();
                } else if (gVar instanceof g.h) {
                    g.h hVar2 = (g.h) gVar;
                    int i13 = h7u0.p;
                    h7u0.a c3 = h7u0.b.c(context4);
                    c3.g0(R.string.privacy_change_title);
                    c3.a.f = enj.f(R.plurals.pinned_photos_be_hidden, hVar2.a, context4);
                    c3.c0(R.string.confirm, new izo(hVar2, 0));
                    c3.W(R.string.delete_album_dialog_cancel, null);
                    c3.m();
                } else {
                    int i14 = 0;
                    if (gVar instanceof g.k) {
                        g.k kVar = (g.k) gVar;
                        i0q0.d(kVar.b, new i6k(i14, kVar, createAlbumFragment));
                    } else {
                        if (!gVar.equals(g.e.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((oga0) bpn0Var.getValue()).l(createAlbumFragment.requireContext());
                    }
                }
                return s3q0.a;
            case 9:
                List list2 = (List) obj;
                com.vk.core.compose.component.datetime.d dVar = new com.vk.core.compose.component.datetime.d((k9x) obj5, (fai0) obj4, ((Boolean) list2.get(0)).booleanValue());
                com.vk.core.compose.component.datetime.m mVar = dVar.a;
                mVar.a().h((String) list2.get(1));
                s3q0 s3q0Var = s3q0.a;
                ((zak0) mVar.a).setValue(mVar.a());
                return dVar;
            case 10:
                com.vk.im.engine.models.dialogs.b bVar4 = (com.vk.im.engine.models.dialogs.b) obj;
                long j = bVar4.b;
                vjm vjmVar = bVar4.d;
                String[] strArr = {String.valueOf(vjmVar.a()), String.valueOf((Integer) obj5), String.valueOf(j)};
                tgl0 tgl0Var = ((hpm) obj4).b;
                tgl0Var.b().execSQL("UPDATE dialogs SET sort_id_server = ?, timestamp = COALESCE(?, timestamp) WHERE id = ?", strArr);
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_server = ? WHERE x_dialog_id = ? AND x_folder_id = ?", new Object[]{Long.valueOf(vjmVar.a()), Long.valueOf(j), -1});
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_server = ? WHERE x_dialog_id = ? AND x_folder_id != ?", new Object[]{Integer.valueOf(vjmVar.c), Long.valueOf(j), -1});
                return s3q0.a;
            case 11:
                mm3 mm3Var = (mm3) obj5;
                izs<? super cro, s3q0> izsVar = (izs) obj4;
                MiddleAdView middleAdView = (MiddleAdView) obj;
                MediaAdView mediaAdView = middleAdView.i;
                zu50 zu50Var = mm3Var.b;
                fe0 fe0Var = mm3Var.c;
                middleAdView.setNativeAd(zu50Var);
                middleAdView.setAdChoicesController(fe0Var);
                middleAdView.l = mm3Var.k;
                middleAdView.setOnAction(izsVar);
                VkText vkText = middleAdView.f;
                ey2.i(vkText, mm3Var.d);
                VkText vkText2 = middleAdView.g;
                ey2.i(vkText2, mm3Var.e);
                VkButton vkButton = middleAdView.h;
                vkButton.setText(mm3Var.j);
                VkText vkText3 = middleAdView.k;
                Context context5 = middleAdView.getContext();
                String str3 = mm3Var.f;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = mm3Var.g;
                vkText3.setText(context5.getString(R.string.top_ad_banner_label, str3, str4 != null ? str4 : ""));
                zu50Var.r = 5;
                zu50Var.l = new sl20(izsVar, zu50Var);
                kiw kiwVar = mm3Var.h;
                boolean z = mm3Var.i;
                IconAdView iconAdView = middleAdView.j;
                if (kiwVar == null) {
                    f4m.j(iconAdView);
                    f4m.j(mediaAdView);
                } else if (z) {
                    int i15 = kiwVar.b;
                    float f = 1.7777778f;
                    if (i15 != 0 && (i2 = kiwVar.c) != 0) {
                        f = swe0.f(i15 / i2, 0.22222222f, 1.7777778f);
                    }
                    bwt0.r0((int) (e3m.a(R.dimen.ad_media_height, middleAdView.getContext()) * f), mediaAdView.getImageView());
                    mediaAdView.getImageView().setImageBitmap(kiwVar.a());
                    mediaAdView.getImageView().setVisibility(0);
                    mediaAdView.setVisibility(0);
                    f4m.j(iconAdView);
                } else {
                    iconAdView.getImageView().setImageBitmap(kiwVar.a());
                    iconAdView.setVisibility(0);
                    mediaAdView.setVisibility(4);
                }
                jjc.g(vkText3, new dda(fe0Var, zu50Var, vkText3, i5));
                fe0Var.d = new BaseTopAdView.a(middleAdView.l, middleAdView.k, cro.d.b, cro.h.b);
                zu50Var.h(middleAdView.m, e43.l(vkText, vkText2, vkButton, mediaAdView, middleAdView));
                return s3q0.a;
            case 12:
                ((com.vk.photos.ui.editalbum.domain.c) obj5).T(new e.i(new PrivacySettingData(((a.k) obj4).b, "")));
                return s3q0.a;
            case 13:
                ((f0r.b) obj5).h((wk50.a) obj4, (Throwable) obj);
                return s3q0.a;
            case 14:
                m1s m1sVar = (m1s) obj5;
                drz.a aVar7 = (drz.a) obj4;
                v1s v1sVar = (v1s) obj;
                LinkedHashMap linkedHashMap = v1sVar.b;
                FolderType folderType = m1sVar.l;
                if (folderType != null) {
                    Iterator it3 = ((Map) aVar7.a).values().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (((rpm) obj2).c.k() == folderType.k()) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    rpm rpmVar = (rpm) obj2;
                    if (rpmVar != null) {
                        num = Integer.valueOf(rpmVar.a);
                        Collection<rpm> values = ((Map) aVar7.a).values();
                        ArrayList arrayList3 = new ArrayList(c5g.u(values, 10));
                        for (rpm rpmVar2 : values) {
                            String str5 = rpmVar2.b;
                            int i16 = rpmVar2.a;
                            arrayList3.add(new m1s.a(i16, str5, rpmVar2.c, m1s.s(v1sVar.e.get(Integer.valueOf(i16)))));
                        }
                        e = on00.e(c5g.u(arrayList3, 10));
                        if (e < 16) {
                            e = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                            Object next2 = it.next();
                            linkedHashMap2.put(Integer.valueOf(((m1s.a) next2).a), next2);
                        }
                        xyrVar = (m1s.a) linkedHashMap2.get(Integer.valueOf(num == null ? num.intValue() : v1sVar.d.getId()));
                        if (xyrVar == null) {
                            xyrVar = (xyr) j5g.X(linkedHashMap.values());
                        }
                        xyr xyrVar2 = xyrVar;
                        if (num != null) {
                            m1sVar.l = null;
                        }
                        String str6 = m1s.m;
                        return v1s.a(v1sVar, linkedHashMap2, j5g.u0(j5g.O0(linkedHashMap2.values()), j5g.O0(linkedHashMap.values())), xyrVar2, null, !linkedHashMap2.isEmpty(), false, 82);
                    }
                }
                num = null;
                Collection<rpm> values2 = ((Map) aVar7.a).values();
                ArrayList arrayList32 = new ArrayList(c5g.u(values2, 10));
                while (r3.hasNext()) {
                }
                e = on00.e(c5g.u(arrayList32, 10));
                if (e < 16) {
                }
                LinkedHashMap linkedHashMap22 = new LinkedHashMap(e);
                it = arrayList32.iterator();
                while (it.hasNext()) {
                }
                xyrVar = (m1s.a) linkedHashMap22.get(Integer.valueOf(num == null ? num.intValue() : v1sVar.d.getId()));
                if (xyrVar == null) {
                }
                xyr xyrVar22 = xyrVar;
                if (num != null) {
                }
                String str62 = m1s.m;
                return v1s.a(v1sVar, linkedHashMap22, j5g.u0(j5g.O0(linkedHashMap22.values()), j5g.O0(linkedHashMap.values())), xyrVar22, null, !linkedHashMap22.isEmpty(), false, 82);
            case 15:
                GoogleStorePurchasesManagerImpl.b bVar5 = (GoogleStorePurchasesManagerImpl.b) obj5;
                Map map = (Map) obj4;
                k27 k27Var = (k27) obj;
                BillingResult billingResult = k27Var.a;
                List<ProductDetails> list3 = k27Var.b;
                try {
                } catch (Exception e2) {
                    L.f("Billing : PurchasesManager", "#getGooglePlayPrices(): Error appkit_loading prices from Google Play", e2);
                } finally {
                }
                if (billingResult.getResponseCode() != 0) {
                    if (bVar5 != null) {
                        bVar5.e(billingResult.getResponseCode());
                    }
                    return s3q0.a;
                }
                List<ProductDetails> list4 = list3;
                if (list4 != null && !list4.isEmpty()) {
                    if (list3.size() < map.size() && bVar5 != null) {
                        bVar5.d(map.size() - list3.size());
                    }
                    for (ProductDetails productDetails : list3) {
                        mge0 mge0Var = (mge0) map.get(productDetails.getProductId());
                        if (mge0Var != null) {
                            String productType = productDetails.getProductType();
                            int hashCode = productType.hashCode();
                            if (hashCode != 3541555) {
                                if (hashCode == 100343516 && productType.equals("inapp")) {
                                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                                    if (oneTimePurchaseOfferDetails != null) {
                                        mge0Var.cb(nmi0.a(oneTimePurchaseOfferDetails, productDetails.getTitle()));
                                        if (bVar5 != null) {
                                            bVar5.f(mge0Var);
                                        }
                                    } else if (bVar5 != null) {
                                        bVar5.e(5);
                                    }
                                }
                            } else if (productType.equals("subs")) {
                                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
                                if ((subscriptionOfferDetails != null ? (ProductDetails.SubscriptionOfferDetails) j5g.a0(subscriptionOfferDetails) : null) != null) {
                                    mge0Var.cb(nmi0.b(productDetails.getTitle(), subscriptionOfferDetails));
                                    if (bVar5 != null) {
                                        bVar5.f(mge0Var);
                                    }
                                } else if (bVar5 != null) {
                                    bVar5.e(5);
                                }
                            }
                        }
                    }
                    return s3q0.a;
                }
                return s3q0.a;
            case 16:
                ((l7v) obj5).d.remove((String) obj4);
                return s3q0.a;
            case 17:
                to20 to20Var = (to20) obj5;
                po20 po20Var = (po20) obj4;
                cp20 cp20Var = (cp20) obj;
                if (epx.f(cp20Var, cp20.c.a)) {
                    qo20Var = qo20.e.a;
                } else if (epx.f(cp20Var, cp20.a.a)) {
                    qo20Var = qo20.a.a;
                } else {
                    if (!epx.f(cp20Var, cp20.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qo20Var = qo20.b.a;
                }
                po20Var.a(qo20Var);
                if (epx.f(cp20Var, cp20.a.a) || epx.f(cp20Var, cp20.b.a)) {
                    try {
                        to20Var.a();
                    } catch (Throwable th) {
                        com.vk.metrics.eventtracking.b.a.q(th);
                    }
                }
                return s3q0.a;
            case 18:
                ((o930) obj5).e.invoke(((o930.a) obj4).m);
                return s3q0.a;
            case 19:
                UserId userId = (UserId) obj5;
                i340 i340Var = (i340) obj4;
                ArrayList arrayList4 = new ArrayList((List) obj);
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next3 = it4.next();
                        if (epx.f(((f.a) next3).a().b, userId)) {
                            obj3 = next3;
                        }
                    }
                }
                f.a aVar8 = (f.a) obj3;
                if (aVar8 != null) {
                    arrayList4.remove(aVar8);
                    i340Var.g.b(arrayList4);
                    return io.reactivex.rxjava3.core.x.k(aVar8);
                }
                return io.reactivex.rxjava3.core.x.i(new IllegalStateException("MultiAccountRepository.onSessionUnavailable: user (" + userId + ") was not found"));
            case 20:
                Object Ab = ((CatalogExtendedData) obj5).Ab(((CatalogBlock) obj4).c, (String) obj);
                if (Ab instanceof CatalogLink) {
                    return (CatalogLink) Ab;
                }
                return null;
            case 21:
                ((MusicShimmerVkMixVh) obj5).a((Rect) obj4);
                return s3q0.a;
            case 22:
                kj70 kj70Var = (kj70) obj5;
                ArrayList arrayList5 = (ArrayList) obj4;
                JSONObject jSONObject = (JSONObject) obj;
                int i17 = com.vk.pushes.a.b;
                Context context6 = e43.a;
                if (context6 == null) {
                    context6 = null;
                }
                ca70 ca70Var = ca70.a;
                NotificationManager f2 = ca70.f(context6);
                int i18 = 9;
                cor.a aVar9 = new cor.a(dli0.d(new ulp0(rli0.j(rl3.D(kj70Var.a), new wxd(arrayList5, i6)), new z6u(i18))));
                int i19 = 0;
                while (aVar9.hasNext()) {
                    NotificationSettingsCategory notificationSettingsCategory = (NotificationSettingsCategory) aVar9.next();
                    NotificationChannel notificationChannel = f2.getNotificationChannel(notificationSettingsCategory.b);
                    if (notificationChannel != null) {
                        boolean z2 = notificationChannel.getImportance() != 0;
                        boolean z3 = !"off".equals(notificationSettingsCategory.h);
                        if (notificationSettingsCategory.zb() && z2 != z3 && !z2) {
                            jSONObject.put(notificationSettingsCategory.g, "off");
                            i19 = 1;
                        }
                    }
                }
                x870 x870Var = x870.a;
                boolean e3 = com.vk.pushes.a.e(f2, "private_messages_ver2", NotificationUtils.Type.PrivateMessages, jSONObject);
                boolean e4 = com.vk.pushes.a.e(f2, "group_chats_ver2", NotificationUtils.Type.ChatMessages, jSONObject);
                boolean e5 = com.vk.pushes.a.e(f2, RTCStatsConstants.KEY_CHANNELS, NotificationUtils.Type.VkAppChannels, jSONObject);
                if (!e3 && !e4 && !e5) {
                    i6 = 0;
                }
                if (i19 == 0) {
                    i19 = i6;
                }
                if (i19 != 0) {
                    is isVar = new is("account.setPushSettings");
                    isVar.K("settings", jSONObject.toString());
                    rsg0.y0(isVar, null, null, 3).subscribe(new a970(new s6x(14), 0), new tl30(new amp(17), i18));
                }
                return s3q0.a;
            case 23:
                ((izs) obj5).invoke((q8a0.a.C3553a) ((p8a0.b) obj4).m);
                return s3q0.a;
            case 24:
                String str7 = (String) obj;
                ((wh50) obj4).setValue(str7);
                ((izs) obj5).invoke(str7);
                return s3q0.a;
            case 25:
                ((yxu) obj5).b((Target) ((ddc0) obj4).m);
                return s3q0.a;
            case 26:
                etv0 etv0Var = (etv0) obj;
                hb40 hb40Var = ((enc0) obj5).U;
                ActionsAvailabilityState.Availability availability = ((dpc0) obj4).c;
                PostingAction.Navigation.NextStep nextStep = PostingAction.Navigation.NextStep.b;
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    hb40Var.invoke(nextStep);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    hb40Var.invoke(new PostingAction.ShowMessage(postingUserMessage, nextStep, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                s3q0 s3q0Var2 = s3q0.a;
                hb40Var.invoke(PostingAction.Hints.RemoveNextStepButtonHint.b);
                etv0Var.b(false);
                return s3q0.a;
            case 27:
                Podcast podcast = (Podcast) obj5;
                return zuh0.a((zuh0) obj, new avh0.c(null, podcast != null ? podcast.f : null, "", 13), new bvh0(podcast != null ? podcast.d : null, podcast != null ? Boolean.valueOf(podcast.n) : null), new SearchHistoryItemViewParams$SubTitleParams(((SearchHistoryOtherVh) obj4).e(R.string.music_search_history_podcast, podcast != null ? podcast.j : null), null), new SearchHistoryItemViewParams$ActionIconParams(SearchHistoryItemViewParams$ActionIconParams.IconType.Chevron, false, null, 14));
            case 28:
                SelectAlbumBottomSheet selectAlbumBottomSheet = (SelectAlbumBottomSheet) obj5;
                n6i0 n6i0Var = (n6i0) obj4;
                AlbumsSettingsRecyclerPaginatedView albumsSettingsRecyclerPaginatedView = n6i0Var.e;
                com.vk.photos.root.selectalbum.domain.f fVar = (com.vk.photos.root.selectalbum.domain.f) obj;
                int i20 = SelectAlbumBottomSheet.p1;
                if (fVar.equals(f.a.a)) {
                    selectAlbumBottomSheet.Qn(true);
                    selectAlbumBottomSheet.hide();
                } else if (fVar instanceof f.b) {
                    Dialog dialog = selectAlbumBottomSheet.s;
                    if (dialog != null && (window = dialog.getWindow()) != null) {
                        String g = j03.g(selectAlbumBottomSheet.mo2getContext(), null, R.string.error);
                        ikv0.a aVar10 = new ikv0.a(selectAlbumBottomSheet.requireContext());
                        aVar10.t = new ikv0.c.C3058c(R.drawable.vk_icon_warning_triangle_outline_28, Integer.valueOf(R.attr.vk_ui_accent_orange), (Size) null, 12);
                        aVar10.u = new ikv0.d(g, (String) null, (ikv0.d.a) null, 6);
                        aVar10.b().d(window);
                    }
                } else if (fVar instanceof f.e) {
                    izs<? super PhotoAlbumWrapper, s3q0> izsVar2 = selectAlbumBottomSheet.i1;
                    if (izsVar2 != null) {
                        izsVar2.invoke(((f.e) fVar).a);
                    }
                    selectAlbumBottomSheet.Qn(true);
                    selectAlbumBottomSheet.hide();
                } else if (fVar.equals(f.c.a)) {
                    selectAlbumBottomSheet.On(3);
                    n6i0Var.i.c = 1.0f;
                    albumsSettingsRecyclerPaginatedView.getRecyclerView().invalidateItemDecorations();
                    albumsSettingsRecyclerPaginatedView.getRecyclerView().invalidateItemDecorations();
                } else {
                    if (!fVar.equals(f.d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    albumsSettingsRecyclerPaginatedView.getRecyclerView().invalidateItemDecorations();
                }
                return s3q0.a;
            default:
                s2u0 s2u0Var = (s2u0) obj;
                ((izs) obj5).invoke(new ShortVideoListView.d.C0465d(((ShortVideoListView.e) obj4).b, s2u0Var.b(), s2u0Var.a()));
                return s3q0.a;
        }
    }
}
