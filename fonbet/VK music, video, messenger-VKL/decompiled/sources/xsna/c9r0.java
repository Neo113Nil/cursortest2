package xsna;

import com.vk.lists.c;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: VKAppsCatalogSectionDetailsPresenter.kt */
/* loaded from: classes6.dex */
public final class c9r0 implements c.m<ke3> {
    public final /* synthetic */ d9r0 b;

    /* compiled from: VKAppsCatalogSectionDetailsPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    public c9r0(d9r0 d9r0Var) {
        this.b = d9r0Var;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<ke3> O9(String str, com.vk.lists.c cVar) {
        return d9r0.a(this.b, str != null ? arm0.m(10, str) : null, Integer.valueOf(cVar.k()));
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<ke3> hj(com.vk.lists.c cVar, boolean z) {
        return d9r0.a(this.b, null, Integer.valueOf(cVar.k()));
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<ke3> qVar, boolean z, com.vk.lists.c cVar) {
        d9r0 d9r0Var = this.b;
        lkz lkzVar = new lkz(new r0r0(d9r0Var, 2), 24);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        d9r0Var.g().b(qVar.E(lkzVar, lVar, kVar, kVar).U(new yzt(new oi40(27), 19)).F(new pdw(new a(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 29)).subscribe(new k2y(new dim0(d9r0Var, z, cVar), 21), new qw40(new kvm0(d9r0Var, 9), 24)));
    }
}
