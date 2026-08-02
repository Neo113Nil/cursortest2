package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import androidx.work.WorkInfo$State;
import androidx.work.impl.d;
import defpackage.csf0;
import defpackage.hgz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8x;
import defpackage.ta51;
import defpackage.tje;
import defpackage.tse;
import defpackage.va51;
import defpackage.wa51;
import defpackage.wls;
import defpackage.ya51;
import defpackage.zy11;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WorkerWrapper$launch$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$launch$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkerWrapper$launch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkerWrapper$launch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final wa51 ta51Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar = this.this$0;
                s8x s8xVar = dVar.n;
                WorkerWrapper$launch$1$resolution$1 workerWrapper$launch$1$resolution$1 = new WorkerWrapper$launch$1$resolution$1(dVar, null);
                this.label = 1;
                obj = tje.k0(s8xVar, workerWrapper$launch$1$resolution$1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            ta51Var = (wa51) obj;
        } catch (WorkerStoppedException e) {
            ta51Var = new va51(e.getReason());
        } catch (CancellationException unused) {
            ta51Var = new ta51(0);
        } catch (Throwable th) {
            hgz.g().f(ya51.a, "Unexpected error in WorkerWrapper", th);
            ta51Var = new ta51(0);
        }
        final d dVar2 = this.this$0;
        return dVar2.i.P0(new csf0(14, new Callable() { // from class: xa51
            @Override // java.util.concurrent.Callable
            public final Object call() {
                wa51 wa51Var = wa51.this;
                boolean z = wa51Var instanceof ua51;
                d dVar3 = dVar2;
                boolean z2 = true;
                boolean z3 = false;
                if (!z) {
                    if (wa51Var instanceof ta51) {
                        dVar3.d(((ta51) wa51Var).a());
                        return Boolean.valueOf(z3);
                    }
                    if (!(wa51Var instanceof va51)) {
                        w511.b();
                        return null;
                    }
                    int a = ((va51) wa51Var).a();
                    String str = dVar3.c;
                    ia51 ia51Var = dVar3.j;
                    if (jl40.l(dVar3.a.y, Boolean.TRUE)) {
                        String str2 = ya51.a;
                        hgz.g().getClass();
                        dVar3.b(a);
                    } else {
                        WorkInfo$State c = ia51Var.c(str);
                        if (c == null || c.a()) {
                            String str3 = ya51.a;
                            hgz g = hgz.g();
                            Objects.toString(c);
                            g.getClass();
                            z2 = false;
                        } else {
                            String str4 = ya51.a;
                            hgz g2 = hgz.g();
                            c.toString();
                            g2.getClass();
                            ia51Var.g(WorkInfo$State.ENQUEUED, str);
                            ia51Var.h(str, a);
                            ia51Var.f(-1L, str);
                        }
                    }
                    z3 = z2;
                    return Boolean.valueOf(z3);
                }
                juy juyVar = ((ua51) wa51Var).a;
                ia51 ia51Var2 = dVar3.j;
                String str5 = dVar3.c;
                WorkInfo$State c2 = ia51Var2.c(str5);
                RoomDatabase roomDatabase = ia51Var2.a;
                a.b(dVar3.i.W0().a, false, true, new brd(str5, 16));
                if (c2 != null) {
                    if (c2 == WorkInfo$State.RUNNING) {
                        fa51 fa51Var = dVar3.a;
                        String str6 = dVar3.m;
                        if (juyVar instanceof iuy) {
                            String str7 = ya51.a;
                            hgz.g().h(str7, "Worker result SUCCESS for " + str6);
                            if (fa51Var.c()) {
                                dVar3.c();
                            } else {
                                ia51Var2.g(WorkInfo$State.SUCCEEDED, str5);
                                a.b(roomDatabase, false, true, new fgw0(7, ((iuy) juyVar).a, str5));
                                dVar3.g.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                ywi ywiVar = dVar3.k;
                                for (String str8 : ywiVar.a(str5)) {
                                    if (ia51Var2.c(str8) == WorkInfo$State.BLOCKED && ((Boolean) a.b(ywiVar.a, true, false, new wwb(str8, 14))).booleanValue()) {
                                        hgz.g().h(ya51.a, "Setting status to enqueued for ".concat(str8));
                                        ia51Var2.g(WorkInfo$State.ENQUEUED, str8);
                                        a.b(roomDatabase, false, true, new qo6(currentTimeMillis, str8, 26));
                                    }
                                }
                            }
                        } else {
                            if (juyVar instanceof huy) {
                                String str9 = ya51.a;
                                hgz.g().h(str9, "Worker result RETRY for " + str6);
                                dVar3.b(-256);
                                z3 = z2;
                                return Boolean.valueOf(z3);
                            }
                            String str10 = ya51.a;
                            hgz.g().h(str10, "Worker result FAILURE for " + str6);
                            if (fa51Var.c()) {
                                dVar3.c();
                            } else {
                                dVar3.d(juyVar);
                            }
                        }
                    } else if (!c2.a()) {
                        dVar3.b(-512);
                        z3 = z2;
                        return Boolean.valueOf(z3);
                    }
                }
                z2 = false;
                z3 = z2;
                return Boolean.valueOf(z3);
            }
        }));
    }
}
