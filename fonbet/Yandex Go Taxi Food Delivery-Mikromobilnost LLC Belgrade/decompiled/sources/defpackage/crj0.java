package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisiteFieldValidatorRegexEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class crj0 {
    public static rma1 a(mq01 mq01Var, String str, List list, boolean z, boolean z2) {
        if (z2) {
            str = gtu0.b(str);
        }
        if (str.length() != 0 || !z) {
            Object obj = null;
            if (str.length() == 0) {
                return new arj0(a.c(mq01Var, null));
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!((RequisiteFieldValidatorRegexEntity) next).getRegex().h(str)) {
                    obj = next;
                    break;
                }
            }
            RequisiteFieldValidatorRegexEntity requisiteFieldValidatorRegexEntity = (RequisiteFieldValidatorRegexEntity) obj;
            if (requisiteFieldValidatorRegexEntity != null) {
                return new arj0(g8e.i(Text.Companion, requisiteFieldValidatorRegexEntity.getHint()));
            }
        }
        return brj0.a;
    }

    public static rma1 b(vqj0 vqj0Var, boolean z) {
        mq01 mq01Var = vqj0Var.a;
        return a(mq01Var, vqj0Var.c, vqj0Var.k, z, mq01Var.getItemType() == ItemType.ACCOUNT_NUMBER);
    }
}
