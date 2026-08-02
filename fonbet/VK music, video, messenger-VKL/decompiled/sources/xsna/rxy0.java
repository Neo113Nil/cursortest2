package xsna;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RelativeLayout;
import xsna.jaz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class rxy0 implements jaz0 {
    public final jaz0.a b;
    public final zyy0 c;
    public fvy0 d;
    public z9z0 e = new y9z0();

    public rxy0(zyy0 zyy0Var, jaz0.a aVar) {
        this.c = zyy0Var;
        this.b = aVar;
    }

    public final void a(p0z0 p0z0Var) {
        kiw kiwVar = p0z0Var.d0;
        kiw kiwVar2 = p0z0Var.c0;
        kiw kiwVar3 = p0z0Var.U;
        zyy0 zyy0Var = this.c;
        RelativeLayout.LayoutParams layoutParams = zyy0Var.c;
        wvy0 wvy0Var = zyy0Var.b;
        zyy0Var.i = kiwVar;
        zyy0Var.h = kiwVar2;
        Bitmap a = kiwVar3 != null ? kiwVar3.a() : null;
        if (a != null) {
            wvy0Var.a(a, true);
            int i = -wvy0Var.getMeasuredWidth();
            layoutParams.leftMargin = i;
            layoutParams.bottomMargin = i;
        }
        zyy0Var.a();
        zyy0Var.setAgeRestrictions(p0z0Var.h);
        zyy0Var.getImageView().setOnClickListener(new ekc(2, this, p0z0Var));
        zyy0Var.getImageView().setOnTouchListener(new s8z0(new a0m0(this, 14)));
        zyy0Var.getCloseButton().setOnClickListener(new ufg(3, this, p0z0Var));
        wty0 wty0Var = p0z0Var.L;
        if (wty0Var != null) {
            pxy0 pxy0Var = new pxy0(this, wty0Var);
            r5z0 r5z0Var = zyy0Var.g;
            r5z0Var.setVisibility(0);
            r5z0Var.setImageBitmap(wty0Var.a.a());
            r5z0Var.setOnClickListener(pxy0Var);
            if (wty0Var.c != null) {
                fvy0 fvy0Var = new fvy0(wty0Var, new mnh0());
                this.d = fvy0Var;
                fvy0Var.d = new qxy0(this, p0z0Var);
            }
        }
        this.b.j(p0z0Var, zyy0Var);
    }

    @Override // xsna.jaz0
    public final View getCloseButton() {
        return this.c.getCloseButton();
    }

    @Override // xsna.jaz0
    public final View i() {
        return this.c;
    }

    @Override // xsna.jaz0
    public final void destroy() {
    }

    @Override // xsna.jaz0
    public final void pause() {
    }

    @Override // xsna.jaz0
    public final void resume() {
    }

    @Override // xsna.jaz0
    public final void stop() {
    }
}
