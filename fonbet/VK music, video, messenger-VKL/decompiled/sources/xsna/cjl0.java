package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetSubscriptionsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetForPlayResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.wall.dto.WallGetAttachmentsConfigResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cjl0 implements b03, f03 {
    public final /* synthetic */ int b;

    public /* synthetic */ cjl0(int i) {
        this.b = i;
    }

    public static String a(StringBuilder sb, Map map, char c) {
        sb.append(map);
        sb.append(c);
        return sb.toString();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Object.class).getType())).a();
            case 1:
                return (StoriesGetSubscriptionsExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, StoriesGetSubscriptionsExtendedResponseDto.class).getType())).a();
            default:
                return (VideoGetForPlayResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, VideoGetForPlayResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoVideoAlbumFullDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetAttachmentsConfigResponseDto.class).getType());
        }
    }
}
