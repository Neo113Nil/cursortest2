package com.yandex.div.core.view2;

import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: DivViewCreator.kt */
@b6l(c = "com.yandex.div.core.view2.DivViewCreator$viewPreCreationProfile$1$1", f = "DivViewCreator.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class DivViewCreator$viewPreCreationProfile$1$1 extends SuspendLambda implements wzs<yvj, spj<? super ViewPreCreationProfile>, Object> {
    final /* synthetic */ String $it;
    final /* synthetic */ ViewPreCreationProfileRepository $repository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivViewCreator$viewPreCreationProfile$1$1(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, spj<? super DivViewCreator$viewPreCreationProfile$1$1> spjVar) {
        super(2, spjVar);
        this.$repository = viewPreCreationProfileRepository;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new DivViewCreator$viewPreCreationProfile$1$1(this.$repository, this.$it, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        a.a(obj);
        ViewPreCreationProfileRepository viewPreCreationProfileRepository = this.$repository;
        String str = this.$it;
        this.label = 1;
        Object obj2 = viewPreCreationProfileRepository.get(str, this);
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ViewPreCreationProfile> spjVar) {
        return ((DivViewCreator$viewPreCreationProfile$1$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
