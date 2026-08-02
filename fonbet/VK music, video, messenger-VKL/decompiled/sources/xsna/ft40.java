package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicPickerItems.kt */
@b6l(c = "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerItemsKt$MusicPickerList$3$1", f = "MusicPickerItems.kt", l = {467}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ft40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wax $interactionSource;
    final /* synthetic */ xvy $scrollState;
    int label;

    /* compiled from: MusicPickerItems.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ xvy b;

        public a(xvy xvyVar) {
            this.b = xvyVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            if (!(((vax) obj) instanceof rgh0)) {
                return s3q0.a;
            }
            fh9 fh9Var = xvy.y;
            Object k = this.b.k(0, 0, spjVar);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft40(wax waxVar, xvy xvyVar, spj<? super ft40> spjVar) {
        super(2, spjVar);
        this.$interactionSource = waxVar;
        this.$scrollState = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ft40(this.$interactionSource, this.$scrollState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ft40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 b = this.$interactionSource.b();
            a aVar = new a(this.$scrollState);
            this.label = 1;
            b.getClass();
            if (caj0.k(b, aVar, this) == coroutineSingletons) {
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
