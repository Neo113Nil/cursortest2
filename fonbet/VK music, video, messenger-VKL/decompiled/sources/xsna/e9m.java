package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;

/* compiled from: DialogActionsVcByView.kt */
/* loaded from: classes2.dex */
public class e9m implements z8m {
    public final ViewGroup a;
    public final kkm b;
    public View c;
    public View d;
    public ViewGroup e;
    public DialogActionsListView f;
    public wym g;
    public aez h;
    public boolean i;

    public e9m(ViewGroup viewGroup, kkm kkmVar) {
        this.a = viewGroup;
        this.b = kkmVar;
    }

    @Override // xsna.z8m
    public boolean a(boolean z) {
        throw null;
    }

    @Override // xsna.z8m
    public final void destroy() {
        a(false);
    }

    @Override // xsna.z8m
    public final boolean isVisible() {
        if (!this.i) {
            return false;
        }
        wym wymVar = this.g;
        if (wymVar == null) {
            wymVar = null;
        }
        if (wymVar.b()) {
            return true;
        }
        aez aezVar = this.h;
        return (aezVar != null ? aezVar : null).isVisible();
    }
}
