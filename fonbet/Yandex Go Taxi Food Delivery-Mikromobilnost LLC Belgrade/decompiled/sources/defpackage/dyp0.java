package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.upgrade.domain.entities.UpgradeFormEntity$SecondDocumentType;
import com.ybsdk.screens.upgrade.domain.mapper.SecondDocumentHelperTextMapper$SecondDocumentDisplayType;

/* loaded from: classes2.dex */
public final class dyp0 {
    public final gr51 a;

    public dyp0(gr51 gr51Var) {
        this.a = gr51Var;
    }

    public final Text.WithHtmlLink a(String str, sb21 sb21Var, UpgradeFormEntity$SecondDocumentType upgradeFormEntity$SecondDocumentType, SecondDocumentHelperTextMapper$SecondDocumentDisplayType secondDocumentHelperTextMapper$SecondDocumentDisplayType) {
        Text resource;
        int i = cyp0.a[upgradeFormEntity$SecondDocumentType.ordinal()];
        if (i == 1) {
            resource = (secondDocumentHelperTextMapper$SecondDocumentDisplayType != SecondDocumentHelperTextMapper$SecondDocumentDisplayType.SUMMARY || str.length() <= 0) ? sb21Var instanceof ob21 ? new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_tip_cant_find_title) : sb21Var instanceof qb21 ? new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_tip_searching_title) : sb21Var instanceof pb21 ? new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_tip_not_found_title) : sb21Var instanceof rb21 ? ((rb21) sb21Var).a.contains(str) ? new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_tip_found_title) : new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_tip_found_inn) : Text.Empty.INSTANCE : Text.Empty.INSTANCE;
        } else if (i == 2) {
            resource = unr0.h(Text.Companion, dzh0.ybsdk_uprid_snils_tip_title);
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            resource = (secondDocumentHelperTextMapper$SecondDocumentDisplayType != SecondDocumentHelperTextMapper$SecondDocumentDisplayType.SUMMARY || str.length() <= 0) ? sb21Var instanceof ob21 ? new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_tip_cant_find_title) : sb21Var instanceof qb21 ? new Text.Resource(dzh0.ybsdk_uprid_taxes_account_id_tip_searching_title) : sb21Var instanceof pb21 ? new Text.Resource(dzh0.ybsdk_uprid_taxes_account_id_tip_not_found_title) : sb21Var instanceof rb21 ? ((rb21) sb21Var).a.contains(str) ? new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_tip_found_title) : new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_tip_found_inn) : Text.Empty.INSTANCE : Text.Empty.INSTANCE;
        }
        return new Text.WithHtmlLink(resource, new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_tip_tax_office_link_title), this.a.getTaxServiceUrl());
    }
}
