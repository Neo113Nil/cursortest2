package defpackage;

import com.yandex.go.taxi.cars.preorder.source.a;
import com.yandex.mapkit.ScreenRect;

/* loaded from: classes14.dex */
public final class n8h implements svp0 {
    public final a a;

    public n8h(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.svp0
    public final void attach() {
        this.a.Hg();
    }

    @Override // defpackage.svp0
    public final void b9(ScreenRect screenRect) {
    }

    @Override // defpackage.svp0
    public final void detach() {
        a aVar = this.a;
        c09 c09Var = aVar.c;
        c09Var.Cg();
        xm00 xm00Var = aVar.A;
        if (xm00Var != null) {
            xm00Var.d();
            aVar.A = null;
        }
        c09Var.x.a();
    }

    @Override // defpackage.svp0
    public final void pause() {
        a aVar = this.a;
        aVar.z = false;
        aVar.Ig();
    }

    @Override // defpackage.svp0
    public final void resume() {
        a aVar = this.a;
        aVar.z = true;
        if (aVar.y) {
            aVar.Jg();
        }
    }

    @Override // defpackage.svp0
    public final void setVisible(boolean z) {
        a aVar = this.a;
        if (aVar.y == z) {
            return;
        }
        aVar.y = z;
        xm00 xm00Var = aVar.A;
        if (xm00Var != null) {
            xm00Var.i(z);
        }
        if (aVar.z && z) {
            aVar.Jg();
        } else {
            aVar.Ig();
        }
    }
}
