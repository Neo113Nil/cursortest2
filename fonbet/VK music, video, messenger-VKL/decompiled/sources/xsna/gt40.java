package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicPickerItems.kt */
@b6l(c = "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerItemsKt$MusicPickerList$4$1", f = "MusicPickerItems.kt", l = {477}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class gt40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ nek0 $keyboardController;
    final /* synthetic */ xvy $scrollState;
    int label;

    /* compiled from: MusicPickerItems.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ nek0 b;

        public a(nek0 nek0Var) {
            this.b = nek0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            nek0 nek0Var;
            if (((Boolean) obj).booleanValue() && (nek0Var = this.b) != null) {
                nek0Var.hide();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt40(xvy xvyVar, nek0 nek0Var, spj<? super gt40> spjVar) {
        super(2, spjVar);
        this.$scrollState = xvyVar;
        this.$keyboardController = nek0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gt40(this.$scrollState, this.$keyboardController, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gt40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new q010(this.$scrollState, 3));
            a aVar = new a(this.$keyboardController);
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
