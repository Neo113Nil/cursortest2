package xsna;

import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.collage.CollageMessage;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.n3g;

/* compiled from: CollageViewModel.kt */
@b6l(c = "com.vk.photo.editor.features.collage.CollageViewModel$initStore$1", f = "CollageViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class o3g extends SuspendLambda implements wzs<EditorState, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n3g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3g(n3g n3gVar, spj<? super o3g> spjVar) {
        super(2, spjVar);
        this.this$0 = n3gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        o3g o3gVar = new o3g(this.this$0, spjVar);
        o3gVar.L$0 = obj;
        return o3gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(EditorState editorState, spj<? super s3q0> spjVar) {
        return ((o3g) create(editorState, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EditorState editorState = (EditorState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.getClass();
        g5p g5pVar = editorState.b.get(y2g.a);
        w1g w1gVar = g5pVar instanceof w1g ? (w1g) g5pVar : null;
        if (w1gVar != null) {
            n3g n3gVar = this.this$0;
            EditorMessage.Source source = editorState.e;
            if (w1gVar instanceof bc0) {
                com.vk.photo.editor.ivm.collage.d dVar = n3gVar.c;
                bc0 bc0Var = (bc0) w1gVar;
                (dVar != null ? dVar : null).a(new CollageMessage.c(bc0Var.b, Float.valueOf(bc0Var.c.i()), bc0Var.d, bc0Var.e, bc0Var.f, n3g.a.$EnumSwitchMapping$0[source.ordinal()] == 1 ? CollageMessage.Source.UserInput : CollageMessage.Source.Synthetic));
            } else {
                n3gVar.getClass();
            }
        }
        return s3q0.a;
    }
}
