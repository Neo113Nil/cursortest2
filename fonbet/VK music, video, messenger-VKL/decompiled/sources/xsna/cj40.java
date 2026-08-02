package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.el50;

/* compiled from: MusicDownloadsSettingsInlineActor.kt */
@b6l(c = "com.vk.music.offline.ui.presentation.MusicDownloadsSettingsInlineActor$initDownloadsSize$1$1", f = "MusicDownloadsSettingsInlineActor.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class cj40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ej40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj40(ej40 ej40Var, spj<? super cj40> spjVar) {
        super(2, spjVar);
        this.this$0 = ej40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cj40(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cj40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ej40 ej40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ej40 ej40Var2 = this.this$0;
            j850 j850Var = ej40Var2.c;
            this.L$0 = ej40Var2;
            this.label = 1;
            Object a = j850Var.b.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            ej40Var = ej40Var2;
            obj = a;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ej40Var = (ej40) this.L$0;
            kotlin.a.a(obj);
        }
        long longValue = ((Number) obj).longValue();
        ej40Var.getClass();
        el50.a.b(ej40Var, new aj40(longValue));
        return s3q0.a;
    }
}
