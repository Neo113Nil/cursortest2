package com.yandex.plus.experiments.impl.providers;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.experiments.impl.providers.ExperimentsRepository", f = "ExperimentsRepository.kt", l = {BlendingGradientView.BASE_ALPHA, HProv.PP_LICENSE}, m = "getRemoteExperiments")
/* loaded from: classes8.dex */
final class ExperimentsRepository$getRemoteExperiments$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsRepository$getRemoteExperiments$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(this.this$0, this);
    }
}
