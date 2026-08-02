package xsna;

import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.services.dto.ServicesYcVKReviewsPublishSetResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetFeedSettingsResponseDto;
import com.vk.api.generated.video.dto.VideoGetWatchTogetherVideosResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hsi0 implements f03, b03, ScreenModeVideoStatMapper.a, yads.wq, yads.wl1 {
    public final /* synthetic */ int b;

    public /* synthetic */ hsi0(int i) {
        this.b = i;
    }

    @Override // yads.wl1
    public int a(Object obj) {
        return yads.xl1.b((yads.jl1) obj);
    }

    @Override // com.vk.libvideo.tracker.ScreenModeVideoStatMapper.a
    public Object d(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        return com.vk.libvideo.tracker.a.b(unifiedStatScreenMode);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (StoriesGetFeedSettingsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesGetFeedSettingsResponseDto.class).getType())).a();
            case 5:
                return (VideoGetWatchTogetherVideosResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetWatchTogetherVideosResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.v73.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServicesYcVKReviewsPublishSetResponseDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetUserSettingsResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }
}
