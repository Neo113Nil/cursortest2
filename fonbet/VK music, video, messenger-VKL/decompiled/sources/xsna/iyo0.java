package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoFeedVideosForYouBlockItemsResultDto;
import com.vk.api.generated.video.dto.VideoGetMusicMixResponseDto;
import com.vk.api.generated.wall.dto.WallGetPostPreviewResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class iyo0 implements io.reactivex.rxjava3.functions.l, b03, f03, yads.sq0 {
    public final /* synthetic */ int b;

    public /* synthetic */ iyo0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return s3q0.a;
            default:
                return Boolean.FALSE;
        }
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.f0.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (VideoGetMusicMixResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetMusicMixResponseDto.class).getType())).a();
            default:
                return (WallGetPostPreviewResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallGetPostPreviewResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoFeedVideosForYouBlockItemsResultDto.class).getType());
    }

    public /* synthetic */ iyo0(izs izsVar, int i) {
        this.b = i;
    }
}
