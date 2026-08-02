package com.yandex.go.payments.shared.members.list.editmember;

import defpackage.avj0;
import defpackage.ide;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wln;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.phone_select.ContactSecurityException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.members.list.editmember.EditMemberPresenter$onSelectContactClick$1", f = "EditMemberPresenter.kt", l = {273}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class EditMemberPresenter$onSelectContactClick$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ wln this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditMemberPresenter$onSelectContactClick$1(wln wlnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wlnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditMemberPresenter$onSelectContactClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EditMemberPresenter$onSelectContactClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wln wlnVar;
        wln wlnVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                wln wlnVar3 = this.this$0;
                try {
                    ru.yandex.taxi.contacts.a aVar = wlnVar3.A;
                    this.L$0 = wlnVar3;
                    this.L$1 = wlnVar3;
                    this.label = 1;
                    Object d = aVar.d(this);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    wlnVar = wlnVar3;
                    obj = d;
                    wlnVar2 = wlnVar;
                } catch (Throwable th) {
                    th = th;
                    wlnVar = wlnVar3;
                    if (th instanceof ContactSecurityException) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wlnVar = (wln) this.L$1;
                wlnVar2 = (wln) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof ContactSecurityException) {
                        wlnVar.getClass();
                        jst.e.r("Unexpected exception on requestContact", th);
                    } else {
                        wlnVar.F.a.n(((avj0) wlnVar.C).h(kyh0.order_for_other_contact_pick_permission_error_message), true);
                    }
                    return zy11.a;
                }
            }
            wln.Kg(wlnVar2, (ide) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
