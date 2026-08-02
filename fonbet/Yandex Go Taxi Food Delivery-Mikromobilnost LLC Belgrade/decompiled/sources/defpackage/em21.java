package defpackage;

import java.util.function.Function;
import yads.pf1;
import yads.qf1;

/* loaded from: classes7.dex */
public final /* synthetic */ class em21 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ em21(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                return (pz40) ((dl01) tlsVar).invoke(obj);
            default:
                return (pf1) ((qf1) tlsVar).invoke(obj);
        }
    }
}
