package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.vkRun.dto.VkRunStepsListItemDto;
import com.vk.api.generated.wall.dto.WallGetExtendedResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fhv0 implements b03, f03 {
    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, VkRunStepsListItemDto.class).getType()).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetExtendedResponseDto.class).getType());
    }
}
