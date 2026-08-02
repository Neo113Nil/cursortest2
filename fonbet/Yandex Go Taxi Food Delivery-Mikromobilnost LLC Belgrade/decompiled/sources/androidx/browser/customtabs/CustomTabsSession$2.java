package androidx.browser.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.support.customtabs.IEngagementSignalsCallback;
import defpackage.e1o;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
class CustomTabsSession$2 extends IEngagementSignalsCallback.Stub {
    private final Executor mExecutor;
    final /* synthetic */ k this$0;
    final /* synthetic */ e1o val$callback;
    final /* synthetic */ Executor val$executor;

    public CustomTabsSession$2(k kVar, Executor executor, e1o e1oVar) {
        this.this$0 = kVar;
        this.val$executor = executor;
        this.val$callback = e1oVar;
        this.mExecutor = executor;
    }

    @Override // android.support.customtabs.IEngagementSignalsCallback.Stub, android.support.customtabs.IEngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.mExecutor.execute(new j(this.val$callback, i, bundle, 1));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // android.support.customtabs.IEngagementSignalsCallback.Stub, android.support.customtabs.IEngagementSignalsCallback
    public void onSessionEnded(boolean z, Bundle bundle) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.mExecutor.execute(new i(this.val$callback, z, bundle, 3));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // android.support.customtabs.IEngagementSignalsCallback.Stub, android.support.customtabs.IEngagementSignalsCallback
    public void onVerticalScrollEvent(boolean z, Bundle bundle) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.mExecutor.execute(new i(this.val$callback, z, bundle, 2));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
