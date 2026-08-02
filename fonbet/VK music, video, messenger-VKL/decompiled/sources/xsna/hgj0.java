package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.api.generated.stories.dto.StoriesGetV5113ResponseDto;
import com.vk.api.generated.video.dto.VideoLiveHeartbeatResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.superapp.api.dto.group.WebGroup;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hgj0 implements b03, f03, io.reactivex.rxjava3.functions.c, yads.sq0 {
    public final /* synthetic */ int b;

    public /* synthetic */ hgj0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return new Pair((JSONObject) obj, (WebGroup) obj2);
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.gw0.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (ShortVideoPlaylistFullDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ShortVideoPlaylistFullDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesGetV5113ResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoLiveHeartbeatResponseDto.class).getType());
        }
    }
}
