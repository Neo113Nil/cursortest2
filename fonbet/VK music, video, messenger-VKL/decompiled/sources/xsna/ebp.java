package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.o2d0;
import xsna.ogo;

/* compiled from: Elevation.kt */
/* loaded from: classes11.dex */
public final class ebp {
    public static final dtp0<pco> a;
    public static final dtp0<pco> b;
    public static final dtp0<pco> c;

    static {
        nkk nkkVar = new nkk(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6f, 1.0f);
        a = new dtp0<>(120, luo.a, 2);
        b = new dtp0<>(150, nkkVar, 2);
        c = new dtp0<>(120, nkkVar, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
    
        if ((r10 instanceof xsna.pvr) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        if ((r9 instanceof xsna.pvr) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(if2 if2Var, float f, vax vaxVar, vax vaxVar2, ContinuationImpl continuationImpl) {
        dtp0<pco> dtp0Var;
        dtp0<pco> dtp0Var2 = null;
        if (vaxVar2 != null) {
            boolean z = vaxVar2 instanceof o2d0.b;
            dtp0Var = a;
            if (!z) {
                if (!(vaxVar2 instanceof ogo.b)) {
                    if (!(vaxVar2 instanceof lgv)) {
                    }
                }
            }
            dtp0Var2 = dtp0Var;
        } else if (vaxVar != null) {
            boolean z2 = vaxVar instanceof o2d0.b;
            dtp0Var = b;
            if (!z2 && !(vaxVar instanceof ogo.b)) {
                if (vaxVar instanceof lgv) {
                    dtp0Var2 = c;
                }
            }
            dtp0Var2 = dtp0Var;
        }
        dtp0<pco> dtp0Var3 = dtp0Var2;
        if (dtp0Var3 != null) {
            Object c2 = if2.c(if2Var, new pco(f), dtp0Var3, null, continuationImpl, 12);
            return c2 == CoroutineSingletons.COROUTINE_SUSPENDED ? c2 : s3q0.a;
        }
        Object e = if2Var.e(new pco(f), continuationImpl);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
    }
}
