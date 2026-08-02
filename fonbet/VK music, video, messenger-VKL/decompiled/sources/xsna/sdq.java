package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import xsna.buu;
import xsna.v2s;

/* compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
/* loaded from: classes12.dex */
public final class sdq {
    public static buu a(frx0 frx0Var, FoldingFeature foldingFeature) {
        buu.a aVar;
        v2s.b bVar;
        int type = foldingFeature.getType();
        if (type == 1) {
            aVar = buu.a.b;
        } else {
            if (type != 2) {
                return null;
            }
            aVar = buu.a.c;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar = v2s.b.b;
        } else {
            if (state != 2) {
                return null;
            }
            bVar = v2s.b.c;
        }
        aa8 aa8Var = new aa8(foldingFeature.getBounds());
        Rect c = frx0Var.a.c();
        if (aa8Var.a() == 0 && aa8Var.b() == 0) {
            return null;
        }
        if (aa8Var.b() != c.width() && aa8Var.a() != c.height()) {
            return null;
        }
        if (aa8Var.b() < c.width() && aa8Var.a() < c.height()) {
            return null;
        }
        if (aa8Var.b() == c.width() && aa8Var.a() == c.height()) {
            return null;
        }
        return new buu(new aa8(foldingFeature.getBounds()), aVar, bVar);
    }

    public static erx0 b(Context context, WindowLayoutInfo windowLayoutInfo) {
        hrx0 hrx0Var = new hrx0();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return c(hrx0Var.a(context), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return c((i >= 34 ? krx0.a : i >= 30 ? jrx0.a : lrx0.a).b((Activity) context, hrx0Var.b), windowLayoutInfo);
    }

    public static erx0 c(frx0 frx0Var, WindowLayoutInfo windowLayoutInfo) {
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            buu a = foldingFeature instanceof FoldingFeature ? a(frx0Var, foldingFeature) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new erx0(arrayList);
    }
}
