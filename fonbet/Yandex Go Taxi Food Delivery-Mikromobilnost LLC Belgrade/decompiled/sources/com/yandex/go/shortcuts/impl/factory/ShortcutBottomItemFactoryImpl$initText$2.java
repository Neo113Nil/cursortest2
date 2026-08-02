package com.yandex.go.shortcuts.impl.factory;

import defpackage.eor;
import defpackage.ge6;
import defpackage.mvg;
import defpackage.nc6;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.FloatButtonSingleComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.factory.ShortcutBottomItemFactoryImpl$initText$2", f = "ShortcutBottomItemFactoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ShortcutBottomItemFactoryImpl$initText$2 extends SuspendLambda implements wls {
    final /* synthetic */ nc6 $model;
    final /* synthetic */ eor $this_initText;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.shortcuts.impl.factory.ShortcutBottomItemFactoryImpl$initText$2$1", f = "ShortcutBottomItemFactoryImpl.kt", l = {90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.shortcuts.impl.factory.ShortcutBottomItemFactoryImpl$initText$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ nc6 $model;
        final /* synthetic */ eor $this_initText;
        Object L$0;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eor eorVar, g gVar, nc6 nc6Var, Continuation continuation) {
            super(2, continuation);
            this.$this_initText = eorVar;
            this.this$0 = gVar;
            this.$model = nc6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_initText, this.this$0, this.$model, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FloatButtonSingleComponent floatButtonSingleComponent;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                FloatButtonSingleComponent floatButtonSingleComponent2 = (FloatButtonSingleComponent) this.$this_initText;
                g gVar = this.this$0;
                FormattedText formattedText = ((ge6) this.$model).h;
                this.L$0 = floatButtonSingleComponent2;
                this.label = 1;
                Object a = g.a(gVar, formattedText, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a;
                floatButtonSingleComponent = floatButtonSingleComponent2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                floatButtonSingleComponent = (FloatButtonSingleComponent) this.L$0;
                kotlin.b.b(obj);
            }
            floatButtonSingleComponent.setTitle((CharSequence) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutBottomItemFactoryImpl$initText$2(eor eorVar, g gVar, nc6 nc6Var, Continuation continuation) {
        super(2, continuation);
        this.$this_initText = eorVar;
        this.this$0 = gVar;
        this.$model = nc6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShortcutBottomItemFactoryImpl$initText$2 shortcutBottomItemFactoryImpl$initText$2 = new ShortcutBottomItemFactoryImpl$initText$2(this.$this_initText, this.this$0, this.$model, continuation);
        shortcutBottomItemFactoryImpl$initText$2.L$0 = obj;
        return shortcutBottomItemFactoryImpl$initText$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutBottomItemFactoryImpl$initText$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return tje.N(tseVar, null, null, new AnonymousClass1(this.$this_initText, this.this$0, this.$model, null), 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
