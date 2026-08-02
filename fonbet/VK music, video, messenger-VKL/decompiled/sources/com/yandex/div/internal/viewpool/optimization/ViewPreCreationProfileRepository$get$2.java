package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import android.util.Log;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.logging.Severity;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.ksr;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: ViewPreCreationProfileRepository.kt */
@b6l(c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2", f = "ViewPreCreationProfileRepository.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ViewPreCreationProfileRepository$get$2 extends SuspendLambda implements wzs<yvj, spj<? super ViewPreCreationProfile>, Object> {
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ViewPreCreationProfileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPreCreationProfileRepository$get$2(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, spj<? super ViewPreCreationProfileRepository$get$2> spjVar) {
        super(2, spjVar);
        this.this$0 = viewPreCreationProfileRepository;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ViewPreCreationProfileRepository$get$2 viewPreCreationProfileRepository$get$2 = new ViewPreCreationProfileRepository$get$2(this.this$0, this.$id, spjVar);
        viewPreCreationProfileRepository$get$2.L$0 = obj;
        return viewPreCreationProfileRepository$get$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        ViewPreCreationProfile viewPreCreationProfile;
        ViewPreCreationProfileRepository.Companion companion;
        Context context;
        Object n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                a.a(obj);
                ViewPreCreationProfileRepository viewPreCreationProfileRepository = this.this$0;
                String str = this.$id;
                companion = ViewPreCreationProfileRepository.Companion;
                context = viewPreCreationProfileRepository.context;
                ksr<ViewPreCreationProfile> data = companion.getStoreForId(context, str).getData();
                this.label = 1;
                n = rsr.n(data, this);
                if (n == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                n = obj;
            }
            failure = (ViewPreCreationProfile) n;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
            Log.e("OptimizedViewPreCreationProfileRepository", "", a);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        ViewPreCreationProfile viewPreCreationProfile2 = (ViewPreCreationProfile) failure;
        if (viewPreCreationProfile2 != null) {
            return viewPreCreationProfile2;
        }
        viewPreCreationProfile = this.this$0.defaultProfile;
        return ViewPreCreationProfile.copy$default(viewPreCreationProfile, this.$id, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286, null);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ViewPreCreationProfile> spjVar) {
        return ((ViewPreCreationProfileRepository$get$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
