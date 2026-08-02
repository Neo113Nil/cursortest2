package yads;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;
import xsna.y9y;

/* loaded from: classes10.dex */
public final class t7 extends Lambda implements izs {
    public final /* synthetic */ f8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(f8 f8Var) {
        super(1);
        this.b = f8Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        y9y y9yVar = (y9y) obj;
        for (Map.Entry entry : this.b.h.entrySet()) {
            String str = (String) entry.getKey();
            s7 s7Var = new s7(entry);
            y9y y9yVar2 = new y9y();
            s7Var.invoke(y9yVar2);
            y9yVar.b(str, y9yVar2.a());
        }
        return s3q0.a;
    }
}
