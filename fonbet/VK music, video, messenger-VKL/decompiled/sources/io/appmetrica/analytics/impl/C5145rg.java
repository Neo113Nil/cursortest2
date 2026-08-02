package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import xsna.lhg;
import xsna.yr2;

/* renamed from: io.appmetrica.analytics.impl.rg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5145rg implements InstallReferrerStateListener {
    public final /* synthetic */ C5171sg a;
    public final /* synthetic */ Cg b;

    public C5145rg(C5171sg c5171sg, Cg cg) {
        this.a = c5171sg;
        this.b = cg;
    }

    public static final void a(C5171sg c5171sg, Cg cg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c5171sg.b.getInstallReferrer();
                cg.a(new C5298xg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC5273wg.c));
                installReferrerClient = c5171sg.b;
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable th) {
            try {
                cg.a(th);
                installReferrerClient = c5171sg.b;
            } finally {
            }
        }
        installReferrerClient.endConnection();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        if (i != 0) {
            this.a.a(this.b, new IllegalStateException(lhg.a(i, "Referrer check failed with error ")));
            return;
        }
        C5171sg c5171sg = this.a;
        c5171sg.a.execute(new yr2(9, c5171sg, this.b));
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}
