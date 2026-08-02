package com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation;

import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeResultResult;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.domain.AutoPullPermissionEntity$Status;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.dzh0;
import defpackage.g8e;
import defpackage.gao;
import defpackage.jl40;
import defpackage.ks3;
import defpackage.ls3;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.us3;
import defpackage.v5;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zka1;
import defpackage.zs3;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.AutoPullsViewModel$onRemoveItem$1", f = "AutoPullsViewModel.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoPullsViewModel$onRemoveItem$1 extends SuspendLambda implements wls {
    final /* synthetic */ ls3 $currentState;
    final /* synthetic */ ks3 $item;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPullsViewModel$onRemoveItem$1(a aVar, ks3 ks3Var, ls3 ls3Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = ks3Var;
        this.$currentState = ls3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoPullsViewModel$onRemoveItem$1(this.this$0, this.$item, this.$currentState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoPullsViewModel$onRemoveItem$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        Object t8j0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            String str = this.$item.a;
            AutoPullPermissionEntity$Status autoPullPermissionEntity$Status = AutoPullPermissionEntity$Status.CHECKING;
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zka1.d((u8j0) value, new v5(22, str, autoPullPermissionEntity$Status))));
            com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.data.a aVar2 = this.this$0.C;
            String str2 = this.$item.a;
            this.label = 1;
            a = aVar2.a(str2, this);
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
        a aVar3 = this.this$0;
        ls3 ls3Var = this.$currentState;
        ks3 ks3Var = this.$item;
        if (!(a instanceof Result.Failure)) {
            dqg dqgVar = (dqg) a;
            if (dqgVar instanceof bqg) {
                aVar3.D.m(ls3Var.a, ks3Var.b, Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeResultResult.ERROR);
                aVar3.Z(new zs3(new n0t0(g8e.i(Text.Companion, ((bqg) dqgVar).a))));
            } else {
                if (!(dqgVar instanceof cqg)) {
                    w511.b();
                    return null;
                }
                List list = ls3Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!jl40.l(((ks3) obj2).a, ks3Var.a)) {
                        arrayList.add(obj2);
                    }
                }
                aVar3.D.m(arrayList, ks3Var.b, Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeResultResult.OK);
                pz40 Y2 = aVar3.Y();
                do {
                    r0Var3 = (r0) Y2;
                    value3 = r0Var3.getValue();
                    u8j0 u8j0Var = (u8j0) value3;
                    if (u8j0Var instanceof r8j0) {
                        r8j0 r8j0Var = (r8j0) u8j0Var;
                        t8j0Var = new r8j0(ls3.a((ls3) r8j0Var.a, arrayList), r8j0Var.b, r8j0Var.c, r8j0Var.d);
                    } else if (u8j0Var instanceof s8j0) {
                        t8j0Var = new s8j0(((s8j0) u8j0Var).a);
                    } else {
                        if (!(u8j0Var instanceof t8j0)) {
                            w511.b();
                            return null;
                        }
                        t8j0Var = new t8j0();
                    }
                } while (!r0Var3.k(value3, t8j0Var));
                com.ybsdk.core.utils.text.b bVar = Text.Companion;
                CharSequence charSequence = (CharSequence) ((cqg) dqgVar).a;
                bVar.getClass();
                new Text.Constant(charSequence);
                Text.Empty empty = Text.Empty.INSTANCE;
            }
        }
        a aVar4 = this.this$0;
        ls3 ls3Var2 = this.$currentState;
        ks3 ks3Var2 = this.$item;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            us3 us3Var = aVar4.D;
            List list2 = ls3Var2.a;
            String str3 = ks3Var2.b;
            String str4 = ks3Var2.a;
            us3Var.m(list2, str3, c.b(a2) ? Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeResultResult.ERROR : Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeResultResult.UNKNOWN);
            AutoPullPermissionEntity$Status autoPullPermissionEntity$Status2 = AutoPullPermissionEntity$Status.DEFAULT;
            pz40 Y3 = aVar4.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, zka1.d((u8j0) value2, new v5(22, str4, autoPullPermissionEntity$Status2))));
            x4c.g("[me2me debit] Can't confirm item removal", a2, str4, null, 8);
            aVar4.Z(new zs3(gao.d(new Text.Resource(dzh0.ybsdk_transfer_server_error_title), Text.Empty.INSTANCE, a2)));
        }
        return zy11.a;
    }
}
