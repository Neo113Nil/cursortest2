package yads;

import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final class eh2 implements PopupMenu.OnMenuItemClickListener {
    public final za a;
    public final List b;
    public final lv c;
    public final v02 d;

    public eh2(za zaVar, List list, lv lvVar, v02 v02Var) {
        this.a = zaVar;
        this.b = list;
        this.c = lvVar;
        this.d = v02Var;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.b.size()) {
            return true;
        }
        za.a(this.a, ((gu0) this.b.get(itemId)).b, o93.c);
        lv lvVar = this.c;
        dp2 dp2Var = dp2.v;
        lvVar.getClass();
        lvVar.d.a(lvVar.a(dp2Var, new HashMap()));
        this.d.a.a();
        return true;
    }
}
