package com.yandex.go.payments.shared.accountexistsdialog;

import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import defpackage.al;
import defpackage.dl;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.accountexistsdialog.AccountExistsDialogPresenter$onLeaveAccountClick$1", f = "AccountExistsDialogPresenter.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AccountExistsDialogPresenter$onLeaveAccountClick$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ dl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountExistsDialogPresenter$onLeaveAccountClick$1(dl dlVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountExistsDialogPresenter$onLeaveAccountClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountExistsDialogPresenter$onLeaveAccountClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dl, java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons, zc5] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dl dlVar;
        dl dlVar2;
        dl dlVar3;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                dl dlVar4 = this.this$0;
                try {
                    v vVar = dlVar4.B;
                    String str = dlVar4.x.c;
                    this.L$0 = dlVar4;
                    this.L$1 = dlVar4;
                    this.L$2 = dlVar4;
                    this.label = 1;
                    if (vVar.d.c(str, this) == r0) {
                        return r0;
                    }
                    dlVar3 = dlVar4;
                    dlVar = dlVar3;
                    dlVar2 = dlVar;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dlVar = dlVar4;
                    dlVar2 = dlVar;
                    dlVar2.getClass();
                    jst.e.k(th, "Error while attempting to leave shared account");
                    ((y) dlVar2.x.b.b).n(dlVar2.z.a(th), true);
                    dlVar.C = false;
                    ((al) dlVar.Dg()).bf(dlVar.Lg());
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dlVar = (dl) this.L$2;
                dlVar2 = (dl) this.L$1;
                dlVar3 = (dl) this.L$0;
                try {
                    b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    dlVar2.getClass();
                    jst.e.k(th, "Error while attempting to leave shared account");
                    ((y) dlVar2.x.b.b).n(dlVar2.z.a(th), true);
                    dlVar.C = false;
                    ((al) dlVar.Dg()).bf(dlVar.Lg());
                    return zy11.a;
                }
            }
            dl.Kg(dlVar3);
            dlVar.C = false;
            ((al) dlVar.Dg()).bf(dlVar.Lg());
            return zy11.a;
        } catch (Throwable th3) {
            r0.C = false;
            ((al) r0.Dg()).bf(r0.Lg());
            throw th3;
        }
    }
}
