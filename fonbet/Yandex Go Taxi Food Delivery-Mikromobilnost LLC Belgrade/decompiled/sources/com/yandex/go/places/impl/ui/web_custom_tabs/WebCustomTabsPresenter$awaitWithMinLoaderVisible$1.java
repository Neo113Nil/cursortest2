package com.yandex.go.places.impl.ui.web_custom_tabs;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.web_custom_tabs.WebCustomTabsPresenter", f = "WebCustomTabsPresenter.kt", l = {HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_384, 81}, m = "awaitWithMinLoaderVisible", v = 2)
/* loaded from: classes13.dex */
final class WebCustomTabsPresenter$awaitWithMinLoaderVisible$1<T> extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCustomTabsPresenter$awaitWithMinLoaderVisible$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.Kg(this.this$0, null, this);
    }
}
