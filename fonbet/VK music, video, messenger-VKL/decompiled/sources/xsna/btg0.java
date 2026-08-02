package xsna;

import java.io.Serializable;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class btg0 implements io.reactivex.rxjava3.core.d, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ btg0(Object obj, Serializable serializable) {
        this.b = obj;
        this.c = serializable;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) this.b;
        jvg0 jvg0Var = (jvg0) this.c;
        kotlin.coroutines.d a = mvj.a(EmptyCoroutineContext.b, dVar, true);
        xll xllVar = bdn.b;
        if (a != xllVar && a.get(c.a.b) == null) {
            a = a.plus(xllVar);
        }
        xd atg0Var = new atg0(a, bVar);
        bVar.a(new zsg0(atg0Var));
        atg0Var.w0(CoroutineStart.DEFAULT, atg0Var, jvg0Var);
    }
}
