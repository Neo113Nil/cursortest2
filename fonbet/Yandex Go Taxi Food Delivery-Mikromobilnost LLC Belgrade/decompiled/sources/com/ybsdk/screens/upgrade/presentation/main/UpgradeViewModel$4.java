package com.ybsdk.screens.upgrade.presentation.main;

import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$UpgradeDataShowValidationStatus;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import defpackage.aes0;
import defpackage.ja21;
import defpackage.jb21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pb21;
import defpackage.pz40;
import defpackage.qb21;
import defpackage.rb21;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.sb21;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lja21;", "form", "Lsb21;", "innSuggest", "Lzy11;", "<anonymous>", "(Lja21;Lsb21;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.upgrade.presentation.main.UpgradeViewModel$4", f = "UpgradeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpgradeViewModel$4 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeViewModel$4(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UpgradeViewModel$4 upgradeViewModel$4 = new UpgradeViewModel$4(this.this$0, (Continuation) obj3);
        upgradeViewModel$4.L$0 = (ja21) obj;
        upgradeViewModel$4.L$1 = (sb21) obj2;
        zy11 zy11Var = zy11.a;
        upgradeViewModel$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ja21 ja21Var = (ja21) this.L$0;
        sb21 sb21Var = (sb21) this.L$1;
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, jb21.a((jb21) value, null, ja21Var, false, false, sb21Var, 9)));
        a aVar = this.this$0;
        UpgradeEvents$UpgradeDataShowValidationStatus upgradeEvents$UpgradeDataShowValidationStatus = ((jb21) aVar.X()).a instanceof s8j0 ? UpgradeEvents$UpgradeDataShowValidationStatus.OTHER_ERROR : UpgradeEvents$UpgradeDataShowValidationStatus.NOT_VALIDATED;
        rt1 rt1Var = aVar.F.s0;
        Map c0 = aVar.c0(SimpleIdFormFieldEntity.FIRST_NAME, ((jb21) aVar.X()).b.a);
        Map c02 = aVar.c0(SimpleIdFormFieldEntity.LAST_NAME, ((jb21) aVar.X()).b.b);
        Map c03 = aVar.c0(SimpleIdFormFieldEntity.MIDDLE_NAME, ((jb21) aVar.X()).b.c);
        Map c04 = aVar.c0(SimpleIdFormFieldEntity.BIRTHDAY, ((jb21) aVar.X()).b.e);
        Map c05 = aVar.c0(SimpleIdFormFieldEntity.PASSPORT_NUMBER, ((jb21) aVar.X()).b.d);
        Pair pair = new Pair("is blank", Boolean.valueOf(((jb21) aVar.X()).b.f.length() == 0));
        Pair pair2 = new Pair("is valid", Boolean.valueOf(aVar.D.e(SimpleIdFormFieldEntity.INN_OR_SNILS, ((jb21) aVar.X()).b.f).equals(aes0.a)));
        sb21 sb21Var2 = ((jb21) aVar.X()).e;
        Map i = kotlin.collections.b.i(pair, pair2, new Pair(ClidProvider.STATE, (sb21Var2.equals(pb21.a) ? AnalyticsFieldStateValues.NOT_FOUND : sb21Var2.equals(qb21.a) ? AnalyticsFieldStateValues.IN_PROGRESS : sb21Var2 instanceof rb21 ? AnalyticsFieldStateValues.FOUND : AnalyticsFieldStateValues.NONE).getOriginalValue()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(7);
        linkedHashMap.put("validation status", upgradeEvents$UpgradeDataShowValidationStatus.getOriginalValue());
        linkedHashMap.put("name", c0);
        linkedHashMap.put("last name", c02);
        linkedHashMap.put("middle name", c03);
        linkedHashMap.put("birthday", c04);
        linkedHashMap.put("passport", c05);
        linkedHashMap.put("inn", i);
        rt1Var.a.a("upgrade.data.show", linkedHashMap);
        return zy11.a;
    }
}
