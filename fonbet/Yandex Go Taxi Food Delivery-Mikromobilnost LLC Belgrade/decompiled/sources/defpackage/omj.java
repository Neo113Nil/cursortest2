package defpackage;

import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import com.yandex.mapkit.search.advert_layer.AdvertLayer;

/* loaded from: classes7.dex */
public final class omj extends q35 {
    public final /* synthetic */ int c = 0;
    public final ini0 d;
    public final fni0 e;
    public Object f;

    public omj(ssr ssrVar, ini0 ini0Var, gmj gmjVar) {
        super(ssrVar, "directions_navigation_layer_route_view_listener");
        this.d = ini0Var;
        this.e = gmjVar;
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.e;
        switch (i) {
            case 0:
                nmj nmjVar = (nmj) this.f;
                if (nmjVar != null) {
                    ((NavigationLayer) ((gmj) fni0Var).a).removeRouteViewListener(nmjVar);
                    this.f = null;
                    break;
                }
                break;
            default:
                pd1 pd1Var = (pd1) this.f;
                if (pd1Var != null) {
                    ((AdvertLayer) ((nd1) fni0Var).a).removeListener(pd1Var);
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
                nmj nmjVar = new nmj(this);
                ((NavigationLayer) ((gmj) fni0Var).a).addRouteViewListener(nmjVar);
                this.f = nmjVar;
                break;
            default:
                pd1 pd1Var = new pd1(this);
                ((AdvertLayer) ((nd1) fni0Var).a).addListener(pd1Var);
                this.f = pd1Var;
                break;
        }
    }

    public omj(ssr ssrVar, nd1 nd1Var, ini0 ini0Var) {
        super(ssrVar, "advert_layer_listener");
        this.e = nd1Var;
        this.d = ini0Var;
    }
}
