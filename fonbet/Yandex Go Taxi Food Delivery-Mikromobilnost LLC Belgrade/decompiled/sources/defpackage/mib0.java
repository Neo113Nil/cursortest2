package defpackage;

import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;
import ru.rt.ebs.cryptosdk.entities.exceptions.InstructionHandlerException;

/* loaded from: classes4.dex */
public final /* synthetic */ class mib0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oib0 b;

    public /* synthetic */ mib0(oib0 oib0Var, int i) {
        this.a = i;
        this.b = oib0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oib0 oib0Var = this.b;
        switch (i) {
            case 0:
                oib0Var.f0(new hao(new InstructionHandlerException(null, 1, null)));
                break;
            default:
                oib0Var.Z().emit(new Event.Process(null, 1, null));
                break;
        }
        return zy11Var;
    }
}
