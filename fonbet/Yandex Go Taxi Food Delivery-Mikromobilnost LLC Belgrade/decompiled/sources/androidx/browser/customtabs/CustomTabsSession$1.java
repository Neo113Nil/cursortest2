package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.customtabs.IEngagementSignalsCallback;
import defpackage.e1o;

/* loaded from: classes10.dex */
class CustomTabsSession$1 extends IEngagementSignalsCallback.Stub {
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    final /* synthetic */ k this$0;
    final /* synthetic */ e1o val$callback;

    public CustomTabsSession$1(k kVar, e1o e1oVar) {
        this.this$0 = kVar;
        this.val$callback = e1oVar;
    }

    @Override // android.support.customtabs.IEngagementSignalsCallback.Stub, android.support.customtabs.IEngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        this.mHandler.post(new j(this.val$callback, i, bundle, 0));
    }

    @Override // android.support.customtabs.IEngagementSignalsCallback.Stub, android.support.customtabs.IEngagementSignalsCallback
    public void onSessionEnded(boolean z, Bundle bundle) {
        this.mHandler.post(new i(this.val$callback, z, bundle, 0));
    }

    @Override // android.support.customtabs.IEngagementSignalsCallback.Stub, android.support.customtabs.IEngagementSignalsCallback
    public void onVerticalScrollEvent(boolean z, Bundle bundle) {
        this.mHandler.post(new i(this.val$callback, z, bundle, 1));
    }
}
