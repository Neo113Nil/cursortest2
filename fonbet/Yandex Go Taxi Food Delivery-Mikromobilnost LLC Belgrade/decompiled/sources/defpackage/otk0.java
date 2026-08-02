package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import ru.yandex.taxi.preorder.tollroad.TollRoadsListItem;

/* loaded from: classes6.dex */
public final class otk0 {
    public final ViewGroup a;
    public final pxy0 b;
    public final ArrayList c = new ArrayList();

    public otk0(ViewGroup viewGroup, pxy0 pxy0Var) {
        this.a = viewGroup;
        this.b = pxy0Var;
    }

    public final void a(TollRoadsListItem tollRoadsListItem, ntk0 ntk0Var) {
        boolean z = false;
        tollRoadsListItem.setUseAutoAccessibilityDelegate(false);
        tollRoadsListItem.setTrailText(ntk0Var.d);
        tollRoadsListItem.setTitle(ntk0Var.c);
        tollRoadsListItem.setSubtitle(ntk0Var.e);
        boolean z2 = ntk0Var.i;
        tollRoadsListItem.setIsLoading(z2);
        boolean z3 = ntk0Var.j;
        tollRoadsListItem.setEnabled(z3);
        tollRoadsListItem.setTextStyle(z3, z2);
        tollRoadsListItem.setDebounceClickListener(new xmf0(27, this, ntk0Var));
        boolean z4 = ntk0Var.b;
        if (!z4 && z3) {
            z = true;
        }
        tollRoadsListItem.setClickable(z);
        tollRoadsListItem.setChecked(z4);
    }
}
