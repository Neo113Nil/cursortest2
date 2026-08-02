package com.yandex.go.payments.shared.members.list.editmember;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import defpackage.bmn;
import defpackage.jst;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.members.list.editmember.EditMemberPresenter$removeMember$1", f = "EditMemberPresenter.kt", l = {198}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class EditMemberPresenter$removeMember$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $wasSaveButtonEnabled;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ wln this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditMemberPresenter$removeMember$1(wln wlnVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wlnVar;
        this.$wasSaveButtonEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditMemberPresenter$removeMember$1(this.this$0, this.$wasSaveButtonEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EditMemberPresenter$removeMember$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wln wlnVar;
        boolean z;
        wln wlnVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                wlnVar = this.this$0;
                boolean z2 = this.$wasSaveButtonEnabled;
                try {
                    v vVar = wlnVar.z;
                    String str = wlnVar.G.b().a;
                    String str2 = wlnVar.Mg().a;
                    this.L$0 = wlnVar;
                    this.L$1 = wlnVar;
                    this.Z$0 = z2;
                    this.label = 1;
                    Object f = vVar.f(str, str2, this);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z = z2;
                    obj = f;
                    wlnVar2 = wlnVar;
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    wlnVar.getClass();
                    jst.e.k(th, "Failed to remove a member");
                    wlnVar.Ng(th);
                    bmn bmnVar = wlnVar.J;
                    bmnVar.i = z;
                    bmnVar.o = true;
                    bmnVar.k = false;
                    bmnVar.j = wlnVar.I.k;
                    wlnVar.Og();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$0;
                wlnVar = (wln) this.L$1;
                wlnVar2 = (wln) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    wlnVar.getClass();
                    jst.e.k(th, "Failed to remove a member");
                    wlnVar.Ng(th);
                    bmn bmnVar2 = wlnVar.J;
                    bmnVar2.i = z;
                    bmnVar2.o = true;
                    bmnVar2.k = false;
                    bmnVar2.j = wlnVar.I.k;
                    wlnVar.Og();
                    return zy11.a;
                }
            }
            wlnVar2.G.a = (Account) obj;
            wlnVar2.F.a.d();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
