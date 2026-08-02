package com.ybsdk.screens.upgrade.presentation.main;

import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$UpgradeCheckResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import com.ybsdk.screens.upgrade.domain.interactors.c;
import defpackage.aes0;
import defpackage.des0;
import defpackage.dzh0;
import defpackage.gao;
import defpackage.i5z0;
import defpackage.ja21;
import defpackage.jb21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rfs0;
import defpackage.tse;
import defpackage.wb21;
import defpackage.wls;
import defpackage.xb21;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.upgrade.presentation.main.UpgradeViewModel$onSubmit$1", f = "UpgradeViewModel.kt", l = {HProv.PP_INFO}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpgradeViewModel$onSubmit$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeViewModel$onSubmit$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeViewModel$onSubmit$1 upgradeViewModel$onSubmit$1 = new UpgradeViewModel$onSubmit$1(this.this$0, continuation);
        upgradeViewModel$onSubmit$1.L$0 = obj;
        return upgradeViewModel$onSubmit$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeViewModel$onSubmit$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        List<SimpleIdFormFieldEntity> list;
        List list2;
        r0 r0Var;
        Object value;
        Object b;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            rfs0 rfs0Var = (rfs0) ((jb21) this.this$0.X()).a.a();
            if (rfs0Var == null || (str = rfs0Var.a) == null) {
                i5z0.a.j("Can't submit form without application id, create application first!", new Object[0]);
                return zy11Var;
            }
            a aVar = this.this$0;
            des0 des0Var = aVar.D;
            ja21 ja21Var = ((jb21) aVar.X()).b;
            if (des0Var.a.getValidationEnabled()) {
                SimpleIdFormFieldEntity.Companion.getClass();
                list = SimpleIdFormFieldEntity.sorted;
                ArrayList arrayList = new ArrayList();
                for (SimpleIdFormFieldEntity simpleIdFormFieldEntity : list) {
                    if (des0Var.e(simpleIdFormFieldEntity, ja21Var.b(simpleIdFormFieldEntity)) instanceof aes0) {
                        simpleIdFormFieldEntity = null;
                    }
                    if (simpleIdFormFieldEntity != null) {
                        arrayList.add(simpleIdFormFieldEntity);
                    }
                }
                list2 = arrayList;
            } else {
                list2 = EmptyList.a;
            }
            boolean isEmpty = list2.isEmpty();
            a aVar2 = this.this$0;
            if (!isEmpty) {
                aVar2.F.s0.Q(UpgradeEvents$UpgradeCheckResultResult.ERROR, "validation error");
                pz40 Y = this.this$0.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, jb21.a((jb21) value2, null, null, true, false, null, 27)));
                this.this$0.Z(new wb21(list2));
                return zy11Var;
            }
            pz40 Y2 = aVar2.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, jb21.a((jb21) value, null, null, false, true, null, 23)));
            a aVar3 = this.this$0;
            c cVar = aVar3.B;
            this.label = 1;
            b = cVar.b(aVar3, str, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar4 = this.this$0;
        if (!(b instanceof Result.Failure)) {
            aVar4.F.s0.Q(UpgradeEvents$UpgradeCheckResultResult.OK, null);
            aVar4.H.e();
        }
        a aVar5 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            aVar5.F.s0.Q(UpgradeEvents$UpgradeCheckResultResult.ERROR, "submit failed");
            pz40 Y3 = aVar5.Y();
            do {
                r0Var3 = (r0) Y3;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, jb21.a((jb21) value3, null, null, false, false, null, 23)));
            aVar5.Z(new xb21(gao.d(new Text.Resource(dzh0.ybsdk_uprid_form_submit_failed), Text.Empty.INSTANCE, a)));
        }
        return zy11Var;
    }
}
