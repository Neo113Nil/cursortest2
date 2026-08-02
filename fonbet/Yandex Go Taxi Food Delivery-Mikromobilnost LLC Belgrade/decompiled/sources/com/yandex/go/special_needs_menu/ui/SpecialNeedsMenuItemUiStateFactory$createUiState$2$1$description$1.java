package com.yandex.go.special_needs_menu.ui;

import com.yandex.go.special_needs_menu.experiment.SpecialNeedsMenuItemExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qot0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.special_needs_menu.ui.SpecialNeedsMenuItemUiStateFactory$createUiState$2$1$description$1", f = "SpecialNeedsMenuItemUiStateFactory.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SpecialNeedsMenuItemUiStateFactory$createUiState$2$1$description$1 extends SuspendLambda implements wls {
    final /* synthetic */ SpecialNeedsMenuItemExperiment $exp;
    int label;
    final /* synthetic */ qot0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialNeedsMenuItemUiStateFactory$createUiState$2$1$description$1(qot0 qot0Var, SpecialNeedsMenuItemExperiment specialNeedsMenuItemExperiment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qot0Var;
        this.$exp = specialNeedsMenuItemExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SpecialNeedsMenuItemUiStateFactory$createUiState$2$1$description$1(this.this$0, this.$exp, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SpecialNeedsMenuItemUiStateFactory$createUiState$2$1$description$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        c cVar = this.this$0.a;
        SpecialNeedsMenuItemExperiment specialNeedsMenuItemExperiment = this.$exp;
        FormattedText formattedText = specialNeedsMenuItemExperiment.d.c;
        Map map = specialNeedsMenuItemExperiment.c;
        this.label = 1;
        Object i2 = c.i(cVar, formattedText, map, this, 28);
        return i2 == coroutineSingletons ? coroutineSingletons : i2;
    }
}
