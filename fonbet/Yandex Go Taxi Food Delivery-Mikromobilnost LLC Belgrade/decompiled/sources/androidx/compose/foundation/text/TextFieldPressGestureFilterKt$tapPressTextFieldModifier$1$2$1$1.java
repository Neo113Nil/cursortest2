package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.s;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.ay40;
import defpackage.g8w;
import defpackage.ixe0;
import defpackage.jxe0;
import defpackage.kxe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zls;
import defpackage.zx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/s;", "Lwu60;", "it", "Lzy11;", "<anonymous>", "(Landroidx/compose/foundation/gestures/s;Lwu60;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ zx40 $interactionSource;
    final /* synthetic */ oz40 $pressedInteraction;
    final /* synthetic */ tse $scope;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ zx40 $interactionSource;
        final /* synthetic */ long $it;
        final /* synthetic */ oz40 $pressedInteraction;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(oz40 oz40Var, long j, zx40 zx40Var, Continuation continuation) {
            super(2, continuation);
            this.$pressedInteraction = oz40Var;
            this.$it = j;
            this.$interactionSource = zx40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$pressedInteraction, this.$it, this.$interactionSource, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oz40 oz40Var;
            oz40 oz40Var2;
            jxe0 jxe0Var;
            zx40 zx40Var;
            jxe0 jxe0Var2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                jxe0 jxe0Var3 = (jxe0) this.$pressedInteraction.getValue();
                if (jxe0Var3 != null) {
                    zx40 zx40Var2 = this.$interactionSource;
                    oz40Var = this.$pressedInteraction;
                    ixe0 ixe0Var = new ixe0(jxe0Var3);
                    if (zx40Var2 != null) {
                        this.L$0 = oz40Var;
                        this.label = 1;
                        if (((ay40) zx40Var2).a(ixe0Var, this) != coroutineSingletons) {
                            oz40Var2 = oz40Var;
                        }
                        return coroutineSingletons;
                    }
                    oz40Var.setValue(null);
                }
                jxe0Var = new jxe0(this.$it);
                zx40Var = this.$interactionSource;
                if (zx40Var != null) {
                    this.L$0 = jxe0Var;
                    this.label = 2;
                    if (((ay40) zx40Var).a(jxe0Var, this) != coroutineSingletons) {
                        jxe0Var2 = jxe0Var;
                        jxe0Var = jxe0Var2;
                    }
                    return coroutineSingletons;
                }
                this.$pressedInteraction.setValue(jxe0Var);
                return zy11.a;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jxe0Var2 = (jxe0) this.L$0;
                kotlin.b.b(obj);
                jxe0Var = jxe0Var2;
                this.$pressedInteraction.setValue(jxe0Var);
                return zy11.a;
            }
            oz40Var2 = (oz40) this.L$0;
            kotlin.b.b(obj);
            oz40Var = oz40Var2;
            oz40Var.setValue(null);
            jxe0Var = new jxe0(this.$it);
            zx40Var = this.$interactionSource;
            if (zx40Var != null) {
            }
            this.$pressedInteraction.setValue(jxe0Var);
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ zx40 $interactionSource;
        final /* synthetic */ oz40 $pressedInteraction;
        final /* synthetic */ boolean $success;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(oz40 oz40Var, boolean z, zx40 zx40Var, Continuation continuation) {
            super(2, continuation);
            this.$pressedInteraction = oz40Var;
            this.$success = z;
            this.$interactionSource = zx40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$pressedInteraction, this.$success, this.$interactionSource, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            oz40 oz40Var;
            oz40 oz40Var2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                jxe0 jxe0Var = (jxe0) this.$pressedInteraction.getValue();
                if (jxe0Var != null) {
                    boolean z = this.$success;
                    zx40 zx40Var = this.$interactionSource;
                    oz40Var = this.$pressedInteraction;
                    g8w kxe0Var = z ? new kxe0(jxe0Var) : new ixe0(jxe0Var);
                    if (zx40Var != null) {
                        this.L$0 = oz40Var;
                        this.label = 1;
                        if (((ay40) zx40Var).a(kxe0Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        oz40Var2 = oz40Var;
                    }
                    oz40Var.setValue(null);
                }
                return zy11.a;
            }
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oz40Var2 = (oz40) this.L$0;
            kotlin.b.b(obj);
            oz40Var = oz40Var2;
            oz40Var.setValue(null);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(tse tseVar, oz40 oz40Var, zx40 zx40Var, Continuation continuation) {
        super(3, continuation);
        this.$scope = tseVar;
        this.$pressedInteraction = oz40Var;
        this.$interactionSource = zx40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((wu60) obj2).a;
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.$scope, this.$pressedInteraction, this.$interactionSource, (Continuation) obj3);
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.L$0 = (s) obj;
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.J$0 = j;
        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            s sVar = (s) this.L$0;
            tje.N(this.$scope, null, null, new AnonymousClass1(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3);
            this.label = 1;
            obj = sVar.e(this);
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
        tje.N(this.$scope, null, null, new AnonymousClass2(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3);
        return zy11.a;
    }
}
