package defpackage;

import com.yandex.mob.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class po20 implements vbf {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo20 b;

    public /* synthetic */ po20(yo20 yo20Var, int i) {
        this.a = i;
        this.b = yo20Var;
    }

    @Override // defpackage.vbf
    public final Object a(Object obj, ContinuationImpl continuationImpl) {
        int i = this.a;
        yo20 yo20Var = this.b;
        switch (i) {
            case 0:
                return d.f(yo20Var.A.b).c(continuationImpl);
            case 1:
                return d.f(yo20Var.A.b).b(continuationImpl);
            case 2:
                return d.f(yo20Var.A.b).g(continuationImpl);
            default:
                return d.f(yo20Var.A.b).n(continuationImpl);
        }
    }

    @Override // defpackage.vbf
    public final Object b(Continuation continuation) {
        switch (this.a) {
            case 0:
                return new Integer(60);
            case 1:
                return new Integer(5);
            case 2:
                return new Integer(15);
            default:
                return d.f(this.b.A.b).k((ContinuationImpl) continuation);
        }
    }
}
