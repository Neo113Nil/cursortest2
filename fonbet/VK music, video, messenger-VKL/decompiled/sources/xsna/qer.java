package xsna;

import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterViewModel.kt */
@b6l(c = "com.vk.photo.editor.features.filter.FilterViewModel$handleUserChangeFilterValue$1", f = "FilterViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class qer extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $value;
    int label;
    final /* synthetic */ com.vk.photo.editor.features.filter.c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qer(com.vk.photo.editor.features.filter.c cVar, int i, spj<? super qer> spjVar) {
        super(2, spjVar);
        this.this$0 = cVar;
        this.$value = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qer(this.this$0, this.$value, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qer) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        com.vk.photo.editor.ivm.d dVar = this.this$0.b;
        if (dVar == null) {
            dVar = null;
        }
        edr j = com.vk.photo.editor.features.filter.c.j((EditorState) dVar.b.b.getValue());
        if (j != null) {
            com.vk.photo.editor.features.filter.c cVar = this.this$0;
            int i = this.$value;
            com.vk.photo.editor.ivm.d dVar2 = cVar.b;
            (dVar2 != null ? dVar2 : null).a(new EditorMessage.i(new edr(j.a, i), EditorMessage.Source.UserInput, 4));
        }
        return s3q0.a;
    }
}
