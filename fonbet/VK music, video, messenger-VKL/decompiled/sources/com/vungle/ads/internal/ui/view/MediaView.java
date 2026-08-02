package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r1;
import com.vungle.ads.nativead.NativeVideoListener;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class MediaView extends RelativeLayout {
    public NativeVideoListener a;
    public e b;

    public MediaView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final com.vungle.ads.nativead.a getVideoControl() {
        ViewParent viewParent = this.b;
        if (viewParent instanceof com.vungle.ads.nativead.a) {
            return (com.vungle.ads.nativead.a) viewParent;
        }
        return null;
    }

    public final void a(r1 r1Var) {
        if (r1Var.s()) {
            if (this.b == null) {
                n nVar = new n(getContext(), r1Var);
                nVar.setNativeVideoListener(this.a);
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
                m2Var.a((Long) 1L);
                AnalyticsClient.a(analyticsClient, m2Var, r1Var.e(), 4);
                this.b = nVar;
            }
        } else if (this.b == null) {
            e eVar = new e(getContext(), r1Var);
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            m2 m2Var2 = new m2(Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
            m2Var2.a((Long) 2L);
            AnalyticsClient.a(analyticsClient2, m2Var2, r1Var.e(), 4);
            this.b = eVar;
        }
        e eVar2 = this.b;
        if (eVar2 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            eVar2.setLayoutParams(layoutParams);
            if (!epx.f(eVar2.getParent(), this)) {
                ViewGroup viewGroup = (ViewGroup) eVar2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(eVar2);
                }
                addView(eVar2);
            }
            eVar2.a(getContext());
        }
    }

    public final int getCurrentTime() {
        com.vungle.ads.nativead.a videoControl = getVideoControl();
        return (videoControl != null ? ((n) videoControl).getCurrentTime() : 0) / 1000;
    }

    public final int getDuration() {
        com.vungle.ads.nativead.a videoControl = getVideoControl();
        return (videoControl != null ? ((n) videoControl).getDuration() : 0) / 1000;
    }

    public final void setNativeVideoListener(NativeVideoListener nativeVideoListener) {
        this.a = nativeVideoListener;
        e eVar = this.b;
        n nVar = eVar instanceof n ? (n) eVar : null;
        if (nVar == null) {
            return;
        }
        nVar.setNativeVideoListener(nativeVideoListener);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
