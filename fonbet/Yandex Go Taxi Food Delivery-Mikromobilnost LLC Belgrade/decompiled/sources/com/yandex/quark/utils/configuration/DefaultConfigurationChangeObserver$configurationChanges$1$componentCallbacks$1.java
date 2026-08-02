package com.yandex.quark.utils.configuration;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/yandex/quark/utils/configuration/DefaultConfigurationChangeObserver$configurationChanges$1$componentCallbacks$1", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "Lzy11;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultConfigurationChangeObserver$configurationChanges$1$componentCallbacks$1 implements ComponentCallbacks {
    final /* synthetic */ y6f0 $$this$callbackFlow;

    public DefaultConfigurationChangeObserver$configurationChanges$1$componentCallbacks$1(y6f0 y6f0Var) {
        this.$$this$callbackFlow = y6f0Var;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        ((x6f0) this.$$this$callbackFlow).d(zy11.a);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
