package com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm;

import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.g8e;
import defpackage.gl1;
import defpackage.l04;
import defpackage.lm01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.s910;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zsb1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.TransferMe2MeConfirmViewModel$requestData$2", f = "TransferMe2MeConfirmViewModel.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferMe2MeConfirmViewModel$requestData$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMe2MeConfirmViewModel$requestData$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferMe2MeConfirmViewModel$requestData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferMe2MeConfirmViewModel$requestData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object s8j0Var;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.data.a aVar2 = aVar.C;
            String permissionRequestId = aVar.D.getPermissionRequestId();
            this.label = 1;
            a = aVar2.a(permissionRequestId, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            dqg dqgVar = (dqg) a;
            if (dqgVar instanceof cqg) {
                s910 s910Var = (s910) ((cqg) dqgVar).a;
                ArrayList arrayList = s910Var.c;
                ArrayList arrayList2 = s910Var.c;
                gl1 gl1Var = (gl1) kotlin.collections.a.P(arrayList);
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(zsb1.e((gl1) it.next()));
                }
                s8j0Var = new r8j0(new lm01(s910Var, gl1Var, null, arrayList3, arrayList2.size() > 1 && s910Var.d == null), null, 14);
            } else {
                if (!(dqgVar instanceof bqg)) {
                    w511.b();
                    return null;
                }
                s8j0Var = new s8j0(new Exception(((bqg) dqgVar).a));
            }
        } else {
            x4c.g("Can't load me2me confirm data", a2, null, null, 12);
            s8j0Var = new s8j0(a2);
        }
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, s8j0Var));
        lm01 lm01Var = (lm01) ((u8j0) this.this$0.X()).a();
        if (lm01Var != null) {
            a aVar3 = this.this$0;
            aVar3.G.a.I.a.a("me2me_pull_debit.screen.loaded", null);
            UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = lm01Var.b.i;
            if (unconditionalLimitWidgetEntity != null) {
                l04 l04Var = aVar3.G;
                String description = unconditionalLimitWidgetEntity.getDescription();
                l04Var.a.I.a.a("me2me_pull_debit.widget.shown", g8e.w(1, "text", description));
            }
        }
        return zy11.a;
    }
}
