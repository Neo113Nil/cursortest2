package com.yandex.go.payments.shared.members.list.editmember;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.SaveMemberDetails;
import com.yandex.go.payments.shared.v;
import defpackage.bmn;
import defpackage.il;
import defpackage.jst;
import defpackage.kh10;
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
@mvg(c = "com.yandex.go.payments.shared.members.list.editmember.EditMemberPresenter$onSaveClick$1", f = "EditMemberPresenter.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class EditMemberPresenter$onSaveClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ SaveMemberDetails $saveMemberDetails;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ wln this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditMemberPresenter$onSaveClick$1(wln wlnVar, SaveMemberDetails saveMemberDetails, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wlnVar;
        this.$saveMemberDetails = saveMemberDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditMemberPresenter$onSaveClick$1(this.this$0, this.$saveMemberDetails, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EditMemberPresenter$onSaveClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wln wlnVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        wln wlnVar2 = this.label;
        try {
            if (wlnVar2 == 0) {
                b.b(obj);
                wln wlnVar3 = this.this$0;
                SaveMemberDetails saveMemberDetails = this.$saveMemberDetails;
                v vVar = wlnVar3.z;
                il ilVar = wlnVar3.G;
                String str = ilVar.b().a;
                String str2 = wlnVar3.Mg().a;
                String str3 = ilVar.b().k;
                kh10 kh10Var = wlnVar3.I;
                this.L$0 = wlnVar3;
                this.L$1 = wlnVar3;
                this.label = 1;
                obj = vVar.n(str, str2, str3, saveMemberDetails, kh10Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                wlnVar = wlnVar3;
                wlnVar2 = wlnVar3;
            } else {
                if (wlnVar2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wln wlnVar4 = (wln) this.L$1;
                wlnVar = (wln) this.L$0;
                b.b(obj);
                wlnVar2 = wlnVar4;
            }
            wln.Lg(wlnVar, (Account) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wlnVar2.getClass();
            jst.e.j(th);
            bmn bmnVar = wlnVar2.J;
            bmnVar.o = true;
            bmnVar.k = false;
            bmnVar.j = wlnVar2.I.k;
            wlnVar2.Og();
            wlnVar2.Ng(th);
        }
        return zy11.a;
    }
}
