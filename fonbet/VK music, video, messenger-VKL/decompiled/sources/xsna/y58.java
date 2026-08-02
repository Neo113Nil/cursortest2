package xsna;

import android.content.Context;
import android.os.Parcelable;
import com.vk.menu.di.MenuComponent;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;

/* compiled from: BottomNavigationPresenter.java */
/* loaded from: classes11.dex */
public final class y58 implements androidx.appcompat.view.menu.j, w8i {
    public androidx.appcompat.view.menu.f b;
    public w58 c;
    public boolean d = false;
    public final k820 e = ((MenuComponent) j6i.b(m7m.f(this), MenuComponent.class)).md();
    public final pvn0 f = ((TabbarSettingsComponent) j6i.b(m7m.f(this), TabbarSettingsComponent.class)).b1();

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable b() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(boolean z) {
        if (this.d) {
            return;
        }
        if (z) {
            this.c.c();
        } else {
            this.c.d();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(androidx.appcompat.view.menu.m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean f(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return -1;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.c.n = this.b;
        this.b = fVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(androidx.appcompat.view.menu.f fVar, boolean z) {
    }
}
