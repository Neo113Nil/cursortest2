package xsna;

import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.features.filter.c;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterViewModel.kt */
@b6l(c = "com.vk.photo.editor.features.filter.FilterViewModel$initStore$2", f = "FilterViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ser extends SuspendLambda implements wzs<EditorState, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ com.vk.photo.editor.features.filter.c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ser(com.vk.photo.editor.features.filter.c cVar, spj<? super ser> spjVar) {
        super(2, spjVar);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ser serVar = new ser(this.this$0, spjVar);
        serVar.L$0 = obj;
        return serVar;
    }

    @Override // xsna.wzs
    public final Object invoke(EditorState editorState, spj<? super s3q0> spjVar) {
        return ((ser) create(editorState, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EditorState editorState = (EditorState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.getClass();
        edr j = com.vk.photo.editor.features.filter.c.j(editorState);
        if (j != null) {
            com.vk.photo.editor.features.filter.c cVar = this.this$0;
            EditorMessage.Source source = editorState.e;
            cVar.getClass();
            aa00 aa00Var = j.a;
            int i = j.b;
            if (aa00Var != null) {
                String str = aa00Var.a;
                if (epx.f(str, cVar.f)) {
                    com.vk.photo.editor.ivm.filter.i iVar = cVar.c;
                    if (iVar == null) {
                        iVar = null;
                    }
                    iVar.b(new FilterMessage.g(i, c.a.$EnumSwitchMapping$0[source.ordinal()] == 1 ? FilterMessage.Source.UserInput : FilterMessage.Source.Synthetic));
                } else {
                    Iterator<T> it = ((com.vk.photo.editor.ivm.filter.c) ((b8f0) cVar.m()).b.getValue()).b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (epx.f(((FilterUiModel) obj2).a, str)) {
                            break;
                        }
                    }
                    FilterUiModel filterUiModel = (FilterUiModel) obj2;
                    if (filterUiModel != null) {
                        com.vk.photo.editor.ivm.filter.i iVar2 = cVar.c;
                        if (iVar2 == null) {
                            iVar2 = null;
                        }
                        String str2 = filterUiModel.a;
                        int[] iArr = c.a.$EnumSwitchMapping$0;
                        iVar2.b(new FilterMessage.f(str2, iArr[source.ordinal()] == 1 ? FilterMessage.Source.UserInput : FilterMessage.Source.Synthetic));
                        com.vk.photo.editor.ivm.filter.i iVar3 = cVar.c;
                        if (iVar3 == null) {
                            iVar3 = null;
                        }
                        iVar3.b(new FilterMessage.g(i, iArr[source.ordinal()] == 1 ? FilterMessage.Source.UserInput : FilterMessage.Source.Synthetic));
                    }
                }
                com.vk.photo.editor.ivm.filter.i iVar4 = cVar.c;
                ((com.vk.photo.editor.ivm.filter.c) (iVar4 != null ? iVar4 : null).b.b.getValue()).a.getClass();
                cVar.p();
            }
        }
        return s3q0.a;
    }
}
