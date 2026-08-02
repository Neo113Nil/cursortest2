package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.statEvents.dto.StatEventsBaseResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsResponseDto;
import com.vk.api.generated.wall.dto.WallGetSuggestedHashtagsResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import io.appmetrica.analytics.impl.C5131r2;
import io.appmetrica.analytics.impl.InterfaceC5213u6;
import java.io.InputStream;
import java.io.InputStreamReader;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.ssd.Util;
import ru.ok.tensorflow.util.Function;
import xsna.vlp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class trk0 implements f03, b03, vlp0.j, Function, InterfaceC5213u6 {
    public final /* synthetic */ int b;

    public /* synthetic */ trk0(int i) {
        this.b = i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5213u6
    public boolean a(Throwable th) {
        return C5131r2.a(th);
    }

    @Override // ru.ok.tensorflow.util.Function
    public Object apply(Object obj) {
        Float lambda$mergeDetections$2;
        lambda$mergeDetections$2 = Util.lambda$mergeDetections$2((Detection) obj);
        return lambda$mergeDetections$2;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 2:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 3:
            case 4:
            default:
                return (WallGetSuggestedHashtagsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallGetSuggestedHashtagsResponseDto.class).getType())).a();
            case 5:
                return (VideoGetCommentsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetCommentsResponseDto.class).getType())).a();
            case 6:
                return (VideoGetCommentsExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetCommentsExtendedResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StatEventsBaseResponseDto.class).getType());
    }

    @Override // xsna.vlp0.j
    public void a(vlp0.i iVar, vlp0 vlp0Var, boolean z) {
        iVar.onTransitionCancel(vlp0Var);
    }
}
