package com.yandex.passport.internal.flags.presentation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tig0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.flags.presentation.ExperimentsListContentKt$ExperimentsListContent$1$1$3$1", f = "ExperimentsListContent.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class ExperimentsListContentKt$ExperimentsListContent$1$1$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $foundIndexes$delegate;
    final /* synthetic */ yx40 $highlightedIndex$delegate;
    final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsListContentKt$ExperimentsListContent$1$1$3$1(androidx.compose.foundation.lazy.b bVar, oz40 oz40Var, yx40 yx40Var, Continuation continuation) {
        super(2, continuation);
        this.$lazyListState = bVar;
        this.$foundIndexes$delegate = oz40Var;
        this.$highlightedIndex$delegate = yx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExperimentsListContentKt$ExperimentsListContent$1$1$3$1(this.$lazyListState, this.$foundIndexes$delegate, this.$highlightedIndex$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExperimentsListContentKt$ExperimentsListContent$1$1$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Integer num2 = (Integer) kotlin.collections.a.R((List) this.$foundIndexes$delegate.getValue());
            androidx.compose.foundation.lazy.b bVar = this.$lazyListState;
            int intValue = num2 != null ? num2.intValue() : 0;
            this.L$0 = num2;
            this.label = 1;
            tig0 tig0Var = androidx.compose.foundation.lazy.b.y;
            if (bVar.f(intValue, 0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            num = num2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            num = (Integer) this.L$0;
            kotlin.b.b(obj);
        }
        if (num != null) {
            this.$highlightedIndex$delegate.setIntValue(num.intValue());
        }
        return zy11.a;
    }
}
