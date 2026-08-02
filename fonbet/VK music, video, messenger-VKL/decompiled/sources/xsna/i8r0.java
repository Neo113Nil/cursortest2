package xsna;

import com.vk.lists.c;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: VKAppsCatalogCategoriesPresenter.kt */
/* loaded from: classes6.dex */
public final class i8r0 implements c.m<List<? extends AppsCategory>> {
    public final /* synthetic */ j8r0 b;

    /* compiled from: VKAppsCatalogCategoriesPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    public i8r0(j8r0 j8r0Var) {
        this.b = j8r0Var;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<List<? extends AppsCategory>> O9(String str, com.vk.lists.c cVar) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        return vdx0Var.d().E();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<List<AppsCategory>> hj(com.vk.lists.c cVar, boolean z) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        return vdx0Var.d().E();
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<List<AppsCategory>> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.internal.operators.observable.b0 F = qVar.U(new i4f0(new lcq0(3), 8)).F(new j720(new a(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 15));
        j8r0 j8r0Var = this.b;
        io.reactivex.rxjava3.disposables.c subscribe = F.subscribe(new y730(new alj0(j8r0Var, 14), 19), new c7q0(new c3k0(j8r0Var, 8), 2));
        j8r0Var.getClass();
        j8r0Var.c().b(subscribe);
        cVar.s(null);
    }
}
