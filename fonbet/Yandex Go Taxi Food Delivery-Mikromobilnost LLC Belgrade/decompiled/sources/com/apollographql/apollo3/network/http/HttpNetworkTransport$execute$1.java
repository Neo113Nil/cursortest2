package com.apollographql.apollo3.network.http;

import com.apollographql.apollo3.api.http.HttpMethod;
import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.apollographql.apollo3.exception.ApolloParseException;
import defpackage.bvf0;
import defpackage.c6w;
import defpackage.cvu0;
import defpackage.cvw;
import defpackage.d5j0;
import defpackage.d6w;
import defpackage.dvw;
import defpackage.fc70;
import defpackage.hvu;
import defpackage.j18;
import defpackage.kvj0;
import defpackage.meu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ovu;
import defpackage.oyr;
import defpackage.qke;
import defpackage.qq6;
import defpackage.quu;
import defpackage.rq6;
import defpackage.sch;
import defpackage.svu;
import defpackage.t4j0;
import defpackage.tcc;
import defpackage.tch;
import defpackage.tko;
import defpackage.tls;
import defpackage.to2;
import defpackage.tvu;
import defpackage.uo2;
import defpackage.vo2;
import defpackage.vpr;
import defpackage.vvu;
import defpackage.wls;
import defpackage.xvu;
import defpackage.y6i0;
import defpackage.yf7;
import defpackage.zy11;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lza70;", CA20Status.STATUS_REQUEST_D, "Lvpr;", "Lvo2;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {1, 5, 1})
@mvg(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", l = {65, 85, 90}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class HttpNetworkTransport$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.apollographql.apollo3.api.c $customScalarAdapters;
    final /* synthetic */ vvu $httpRequest;
    final /* synthetic */ to2 $request;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpNetworkTransport$execute$1(c cVar, vvu vvuVar, to2 to2Var, com.apollographql.apollo3.api.c cVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$httpRequest = vvuVar;
        this.$request = to2Var;
        this.$customScalarAdapters = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HttpNetworkTransport$execute$1 httpNetworkTransport$execute$1 = new HttpNetworkTransport$execute$1(this.this$0, this.$httpRequest, this.$request, this.$customScalarAdapters, continuation);
        httpNetworkTransport$execute$1.L$0 = obj;
        return httpNetworkTransport$execute$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HttpNetworkTransport$execute$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x01de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01dd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IOException iOException;
        kvj0 kvj0Var;
        Object s;
        vpr vprVar;
        long j;
        qq6 qq6Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar2 = (vpr) this.L$0;
            long currentTimeMillis = System.currentTimeMillis();
            c cVar = this.this$0;
            ArrayList o0 = kotlin.collections.a.o0(cVar.c, cVar.e);
            vvu vvuVar = this.$httpRequest;
            this.L$0 = vprVar2;
            this.J$0 = currentTimeMillis;
            this.label = 1;
            if (o0.size() <= 0) {
                ny61.r("Check failed.");
                return null;
            }
            tch tchVar = (tch) ((svu) o0.get(0)).a.b;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            t4j0 t4j0Var = new t4j0();
            t4j0Var.h(vvuVar.b);
            t4j0Var.c = qke.C(vvuVar.c).d();
            if (vvuVar.a == HttpMethod.Get) {
                t4j0Var.c();
            } else {
                quu quuVar = vvuVar.d;
                if (quuVar == null) {
                    ny61.r("HTTP POST requires a request body");
                    return null;
                }
                t4j0Var.e("POST", new sch(quuVar));
            }
            final yf7 newCall = tchVar.a.newCall(new d5j0(t4j0Var));
            j18Var.w(new tls() { // from class: com.apollographql.apollo3.network.http.DefaultHttpEngine$execute$2$1
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    yf7.this.cancel();
                    return zy11.a;
                }
            });
            try {
                kvj0Var = newCall.execute();
                iOException = null;
            } catch (IOException e) {
                iOException = e;
                kvj0Var = null;
            }
            if (iOException != null) {
                j18Var.resumeWith(new Result.Failure(new ApolloNetworkException("Failed to execute GraphQL http network request", iOException)));
            } else {
                int i2 = kvj0Var.w;
                ArrayList arrayList = new ArrayList();
                qq6 source = kvj0Var.z.source();
                meu meuVar = kvj0Var.y;
                d6w n = y6i0.n(0, meuVar.size());
                ArrayList arrayList2 = new ArrayList(tcc.n(n, 10));
                c6w it = n.iterator();
                while (it.c) {
                    int nextInt = it.nextInt();
                    arrayList2.add(new hvu(meuVar.b(nextInt), meuVar.f(nextInt)));
                }
                arrayList.addAll(arrayList2);
                xvu xvuVar = new xvu(i2, arrayList, source);
                kotlin.b.b(xvuVar);
                j18Var.resumeWith(xvuVar);
            }
            s = j18Var.s();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (s != coroutineSingletons) {
                vprVar = vprVar2;
                j = currentTimeMillis;
            }
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                kotlin.b.b(obj);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = this.J$0;
        vpr vprVar3 = (vpr) this.L$0;
        kotlin.b.b(obj);
        vprVar = vprVar3;
        j = j2;
        s = obj;
        xvu xvuVar2 = (xvu) s;
        int i3 = xvuVar2.a;
        int i4 = xvuVar2.a;
        ArrayList arrayList3 = xvuVar2.b;
        qq6 qq6Var2 = xvuVar2.c;
        if (200 > i3 || i3 >= 300) {
            if (this.this$0.d) {
                qq6Var = qq6Var2;
            } else {
                qq6Var2.close();
                qq6Var = null;
            }
            throw new ApolloHttpException(i4, arrayList3, qq6Var, oyr.e('`', i4, "Http request failed with status code `"));
        }
        String c0 = bvf0.c0(arrayList3);
        if (c0 == null || !cvu0.x(c0, "multipart/", true)) {
            c cVar2 = this.this$0;
            fc70 fc70Var = this.$request.a;
            com.apollographql.apollo3.api.c cVar3 = this.$customScalarAdapters;
            cVar2.getClass();
            try {
                uo2 a = cvw.S(fc70Var, new rq6(qq6Var2), cVar3).a();
                a.a = true;
                vo2 a2 = a.a();
                UUID uuid = this.$request.b;
                uo2 a3 = a2.a();
                a3.c = uuid;
                a3.x = ((tko) a3.x).b(new ovu(i4, arrayList3));
                vo2 a4 = a3.a();
                this.L$0 = null;
                this.label = 3;
                return vprVar.emit(a4, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            } catch (Exception e2) {
                if (e2 instanceof ApolloException) {
                    throw ((ApolloException) e2);
                }
                throw new ApolloParseException(e2);
            }
        }
        c cVar4 = this.this$0;
        fc70 fc70Var2 = this.$request.a;
        com.apollographql.apollo3.api.c cVar5 = this.$customScalarAdapters;
        cVar4.getClass();
        o oVar = new o(new tvu(com.apollographql.apollo3.internal.a.a(xvuVar2), fc70Var2, cVar5, new Ref$ObjectRef(), 0), new HttpNetworkTransport$multipleResponses$2());
        c cVar6 = this.this$0;
        to2 to2Var = this.$request;
        this.L$0 = null;
        this.label = 2;
        e.w(vprVar);
        Object collect = oVar.collect(new a(vprVar, cVar6, to2Var, xvuVar2, j), this);
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (collect != coroutineSingletons3) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons3) {
            collect = zy11Var;
        }
        if (collect == coroutineSingletons) {
        }
    }
}
