package defpackage;

import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;

/* loaded from: classes15.dex */
public final class mmj extends q35 {
    public final /* synthetic */ int c = 1;
    public final fni0 d;
    public Object e;

    public mmj(ssr ssrVar, gmj gmjVar) {
        super(ssrVar, "request_point_listener");
        this.d = gmjVar;
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.d;
        switch (i) {
            case 0:
                lmj lmjVar = (lmj) this.e;
                if (lmjVar != null) {
                    ((NavigationLayer) ((gmj) fni0Var).a).removeRequestPointListener(lmjVar);
                    this.e = null;
                    break;
                }
                break;
            default:
                b0w b0wVar = (b0w) this.e;
                if (b0wVar != null) {
                    ((au00) ((eu00) fni0Var).a).getMapWindow().getMap().removeInputListener(b0wVar);
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
                lmj lmjVar = new lmj(this);
                this.e = lmjVar;
                ((NavigationLayer) ((gmj) fni0Var).a).addRequestPointListener(lmjVar);
                break;
            default:
                b0w b0wVar = new b0w(0, this);
                ((au00) ((eu00) fni0Var).a).getMapWindow().getMap().addInputListener(b0wVar);
                this.e = b0wVar;
                break;
        }
    }

    public mmj(ssr ssrVar, eu00 eu00Var) {
        super(ssrVar, "input_listener_events");
        this.d = eu00Var;
    }
}
