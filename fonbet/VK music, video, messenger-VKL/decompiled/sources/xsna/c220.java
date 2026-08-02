package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemGetValidationStatusResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemValidationInfoSmsinboxDto;
import com.vk.api.generated.photos.dto.PhotosPhotoUploadDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.rating.VkStaticRatingBar;
import com.vk.dto.music.Playlist;
import com.vk.im.engine.internal.api_commands.diff.ExtendedFilter;
import com.vk.log.L;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.player.PlayerTrack;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.reefton.Reef;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import xsna.r6k0;
import xsna.t6k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class c220 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ c220(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object aVar;
        int i = 5;
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "community:friends:user:is_don");
                return s3q0.a;
            case 1:
                return ((ExtendedFilter) obj).h();
            case 2:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 3:
                return (View) obj;
            case 4:
                return new MusicBottomSheetLaunchPoint.Player.Limited((PlayerTrack) obj);
            case 5:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (jnj.b(((Playlist) obj2).O)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 6:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 7:
                qgi0.r((tgi0) obj, "MusicPickerPlaylistChevron");
                return s3q0.a;
            case 8:
                return ((jv80) obj).a();
            case 9:
                L.G(ms9.b("error: ", (Throwable) obj));
                return s3q0.a;
            case 10:
                int i2 = PhotoAlbumFragment.r0;
                qgi0.r((tgi0) obj, "toolbar_icon_more");
                return s3q0.a;
            case 11:
                PhotosPhotoUploadDto photosPhotoUploadDto = (PhotosPhotoUploadDto) obj;
                return new ncq0(photosPhotoUploadDto.e(), photosPhotoUploadDto.d(), null, null, null, 28);
            case 12:
                return (x6e0) obj;
            case 13:
                return ((inb0) obj).a;
            case 14:
                cvk.u(R.string.live_network_error_description, false);
                return s3q0.a;
            case 15:
                qgi0.r((tgi0) obj, "product_card_restriction_second_button");
                return s3q0.a;
            case 16:
                int i3 = ProfileMainPhotosFragment.F0;
                return s3q0.a;
            case 17:
                L.p("PushSubscriberNew", "Anonymous Subscribed");
                return s3q0.a;
            case 18:
                VkStaticRatingBar vkStaticRatingBar = new VkStaticRatingBar((Context) obj, null, 6);
                vkStaticRatingBar.setRating(4.5f);
                return vkStaticRatingBar;
            case 19:
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a((Throwable) obj);
                return s3q0.a;
            case 20:
                fxj0 fxj0Var = (fxj0) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(fxj0Var.getWidth());
                sb.append('x');
                sb.append(fxj0Var.getHeight());
                return sb.toString();
            case 21:
                EcosystemGetValidationStatusResponseDto ecosystemGetValidationStatusResponseDto = (EcosystemGetValidationStatusResponseDto) obj;
                if (ecosystemGetValidationStatusResponseDto.d().f() != EcosystemValidationInfoSmsinboxDto.TypeDto.SMSINBOX) {
                    return new t6k0.a(null, true, r6k0.a.a);
                }
                int i4 = u6k0.$EnumSwitchMapping$0[ecosystemGetValidationStatusResponseDto.d().e().ordinal()];
                if (i4 == 1) {
                    return t6k0.c.a;
                }
                if (i4 == 2 || i4 == 3) {
                    String message = ecosystemGetValidationStatusResponseDto.d().getMessage();
                    int i5 = w6k0.$EnumSwitchMapping$0[ecosystemGetValidationStatusResponseDto.d().e().ordinal()];
                    aVar = new t6k0.a(message, false, i5 != 1 ? i5 != 2 ? i5 != 3 ? r6k0.a.a : r6k0.a.a : r6k0.c.a : r6k0.b.a);
                } else if (i4 == 4) {
                    String message2 = ecosystemGetValidationStatusResponseDto.d().getMessage();
                    int i6 = w6k0.$EnumSwitchMapping$0[ecosystemGetValidationStatusResponseDto.d().e().ordinal()];
                    aVar = new t6k0.a(message2, true, i6 != 1 ? i6 != 2 ? i6 != 3 ? r6k0.a.a : r6k0.a.a : r6k0.c.a : r6k0.b.a);
                } else {
                    if (i4 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String d = ecosystemGetValidationStatusResponseDto.d().d();
                    if (d == null) {
                        return new t6k0.a(null, true, r6k0.a.a);
                    }
                    aVar = new t6k0.b(d);
                }
                return aVar;
            case 22:
                mol0 mol0Var = (mol0) obj;
                return mol0.a(mol0Var, null, null, null, null, ggr.a(mol0Var.g, false, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            case 23:
                return s3q0.a;
            case 24:
                Serializer.c<UIBlockList> cVar = UIBlockList.CREATOR;
                return ((UIBlock) obj).Fb();
            case 25:
                List list = (List) obj;
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(mcr0.h(Uri.parse((String) it.next())));
                }
                return new io.reactivex.rxjava3.internal.operators.observable.b1(new io.reactivex.rxjava3.internal.operators.observable.e3(null, arrayList2, new m2o0(new tdk0(i)), io.reactivex.rxjava3.core.g.b)).e(io.reactivex.rxjava3.core.x.k(list));
            case 26:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).s;
            case 27:
                return ((BaseOkResponseDto) obj) == BaseOkResponseDto.OK ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.k(new IllegalStateException("Group description change failed"));
            case 28:
                StoriesGetVideoUploadServerResponseDto storiesGetVideoUploadServerResponseDto = (StoriesGetVideoUploadServerResponseDto) obj;
                return new ncq0(storiesGetVideoUploadServerResponseDto.e(), null, null, null, storiesGetVideoUploadServerResponseDto.d(), 14);
            default:
                return new fw1((ViewGroup) obj);
        }
    }
}
