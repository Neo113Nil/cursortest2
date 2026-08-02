package xsna;

import com.vk.api.generated.wall.dto.WallGetByIdResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lrw0 implements io.reactivex.rxjava3.functions.l, b03 {
    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((wj8) obj).a;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (WallGetByIdResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallGetByIdResponseDto.class).getType())).a();
    }
}
