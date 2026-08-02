package xsna;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;
import xsna.g40;
import xsna.o23;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes11.dex */
public final class xok0 extends g40 implements f.a {
    public final Context d;
    public final ActionBarContextView e;
    public final g40.a f;
    public WeakReference<View> g;
    public boolean h;
    public final androidx.appcompat.view.menu.f i;

    public xok0(Context context, ActionBarContextView actionBarContextView, o23.e eVar) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = eVar;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
        fVar.l = 1;
        this.i = fVar;
        fVar.e = this;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void a(@NonNull androidx.appcompat.view.menu.f fVar) {
        i();
        ActionMenuPresenter actionMenuPresenter = this.e.e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.n();
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean b(@NonNull androidx.appcompat.view.menu.f fVar, @NonNull MenuItem menuItem) {
        return this.f.a(this, menuItem);
    }

    @Override // xsna.g40
    public final void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.d(this);
    }

    @Override // xsna.g40
    public final View d() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // xsna.g40
    public final androidx.appcompat.view.menu.f e() {
        return this.i;
    }

    @Override // xsna.g40
    public final MenuInflater f() {
        return new lin0(this.e.getContext());
    }

    @Override // xsna.g40
    public final CharSequence g() {
        return this.e.getSubtitle();
    }

    @Override // xsna.g40
    public final CharSequence h() {
        return this.e.getTitle();
    }

    @Override // xsna.g40
    public final void i() {
        this.f.c(this, this.i);
    }

    @Override // xsna.g40
    public final boolean j() {
        return this.e.t;
    }

    @Override // xsna.g40
    public final void k(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // xsna.g40
    public final void l(int i) {
        m(this.d.getString(i));
    }

    @Override // xsna.g40
    public final void m(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // xsna.g40
    public final void n(int i) {
        o(this.d.getString(i));
    }

    @Override // xsna.g40
    public final void o(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // xsna.g40
    public final void p(boolean z) {
        this.c = z;
        this.e.setTitleOptional(z);
    }
}
