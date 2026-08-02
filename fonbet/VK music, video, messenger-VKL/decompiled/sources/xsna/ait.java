package xsna;

import com.vk.api.generated.account.dto.AccountGetTogglesResponseDto;
import com.vk.api.generated.account.dto.AccountToggleDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class ait extends FunctionReferenceImpl implements izs<AccountGetTogglesResponseDto, gn> {
    @Override // xsna.izs
    public final gn invoke(AccountGetTogglesResponseDto accountGetTogglesResponseDto) {
        AccountGetTogglesResponseDto accountGetTogglesResponseDto2 = accountGetTogglesResponseDto;
        ((qp) this.receiver).getClass();
        List<AccountToggleDto> d = accountGetTogglesResponseDto2.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (AccountToggleDto accountToggleDto : d) {
            arrayList.add(new fn(accountToggleDto.e(), accountToggleDto.d(), accountToggleDto.f()));
        }
        return new gn(accountGetTogglesResponseDto2.e(), arrayList);
    }
}
