package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicCurator;
import com.vk.catalog2.feature.music.ui.holder.MusicCuratorCatalogRootVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Curator;
import com.vk.dto.music.Playlist;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;
import com.vk.im.reactions.impl.assets.a;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.newsfeed.posting.music_picker.domain.model.SnippetOnboardingState;
import com.vk.permission.PermissionHelper;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stickers.settings.j;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import one.video.controls20.SimpleControlsView;
import org.chromium.net.NetError;
import ru.ok.android.webrtc.signaling.transport.log.LogThrottler;
import ru.ok.android.webrtc.signaling.transport.log.SignalingLogger;
import xsna.aq;
import xsna.doh0;
import xsna.gm50;
import xsna.hn90;
import xsna.ikv0;
import xsna.qr60;
import xsna.roj0;
import xsna.tra0;
import xsna.uam0;
import xsna.ue50;
import xsna.wrc0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ba40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ba40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0189, code lost:
    
        if (r6 <= r1.j) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
    
        if (r4 != xsna.by9.Remove) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.util.Size, com.vk.core.view.components.button.VkButton$Appearance, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.vk.catalog2.common.ui.holders.api.CatalogViewHolder, java.lang.Object] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List<CatalogSection> list;
        CatalogSection catalogSection;
        String str;
        String str2;
        ma40 ma40Var;
        String string;
        String string2;
        String string3;
        int i;
        r2 = true;
        r2 = true;
        boolean z = true;
        ?? r4 = 0;
        r4 = 0;
        switch (this.b) {
            case 0:
                com.vk.catalog2.feature.music.configuration.a aVar = (com.vk.catalog2.feature.music.configuration.a) this.c;
                Object obj2 = ((io.reactivex.rxjava3.core.p) obj).a;
                if (obj2 == null || (obj2 instanceof NotificationLite.b)) {
                    obj2 = null;
                }
                hda hdaVar = (hda) obj2;
                Object obj3 = hdaVar != null ? hdaVar.a : null;
                CatalogCatalog catalogCatalog = obj3 instanceof CatalogCatalog ? (CatalogCatalog) obj3 : null;
                if (catalogCatalog != null && (list = catalogCatalog.b) != null && (catalogSection = (CatalogSection) j5g.a0(list)) != null && (str = catalogSection.b) != null) {
                    x2b0.c((x2b0) aVar.S.getValue(), str, null, 14);
                }
                return s3q0.a;
            case 1:
                MusicCuratorCatalogRootVh musicCuratorCatalogRootVh = (MusicCuratorCatalogRootVh) this.c;
                sa80 sa80Var = (sa80) obj;
                ArrayList<UIBlock> arrayList = sa80Var.a.y;
                UIBlock uIBlock = arrayList != null ? (UIBlock) j5g.a0(arrayList) : null;
                UIBlockMusicCurator uIBlockMusicCurator = uIBlock instanceof UIBlockMusicCurator ? (UIBlockMusicCurator) uIBlock : null;
                ?? r5 = musicCuratorCatalogRootVh.q;
                if (uIBlockMusicCurator == null && (str2 = musicCuratorCatalogRootVh.p) != null && str2.equals(sa80Var.a.b)) {
                    Serializer.c<UIBlockMusicCurator> cVar = UIBlockMusicCurator.CREATOR;
                    r5.N6(new UIBlockMusicCurator(new com.vk.catalog2.common.dto.api.ui.a("", "", CatalogViewType.BANNER, CatalogDataType.DATA_TYPE_CURATOR, "", UserId.d, EmptyList.b, EmptySet.b, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, CatalogLaunchOrigin.UNKNOWN, 3840), null, new Curator("", null, null, null, null, false, false, null, 144, null), null));
                } else if (uIBlockMusicCurator != null) {
                    r5.N6(uIBlockMusicCurator);
                }
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((Playlist) obj).b == ((Playlist) this.c).b);
            case 3:
                qu40 qu40Var = (qu40) this.c;
                MusicPickerState musicPickerState = (MusicPickerState) obj;
                me50 me50Var = qu40Var.f;
                wu40 wu40Var = qu40Var.e;
                List<MusicDto> list2 = musicPickerState.d;
                List<MusicPickerList> list3 = musicPickerState.j;
                MusicDto musicDto = musicPickerState.g;
                List<MusicDto> list4 = musicPickerState.f;
                boolean z2 = !list2.isEmpty() && list4.isEmpty();
                boolean z3 = musicPickerState.e != null && musicDto == null;
                boolean z4 = (musicDto == null && list4.isEmpty()) ? false : true;
                boolean z5 = list4.size() == 1;
                boolean z6 = z5 && musicPickerState.n;
                boolean z7 = wu40Var.a;
                boolean z8 = z7 ? z4 || z3 || z2 : z4;
                String e = z7 ? y8g0.e(R.string.music_picker_hint_multiselect) : y8g0.e(R.string.music_picker_hint);
                if (z6) {
                    MusicDto musicDto2 = (MusicDto) j5g.Y(list4);
                    me50Var.getClass();
                    String e2 = y8g0.e(R.string.music_picker_snippet_subtitle);
                    String str3 = musicDto2.e;
                    ma40Var = new ma40(gpc0.a(musicDto2), str3.length() == 0 ? y8g0.e(R.string.posting_step2_empty_music_button_content_description) : y8g0.f(R.string.posting_step2_music_button_content_description, str3), musicDto2.g, e2, musicDto2.j, true, false);
                } else {
                    if (z7 && (musicDto != null || !list4.isEmpty())) {
                        if (musicDto != null) {
                            me50Var.getClass();
                            r4 = me50.a(musicDto);
                        } else {
                            me50Var.getClass();
                            r4 = me50.b(list4);
                        }
                    }
                    ma40Var = r4;
                }
                boolean z9 = (z7 && z4) ? false : true;
                boolean z10 = z5 ? true : z7 ? z4 : false;
                MusicPickerList musicPickerList = (MusicPickerList) j5g.k0(list3);
                boolean z11 = z7 || (musicPickerList instanceof MusicPickerList.Tracks) || (musicPickerList instanceof MusicPickerList.SelectedPlaylist);
                boolean z12 = list4.size() > 1;
                boolean z13 = !z7 && (((MusicPickerList) j5g.k0(list3)) instanceof MusicPickerList.SelectedPlaylist);
                String str4 = musicPickerState.o;
                return new cc40(z11, ma40Var, z10, z5, z9, e, z8, z12, z13, z6, str4, (str4 == null || str4.length() == 0 || musicPickerState.p != SnippetOnboardingState.TOOLTIP) ? false : true);
            case 4:
                ((bf50) this.c).c.invoke(ue50.d.b);
                return s3q0.a;
            case 5:
                return new bq((List) obj, ((aq.b) this.c).b);
            case 6:
                ps50 ps50Var = (ps50) this.c;
                ModalActionSheetListItem modalActionSheetListItem = (ModalActionSheetListItem) obj;
                int i2 = modalActionSheetListItem.a;
                String str5 = modalActionSheetListItem.d;
                if (i2 != -23) {
                    Bundle bundle = ps50Var.b;
                    SdkVideoFile sdkVideoFile = bundle != null ? (SdkVideoFile) bundle.getParcelable("ADS_VIDEO_ITEM") : null;
                    if (sdkVideoFile != null) {
                        Intent intent = new Intent("com.vkontakte.android.CLIPS_AD_REPORTED");
                        intent.putExtra("ad_video", sdkVideoFile);
                        intent.putExtra("adchoice_alias", str5);
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        n2i0.a(context, hf8.a, intent);
                        ps50Var.b(i2);
                    }
                    Bundle bundle2 = ps50Var.b;
                    String string4 = bundle2 != null ? bundle2.getString("ADS_UNIQUE_KEY") : null;
                    if (string4 != null) {
                        Intent intent2 = new Intent("com.vkontakte.android.CLIPS_MARKET_AD_REPORTED");
                        intent2.putExtra("ad_unique_key", string4);
                        intent2.putExtra("adchoice_alias", str5);
                        Context context2 = e43.a;
                        n2i0.a(context2 != null ? context2 : null, hf8.a, intent2);
                        ps50Var.b(i2);
                    }
                }
                return s3q0.a;
            case 7:
                sr80 sr80Var = (sr80) this.c;
                Context context3 = sr80Var.a.get();
                if (context3 == null) {
                    return s3q0.a;
                }
                ikv0.a aVar2 = new ikv0.a(context3);
                aVar2.e = 10000L;
                aVar2.u = new ikv0.d(context3.getString(R.string.music_catalog_error_no_network_new_flow), (String) r4, new ikv0.d.a(context3.getString(R.string.music_catalog_error_no_network_open_downloads_new_flow), r4, new bl30(context3, 6), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2);
                aVar2.t = new ikv0.c.C3058c(new gko(R.drawable.vk_icon_plane_outline_24), new x7g(R.attr.vk_ui_icon_accent), (Size) r4, 12);
                sr80Var.c = aVar2.n();
                return s3q0.a;
            case 8:
                Object obj4 = ((vl90) this.c).o;
                ((tl90) (obj4 != null ? obj4 : null)).I();
                return s3q0.a;
            case 9:
                ((PastAsrListFragment) this.c).Q.a(hn90.g.a);
                return s3q0.a;
            case 10:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.c;
                int intValue = ((Integer) obj).intValue();
                com.vk.photos.root.photoflow.presentation.j jVar = photoFlowFragment.R;
                return (jVar != null ? jVar : null).a(intValue);
            case 11:
                ((nma0) this.c).e.vn();
                return s3q0.a;
            case 12:
                PopupStickersChatSettingsModel popupStickersChatSettingsModel = (PopupStickersChatSettingsModel) obj;
                ((myb0) this.c).f(popupStickersChatSettingsModel);
                return popupStickersChatSettingsModel;
            case 13:
                dcc0 dcc0Var = (dcc0) this.c;
                List<AlbumEntry> list5 = (List) obj;
                View view = dcc0Var.b.X;
                if (view != null) {
                    bwt0.p0(view, false);
                }
                ArrayList arrayList2 = new ArrayList(list5);
                dcc0Var.k = list5;
                if (arrayList2.isEmpty()) {
                    FragmentActivity activity = dcc0Var.b.getActivity();
                    arrayList2.add(new AlbumEntry(NetError.ERR_CONNECTION_RESET, (activity == null || (string3 = activity.getString(R.string.all_photos)) == null) ? "" : string3, null, false, 0, null, 60, null));
                    FragmentActivity activity2 = dcc0Var.b.getActivity();
                    arrayList2.add(new AlbumEntry(NetError.ERR_CONNECTION_REFUSED, (activity2 == null || (string2 = activity2.getString(R.string.picker_tab_vk_photo)) == null) ? "" : string2, null, false, 0, null, 60, null));
                    dcc0Var.j = 0;
                    ik90 ik90Var = dcc0Var.d;
                    if (ik90Var == null || !PermissionHelper.o(ik90Var.b)) {
                        dcc0Var.b.lo(false);
                        dcc0Var.b.jo(true);
                    } else {
                        dcc0Var.b.lo(true);
                        dcc0Var.b.jo(false);
                        dcc0Var.b.ko(Collections.singletonList(jk90.a), true);
                    }
                } else {
                    FragmentActivity activity3 = dcc0Var.b.getActivity();
                    arrayList2.add(new AlbumEntry(NetError.ERR_CONNECTION_REFUSED, (activity3 == null || (string = activity3.getString(R.string.picker_tab_vk_photo)) == null) ? "" : string, null, false, 0, null, 60, null));
                    int i3 = (dcc0Var.j >= arrayList2.size() || ((AlbumEntry) arrayList2.get(dcc0Var.j)).b == -102) ? 0 : dcc0Var.j;
                    dcc0Var.j = i3;
                    dcc0Var.h((AlbumEntry) arrayList2.get(i3), i3, false);
                    dcc0Var.b.lo(true);
                    dcc0Var.b.jo(false);
                }
                PostingAttachGalleryFragment postingAttachGalleryFragment = dcc0Var.b;
                AppCompatSpinner appCompatSpinner = postingAttachGalleryFragment.V;
                if (appCompatSpinner != null) {
                    bwt0.p0(appCompatSpinner, true);
                }
                TextView textView = postingAttachGalleryFragment.W;
                if (textView != null) {
                    bwt0.p0(textView, false);
                }
                d24 d24Var = dcc0Var.b.T;
                if (d24Var != null) {
                    ArrayList arrayList3 = d24Var.b;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    d24Var.notifyDataSetChanged();
                }
                return j5g.O0(arrayList2);
            case 14:
                isc0 isc0Var = (isc0) this.c;
                List<ol60> list6 = ((nsc0) isc0Var.b.getCurrentState()).c.b.a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list6) {
                    if (obj5 instanceof z1c0) {
                        arrayList4.add(obj5);
                    }
                }
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((z1c0) it.next()).h.h);
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof vt80) {
                        arrayList6.add(next);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it3.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList7.add(x9v0Var);
                    }
                }
                isc0Var.c(new wrc0.a(new yo60.i.a(arrayList7)));
                return s3q0.a;
            case 15:
                rdi.y((gce0) this.c, new xib(((Boolean) obj).booleanValue(), r2 ? 1 : 0));
                return s3q0.a;
            case 16:
                yid0 yid0Var = (yid0) this.c;
                by9 by9Var = (by9) obj;
                Good good = yid0Var.a.r;
                if (good != null) {
                    int i4 = good.y;
                    boolean z14 = i4 <= 0 && good.Bb();
                    int i5 = i4 - good.x;
                    if (!z14) {
                        if (i5 > 0) {
                            break;
                        }
                        break;
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 17:
                TextView textView2 = new TextView(((ood0) this.c).itemView.getContext());
                textView2.setTextAppearance(R.style.VkUiTypography_Headline2);
                textView2.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                textView2.setTextAlignment(4);
                textView2.setText(((TabLayout.g) obj).c);
                return textView2;
            case 18:
                ReactionAssetDrawable reactionAssetDrawable = (ReactionAssetDrawable) this.c;
                a.C1134a c1134a = (a.C1134a) obj;
                reactionAssetDrawable.a(c1134a);
                if (c1134a.b != null) {
                    RLottieDrawable rLottieDrawable = reactionAssetDrawable.c;
                    if (rLottieDrawable != null) {
                        rLottieDrawable.j();
                    }
                    reactionAssetDrawable.f = ReactionAssetDrawable.Stage.ANIMATION;
                    reactionAssetDrawable.invalidateSelf();
                } else {
                    reactionAssetDrawable.b();
                }
                return s3q0.a;
            case 19:
                return ((j4f0) this.c).b.e(new l4f0((qr60.a) obj));
            case 20:
                ((boh0) this.c).T(new doh0.d((SubscribeStatus) obj));
                return s3q0.a;
            case 21:
                tra0.a aVar3 = (tra0.a) obj;
                aVar3.q((tra0) this.c, aVar3.r0(kqu0.s), 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 22:
                uam0.a aVar4 = (uam0.a) this.c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                ViewGroup viewGroup = aVar4.g;
                if (viewGroup != null) {
                    bwt0.p0(viewGroup, booleanValue);
                }
                if (booleanValue) {
                    RecyclerView recyclerView = aVar4.f;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                    }
                    VkButton vkButton = aVar4.i;
                    if (vkButton != null) {
                        vkButton.setVisibility(8);
                    }
                    i = R.dimen.story_empty_highlights_padding;
                } else {
                    RecyclerView recyclerView2 = aVar4.f;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                    }
                    VkButton vkButton2 = aVar4.i;
                    if (vkButton2 != null) {
                        vkButton2.setVisibility(0);
                    }
                    i = R.dimen.story_highlights_padding;
                }
                ViewGroup viewGroup2 = aVar4.e;
                if (viewGroup2 != null) {
                    f4m.v(e3m.a(i, aVar4.c), viewGroup2);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 23:
                xlb0 xlb0Var = (xlb0) obj;
                if (((ub30) this.c).e(xlb0Var.c)) {
                    xlb0Var.a();
                }
                return s3q0.a;
            case 24:
                return SignalingLogger.a((SignalingLogger) this.c, (LogThrottler.ThrottleInfo) obj);
            case 25:
                roj0.a aVar5 = (roj0.a) this.c;
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((zak0) aVar5.m).setValue(bool2);
                return s3q0.a;
            case 26:
                ((huj0) this.c).g.b();
                return s3q0.a;
            case 27:
                ((SimpleControlsView) obj).setPlayer(((y4k0) this.c).a);
                return s3q0.a;
            case 28:
                return com.vk.clips.sdk.shared.item.static_ads.c.l((com.vk.clips.sdk.shared.item.static_ads.c) this.c, (jwk0) obj);
            default:
                com.vk.stickers.settings.i iVar = (com.vk.stickers.settings.i) this.c;
                gm50.a.a(iVar, ((j.a) obj).a, new m360(iVar, 19));
                return s3q0.a;
        }
    }
}
