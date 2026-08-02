package xsna;

import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterViewModel.kt */
@b6l(c = "com.vk.photo.editor.features.filter.FilterViewModel$initStore$1", f = "FilterViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class rer extends SuspendLambda implements wzs<com.vk.photo.editor.ivm.filter.c, spj<? super s3q0>, Object> {
    final /* synthetic */ com.vk.photo.editor.ivm.d $parentStore;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ com.vk.photo.editor.features.filter.c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rer(com.vk.photo.editor.features.filter.c cVar, com.vk.photo.editor.ivm.d dVar, spj<? super rer> spjVar) {
        super(2, spjVar);
        this.this$0 = cVar;
        this.$parentStore = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        rer rerVar = new rer(this.this$0, this.$parentStore, spjVar);
        rerVar.L$0 = obj;
        return rerVar;
    }

    @Override // xsna.wzs
    public final Object invoke(com.vk.photo.editor.ivm.filter.c cVar, spj<? super s3q0> spjVar) {
        return ((rer) create(cVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.vk.photo.editor.ivm.filter.c cVar = (com.vk.photo.editor.ivm.filter.c) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!cVar.b.isEmpty()) {
            com.vk.photo.editor.features.filter.c cVar2 = this.this$0;
            EditorState editorState = (EditorState) this.$parentStore.b.b.getValue();
            cVar2.getClass();
            if (com.vk.photo.editor.features.filter.c.j(editorState) != null) {
                this.this$0.n();
            }
        }
        if (cVar.g) {
            this.$parentStore.a(EditorMessage.b.a);
        }
        return s3q0.a;
    }
}
