package androidx.camera.extensions.internal.sessionprocessor;

import androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor;
import defpackage.o3;
import defpackage.q6x0;
import defpackage.sgb1;
import defpackage.vjx;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class g implements StillCaptureProcessor.OnCaptureResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;
    public final /* synthetic */ q6x0 c;
    public final /* synthetic */ h d;

    public g(int i, o3 o3Var, q6x0 q6x0Var, h hVar) {
        this.d = hVar;
        this.a = i;
        this.b = o3Var;
        this.c = q6x0Var;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onCaptureCompleted(long j, List list) {
        if (this.d.B) {
            vjx vjxVar = new vjx(j, this.c, (Map) h.t(list));
            o3 o3Var = this.b;
            o3Var.c = vjxVar;
            o3Var.c();
        }
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onCaptureProcessProgressed(int i) {
        this.b.onCaptureProcessProgressed(i);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onError(Exception exc) {
        this.b.g();
        this.d.u = false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback
    public final void onProcessCompleted() {
        long longValue;
        h hVar = this.d;
        if (!hVar.B) {
            int i = this.a;
            synchronized (hVar.e) {
                try {
                    Long l = (Long) hVar.x.get(Integer.valueOf(i));
                    if (l == null) {
                        longValue = -1;
                    } else {
                        hVar.x.remove(Integer.valueOf(i));
                        longValue = l.longValue();
                    }
                } finally {
                }
            }
            if (longValue == -1) {
                sgb1.d("BasicSessionProcessor", "Cannot get timestamp for the capture result");
                this.b.g();
                this.d.u = false;
                return;
            } else {
                o3 o3Var = this.b;
                o3Var.c = new vjx(longValue, this.c, Collections.EMPTY_MAP);
                o3Var.c();
            }
        }
        this.d.u = false;
    }
}
