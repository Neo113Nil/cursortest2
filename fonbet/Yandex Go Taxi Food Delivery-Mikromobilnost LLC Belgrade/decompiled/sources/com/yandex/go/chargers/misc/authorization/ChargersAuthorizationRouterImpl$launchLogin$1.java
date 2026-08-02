package com.yandex.go.chargers.misc.authorization;

import defpackage.cy9;
import defpackage.dl1;
import defpackage.epb;
import defpackage.ly9;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.x2a;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.AuthCancellationException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.misc.authorization.ChargersAuthorizationRouterImpl$launchLogin$1", f = "ChargersAuthorizationRouterImpl.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersAuthorizationRouterImpl$launchLogin$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersAuthorizationRouterImpl$launchLogin$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersAuthorizationRouterImpl$launchLogin$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersAuthorizationRouterImpl$launchLogin$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: all -> 0x0077, TryCatch #2 {all -> 0x0077, blocks: (B:18:0x006f, B:20:0x0073, B:22:0x0079, B:34:0x00a5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #2 {all -> 0x0077, blocks: (B:18:0x006f, B:20:0x0073, B:22:0x0079, B:34:0x00a5), top: B:2:0x0006 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.go.chargers.misc.authorization.c, h55, java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        c cVar3;
        epb epbVar;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar4 = this.this$0;
                try {
                    cVar4.z((x2a) cVar4.G.getValue(), new dl1(6, cVar4));
                    a aVar = cVar4.F;
                    this.L$0 = cVar4;
                    this.L$1 = cVar4;
                    this.L$2 = cVar4;
                    this.label = 1;
                    if (aVar.a(this) == r0) {
                        return r0;
                    }
                    cVar3 = cVar4;
                    cVar = cVar3;
                    cVar2 = cVar;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cVar = cVar4;
                    cVar2 = cVar;
                    if (th instanceof AuthCancellationException) {
                        cVar2.A((m950) cVar2.D.get(), new ly9(cy9.e), new b(cVar2));
                    } else {
                        cVar2.r(new qu(9));
                    }
                    epbVar = new epb((x2a) cVar.G.getValue());
                    cVar.j(epbVar);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$2;
                cVar2 = (c) this.L$1;
                cVar3 = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof AuthCancellationException) {
                    }
                    epbVar = new epb((x2a) cVar.G.getValue());
                    cVar.j(epbVar);
                    return zy11.a;
                }
            }
            cVar3.r(new qu(9));
            epbVar = new epb((x2a) cVar.G.getValue());
            cVar.j(epbVar);
            return zy11.a;
        } catch (Throwable th3) {
            r0.j(new epb((x2a) r0.G.getValue()));
            throw th3;
        }
    }
}
