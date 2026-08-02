package defpackage;

import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.guidance_camera.Camera;

/* loaded from: classes7.dex */
public final class kmj extends q35 {
    public final /* synthetic */ int c = 1;
    public final fni0 d;
    public Object e;

    public kmj(ssr ssrVar, f4u f4uVar) {
        super(ssrVar, "guidance_camera_listener");
        this.d = f4uVar;
    }

    @Override // defpackage.q35
    public final void a(Object obj) {
        int i = this.c;
        fni0 fni0Var = this.d;
        switch (i) {
            case 0:
                jmj jmjVar = (jmj) this.e;
                if (jmjVar != null) {
                    ((Navigation) ((fmj) fni0Var).a).removeListener(jmjVar);
                    this.e = null;
                    break;
                }
                break;
            default:
                g4u g4uVar = (g4u) this.e;
                if (g4uVar != null) {
                    ((Camera) ((f4u) fni0Var).a).removeListener(g4uVar);
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
                jmj jmjVar = new jmj(this);
                ((Navigation) ((fmj) fni0Var).a).addListener(jmjVar);
                this.e = jmjVar;
                break;
            default:
                g4u g4uVar = new g4u(0, this);
                ((Camera) ((f4u) fni0Var).a).addListener(g4uVar);
                this.e = g4uVar;
                break;
        }
    }

    public kmj(ssr ssrVar, fmj fmjVar) {
        super(ssrVar, "directions_navigation_listener");
        this.d = fmjVar;
    }
}
