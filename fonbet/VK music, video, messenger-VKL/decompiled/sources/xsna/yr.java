package xsna;

import com.vk.api.generated.account.dto.AccountGetTogglesResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class yr implements b03 {
    @Override // xsna.b03
    public final Object e(wwx wwxVar) {
        return (AccountGetTogglesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountGetTogglesResponseDto.class).getType())).a();
    }
}
