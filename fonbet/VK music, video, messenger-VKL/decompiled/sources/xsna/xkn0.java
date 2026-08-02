package xsna;

import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import ru.ok.proto.PublisherConfiguration;
import xsna.q630;

/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes11.dex */
public final class xkn0 extends q630.c implements tkn0, dmb0, azl {
    public Object p;
    public Object q;
    public Object[] r;
    public PointerInputEventHandler s;
    public yok0 t;
    public plb0 u = skn0.a;
    public final ci50<a<?>> v;
    public final ci50 w;
    public final ci50<a<?>> x;
    public plb0 y;
    public long z;

    /* compiled from: SuspendingPointerInputFilter.kt */
    public final class a<R> implements eu5, azl, spj<R> {
        public final /* synthetic */ xkn0 b;
        public final lq9 c;
        public lq9 d;
        public PointerEventPass e = PointerEventPass.Main;
        public final EmptyCoroutineContext f = EmptyCoroutineContext.b;

        public a(lq9 lq9Var) {
            this.b = xkn0.this;
            this.c = lq9Var;
        }

        @Override // xsna.eu5
        public final long A1() {
            xkn0 xkn0Var = xkn0.this;
            xkn0Var.getClass();
            long p1 = xkn0Var.p1(itl.f(xkn0Var).B.g());
            long j = xkn0Var.z;
            float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (p1 >> 32)) - ((int) (j >> 32))) / 2.0f;
            float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (p1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
            return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
        }

        @Override // xsna.azl
        public final long E(long j) {
            return this.b.E(j);
        }

        @Override // xsna.azl
        public final long I(int i) {
            return this.b.I(i);
        }

        @Override // xsna.azl
        public final float I0(float f) {
            return this.b.getDensity() * f;
        }

        @Override // xsna.eu5
        public final Object I1(PointerEventPass pointerEventPass, spj<? super plb0> spjVar) {
            lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
            lq9Var.o();
            this.e = pointerEventPass;
            this.d = lq9Var;
            Object n = lq9Var.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return n;
        }

        @Override // xsna.azl
        public final long J(float f) {
            return this.b.J(f);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        @Override // xsna.eu5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object L0(long j, wzs wzsVar, ContinuationImpl continuationImpl) {
            wkn0 wkn0Var;
            int i;
            try {
                if (continuationImpl instanceof wkn0) {
                    wkn0Var = (wkn0) continuationImpl;
                    int i2 = wkn0Var.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        wkn0Var.label = i2 - Integer.MIN_VALUE;
                        Object obj = wkn0Var.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = wkn0Var.label;
                        if (i == 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return obj;
                        }
                        kotlin.a.a(obj);
                        wkn0Var.label = 1;
                        Object f0 = f0(j, wzsVar, wkn0Var);
                        return f0 == coroutineSingletons ? coroutineSingletons : f0;
                    }
                }
                if (i == 0) {
                }
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
            wkn0Var = new wkn0(this, continuationImpl);
            Object obj2 = wkn0Var.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = wkn0Var.label;
        }

        @Override // xsna.azl
        public final float O0(long j) {
            return this.b.O0(j);
        }

        @Override // xsna.eu5
        public final long a() {
            return xkn0.this.z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1, types: [xsna.eyx] */
        /* JADX WARN: Type inference failed for: r7v4, types: [xsna.eyx] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // xsna.eu5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object f0(long j, wzs wzsVar, BaseContinuationImpl baseContinuationImpl) {
            ukn0 ukn0Var;
            int i;
            lq9 lq9Var;
            try {
                if (baseContinuationImpl instanceof ukn0) {
                    ukn0Var = (ukn0) baseContinuationImpl;
                    int i2 = ukn0Var.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ukn0Var.label = i2 - Integer.MIN_VALUE;
                        Object obj = ukn0Var.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = ukn0Var.label;
                        if (i != 0) {
                            kotlin.a.a(obj);
                            if (j <= 0 && (lq9Var = this.d) != null) {
                                lq9Var.resumeWith(new Result.Failure(new PointerEventTimeoutCancellationException(j)));
                            }
                            yok0 h = myc0.h(xkn0.this.W1(), null, null, new vkn0(j, this, null), 3);
                            ukn0Var.L$0 = h;
                            ukn0Var.label = 1;
                            obj = wzsVar.invoke(this, ukn0Var);
                            j = h;
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            eyx eyxVar = (eyx) ukn0Var.L$0;
                            kotlin.a.a(obj);
                            j = eyxVar;
                        }
                        return obj;
                    }
                }
                if (i != 0) {
                }
                return obj;
            } finally {
                j.b(CancelTimeoutCancellationException.b);
            }
            ukn0Var = new ukn0(this, baseContinuationImpl);
            Object obj2 = ukn0Var.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = ukn0Var.label;
        }

        @Override // xsna.spj
        public final kotlin.coroutines.d getContext() {
            return this.f;
        }

        @Override // xsna.azl
        public final float getDensity() {
            return this.b.getDensity();
        }

        @Override // xsna.azl
        public final float getFontScale() {
            return this.b.getFontScale();
        }

        @Override // xsna.eu5
        public final rut0 getViewConfiguration() {
            xkn0 xkn0Var = xkn0.this;
            xkn0Var.getClass();
            return itl.f(xkn0Var).B;
        }

        @Override // xsna.azl
        public final long i0(float f) {
            return this.b.i0(f);
        }

        @Override // xsna.azl
        public final float j1(int i) {
            return this.b.j1(i);
        }

        @Override // xsna.azl
        public final float k1(float f) {
            return f / this.b.getDensity();
        }

        @Override // xsna.azl
        public final long p1(long j) {
            return this.b.p1(j);
        }

        @Override // xsna.azl
        public final int r0(float f) {
            return this.b.r0(f);
        }

        @Override // xsna.spj
        public final void resumeWith(Object obj) {
            xkn0 xkn0Var = xkn0.this;
            synchronized (xkn0Var.w) {
                xkn0Var.v.j(this);
                s3q0 s3q0Var = s3q0.a;
            }
            this.c.resumeWith(obj);
        }

        @Override // xsna.azl
        public final float u0(long j) {
            return this.b.u0(j);
        }

        @Override // xsna.eu5
        public final plb0 z0() {
            return xkn0.this.u;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    public static final class c extends Lambda implements izs<Throwable, s3q0> {
        final /* synthetic */ a<R> $handlerCoroutine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a<R> aVar) {
            super(1);
            this.$handlerCoroutine = aVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            a<R> aVar = this.$handlerCoroutine;
            lq9 lq9Var = aVar.d;
            if (lq9Var != null) {
                lq9Var.z(th2);
            }
            aVar.d = null;
            return s3q0.a;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @b6l(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_SERVER_DATA, PublisherConfiguration.DEFAULT_MAX_RES}, m = "invokeSuspend", v = 1)
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public d(spj<? super d> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return xkn0.this.new d(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                xkn0.this.getClass();
                xkn0 xkn0Var = xkn0.this;
                PointerInputEventHandler pointerInputEventHandler = xkn0Var.s;
                this.label = 2;
                if (pointerInputEventHandler.invoke(xkn0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public xkn0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.p = obj;
        this.q = obj2;
        this.r = objArr;
        this.s = pointerInputEventHandler;
        ci50<a<?>> ci50Var = new ci50<>(new a[16]);
        this.v = ci50Var;
        this.w = ci50Var;
        this.x = new ci50<>(new a[16]);
        this.z = 0L;
    }

    @Override // xsna.cmb0
    public final void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        this.z = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.u = plb0Var;
        }
        if (this.t == null) {
            this.t = myc0.h(W1(), null, CoroutineStart.UNDISPATCHED, new d(null), 1);
        }
        i2(plb0Var, pointerEventPass);
        List<xlb0> list = plb0Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                plb0Var = null;
                break;
            } else if (!fdi.o(list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.y = plb0Var;
    }

    @Override // xsna.cmb0
    public final void M0() {
        x0();
    }

    @Override // xsna.dmb0
    public final <R> Object Z0(wzs<? super eu5, ? super spj<? super R>, ? extends Object> wzsVar, spj<? super R> spjVar) {
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        a aVar = new a(lq9Var);
        synchronized (this.w) {
            this.v.b(aVar);
            new gzg0(s7s0.c(s7s0.a(aVar, aVar, wzsVar)), CoroutineSingletons.COROUTINE_SUSPENDED).resumeWith(s3q0.a);
        }
        lq9Var.r(new c(aVar));
        return lq9Var.n();
    }

    @Override // xsna.dmb0
    public final long a() {
        return this.z;
    }

    @Override // xsna.q630.c
    public final void b2() {
        x0();
    }

    @Override // xsna.azl
    public final float getDensity() {
        return itl.f(this).z.getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return itl.f(this).z.getFontScale();
    }

    @Override // xsna.dmb0
    public final rut0 getViewConfiguration() {
        return itl.f(this).B;
    }

    @Override // xsna.cmb0
    public final void h1() {
        plb0 plb0Var = this.y;
        if (plb0Var == null) {
            return;
        }
        List<xlb0> list = plb0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    xlb0 xlb0Var = list.get(i2);
                    long j = xlb0Var.a;
                    long j2 = xlb0Var.c;
                    long j3 = xlb0Var.b;
                    float f = xlb0Var.e;
                    boolean z = xlb0Var.d;
                    arrayList.add(new xlb0(j, j3, j2, false, f, j3, j2, z, z, xlb0Var.i, 0L, 1.0f, 0L));
                }
                plb0 plb0Var2 = new plb0(arrayList, null);
                this.u = plb0Var2;
                i2(plb0Var2, PointerEventPass.Initial);
                i2(plb0Var2, PointerEventPass.Main);
                i2(plb0Var2, PointerEventPass.Final);
                this.y = null;
                return;
            }
        }
    }

    public final void i2(plb0 plb0Var, PointerEventPass pointerEventPass) {
        lq9 lq9Var;
        lq9 lq9Var2;
        synchronized (this.w) {
            ci50<a<?>> ci50Var = this.x;
            ci50Var.d(ci50Var.d, this.v);
        }
        try {
            int i = b.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                ci50<a<?>> ci50Var2 = this.x;
                a<?>[] aVarArr = ci50Var2.b;
                int i2 = ci50Var2.d;
                for (int i3 = 0; i3 < i2; i3++) {
                    a<?> aVar = aVarArr[i3];
                    if (pointerEventPass == aVar.e && (lq9Var = aVar.d) != null) {
                        aVar.d = null;
                        lq9Var.resumeWith(plb0Var);
                    }
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ci50<a<?>> ci50Var3 = this.x;
                int i4 = ci50Var3.d - 1;
                a<?>[] aVarArr2 = ci50Var3.b;
                if (i4 < aVarArr2.length) {
                    while (i4 >= 0) {
                        a<?> aVar2 = aVarArr2[i4];
                        if (pointerEventPass == aVar2.e && (lq9Var2 = aVar2.d) != null) {
                            aVar2.d = null;
                            lq9Var2.resumeWith(plb0Var);
                        }
                        i4--;
                    }
                }
            }
            this.x.g();
        } catch (Throwable th) {
            this.x.g();
            throw th;
        }
    }

    @Override // xsna.htl, xsna.cmb0
    public final void q() {
        x0();
    }

    @Override // xsna.tkn0
    public final void x0() {
        yok0 yok0Var = this.t;
        if (yok0Var != null) {
            yok0Var.P(new PointerInputResetException());
            this.t = null;
        }
    }
}
