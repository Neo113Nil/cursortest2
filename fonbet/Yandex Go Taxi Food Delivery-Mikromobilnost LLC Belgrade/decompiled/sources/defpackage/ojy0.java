package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class ojy0 {
    public final sls a;
    public final zii0 b;
    public final sls c;
    public final sls d;
    public final sls e;
    public final sls f;
    public final sls g;

    public ojy0(int i, sls slsVar) {
        this.a = (i & 1) != 0 ? null : slsVar;
        this.b = zii0.e;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public static void a(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.c()).setShowAsAction(1);
    }

    public static void b(Menu menu, MenuItemOption menuItemOption, sls slsVar) {
        if (slsVar != null && menu.findItem(menuItemOption.getId()) == null) {
            a(menu, menuItemOption);
        } else {
            if (slsVar != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final boolean c(ActionMode actionMode, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            sls slsVar = this.c;
            if (slsVar != null) {
                slsVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            sls slsVar2 = this.d;
            if (slsVar2 != null) {
                slsVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            sls slsVar3 = this.e;
            if (slsVar3 != null) {
                slsVar3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            sls slsVar4 = this.f;
            if (slsVar4 != null) {
                slsVar4.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            sls slsVar5 = this.g;
            if (slsVar5 != null) {
                slsVar5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final void d(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            ny61.g("onCreateActionMode requires a non-null menu");
            return;
        }
        if (actionMode == null) {
            ny61.g("onCreateActionMode requires a non-null mode");
            return;
        }
        if (this.c != null) {
            a(menu, MenuItemOption.Copy);
        }
        if (this.d != null) {
            a(menu, MenuItemOption.Paste);
        }
        if (this.e != null) {
            a(menu, MenuItemOption.Cut);
        }
        if (this.f != null) {
            a(menu, MenuItemOption.SelectAll);
        }
        if (this.g != null) {
            a(menu, MenuItemOption.Autofill);
        }
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        b(menu, MenuItemOption.Copy, this.c);
        b(menu, MenuItemOption.Paste, this.d);
        b(menu, MenuItemOption.Cut, this.e);
        b(menu, MenuItemOption.SelectAll, this.f);
        b(menu, MenuItemOption.Autofill, this.g);
        return true;
    }

    public ojy0() {
        this(HProv.PP_VERSION_TIMESTAMP, null);
    }
}
