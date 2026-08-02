package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes8.dex */
public final class Fj implements InterfaceC4753cb {
    public final /* synthetic */ UserProfile a;

    public Fj(UserProfile userProfile) {
        this.a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.reportUserProfile(this.a);
    }
}
