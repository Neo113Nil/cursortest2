package xsna;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: AndroidOverscroll.android.kt */
/* loaded from: classes11.dex */
public final class d82 implements e490 {
    public final azl a;
    public long b = 9205357640488583168L;
    public final iyo c;
    public final wh50<s3q0> d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final ytl i;

    /* compiled from: AndroidOverscroll.android.kt */
    public static final class a implements PointerInputEventHandler {

        /* compiled from: AndroidOverscroll.android.kt */
        @b6l(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {788, 792}, m = "invokeSuspend", v = 1)
        /* renamed from: xsna.d82$a$a, reason: collision with other inner class name */
        public static final class C2711a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ d82 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2711a(d82 d82Var, spj<? super C2711a> spjVar) {
                super(2, spjVar);
                this.this$0 = d82Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C2711a c2711a = new C2711a(this.this$0, spjVar);
                c2711a.L$0 = obj;
                return c2711a;
            }

            @Override // xsna.wzs
            public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
                return ((C2711a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
            
                if (r13 != r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0035, code lost:
            
                if (r13 == r0) goto L16;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004e -> B:6:0x0051). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                eu5 eu5Var;
                Object obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    eu5Var = (eu5) this.L$0;
                    this.L$0 = eu5Var;
                    this.label = 1;
                    obj = z2o0.b(eu5Var, null, this, 2);
                } else if (i == 1) {
                    eu5Var = (eu5) this.L$0;
                    kotlin.a.a(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eu5Var = (eu5) this.L$0;
                    kotlin.a.a(obj);
                    List<xlb0> list = ((plb0) obj).a;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        xlb0 xlb0Var = list.get(i3);
                        if (xlb0Var.d) {
                            arrayList.add(xlb0Var);
                        }
                    }
                    d82 d82Var = this.this$0;
                    int size2 = arrayList.size();
                    while (true) {
                        if (i2 >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i2);
                        if (wlb0.g(((xlb0) obj2).a, d82Var.h)) {
                            break;
                        }
                        i2++;
                    }
                    xlb0 xlb0Var2 = (xlb0) obj2;
                    if (xlb0Var2 == null) {
                        xlb0Var2 = (xlb0) j5g.a0(arrayList);
                    }
                    if (xlb0Var2 != null) {
                        d82 d82Var2 = this.this$0;
                        d82Var2.h = xlb0Var2.a;
                        d82Var2.b = xlb0Var2.c;
                    }
                    if (arrayList.isEmpty()) {
                        this.this$0.h = -1L;
                        return s3q0.a;
                    }
                    this.L$0 = eu5Var;
                    this.label = 2;
                    obj = eu5Var.I1(PointerEventPass.Main, this);
                }
                xlb0 xlb0Var3 = (xlb0) obj;
                d82 d82Var3 = this.this$0;
                d82Var3.h = xlb0Var3.a;
                d82Var3.b = xlb0Var3.c;
                this.L$0 = eu5Var;
                this.label = 2;
                obj = eu5Var.I1(PointerEventPass.Main, this);
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            Object c = d7s.c(dmb0Var, new C2711a(d82.this, null), spjVar);
            return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
        }
    }

    public d82(Context context, azl azlVar, long j, s890 s890Var) {
        this.a = azlVar;
        iyo iyoVar = new iyo(context, f870.H(j));
        this.c = iyoVar;
        this.d = androidx.compose.runtime.k.a(s3q0.a, w65.e);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        xkn0 a2 = skn0.a(new a());
        this.i = Build.VERSION.SDK_INT >= 31 ? new mpm0(a2, this, iyoVar) : new s2u(a2, this, iyoVar, s890Var);
    }

    @Override // xsna.e490
    public final boolean a() {
        iyo iyoVar = this.c;
        EdgeEffect edgeEffect = iyoVar.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? uw2.b(edgeEffect) : 0.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = iyoVar.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? uw2.b(edgeEffect2) : 0.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = iyoVar.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? uw2.b(edgeEffect3) : 0.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = iyoVar.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? uw2.b(edgeEffect4) : 0.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005a, code lost:
    
        if (r20.invoke(r4, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0128, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // xsna.e490
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, wzs wzsVar, ContinuationImpl continuationImpl) {
        c82 c82Var;
        int i;
        long d;
        if (continuationImpl instanceof c82) {
            c82Var = (c82) continuationImpl;
            int i2 = c82Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c82Var.label = i2 - Integer.MIN_VALUE;
                Object obj = c82Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c82Var.label;
                iyo iyoVar = this.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (mxj0.d(this.g)) {
                        jmr0 jmr0Var = new jmr0(j);
                        c82Var.label = 1;
                    } else {
                        boolean g = iyo.g(iyoVar.f);
                        azl azlVar = this.a;
                        long b = m200.b((!g || jmr0.b(j) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? (!iyo.g(iyoVar.g) || jmr0.b(j) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : -gyo.a(iyoVar.d(), -jmr0.b(j), Float.intBitsToFloat((int) (this.g >> 32)), azlVar) : gyo.a(iyoVar.c(), jmr0.b(j), Float.intBitsToFloat((int) (this.g >> 32)), azlVar), (!iyo.g(iyoVar.d) || jmr0.c(j) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? (!iyo.g(iyoVar.e) || jmr0.c(j) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : -gyo.a(iyoVar.b(), -jmr0.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), azlVar) : gyo.a(iyoVar.e(), jmr0.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), azlVar));
                        if (b != 0) {
                            f();
                        }
                        d = jmr0.d(j, b);
                        jmr0 jmr0Var2 = new jmr0(d);
                        c82Var.J$0 = d;
                        c82Var.label = 2;
                        obj = wzsVar.invoke(jmr0Var2, c82Var);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d = c82Var.J$0;
                kotlin.a.a(obj);
                long d2 = jmr0.d(d, ((jmr0) obj).a);
                this.f = false;
                if (jmr0.b(d2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    EdgeEffect c = iyoVar.c();
                    int b2 = an10.b(jmr0.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c.onAbsorb(b2);
                    } else if (c.isFinished()) {
                        c.onAbsorb(b2);
                    }
                } else if (jmr0.b(d2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    EdgeEffect d3 = iyoVar.d();
                    int i3 = -an10.b(jmr0.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d3.onAbsorb(i3);
                    } else if (d3.isFinished()) {
                        d3.onAbsorb(i3);
                    }
                }
                if (jmr0.c(d2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    EdgeEffect e = iyoVar.e();
                    int b3 = an10.b(jmr0.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e.onAbsorb(b3);
                    } else if (e.isFinished()) {
                        e.onAbsorb(b3);
                    }
                } else if (jmr0.c(d2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    EdgeEffect b4 = iyoVar.b();
                    int i4 = -an10.b(jmr0.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b4.onAbsorb(i4);
                    } else if (b4.isFinished()) {
                        b4.onAbsorb(i4);
                    }
                }
                d();
                return s3q0.a;
            }
        }
        c82Var = new c82(this, continuationImpl);
        Object obj2 = c82Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c82Var.label;
        iyo iyoVar2 = this.c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023f  */
    @Override // xsna.e490
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(int i, long j, izs izsVar) {
        long j2;
        float intBitsToFloat;
        int i2;
        float i3;
        float intBitsToFloat2;
        long floatToRawIntBits;
        long e;
        boolean z;
        boolean z2;
        long j3;
        float f;
        float f2;
        boolean z3;
        int i4;
        boolean z4;
        if (mxj0.d(this.g)) {
            return ((ov70) izsVar.invoke(new ov70(j))).a;
        }
        boolean z5 = this.f;
        boolean z6 = true;
        iyo iyoVar = this.c;
        if (!z5) {
            if (iyo.g(iyoVar.f)) {
                h(0L);
            }
            if (iyo.g(iyoVar.g)) {
                i(0L);
            }
            if (iyo.g(iyoVar.d)) {
                j(0L);
            }
            if (iyo.g(iyoVar.e)) {
                g(0L);
            }
            this.f = true;
        }
        int i5 = ua2.a;
        float f3 = i == 2 ? 4.0f : 1.0f;
        long g = ov70.g(f3, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (!iyo.g(iyoVar.d) || Float.intBitsToFloat(i6) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                j2 = 4294967295L;
                if (iyo.g(iyoVar.e) && Float.intBitsToFloat(i6) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float g2 = g(g);
                    if (!iyo.g(iyoVar.e)) {
                        iyoVar.b().finish();
                    }
                    intBitsToFloat = g2 == Float.intBitsToFloat((int) (g & 4294967295L)) ? Float.intBitsToFloat(i6) : g2 / f3;
                }
            } else {
                float j4 = j(g);
                j2 = 4294967295L;
                if (!iyo.g(iyoVar.d)) {
                    iyoVar.e().finish();
                }
                intBitsToFloat = j4 == Float.intBitsToFloat((int) (g & 4294967295L)) ? Float.intBitsToFloat(i6) : j4 / f3;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (iyo.g(iyoVar.f) && Float.intBitsToFloat(i2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i3 = h(g);
                    if (!iyo.g(iyoVar.f)) {
                        iyoVar.c().finish();
                    }
                    if (i3 == Float.intBitsToFloat((int) (g >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = i3 / f3;
                } else if (iyo.g(iyoVar.g) && Float.intBitsToFloat(i2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i3 = i(g);
                    if (!iyo.g(iyoVar.g)) {
                        iyoVar.d().finish();
                    }
                    if (i3 == Float.intBitsToFloat((int) (g >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = i3 / f3;
                }
                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
                if (!ov70.c(floatToRawIntBits, 0L)) {
                    f();
                }
                e = ov70.e(j, floatToRawIntBits);
                long j5 = ((ov70) izsVar.invoke(new ov70(e))).a;
                long e2 = ov70.e(e, j5);
                if ((Float.intBitsToFloat((int) (e >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat((int) (e & j2)) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((Float.intBitsToFloat((int) (j5 >> 32)) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat((int) (j5 & j2)) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && (iyo.g(iyoVar.f) || iyo.g(iyoVar.d) || iyo.g(iyoVar.g) || iyo.g(iyoVar.e)))) {
                    d();
                }
                if (i == 1) {
                    int i7 = (int) (e2 >> 32);
                    if (Float.intBitsToFloat(i7) > 0.5f) {
                        j3 = e2;
                        h(j3);
                    } else {
                        j3 = e2;
                        if (Float.intBitsToFloat(i7) >= -0.5f) {
                            f = 0.5f;
                            f2 = -0.5f;
                            z3 = false;
                            i4 = (int) (j3 & j2);
                            if (Float.intBitsToFloat(i4) <= f) {
                                j(j3);
                            } else if (Float.intBitsToFloat(i4) < f2) {
                                g(j3);
                            } else {
                                z4 = false;
                                if (!z3 || z4) {
                                    z = true;
                                    if (!ov70.c(e, 0L)) {
                                        if (!iyo.f(iyoVar.f) || Float.intBitsToFloat(i2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            z2 = false;
                                        } else {
                                            EdgeEffect c = iyoVar.c();
                                            float intBitsToFloat3 = Float.intBitsToFloat(i2);
                                            if (c instanceof r2u) {
                                                r2u r2uVar = (r2u) c;
                                                float f4 = r2uVar.b + intBitsToFloat3;
                                                r2uVar.b = f4;
                                                if (Math.abs(f4) > r2uVar.a) {
                                                    r2uVar.onRelease();
                                                }
                                            } else {
                                                c.onRelease();
                                            }
                                            z2 = iyo.f(iyoVar.f);
                                        }
                                        if (iyo.f(iyoVar.g) && Float.intBitsToFloat(i2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            EdgeEffect d = iyoVar.d();
                                            float intBitsToFloat4 = Float.intBitsToFloat(i2);
                                            if (d instanceof r2u) {
                                                r2u r2uVar2 = (r2u) d;
                                                float f5 = r2uVar2.b + intBitsToFloat4;
                                                r2uVar2.b = f5;
                                                if (Math.abs(f5) > r2uVar2.a) {
                                                    r2uVar2.onRelease();
                                                }
                                            } else {
                                                d.onRelease();
                                            }
                                            z2 = z2 || iyo.f(iyoVar.g);
                                        }
                                        if (iyo.f(iyoVar.d) && Float.intBitsToFloat(i6) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            EdgeEffect e3 = iyoVar.e();
                                            float intBitsToFloat5 = Float.intBitsToFloat(i6);
                                            if (e3 instanceof r2u) {
                                                r2u r2uVar3 = (r2u) e3;
                                                float f6 = r2uVar3.b + intBitsToFloat5;
                                                r2uVar3.b = f6;
                                                if (Math.abs(f6) > r2uVar3.a) {
                                                    r2uVar3.onRelease();
                                                }
                                            } else {
                                                e3.onRelease();
                                            }
                                            z2 = z2 || iyo.f(iyoVar.d);
                                        }
                                        if (iyo.f(iyoVar.e) && Float.intBitsToFloat(i6) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            EdgeEffect b = iyoVar.b();
                                            float intBitsToFloat6 = Float.intBitsToFloat(i6);
                                            if (b instanceof r2u) {
                                                r2u r2uVar4 = (r2u) b;
                                                float f7 = r2uVar4.b + intBitsToFloat6;
                                                r2uVar4.b = f7;
                                                if (Math.abs(f7) > r2uVar4.a) {
                                                    r2uVar4.onRelease();
                                                }
                                            } else {
                                                b.onRelease();
                                            }
                                            z2 = z2 || iyo.f(iyoVar.e);
                                        }
                                        if (!z2 && !z) {
                                            z6 = false;
                                        }
                                        z = z6;
                                    }
                                    if (z) {
                                        f();
                                    }
                                    return ov70.f(floatToRawIntBits, j5);
                                }
                            }
                            z4 = true;
                            if (!z3) {
                            }
                            z = true;
                            if (!ov70.c(e, 0L)) {
                            }
                            if (z) {
                            }
                            return ov70.f(floatToRawIntBits, j5);
                        }
                        i(j3);
                    }
                    z3 = true;
                    f = 0.5f;
                    f2 = -0.5f;
                    i4 = (int) (j3 & j2);
                    if (Float.intBitsToFloat(i4) <= f) {
                    }
                    z4 = true;
                    if (!z3) {
                    }
                    z = true;
                    if (!ov70.c(e, 0L)) {
                    }
                    if (z) {
                    }
                    return ov70.f(floatToRawIntBits, j5);
                }
                z = false;
                if (!ov70.c(e, 0L)) {
                }
                if (z) {
                }
                return ov70.f(floatToRawIntBits, j5);
            }
            intBitsToFloat2 = 0.0f;
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
            if (!ov70.c(floatToRawIntBits, 0L)) {
            }
            e = ov70.e(j, floatToRawIntBits);
            long j52 = ((ov70) izsVar.invoke(new ov70(e))).a;
            long e22 = ov70.e(e, j52);
            if (Float.intBitsToFloat((int) (e >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            d();
            if (i == 1) {
            }
            z = false;
            if (!ov70.c(e, 0L)) {
            }
            if (z) {
            }
            return ov70.f(floatToRawIntBits, j52);
        }
        j2 = 4294967295L;
        intBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        intBitsToFloat2 = 0.0f;
        floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
        if (!ov70.c(floatToRawIntBits, 0L)) {
        }
        e = ov70.e(j, floatToRawIntBits);
        long j522 = ((ov70) izsVar.invoke(new ov70(e))).a;
        long e222 = ov70.e(e, j522);
        if (Float.intBitsToFloat((int) (e >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        d();
        if (i == 1) {
        }
        z = false;
        if (!ov70.c(e, 0L)) {
        }
        if (z) {
        }
        return ov70.f(floatToRawIntBits, j522);
    }

    public final void d() {
        boolean z;
        iyo iyoVar = this.c;
        EdgeEffect edgeEffect = iyoVar.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = iyoVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = iyoVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = iyoVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            f();
        }
    }

    public final long e() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = egi.j(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void f() {
        if (this.e) {
            ((zak0) this.d).setValue(s3q0.a);
        }
    }

    public final float g(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        float f = -intBitsToFloat2;
        float f2 = 1 - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = uw2.c(b, f, f2);
        } else {
            b.onPull(f, f2);
        }
        return (i2 >= 31 ? uw2.b(b) : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f = 1 - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = uw2.c(c, intBitsToFloat2, f);
        } else {
            c.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? uw2.b(c) : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = uw2.c(d, f, intBitsToFloat);
        } else {
            d.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? uw2.b(d) : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.intBitsToFloat((int) (this.g >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float j(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = uw2.c(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? uw2.b(e) : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void k(long j) {
        boolean b = mxj0.b(this.g, 0L);
        boolean b2 = mxj0.b(j, this.g);
        this.g = j;
        if (!b2) {
            long b3 = (an10.b(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (an10.b(Float.intBitsToFloat((int) (j >> 32))) << 32);
            iyo iyoVar = this.c;
            iyoVar.c = b3;
            EdgeEffect edgeEffect = iyoVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (b3 >> 32), (int) (b3 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = iyoVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (b3 >> 32), (int) (b3 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = iyoVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (b3 & 4294967295L), (int) (b3 >> 32));
            }
            EdgeEffect edgeEffect4 = iyoVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (b3 & 4294967295L), (int) (b3 >> 32));
            }
            EdgeEffect edgeEffect5 = iyoVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (b3 >> 32), (int) (b3 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = iyoVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (b3 >> 32), (int) (b3 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = iyoVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (b3 & 4294967295L), (int) (b3 >> 32));
            }
            EdgeEffect edgeEffect8 = iyoVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & b3), (int) (b3 >> 32));
            }
        }
        if (b || b2) {
            return;
        }
        d();
    }

    @Override // xsna.e490
    public final htl z() {
        return this.i;
    }
}
