package com.yandex.go.taxi.order.support.ui.support_menu;

import com.yandex.go.taxi.order.support.data.repositories.a;
import defpackage.ajw0;
import defpackage.l7s0;
import defpackage.miw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rjw0;
import defpackage.tjw0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.support.ui.support_menu.SupportMenuPresenter$onActionClick$1", f = "SupportMenuPresenter.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SupportMenuPresenter$onActionClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ rjw0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportMenuPresenter$onActionClick$1(rjw0 rjw0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rjw0Var;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SupportMenuPresenter$onActionClick$1(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportMenuPresenter$onActionClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            b.b(obj);
            l7s0 l7s0Var = this.this$0.z;
            String str = this.$id;
            this.label = 1;
            obj = ((a) l7s0Var.a).a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        miw0 miw0Var = (miw0) obj;
        if (miw0Var != null) {
            ((tjw0) this.this$0.x.a).r(new ajw0(miw0Var, i2));
        }
        return zy11.a;
    }
}
