package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes8.dex */
public final class Xh implements Runnable {
    public final /* synthetic */ UserProfile a;
    public final /* synthetic */ C5122qi b;

    public Xh(C5122qi c5122qi, UserProfile userProfile) {
        this.b = c5122qi;
        this.a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportUserProfile(this.a);
    }
}
