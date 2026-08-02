package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterTool.kt */
@b6l(c = "com.vk.photo.editor.features.filter.FilterTool$2", f = "FilterTool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class jer extends SuspendLambda implements wzs<com.vk.photo.editor.ivm.filter.c, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ com.vk.photo.editor.features.filter.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jer(com.vk.photo.editor.features.filter.b bVar, spj<? super jer> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jer jerVar = new jer(this.this$0, spjVar);
        jerVar.L$0 = obj;
        return jerVar;
    }

    @Override // xsna.wzs
    public final Object invoke(com.vk.photo.editor.ivm.filter.c cVar, spj<? super s3q0> spjVar) {
        return ((jer) create(cVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c4i0 c4i0Var;
        com.vk.photo.editor.ivm.filter.c cVar = (com.vk.photo.editor.ivm.filter.c) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        com.vk.photo.editor.features.filter.b bVar = this.this$0;
        if (bVar.k == null) {
            return s3q0.a;
        }
        ViewGroup viewGroup = bVar.g;
        if (viewGroup != null) {
            fyt0.o(viewGroup, cVar.c);
        }
        TextView textView = this.this$0.i;
        if (textView != null) {
            textView.setText(String.valueOf(cVar.d));
        }
        if (cVar.f == FilterMessage.Source.Synthetic && (c4i0Var = this.this$0.h) != null) {
            c4i0Var.a(cVar.d, false);
        }
        return s3q0.a;
    }
}
