package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import defpackage.amj0;
import defpackage.avj0;
import defpackage.d4h0;
import defpackage.f6v;
import defpackage.g8e;
import defpackage.h6v;
import defpackage.jdj0;
import defpackage.kyh0;
import defpackage.lkj0;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q421;
import defpackage.r421;
import defpackage.tcc;
import defpackage.uij0;
import defpackage.ulj0;
import defpackage.v421;
import defpackage.xtb1;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "isRedesignEnabled", "Lf6v;", "Lhmx0;", "Lv421;", "unsupportedRequirementsIdentifiable", "", "Lamj0;", "<anonymous>", "(ZLf6v;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.UnsupportedRequirementsUiStateInteractor$uiStateFlow$1", f = "UnsupportedRequirementsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UnsupportedRequirementsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedRequirementsUiStateInteractor$uiStateFlow$1(q0 q0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = q0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        UnsupportedRequirementsUiStateInteractor$uiStateFlow$1 unsupportedRequirementsUiStateInteractor$uiStateFlow$1 = new UnsupportedRequirementsUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        unsupportedRequirementsUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        unsupportedRequirementsUiStateInteractor$uiStateFlow$1.L$0 = (f6v) obj2;
        return unsupportedRequirementsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        f6v f6vVar = (f6v) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        q0 q0Var = this.this$0;
        h6v h6vVar = f6vVar.a;
        List<r421> list = ((v421) f6vVar.b).a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (r421 r421Var : list) {
            com.yandex.go.summary.mapper.a aVar = q0Var.b;
            zuj0 zuj0Var = aVar.a;
            String str = "";
            uij0 uij0Var = new uij0(mja1.b("", null, 6), Integer.valueOf(d4h0.ic_requirement_error_24), AppColor$Palette.Error);
            jdj0 jdj0Var = new jdj0(r421Var.a, "");
            q421 q421Var = r421Var.b;
            String str2 = q421Var.a;
            String str3 = q421Var.b;
            if (str3 != null) {
                str = str3;
            }
            ulj0 ulj0Var = new ulj0(str2, str, HapticEffect.Tick);
            avj0 avj0Var = (avj0) zuj0Var;
            String p = g8e.p(avj0Var.h(kyh0.unsupported_requirement_suffix), " ", com.yandex.go.summary.mapper.a.b(aVar, r421Var.a, null, null, 12));
            lkj0 lkj0Var = new lkj0(xtb1.c(), ulj0Var, avj0Var.h(kyh0.common_remove));
            String str4 = r421Var.e;
            arrayList.add(new amj0(str4, str4, true, com.yandex.go.summary.mapper.a.c(z), RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(z), uij0Var, jdj0Var, null, lkj0Var, null, p, RequirementTypeUiState.UNSUPPORTED));
        }
        return new f6v(h6vVar, arrayList);
    }
}
