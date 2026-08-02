package xsna;

import java.util.Arrays;
import kotlin.Result;
import ru.ok.gl.util.Consumer3;
import xsna.hlw;
import xsna.qn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class m7j implements Consumer3, io.reactivex.rxjava3.core.a0, hlw.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m7j(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.ok.gl.util.Consumer3
    public void accept(Object obj, Object obj2, Object obj3) {
        ((Consumer3) this.b).lambda$andThen$0((Consumer3) this.c, obj, obj2, obj3);
    }

    @Override // xsna.hlw.a
    public void d(hlw hlwVar) {
        czg0 czg0Var = (czg0) this.b;
        hlw.a aVar = (hlw.a) this.c;
        czg0Var.getClass();
        aVar.d(czg0Var);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        qn60 qn60Var = (qn60) this.b;
        qn60.b[] bVarArr = (qn60.b[]) this.c;
        Object f = qn60Var.f((qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (!(f instanceof Result.Failure)) {
            yVar.onSuccess((qn60.c) f);
        }
        Throwable a = Result.a(f);
        if (a != null) {
            yVar.onError(a);
        }
    }
}
