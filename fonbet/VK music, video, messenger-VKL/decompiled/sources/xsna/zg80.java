package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.json.JsonToken;

/* compiled from: OnboardingPromoRepositoryImpl.kt */
@b6l(c = "com.vk.onboardingpromo.impl.data.OnboardingPromoRepositoryImpl", f = "OnboardingPromoRepositoryImpl.kt", l = {JsonToken.BEGIN_ARRAY}, m = "loadPromoData-IoAF18A")
/* loaded from: classes4.dex */
public final class zg80 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xg80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg80(xg80 xg80Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xg80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.d(this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
    }
}
