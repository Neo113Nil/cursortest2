package xsna;

import java.util.ArrayList;
import xsna.a9q0;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f8n implements izs {
    public final /* synthetic */ a9q0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f8n(a9q0 a9q0Var, boolean z) {
        this.b = a9q0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        f9n f9nVar = (f9n) obj;
        ArrayList arrayList = f9nVar.a;
        og50 og50Var = f9nVar.b;
        String str = f9nVar.d;
        a9q0.a aVar = a9q0.a.a;
        a9q0 a9q0Var = this.b;
        boolean z = !a9q0Var.equals(aVar);
        if (!this.c) {
            a9q0Var = null;
        }
        return new i8n(new qr60.a.g(arrayList, og50Var, str, z, false, null, a9q0Var, 32), f9nVar.e, f9nVar.f);
    }
}
