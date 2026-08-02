package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import defpackage.hxk0;
import defpackage.xm2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class g {
    public final OrientationEventListener b;
    public final Object a = new Object();
    public final HashMap c = new HashMap();

    public g(final Context context) {
        this.b = new OrientationEventListener(context) { // from class: androidx.camera.view.RotationProvider$1
            private static final int INVALID_SURFACE_ROTATION = -1;
            private int mRotation = -1;

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                ArrayList arrayList;
                if (i == -1) {
                    return;
                }
                int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
                if (this.mRotation != i2) {
                    this.mRotation = i2;
                    synchronized (g.this.a) {
                        arrayList = new ArrayList(g.this.c.values());
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        hxk0 hxk0Var = (hxk0) it.next();
                        hxk0Var.b.execute(new xm2(hxk0Var, i2, 15));
                    }
                }
            }
        };
    }
}
