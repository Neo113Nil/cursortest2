package com.yandex.go.safety.center.safetycenter_web.ui.error;

import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpul0;", "<anonymous>", "(Ltse;)Lpul0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorViewUiStateFactory$createUiState$2$buttons$1$1", f = "SafetyCenterWebErrorViewUiStateFactory.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterWebErrorViewUiStateFactory$createUiState$2$buttons$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ SafetyCenterWebConfig.Button $buttonDto;
    final /* synthetic */ boolean $hasOrder;
    final /* synthetic */ Map<String, String> $l10n;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterWebErrorViewUiStateFactory$createUiState$2$buttons$1$1(a aVar, SafetyCenterWebConfig.Button button, Map map, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$buttonDto = button;
        this.$l10n = map;
        this.$hasOrder = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterWebErrorViewUiStateFactory$createUiState$2$buttons$1$1(this.this$0, this.$buttonDto, this.$l10n, this.$hasOrder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterWebErrorViewUiStateFactory$createUiState$2$buttons$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        SafetyCenterWebConfig.Button button = this.$buttonDto;
        Map<String, String> map = this.$l10n;
        boolean z = this.$hasOrder;
        this.label = 1;
        Object a = a.a(aVar, button, map, z, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
