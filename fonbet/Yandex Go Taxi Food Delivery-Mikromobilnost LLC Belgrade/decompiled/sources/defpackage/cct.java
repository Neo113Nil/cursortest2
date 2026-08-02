package defpackage;

import com.yandex.messaging.internal.authorized.chat.b;
import com.yandex.messaging.internal.view.input.GetQuoteUseCase$run$$inlined$disposableFlowWrapper$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class cct extends vds0 {
    public final b b;
    public final xqi0 c;
    public final bn21 d;

    public cct(b bVar, xqi0 xqi0Var, bn21 bn21Var, kse kseVar) {
        super(kseVar.b);
        this.b = bVar;
        this.c = xqi0Var;
        this.d = bn21Var;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.t(e.i(new GetQuoteUseCase$run$$inlined$disposableFlowWrapper$1(null, this, (bct) obj)));
    }
}
