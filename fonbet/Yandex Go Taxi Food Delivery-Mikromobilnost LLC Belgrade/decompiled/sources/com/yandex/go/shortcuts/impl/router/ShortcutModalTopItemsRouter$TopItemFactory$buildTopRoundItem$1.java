package com.yandex.go.shortcuts.impl.router;

import defpackage.eor;
import defpackage.hwz0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rwz0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.FloatButtonSingleComponent;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.router.ShortcutModalTopItemsRouter$TopItemFactory$buildTopRoundItem$1", f = "ShortcutModalTopItemsRouter.kt", l = {HProv.PP_LICENSE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ShortcutModalTopItemsRouter$TopItemFactory$buildTopRoundItem$1 extends SuspendLambda implements wls {
    final /* synthetic */ FloatButtonSingleComponent $itemView;
    final /* synthetic */ rwz0 $model;
    final /* synthetic */ Consumer<eor> $onItemCreated;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutModalTopItemsRouter$TopItemFactory$buildTopRoundItem$1(FloatButtonSingleComponent floatButtonSingleComponent, b bVar, rwz0 rwz0Var, Consumer consumer, Continuation continuation) {
        super(2, continuation);
        this.$itemView = floatButtonSingleComponent;
        this.this$0 = bVar;
        this.$model = rwz0Var;
        this.$onItemCreated = consumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutModalTopItemsRouter$TopItemFactory$buildTopRoundItem$1(this.$itemView, this.this$0, this.$model, this.$onItemCreated, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutModalTopItemsRouter$TopItemFactory$buildTopRoundItem$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FloatButtonSingleComponent floatButtonSingleComponent;
        Consumer<eor> consumer;
        FloatButtonSingleComponent floatButtonSingleComponent2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                FloatButtonSingleComponent floatButtonSingleComponent3 = this.$itemView;
                b bVar = this.this$0;
                rwz0 rwz0Var = this.$model;
                Consumer<eor> consumer2 = this.$onItemCreated;
                hwz0 hwz0Var = bVar.b;
                FormattedText formattedText = rwz0Var.f;
                this.L$0 = floatButtonSingleComponent3;
                this.L$1 = consumer2;
                this.L$2 = floatButtonSingleComponent3;
                this.label = 1;
                Object e = c.e(hwz0Var.a, formattedText, null, false, this, 30);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                floatButtonSingleComponent = floatButtonSingleComponent3;
                consumer = consumer2;
                obj = e;
                floatButtonSingleComponent2 = floatButtonSingleComponent;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                floatButtonSingleComponent = (FloatButtonSingleComponent) this.L$2;
                consumer = (Consumer) this.L$1;
                floatButtonSingleComponent2 = (FloatButtonSingleComponent) this.L$0;
                kotlin.b.b(obj);
            }
            floatButtonSingleComponent.setTitle((CharSequence) obj);
            consumer.accept(floatButtonSingleComponent2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to convert formated text for shortcut top item");
        }
        return zy11.a;
    }
}
