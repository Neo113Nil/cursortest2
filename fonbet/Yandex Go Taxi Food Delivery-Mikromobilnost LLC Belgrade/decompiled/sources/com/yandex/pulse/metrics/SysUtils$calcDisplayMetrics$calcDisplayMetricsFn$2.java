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
/* loaded from: classes11.dex */
final /* synthetic */ class SysUtils$calcDisplayMetrics$calcDisplayMetricsFn$2 extends FunctionReferenceImpl implements tls {
    public SysUtils$calcDisplayMetrics$calcDisplayMetricsFn$2() {
        super(1, g.a, g.class, "calcDisplayMetricsSdk30", "calcDisplayMetricsSdk30(Landroid/content/Context;)Landroid/util/DisplayMetrics;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
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
        displayMetrics.density = r3.getResources().getConfiguration().densityDpi / 160.0f;
        return displayMetrics;
    }
}
