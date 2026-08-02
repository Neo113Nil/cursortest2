package com.vungle.ads.internal.ui.view;

import android.app.Activity;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.lang.ref.WeakReference;
import xsna.epx;

/* loaded from: classes7.dex */
public final class m extends com.vungle.ads.internal.util.b {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a(Activity activity) {
        WeakReference weakReference;
        weakReference = this.a.f;
        if (epx.f(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            boolean z = u.a;
            t.a("NativeAd-VideoContentView", "onActivityPaused and pause video");
            d videoView = this.a.getVideoView();
            if (videoView != null) {
                videoView.h();
            }
        }
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b(Activity activity) {
        WeakReference weakReference;
        weakReference = this.a.f;
        if (epx.f(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            boolean z = u.a;
            t.a("NativeAd-VideoContentView", "onActivityResumed and try to play video");
            d videoView = this.a.getVideoView();
            if (videoView != null) {
                videoView.j();
            }
        }
    }
}
