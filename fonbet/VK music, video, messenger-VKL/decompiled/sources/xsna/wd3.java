package xsna;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.common.BundleUtil;
import com.my.target.nativeads.views.IconAdView;
import com.vk.api.generated.photos.dto.PhotosGetResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.avatar.api.VKAvatarView;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.camera.editor.stories.impl.multi.CameraPhotoDelegate;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfilesList;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.friend.FriendsBirthdaysPackableVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicCurator;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarNewVh;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.dzenarticle.impl.ui.view.ad.BaseTopAdView;
import com.vk.dzenarticle.impl.ui.view.ad.TopAdView;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.media.pipeline.codec.CodecDrainer;
import com.vk.media.pipeline.codec.CodecFeeder;
import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import com.vk.pushes.receivers.c;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeEndVideoClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import xsna.cro;
import xsna.fqg;
import xsna.ikv0;
import xsna.nfd0;
import xsna.nii0;
import xsna.osp;
import xsna.xd3;
import xsna.xll0;
import xsna.y7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wd3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wd3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String quantityString;
        String str;
        int i;
        int i2 = this.b;
        r9 = false;
        boolean z = false;
        int i3 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                xd3 xd3Var = (xd3) obj2;
                SimpleAttachListItem simpleAttachListItem = ((xd3.a) obj3).s;
                if (simpleAttachListItem != null) {
                    xd3Var.a.invoke(simpleAttachListItem);
                }
                return s3q0.a;
            case 1:
                dz4 dz4Var = (dz4) obj3;
                xx4 xx4Var = (xx4) obj2;
                f8l<qm4> f8lVar = dz4Var.b;
                f8l<D>.a<qm4> aVar = f8lVar.e.get(xx4Var.m());
                CodecDrainer codecDrainer = aVar != null ? aVar.c : null;
                if (codecDrainer == null) {
                    codecDrainer = f8lVar.a(xx4Var).c;
                }
                dz4Var.a(codecDrainer);
                return CodecFeeder.FeedStatus.CONTINUE;
            case 2:
                mp5 mp5Var = (mp5) obj3;
                UserId userId = (UserId) obj2;
                List<PhotosPhotoDto> d = ((PhotosGetResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (PhotosPhotoDto photosPhotoDto : d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(userId);
                    sb.append('_');
                    sb.append(photosPhotoDto.getId());
                    String d2 = photosPhotoDto.d();
                    String concat = d2 != null ? BundleUtil.UNDERLINE_TAG.concat(d2) : null;
                    if (concat == null) {
                        concat = "";
                    }
                    sb.append(concat);
                    arrayList.add(sb.toString());
                }
                return rsg0.T(yfb.x(zga0.l(mp5Var.j, arrayList, 4)));
            case 3:
                return new km7((ViewGroup) obj, (xl7) obj3, ((wl7) obj2).m);
            case 4:
                Context context = (Context) obj3;
                String string = context.getString(R.string.story_saved_to_galery);
                ikv0.a aVar2 = new ikv0.a(context);
                aVar2.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
                aVar2.o = Integer.valueOf(iah0.a(88));
                aVar2.n();
                ((CameraPhotoDelegate) obj2).d.invoke();
                return s3q0.a;
            case 5:
                gwc gwcVar = (gwc) obj3;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj2;
                gwcVar.j(sdkVideoFile.r1());
                nme.a(MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype.WITHOUT_REASONS, SchemeStat$TypeClipViewerItem.EventType.UNHIDE, fzc.b(gwcVar.e.a), sdkVideoFile);
                ((ikv0) obj).a();
                return s3q0.a;
            case 6:
                int i4 = ClipsPlaylistPickerFragment.V;
                ((ClipsPlaylistPickerFragment) obj3).fo((f.d) obj, (ClipsPlaylistPickerFragment.a) obj2);
                return s3q0.a;
            case 7:
                tho0 tho0Var = (tho0) obj;
                ((wh50) obj2).setValue(tho0Var);
                ((izs) obj3).invoke(new fqg.c(tho0Var.a.c, tho0Var.b));
                return s3q0.a;
            case 8:
                ((tij) obj3).j1(((nfd0.b) obj2).b);
                return s3q0.a;
            case 9:
                ((u7k) obj3).l.invoke(((v4e) obj2).b);
                return s3q0.a;
            case 10:
                nek0 nek0Var = (nek0) obj3;
                vvr vvrVar = (vvr) obj2;
                if (((y7k) obj) instanceof y7k.a) {
                    if (nek0Var != null) {
                        nek0Var.hide();
                    }
                    vvrVar.y(false);
                }
                return s3q0.a;
            case 11:
                mm3 mm3Var = (mm3) obj3;
                izs<? super cro, s3q0> izsVar = (izs) obj2;
                TopAdView topAdView = (TopAdView) obj;
                IconAdView iconAdView = topAdView.i;
                zu50 zu50Var = mm3Var.b;
                fe0 fe0Var = mm3Var.c;
                topAdView.setNativeAd(zu50Var);
                topAdView.setAdChoicesController(fe0Var);
                topAdView.setOnAction(izsVar);
                VkText vkText = topAdView.f;
                vkText.setText(mm3Var.d);
                VkText vkText2 = topAdView.g;
                vkText2.setText(mm3Var.e);
                VkButton vkButton = topAdView.h;
                vkButton.setText(mm3Var.j);
                VkText vkText3 = topAdView.j;
                Context context2 = topAdView.getContext();
                String str2 = mm3Var.f;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = mm3Var.g;
                vkText3.setText(context2.getString(R.string.top_ad_banner_label, str2, str3 != null ? str3 : ""));
                zu50Var.r = 5;
                zu50Var.l = new u6p0(izsVar, zu50Var);
                kiw kiwVar = mm3Var.h;
                if (kiwVar != null) {
                    iconAdView.getImageView().setImageBitmap(kiwVar.a());
                } else {
                    f4m.j(iconAdView);
                }
                jjc.g(vkText3, new t3b(fe0Var, zu50Var, vkText3, 9));
                fe0Var.d = new BaseTopAdView.a(null, topAdView.j, cro.e.b, cro.r.b);
                zu50Var.h(topAdView.k, e43.l(vkText, vkText2, vkButton, iconAdView, topAdView));
                return s3q0.a;
            case 12:
                osp.a aVar3 = (osp.a) obj3;
                gpu0 gpu0Var = (gpu0) obj2;
                nw20 nw20Var = (nw20) obj;
                if (nw20Var != null) {
                    int i5 = iah0.r(nw20Var.getContext()) ? 8388693 : 1;
                    ViewGroup viewGroup = nw20Var.i0;
                    f4m.m(i5, viewGroup == null ? null : viewGroup);
                }
                aVar3.S0(n34.k(aVar3.c));
                Context context3 = aVar3.c;
                HashSet hashSet = iah0.a;
                if (fnj.d(context3)) {
                    gpu0Var.i = iah0.r(aVar3.c) ? iah0.a(20) : iah0.a(32);
                }
                return s3q0.a;
            case 13:
                int i6 = FeedAnimatedView.y;
                ((FeedAnimatedView) obj2).h((String) obj, "animated_reaction_" + ((String) obj3));
                return s3q0.a;
            case 14:
                return klr.Q6((klr) obj3, (View) obj2, (Throwable) obj);
            case 15:
                UIBlock uIBlock = (UIBlock) obj3;
                FriendsBirthdaysPackableVh friendsBirthdaysPackableVh = (FriendsBirthdaysPackableVh) obj2;
                UIBlockProfilesList uIBlockProfilesList = uIBlock instanceof UIBlockProfilesList ? (UIBlockProfilesList) uIBlock : null;
                if (uIBlockProfilesList == null) {
                    return s3q0.a;
                }
                List<CatalogUserMeta> list = uIBlockProfilesList.y;
                List<UserProfile> list2 = uIBlockProfilesList.z;
                if (list2.isEmpty()) {
                    return s3q0.a;
                }
                LinkedTextView linkedTextView = friendsBirthdaysPackableVh.c;
                TextView textView = linkedTextView == null ? null : linkedTextView;
                if (linkedTextView == null) {
                    linkedTextView = null;
                }
                Context context4 = linkedTextView.getContext();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (((CatalogUserMeta) obj4).j != null) {
                        arrayList2.add(obj4);
                    }
                }
                int size = arrayList2.size();
                if (size == 1) {
                    quantityString = ((CatalogUserMeta) arrayList2.get(0)).j;
                } else if (size <= 3) {
                    quantityString = context4.getString(R.string.friends_catalog_and, size == 3 ? ((CatalogUserMeta) arrayList2.get(0)).j + ", " + ((CatalogUserMeta) arrayList2.get(1)).j : ((CatalogUserMeta) arrayList2.get(0)).j, ((CatalogUserMeta) (size == 3 ? arrayList2.get(2) : arrayList2.get(1))).j);
                } else {
                    int i7 = size - 1;
                    quantityString = context4.getResources().getQuantityString(R.plurals.friends_catalog_and_more_people, i7, list.get(0).j, Integer.valueOf(i7));
                }
                String string2 = context4.getString((list.isEmpty() || !list.get(0).Ab()) ? R.string.friends_catalog_tomorrow_birthday : R.string.friends_catalog_today_birthday, quantityString);
                SpannableString spannableString = new SpannableString(string2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    CatalogUserMeta catalogUserMeta = (CatalogUserMeta) it.next();
                    int K = drm0.K(0, 6, string2, catalogUserMeta.j, false);
                    if (K >= 0) {
                        String str4 = catalogUserMeta.j;
                        i = i3;
                        spannableString.setSpan(new FriendsBirthdaysPackableVh.a(catalogUserMeta), K, (str4 != null ? str4.length() : 0) + K, 0);
                    } else {
                        i = i3;
                    }
                    i3 = i;
                }
                int i8 = i3;
                textView.setText(spannableString);
                VKAvatarView vKAvatarView = friendsBirthdaysPackableVh.d;
                if (vKAvatarView == null) {
                    vKAvatarView = null;
                }
                vKAvatarView.Y0(qp5.b(list2.get(0)));
                PhotoStackView photoStackView = friendsBirthdaysPackableVh.e;
                if (photoStackView == null) {
                    photoStackView = null;
                }
                d540<njt> d540Var = photoStackView.b;
                for (int i9 = 0; i9 < d540Var.b.size(); i9++) {
                    d540Var.a(i9).h(null);
                    photoStackView.e.clear();
                }
                int size2 = list2.size();
                if (size2 >= 2) {
                    PhotoStackView photoStackView2 = friendsBirthdaysPackableVh.e;
                    if (photoStackView2 == null) {
                        photoStackView2 = null;
                    }
                    photoStackView2.setCount(size2 - 1);
                    for (int i10 = i8; i10 < size2; i10++) {
                        PhotoStackView photoStackView3 = friendsBirthdaysPackableVh.e;
                        if (photoStackView3 == null) {
                            photoStackView3 = null;
                        }
                        photoStackView3.h(i10 - 1, list2.get(i10).h);
                    }
                }
                ImageView imageView = friendsBirthdaysPackableVh.f;
                (imageView == null ? null : imageView).setVisibility((list.isEmpty() || !list.get(0).Ab()) ? 8 : 0);
                cks cksVar = friendsBirthdaysPackableVh.b;
                if (cksVar != null && (str = uIBlockProfilesList.B) != null) {
                    cksVar.d(str, uIBlockProfilesList.b);
                }
                friendsBirthdaysPackableVh.h = uIBlockProfilesList;
                return s3q0.a;
            case 16:
                gzs gzsVar = (gzs) obj2;
                if (((Boolean) ((gzs) obj3).invoke()).booleanValue()) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 17:
                MusicPageToolbarNewVh musicPageToolbarNewVh = (MusicPageToolbarNewVh) obj3;
                Toolbar toolbar = (Toolbar) obj2;
                UIBlock uIBlock2 = musicPageToolbarNewVh.d;
                kbj0 kbj0Var = musicPageToolbarNewVh.e;
                if (uIBlock2 != null) {
                    musicPageToolbarNewVh.c.a(new cfp0(uIBlock2, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Share)));
                }
                UIBlock uIBlock3 = musicPageToolbarNewVh.d;
                if (uIBlock3 instanceof UIBlockMusicArtistNew) {
                    kbj0Var.l(toolbar.getContext(), ((UIBlockMusicArtistNew) uIBlock3).z);
                } else if (uIBlock3 instanceof UIBlockMusicCurator) {
                    kbj0Var.C(toolbar.getContext(), ((UIBlockMusicCurator) uIBlock3).z);
                }
                return Boolean.TRUE;
            case 18:
                wh50 wh50Var = (wh50) obj3;
                wh50 wh50Var2 = (wh50) obj2;
                if (((Boolean) wh50Var2.getValue()).booleanValue()) {
                    wh50Var.setValue(obj);
                } else {
                    wh50Var2.setValue(Boolean.TRUE);
                }
                return s3q0.a;
            case 19:
                ((hs50) obj3).d7((View) obj, (cjx) obj2, NativeAdContent.ViewTag.CTA, 6);
                return s3q0.a;
            case 20:
                c.a aVar4 = com.vk.pushes.receivers.c.b;
                c.a.f((Context) obj3, (Intent) obj2, true);
                return s3q0.a;
            case 21:
                return ((Boolean) obj).booleanValue() ? io.reactivex.rxjava3.internal.operators.completable.i.b : new io.reactivex.rxjava3.internal.operators.completable.m(new oh80((ph80) obj3, (AudioOnboardingScenarioType) obj2));
            case 22:
                bdc0 bdc0Var = (bdc0) obj3;
                FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                PostingAuthorUiModel postingAuthorUiModel = (PostingAuthorUiModel) obj;
                vcc0 vcc0Var = bdc0Var.e;
                if (vcc0Var != null) {
                    wcc0 wcc0Var = bdc0Var.c;
                    PostingAuthor a = com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.a.a(postingAuthorUiModel);
                    wcc0Var.b.getClass();
                    bdc0Var.e = vcc0.a(vcc0Var, postingAuthorUiModel, com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.a.a(a), false, null, null, 58);
                }
                bdc0Var.a(fragmentActivity);
                return s3q0.a;
            case 23:
                return ((com.vk.newsfeed.impl.posting.a) obj3).d((ArrayList) obj2, (flc0) obj);
            case 24:
                lgb lgbVar = (lgb) obj3;
                pcf0 pcf0Var = ((rcf0) obj2).m;
                lgbVar.B((pcf0Var == null ? null : pcf0Var).b);
                return s3q0.a;
            case 25:
                com.vk.lists.c cVar = (com.vk.lists.c) obj3;
                xii0 xii0Var = (xii0) obj2;
                Triple triple = (Triple) obj;
                String str5 = (String) triple.d();
                int intValue = ((Number) triple.g()).intValue();
                List list3 = (List) triple.h();
                if (str5.length() == 0) {
                    cVar.q(cVar.i() + 20);
                    if (intValue > cVar.i()) {
                        z = true;
                    }
                }
                cVar.r(z);
                xii0Var.e.invoke(new nii0.e(list3, str5));
                return s3q0.a;
            case 26:
                ill0 ill0Var = (ill0) obj3;
                ((dhc) ill0Var.d.k.getValue()).d(ill0Var.a.requireContext(), new ngc(null, "category", ill0Var.c, null, null, null, null, null, null, (String) obj, new MarketAnalyticsParams(null, MobileOfficialAppsCoreNavStat$EventScreen.MARKET_SEARCH, CommonMarketStat$TypeRefSource.COMMUNITY_GOODS, null, null, null, ((xll0.a.j) obj2).b, false, null, true, true, null, false, 6457, null), null, false, null, 4095971));
                return s3q0.a;
            case 27:
                ((svk0) obj3).invoke((StoryPrivacyType) obj2);
                return s3q0.a;
            case 28:
                i2e0 i2e0Var = (i2e0) obj2;
                ((androidx.media3.transformer.a0) obj3).d(i2e0Var);
                return Integer.valueOf(i2e0Var.a);
            default:
                int i11 = VideoEndView.z;
                ((VideoEndView) obj3).b(MobileOfficialAppsVideoStat$TypeEndVideoClick.EventType.FORWARD);
                ((View.OnClickListener) obj2).onClick((View) obj);
                return s3q0.a;
        }
    }
}
