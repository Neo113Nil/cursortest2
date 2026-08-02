package com.yandex.go.preorder.suggested.menu.presenter;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.preorder.suggested.menu.presenter.SuggestMenuPresenter", f = "SuggestMenuPresenter.kt", l = {ModuleDescriptor.MODULE_VERSION, MSException.ERROR_BUSY}, m = "requestFinalSuggest", v = 2)
/* loaded from: classes13.dex */
final class SuggestMenuPresenter$requestFinalSuggest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestMenuPresenter$requestFinalSuggest$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.Mg(this.this$0, this);
    }
}
