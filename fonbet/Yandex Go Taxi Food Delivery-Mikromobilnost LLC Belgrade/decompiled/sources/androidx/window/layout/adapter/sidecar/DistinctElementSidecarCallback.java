package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.abs0;
import defpackage.bbs0;
import defpackage.jl40;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState b;
    public final bbs0 d;
    public final SidecarInterface.SidecarCallback e;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public DistinctElementSidecarCallback(bbs0 bbs0Var, SidecarInterface.SidecarCallback sidecarCallback) {
        this.d = bbs0Var;
        this.e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.a) {
            try {
                bbs0 bbs0Var = this.d;
                SidecarDeviceState sidecarDeviceState2 = this.b;
                bbs0Var.getClass();
                if (!jl40.l(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 != null) {
                        int a = abs0.a(sidecarDeviceState2);
                        int i = 0;
                        if (a < 0 || a > 4) {
                            a = 0;
                        }
                        int a2 = abs0.a(sidecarDeviceState);
                        if (a2 >= 0 && a2 <= 4) {
                            i = a2;
                        }
                    }
                    this.b = sidecarDeviceState;
                    this.e.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b;
        synchronized (this.a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.c.get(iBinder);
                this.d.getClass();
                if (jl40.l(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b = bbs0.b(abs0.b(sidecarWindowLayoutInfo2), abs0.b(sidecarWindowLayoutInfo));
                    }
                    b = false;
                }
                if (b) {
                    return;
                }
                this.c.put(iBinder, sidecarWindowLayoutInfo);
                this.e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
