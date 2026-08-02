package xsna;

import android.view.View;
import com.vk.core.dynamic_loader.DynamicLib;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.stats.dynamiclib.DynamicLibEvent;
import com.vkontakte.android.R;

/* compiled from: DynamicLibReporterListener.kt */
/* loaded from: classes11.dex */
public final class gqo implements vpo {
    public static final gqo a = new gqo();
    public static final gqo b = new gqo();

    public static final f5z e(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            f5z f5zVar = tag instanceof f5z ? (f5z) tag : null;
            if (f5zVar != null) {
                return f5zVar;
            }
            Object m = fvr.m(view);
            view = m instanceof View ? (View) m : null;
        }
        return null;
    }

    public static final void f(View view, f5z f5zVar) {
        view.setTag(R.id.view_tree_lifecycle_owner, f5zVar);
    }

    @Override // xsna.vpo
    public void a(DynamicTask dynamicTask, int i, long j) {
        for (DynamicLib dynamicLib : dynamicTask.i()) {
            int i2 = fqo.b;
            fqo.a(dynamicLib.i(), DynamicLibEvent.ERROR);
        }
    }

    @Override // xsna.vpo
    public void b(DynamicTask dynamicTask, int i, long j) {
        for (DynamicLib dynamicLib : dynamicTask.i()) {
            int i2 = fqo.b;
            fqo.a(dynamicLib.i(), DynamicLibEvent.CANCEL);
        }
    }

    @Override // xsna.vpo
    public void c(DynamicTask dynamicTask, int i) {
        for (DynamicLib dynamicLib : dynamicTask.i()) {
            int i2 = fqo.b;
            fqo.a(dynamicLib.i(), DynamicLibEvent.START);
        }
    }

    @Override // xsna.vpo
    public void d(DynamicTask dynamicTask, int i, long j) {
        for (DynamicLib dynamicLib : dynamicTask.i()) {
            int i2 = fqo.b;
            fqo.a(dynamicLib.i(), DynamicLibEvent.SUCCESS);
        }
    }
}
