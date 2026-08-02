package xsna;

import com.vk.api.generated.market.dto.MarketSaveIntegrationSettingsIntegrationTypeDto;
import com.vk.api.generated.market.dto.MarketSaveIntegrationSettingsOperationTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.storefront.impl.community.presentation.model.ProductsManagementActionType;
import kotlin.NoWhenBranchMatchedException;
import xsna.jm50;
import xsna.sqd0;
import xsna.ssd0;

/* compiled from: ProductManagementTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class tqd0 extends evg0<apl0, on50, sqd0, dpl0, oml0, xll0> {
    public final hap f;

    public tqd0(nn50 nn50Var, hap hapVar) {
        super(jm50.a.a, nn50Var);
        this.f = hapVar;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        MarketSaveIntegrationSettingsOperationTypeDto marketSaveIntegrationSettingsOperationTypeDto;
        io.reactivex.rxjava3.core.x k;
        sqd0 sqd0Var = (sqd0) hn50Var;
        if (!(sqd0Var instanceof sqd0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ProductsManagementActionType productsManagementActionType = ((sqd0.a) sqd0Var).b;
        hap hapVar = this.f;
        ((ssd0) ((bpn0) hapVar.d).getValue()).getClass();
        switch (ssd0.a.$EnumSwitchMapping$0[productsManagementActionType.ordinal()]) {
            case 1:
                marketSaveIntegrationSettingsOperationTypeDto = MarketSaveIntegrationSettingsOperationTypeDto.HIDE_VK_PRODUCTS;
                break;
            case 2:
                marketSaveIntegrationSettingsOperationTypeDto = MarketSaveIntegrationSettingsOperationTypeDto.ALLOW_VK_PRODUCTS;
                break;
            case 3:
                marketSaveIntegrationSettingsOperationTypeDto = MarketSaveIntegrationSettingsOperationTypeDto.RESTORE_VK_PRODUCTS;
                break;
            case 4:
                marketSaveIntegrationSettingsOperationTypeDto = MarketSaveIntegrationSettingsOperationTypeDto.DO_NOT_RESTORE_VK_PRODUCTS;
                break;
            case 5:
                marketSaveIntegrationSettingsOperationTypeDto = MarketSaveIntegrationSettingsOperationTypeDto.HIDE_ADMIN_LIMIT_BANNER;
                break;
            case 6:
                marketSaveIntegrationSettingsOperationTypeDto = MarketSaveIntegrationSettingsOperationTypeDto.HIDE_ADMIN_BANNER;
                break;
            default:
                marketSaveIntegrationSettingsOperationTypeDto = null;
                break;
        }
        if (marketSaveIntegrationSettingsOperationTypeDto != null) {
            eml emlVar = (eml) hapVar.c;
            UserId userId = (UserId) hapVar.b;
            yd10 yd10Var = (yd10) emlVar.b;
            UserId a = fkq0.a(userId);
            MarketSaveIntegrationSettingsIntegrationTypeDto marketSaveIntegrationSettingsIntegrationTypeDto = MarketSaveIntegrationSettingsIntegrationTypeDto.OZON;
            yd10Var.getClass();
            tfx tfxVar = new tfx("market.saveIntegrationSettings", new bt(17), new ct(15));
            tfx.n(tfxVar, "community_id", a, 0L, 0L, 12);
            tfx.o(tfxVar, "operation_type", marketSaveIntegrationSettingsOperationTypeDto.i(), 0, 0, 12);
            if (marketSaveIntegrationSettingsIntegrationTypeDto != null) {
                tfx.o(tfxVar, "integration_type", marketSaveIntegrationSettingsIntegrationTypeDto.i(), 0, 0, 12);
            }
            k = rsg0.w0(yfb.x(tfxVar)).l(new zj0(new dam(25), 25));
        } else {
            k = io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
        }
        return g(new io.reactivex.rxjava3.internal.operators.single.r(k, new oq80(new zl20(this, 24), 2)), new tl30(this, 18), new ow40(this, 13));
    }
}
