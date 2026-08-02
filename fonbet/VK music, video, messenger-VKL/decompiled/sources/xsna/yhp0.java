package xsna;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.kbb;

/* compiled from: TrackpadScrollingLogic.kt */
/* loaded from: classes11.dex */
public final class yhp0 extends j670 {
    public final nm8 f;
    public yok0 g;

    /* compiled from: TrackpadScrollingLogic.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }

        public final a a(a aVar) {
            return new a(ov70.f(this.a, aVar.a), Math.max(this.b, aVar.b), this.c || aVar.c);
        }
    }

    public yhp0(zhh0 zhh0Var, fhh0 fhh0Var, azl azlVar) {
        super(zhh0Var, fhh0Var, azlVar);
        this.f = w0b.a(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00db, code lost:
    
        if (r0.invoke(r3, r4) != r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00dd, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        if (r16.b(r1, r4) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.AdaptedFunctionReference, xsna.wzs] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, xsna.yhp0$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(yhp0 yhp0Var, zhh0 zhh0Var, a aVar, ContinuationImpl continuationImpl) {
        zhp0 zhp0Var;
        int i;
        yhp0Var.getClass();
        wxm wxmVar = yhp0Var.e;
        if (continuationImpl instanceof zhp0) {
            zhp0Var = (zhp0) continuationImpl;
            int i2 = zhp0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zhp0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = zhp0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zhp0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = aVar;
                    long j = aVar.b;
                    long j2 = aVar.a;
                    ((VelocityTracker1D) wxmVar.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((VelocityTracker1D) wxmVar.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    a e = e(yhp0Var.f);
                    if (e != null) {
                        long j3 = e.b;
                        long j4 = e.a;
                        ((VelocityTracker1D) wxmVar.b).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                        ((VelocityTracker1D) wxmVar.c).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                        ref$ObjectRef.element = ((a) ref$ObjectRef.element).a(e);
                    }
                    wzs aip0Var = new aip0(yhp0Var, zhh0Var, ref$ObjectRef, null);
                    zhp0Var.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                }
                ?? r0 = yhp0Var.b;
                jmr0 jmr0Var = new jmr0(m200.b(((VelocityTracker1D) wxmVar.b).b(Float.MAX_VALUE), ((VelocityTracker1D) wxmVar.c).b(Float.MAX_VALUE)));
                zhp0Var.label = 2;
            }
        }
        zhp0Var = new zhp0(yhp0Var, continuationImpl);
        Object obj3 = zhp0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zhp0Var.label;
        if (i != 0) {
        }
        ?? r02 = yhp0Var.b;
        jmr0 jmr0Var2 = new jmr0(m200.b(((VelocityTracker1D) wxmVar.b).b(Float.MAX_VALUE), ((VelocityTracker1D) wxmVar.c).b(Float.MAX_VALUE)));
        zhp0Var.label = 2;
    }

    public static a e(nm8 nm8Var) {
        a aVar = null;
        vki0 b = g5z.b(new l670(new vb30(nm8Var, 1), null));
        while (b.hasNext()) {
            a aVar2 = (a) b.next();
            if (aVar != null) {
                aVar2 = aVar.a(aVar2);
            }
            aVar = aVar2;
        }
        return aVar;
    }

    public final boolean d(plb0 plb0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        nm8 nm8Var;
        zhh0 zhh0Var;
        xlb0 xlb0Var = (xlb0) j5g.a0(plb0Var.a);
        if (xlb0Var != null) {
            List<w7v> b = xlb0Var.b();
            int size = b.size();
            int i = 0;
            z3 = false;
            while (true) {
                nm8Var = this.f;
                zhh0Var = this.a;
                if (i >= size) {
                    break;
                }
                w7v w7vVar = b.get(i);
                long j = w7vVar.d ^ (-9223372034707292160L);
                if (!(zhh0Var.i(zhh0Var.e(j)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                    z3 = !(nm8Var.f(new a(j, w7vVar.a, false)) instanceof kbb.b) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = xlb0Var.l ^ (-9223372034707292160L);
            boolean z4 = plb0Var.f == 12;
            if (!(zhh0Var.i(zhh0Var.e(j2)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || z4) {
                if (!(nm8Var.f(new a(j2, xlb0Var.b, z4)) instanceof kbb.b) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
