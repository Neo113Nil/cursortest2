package xsna;

import com.huawei.hms.health.aabz;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsByVideoExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetFromAlbumResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bbs0 implements f03, b03, c680 {
    public final /* synthetic */ int b;

    public /* synthetic */ bbs0(int i) {
        this.b = i;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (VideoGetAlbumsByVideoExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetAlbumsByVideoExtendedResponseDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetFromAlbumResponseDto.class).getType());
        }
    }

    @Override // xsna.c680
    public void onFailure(Exception exc) {
        aabz.aabc("CommonMethodImpl", "init InterfacePolicy fail");
    }
}
