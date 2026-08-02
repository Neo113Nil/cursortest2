package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.h;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class nzt0 extends vw implements sj10 {
    public final MenuBuilder A;
    public final Context c;
    public final ActionBarContextView w;
    public final h x;
    public WeakReference y;
    public boolean z;

    public nzt0(Context context, ActionBarContextView actionBarContextView, h hVar) {
        this.c = context;
        this.w = actionBarContextView;
        this.x = hVar;
        MenuBuilder defaultShowAsAction = new MenuBuilder(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.A = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // defpackage.vw
    public final void a() {
        if (this.z) {
            return;
        }
        this.z = true;
        this.x.b(this);
    }

    @Override // defpackage.vw
    public final View b() {
        WeakReference weakReference = this.y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.vw
    public final MenuBuilder c() {
        return this.A;
    }

    @Override // defpackage.vw
    public final MenuInflater d() {
        return new SupportMenuInflater(this.w.getContext());
    }

    @Override // defpackage.vw
    public final CharSequence e() {
        return this.w.getSubtitle();
    }

    @Override // defpackage.vw
    public final CharSequence f() {
        return this.w.getTitle();
    }

    @Override // defpackage.vw
    public final void g() {
        this.x.d(this, this.A);
    }

    @Override // defpackage.vw
    public final boolean h() {
        return this.w.isTitleOptional();
    }

    @Override // defpackage.vw
    public final void i(View view) {
        this.w.setCustomView(view);
        this.y = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.vw
    public final void j(int i) {
        k(this.c.getString(i));
    }

    @Override // defpackage.vw
    public final void k(CharSequence charSequence) {
        this.w.setSubtitle(charSequence);
    }

    @Override // defpackage.vw
    public final void l(int i) {
        m(this.c.getString(i));
    }

    @Override // defpackage.vw
    public final void m(CharSequence charSequence) {
        this.w.setTitle(charSequence);
    }

    @Override // defpackage.vw
    public final void n(boolean z) {
        this.b = z;
        this.w.setTitleOptional(z);
    }

    @Override // defpackage.sj10
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.x.a.a(this, menuItem);
    }

    @Override // defpackage.sj10
    public final void onMenuModeChange(MenuBuilder menuBuilder) {
        g();
        this.w.showOverflowMenu();
    }
}
