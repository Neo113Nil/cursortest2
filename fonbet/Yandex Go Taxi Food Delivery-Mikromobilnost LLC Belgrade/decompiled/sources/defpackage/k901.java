package defpackage;

import com.yandex.mapkit.traffic.TrafficLayer;

/* loaded from: classes7.dex */
public final class k901 extends q35 {
    public final /* synthetic */ int c = 1;
    public final fni0 d;
    public Object e;

    public k901(ssr ssrVar, eu00 eu00Var) {
        super(ssrVar, "map_window_size_change_listener");
        this.d = eu00Var;
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.d;
        switch (i) {
            case 0:
                j901 j901Var = (j901) this.e;
                if (j901Var != null) {
                    ((TrafficLayer) ((y801) fni0Var).a).removeTrafficListener(j901Var);
                    this.e = null;
                    break;
                }
                break;
            default:
                ox0 ox0Var = (ox0) this.e;
                if (ox0Var != null) {
                    ((au00) ((eu00) fni0Var).a).getMapWindow().removeSizeChangedListener(ox0Var);
                    this.e = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.q35
    public final void b(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.d;
        switch (i) {
            case 0:
                j901 j901Var = new j901(0, this);
                ((TrafficLayer) ((y801) fni0Var).a).addTrafficListener(j901Var);
                this.e = j901Var;
                break;
            default:
                ox0 ox0Var = new ox0(3, this);
                ((au00) ((eu00) fni0Var).a).getMapWindow().addSizeChangedListener(ox0Var);
                this.e = ox0Var;
                break;
        }
    }

    public k901(ssr ssrVar, y801 y801Var) {
        super(ssrVar, "traffic_changes");
        this.d = y801Var;
    }
}
