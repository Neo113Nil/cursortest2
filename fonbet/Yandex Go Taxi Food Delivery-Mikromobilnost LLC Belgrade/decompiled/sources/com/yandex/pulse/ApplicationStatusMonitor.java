package com.yandex.pulse;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/pulse/ApplicationStatusMonitor;", "", "", "isSuspended", "()Z", "Lcom/yandex/pulse/ApplicationStatusMonitor$ApplicationStatusCallback;", "callback", "Lzy11;", "setCallback", "(Lcom/yandex/pulse/ApplicationStatusMonitor$ApplicationStatusCallback;)V", "ApplicationStatusCallback", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ApplicationStatusMonitor {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/yandex/pulse/ApplicationStatusMonitor$ApplicationStatusCallback;", "", "Lzy11;", "onSuspend", "()V", "onResume", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface ApplicationStatusCallback {
        void onResume();

        void onSuspend();
    }

    boolean isSuspended();

    void setCallback(ApplicationStatusCallback callback);
}
