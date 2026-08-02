package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.video.dto.VideoGetThumbUploadUrlResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchFeedCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dn90;
import xsna.m5k0;
import xsna.z8r0;
import xsna.zjo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cd10 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ cd10(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PrivacyViewState.a cVar;
        int i;
        kaw0 kaw0Var = null;
        switch (this.b) {
            case 0:
                return ((Map.Entry) obj).getKey();
            case 1:
                cvk.u(R.string.added_to_documents, false);
                return s3q0.a;
            case 2:
                Throwable th = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
                if (vKApiExecutionException != null) {
                    Context context = e43.a;
                    rte0.z(context != null ? context : null, vKApiExecutionException);
                }
                return s3q0.a;
            case 3:
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    for (UIBlock uIBlock : Sb) {
                        if (uIBlock.Cb().i()) {
                            CatalogViewStyle Lb = uIBlock.Lb();
                            SearchFeedCatalogViewStyle searchFeedCatalogViewStyle = Lb instanceof SearchFeedCatalogViewStyle ? (SearchFeedCatalogViewStyle) Lb : null;
                            if (searchFeedCatalogViewStyle != null && searchFeedCatalogViewStyle.b == 78) {
                                return Boolean.valueOf(r2);
                            }
                        }
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 4:
                L.l("OKVoipAudioManager", ms9.b("connected onError=", (Throwable) obj));
                return s3q0.a;
            case 5:
                if (((BaseOkResponseDto) obj) == BaseOkResponseDto.OK) {
                    return s3q0.a;
                }
                throw new IllegalStateException("Unable to mark integration order as viewed");
            case 6:
                qgi0.r((tgi0) obj, "order_toolbar_back");
                return s3q0.a;
            case 7:
                VKList vKList = (VKList) obj;
                return new dn90.a.b(vKList.size(), vKList, vKList.i() > vKList.size());
            case 8:
                qgi0.r((tgi0) obj, "toolbar_title");
                return s3q0.a;
            case 9:
                Playlist playlist = ((ibb0) obj).b;
                String str = playlist.h;
                if (str == null) {
                    str = "";
                }
                return new i9b0(playlist.m, str, playlist.Eb() ? R.string.music_album_context_menu_header_subtitle : R.string.music_playlist_context_menu_header_subtitle, playlist.k && playlist.Eb());
            case 10:
                new dqu();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 11:
                kfd0 kfd0Var = (kfd0) obj;
                PostPrivacyData postPrivacyData = kfd0Var.b;
                boolean z = postPrivacyData.b;
                List<PrivacyPostType> list = postPrivacyData.e;
                boolean z2 = postPrivacyData.i;
                String str2 = postPrivacyData.h;
                Date date = postPrivacyData.g;
                PrivacyPostType privacyPostType = postPrivacyData.d;
                List<DonutLevel> list2 = postPrivacyData.f;
                PrivacyViewState.Type type = z ? PrivacyViewState.Type.Dons : !list2.isEmpty() ? PrivacyViewState.Type.PrivacyAndDons : PrivacyViewState.Type.Privacy;
                if (postPrivacyData.b) {
                    PrivacyPostType.SingleDonutLevel singleDonutLevel = privacyPostType instanceof PrivacyPostType.SingleDonutLevel ? (PrivacyPostType.SingleDonutLevel) privacyPostType : null;
                    cVar = new PrivacyViewState.a.b(singleDonutLevel != null ? singleDonutLevel.b : null, list2.size() > 1, new PrivacyViewState.b(date, new PrivacyViewState.b.a(str2, z2)));
                } else if (privacyPostType instanceof PrivacyPostType.SingleDonutLevel) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        PrivacyViewState.c a = r860.a((PrivacyPostType) it.next(), kfd0Var);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    cVar = new PrivacyViewState.a.C1434a(arrayList, new PrivacyViewState.b(date, new PrivacyViewState.b.a(str2, z2)));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        PrivacyViewState.c a2 = r860.a((PrivacyPostType) it2.next(), kfd0Var);
                        if (a2 != null) {
                            arrayList2.add(a2);
                        }
                    }
                    cVar = new PrivacyViewState.a.c(arrayList2);
                }
                return new PrivacyViewState(type, cVar);
            case 12:
                return s3q0.a;
            case 13:
                return new zjo0.a(((Integer) obj).intValue());
            case 14:
                ysg0.b.a(new bru0((VkFeedSearchParams) obj));
                return s3q0.a;
            case 15:
                qgi0.r((tgi0) obj, "TEST_TAG_ROOT");
                return s3q0.a;
            case 16:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    i = R.raw.shuffle_default_to_dot_outline_24;
                } else {
                    if (!booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.raw.shuffle_dot_to_default_outline_24;
                }
                return Integer.valueOf(i);
            case 17:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, null, false, false, m5k0.b.a, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
            case 18:
                return Boolean.valueOf(((BaseOkResponseDto) obj).i() == 1);
            case 19:
                List list3 = (List) ((Map) obj).get(StoryBackgroundType.ANIMATED);
                return list3 == null ? EmptyList.b : list3;
            case 20:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                io.reactivex.rxjava3.subjects.d dVar = z8r0.a;
                z8r0.a(new z8r0.a.c((List) obj));
                return s3q0.a;
            case 23:
                return new ncq0(((VideoGetThumbUploadUrlResponseDto) obj).d(), null, null, null, null, 30);
            case 24:
                vrf0 vrf0Var = (vrf0) j5g.Y(((isf0) obj).a);
                int i2 = vrf0Var.a;
                UserId userId = vrf0Var.b;
                String str3 = vrf0Var.c;
                String str4 = vrf0Var.d;
                String str5 = vrf0Var.e;
                Thumb thumb = vrf0Var.f;
                if (thumb == null) {
                    thumb = lso0.a;
                }
                return new AboutVideoItem.s(i2, userId, str3, str4, str5, thumb, vrf0Var.g, vrf0Var.h, vrf0Var.i, vrf0Var.j, false);
            case 25:
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(((VideoMinimizableState) obj) instanceof VideoMinimizableState.Expanded);
            case 26:
                return Boolean.valueOf(((Integer) obj).intValue() >= 720);
            case 27:
                return ((VideoUploadEvent.Done) obj).c.r1();
            case 28:
                return new i6w0(R.layout.vmoji_character_caption_loading_item, (ViewGroup) obj);
            default:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `vmoji_promo_in_suggests`.`vmoji_promo_dictionary` AS `vmoji_promo_dictionary`, `vmoji_promo_in_suggests`.`vmoji_promo_stickers` AS `vmoji_promo_stickers` FROM vmoji_promo_in_suggests");
                try {
                    if (V0.step()) {
                        String l2 = V0.l2(0);
                        Gson gson = psj.a;
                        kaw0Var = new kaw0((List) psj.a.fromJson(l2, new rsj().getType()), psj.e(V0.l2(1)));
                    }
                    return kaw0Var;
                } finally {
                    V0.close();
                }
        }
    }
}
