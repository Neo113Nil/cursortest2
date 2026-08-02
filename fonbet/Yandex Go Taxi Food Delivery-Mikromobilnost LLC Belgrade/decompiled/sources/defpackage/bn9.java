package defpackage;

import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyProgramBadgeDto;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyProgramButtonDto;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltySelectorMenuDto;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltySelectorMenuOptionDto;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateBalanceDto;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateResponse;
import com.yandex.go.loyalty.impl.selector.domain.model.LoyaltyProgramState;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class bn9 {
    public final k7x0 a;

    public /* synthetic */ bn9(k7x0 k7x0Var) {
        this.a = k7x0Var;
    }

    public lxz a(LoyaltyStateResponse loyaltyStateResponse) {
        ovz pvzVar;
        LoyaltyProgramState loyaltyProgramState;
        LoyaltySelectorMenuDto loyaltySelectorMenuDto = loyaltyStateResponse.a;
        String str = loyaltySelectorMenuDto.a;
        List<LoyaltySelectorMenuOptionDto> list = loyaltySelectorMenuDto.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (LoyaltySelectorMenuOptionDto loyaltySelectorMenuOptionDto : list) {
            LoyaltyProgramButtonDto loyaltyProgramButtonDto = loyaltySelectorMenuOptionDto.g;
            if (loyaltyProgramButtonDto != null) {
                pvzVar = new qvz(loyaltyProgramButtonDto.a, loyaltyProgramButtonDto.b, loyaltyProgramButtonDto.c);
            } else {
                LoyaltyProgramBadgeDto loyaltyProgramBadgeDto = loyaltySelectorMenuOptionDto.f;
                if (loyaltyProgramBadgeDto == null) {
                    ny61.r("both badge and button are null");
                    return null;
                }
                pvzVar = new pvz(loyaltyProgramBadgeDto.a);
            }
            ovz ovzVar = pvzVar;
            String str2 = loyaltySelectorMenuOptionDto.e;
            if (evu0.J(str2)) {
                str2 = null;
            }
            String a = str2 != null ? ((m7x0) this.a).a(str2) : null;
            String str3 = loyaltySelectorMenuOptionDto.a;
            String str4 = loyaltySelectorMenuOptionDto.b;
            String str5 = loyaltySelectorMenuOptionDto.c;
            int i = lwz.a[loyaltySelectorMenuOptionDto.d.ordinal()];
            if (i == 1) {
                loyaltyProgramState = LoyaltyProgramState.ENABLED;
            } else if (i == 2) {
                loyaltyProgramState = LoyaltyProgramState.DISABLED;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                loyaltyProgramState = LoyaltyProgramState.NEED_ACTIVATION;
            }
            LoyaltyProgramState loyaltyProgramState2 = loyaltyProgramState;
            if (a == null) {
                a = "";
            }
            arrayList.add(new dvz(str3, str4, str5, loyaltyProgramState2, a, ovzVar));
        }
        wwz wwzVar = new wwz(str, arrayList);
        avz avzVar = new avz(loyaltyStateResponse.b.a);
        List<LoyaltyStateBalanceDto> list2 = loyaltyStateResponse.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (LoyaltyStateBalanceDto loyaltyStateBalanceDto : list2) {
            arrayList2.add(new mxz(loyaltyStateBalanceDto.a, loyaltyStateBalanceDto.b, loyaltyStateBalanceDto.c, loyaltyStateBalanceDto.d, loyaltyStateBalanceDto.e, loyaltyStateBalanceDto.f));
        }
        return new lxz(wwzVar, avzVar, arrayList2);
    }
}
