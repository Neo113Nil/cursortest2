package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes8.dex */
public final class V0 implements Runnable {
    public final /* synthetic */ UserProfile a;
    public final /* synthetic */ C5208u1 b;

    public V0(C5208u1 c5208u1, UserProfile userProfile) {
        this.b = c5208u1;
        this.a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.b).reportUserProfile(this.a);
    }
}
