package com.yandex.go.tips.navigation;

import defpackage.cne0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.u3h;
import defpackage.w030;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.cashback.interactors.i;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.modal.LoadingModalView;
import ru.yandex.taxi.startup.launch.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tips.navigation.DeeplinkTipsRouterImpl$onAttach$2", f = "DeeplinkTipsRouterImpl.kt", l = {60, 62}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DeeplinkTipsRouterImpl$onAttach$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkTipsRouterImpl$onAttach$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeeplinkTipsRouterImpl$onAttach$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeeplinkTipsRouterImpl$onAttach$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|2|(5:(1:(6:6|7|8|9|10|11)(2:19|20))(3:21|22|23)|17|18|10|11)(4:39|40|41|(3:43|(1:45)|28)(5:47|25|26|(4:29|9|10|11)|28))|24|25|26|(0)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        r0 = r9;
        r9 = r8;
        r8 = r0;
        r0 = r1;
        r1 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons, u45] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, w030] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        w030 a;
        Throwable th;
        a aVar2;
        LoadingModalView loadingModalView;
        w030 w030Var;
        LoadingModalView loadingModalView2;
        a aVar3;
        a aVar4;
        i iVar;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            if (r1 != 0) {
                if (r1 != 1) {
                    if (r1 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    loadingModalView = (LoadingModalView) this.L$2;
                    a = (w030) this.L$1;
                    aVar2 = (a) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        a.l(loadingModalView);
                        aVar2.P();
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    return zy11.a;
                }
                loadingModalView2 = (LoadingModalView) this.L$3;
                w030Var = (w030) this.L$2;
                aVar3 = (a) this.L$1;
                aVar4 = (a) this.L$0;
                try {
                    try {
                        kotlin.b.b(obj);
                    } catch (CancellationException e2) {
                        throw e2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    loadingModalView = loadingModalView2;
                    a = w030Var;
                    aVar2 = aVar4;
                }
                aVar2.M.b("openTipWithLoading", th, u3h.a);
                aVar2.r(new qu(9));
                a.l(loadingModalView);
                return zy11.a;
            }
            kotlin.b.b(obj);
            aVar = this.this$0;
            a = aVar.L.a();
            LoadingModalView loadingModalView3 = new LoadingModalView(aVar.D);
            loadingModalView3.setAnimateOnAppearing(false);
            aVar.N = loadingModalView3;
            a.s(loadingModalView3, true);
            try {
            } catch (CancellationException e3) {
                throw e3;
            } catch (Throwable th4) {
                th = th4;
                aVar2 = aVar;
                loadingModalView = loadingModalView3;
            }
            if (!((cne0) ((h) aVar.I).b).f("launch_actual")) {
                c cVar = aVar.H;
                this.L$0 = aVar;
                this.L$1 = aVar;
                this.L$2 = a;
                this.L$3 = loadingModalView3;
                this.label = 1;
                if (cVar.c(this) != r0) {
                    aVar4 = aVar;
                    w030Var = a;
                    loadingModalView2 = loadingModalView3;
                    aVar3 = aVar4;
                }
                return r0;
            }
            w030Var = a;
            loadingModalView2 = loadingModalView3;
            aVar3 = aVar;
            iVar = aVar3.J;
            this.L$0 = aVar;
            this.L$1 = w030Var;
            this.L$2 = loadingModalView2;
            this.L$3 = null;
            this.label = 2;
            if (iVar.a(this) != r0) {
                aVar2 = aVar;
                loadingModalView = loadingModalView2;
                a = w030Var;
                a.l(loadingModalView);
                aVar2.P();
                return zy11.a;
            }
            return r0;
            aVar = aVar4;
            iVar = aVar3.J;
            this.L$0 = aVar;
            this.L$1 = w030Var;
            this.L$2 = loadingModalView2;
            this.L$3 = null;
            this.label = 2;
            if (iVar.a(this) != r0) {
            }
            return r0;
        } catch (Throwable th5) {
            r1.l(r0);
            throw th5;
        }
    }
}
