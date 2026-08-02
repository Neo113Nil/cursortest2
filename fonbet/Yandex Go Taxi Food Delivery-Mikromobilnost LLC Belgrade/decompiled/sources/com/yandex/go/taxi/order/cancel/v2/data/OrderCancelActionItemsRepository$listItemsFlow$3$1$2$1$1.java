package com.yandex.go.taxi.order.cancel.v2.data;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ol70;
import defpackage.pkf;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lol70;", "<anonymous>", "(Ltse;)Lol70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.v2.data.OrderCancelActionItemsRepository$listItemsFlow$3$1$2$1$1", f = "OrderCancelActionItemsRepository.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderCancelActionItemsRepository$listItemsFlow$3$1$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ThemeType $currentTheme;
    final /* synthetic */ ol70 $item;
    final /* synthetic */ String $tag;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelActionItemsRepository$listItemsFlow$3$1$2$1$1(b bVar, String str, ol70 ol70Var, ThemeType themeType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$tag = str;
        this.$item = ol70Var;
        this.$currentTheme = themeType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderCancelActionItemsRepository$listItemsFlow$3$1$2$1$1(this.this$0, this.$tag, this.$item, this.$currentTheme, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderCancelActionItemsRepository$listItemsFlow$3$1$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.a;
            String str = this.$tag;
            this.label = 1;
            obj = e.f(eVar, str, null, this, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ol70 ol70Var = this.$item;
        return new ol70(pkf.g((BitmapDrawable) obj, this.$tag, this.$currentTheme), ol70Var.b, ol70Var.c, ol70Var.d);
    }
}
