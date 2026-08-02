package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;
import xsna.z2o0;

/* compiled from: TextFieldPressGestureFilter.kt */
/* loaded from: classes11.dex */
public final class sgo0 implements PointerInputEventHandler {
    public final /* synthetic */ yvj a;
    public final /* synthetic */ wh50<o2d0.b> b;
    public final /* synthetic */ sg50 c;
    public final /* synthetic */ wh50 d;

    /* compiled from: TextFieldPressGestureFilter.kt */
    @b6l(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements yzs<j2d0, ov70, spj<? super s3q0>, Object> {
        final /* synthetic */ sg50 $interactionSource;
        final /* synthetic */ wh50<o2d0.b> $pressedInteraction;
        final /* synthetic */ yvj $scope;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: TextFieldPressGestureFilter.kt */
        @b6l(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend", v = 1)
        /* renamed from: xsna.sgo0$a$a, reason: collision with other inner class name */
        public static final class C3665a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ sg50 $interactionSource;
            final /* synthetic */ long $it;
            final /* synthetic */ wh50<o2d0.b> $pressedInteraction;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3665a(wh50<o2d0.b> wh50Var, long j, sg50 sg50Var, spj<? super C3665a> spjVar) {
                super(2, spjVar);
                this.$pressedInteraction = wh50Var;
                this.$it = j;
                this.$interactionSource = sg50Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3665a(this.$pressedInteraction, this.$it, this.$interactionSource, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3665a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                wh50<o2d0.b> wh50Var;
                wh50<o2d0.b> wh50Var2;
                o2d0.b bVar;
                sg50 sg50Var;
                o2d0.b bVar2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    o2d0.b value = this.$pressedInteraction.getValue();
                    if (value != null) {
                        sg50 sg50Var2 = this.$interactionSource;
                        wh50Var = this.$pressedInteraction;
                        o2d0.a aVar = new o2d0.a(value);
                        if (sg50Var2 != null) {
                            this.L$0 = wh50Var;
                            this.label = 1;
                            if (sg50Var2.a(aVar, this) != coroutineSingletons) {
                                wh50Var2 = wh50Var;
                            }
                            return coroutineSingletons;
                        }
                        wh50Var.setValue(null);
                    }
                    bVar = new o2d0.b(this.$it);
                    sg50Var = this.$interactionSource;
                    if (sg50Var != null) {
                        this.L$0 = bVar;
                        this.label = 2;
                        if (sg50Var.a(bVar, this) != coroutineSingletons) {
                            bVar2 = bVar;
                            bVar = bVar2;
                        }
                        return coroutineSingletons;
                    }
                    this.$pressedInteraction.setValue(bVar);
                    return s3q0.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (o2d0.b) this.L$0;
                    kotlin.a.a(obj);
                    bVar = bVar2;
                    this.$pressedInteraction.setValue(bVar);
                    return s3q0.a;
                }
                wh50Var2 = (wh50) this.L$0;
                kotlin.a.a(obj);
                wh50Var = wh50Var2;
                wh50Var.setValue(null);
                bVar = new o2d0.b(this.$it);
                sg50Var = this.$interactionSource;
                if (sg50Var != null) {
                }
                this.$pressedInteraction.setValue(bVar);
                return s3q0.a;
            }
        }

        /* compiled from: TextFieldPressGestureFilter.kt */
        @b6l(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ sg50 $interactionSource;
            final /* synthetic */ wh50<o2d0.b> $pressedInteraction;
            final /* synthetic */ boolean $success;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wh50<o2d0.b> wh50Var, boolean z, sg50 sg50Var, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$pressedInteraction = wh50Var;
                this.$success = z;
                this.$interactionSource = sg50Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.$pressedInteraction, this.$success, this.$interactionSource, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                wh50<o2d0.b> wh50Var;
                wh50<o2d0.b> wh50Var2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    o2d0.b value = this.$pressedInteraction.getValue();
                    if (value != null) {
                        boolean z = this.$success;
                        sg50 sg50Var = this.$interactionSource;
                        wh50Var = this.$pressedInteraction;
                        vax cVar = z ? new o2d0.c(value) : new o2d0.a(value);
                        if (sg50Var != null) {
                            this.L$0 = wh50Var;
                            this.label = 1;
                            if (sg50Var.a(cVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            wh50Var2 = wh50Var;
                        }
                        wh50Var.setValue(null);
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wh50Var2 = (wh50) this.L$0;
                kotlin.a.a(obj);
                wh50Var = wh50Var2;
                wh50Var.setValue(null);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yvj yvjVar, wh50<o2d0.b> wh50Var, sg50 sg50Var, spj<? super a> spjVar) {
            super(3, spjVar);
            this.$scope = yvjVar;
            this.$pressedInteraction = wh50Var;
            this.$interactionSource = sg50Var;
        }

        @Override // xsna.yzs
        public final Object invoke(j2d0 j2d0Var, ov70 ov70Var, spj<? super s3q0> spjVar) {
            long j = ov70Var.a;
            a aVar = new a(this.$scope, this.$pressedInteraction, this.$interactionSource, spjVar);
            aVar.L$0 = j2d0Var;
            aVar.J$0 = j;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                j2d0 j2d0Var = (j2d0) this.L$0;
                myc0.h(this.$scope, null, null, new C3665a(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3);
                this.label = 1;
                obj = j2d0Var.h0(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            myc0.h(this.$scope, null, null, new b(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3);
            return s3q0.a;
        }
    }

    public sgo0(yvj yvjVar, wh50 wh50Var, sg50 sg50Var, wh50 wh50Var2) {
        this.a = yvjVar;
        this.b = wh50Var;
        this.c = sg50Var;
        this.d = wh50Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        a aVar = new a(this.a, this.b, this.c, null);
        j36 j36Var = new j36(2, this.d);
        z2o0.a aVar2 = z2o0.a;
        Object d = zvj.d(new d3o0(dmb0Var, aVar, j36Var, new n2d0(dmb0Var), null), spjVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (d != coroutineSingletons) {
            d = s3q0.a;
        }
        return d == coroutineSingletons ? d : s3q0.a;
    }
}
