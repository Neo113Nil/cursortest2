package xsna;

import android.graphics.Bitmap;
import com.vk.photo.editor.PhotoEditorView;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CollageEditorScreen.kt */
@b6l(c = "com.vk.attachpicker.screen.CollageEditorScreen$setListeners$4", f = "CollageEditorScreen.kt", l = {342}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class o0g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ PhotoEditorView $this_setListeners;
    int label;
    final /* synthetic */ com.vk.attachpicker.screen.f this$0;

    /* compiled from: CollageEditorScreen.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ com.vk.attachpicker.screen.f b;

        public a(com.vk.attachpicker.screen.f fVar) {
            this.b = fVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            Bitmap bitmap;
            Object t;
            ld7 ld7Var = (ld7) obj;
            return (ld7Var == null || (bitmap = ld7Var.a) == null || (t = this.b.o.t(bitmap, spjVar)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? s3q0.a : t;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0g(PhotoEditorView photoEditorView, com.vk.attachpicker.screen.f fVar, spj<? super o0g> spjVar) {
        super(2, spjVar);
        this.$this_setListeners = photoEditorView;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new o0g(this.$this_setListeners, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((o0g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ttk0<ld7> resultBitmap = this.$this_setListeners.getResultBitmap();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (resultBitmap.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}
