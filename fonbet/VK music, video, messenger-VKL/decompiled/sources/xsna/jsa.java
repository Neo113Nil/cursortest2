package xsna;

import com.vk.log.L;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: ChangeNameInteractor.kt */
/* loaded from: classes7.dex */
public final class jsa {
    public final rd9 a = new rd9();
    public final os9 b;
    public final io.reactivex.rxjava3.internal.operators.completable.c0 c;

    /* compiled from: ChangeNameInteractor.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public jsa(os9 os9Var) {
        this.b = os9Var;
        io.reactivex.rxjava3.core.a a2 = a201.b().b().a();
        fsa fsaVar = new fsa();
        a2.getClass();
        this.c = new io.reactivex.rxjava3.internal.operators.completable.c0(a2, fsaVar, null);
        if (o25.b(o25.a())) {
            qaj0.c(os9Var.c(), "changed_name", null);
        }
    }

    public static void c(izs izsVar) {
        if (a201.b().b().isInitialized()) {
            com.vk.voip.ui.c.b.getClass();
            izsVar.invoke(com.vk.voip.ui.c.j0());
        } else {
            io.reactivex.rxjava3.kotlin.c.d(a201.b().b().a().o(asu0.a.d()), new o87(izsVar, 2), new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0));
        }
    }

    public final String a() {
        return this.b.c().getString("changed_name", null);
    }

    public final void b(esa esaVar) {
        String str = esaVar.a;
        io.reactivex.rxjava3.kotlin.c.d(rsg0.Z(yfb.x(qd9.c(this.a, esaVar.b.b, str, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE))).q(asu0.a.c()), new pk(1, this, esaVar), new com.vk.movika.sdk.base.logic.interactor.p(this, 15));
    }
}
