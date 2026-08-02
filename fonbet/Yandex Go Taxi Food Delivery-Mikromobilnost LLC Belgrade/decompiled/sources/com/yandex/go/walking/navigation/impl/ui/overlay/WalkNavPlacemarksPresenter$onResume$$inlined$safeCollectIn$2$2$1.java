package com.yandex.go.walking.navigation.impl.ui.overlay;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2", f = "WalkNavPlacemarksPresenter.kt", l = {HProv.PP_REBOOT}, m = "emit", v = 2)
/* loaded from: classes14.dex */
public final class WalkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2$2$1(d dVar, Continuation continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
