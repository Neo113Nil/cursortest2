package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoCreateResponseDto;
import com.vk.api.generated.store.dto.StoreNewItemsDto;
import com.vk.api.generated.utils.dto.UtilsGuessUserSexResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.wall.dto.WallGetSubscriptionsExtendedResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gub0 implements f03, b03, yads.sq0 {
    public final /* synthetic */ int b;

    public /* synthetic */ gub0(int i) {
        this.b = i;
    }

    public static lco0 a(androidx.compose.runtime.a aVar, int i, androidx.compose.runtime.a aVar2) {
        aVar.K(i);
        return wlb0.h(aVar2).getText();
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.la3.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 4:
                return (UtilsGuessUserSexResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, UtilsGuessUserSexResponseDto.class).getType())).a();
            default:
                return (WallGetSubscriptionsExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, WallGetSubscriptionsExtendedResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PollsPollDto.class).getType());
            case 1:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoCreateResponseDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoreNewItemsDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoVideoAlbumFullDto.class).getType());
        }
    }
}
