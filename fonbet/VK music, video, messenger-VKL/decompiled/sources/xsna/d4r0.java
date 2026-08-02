package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetInteractiveVideoInfoResponseDto;
import com.vk.api.generated.voicerooms.dto.VoiceroomsRoomDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d4r0 implements b03, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, f03, t8z0 {
    public final /* synthetic */ int b;

    public /* synthetic */ d4r0(int i) {
        this.b = i;
    }

    @Override // xsna.t8z0
    public void accept(Object obj) {
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return s3q0.a;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 1:
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 2:
                return (VideoGetInteractiveVideoInfoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetInteractiveVideoInfoResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VoiceroomsRoomDto.class).getType());
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return obj instanceof nru0;
    }

    public /* synthetic */ d4r0(yaq0 yaq0Var) {
        this.b = 1;
    }
}
