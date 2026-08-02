package xsna;

import com.vk.core.view.components.topbar.VkTopBar;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicPickerItems.kt */
@b6l(c = "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerItemsKt$buildMiddleSearch$1$1", f = "MusicPickerItems.kt", l = {296}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class mt40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wax $interactionSource;
    final /* synthetic */ wh50<tho0> $text$delegate;
    int label;

    /* compiled from: MusicPickerItems.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ wh50<tho0> b;

        public a(wh50<tho0> wh50Var) {
            this.b = wh50Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            vax vaxVar = (vax) obj;
            if (vaxVar instanceof VkTopBar.k) {
                tho0 tho0Var = new tho0(((VkTopBar.k) vaxVar).a, 0L, 6);
                qcy<Object>[] qcyVarArr = lt40.a;
                this.b.setValue(tho0Var);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt40(wax waxVar, wh50<tho0> wh50Var, spj<? super mt40> spjVar) {
        super(2, spjVar);
        this.$interactionSource = waxVar;
        this.$text$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mt40(this.$interactionSource, this.$text$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mt40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 b = this.$interactionSource.b();
            a aVar = new a(this.$text$delegate);
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
