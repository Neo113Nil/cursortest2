package xsna;

import com.vk.superapp.qr.web2app.data.CheckSignInOpenArguments;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;
import xsna.h1c;
import xsna.j1c;
import xsna.u25;

/* compiled from: CheckSignInFeature.kt */
@b6l(c = "com.vk.superapp.qr.web2app.modal.mvi.CheckSignInFeature$runGetAuthCode$1", f = "CheckSignInFeature.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class e1c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ g1c this$0;

    /* compiled from: CheckSignInFeature.kt */
    @b6l(c = "com.vk.superapp.qr.web2app.modal.mvi.CheckSignInFeature$runGetAuthCode$1$1", f = "CheckSignInFeature.kt", l = {JsonToken.BOOLEAN, 100, 101, 103}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<lsr<? super u25>, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ g1c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1c g1cVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = g1cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(lsr<? super u25> lsrVar, spj<? super s3q0> spjVar) {
            return ((a) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            if (r12 == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        
            if (r1.emit((xsna.u25) r12, r11) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        
            if (xsna.qsl.b(r6, r11) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L28;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0080 -> B:14:0x003f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            lsr lsrVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                lsrVar = (lsr) this.L$0;
            } else if (i == 1) {
                lsrVar = (lsr) this.L$0;
                kotlin.a.a(obj);
                this.L$0 = lsrVar;
                this.label = 2;
            } else if (i == 2) {
                lsrVar = (lsr) this.L$0;
                kotlin.a.a(obj);
                long j = this.this$0.g.c * 1000;
                this.L$0 = lsrVar;
                this.label = 3;
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                lsrVar = (lsr) this.L$0;
                kotlin.a.a(obj);
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            g1c g1cVar = this.this$0;
            CheckSignInOpenArguments checkSignInOpenArguments = g1cVar.g;
            if (currentTimeMillis <= checkSignInOpenArguments.d) {
                noe0 noe0Var = g1cVar.h;
                String str = checkSignInOpenArguments.b;
                this.L$0 = lsrVar;
                this.label = 1;
                obj = noe0Var.c(str, this);
            } else {
                u25.d dVar = u25.d.a;
                this.L$0 = null;
                this.label = 4;
            }
            return coroutineSingletons;
        }
    }

    /* compiled from: CheckSignInFeature.kt */
    @b6l(c = "com.vk.superapp.qr.web2app.modal.mvi.CheckSignInFeature$runGetAuthCode$1$2", f = "CheckSignInFeature.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<u25, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ g1c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g1c g1cVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = g1cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.this$0, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(u25 u25Var, spj<? super s3q0> spjVar) {
            return ((b) create(u25Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            u25 u25Var = (u25) this.L$0;
            if (epx.f(u25Var, u25.b.a) || epx.f(u25Var, u25.e.a)) {
                this.this$0.T(h1c.c.b);
            } else if (u25Var instanceof u25.a) {
                this.this$0.T(h1c.b.b);
                g1c g1cVar = this.this$0;
                myc0.h(g1cVar.k, g1cVar.j.plus(g1cVar.n), null, new c1c(g1cVar, (u25.a) u25Var, null), 2);
                g1c g1cVar2 = this.this$0;
                yok0 yok0Var = g1cVar2.m;
                if (yok0Var != null) {
                    yok0Var.b(null);
                }
                g1cVar2.m = null;
            } else {
                if (!epx.f(u25Var, u25.c.a) && !epx.f(u25Var, u25.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.l.b(j1c.a.a);
                this.this$0.T(h1c.d.b);
                g1c g1cVar3 = this.this$0;
                yok0 yok0Var2 = g1cVar3.m;
                if (yok0Var2 != null) {
                    yok0Var2.b(null);
                }
                g1cVar3.m = null;
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1c(g1c g1cVar, spj<? super e1c> spjVar) {
        super(2, spjVar);
        this.this$0 = g1cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e1c(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e1c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 izg0Var = new izg0(new a(this.this$0, null));
            b bVar = new b(this.this$0, null);
            this.label = 1;
            if (rsr.k(izg0Var, bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
