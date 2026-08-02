package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import defpackage.clp0;
import defpackage.hkp0;
import defpackage.iip0;
import defpackage.k631;
import defpackage.ny61;
import defpackage.qje;
import defpackage.snr;
import defpackage.tyo0;
import defpackage.uyo0;
import defpackage.wkp0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class y {
    public wkp0 a;
    public androidx.compose.foundation.c b;
    public snr c;
    public Orientation d;
    public boolean e;
    public NestedScrollDispatcher f;
    public final x g;
    public final hkp0 h;
    public boolean i;
    public int j = 1;
    public iip0 k = u.b;
    public final clp0 l = new clp0(this);
    public final uyo0 m = new uyo0(11, this);

    public y(wkp0 wkp0Var, androidx.compose.foundation.c cVar, snr snrVar, Orientation orientation, boolean z, NestedScrollDispatcher nestedScrollDispatcher, x xVar, hkp0 hkp0Var) {
        this.a = wkp0Var;
        this.b = cVar;
        this.c = snrVar;
        this.d = orientation;
        this.e = z;
        this.f = nestedScrollDispatcher;
        this.g = xVar;
        this.h = hkp0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        int i;
        y yVar;
        Throwable th;
        Ref$LongRef ref$LongRef;
        if (continuationImpl instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuationImpl;
            int i2 = scrollingLogic$doFlingAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollingLogic$doFlingAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollingLogic$doFlingAnimation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                    ref$LongRef2.element = j;
                    this.i = true;
                    try {
                        MutatePriority mutatePriority = MutatePriority.Default;
                        yVar = this;
                        try {
                            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(yVar, ref$LongRef2, j, null);
                            scrollingLogic$doFlingAnimation$1.L$0 = ref$LongRef2;
                            scrollingLogic$doFlingAnimation$1.label = 1;
                            if (yVar.f(mutatePriority, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ref$LongRef = ref$LongRef2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            yVar.i = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        yVar = this;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$LongRef = (Ref$LongRef) scrollingLogic$doFlingAnimation$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        yVar = this;
                    } catch (Throwable th4) {
                        th = th4;
                        yVar = this;
                        yVar.i = false;
                        throw th;
                    }
                }
                yVar.i = false;
                return new k631(ref$LongRef.element);
            }
        }
        scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuationImpl);
        Object obj2 = scrollingLogic$doFlingAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollingLogic$doFlingAnimation$1.label;
        if (i != 0) {
        }
        yVar.i = false;
        return new k631(ref$LongRef.element);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((r6 instanceof androidx.compose.foundation.gestures.g) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, boolean z, SuspendLambda suspendLambda) {
        zy11 zy11Var = zy11.a;
        if (z) {
            snr snrVar = this.c;
            tyo0 tyo0Var = u.a;
        }
        long b = k631.b(0.0f, 0.0f, this.d == Orientation.Horizontal ? 1 : 2, j);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        androidx.compose.foundation.c cVar = this.b;
        if (cVar == null || !(this.a.b() || this.a.e())) {
            ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$12 = new ScrollingLogic$onScrollStopped$performFling$1(scrollingLogic$onScrollStopped$performFling$1.this$0, suspendLambda);
            scrollingLogic$onScrollStopped$performFling$12.J$0 = b;
            Object invokeSuspend = scrollingLogic$onScrollStopped$performFling$12.invokeSuspend(zy11Var);
            if (invokeSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return invokeSuspend;
            }
        } else {
            Object b2 = cVar.b(b, scrollingLogic$onScrollStopped$performFling$1, suspendLambda);
            if (b2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return b2;
            }
        }
        return zy11Var;
    }

    public final long c(iip0 iip0Var, long j, int i) {
        androidx.compose.ui.input.nestedscroll.c cVar = this.f.a;
        androidx.compose.ui.input.nestedscroll.c F0 = cVar != null ? cVar.F0() : null;
        long mo34onPreScrollOzD1aCk = F0 != null ? F0.mo34onPreScrollOzD1aCk(j, i) : 0L;
        long e = wu60.e(j, mo34onPreScrollOzD1aCk);
        long e2 = e(h(iip0Var.a(g(e(wu60.a(0.0f, e, this.d == Orientation.Horizontal ? 1 : 2))))));
        x xVar = this.g;
        if (xVar.isAttached()) {
            qje.Q(xVar).mo62dispatchOnScrollChangedk4lQ0M(e2);
        }
        long e3 = wu60.e(e, e2);
        androidx.compose.ui.input.nestedscroll.c cVar2 = this.f.a;
        androidx.compose.ui.input.nestedscroll.c F02 = cVar2 != null ? cVar2.F0() : null;
        return wu60.f(wu60.f(mo34onPreScrollOzD1aCk, e2), F02 != null ? F02.mo29onPostScrollDzOQY0M(e2, e3, i) : 0L);
    }

    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long e(long j) {
        return this.e ? wu60.g(-1.0f, j) : j;
    }

    public final Object f(MutatePriority mutatePriority, wls wlsVar, ContinuationImpl continuationImpl) {
        Object d = this.a.d(mutatePriority, new ScrollingLogic$scroll$2(wlsVar, this, null), continuationImpl);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == Orientation.Horizontal ? j >> 32 : j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public final long h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == Orientation.Horizontal) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        return (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float i(long j) {
        int i = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        Orientation orientation = this.d;
        if (atan2 >= 0.7853981633974483d) {
            if (orientation == Orientation.Vertical) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (orientation == Orientation.Horizontal) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
