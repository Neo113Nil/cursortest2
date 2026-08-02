package coil3.network.okhttp.internal;

import defpackage.au50;
import defpackage.d5j0;
import defpackage.dvw;
import defpackage.iz50;
import defpackage.j18;
import defpackage.kvj0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oz50;
import defpackage.sl7;
import defpackage.wls;
import defpackage.xf7;
import defpackage.yf7;
import java.io.Closeable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class a {
    public final xf7 a;

    public /* synthetic */ a(xf7 xf7Var) {
        this.a = xf7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x005e, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(xf7 xf7Var, iz50 iz50Var, wls wlsVar, ContinuationImpl continuationImpl) {
        CallFactoryNetworkClient$executeRequest$1 callFactoryNetworkClient$executeRequest$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        wls wlsVar2;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (continuationImpl instanceof CallFactoryNetworkClient$executeRequest$1) {
            callFactoryNetworkClient$executeRequest$1 = (CallFactoryNetworkClient$executeRequest$1) continuationImpl;
            int i2 = callFactoryNetworkClient$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callFactoryNetworkClient$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                obj = callFactoryNetworkClient$executeRequest$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callFactoryNetworkClient$executeRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    callFactoryNetworkClient$executeRequest$1.L$0 = wlsVar;
                    callFactoryNetworkClient$executeRequest$1.L$1 = xf7Var;
                    callFactoryNetworkClient$executeRequest$1.label = 1;
                    obj = b.b(iz50Var, callFactoryNetworkClient$executeRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            closeable2 = (Closeable) callFactoryNetworkClient$executeRequest$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                ooc.g(closeable2, null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    ooc.g(closeable2, th);
                                    throw th3;
                                }
                            }
                        }
                        wlsVar2 = (wls) callFactoryNetworkClient$executeRequest$1.L$0;
                        kotlin.b.b(obj);
                        closeable = (Closeable) obj;
                        try {
                            oz50 a = b.a((kvj0) closeable);
                            callFactoryNetworkClient$executeRequest$1.L$0 = closeable;
                            callFactoryNetworkClient$executeRequest$1.label = 3;
                            obj = wlsVar2.invoke(a, callFactoryNetworkClient$executeRequest$1);
                            if (obj != coroutineSingletons) {
                                closeable2 = closeable;
                                ooc.g(closeable2, null);
                                return obj;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable2 = closeable;
                            throw th;
                        }
                    }
                    xf7Var = (xf7) callFactoryNetworkClient$executeRequest$1.L$1;
                    wlsVar = (wls) callFactoryNetworkClient$executeRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                yf7 newCall = xf7Var.newCall((d5j0) obj);
                callFactoryNetworkClient$executeRequest$1.L$0 = wlsVar;
                callFactoryNetworkClient$executeRequest$1.L$1 = null;
                callFactoryNetworkClient$executeRequest$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(callFactoryNetworkClient$executeRequest$1));
                j18Var.u();
                j18Var.w(new sl7(newCall, 0));
                newCall.I(new au50(8, j18Var));
                obj = j18Var.s();
                if (obj != coroutineSingletons) {
                    wlsVar2 = wlsVar;
                    closeable = (Closeable) obj;
                    oz50 a2 = b.a((kvj0) closeable);
                    callFactoryNetworkClient$executeRequest$1.L$0 = closeable;
                    callFactoryNetworkClient$executeRequest$1.label = 3;
                    obj = wlsVar2.invoke(a2, callFactoryNetworkClient$executeRequest$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        callFactoryNetworkClient$executeRequest$1 = new CallFactoryNetworkClient$executeRequest$1(continuationImpl);
        obj = callFactoryNetworkClient$executeRequest$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callFactoryNetworkClient$executeRequest$1.label;
        if (i != 0) {
        }
        yf7 newCall2 = xf7Var.newCall((d5j0) obj);
        callFactoryNetworkClient$executeRequest$1.L$0 = wlsVar;
        callFactoryNetworkClient$executeRequest$1.L$1 = null;
        callFactoryNetworkClient$executeRequest$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(callFactoryNetworkClient$executeRequest$1));
        j18Var2.u();
        j18Var2.w(new sl7(newCall2, 0));
        newCall2.I(new au50(8, j18Var2));
        obj = j18Var2.s();
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + Extension.C_BRAKE;
    }
}
