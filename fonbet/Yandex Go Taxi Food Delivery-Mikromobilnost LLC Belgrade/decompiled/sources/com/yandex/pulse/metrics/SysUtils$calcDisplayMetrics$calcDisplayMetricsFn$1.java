package com.yandex.pulse.metrics;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import defpackage.ny61;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class SysUtils$calcDisplayMetrics$calcDisplayMetricsFn$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        float density;
        ((g) this.receiver).getClass();
        Object systemService = ((Context) obj).getSystemService("window");
        if (systemService == null) {
            ny61.t("null cannot be cast to non-null type android.view.WindowManager");
            return null;
        }
        currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.widthPixels = bounds.width();
        displayMetrics.heightPixels = bounds.height();
        density = currentWindowMetrics.getDensity();
        displayMetrics.density = density;
        return displayMetrics;
    }
}
