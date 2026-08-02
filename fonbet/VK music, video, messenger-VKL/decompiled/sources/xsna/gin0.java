package xsna;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import xsna.g40;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes11.dex */
public final class gin0 extends ActionMode {
    public final Context a;
    public final g40 b;

    /* compiled from: SupportActionModeWrapper.java */
    public static class a implements g40.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<gin0> c = new ArrayList<>();
        public final dpj0<Menu, Menu> d = new dpj0<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // xsna.g40.a
        public final boolean a(g40 g40Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(g40Var), new t720(this.b, (nin0) menuItem));
        }

        @Override // xsna.g40.a
        public final boolean b(g40 g40Var, Menu menu) {
            gin0 e = e(g40Var);
            dpj0<Menu, Menu> dpj0Var = this.d;
            Menu menu2 = dpj0Var.get(menu);
            if (menu2 == null) {
                menu2 = new v820(this.b, (kin0) menu);
                dpj0Var.put(menu, menu2);
            }
            return this.a.onCreateActionMode(e, menu2);
        }

        @Override // xsna.g40.a
        public final boolean c(g40 g40Var, Menu menu) {
            gin0 e = e(g40Var);
            dpj0<Menu, Menu> dpj0Var = this.d;
            Menu menu2 = dpj0Var.get(menu);
            if (menu2 == null) {
                menu2 = new v820(this.b, (kin0) menu);
                dpj0Var.put(menu, menu2);
            }
            return this.a.onPrepareActionMode(e, menu2);
        }

        @Override // xsna.g40.a
        public final void d(g40 g40Var) {
            this.a.onDestroyActionMode(e(g40Var));
        }

        public final gin0 e(g40 g40Var) {
            ArrayList<gin0> arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gin0 gin0Var = arrayList.get(i);
                if (gin0Var != null && gin0Var.b == g40Var) {
                    return gin0Var;
                }
            }
            gin0 gin0Var2 = new gin0(this.b, g40Var);
            arrayList.add(gin0Var2);
            return gin0Var2;
        }
    }

    public gin0(Context context, g40 g40Var) {
        this.a = context;
        this.b = g40Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new v820(this.a, this.b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.c;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.n(i);
    }
}
