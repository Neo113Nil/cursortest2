package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoAudioPlaylistDto;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.api.generated.wall.dto.WallLastPostingInfoResponseDto;
import com.vk.clips.sdk.api.generated.GsonHolder;
import com.vk.clips.sdk.api.generated.SingleRootResponseDto;
import com.vk.voip.ui.VoipViewModelState;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class oft0 implements f03, b03, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;

    public /* synthetic */ oft0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        return Boolean.valueOf(com.vk.voip.ui.c.K0 == VoipViewModelState.InCall && cVar.s0());
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (VideoGetResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetResponseDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoAudioPlaylistDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallLastPostingInfoResponseDto.class).getType());
        }
    }
}
