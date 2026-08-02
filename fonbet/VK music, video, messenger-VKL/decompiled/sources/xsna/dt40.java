package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicPickerItems.kt */
@b6l(c = "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerItemsKt$MusicPickerItems$4$1$1", f = "MusicPickerItems.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class dt40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wax $interactionSource;
    final /* synthetic */ sg50 $interactionSourceList;
    int label;

    /* compiled from: MusicPickerItems.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ sg50 b;

        public a(sg50 sg50Var) {
            this.b = sg50Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            vax vaxVar = (vax) obj;
            boolean z = vaxVar instanceof rgh0;
            sg50 sg50Var = this.b;
            if (z) {
                sg50Var.c(rgh0.a);
            } else if (vaxVar instanceof llk) {
                sg50Var.c(vaxVar);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt40(wax waxVar, sg50 sg50Var, spj<? super dt40> spjVar) {
        super(2, spjVar);
        this.$interactionSource = waxVar;
        this.$interactionSourceList = sg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dt40(this.$interactionSource, this.$interactionSourceList, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((dt40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 b = this.$interactionSource.b();
            a aVar = new a(this.$interactionSourceList);
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
