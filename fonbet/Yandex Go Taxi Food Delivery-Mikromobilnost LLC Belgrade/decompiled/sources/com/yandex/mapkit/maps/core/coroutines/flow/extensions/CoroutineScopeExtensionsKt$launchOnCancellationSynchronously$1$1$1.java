package com.yandex.mapkit.maps.core.coroutines.flow.extensions;

import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
/* loaded from: classes15.dex */
public final class CoroutineScopeExtensionsKt$launchOnCancellationSynchronously$1$1$1 implements tls {
    final /* synthetic */ sls $block;

    public CoroutineScopeExtensionsKt$launchOnCancellationSynchronously$1$1$1(sls slsVar) {
        this.$block = slsVar;
    }

    @Override // defpackage.tls
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return zy11.a;
    }

    public final void invoke(Throwable th) {
        this.$block.invoke();
    }
}
