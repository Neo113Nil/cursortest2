package defpackage;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cxl {
    public static Bundle a(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map) {
        Bundle bundle = new Bundle(6);
        if (u1mVar != null) {
            bundle.putBundle("query", hk91.c(u1mVar));
        }
        if (ywlVar != null) {
            bundle.putString("document_label", h3m.b.b(ywlVar));
        }
        bundle.putBoolean("fullscreen", z);
        bundle.putBoolean("close_on_tap_outside", z2);
        bundle.putBoolean("close_on_slide_down", z3);
        bundle.putBoolean("dim_background", z4);
        if (f != null) {
            bundle.putFloat("default_height", f.floatValue());
        }
        bundle.putBoolean("should_load_by_query", z5);
        c9y.h(bundle, map);
        return bundle;
    }
}
