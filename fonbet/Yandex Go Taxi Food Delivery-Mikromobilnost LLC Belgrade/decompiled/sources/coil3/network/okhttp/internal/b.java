package coil3.network.okhttp.internal;

import defpackage.d5j0;
import defpackage.h8;
import defpackage.iz50;
import defpackage.k5j0;
import defpackage.keu;
import defpackage.kvj0;
import defpackage.m5j0;
import defpackage.meu;
import defpackage.ny61;
import defpackage.ojt0;
import defpackage.oz50;
import defpackage.qq6;
import defpackage.rvj0;
import defpackage.t4j0;
import defpackage.wu50;
import defpackage.zu50;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class b {
    public static final oz50 a(kvj0 kvj0Var) {
        qq6 source;
        int i = kvj0Var.w;
        long j = kvj0Var.E;
        long j2 = kvj0Var.F;
        meu meuVar = kvj0Var.y;
        wu50 wu50Var = new wu50();
        Iterator it = meuVar.iterator();
        while (true) {
            h8 h8Var = (h8) it;
            if (!h8Var.hasNext()) {
                break;
            }
            Pair pair = (Pair) h8Var.next();
            wu50Var.a((String) pair.getFirst(), (String) pair.getSecond());
        }
        zu50 b = wu50Var.b();
        rvj0 rvj0Var = kvj0Var.z;
        return new oz50(i, j, j2, b, (rvj0Var == null || (source = rvj0Var.source()) == null) ? null : new ojt0(source), kvj0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final d5j0 b(iz50 iz50Var, ContinuationImpl continuationImpl) {
        CallFactoryNetworkClientKt$toRequest$1 callFactoryNetworkClientKt$toRequest$1;
        int i;
        t4j0 t4j0Var;
        iz50 iz50Var2;
        String str;
        t4j0 t4j0Var2;
        if (continuationImpl instanceof CallFactoryNetworkClientKt$toRequest$1) {
            callFactoryNetworkClientKt$toRequest$1 = (CallFactoryNetworkClientKt$toRequest$1) continuationImpl;
            int i2 = callFactoryNetworkClientKt$toRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callFactoryNetworkClientKt$toRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callFactoryNetworkClientKt$toRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callFactoryNetworkClientKt$toRequest$1.label;
                k5j0 k5j0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t4j0Var = new t4j0();
                    t4j0Var.h(iz50Var.a);
                    iz50Var2 = iz50Var;
                    str = iz50Var.b;
                    t4j0Var2 = t4j0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) callFactoryNetworkClientKt$toRequest$1.L$3;
                    t4j0Var = (t4j0) callFactoryNetworkClientKt$toRequest$1.L$2;
                    t4j0Var2 = (t4j0) callFactoryNetworkClientKt$toRequest$1.L$1;
                    iz50Var2 = (iz50) callFactoryNetworkClientKt$toRequest$1.L$0;
                    kotlin.b.b(obj);
                    ByteString byteString = (ByteString) obj;
                    if (byteString != null) {
                        int i3 = m5j0.a;
                        k5j0Var = new k5j0(null, byteString);
                    }
                }
                t4j0Var.e(str, k5j0Var);
                zu50 zu50Var = iz50Var2.c;
                keu keuVar = new keu();
                for (Map.Entry entry : zu50Var.a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        keuVar.c(str2, (String) it.next());
                    }
                }
                meu d = keuVar.d();
                t4j0Var2.getClass();
                t4j0Var2.c = d.d();
                return new d5j0(t4j0Var2);
            }
        }
        callFactoryNetworkClientKt$toRequest$1 = new CallFactoryNetworkClientKt$toRequest$1(continuationImpl);
        Object obj2 = callFactoryNetworkClientKt$toRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callFactoryNetworkClientKt$toRequest$1.label;
        k5j0 k5j0Var2 = null;
        if (i != 0) {
        }
        t4j0Var.e(str, k5j0Var2);
        zu50 zu50Var2 = iz50Var2.c;
        keu keuVar2 = new keu();
        while (r5.hasNext()) {
        }
        meu d2 = keuVar2.d();
        t4j0Var2.getClass();
        t4j0Var2.c = d2.d();
        return new d5j0(t4j0Var2);
    }
}
