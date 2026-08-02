package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xsna.eu;
import xsna.o23;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes11.dex */
public final class x2p0 extends eu {
    public final androidx.appcompat.widget.d a;
    public final Window.Callback b;
    public final e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList<eu.b> g = new ArrayList<>();
    public final a h = new a();

    /* compiled from: ToolbarActionBar.java */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            x2p0 x2p0Var = x2p0.this;
            Window.Callback callback = x2p0Var.b;
            Menu x = x2p0Var.x();
            androidx.appcompat.view.menu.f fVar = x instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) x : null;
            if (fVar != null) {
                fVar.w();
            }
            try {
                x.clear();
                if (callback.onCreatePanelMenu(0, x)) {
                    if (!callback.onPreparePanel(0, null, x)) {
                    }
                    if (fVar == null) {
                        fVar.v();
                        return;
                    }
                    return;
                }
                x.clear();
                if (fVar == null) {
                }
            } catch (Throwable th) {
                if (fVar != null) {
                    fVar.v();
                }
                throw th;
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    public class b implements Toolbar.h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return x2p0.this.b.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar.java */
    public final class c implements j.a {
        public boolean b;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(@NonNull androidx.appcompat.view.menu.f fVar, boolean z) {
            if (this.b) {
                return;
            }
            this.b = true;
            x2p0 x2p0Var = x2p0.this;
            x2p0Var.a.l();
            x2p0Var.b.onPanelClosed(108, fVar);
            this.b = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.f fVar) {
            x2p0.this.b.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    public final class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void a(@NonNull androidx.appcompat.view.menu.f fVar) {
            x2p0 x2p0Var = x2p0.this;
            Window.Callback callback = x2p0Var.b;
            ActionMenuView actionMenuView = x2p0Var.a.a.b;
            if (actionMenuView != null && actionMenuView.o()) {
                callback.onPanelClosed(108, fVar);
            } else if (callback.onPreparePanel(0, null, fVar)) {
                callback.onMenuOpened(108, fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.f fVar, @NonNull MenuItem menuItem) {
            return false;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    public class e implements o23.c {
        public e() {
        }

        public final View a(int i) {
            if (i == 0) {
                return new View(x2p0.this.a.a.getContext());
            }
            return null;
        }

        public final void b(int i) {
            if (i == 0) {
                x2p0 x2p0Var = x2p0.this;
                if (x2p0Var.d) {
                    return;
                }
                x2p0Var.a.l = true;
                x2p0Var.d = true;
            }
        }
    }

    public x2p0(@NonNull Toolbar toolbar, @Nullable CharSequence charSequence, @NonNull Window.Callback callback) {
        b bVar = new b();
        toolbar.getClass();
        androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d(toolbar, false);
        this.a = dVar;
        callback.getClass();
        this.b = callback;
        dVar.k = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        dVar.setWindowTitle(charSequence);
        this.c = new e();
    }

    @Override // xsna.eu
    public final boolean a() {
        return this.a.a();
    }

    @Override // xsna.eu
    public final boolean b() {
        androidx.appcompat.widget.d dVar = this.a;
        Toolbar.f fVar = dVar.a.N;
        if (fVar == null || fVar.c == null) {
            return false;
        }
        dVar.collapseActionView();
        return true;
    }

    @Override // xsna.eu
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList<eu.b> arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // xsna.eu
    public final int d() {
        return this.a.b;
    }

    @Override // xsna.eu
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // xsna.eu
    public final boolean f() {
        androidx.appcompat.widget.d dVar = this.a;
        Toolbar toolbar = dVar.a;
        a aVar = this.h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = dVar.a;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        toolbar2.postOnAnimation(aVar);
        return true;
    }

    @Override // xsna.eu
    public final void h() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // xsna.eu
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu x = x();
        if (x == null) {
            return false;
        }
        x.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return x.performShortcut(i, keyEvent, 0);
    }

    @Override // xsna.eu
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // xsna.eu
    public final boolean k() {
        ActionMenuView actionMenuView = this.a.a.b;
        return actionMenuView != null && actionMenuView.r();
    }

    @Override // xsna.eu
    public final void l(@Nullable ColorDrawable colorDrawable) {
        this.a.a.setBackground(colorDrawable);
    }

    @Override // xsna.eu
    public final void n(boolean z) {
        int i = z ? 4 : 0;
        androidx.appcompat.widget.d dVar = this.a;
        dVar.h((i & 4) | (dVar.b & (-5)));
    }

    @Override // xsna.eu
    public final void o(boolean z) {
        int i = z ? 2 : 0;
        androidx.appcompat.widget.d dVar = this.a;
        dVar.h((i & 2) | (dVar.b & (-3)));
    }

    @Override // xsna.eu
    public final void p() {
        this.a.j(R.string.accessibility_back);
    }

    @Override // xsna.eu
    public final void q() {
        this.a.s();
    }

    @Override // xsna.eu
    public final void r(Drawable drawable) {
        this.a.o(drawable);
    }

    @Override // xsna.eu
    public final void t(String str) {
        this.a.p(str);
    }

    @Override // xsna.eu
    public final void u(String str) {
        this.a.setTitle(str);
    }

    @Override // xsna.eu
    public final void v(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public final Menu x() {
        boolean z = this.e;
        androidx.appcompat.widget.d dVar = this.a;
        if (!z) {
            c cVar = new c();
            d dVar2 = new d();
            Toolbar toolbar = dVar.a;
            toolbar.O = cVar;
            toolbar.P = dVar2;
            ActionMenuView actionMenuView = toolbar.b;
            if (actionMenuView != null) {
                actionMenuView.v = cVar;
                actionMenuView.w = dVar2;
            }
            this.e = true;
        }
        return dVar.a.getMenu();
    }

    @Override // xsna.eu
    public final void g() {
    }

    @Override // xsna.eu
    public final void m(boolean z) {
    }

    @Override // xsna.eu
    public final void s(boolean z) {
    }
}
