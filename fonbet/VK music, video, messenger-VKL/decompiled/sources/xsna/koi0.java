package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetSettingsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDeviceBlacklistsResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppGetSingleQueueResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullProfileDto;
import com.vk.api.generated.video.dto.VideoEditResponseDto;
import com.vk.api.generated.video.dto.VideoGetAdsDataResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiGetPhotoUploadUrlResponseDto;
import com.vk.api.generated.wall.dto.WallLastPostingInfoExtendedResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import xsna.k6o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class koi0 implements f03, k6o0.a, b03, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;

    public /* synthetic */ koi0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((s99) obj).c;
    }

    @Override // xsna.k6o0.a
    public void b(Object obj, Object obj2) {
        ((la80) obj).a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 5:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 6:
                return (SuperAppGetSingleQueueResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, SuperAppGetSingleQueueResponseDto.class).getType())).a();
            case 7:
                return (UsersUserFullProfileDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, UsersUserFullProfileDto.class).getType())).a();
            case 8:
                return (VideoGetAdsDataResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetAdsDataResponseDto.class).getType())).a();
            default:
                return (WallLastPostingInfoExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallLastPostingInfoExtendedResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingGetSettingsResponseDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetDeviceBlacklistsResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 9:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoEditResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VmojiGetPhotoUploadUrlResponseDto.class).getType());
        }
    }
}
