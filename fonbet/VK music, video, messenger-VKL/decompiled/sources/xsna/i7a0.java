package xsna;

import com.vk.photo.editor.PhotoEditorView;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PhotoEditorView.kt */
@b6l(c = "com.vk.photo.editor.PhotoEditorView$resetAllCollageUnfriendlyTools$1", f = "PhotoEditorView.kt", l = {1115}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class i7a0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ PhotoEditorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7a0(PhotoEditorView photoEditorView, spj<? super i7a0> spjVar) {
        super(2, spjVar);
        this.this$0 = photoEditorView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i7a0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i7a0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0089 -> B:5:0x008a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map tools;
        HashMap hashMap;
        Iterator it;
        com.vk.photo.editor.ivm.d store;
        com.vk.photo.editor.ivm.d store2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            HashMap hashMap2 = new HashMap();
            tools = this.this$0.getTools();
            hashMap = hashMap2;
            it = tools.entrySet().iterator();
            while (it.hasNext()) {
            }
            store = this.this$0.getStore();
            store.a(new EditorMessage.j(hashMap));
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f5p f5pVar = (f5p) this.L$5;
        ?? r3 = (Map) this.L$4;
        it = (Iterator) this.L$1;
        HashMap hashMap3 = (HashMap) this.L$0;
        kotlin.a.a(obj);
        HashMap hashMap4 = r3;
        hashMap4.put(f5pVar, obj);
        hashMap = hashMap3;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            f5pVar = (f5p) entry.getKey();
            d5p d5pVar = (d5p) entry.getValue();
            if (!(d5pVar instanceof v0g)) {
                store2 = this.this$0.getStore();
                i4p i4pVar = ((EditorState) store2.b.b.getValue()).a;
                this.L$0 = hashMap;
                this.L$1 = it;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = hashMap;
                this.L$5 = f5pVar;
                this.label = 1;
                obj = d5pVar.u(i4pVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                hashMap3 = hashMap;
                hashMap4 = hashMap;
                hashMap4.put(f5pVar, obj);
                hashMap = hashMap3;
                while (it.hasNext()) {
                }
            }
        }
        store = this.this$0.getStore();
        store.a(new EditorMessage.j(hashMap));
        return s3q0.a;
    }
}
