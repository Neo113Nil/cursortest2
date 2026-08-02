package xsna;

import androidx.compose.runtime.a;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.chromium.net.NetError;
import xsna.h47;

/* compiled from: Binder.kt */
/* loaded from: classes3.dex */
public final class r37 {

    /* JADX INFO: Add missing generic type declarations: [Action, Event] */
    /* compiled from: Binder.kt */
    @b6l(c = "com.vk.mvi.binder.compose.BinderKt$Binder$3$1", f = "Binder.kt", l = {}, m = "invokeSuspend")
    public static final class a<Action, Event> extends SuspendLambda implements yzs<z37<Action>, Event, spj<? super s3q0>, Object> {
        int label;

        @Override // xsna.yzs
        public final Object invoke(Object obj, Object obj2, spj<? super s3q0> spjVar) {
            return new a(3, spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
    }

    /* compiled from: Binder.kt */
    @b6l(c = "com.vk.mvi.binder.compose.BinderKt$States$1$1$1$job$1", f = "Binder.kt", l = {112}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ ttk0<State> $flow;
        final /* synthetic */ wh50<State> $state$delegate;
        int label;

        /* compiled from: Binder.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ wh50<State> b;

            public a(wh50<State> wh50Var) {
                this.b = wh50Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                this.b.setValue((lm50) obj);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ttk0<? extends State> ttk0Var, wh50<State> wh50Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$flow = ttk0Var;
            this.$state$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$flow, this.$state$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                baj0 baj0Var = this.$flow;
                a aVar = new a(this.$state$delegate);
                this.label = 1;
                if (baj0Var.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: Effects.kt */
    public static final class c implements kgn {
        public final /* synthetic */ yok0 a;

        public c(yok0 yok0Var) {
            this.a = yok0Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.b(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if ((r18 & 2) != 0) goto L25;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <State extends lm50, Action extends lj50, Event extends pk50> void a(izs<? super g47<State, Action, Event>, s3q0> izsVar, yzs<? super z37<Action>, ? super Event, ? super spj<? super s3q0>, ? extends Object> yzsVar, zzs<? super z37<Action>, ? super State, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        uh50 C;
        androidx.compose.runtime.a M = aVar.M(-91662840);
        int i3 = i | (M.y(izsVar) ? 4 : 2) | (((i2 & 2) == 0 && M.y(yzsVar)) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            M.V();
            int i4 = i & 1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i4 == 0 || M.i()) {
                if ((i2 & 2) != 0) {
                    Object x = M.x();
                    if (x == c0012a) {
                        x = new a(3, null);
                        M.R(x);
                    }
                    yzsVar = (yzs) x;
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-91662840, i3, -1, "com.vk.mvi.binder.compose.Binder (Binder.kt:40)");
                }
                boolean z = (i3 & 14) == 4;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    h47 h47Var = new h47();
                    dr0 dr0Var = new dr0(izsVar, 2);
                    x2 = new cgk0(h47Var, dr0Var);
                    s3q0 s3q0Var = s3q0.a;
                    h47.a<ViewState, ViewAction, ViewEvent> aVar2 = h47Var.a;
                    aVar2.a = null;
                    aVar2.b = null;
                    aVar2.c = null;
                    dr0Var.invoke(h47Var, s3q0Var);
                    dak0 j = qak0.j();
                    uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
                    if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        dak0 j2 = C.j();
                        try {
                            h47.b<ViewState, ViewAction, ViewEvent> bVar = h47Var.b;
                            ((zak0) bVar.a).setValue(aVar2.a);
                            ((zak0) bVar.b).setValue(aVar2.b);
                            ((zak0) bVar.c).setValue(aVar2.c);
                            aVar2.a = null;
                            aVar2.b = null;
                            aVar2.c = null;
                            dak0.q(j2);
                            C.w().a();
                            C.c();
                            M.R(x2);
                        } catch (Throwable th) {
                            dak0.q(j2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            C.c();
                            throw th3;
                        }
                    }
                }
                h47.b<ViewState, ViewAction, ViewEvent> bVar2 = ((cgk0) x2).b.b;
                zak0 zak0Var = (zak0) bVar2.a;
                boolean J = M.J((xy) zak0Var.getValue());
                Object x3 = M.x();
                if (J || x3 == c0012a) {
                    x3 = new a47((xy) zak0Var.getValue());
                    M.R(x3);
                }
                a47 a47Var = (a47) x3;
                c(bVar2, a47Var, zzsVar, M, 384);
                b(bVar2, a47Var, yzsVar, M, (i3 << 3) & 896);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
        } else {
            M.h();
        }
        yzs<? super z37<Action>, ? super Event, ? super spj<? super s3q0>, ? extends Object> yzsVar2 = yzsVar;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ty5(izsVar, yzsVar2, zzsVar, i, i2);
        }
    }

    public static final void b(h47.b bVar, a47 a47Var, yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-237958224);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(a47Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(yzsVar) ? 256 : 128;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-237958224, i3, -1, "com.vk.mvi.binder.compose.Events (Binder.kt:124)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            Object obj = bVar.c;
            boolean y = M.y(yvjVar) | M.J(obj) | M.y(yzsVar) | ((i3 & 112) == 32);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                n37 n37Var = new n37(yvjVar, obj, yzsVar, a47Var, 0);
                M.R(n37Var);
                x2 = n37Var;
            }
            bap.c(yzsVar, (izs) x2, M, (i3 >> 6) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o37(i, 0, bVar, a47Var, yzsVar);
        }
    }

    public static final <Action extends lj50, Event extends pk50, State extends lm50> void c(h47.b<State, Action, Event> bVar, a47<Action> a47Var, zzs<? super z37<Action>, ? super State, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(609897424);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(a47Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(zzsVar) ? 256 : 128;
        }
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(609897424, i2, -1, "com.vk.mvi.binder.compose.States (Binder.kt:104)");
            }
            wh50<ttk0<State>> wh50Var = bVar.b;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            zak0 zak0Var = (zak0) wh50Var;
            ttk0 ttk0Var = (ttk0) zak0Var.getValue();
            if (ttk0Var == null) {
                M.K(1742864771);
            } else {
                M.K(1742864772);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = androidx.compose.runtime.k.b(ttk0Var.getValue());
                    M.R(x2);
                }
                wh50 wh50Var2 = (wh50) x2;
                ttk0 ttk0Var2 = (ttk0) zak0Var.getValue();
                boolean y = M.y(yvjVar) | M.y(ttk0Var);
                Object x3 = M.x();
                if (y || x3 == c0012a) {
                    x3 = new p37(yvjVar, ttk0Var, wh50Var2, i3);
                    M.R(x3);
                }
                bap.c(ttk0Var2, (izs) x3, M, 0);
                lm50 lm50Var = (lm50) wh50Var2.getValue();
                if (lm50Var == null) {
                    M.K(1256946829);
                    M.j();
                } else {
                    M.K(1256946830);
                    zzsVar.invoke(a47Var, lm50Var, M, Integer.valueOf((i2 & 896) | ((i2 >> 3) & 14)));
                    M.j();
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q37(i, 0, bVar, a47Var, zzsVar);
        }
    }
}
