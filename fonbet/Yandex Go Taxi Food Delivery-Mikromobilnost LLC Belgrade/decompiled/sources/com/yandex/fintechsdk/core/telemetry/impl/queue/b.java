package com.yandex.fintechsdk.core.telemetry.impl.queue;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final tse a;
    public final wls b;
    public boolean c;
    public final ConnectivityManager f;
    public final LinkedList d = new LinkedList();
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final UnsentSpanQueue$networkCallback$1 g = new ConnectivityManager.NetworkCallback() { // from class: com.yandex.fintechsdk.core.telemetry.impl.queue.UnsentSpanQueue$networkCallback$1
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            b bVar = b.this;
            tse tseVar = bVar.a;
            sjh sjhVar = uyj.a;
            tje.N(tseVar, mdh.b, null, new UnsentSpanQueue$networkCallback$1$onAvailable$1(bVar, null), 2);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
        }
    };

    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.fintechsdk.core.telemetry.impl.queue.UnsentSpanQueue$networkCallback$1] */
    public b(Context context, tse tseVar, wls wlsVar) {
        this.a = tseVar;
        this.b = wlsVar;
        this.f = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        if (r10.a(r1) == r2) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[Catch: all -> 0x0077, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:25:0x0054, B:29:0x005e), top: B:24:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r3v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, ContinuationImpl continuationImpl) {
        UnsentSpanQueue$sendBatches$1 unsentSpanQueue$sendBatches$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        g050 g050Var;
        LinkedList linkedList = bVar.d;
        try {
            if (continuationImpl instanceof UnsentSpanQueue$sendBatches$1) {
                unsentSpanQueue$sendBatches$1 = (UnsentSpanQueue$sendBatches$1) continuationImpl;
                int i2 = unsentSpanQueue$sendBatches$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    unsentSpanQueue$sendBatches$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = unsentSpanQueue$sendBatches$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = unsentSpanQueue$sendBatches$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = bVar.e;
                        unsentSpanQueue$sendBatches$1.L$0 = aVar;
                        unsentSpanQueue$sendBatches$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) unsentSpanQueue$sendBatches$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                linkedList.clear();
                                g050Var.d(null);
                                return zy11Var;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r3 = (g050) unsentSpanQueue$sendBatches$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r3;
                    }
                    if (!linkedList.isEmpty()) {
                        aVar.d(null);
                        return zy11Var;
                    }
                    wls wlsVar = bVar.b;
                    List J0 = kotlin.collections.a.J0(linkedList);
                    unsentSpanQueue$sendBatches$1.L$0 = aVar;
                    unsentSpanQueue$sendBatches$1.label = 2;
                    if (wlsVar.invoke(J0, unsentSpanQueue$sendBatches$1) != coroutineSingletons) {
                        g050Var = aVar;
                        linkedList.clear();
                        g050Var.d(null);
                        return zy11Var;
                    }
                    return coroutineSingletons;
                }
            }
            if (!linkedList.isEmpty()) {
            }
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar2 = aVar;
            th = th3;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
        unsentSpanQueue$sendBatches$1 = new UnsentSpanQueue$sendBatches$1(bVar, continuationImpl);
        Object obj2 = unsentSpanQueue$sendBatches$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unsentSpanQueue$sendBatches$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(byte[] bArr, Continuation continuation) {
        UnsentSpanQueue$offer$1 unsentSpanQueue$offer$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuation instanceof UnsentSpanQueue$offer$1) {
                unsentSpanQueue$offer$1 = (UnsentSpanQueue$offer$1) continuation;
                int i2 = unsentSpanQueue$offer$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    unsentSpanQueue$offer$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = unsentSpanQueue$offer$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = unsentSpanQueue$offer$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        unsentSpanQueue$offer$1.L$0 = bArr;
                        aVar = this.e;
                        unsentSpanQueue$offer$1.L$1 = aVar;
                        unsentSpanQueue$offer$1.label = 1;
                        if (aVar.a(unsentSpanQueue$offer$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) unsentSpanQueue$offer$1.L$1;
                        byte[] bArr2 = (byte[]) unsentSpanQueue$offer$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        bArr = bArr2;
                    }
                    this.d.offer(bArr);
                    aVar.d(null);
                    return zy11.a;
                }
            }
            this.d.offer(bArr);
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        unsentSpanQueue$offer$1 = new UnsentSpanQueue$offer$1(this, continuation);
        Object obj2 = unsentSpanQueue$offer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unsentSpanQueue$offer$1.label;
        if (i != 0) {
        }
    }
}
