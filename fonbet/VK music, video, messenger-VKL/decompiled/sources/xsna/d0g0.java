package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ReorderableState.kt */
/* loaded from: classes17.dex */
public abstract class d0g0<T> {
    public final yvj a;
    public final float b;
    public final wzs<zux, zux, s3q0> c;
    public final wzs<zux, zux, Boolean> d;
    public final wzs<Integer, Integer, s3q0> e;
    public final umk0 f;
    public yok0 l;
    public final wh50 g = androidx.compose.runtime.k.b(null);
    public final nm8 h = w0b.a(0, null, null, 7);
    public final nm8 i = w0b.a(0, null, null, 7);
    public final wh50 j = androidx.compose.runtime.k.b(new ov70(0));
    public final wh50 k = androidx.compose.runtime.k.b(null);
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();

    /* compiled from: ReorderableState.kt */
    @b6l(c = "com.vk.core.compose.reorder.ReorderableState$onDrag$1$1", f = "ReorderableState.kt", l = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ T $draggingItem;
        final /* synthetic */ T $targetItem;
        int label;
        final /* synthetic */ d0g0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0g0<T> d0g0Var, T t, T t2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = d0g0Var;
            this.$draggingItem = t;
            this.$targetItem = t2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$draggingItem, this.$targetItem, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                d0g0<T> d0g0Var = this.this$0;
                d0g0Var.c.invoke(new zux(d0g0Var.m(this.$draggingItem), this.this$0.n(this.$draggingItem)), new zux(this.this$0.m(this.$targetItem), this.this$0.n(this.$targetItem)));
                d0g0<T> d0g0Var2 = this.this$0;
                int j = d0g0Var2.j();
                int k = this.this$0.k();
                this.label = 1;
                if (d0g0Var2.z(j, k, this) == coroutineSingletons) {
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

    /* compiled from: ReorderableState.kt */
    @b6l(c = "com.vk.core.compose.reorder.ReorderableState$onDragCanceled$1", f = "ReorderableState.kt", l = {103}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ long $offset;
        final /* synthetic */ zux $position;
        int label;
        final /* synthetic */ d0g0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d0g0<T> d0g0Var, zux zuxVar, long j, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = d0g0Var;
            this.$position = zuxVar;
            this.$offset = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, this.$position, this.$offset, spjVar);
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
                umk0 umk0Var = this.this$0.f;
                zux zuxVar = this.$position;
                long j = this.$offset;
                this.label = 1;
                if (umk0Var.a(zuxVar, j, this) == coroutineSingletons) {
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

    public d0g0(yvj yvjVar, float f, wzs wzsVar, wzs wzsVar2, wzs wzsVar3, umk0 umk0Var) {
        this.a = yvjVar;
        this.b = f;
        this.c = wzsVar;
        this.d = wzsVar2;
        this.e = wzsVar3;
        this.f = umk0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r2 > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        if (r2 < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, long j) {
        float g;
        float u;
        float intBitsToFloat;
        float s;
        if (i() != null) {
            if (v()) {
                g = h() + q(r0);
                u = l(r0) + g;
                intBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
            } else {
                g = g() + o(r0);
                u = u(r0) + g;
                intBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
            }
            if (intBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                s = u - r();
            } else {
                if (intBitsToFloat < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    s = g - s();
                }
                s = 0.0f;
                int i = (int) (u - g);
                if (s != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float min = Math.min(1.0f, (Math.abs(s) * 1.0f) / i);
                    float signum = Math.signum(s) * f;
                    float f2 = 1;
                    float f3 = f2 - min;
                    float f4 = (f2 - (((f3 * f3) * f3) * f3)) * signum;
                    float f5 = j > 1500 ? 1.0f : j / 1500;
                    float f6 = f5 * f5 * f5 * f5 * f5 * f4;
                    return f6 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? s > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : -1.0f : f6;
                }
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public T b(T t, List<? extends T> list, int i, int i2) {
        int d;
        int abs;
        int q;
        int abs2;
        int o;
        int abs3;
        int p;
        int abs4;
        int u = u(t) + i;
        int l = l(t) + i2;
        int o2 = i - o(t);
        int q2 = i2 - q(t);
        int size = list.size();
        T t2 = null;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            T t3 = list.get(i4);
            if (o2 > 0 && (p = p(t3) - u) < 0 && p(t3) > p(t) && (abs4 = Math.abs(p)) > i3) {
                t2 = t3;
                i3 = abs4;
            }
            if (o2 < 0 && (o = o(t3) - i) > 0 && o(t3) < o(t) && (abs3 = Math.abs(o)) > i3) {
                t2 = t3;
                i3 = abs3;
            }
            if (q2 < 0 && (q = q(t3) - i2) > 0 && q(t3) < q(t) && (abs2 = Math.abs(q)) > i3) {
                t2 = t3;
                i3 = abs2;
            }
            if (q2 > 0 && (d = d(t3) - l) < 0 && d(t3) > d(t) && (abs = Math.abs(d)) > i3) {
                t2 = t3;
                i3 = abs;
            }
        }
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayList c(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = this.m;
        arrayList.clear();
        ArrayList arrayList2 = this.n;
        arrayList2.clear();
        int o = o(obj) + i;
        int p = p(obj) + i;
        int q = q(obj) + i2;
        int d = d(obj) + i2;
        int i6 = (o + p) / 2;
        int i7 = (q + d) / 2;
        List<T> t = t();
        int size = t.size();
        int i8 = 0;
        while (i8 < size) {
            T t2 = t.get(i8);
            int m = m(t2);
            Integer f = f();
            if ((f != null && m == f.intValue()) || d(t2) < q || q(t2) > d || p(t2) < o || o(t2) > p) {
                i3 = o;
                i4 = p;
                i5 = q;
            } else {
                wzs<zux, zux, Boolean> wzsVar = this.d;
                if (wzsVar != null) {
                    i3 = o;
                    i4 = p;
                    i5 = q;
                    if (!wzsVar.invoke(new zux(m(t2), n(t2)), new zux(m(obj), n(obj))).booleanValue()) {
                    }
                } else {
                    i3 = o;
                    i4 = p;
                    i5 = q;
                }
                int abs = Math.abs(i6 - ((p(t2) + o(t2)) / 2));
                int abs2 = Math.abs(i7 - ((d(t2) + q(t2)) / 2));
                int i9 = (abs2 * abs2) + (abs * abs);
                int size2 = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size2 && i9 > ((Number) arrayList2.get(i11)).intValue(); i11++) {
                    i10++;
                }
                arrayList.add(i10, t2);
                arrayList2.add(i10, Integer.valueOf(i9));
            }
            i8++;
            o = i3;
            p = i4;
            q = i5;
        }
        return arrayList;
    }

    public abstract int d(T t);

    public final long e() {
        return ((ov70) ((zak0) this.j).getValue()).a;
    }

    public final Integer f() {
        return (Integer) ((zak0) this.g).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float g() {
        if (i() == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return (Float.intBitsToFloat((int) (e() >> 32)) + (((zak0) this.k).getValue() != null ? o(r1) : 0)) - o(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float h() {
        if (i() == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return (Float.intBitsToFloat((int) (e() & 4294967295L)) + (((zak0) this.k).getValue() != null ? q(r1) : 0)) - q(r0);
    }

    public final T i() {
        for (T t : t()) {
            int m = m(t);
            Integer f = f();
            if (f != null && m == f.intValue()) {
                return t;
            }
        }
        return null;
    }

    public abstract int j();

    public abstract int k();

    public abstract int l(T t);

    public abstract int m(T t);

    public abstract Object n(T t);

    public abstract int o(T t);

    public abstract int p(T t);

    public abstract int q(T t);

    public abstract int r();

    public abstract int s();

    public abstract List<T> t();

    public abstract int u(T t);

    public abstract boolean v();

    public final void w(int i, int i2) {
        Object value = ((zak0) this.k).getValue();
        if (value == null) {
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (e() >> 32)) + i;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e() & 4294967295L)) + i2;
        ((zak0) this.j).setValue(new ov70((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
        T i3 = i();
        if (i3 == null) {
            return;
        }
        T b2 = b(i3, c((int) Float.intBitsToFloat((int) (e() >> 32)), (int) Float.intBitsToFloat((int) (e() & 4294967295L)), value), (int) (g() + o(i3)), (int) (h() + q(i3)));
        yvj yvjVar = this.a;
        if (b2 != null) {
            if (m(b2) == j() || m(i3) == j()) {
                myc0.h(yvjVar, null, null, new a(this, i3, b2, null), 3);
            } else {
                this.c.invoke(new zux(m(i3), n(i3)), new zux(m(b2), n(b2)));
            }
            ((zak0) this.g).setValue(Integer.valueOf(m(b2)));
        }
        float a2 = a(this.b, 0L);
        if (a2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        if (a2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            yok0 yok0Var = this.l;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            this.l = null;
            return;
        }
        yok0 yok0Var2 = this.l;
        if (yok0Var2 == null || !yok0Var2.isActive()) {
            this.l = myc0.h(yvjVar, null, null, new c0g0(a2, this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        d0g0 d0g0Var;
        Integer f = f();
        wh50 wh50Var = this.k;
        if (f != null) {
            int intValue = f.intValue();
            Object value = ((zak0) wh50Var).getValue();
            d0g0Var = this;
            myc0.h(d0g0Var.a, null, null, new b(d0g0Var, new zux(intValue, value != null ? n(value) : null), (Float.floatToRawIntBits(g()) << 32) | (Float.floatToRawIntBits(h()) & 4294967295L), null), 3);
        } else {
            d0g0Var = this;
        }
        Object value2 = ((zak0) wh50Var).getValue();
        Integer valueOf = value2 != null ? Integer.valueOf(m(value2)) : null;
        Integer f2 = f();
        ((zak0) wh50Var).setValue(null);
        ((zak0) d0g0Var.j).setValue(new ov70(0L));
        ((zak0) d0g0Var.g).setValue(null);
        yok0 yok0Var = d0g0Var.l;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        d0g0Var.l = null;
        wzs<Integer, Integer, s3q0> wzsVar = d0g0Var.e;
        if (wzsVar == null || valueOf == null || f2 == null) {
            return;
        }
        wzsVar.invoke(valueOf, f2);
    }

    public boolean y(int i, int i2) {
        T t;
        T t2;
        if (v()) {
            i2 += s();
        } else {
            i += s();
        }
        Iterator<T> it = t().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            int o = o(t2);
            if (i <= p(t2) && o <= i) {
                int q = q(t2);
                if (i2 <= d(t2) && q <= i2) {
                    break;
                }
            }
        }
        if (t2 != null) {
            ((zak0) this.k).setValue(t2);
            ((zak0) this.g).setValue(Integer.valueOf(m(t2)));
            t = t2;
        }
        return t != null;
    }

    public abstract Object z(int i, int i2, a aVar);
}
