package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.voip.dto.AudioDevice;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class hlx0 implements io.reactivex.rxjava3.functions.l, f03 {
    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return AudioDevice.NONE;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
    }
}
