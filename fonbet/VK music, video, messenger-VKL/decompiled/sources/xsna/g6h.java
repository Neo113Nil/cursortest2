package xsna;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.vk.writebar.WriteBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class g6h implements PopupMenu.OnMenuItemClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g6h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.b) {
            case 0:
                ((h6h) this.c).i.invoke(Boolean.valueOf(menuItem.getItemId() == 0));
                break;
            default:
                u3g0 u3g0Var = (u3g0) this.c;
                m3g0 m3g0Var = u3g0Var.c;
                if (m3g0Var != null) {
                    m3g0Var.I1();
                }
                WriteBar writeBar = u3g0Var.e;
                if (writeBar != null && writeBar.e()) {
                    ner0 G = u3g0Var.G();
                    WriteBar writeBar2 = u3g0Var.e;
                    if (writeBar2 != null) {
                        writeBar2.f(new r3g0(G, u3g0Var, true, false), new m50(G, 6));
                        break;
                    }
                } else {
                    m3g0 m3g0Var2 = u3g0Var.c;
                    if (m3g0Var2 != null) {
                        m3g0Var2.i1(true, false);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
