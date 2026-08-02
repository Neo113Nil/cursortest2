package androidx.compose.runtime;

import defpackage.aii0;
import defpackage.bii0;
import defpackage.bud;
import defpackage.bvf0;
import defpackage.h2t0;
import defpackage.jid;
import defpackage.l8x;
import defpackage.lid;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2b0;
import defpackage.q2t0;
import defpackage.r630;
import defpackage.sms;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements wls {
    final /* synthetic */ zls $block;
    final /* synthetic */ r630 $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ zls $block;
        final /* synthetic */ r630 $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(zls zlsVar, r630 r630Var, Continuation continuation) {
            super(2, continuation);
            this.$block = zlsVar;
            this.$parentFrameClock = r630Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tse tseVar = (tse) this.L$0;
                zls zlsVar = this.$block;
                r630 r630Var = this.$parentFrameClock;
                this.label = 1;
                if (zlsVar.invoke(tseVar, r630Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(j jVar, zls zlsVar, r630 r630Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$block = zlsVar;
        this.$parentFrameClock = r630Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, continuation);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Recomposer$recompositionRunner$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        l8x n;
        r0 r0Var;
        o2b0 o2b0Var;
        o2b0 a;
        h2t0 h2t0Var;
        Throwable th;
        List I;
        bii0 bii0Var;
        j jVar;
        r0 r0Var2;
        o2b0 o2b0Var2;
        o2b0 b;
        r0 r0Var3;
        o2b0 o2b0Var3;
        o2b0 b2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n = kotlinx.coroutines.a.n(((tse) this.L$0).getCoroutineContext());
            j jVar2 = this.this$0;
            synchronized (jVar2.c) {
                Throwable th2 = jVar2.e;
                if (th2 != null) {
                    throw th2;
                }
                if (((Recomposer$State) jVar2.u.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (jVar2.d != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                jVar2.d = n;
                if (jVar2.C() != null) {
                    lid.a("called outside of runRecomposeAndApplyChanges");
                }
            }
            jid jidVar = new jid(4, this.this$0);
            q2t0.e(q2t0.a);
            synchronized (q2t0.c) {
                q2t0.h = kotlin.collections.a.o0(q2t0.h, jidVar);
            }
            h2t0 h2t0Var2 = new h2t0(jidVar);
            r0 r0Var4 = j.z;
            sms smsVar = this.this$0.y;
            try {
                do {
                    r0Var = j.z;
                    o2b0Var = (o2b0) r0Var.getValue();
                    a = o2b0Var.a(smsVar);
                    if (o2b0Var != a) {
                    }
                    break;
                } while (!r0Var.k(o2b0Var, a));
                break;
                j jVar3 = this.this$0;
                synchronized (jVar3.c) {
                    I = jVar3.I();
                }
                int size = I.size();
                for (int i2 = 0; i2 < size; i2++) {
                    for (Object obj2 : ((bud) I.get(i2)).y.c) {
                        aii0 aii0Var = obj2 instanceof aii0 ? (aii0) obj2 : null;
                        if (aii0Var != null && (bii0Var = aii0Var.a) != null) {
                            bii0Var.a(aii0Var, null);
                        }
                    }
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, null);
                this.L$0 = n;
                this.L$1 = h2t0Var2;
                this.label = 1;
                if (bvf0.n(anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                h2t0Var = h2t0Var2;
            } catch (Throwable th3) {
                h2t0Var = h2t0Var2;
                th = th3;
                h2t0Var.a();
                jVar = this.this$0;
                synchronized (jVar.c) {
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h2t0Var = (h2t0) this.L$1;
            n = (l8x) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th4) {
                th = th4;
                h2t0Var.a();
                jVar = this.this$0;
                synchronized (jVar.c) {
                    try {
                        if (jVar.d == n) {
                            jVar.d = null;
                        }
                        if (jVar.C() != null) {
                            lid.a("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                r0 r0Var5 = j.z;
                sms smsVar2 = this.this$0.y;
                do {
                    r0Var2 = j.z;
                    o2b0Var2 = (o2b0) r0Var2.getValue();
                    b = o2b0Var2.b(smsVar2);
                    if (o2b0Var2 == b) {
                        break;
                    }
                } while (!r0Var2.k(o2b0Var2, b));
                throw th;
            }
        }
        h2t0Var.a();
        j jVar4 = this.this$0;
        synchronized (jVar4.c) {
            try {
                if (jVar4.d == n) {
                    jVar4.d = null;
                }
                if (jVar4.C() != null) {
                    lid.a("called outside of runRecomposeAndApplyChanges");
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        r0 r0Var6 = j.z;
        sms smsVar3 = this.this$0.y;
        do {
            r0Var3 = j.z;
            o2b0Var3 = (o2b0) r0Var3.getValue();
            b2 = o2b0Var3.b(smsVar3);
            if (o2b0Var3 == b2) {
                break;
            }
        } while (!r0Var3.k(o2b0Var3, b2));
        return zy11.a;
    }
}
