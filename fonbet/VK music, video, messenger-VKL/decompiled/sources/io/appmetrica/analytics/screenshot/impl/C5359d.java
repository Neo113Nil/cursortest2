package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.u81;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5359d implements T {
    public final ClientContext a;
    public final U b;
    public volatile C5365j c;
    public final Lazy d = new bpn0(new C5356a(this));

    public C5359d(ClientContext clientContext, U u) {
        this.a = clientContext;
        this.b = u;
    }

    public static final Activity.ScreenCaptureCallback d(C5359d c5359d) {
        return u81.b(c5359d.d.getValue());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C5368m c5368m) {
        this.c = c5368m != null ? c5368m.a : null;
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.a.getActivityLifecycleRegistry().registerListener(new C5358c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
