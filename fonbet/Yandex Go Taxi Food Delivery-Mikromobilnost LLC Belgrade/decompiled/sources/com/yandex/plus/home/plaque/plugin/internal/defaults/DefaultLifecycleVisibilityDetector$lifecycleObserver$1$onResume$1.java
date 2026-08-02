package com.yandex.plus.home.plaque.plugin.internal.defaults;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class DefaultLifecycleVisibilityDetector$lifecycleObserver$1$onResume$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        ((DefaultLifecycleVisibilityDetector) this.receiver).checkVisibility();
        return zy11.a;
    }
}
