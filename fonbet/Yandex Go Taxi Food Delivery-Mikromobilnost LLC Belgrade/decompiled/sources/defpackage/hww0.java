package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class hww0 {
    public static final /* synthetic */ kgx[] f = {new MutablePropertyReference1Impl("userShownCount", 0, "getUserShownCount()I", hww0.class), new MutablePropertyReference1Impl("userUsageCount", 0, "getUserUsageCount()I", hww0.class), new MutablePropertyReference1Impl("surgeInfoWidgetClick", 0, "getSurgeInfoWidgetClick()Z", hww0.class)};
    public final r0 a = bvf0.c(Boolean.FALSE);
    public final AtomicBoolean b;
    public final qdx c;
    public final qdx d;
    public final qme0 e;

    public hww0(dne0 dne0Var) {
        cne0 a = dne0Var.a("SurgeWidgetOnBoardingRepository");
        this.b = new AtomicBoolean(false);
        this.c = new qdx(0, a, a, "shown_count");
        this.d = new qdx(0, a, a, "usage_count");
        this.e = new qme0(0, a, a, "surge_info_widget_click");
    }
}
