package com.yandex.dsl.views.menu;

import android.view.MenuItem;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/MenuItem;", "onMenuItemClick"}, k = 3, mv = {1, 8, 0}, xi = 176)
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
