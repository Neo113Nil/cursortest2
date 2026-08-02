package xsna;

import com.vk.api.generated.market.dto.MarketGetCommentsResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class g110 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g110(int i, int i2, h110 h110Var, UserId userId) {
        this.c = i;
        this.d = i2;
        this.e = h110Var;
        this.f = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                h110 h110Var = (h110) this.e;
                MarketGetCommentsResponseDto marketGetCommentsResponseDto = (MarketGetCommentsResponseDto) obj;
                return new b110(marketGetCommentsResponseDto.getCount(), this.c + this.d, null, h110Var.b.a(marketGetCommentsResponseDto, (UserId) this.f));
            default:
                jp80 jp80Var = (jp80) this.e;
                List list = (List) this.f;
                return ((zi50) jp80Var.f.getValue()).a(cj50.a((List) obj, new bee(jp80Var.e, 4))).l(new je40(new ip80(this.c, list, this.d), 2));
        }
    }

    public /* synthetic */ g110(jp80 jp80Var, int i, List list, int i2) {
        this.e = jp80Var;
        this.c = i;
        this.f = list;
        this.d = i2;
    }
}
