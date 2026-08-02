package xsna;

import android.content.SharedPreferences;
import com.vk.log.L;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsBlacklistsRepositoryImpl.kt */
@b6l(c = "com.vk.clips.blacklists.impl.ClipsBlacklistsRepositoryImpl$updateBlacklistData$2", f = "ClipsBlacklistsRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class ujd extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ le7 $newData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujd(le7 le7Var, spj<? super ujd> spjVar) {
        super(2, spjVar);
        this.$newData = le7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ujd(this.$newData, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ujd) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        vjd vjdVar = vjd.b;
        ((SharedPreferences) vjd.c.getValue()).edit().putBoolean("pref_morphing_blacklist", this.$newData.a).putBoolean("pref_tensorflow_blacklist", this.$newData.b).putBoolean("pref_codec_blacklist", this.$newData.c).apply();
        L.p("ClipsBlacklistsRepositoryImpl", "Clips blacklists data updated: " + this.$newData);
        return s3q0.a;
    }
}
