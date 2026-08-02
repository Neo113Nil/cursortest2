package com.yandex.go.payments.shared.family.viewmodels;

import com.yandex.go.payments.shared.family.experiments.FamilyGroupV2Experiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.viewmodels.FamilyGroupMenuItemInteractorImpl$createState$2$description$1", f = "FamilyGroupMenuItemInteractorImpl.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class FamilyGroupMenuItemInteractorImpl$createState$2$description$1 extends SuspendLambda implements wls {
    final /* synthetic */ FamilyGroupV2Experiment $experiment;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyGroupMenuItemInteractorImpl$createState$2$description$1(FamilyGroupV2Experiment familyGroupV2Experiment, c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$experiment = familyGroupV2Experiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyGroupMenuItemInteractorImpl$createState$2$description$1(this.$experiment, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyGroupMenuItemInteractorImpl$createState$2$description$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        FamilyGroupV2Experiment familyGroupV2Experiment = this.$experiment;
        FormattedText formattedText = familyGroupV2Experiment.d.c;
        Map map = familyGroupV2Experiment.c;
        this.label = 1;
        cVar.getClass();
        Object k0 = tje.k0(uyj.a, new FamilyGroupMenuItemInteractorImpl$convert$2(cVar, formattedText, map, null), this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
