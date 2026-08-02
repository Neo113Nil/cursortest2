package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.divider.DividerUiState$CustomGroupTitleUiState$TextStyleUiState;
import defpackage.amj0;
import defpackage.dij0;
import defpackage.evu0;
import defpackage.f6v;
import defpackage.fex0;
import defpackage.h6v;
import defpackage.irl;
import defpackage.mrl;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pmx0;
import defpackage.x4c;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "isRequirementsRedesignEnabled", "Lf6v;", "Lufx0;", "Lpmx0;", "tariffRuleDataIdentifier", "", "Lrcx0;", "<anonymous>", "(ZLf6v;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.TariffRulesUiStateInteractor$uiStateFlow$1", f = "TariffRulesUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffRulesUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffRulesUiStateInteractor$uiStateFlow$1(p0 p0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = p0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TariffRulesUiStateInteractor$uiStateFlow$1 tariffRulesUiStateInteractor$uiStateFlow$1 = new TariffRulesUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        tariffRulesUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        tariffRulesUiStateInteractor$uiStateFlow$1.L$0 = (f6v) obj2;
        return tariffRulesUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m0;
        boolean z = this.Z$0;
        f6v f6vVar = (f6v) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        fex0 fex0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        p0 p0Var = this.this$0;
        h6v h6vVar = f6vVar.a;
        pmx0 pmx0Var = (pmx0) f6vVar.b;
        if (pmx0Var == null) {
            m0 = EmptyList.a;
        } else {
            if (!evu0.J(pmx0Var.a)) {
                String str = pmx0Var.a;
                fex0Var = z ? new irl(str, str, str, AppColor$Palette.TextMinor, DividerUiState$CustomGroupTitleUiState$TextStyleUiState.RULES_TEXT_STYLE, x4c.E, SlotSize.XS) : new mrl(str, str);
            }
            ArrayList arrayList = pmx0Var.b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                amj0 e = p0Var.b.e((dij0) it.next(), z);
                if (e != null) {
                    arrayList2.add(e);
                }
            }
            m0 = fex0Var != null ? kotlin.collections.a.m0(arrayList2, Collections.singletonList(fex0Var)) : arrayList2;
        }
        return new f6v(h6vVar, m0);
    }
}
