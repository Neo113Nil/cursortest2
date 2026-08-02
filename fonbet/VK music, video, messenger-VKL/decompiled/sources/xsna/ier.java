package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterTool.kt */
@b6l(c = "com.vk.photo.editor.features.filter.FilterTool$1", f = "FilterTool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ier extends SuspendLambda implements wzs<List<? extends com.vk.photo.editor.features.filter.a>, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ com.vk.photo.editor.features.filter.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ier(com.vk.photo.editor.features.filter.b bVar, spj<? super ier> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ier ierVar = new ier(this.this$0, spjVar);
        ierVar.L$0 = obj;
        return ierVar;
    }

    @Override // xsna.wzs
    public final Object invoke(List<? extends com.vk.photo.editor.features.filter.a> list, spj<? super s3q0> spjVar) {
        return ((ier) create(list, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<? extends com.vk.photo.editor.features.filter.a> list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        final com.vk.photo.editor.features.filter.b bVar = this.this$0;
        bVar.p = list;
        xcr xcrVar = bVar.m;
        if (xcrVar == null) {
            com.vk.photo.editor.features.filter.d dVar = bVar.k;
            if (dVar != null) {
                dVar.submitList(list);
            }
        } else {
            xcrVar.o(new RecyclerView.l.a() { // from class: xsna.her
                @Override // androidx.recyclerview.widget.RecyclerView.l.a
                public final void a() {
                    com.vk.photo.editor.features.filter.b bVar2 = com.vk.photo.editor.features.filter.b.this;
                    com.vk.photo.editor.features.filter.d dVar2 = bVar2.k;
                    if (dVar2 != null) {
                        dVar2.submitList(bVar2.p);
                    }
                }
            });
        }
        return s3q0.a;
    }
}
