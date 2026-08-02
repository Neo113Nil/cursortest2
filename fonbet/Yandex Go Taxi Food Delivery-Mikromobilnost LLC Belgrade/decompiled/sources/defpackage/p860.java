package defpackage;

import com.ybsdk.core.common.data.network.dto.nfc.NfcProductTypeDto;
import com.ybsdk.feature.nfc.api.models.NfcPaymentMethod;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class p860 implements n860 {
    public final q960 a;
    public final qa60 b;

    public p860(q960 q960Var, qa60 qa60Var) {
        this.a = q960Var;
        this.b = qa60Var;
    }

    public static final NfcProductTypeDto a(p860 p860Var, NfcPaymentMethod nfcPaymentMethod) {
        if (!(nfcPaymentMethod instanceof NfcPaymentMethod.Product)) {
            if ((nfcPaymentMethod instanceof NfcPaymentMethod.External) || (nfcPaymentMethod instanceof NfcPaymentMethod.Yellow)) {
                return null;
            }
            w511.b();
            return null;
        }
        int i = o860.a[((NfcPaymentMethod.Product) nfcPaymentMethod).getNfcProductType().ordinal()];
        if (i == 1) {
            return NfcProductTypeDto.PAY_CARD;
        }
        if (i == 2) {
            return NfcProductTypeDto.CREDIT_LIMIT;
        }
        if (i == 3) {
            return NfcProductTypeDto.CORP_CARD;
        }
        if (i == 4) {
            return NfcProductTypeDto.PRO;
        }
        if (i == 5) {
            return NfcProductTypeDto.OTHER;
        }
        w511.b();
        return null;
    }

    public final fzw b() {
        ((ra60) this.b).getClass();
        return new fzw(14, new g92(2, EmptyList.a), this);
    }
}
