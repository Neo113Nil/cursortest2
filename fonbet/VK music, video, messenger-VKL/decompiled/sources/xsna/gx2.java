package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.zno;

/* compiled from: ApiCallRetryPolicy.kt */
/* loaded from: classes3.dex */
public final class gx2 {
    public final long a;
    public final g4g b;

    public gx2(long j, g4g g4gVar) {
        this.a = j;
        this.b = g4gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (xsna.oxo0.b(xsna.qsl.e(r8), r1, r6) == r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fe, code lost:
    
        if (xsna.qsl.c(r10, r6) == r7) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, VKApiExecutionException vKApiExecutionException, int i, long j, ContinuationImpl continuationImpl) {
        dx2 dx2Var;
        int i2;
        if (continuationImpl instanceof dx2) {
            dx2Var = (dx2) continuationImpl;
            int i3 = dx2Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dx2Var.label = i3 - Integer.MIN_VALUE;
                Object obj = dx2Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = dx2Var.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        VKApiExecutionException vKApiExecutionException2 = (VKApiExecutionException) dx2Var.L$1;
                        try {
                            kotlin.a.a(obj);
                            return s3q0.a;
                        } catch (TimeoutCancellationException unused) {
                            throw vKApiExecutionException2;
                        }
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                o7i o7iVar = ((lzp) this.b.c).e;
                if (o7iVar != null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"ApiCallRetryPolicy", iq.a(i, "API call ", str, " failed with IO error, waiting for reconnection (", " retries remaining)")});
                    }
                    try {
                        zno.a aVar = zno.c;
                        long f = eoo.f(this.a, DurationUnit.MILLISECONDS);
                        ex2 ex2Var = new ex2(o7iVar, null);
                        dx2Var.L$0 = null;
                        try {
                            dx2Var.L$1 = vKApiExecutionException;
                            dx2Var.L$2 = null;
                            dx2Var.I$0 = i;
                            dx2Var.J$0 = j;
                            dx2Var.label = 1;
                        } catch (TimeoutCancellationException unused2) {
                            throw vKApiExecutionException;
                        }
                    } catch (TimeoutCancellationException unused3) {
                        throw vKApiExecutionException;
                    }
                } else {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.LogType logType = L.LogType.d;
                        StringBuilder d = rqi.d(j, "API call ", str, " failed, no reconnection in progress — backing off ");
                        d.append("ms (");
                        d.append(i);
                        d.append(" retries remaining)");
                        L.u(l2, logType, new Object[]{"ApiCallRetryPolicy", d.toString()});
                    }
                    zno.a aVar2 = zno.c;
                    long f2 = eoo.f(j, DurationUnit.MILLISECONDS);
                    dx2Var.L$0 = null;
                    dx2Var.L$1 = null;
                    dx2Var.L$2 = null;
                    dx2Var.I$0 = i;
                    dx2Var.J$0 = j;
                    dx2Var.label = 2;
                }
                return coroutineSingletons;
            }
        }
        dx2Var = new dx2(this, continuationImpl);
        Object obj2 = dx2Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = dx2Var.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r7v3, types: [xsna.izs] */
    /* JADX WARN: Type inference failed for: r7v7, types: [xsna.izs] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d0 -> B:11:0x00d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, mzp mzpVar, ContinuationImpl continuationImpl) {
        fx2 fx2Var;
        gx2 gx2Var;
        int i;
        int i2;
        fx2 fx2Var2;
        long j;
        String str2;
        mzp mzpVar2;
        int i3;
        fx2 fx2Var3;
        int i4;
        VKApiExecutionException vKApiExecutionException;
        String str3;
        mzp mzpVar3;
        int i5;
        int s;
        if (continuationImpl instanceof fx2) {
            fx2Var = (fx2) continuationImpl;
            int i6 = fx2Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fx2Var.label = i6 - Integer.MIN_VALUE;
                gx2Var = this;
                Object obj = fx2Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fx2Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    i2 = 0;
                    fx2Var2 = fx2Var;
                    j = 500;
                    str2 = str;
                    mzpVar2 = mzpVar;
                    i3 = 0;
                    fx2Var2.L$0 = str2;
                    fx2Var2.L$1 = mzpVar2;
                    fx2Var2.L$2 = null;
                    fx2Var2.I$0 = i3;
                    fx2Var2.I$1 = i2;
                    fx2Var2.J$0 = j;
                    fx2Var2.label = 1;
                    Object invoke = mzpVar2.invoke(fx2Var2);
                    if (invoke == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j2 = fx2Var.J$0;
                        int i7 = fx2Var.I$1;
                        int i8 = fx2Var.I$0;
                        ?? r7 = (izs) fx2Var.L$1;
                        String str4 = (String) fx2Var.L$0;
                        kotlin.a.a(obj);
                        fx2Var2 = fx2Var;
                        str2 = str4;
                        i2 = i7;
                        i5 = i8;
                        mzp mzpVar4 = r7;
                        long j3 = j2 * 2;
                        long j4 = j3 <= 5000 ? j3 : 5000L;
                        gx2Var = this;
                        i3 = i5;
                        mzpVar2 = mzpVar4;
                        j = j4;
                        try {
                        } catch (VKApiExecutionException e) {
                            int i9 = i3;
                            vKApiExecutionException = e;
                            i5 = i9;
                            mzp mzpVar5 = mzpVar2;
                            str3 = str2;
                            mzpVar3 = mzpVar5;
                            int i10 = i2;
                            fx2Var3 = fx2Var2;
                            i4 = i10;
                            if (vKApiExecutionException.s() != 1201) {
                                throw vKApiExecutionException;
                            }
                            if (vKApiExecutionException.s() != -1 && (s = vKApiExecutionException.s()) != 1 && s != 10 && s != 13) {
                                throw vKApiExecutionException;
                            }
                            if (i4 <= 0) {
                                throw vKApiExecutionException;
                            }
                            int i11 = i4 - 1;
                            fx2Var3.L$0 = str3;
                            fx2Var3.L$1 = mzpVar3;
                            fx2Var3.L$2 = null;
                            fx2Var3.I$0 = i5;
                            fx2Var3.I$1 = i11;
                            fx2Var3.J$0 = j;
                            fx2Var3.label = 2;
                            if (gx2Var.a(str3, vKApiExecutionException, i11, j, fx2Var3) != coroutineSingletons) {
                                mzpVar4 = mzpVar3;
                                str2 = str3;
                                j2 = j;
                                fx2 fx2Var4 = fx2Var3;
                                i2 = i11;
                                fx2Var2 = fx2Var4;
                                long j32 = j2 * 2;
                                if (j32 <= 5000) {
                                }
                                gx2Var = this;
                                i3 = i5;
                                mzpVar2 = mzpVar4;
                                j = j4;
                                fx2Var2.L$0 = str2;
                                fx2Var2.L$1 = mzpVar2;
                                fx2Var2.L$2 = null;
                                fx2Var2.I$0 = i3;
                                fx2Var2.I$1 = i2;
                                fx2Var2.J$0 = j;
                                fx2Var2.label = 1;
                                Object invoke2 = mzpVar2.invoke(fx2Var2);
                                if (invoke2 == coroutineSingletons) {
                                }
                            }
                        }
                        fx2Var2.L$0 = str2;
                        fx2Var2.L$1 = mzpVar2;
                        fx2Var2.L$2 = null;
                        fx2Var2.I$0 = i3;
                        fx2Var2.I$1 = i2;
                        fx2Var2.J$0 = j;
                        fx2Var2.label = 1;
                        Object invoke22 = mzpVar2.invoke(fx2Var2);
                        return invoke22 == coroutineSingletons ? coroutineSingletons : invoke22;
                    }
                    long j5 = fx2Var.J$0;
                    i4 = fx2Var.I$1;
                    int i12 = fx2Var.I$0;
                    ?? r72 = (izs) fx2Var.L$1;
                    String str5 = (String) fx2Var.L$0;
                    try {
                        kotlin.a.a(obj);
                        return obj;
                    } catch (VKApiExecutionException e2) {
                        vKApiExecutionException = e2;
                        i5 = i12;
                        str3 = str5;
                        fx2Var3 = fx2Var;
                        mzpVar3 = r72;
                        j = j5;
                        if (vKApiExecutionException.s() != 1201) {
                        }
                    }
                }
            }
        }
        gx2Var = this;
        fx2Var = new fx2(gx2Var, continuationImpl);
        Object obj2 = fx2Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fx2Var.label;
        if (i != 0) {
        }
    }
}
