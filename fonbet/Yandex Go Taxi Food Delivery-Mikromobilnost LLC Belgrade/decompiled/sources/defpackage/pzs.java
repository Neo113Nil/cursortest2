package defpackage;

import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;

/* loaded from: classes7.dex */
public final class pzs extends q35 {
    public final /* synthetic */ int c = 0;
    public final ini0 d;
    public final fni0 e;
    public Object f;

    public pzs(ssr ssrVar, eu00 eu00Var, ini0 ini0Var) {
        super(ssrVar, "geo_object_tap_listener");
        this.e = eu00Var;
        this.d = ini0Var;
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.e;
        switch (i) {
            case 0:
                ozs ozsVar = (ozs) this.f;
                if (ozsVar != null) {
                    ((au00) ((eu00) fni0Var).a).getMapWindow().getMap().removeTapListener(ozsVar);
                    this.f = null;
                    break;
                }
                break;
            default:
                dmj dmjVar = (dmj) this.f;
                if (dmjVar != null) {
                    ((NavigationLayer) ((gmj) fni0Var).a).removeBalloonViewListener(dmjVar);
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
                ozs ozsVar = new ozs(this);
                ((au00) ((eu00) fni0Var).a).getMapWindow().getMap().addTapListener(ozsVar);
                this.f = ozsVar;
                break;
            default:
                dmj dmjVar = new dmj(this);
                ((NavigationLayer) ((gmj) fni0Var).a).addBalloonViewListener(dmjVar);
                this.f = dmjVar;
                break;
        }
    }

    public pzs(ssr ssrVar, ini0 ini0Var, gmj gmjVar) {
        super(ssrVar, "directions_navigation_layer_balloon_view_listener");
        this.d = ini0Var;
        this.e = gmjVar;
    }
}
