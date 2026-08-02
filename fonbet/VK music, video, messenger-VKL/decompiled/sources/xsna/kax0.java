package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.wall.dto.WallGetPostPreviewResponseDto;
import com.vk.internal.api.GsonHolder;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kax0 implements f03, io.reactivex.rxjava3.functions.l {
    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return Boolean.FALSE;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetPostPreviewResponseDto.class).getType());
    }
}
