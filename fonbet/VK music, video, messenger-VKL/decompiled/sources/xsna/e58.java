package xsna;

import android.text.TextUtils;
import android.view.MenuItem;
import java.util.List;

/* compiled from: BottomNavigationButtonsState.kt */
/* loaded from: classes11.dex */
public final class e58 {
    public boolean a;
    public boolean b;
    public boolean c;
    public Integer d;
    public List<Integer> e;

    public final void a() {
        boolean z = false;
        boolean z2 = this.d != null;
        boolean z3 = iah0.f().widthPixels >= iah0.t(320);
        if (this.a && z3 && z2) {
            z = true;
        }
        this.c = z;
    }

    public final void b(j58 j58Var, MenuItem menuItem) {
        if (!TextUtils.isEmpty(menuItem.getTitle()) || this.e.contains(Integer.valueOf(menuItem.getItemId()))) {
            j58Var.setIconsMode(!this.c);
            j58Var.setIconSizeDp(28);
        } else {
            j58Var.setIconsMode(true);
            j58Var.setIconSizeDp(40);
        }
    }

    public final void c(j58 j58Var, MenuItem menuItem) {
        Integer num = this.d;
        if (!this.c || num == null) {
            j58Var.setStaticMode(false);
            j58Var.setTitle(null);
        } else {
            j58Var.setStaticMode(true);
            j58Var.setTitle(menuItem.getTitle());
            j58Var.setTextSize(num.intValue());
        }
    }
}
