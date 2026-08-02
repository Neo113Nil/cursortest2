package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.h;
import androidx.appcompat.app.o;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class f651 extends vw implements sj10 {
    public final Context c;
    public final MenuBuilder w;
    public h x;
    public WeakReference y;
    public final /* synthetic */ o z;

    public f651(o oVar, Context context, h hVar) {
        this.z = oVar;
        this.c = context;
        this.x = hVar;
        MenuBuilder defaultShowAsAction = new MenuBuilder(context).setDefaultShowAsAction(1);
        this.w = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // defpackage.vw
    public final void a() {
        o oVar = this.z;
        if (oVar.i != this) {
            return;
        }
        boolean z = oVar.p;
        boolean z2 = oVar.q;
        if (z || z2) {
            oVar.j = this;
            oVar.k = this.x;
        } else {
            this.x.b(this);
        }
        this.x = null;
        oVar.x(false);
        oVar.f.closeMode();
        oVar.c.setHideOnContentScrollEnabled(oVar.v);
        oVar.i = null;
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
        return this.w;
    }

    @Override // defpackage.vw
    public final MenuInflater d() {
        return new SupportMenuInflater(this.c);
    }

    @Override // defpackage.vw
    public final CharSequence e() {
        return this.z.f.getSubtitle();
    }

    @Override // defpackage.vw
    public final CharSequence f() {
        return this.z.f.getTitle();
    }

    @Override // defpackage.vw
    public final void g() {
        if (this.z.i != this) {
            return;
        }
        MenuBuilder menuBuilder = this.w;
        menuBuilder.stopDispatchingItemsChanged();
        try {
            this.x.d(this, menuBuilder);
        } finally {
            menuBuilder.startDispatchingItemsChanged();
        }
    }

    @Override // defpackage.vw
    public final boolean h() {
        return this.z.f.isTitleOptional();
    }

    @Override // defpackage.vw
    public final void i(View view) {
        this.z.f.setCustomView(view);
        this.y = new WeakReference(view);
    }

    @Override // defpackage.vw
    public final void j(int i) {
        k(this.z.a.getResources().getString(i));
    }

    @Override // defpackage.vw
    public final void k(CharSequence charSequence) {
        this.z.f.setSubtitle(charSequence);
    }

    @Override // defpackage.vw
    public final void l(int i) {
        m(this.z.a.getResources().getString(i));
    }

    @Override // defpackage.vw
    public final void m(CharSequence charSequence) {
        this.z.f.setTitle(charSequence);
    }

    @Override // defpackage.vw
    public final void n(boolean z) {
        this.b = z;
        this.z.f.setTitleOptional(z);
    }

    @Override // defpackage.sj10
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        h hVar = this.x;
        if (hVar != null) {
            return hVar.a.a(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.sj10
    public final void onMenuModeChange(MenuBuilder menuBuilder) {
        if (this.x == null) {
            return;
        }
        g();
        this.z.f.showOverflowMenu();
    }
}
