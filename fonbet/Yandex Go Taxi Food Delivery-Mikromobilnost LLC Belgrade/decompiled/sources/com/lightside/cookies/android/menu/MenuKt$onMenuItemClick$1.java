package com.lightside.cookies.android.menu;

import android.view.MenuItem;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class MenuKt$onMenuItemClick$1 implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ sls $value;

    public MenuKt$onMenuItemClick$1(sls slsVar) {
        this.$value = slsVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.$value.invoke();
        return true;
    }
}
