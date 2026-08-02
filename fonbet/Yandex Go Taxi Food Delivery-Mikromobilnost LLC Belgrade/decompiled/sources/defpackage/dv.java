package defpackage;

import android.view.View;
import com.yandex.go.shortcuts.impl.ui.shortcutview.a;
import com.yandex.go.shortcuts.impl.view.adapter.j;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class dv implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c1f b;
    public final /* synthetic */ n170 c;
    public final /* synthetic */ t4s0 w;
    public final /* synthetic */ c x;
    public final /* synthetic */ j1s0 y;
    public final /* synthetic */ a z;

    public /* synthetic */ dv(c1f c1fVar, n170 n170Var, t4s0 t4s0Var, c cVar, j1s0 j1s0Var, a aVar) {
        this.b = c1fVar;
        this.c = n170Var;
        this.w = t4s0Var;
        this.x = cVar;
        this.y = j1s0Var;
        this.z = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new ev(this.b, this.c, this.y, this.w, (View) obj, this.z, this.x);
            default:
                return new j(this.b, this.c, this.y, this.w, (View) obj, this.z, this.x);
        }
    }

    public /* synthetic */ dv(a aVar, t4s0 t4s0Var, c1f c1fVar, n170 n170Var, c cVar, j1s0 j1s0Var) {
        this.z = aVar;
        this.w = t4s0Var;
        this.b = c1fVar;
        this.c = n170Var;
        this.x = cVar;
        this.y = j1s0Var;
    }
}
