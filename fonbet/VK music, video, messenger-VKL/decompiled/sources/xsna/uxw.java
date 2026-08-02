package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.commons.http.Http;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt", f = "InitDelegate.kt", l = {Http.StatusCode.SEE_OTHER}, m = "getInitialDonutLevel")
/* loaded from: classes7.dex */
public final class uxw extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public uxw() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return rxw.a(null, null, this);
    }
}
