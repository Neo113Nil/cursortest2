package defpackage;

import com.yandex.mapkit.navigation.transport.layer.NavigationLayer;

/* loaded from: classes7.dex */
public final class msv extends q35 {
    public final /* synthetic */ int c = 0;
    public final ini0 d;
    public final fni0 e;
    public Object f;

    public msv(ssr ssrVar, eu00 eu00Var, ini0 ini0Var) {
        super(ssrVar, "indoor_state_listener");
        this.e = eu00Var;
        this.d = ini0Var;
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.e;
        switch (i) {
            case 0:
                lsv lsvVar = (lsv) this.f;
                if (lsvVar != null) {
                    ((au00) ((eu00) fni0Var).a).getMapWindow().getMap().removeIndoorStateListener(lsvVar);
                }
                this.f = null;
                break;
            default:
                f011 f011Var = (f011) this.f;
                if (f011Var != null) {
                    ((NavigationLayer) ((h311) fni0Var).a).removeBalloonViewListener(f011Var);
                    this.f = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.q35
    public final void b(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.e;
        switch (i) {
            case 0:
                lsv lsvVar = new lsv(this);
                ((au00) ((eu00) fni0Var).a).getMapWindow().getMap().addIndoorStateListener(lsvVar);
                this.f = lsvVar;
                break;
            default:
                f011 f011Var = new f011(this);
                ((NavigationLayer) ((h311) fni0Var).a).addBalloonViewListener(f011Var);
                this.f = f011Var;
                break;
        }
    }

    public msv(ssr ssrVar, ini0 ini0Var, h311 h311Var) {
        super(ssrVar, "transport_balloon_view_listener");
        this.d = ini0Var;
        this.e = h311Var;
    }
}
