package defpackage;

import android.view.View;
import com.yandex.go.slot.api.ui.SlotItemUiState$Size;

/* loaded from: classes14.dex */
public final class djk0 implements ejk0 {
    public final yss0 a;
    public final p9y0 b;

    public djk0(yss0 yss0Var, p9y0 p9y0Var) {
        this.a = yss0Var;
        this.b = p9y0Var;
    }

    @Override // defpackage.ejk0
    public final void a(tss0 tss0Var, wrs0 wrs0Var) {
        this.a.renderTrail(tss0Var, new cjk0(this, wrs0Var, 1));
    }

    @Override // defpackage.ejk0
    public final View asView() {
        return this.a.asView();
    }

    @Override // defpackage.ejk0
    public final void b(xss0 xss0Var, boolean z, kdc kdcVar, wrs0 wrs0Var) {
        renderLead(xss0Var.a);
        renderBody(xss0Var.b);
        a(xss0Var.c, wrs0Var);
        setAction(xss0Var.d, wrs0Var);
        setColor(kdcVar);
        renderLoading(z);
        setSize(xss0Var.e);
    }

    @Override // defpackage.ejk0
    public final void renderBody(css0 css0Var) {
        this.a.renderBody(css0Var);
    }

    @Override // defpackage.ejk0
    public final void renderLead(gss0 gss0Var) {
        this.a.renderLead(gss0Var);
    }

    @Override // defpackage.ejk0
    public final void renderLoading(boolean z) {
        this.a.renderLoading(z);
    }

    @Override // defpackage.ejk0
    public final void setAction(nqs0 nqs0Var, wrs0 wrs0Var) {
        this.a.setAction(nqs0Var, new cjk0(this, wrs0Var, 0));
    }

    @Override // defpackage.ejk0
    public final void setColor(kdc kdcVar) {
        this.a.setColor(kdcVar);
    }

    @Override // defpackage.ejk0
    public final void setSize(SlotItemUiState$Size slotItemUiState$Size) {
        this.a.setSize(slotItemUiState$Size);
    }

    @Override // defpackage.ejk0
    public final void setSwitchTrailChecked(boolean z) {
        this.a.setSwitchTrailChecked(z);
    }
}
