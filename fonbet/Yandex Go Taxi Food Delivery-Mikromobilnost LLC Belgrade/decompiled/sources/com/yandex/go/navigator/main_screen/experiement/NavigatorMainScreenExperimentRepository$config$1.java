package com.yandex.go.navigator.main_screen.experiement;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.main_screen.experiement.NavigatorMainScreenExperimentRepository", f = "NavigatorMainScreenExperimentRepository.kt", l = {18, 18}, m = ConfigConstants.CONFIG, v = 2)
/* loaded from: classes12.dex */
final class NavigatorMainScreenExperimentRepository$config$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorMainScreenExperimentRepository$config$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
