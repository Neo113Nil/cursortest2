package defpackage;

import android.view.View;
import com.yandex.div.core.view2.divs.widgets.a;
import com.yandex.div.core.view2.divs.widgets.b;
import com.yandex.div2.DivBorder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class nsk implements msk, ugk, ax01 {
    public m3k c;
    public aw5 w;
    public final /* synthetic */ b a = new b();
    public final /* synthetic */ cx01 b = new cx01();
    public final ArrayList x = new ArrayList();

    public final void a(int i, int i2) {
        a divBorderDrawer = this.a.getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.g();
        }
    }

    @Override // defpackage.msk
    public final aw5 getBindingContext() {
        return this.w;
    }

    @Override // defpackage.msk
    public final m3k getDiv() {
        return this.c;
    }

    @Override // defpackage.ugk
    public final a getDivBorderDrawer() {
        return this.a.a;
    }

    @Override // defpackage.ugk
    public final boolean getNeedClipping() {
        return this.a.b;
    }

    @Override // defpackage.uvo
    public final List getSubscriptions() {
        return this.x;
    }

    @Override // defpackage.ugk
    public final void invalidateBorder() {
        this.a.invalidateBorder();
    }

    @Override // defpackage.ax01
    public final boolean isTransient() {
        return this.b.isTransient();
    }

    @Override // defpackage.ugk
    public final void releaseBorderDrawer() {
        this.a.releaseBorderDrawer();
    }

    @Override // defpackage.msk
    public final void setBindingContext(aw5 aw5Var) {
        this.w = aw5Var;
    }

    @Override // defpackage.ugk
    public final void setBorder(aw5 aw5Var, DivBorder divBorder, View view) {
        this.a.setBorder(aw5Var, divBorder, view);
    }

    @Override // defpackage.msk
    public final void setDiv(m3k m3kVar) {
        this.c = m3kVar;
    }

    @Override // defpackage.ugk
    public final void setNeedClipping(boolean z) {
        this.a.setNeedClipping(z);
    }

    @Override // defpackage.ax01
    public final void transitionFinished(View view) {
        this.b.transitionFinished(view);
    }

    @Override // defpackage.ax01
    public final void transitionStarted(View view) {
        this.b.transitionStarted(view);
    }
}
