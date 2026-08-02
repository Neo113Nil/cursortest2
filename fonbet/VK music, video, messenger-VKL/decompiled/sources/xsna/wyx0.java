package xsna;

import androidx.work.WorkInfo;
import androidx.work.b;
import androidx.work.impl.WorkerStoppedException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;
import xsna.uyx0;

/* compiled from: WorkerWrapper.kt */
@b6l(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {JsonToken.BOOLEAN}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class wyx0 extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    int label;
    final /* synthetic */ uyx0 this$0;

    /* compiled from: WorkerWrapper.kt */
    @b6l(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {JsonToken.BOOLEAN}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super uyx0.b>, Object> {
        int label;
        final /* synthetic */ uyx0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uyx0 uyx0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = uyx0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super uyx0.b> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            uyx0 uyx0Var = this.this$0;
            this.label = 1;
            Object a = uyx0.a(uyx0Var, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyx0(uyx0 uyx0Var, spj<? super wyx0> spjVar) {
        super(2, spjVar);
        this.this$0 = uyx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wyx0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return ((wyx0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final uyx0.b aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                uyx0 uyx0Var = this.this$0;
                gyx gyxVar = uyx0Var.n;
                a aVar2 = new a(uyx0Var, null);
                this.label = 1;
                obj = myc0.k(gyxVar, aVar2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            aVar = (uyx0.b) obj;
        } catch (WorkerStoppedException e) {
            aVar = new uyx0.b.c(e.d());
        } catch (CancellationException unused) {
            aVar = new uyx0.b.a(0);
        } catch (Throwable th) {
            m100.c().b(bzx0.a, "Unexpected error in WorkerWrapper", th);
            aVar = new uyx0.b.a(0);
        }
        final uyx0 uyx0Var2 = this.this$0;
        return uyx0Var2.i.t(new Callable() { // from class: xsna.vyx0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                uyx0.b bVar = uyx0.b.this;
                boolean z = bVar instanceof uyx0.b.C3858b;
                uyx0 uyx0Var3 = uyx0Var2;
                boolean z2 = true;
                boolean z3 = false;
                if (!z) {
                    if (bVar instanceof uyx0.b.a) {
                        uyx0Var3.d(((uyx0.b.a) bVar).a());
                        return Boolean.valueOf(z3);
                    }
                    if (!(bVar instanceof uyx0.b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int a2 = ((uyx0.b.c) bVar).a();
                    gxx0 gxx0Var = uyx0Var3.j;
                    String str = uyx0Var3.c;
                    WorkInfo.State d = gxx0Var.d(str);
                    if (d == null || d.h()) {
                        String str2 = bzx0.a;
                        m100 c = m100.c();
                        Objects.toString(d);
                        c.getClass();
                        z2 = false;
                        z3 = z2;
                        return Boolean.valueOf(z3);
                    }
                    String str3 = bzx0.a;
                    m100 c2 = m100.c();
                    d.toString();
                    c2.getClass();
                    gxx0Var.h(WorkInfo.State.ENQUEUED, str);
                    gxx0Var.c(a2, str);
                    gxx0Var.u(-1L, str);
                    z3 = z2;
                    return Boolean.valueOf(z3);
                }
                b.a aVar3 = ((uyx0.b.C3858b) bVar).a;
                gxx0 gxx0Var2 = uyx0Var3.j;
                String str4 = uyx0Var3.c;
                WorkInfo.State d2 = gxx0Var2.d(str4);
                uyx0Var3.i.C().delete(str4);
                if (d2 != null) {
                    if (d2 == WorkInfo.State.RUNNING) {
                        fxx0 fxx0Var = uyx0Var3.a;
                        if (aVar3 instanceof b.a.c) {
                            String str5 = bzx0.a;
                            m100.c().getClass();
                            if (fxx0Var.d()) {
                                uyx0Var3.c();
                            } else {
                                gxx0Var2.h(WorkInfo.State.SUCCEEDED, str4);
                                gxx0Var2.l(str4, ((b.a.c) aVar3).a);
                                uyx0Var3.g.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                izl izlVar = uyx0Var3.k;
                                Iterator it = izlVar.a(str4).iterator();
                                while (it.hasNext()) {
                                    String str6 = (String) it.next();
                                    if (gxx0Var2.d(str6) == WorkInfo.State.BLOCKED && izlVar.b(str6)) {
                                        String str7 = bzx0.a;
                                        m100.c().getClass();
                                        gxx0Var2.h(WorkInfo.State.ENQUEUED, str6);
                                        gxx0Var2.p(currentTimeMillis, str6);
                                    }
                                }
                            }
                        } else {
                            if (aVar3 instanceof b.a.C0093b) {
                                String str8 = bzx0.a;
                                m100.c().getClass();
                                uyx0Var3.b(-256);
                                z3 = z2;
                                return Boolean.valueOf(z3);
                            }
                            String str9 = bzx0.a;
                            m100.c().getClass();
                            if (fxx0Var.d()) {
                                uyx0Var3.c();
                            } else {
                                if (aVar3 == null) {
                                    aVar3 = new b.a.C0092a();
                                }
                                uyx0Var3.d(aVar3);
                            }
                        }
                    } else if (!d2.h()) {
                        uyx0Var3.b(-512);
                        z3 = z2;
                        return Boolean.valueOf(z3);
                    }
                }
                z2 = false;
                z3 = z2;
                return Boolean.valueOf(z3);
            }
        });
    }
}
