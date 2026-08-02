package com.yandex.messaging.internal.view.timeline.overlay;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public /* synthetic */ class ReactionsView$onAttachedToWindow$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        ((ReactionsView) this.receiver).invalidate();
        return zy11.a;
    }
}
