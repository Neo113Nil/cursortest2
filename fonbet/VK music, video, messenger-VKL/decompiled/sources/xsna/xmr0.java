package xsna;

import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import xsna.h8z0;
import xsna.hjz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class xmr0 implements Optional.Action, h8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xmr0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.h8z0.b
    public void a() {
        hjz0.a aVar;
        switch (this.b) {
            case 1:
                aVar = (hjz0.a) this.c;
                String str = ((p0z0) this.d).F;
                break;
            default:
                p4z0 p4z0Var = (p4z0) this.c;
                tez0 tez0Var = (tez0) this.d;
                aVar = p4z0Var.a;
                String str2 = tez0Var.F;
                break;
        }
        yil0.d(aVar);
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.c).lambda$requestIvrCall$15((VerificationApi.FailReason) this.d, (VerificationListener) obj);
    }
}
