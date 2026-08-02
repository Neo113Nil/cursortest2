package com.yandex.pulse.metrics;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;
import defpackage.ny61;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class SysUtils$calcDisplayMetrics$calcDisplayMetricsFn$3 extends FunctionReferenceImpl implements tls {
    public SysUtils$calcDisplayMetrics$calcDisplayMetricsFn$3() {
        super(1, g.a, g.class, "calcDisplayMetricsSdk17", "calcDisplayMetricsSdk17(Landroid/content/Context;)Landroid/util/DisplayMetrics;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((g) this.receiver).getClass();
        Object systemService = ((Context) obj).getSystemService("display");
        if (systemService == null) {
            ny61.t("null cannot be cast to non-null type android.hardware.display.DisplayManager");
            return null;
        }
        Display display = ((DisplayManager) systemService).getDisplay(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        return displayMetrics;
    }
}
