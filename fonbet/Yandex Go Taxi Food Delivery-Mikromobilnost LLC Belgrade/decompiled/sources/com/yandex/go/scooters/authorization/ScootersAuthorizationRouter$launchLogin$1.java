package com.yandex.go.scooters.authorization;

import defpackage.epb;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p4g0;
import defpackage.tse;
import defpackage.umm0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.am.AuthCancellationException;
import ru.yandex.taxi.scooters.domain.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.authorization.ScootersAuthorizationRouter$launchLogin$1", f = "ScootersAuthorizationRouter.kt", l = {40, 41}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersAuthorizationRouter$launchLogin$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersAuthorizationRouter$launchLogin$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersAuthorizationRouter$launchLogin$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersAuthorizationRouter$launchLogin$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:2|(1:(1:(8:6|7|8|9|10|11|12|13)(2:24|25))(4:26|27|28|29))(5:47|48|49|(1:51)|33)|30|31|(6:34|9|10|11|12|13)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c8, code lost:
    
        r1.r(new defpackage.qu(9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
    
        r1.A((defpackage.m950) r1.G.get(), new defpackage.zjn0(r10, (java.util.List) null, 6), new com.yandex.go.scooters.authorization.a(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        r0 = r10;
        r10 = r9;
        r9 = r0;
        r0 = r1;
        r1 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8 A[Catch: all -> 0x00cc, TryCatch #5 {all -> 0x00cc, blocks: (B:19:0x00c4, B:21:0x00c8, B:23:0x00ce, B:44:0x00f1), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #5 {all -> 0x00cc, blocks: (B:19:0x00c4, B:21:0x00c8, B:23:0x00ce, B:44:0x00f1), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [h55, java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.yandex.taxi.scooters.presentation.loading.b bVar;
        b bVar2;
        Throwable th;
        ru.yandex.taxi.scooters.presentation.loading.b bVar3;
        b bVar4;
        b bVar5;
        b bVar6;
        b bVar7;
        epb epbVar;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                bVar = (ru.yandex.taxi.scooters.presentation.loading.b) this.this$0.E.get();
                bVar2 = this.this$0;
                try {
                    try {
                        bVar2.z(bVar, new p4g0(bVar2, 4));
                        com.yandex.go.scooters.domain.b bVar8 = bVar2.F;
                        this.L$0 = bVar;
                        this.L$1 = bVar2;
                        this.L$2 = bVar2;
                        this.L$3 = bVar2;
                        this.label = 1;
                        if (bVar8.a(this) != r0) {
                            bVar5 = bVar2;
                            bVar6 = bVar5;
                        }
                        return r0;
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar3 = bVar;
                    bVar4 = bVar2;
                    if (!(th instanceof AuthCancellationException)) {
                    }
                    epbVar = new epb(bVar3);
                    bVar4.j(epbVar);
                    return zy11.a;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar4 = (b) this.L$3;
                bVar2 = (b) this.L$2;
                bVar7 = (b) this.L$1;
                bVar3 = (ru.yandex.taxi.scooters.presentation.loading.b) this.L$0;
                try {
                    kotlin.b.b(obj);
                    bVar7.r(new umm0(23));
                    epbVar = new epb(bVar3);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th3) {
                    th = th3;
                    if (!(th instanceof AuthCancellationException)) {
                    }
                    epbVar = new epb(bVar3);
                    bVar4.j(epbVar);
                    return zy11.a;
                }
                bVar4.j(epbVar);
                return zy11.a;
            }
            bVar2 = (b) this.L$3;
            bVar5 = (b) this.L$2;
            bVar6 = (b) this.L$1;
            ru.yandex.taxi.scooters.presentation.loading.b bVar9 = (ru.yandex.taxi.scooters.presentation.loading.b) this.L$0;
            try {
                kotlin.b.b(obj);
                bVar = bVar9;
            } catch (CancellationException e3) {
                throw e3;
            } catch (Throwable th4) {
                th = th4;
                bVar4 = bVar2;
                bVar2 = bVar5;
                bVar3 = bVar9;
                if (!(th instanceof AuthCancellationException)) {
                }
                epbVar = new epb(bVar3);
                bVar4.j(epbVar);
                return zy11.a;
            }
            r rVar = bVar6.D;
            this.L$0 = bVar;
            this.L$1 = bVar6;
            this.L$2 = bVar5;
            this.L$3 = bVar2;
            this.label = 2;
            if (e.y(rVar.b.b(false), this) != r0) {
                bVar3 = bVar;
                bVar4 = bVar2;
                bVar2 = bVar5;
                bVar7 = bVar6;
                bVar7.r(new umm0(23));
                epbVar = new epb(bVar3);
                bVar4.j(epbVar);
                return zy11.a;
            }
            return r0;
        } catch (Throwable th5) {
            r0.j(new epb(this));
            throw th5;
        }
    }
}
