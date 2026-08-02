package xsna;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import java.util.LinkedHashSet;

/* compiled from: LessPriorityCodecsContainer.kt */
@ozl
/* loaded from: classes2.dex */
public final class g2z implements iui0 {
    public final Object b;

    public /* synthetic */ g2z(Object obj) {
        this.b = obj;
    }

    public void a(m420 m420Var) {
        o420 o420Var = (o420) this.b;
        if (m420Var.a.isEmpty() && m420Var.c) {
            o420Var.g = false;
            o420Var.e();
            return;
        }
        CoordinatorLayout coordinatorLayout = o420Var.e;
        if (coordinatorLayout == null) {
            coordinatorLayout = null;
        }
        zmp0.a(coordinatorLayout, new wra());
        o420Var.g = true;
        o420Var.e();
    }

    @Override // xsna.iui0
    public /* synthetic */ void onSessionEnded(ssi0 ssi0Var, int i) {
        ((ExpandedControllerActivity) this.b).finish();
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionEnding(ssi0 ssi0Var) {
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionResumeFailed(ssi0 ssi0Var, int i) {
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionResumed(ssi0 ssi0Var, boolean z) {
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionResuming(ssi0 ssi0Var, String str) {
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionStartFailed(ssi0 ssi0Var, int i) {
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionStarted(ssi0 ssi0Var, String str) {
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionStarting(ssi0 ssi0Var) {
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionSuspended(ssi0 ssi0Var, int i) {
    }

    public g2z() {
        this.b = new LinkedHashSet();
    }
}
