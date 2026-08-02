package defpackage;

import android.os.Handler;
import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.CameraUpdateReason;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes7.dex */
public final class jr7 extends q35 {
    public final eu00 c;
    public final h0z0 d;
    public final i3y e;
    public CameraUpdateReason f;
    public Boolean g;

    public jr7(ssr ssrVar, eu00 eu00Var) {
        super(ssrVar, "map_camera_positions");
        this.c = eu00Var;
        this.d = new h0z0(0);
        this.e = a.b(LazyThreadSafetyMode.NONE, new rk6(10, this));
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        ((au00) this.c.a).getMapWindow().getMap().removeCameraListener((CameraListener) this.e.getValue());
        this.f = null;
        this.g = null;
        h0z0 h0z0Var = this.d;
        h0z0Var.d = 0L;
        h0z0Var.c = null;
        ((Handler) h0z0Var.b.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // defpackage.q35
    public final void b(Object obj) {
        ((au00) this.c.a).getMapWindow().getMap().addCameraListener((CameraListener) this.e.getValue());
    }
}
