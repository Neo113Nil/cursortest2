package com.yandex.go.antirobot.experiment;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.antirobot.experiment.AntirobotExperimentRepositoryImpl", f = "AntirobotExperimentRepositoryImpl.kt", l = {23}, m = URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, v = 2)
/* loaded from: classes12.dex */
final class AntirobotExperimentRepositoryImpl$host$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AntirobotExperimentRepositoryImpl$host$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
