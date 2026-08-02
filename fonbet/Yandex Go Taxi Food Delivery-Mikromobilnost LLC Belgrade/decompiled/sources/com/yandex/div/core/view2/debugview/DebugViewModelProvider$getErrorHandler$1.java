package com.yandex.div.core.view2.debugview;

import com.yandex.div.core.view2.Div2View;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class DebugViewModelProvider$getErrorHandler$1 extends FunctionReferenceImpl implements tls {
    public DebugViewModelProvider$getErrorHandler$1(Object obj) {
        super(1, obj, Div2View.class, "logError", "logError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((Div2View) this.receiver).logError((Throwable) obj);
        return zy11.a;
    }
}
