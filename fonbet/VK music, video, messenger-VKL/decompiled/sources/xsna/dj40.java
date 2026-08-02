package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.el50;

/* compiled from: MusicDownloadsSettingsInlineActor.kt */
@b6l(c = "com.vk.music.offline.ui.presentation.MusicDownloadsSettingsInlineActor$initMobileNetworkDownload$1$1", f = "MusicDownloadsSettingsInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class dj40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ej40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj40(ej40 ej40Var, spj<? super dj40> spjVar) {
        super(2, spjVar);
        this.this$0 = ej40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dj40(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((dj40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ej40 ej40Var = this.this$0;
        ej40Var.getClass();
        el50.a.b(ej40Var, new es00(ej40Var, 5));
        return s3q0.a;
    }
}
