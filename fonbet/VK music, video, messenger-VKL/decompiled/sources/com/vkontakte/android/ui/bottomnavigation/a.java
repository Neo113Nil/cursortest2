package com.vkontakte.android.ui.bottomnavigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import com.vkontakte.android.ui.bottomnavigation.BottomNavigationView;

/* compiled from: BottomNavigationView.java */
/* loaded from: classes11.dex */
public final class a implements f.a {
    public final /* synthetic */ BottomNavigationView b;

    public a(BottomNavigationView bottomNavigationView) {
        this.b = bottomNavigationView;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean b(f fVar, MenuItem menuItem) {
        BottomNavigationView.a aVar = this.b.g;
        return (aVar == null || aVar.a(menuItem)) ? false : true;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void a(f fVar) {
    }
}
