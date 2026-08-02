package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoAudioPlaylistDto;
import com.vk.api.generated.video.dto.VideoGetExternalStatsTokenResponseDto;
import com.vk.api.generated.video.dto.VideoGetThumbUploadUrlResponseDto;
import com.vk.api.generated.videoChannels.dto.VideoChannelsGetViewSettingsResponseDto;
import com.vk.api.generated.wall.dto.WallGetByIdExtendedResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fyp0 implements io.reactivex.rxjava3.functions.l, b03, f03, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;

    public /* synthetic */ fyp0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((VideoGetExternalStatsTokenResponseDto) obj).d();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (VideoAudioPlaylistDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoAudioPlaylistDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoChannelsGetViewSettingsResponseDto.class).getType());
            case 3:
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetByIdExtendedResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetThumbUploadUrlResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return (obj instanceof fjw0) || (obj instanceof h3x0);
    }

    public /* synthetic */ fyp0(b1o0 b1o0Var) {
        this.b = 0;
    }
}
