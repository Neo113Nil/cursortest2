package xsna;

import com.vk.photo.editor.PhotoEditorView;
import com.vk.photo.editor.ivm.EditorState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PhotoEditorView.kt */
@b6l(c = "com.vk.photo.editor.PhotoEditorView$completeInit$3", f = "PhotoEditorView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class h7a0 extends SuspendLambda implements wzs<EditorState.a, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PhotoEditorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7a0(PhotoEditorView photoEditorView, spj<? super h7a0> spjVar) {
        super(2, spjVar);
        this.this$0 = photoEditorView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        h7a0 h7a0Var = new h7a0(this.this$0, spjVar);
        h7a0Var.L$0 = obj;
        return h7a0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(EditorState.a aVar, spj<? super s3q0> spjVar) {
        return ((h7a0) create(aVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EditorState.a aVar = (EditorState.a) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        PhotoEditorView photoEditorView = this.this$0;
        if (aVar != null) {
            PhotoEditorView.m(photoEditorView, aVar);
        } else {
            int i = PhotoEditorView.c0;
            photoEditorView.v();
        }
        return s3q0.a;
    }
}
