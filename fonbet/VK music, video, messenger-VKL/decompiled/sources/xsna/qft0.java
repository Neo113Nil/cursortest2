package xsna;

import com.vk.api.generated.video.dto.VideoSearchExtendedResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qft0 implements b03, io.reactivex.rxjava3.functions.l {
    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return Boolean.FALSE;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (VideoSearchExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoSearchExtendedResponseDto.class).getType())).a();
    }
}
