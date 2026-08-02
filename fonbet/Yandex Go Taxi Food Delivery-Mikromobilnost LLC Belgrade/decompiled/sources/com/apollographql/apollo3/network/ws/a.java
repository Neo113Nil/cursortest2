package com.apollographql.apollo3.network.ws;

import defpackage.d5j0;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.ny61;
import defpackage.qi9;
import defpackage.qke;
import defpackage.rnh;
import defpackage.sb2;
import defpackage.snh;
import defpackage.t4j0;
import defpackage.tls;
import defpackage.ydi0;
import defpackage.zj41;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class a {
    public final OkHttpClient a = new OkHttpClient();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        DefaultWebSocketEngine$open$1 defaultWebSocketEngine$open$1;
        int i;
        final zj41 c;
        qi9 qi9Var;
        if (continuationImpl instanceof DefaultWebSocketEngine$open$1) {
            defaultWebSocketEngine$open$1 = (DefaultWebSocketEngine$open$1) continuationImpl;
            int i2 = defaultWebSocketEngine$open$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultWebSocketEngine$open$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultWebSocketEngine$open$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultWebSocketEngine$open$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qi9 qi9Var2 = new qi9(sb2.a(Integer.MAX_VALUE, null, null, 6));
                    fyc b = gwk0.b();
                    t4j0 t4j0Var = new t4j0();
                    t4j0Var.h(str);
                    t4j0Var.c = qke.C(list).d();
                    c = this.a.c(new d5j0(t4j0Var), new snh(b, qi9Var2));
                    defaultWebSocketEngine$open$1.L$0 = qi9Var2;
                    defaultWebSocketEngine$open$1.L$1 = c;
                    defaultWebSocketEngine$open$1.label = 1;
                    if (b.s(defaultWebSocketEngine$open$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    qi9Var = qi9Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c = (zj41) defaultWebSocketEngine$open$1.L$1;
                    qi9Var = (qi9) defaultWebSocketEngine$open$1.L$0;
                    kotlin.b.b(obj);
                }
                qi9Var.b(new tls() { // from class: com.apollographql.apollo3.network.ws.DefaultWebSocketEngine$open$2
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        ((ydi0) zj41.this).c(1001, null);
                        return zy11.a;
                    }
                });
                return new rnh(qi9Var, c);
            }
        }
        defaultWebSocketEngine$open$1 = new DefaultWebSocketEngine$open$1(this, continuationImpl);
        Object obj2 = defaultWebSocketEngine$open$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultWebSocketEngine$open$1.label;
        if (i != 0) {
        }
        qi9Var.b(new tls() { // from class: com.apollographql.apollo3.network.ws.DefaultWebSocketEngine$open$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj22) {
                ((ydi0) zj41.this).c(1001, null);
                return zy11.a;
            }
        });
        return new rnh(qi9Var, c);
    }
}
