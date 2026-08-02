package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C5356a;
import io.appmetrica.analytics.screenshot.impl.C5359d;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5356a extends Lambda implements gzs {
    public final /* synthetic */ C5359d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5356a(C5359d c5359d) {
        super(0);
        this.a = c5359d;
    }

    public static final void a(C5359d c5359d) {
        ((C5378x) c5359d.b).a("AndroidApiScreenshotCaptor");
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C5359d c5359d = this.a;
        return new Activity.ScreenCaptureCallback() { // from class: xsna.b8y0
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C5356a.a(C5359d.this);
            }
        };
    }
}
