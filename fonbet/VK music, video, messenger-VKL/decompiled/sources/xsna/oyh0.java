package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stickers.dto.StickersSubscribePackAuthorResponseDto;
import com.vk.api.generated.video.dto.VideoGetRelatedAudiosResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class oyh0 implements f03, io.reactivex.rxjava3.functions.l, b03 {
    public final /* synthetic */ int b;

    public /* synthetic */ oyh0(int i) {
        this.b = i;
    }

    public static void a(String str, String str2, String str3) {
        com.mbridge.msdk.foundation.tools.q0.a(str3, str + str2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return new ArrayList();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, BaseStickerDto.class).getType()).getType())).a();
            default:
                return (VideoGetRelatedAudiosResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetRelatedAudiosResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 1:
            case 3:
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StickersSubscribePackAuthorResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }
}
