package com.yandex.go.connection_prewarm;

import android.net.Uri;
import defpackage.d5j0;
import defpackage.g5e;
import defpackage.jst;
import defpackage.ju6;
import defpackage.mvg;
import defpackage.nci0;
import defpackage.not;
import defpackage.ny61;
import defpackage.t4j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.connection_prewarm.ConnectionPrewarmer$onAppConfiguration$1", f = "ConnectionPrewarmer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ConnectionPrewarmer$onAppConfiguration$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPrewarmer$onAppConfiguration$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConnectionPrewarmer$onAppConfiguration$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ConnectionPrewarmer$onAppConfiguration$1 connectionPrewarmer$onAppConfiguration$1 = (ConnectionPrewarmer$onAppConfiguration$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        connectionPrewarmer$onAppConfiguration$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            Uri parse = Uri.parse(((not) ((ju6) this.this$0.b.get())).d());
            String uri = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path("/ping").build().toString();
            OkHttpClient okHttpClient = (OkHttpClient) this.this$0.a.get();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (int i = 0; i < 2; i++) {
                OkHttpClient okHttpClient2 = new OkHttpClient(okHttpClient.b());
                t4j0 t4j0Var = new t4j0();
                t4j0Var.h(uri);
                t4j0Var.c.g("Connection", "keep-alive");
                t4j0Var.c.g("X-Purpose", "lcp-connection-prewarm-" + i);
                t4j0Var.c.g("X-LCP-No-Auth", "true");
                t4j0Var.c();
                ((nci0) okHttpClient2.newCall(new d5j0(t4j0Var))).I(new g5e(i, atomicBoolean, this.this$0));
            }
        } catch (Throwable unused) {
            jst.e.getClass();
        }
        return zy11.a;
    }
}
