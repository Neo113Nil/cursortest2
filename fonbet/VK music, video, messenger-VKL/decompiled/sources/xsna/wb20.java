package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.vk.log.L;
import com.vk.translate.impl.models.LanguageModel;
import com.vk.translate.impl.models.SelectLanguageInitConfig;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.aop0;
import xsna.dop0;
import xsna.ob20;
import xsna.rb20;
import xsna.unp0;
import xsna.vmo0;
import xsna.wnp0;

/* compiled from: MessageTranslateViewModel.kt */
/* loaded from: classes6.dex */
public final class wb20 extends nyt0 implements vmo0.a {
    public final yb20 b;
    public final etj c;
    public final vmo0 d;
    public final pll e;
    public final io.reactivex.rxjava3.subjects.d<tb20> f;
    public final io.reactivex.rxjava3.internal.operators.observable.y g;
    public final io.reactivex.rxjava3.subjects.f<rb20> h;
    public final io.reactivex.rxjava3.internal.operators.observable.q2 i;
    public io.reactivex.rxjava3.disposables.c j;
    public io.reactivex.rxjava3.disposables.c k;

    /* compiled from: MessageTranslateViewModel.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<aop0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(aop0 aop0Var) {
            Object aVar;
            aop0 aop0Var2 = aop0Var;
            wb20 wb20Var = (wb20) this.receiver;
            wb20Var.getClass();
            if (aop0Var2 instanceof aop0.a) {
                aop0.a aVar2 = (aop0.a) aop0Var2;
                pll pllVar = wb20Var.e;
                LanguageModel h = pllVar.h(aVar2.b);
                LanguageModel h2 = pllVar.h(aVar2.c);
                unp0 unp0Var = wb20Var.f.P0().c;
                if ((unp0Var instanceof unp0.a) || (unp0Var instanceof unp0.b)) {
                    aVar = new unp0.a(h, h2);
                } else {
                    if (!(unp0Var instanceof unp0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new unp0.c(h, h2);
                }
                wb20Var.l(new g86(12, aVar2, aVar));
            } else {
                if (!(aop0Var2 instanceof aop0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                onp0 onp0Var = ((aop0.b) aop0Var2).a;
                synchronized (wb20Var) {
                    tb20 P0 = wb20Var.f.P0();
                    tb20 a = tb20.a(P0, null, new dop0.c(onp0Var), null, null, false, 29);
                    if (!P0.equals(a)) {
                        wb20Var.f.onNext(a);
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: MessageTranslateViewModel.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            ((wb20) this.receiver).getClass();
            L.i(th2);
            com.vk.metrics.eventtracking.b.a.a(th2);
            return s3q0.a;
        }
    }

    public wb20(yb20 yb20Var, etj etjVar, vmo0 vmo0Var, pll pllVar) {
        this.b = yb20Var;
        this.c = etjVar;
        this.d = vmo0Var;
        this.e = pllVar;
        io.reactivex.rxjava3.subjects.d<tb20> O0 = io.reactivex.rxjava3.subjects.d.O0(new tb20(new ez80("", false), dop0.b.a, unp0.b.a, new ob20.b(mb20.b), true));
        this.f = O0;
        this.g = new io.reactivex.rxjava3.internal.operators.observable.y(O0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        io.reactivex.rxjava3.subjects.f<rb20> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.h = fVar;
        this.i = new io.reactivex.rxjava3.internal.operators.observable.q2(fVar, new t7(new qcw(7), 22));
        vmo0Var.b();
    }

    @Override // xsna.vmo0.a
    public final void a() {
        dop0 dop0Var = this.f.P0().b;
        if (dop0Var instanceof dop0.a) {
            synchronized (this) {
                tb20 P0 = this.f.P0();
                tb20 a2 = tb20.a(P0, null, dop0.a.a((dop0.a) dop0Var, true), null, null, false, 29);
                if (!epx.f(P0, a2)) {
                    this.f.onNext(a2);
                }
            }
        }
    }

    @Override // xsna.vmo0.a
    public final void b() {
        dop0 dop0Var = this.f.P0().b;
        if (dop0Var instanceof dop0.a) {
            synchronized (this) {
                tb20 P0 = this.f.P0();
                tb20 a2 = tb20.a(P0, null, dop0.a.a((dop0.a) dop0Var, false), null, null, false, 29);
                if (!epx.f(P0, a2)) {
                    this.f.onNext(a2);
                }
            }
        }
    }

    @Override // xsna.nyt0
    public final void h() {
        this.d.d();
        io.reactivex.rxjava3.disposables.c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
        }
        this.j = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.k;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.k = null;
    }

    public final void i(boolean z) {
        tb20 P0 = this.f.P0();
        if (P0.e) {
            dop0 dop0Var = P0.b;
            if (dop0Var instanceof dop0.a) {
                etj etjVar = this.c;
                String obj = ((dop0.a) dop0Var).a.toString();
                ((ClipboardManager) etjVar.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(obj, obj));
                if (z) {
                    this.h.onNext(rb20.a.a);
                    return;
                }
                kb20 kb20Var = mb20.a;
                ob20.a aVar = new ob20.a(new nb20());
                synchronized (this) {
                    tb20 P02 = this.f.P0();
                    tb20 a2 = tb20.a(P02, null, null, null, aVar, false, 7);
                    if (!P02.equals(a2)) {
                        this.f.onNext(a2);
                    }
                }
                if (hg1.d(this.k)) {
                    return;
                }
                this.k = asu0.a.d().d(new io.reactivex.rxjava3.android.a(this, 9), 3L, TimeUnit.SECONDS);
            }
        }
    }

    public final void j() {
        SelectLanguageInitConfig selectLanguageInitConfig;
        unp0 unp0Var = this.f.P0().c;
        if (unp0Var instanceof unp0.a) {
            unp0.a aVar = (unp0.a) unp0Var;
            selectLanguageInitConfig = new SelectLanguageInitConfig.WithLanguages(aVar.a, aVar.b);
        } else if (unp0Var instanceof unp0.c) {
            unp0.c cVar = (unp0.c) unp0Var;
            selectLanguageInitConfig = new SelectLanguageInitConfig.WithLanguages(cVar.a, cVar.b);
        } else {
            selectLanguageInitConfig = SelectLanguageInitConfig.Empty.b;
        }
        this.h.onNext(new rb20.b(selectLanguageInitConfig));
    }

    public final void k(yi30 yi30Var, unp0 unp0Var) {
        wnp0 wnp0Var;
        if (hg1.d(this.j)) {
            return;
        }
        if ((unp0Var instanceof unp0.b) || (unp0Var instanceof unp0.a)) {
            wnp0Var = wnp0.a.a;
        } else {
            if (!(unp0Var instanceof unp0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            unp0.c cVar = (unp0.c) unp0Var;
            wnp0Var = new wnp0.b(cVar.a.d().g(), cVar.b.d().g());
        }
        this.j = new io.reactivex.rxjava3.internal.operators.single.n(this.b.a(yi30Var, wnp0Var).m(asu0.a.d()), new zyu(new iea(this, yi30Var, unp0Var, 3), 5)).subscribe(new pp3(new a(1, this, wb20.class, "onTranslateResult", "onTranslateResult(Lcom/vk/translate/impl/repository/TranslateResult;)V", 0), 29), new st0(new b(1, this, wb20.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0), 26));
    }

    public final synchronized void l(izs<? super tb20, tb20> izsVar) {
        tb20 P0 = this.f.P0();
        tb20 invoke = izsVar.invoke(P0);
        if (!epx.f(P0, invoke)) {
            this.f.onNext(invoke);
        }
    }
}
