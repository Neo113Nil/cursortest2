package com.yandex.go.payments.shared.members.addmember;

import defpackage.ide;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tf0;
import defpackage.tse;
import defpackage.vor0;
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
@mvg(c = "com.yandex.go.payments.shared.members.addmember.AddMemberPresenter$onContactsClick$1", f = "AddMemberPresenter.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddMemberPresenter$onContactsClick$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ tf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMemberPresenter$onContactsClick$1(tf0 tf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddMemberPresenter$onContactsClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddMemberPresenter$onContactsClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tf0 tf0Var;
        tf0 tf0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                tf0 tf0Var3 = this.this$0;
                try {
                    ru.yandex.taxi.contacts.a aVar = tf0Var3.y;
                    this.L$0 = tf0Var3;
                    this.L$1 = tf0Var3;
                    this.label = 1;
                    Object d = aVar.d(this);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tf0Var = tf0Var3;
                    obj = d;
                    tf0Var2 = tf0Var;
                } catch (Throwable th) {
                    th = th;
                    tf0Var = tf0Var3;
                    if (th instanceof ContactSecurityException) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tf0Var = (tf0) this.L$1;
                tf0Var2 = (tf0) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof ContactSecurityException) {
                        tf0Var.getClass();
                        jst.e.r("Unexpected exception on requestContact", th);
                    } else {
                        vor0 vor0Var = tf0Var.x.b;
                        vor0Var.a.n(tf0Var.C.b, true);
                    }
                    return zy11.a;
                }
            }
            tf0.Kg(tf0Var2, (ide) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
