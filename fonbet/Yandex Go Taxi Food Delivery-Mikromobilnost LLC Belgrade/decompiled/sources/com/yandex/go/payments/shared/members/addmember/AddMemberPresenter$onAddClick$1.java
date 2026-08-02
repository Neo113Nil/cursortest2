package com.yandex.go.payments.shared.members.addmember;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qf0;
import defpackage.sf0;
import defpackage.tf0;
import defpackage.tse;
import defpackage.vmn0;
import defpackage.vor0;
import defpackage.wls;
import defpackage.yue;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.exception.UnregisterPhoneException;
import ru.yandex.taxi.widget.dialog.AlertDialog;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.members.addmember.AddMemberPresenter$onAddClick$1", f = "AddMemberPresenter.kt", l = {142}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddMemberPresenter$onAddClick$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ tf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMemberPresenter$onAddClick$1(tf0 tf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddMemberPresenter$onAddClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddMemberPresenter$onAddClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
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
                    v vVar = tf0Var3.z;
                    String str = tf0Var3.Lg().a;
                    String obj2 = tf0Var3.D.toString();
                    String obj3 = tf0Var3.E.toString();
                    this.L$0 = tf0Var3;
                    this.L$1 = tf0Var3;
                    this.label = 1;
                    Object a = vVar.a(str, obj2, obj3, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tf0Var = tf0Var3;
                    obj = a;
                    tf0Var2 = tf0Var;
                } catch (Throwable th) {
                    th = th;
                    tf0Var = tf0Var3;
                    qf0 qf0Var = tf0Var.x;
                    jst.e.k(th, String.format("Cannot add member for account=%s", Arrays.copyOf(new Object[]{tf0Var.Lg().a}, 1)));
                    if (th instanceof UnregisterPhoneException) {
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
                    qf0 qf0Var2 = tf0Var.x;
                    jst.e.k(th, String.format("Cannot add member for account=%s", Arrays.copyOf(new Object[]{tf0Var.Lg().a}, 1)));
                    if (th instanceof UnregisterPhoneException) {
                        qf0Var2.b.a.n(tf0Var.A.a(th), true);
                    } else {
                        vor0 vor0Var = qf0Var2.b;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        String sharingText = th.getSharingText();
                        sf0 sf0Var = new sf0(tf0Var, 0);
                        y yVar = vor0Var.a;
                        vmn0 vmn0Var = new vmn0(yVar.a, message, sharingText, vor0Var.b.i);
                        vmn0Var.x = sf0Var;
                        vmn0Var.y = new yue(yVar, 2);
                        ((AlertDialog) vmn0Var.w).show();
                    }
                    return zy11.a;
                }
            }
            tf0Var2.F = false;
            tf0Var2.Mg();
            qf0 qf0Var3 = tf0Var2.x;
            qf0Var3.a.a = (Account) obj;
            qf0Var3.b.a.d();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
