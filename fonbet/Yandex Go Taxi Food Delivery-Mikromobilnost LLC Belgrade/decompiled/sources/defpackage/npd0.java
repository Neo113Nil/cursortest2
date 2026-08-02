package defpackage;

import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final class npd0 implements fod0 {
    public final tls a;

    public npd0(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.fod0
    public final zy11 a(ind0 ind0Var, uod0 uod0Var) {
        return zy11.a;
    }

    @Override // defpackage.fod0
    public final void b(ind0 ind0Var) {
    }

    @Override // defpackage.fod0
    public final void c(ind0 ind0Var, kod0 kod0Var) {
        PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
        List list = ind0Var.c;
        boolean z = kod0Var instanceof jod0;
        tls tlsVar = this.a;
        if (z) {
            jod0 jod0Var = (jod0) kod0Var;
            tlsVar.invoke(ind0.a(ind0Var, null, a.o0(list, PlusTarifficatorPurchase.copy$default(plusTarifficatorPurchase, null, null, jod0Var.b, new PlusTarifficatorPurchase.Status.Success(jod0Var.a), null, null, null, HProv.PP_CACHE_SIZE, null)), 27));
        } else if (kod0Var instanceof iod0) {
            tlsVar.invoke(ind0.a(ind0Var, null, a.o0(list, PlusTarifficatorPurchase.copy$default(plusTarifficatorPurchase, null, null, null, new PlusTarifficatorPurchase.Status.Error(((iod0) kod0Var).a), null, null, null, 119, null)), 27));
        } else {
            if (kod0Var instanceof hod0) {
                return;
            }
            w511.b();
        }
    }
}
