package com.yandex.go.account.activity;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.account.activity.a;
import defpackage.cey;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.account.activity.LinkAccountsLifecycleListener$onFirstContentfulPaint$1", f = "LinkAccountsLifecycleListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class LinkAccountsLifecycleListener$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountsLifecycleListener$onFirstContentfulPaint$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkAccountsLifecycleListener$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LinkAccountsLifecycleListener$onFirstContentfulPaint$1 linkAccountsLifecycleListener$onFirstContentfulPaint$1 = (LinkAccountsLifecycleListener$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        linkAccountsLifecycleListener$onFirstContentfulPaint$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final a aVar = this.this$0;
        final int i = 0;
        cey.a(aVar.b, Lifecycle.Event.ON_RESUME, new Runnable() { // from class: zjy
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                a aVar2 = aVar;
                switch (i2) {
                    case 0:
                        aVar2.c.d();
                        break;
                    default:
                        pzt0 pzt0Var = aVar2.c.k;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                            break;
                        }
                        break;
                }
            }
        });
        final a aVar2 = this.this$0;
        final int i2 = 1;
        cey.a(aVar2.b, Lifecycle.Event.ON_PAUSE, new Runnable() { // from class: zjy
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                a aVar22 = aVar2;
                switch (i22) {
                    case 0:
                        aVar22.c.d();
                        break;
                    default:
                        pzt0 pzt0Var = aVar22.c.k;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                            break;
                        }
                        break;
                }
            }
        });
        return zy11.a;
    }
}
