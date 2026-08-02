package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;

/* loaded from: classes11.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public final PendingIntent c() {
        return this.mStatus.getResolution();
    }

    public final void f(Activity activity, int i) {
        this.mStatus.startResolutionForResult(activity, i);
    }
}
