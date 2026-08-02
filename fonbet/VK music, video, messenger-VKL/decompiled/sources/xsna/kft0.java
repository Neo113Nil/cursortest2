package xsna;

import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsResponseDto;
import com.vk.api.generated.wall.dto.WallGetPostingSettingsResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kft0 implements b03, f03, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ kft0(int i) {
        this.b = i;
    }

    public static void a(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        com.mbridge.msdk.foundation.tools.q0.b(str, sb.toString());
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (VideoGetAlbumsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetAlbumsResponseDto.class).getType())).a();
            default:
                return (WallGetPostingSettingsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallGetPostingSettingsResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.t73.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
    }
}
