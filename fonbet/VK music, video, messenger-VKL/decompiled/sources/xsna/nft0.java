package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetThumbUploadUrlResponseDto;
import com.vk.api.generated.video.dto.VideoSearchResponseDto;
import com.vk.api.generated.vkMaps.dto.VkMapsGeoDataByRefResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class nft0 implements b03, f03, yads.sq0 {
    public final /* synthetic */ int b;

    public /* synthetic */ nft0(int i) {
        this.b = i;
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.po3.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (VideoSearchResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoSearchResponseDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetThumbUploadUrlResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VkMapsGeoDataByRefResponseDto.class).getType());
        }
    }
}
