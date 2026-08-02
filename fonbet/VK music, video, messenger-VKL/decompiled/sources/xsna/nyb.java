package xsna;

import android.view.MotionEvent;
import android.widget.PopupWindow;
import com.vk.im.ui.views.chat.QuickActionsListView;
import java.util.List;
import xsna.hfr;

/* compiled from: ChatQuickActionsComponent.kt */
/* loaded from: classes2.dex */
public final class nyb extends j8i {
    public final List<lse0> i;
    public erb j;
    public QuickActionsListView k;
    public a l;

    /* compiled from: ChatQuickActionsComponent.kt */
    public static final class a {
        public final lse0 a;
        public final mse0 b;

        public a(lse0 lse0Var, mse0 mse0Var) {
            this.a = lse0Var;
            this.b = mse0Var;
        }
    }

    public nyb(List list, erb erbVar) {
        this.i = list;
        this.j = erbVar;
    }

    @Override // xsna.j8i
    public final void M0() {
        N0();
        this.j = null;
    }

    @Override // xsna.j8i
    public final void N0() {
        QuickActionsListView quickActionsListView = this.k;
        if (quickActionsListView != null) {
            quickActionsListView.setVisibility(8);
        }
        Y0();
        this.k = null;
    }

    public final nse0 X0(MotionEvent motionEvent) {
        QuickActionsListView quickActionsListView = this.k;
        Object obj = null;
        if (quickActionsListView != null) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (f4m.b(quickActionsListView).contains(rawX, rawY)) {
                hfr.a aVar = new hfr.a(rli0.k(new jxt0(quickActionsListView), nse0.class));
                while (true) {
                    if (!aVar.hasNext()) {
                        break;
                    }
                    Object next = aVar.next();
                    if (f4m.b((nse0) next).contains(rawX, rawY)) {
                        obj = next;
                        break;
                    }
                }
                return (nse0) obj;
            }
        }
        return null;
    }

    public final void Y0() {
        a aVar = this.l;
        if (aVar == null) {
            return;
        }
        mse0 mse0Var = aVar.b;
        PopupWindow popupWindow = mse0Var.a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        mse0Var.a = null;
        this.l = null;
    }
}
