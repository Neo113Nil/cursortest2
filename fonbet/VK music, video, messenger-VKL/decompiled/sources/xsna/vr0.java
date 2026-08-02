package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.f;
import com.vk.channels.api.Channel;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.oye;
import xsna.q14;
import xsna.tj50;
import xsna.vre;
import xsna.wih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vr0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ vr0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList = null;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((AdditionalSettingsState.Data) obj).l);
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                tj50.a aVar = (tj50.a) obj;
                e77 e77Var = e77.b;
                ao8 ao8Var = ao8.d;
                return new f.a(aVar.a(e77Var, ao8Var), aVar.a(f77.b, ao8Var), aVar.a(g77.b, ao8Var), aVar.a(h77.b, ao8Var));
            case 3:
                return qjg.a((bv7) obj);
            case 4:
                return Collections.singletonList(new AlbumEntry(0, "", (List) obj, false, 0, null, 56, null));
            case 5:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 6:
                return ((Channel) obj).u;
            case 7:
                return s3q0.a;
            case 8:
                b180 b180Var = (b180) obj;
                if (b180Var instanceof z080) {
                    return new q14.a(b180Var.b);
                }
                if (b180Var instanceof a180) {
                    return new q14.b(b180Var.b);
                }
                if (b180Var instanceof d180) {
                    Attach attach = b180Var.b;
                    d180 d180Var = (d180) b180Var;
                    return new q14.c(attach, d180Var.c, d180Var.d);
                }
                throw new IllegalArgumentException("event = " + b180Var + " is not supported");
            case 9:
                return pvo0.i(true, ((SdkClipVideoFile) obj).b0(), true, false);
            case 10:
                return s3q0.a;
            case 11:
                return Boolean.valueOf(((zgd) obj).i);
            case 12:
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
                List e = ums0.e(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d(), false, 52);
                ArrayList arrayList2 = new ArrayList(c5g.u(e, 10));
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new wih0.a(k15.B((VideoFile) it.next()), null));
                }
                String g = shortVideoGetOwnerVideosResponseDto.g();
                return new qih0(arrayList2, PaginationKey.LoadedFull.b, (g == null || g.length() == 0 || g.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(g), null, null);
            case 13:
                return s3q0.a;
            case 14:
                ((ikv0) obj).a();
                return s3q0.a;
            case 15:
                return ((ike) obj).c;
            case 16:
                int i = gne.j1;
                qgi0.r((tgi0) obj, "clips_not_interested_modal_card_title_tag");
                return s3q0.a;
            case 17:
                return ((vre.c) obj).f;
            case 18:
                return oye.b.a;
            case 19:
                return Boolean.valueOf(!(((com.vk.photo.editor.features.colorgrading.a) obj).c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            case 20:
                return io.reactivex.rxjava3.core.q.T(new VKList(EmptyList.b));
            case 21:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    Context context = e43.a;
                    j03.i(context != null ? context : null, (VKApiExecutionException) th);
                }
                return s3q0.a;
            case 22:
                return "";
            case 23:
                CommunityEventsState communityEventsState = (CommunityEventsState) obj;
                CommunityEventsState.Content content = communityEventsState.c;
                CommunityEventsState.Content.Items items = content instanceof CommunityEventsState.Content.Items ? (CommunityEventsState.Content.Items) content : null;
                if (items == null) {
                    return communityEventsState;
                }
                return CommunityEventsState.a(communityEventsState, new CommunityEventsState.Content.Items(items.a, items.b, CommunityEventsState.Content.Items.Paging.Error));
            case 24:
                PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) j5g.a0((List) obj);
                if (photosPhotoDto == null) {
                    return null;
                }
                List<PhotosPhotoSizesDto> R = photosPhotoDto.R();
                if (R != null) {
                    List<PhotosPhotoSizesDto> list = R;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    for (PhotosPhotoSizesDto photosPhotoSizesDto : list) {
                        arrayList.add(new ImageSize(photosPhotoSizesDto.getUrl(), photosPhotoSizesDto.getHeight(), photosPhotoSizesDto.getWidth(), null, ImageSizeKey.a.e(ImageSizeKey.Companion, photosPhotoSizesDto.e().i()), false, 40, null));
                    }
                }
                Photo photo = new Photo(new Image(arrayList));
                photo.c = photosPhotoDto.getId();
                photo.d = photosPhotoDto.e();
                photo.e = photosPhotoDto.q();
                photo.f = photosPhotoDto.getUserId();
                photo.g = photosPhotoDto.k();
                photo.u = photosPhotoDto.a0();
                photo.v = photosPhotoDto.d();
                photo.v = photosPhotoDto.d();
                return photo;
            case 25:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 26:
                ViewGroup viewGroup = (ViewGroup) obj;
                w1x w1xVar = new w1x(R.layout.vk_input_fields_components_view_holder, viewGroup);
                EditText editText = (EditText) w1xVar.itemView.findViewById(R.id.edit_text_1);
                int i2 = wvv0.a;
                editText.setBackground(wvv0.b(viewGroup.getContext()));
                return w1xVar;
            case 27:
                qgi0.r((tgi0) obj, "successImage");
                return s3q0.a;
            case 28:
                return s3q0.a;
            default:
                return s3q0.a;
        }
    }
}
