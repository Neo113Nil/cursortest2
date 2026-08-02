package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.photos.dto.PhotosPhotoUploadDto;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class mmw0 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Long l = (Long) obj;
                return Boolean.valueOf(l == null || l.longValue() != 0);
            case 1:
                return new ixw0(R.layout.voip_schedule_call_title_item, (ViewGroup) obj);
            default:
                PhotosPhotoUploadDto photosPhotoUploadDto = (PhotosPhotoUploadDto) obj;
                return new ncq0(photosPhotoUploadDto.e(), photosPhotoUploadDto.d(), null, null, null, 28);
        }
    }
}
