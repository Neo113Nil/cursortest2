package xsna;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;

/* compiled from: MusicKidsModeManagerImpl.kt */
@b6l(c = "com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl$toggleMode$2", f = "MusicKidsModeManagerImpl.kt", l = {JsonToken.END_ARRAY}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class jm40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ gzs<s3q0> $doOnError;
    final /* synthetic */ gzs<s3q0> $doOnSuccess;
    int label;
    final /* synthetic */ zl40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm40(zl40 zl40Var, Context context, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, spj<? super jm40> spjVar) {
        super(2, spjVar);
        this.this$0 = zl40Var;
        this.$context = context;
        this.$doOnSuccess = gzsVar;
        this.$doOnError = gzsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jm40(this.this$0, this.$context, this.$doOnSuccess, this.$doOnError, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jm40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zl40 zl40Var = this.this$0;
            Context context = this.$context;
            gzs<s3q0> gzsVar = this.$doOnSuccess;
            gzs<s3q0> gzsVar2 = this.$doOnError;
            this.label = 1;
            if (zl40.b(zl40Var, context, gzsVar, gzsVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
