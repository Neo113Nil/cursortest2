package com.yandex.go.payments.shared.members.list;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.Member;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import defpackage.hwo0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.members.list.MembersListPresenter$onDeleteClick$1", f = "MembersListPresenter.kt", l = {623}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MembersListPresenter$onDeleteClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ Member $member;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MembersListPresenter$onDeleteClick$1(b bVar, Member member, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$member = member;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MembersListPresenter$onDeleteClick$1(this.this$0, this.$member, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MembersListPresenter$onDeleteClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Member member;
        b bVar;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar3 = this.this$0;
                member = this.$member;
                try {
                    v vVar = bVar3.y;
                    String str = bVar3.Mg().a;
                    String str2 = member.a;
                    this.L$0 = bVar3;
                    this.L$1 = member;
                    this.L$2 = bVar3;
                    this.label = 1;
                    Object f = vVar.f(str, str2, this);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = bVar3;
                    obj = f;
                    bVar2 = bVar;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar3;
                    jst.e.k(th, String.format("Error during member deletion with id = %s", Arrays.copyOf(new Object[]{member.a}, 1)));
                    hwo0 hwo0Var = bVar.x.b;
                    ((y) hwo0Var.c).n(bVar.A.a(th), true);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (b) this.L$2;
                member = (Member) this.L$1;
                bVar2 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, String.format("Error during member deletion with id = %s", Arrays.copyOf(new Object[]{member.a}, 1)));
                    hwo0 hwo0Var2 = bVar.x.b;
                    ((y) hwo0Var2.c).n(bVar.A.a(th), true);
                    return zy11.a;
                }
            }
            bVar2.x.e.a = (Account) obj;
            bVar2.Tg();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
