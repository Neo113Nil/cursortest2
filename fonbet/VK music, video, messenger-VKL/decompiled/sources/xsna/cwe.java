package xsna;

import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ugf;

/* compiled from: ClipsPreStartUploadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsPreStartUploadExecutor$preStartUpload$1", f = "ClipsPreStartUploadExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class cwe extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ewe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwe(ewe eweVar, spj<? super cwe> spjVar) {
        super(2, spjVar);
        this.this$0 = eweVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cwe(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cwe) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        lm50 currentState = this.this$0.b.getCurrentState();
        ClipsUploadState.Loaded loaded = currentState instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState : null;
        if (loaded == null) {
            return s3q0.a;
        }
        ewe eweVar = this.this$0;
        ulf ulfVar = eweVar.h;
        ClipUploadData a = new rdq0(eweVar.i).a(loaded);
        ulfVar.c(a);
        eweVar.e(new ugf.f.C3802f(a.d));
        return s3q0.a;
    }
}
