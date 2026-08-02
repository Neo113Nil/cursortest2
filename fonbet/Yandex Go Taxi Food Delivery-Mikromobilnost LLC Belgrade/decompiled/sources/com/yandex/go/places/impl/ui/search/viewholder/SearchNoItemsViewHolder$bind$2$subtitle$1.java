package com.yandex.go.places.impl.ui.search.viewholder;

import defpackage.evp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.search.viewholder.SearchNoItemsViewHolder$bind$2$subtitle$1", f = "SearchNoItemsViewHolder.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchNoItemsViewHolder$bind$2$subtitle$1 extends SuspendLambda implements wls {
    final /* synthetic */ evp0 $data;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchNoItemsViewHolder$bind$2$subtitle$1(d dVar, evp0 evp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$data = evp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchNoItemsViewHolder$bind$2$subtitle$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchNoItemsViewHolder$bind$2$subtitle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        e eVar = this.this$0.S;
        FormattedText formattedText = this.$data.b;
        this.label = 1;
        Object t = eVar.t(formattedText, this);
        return t == coroutineSingletons ? coroutineSingletons : t;
    }
}
