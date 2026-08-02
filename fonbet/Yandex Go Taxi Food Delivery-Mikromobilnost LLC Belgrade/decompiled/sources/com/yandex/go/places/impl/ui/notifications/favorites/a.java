package com.yandex.go.places.impl.ui.notifications.favorites;

import android.content.Context;
import defpackage.pav;
import defpackage.ppr0;
import defpackage.tj60;
import defpackage.wz1;
import defpackage.ymj;
import defpackage.yq;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final tj60 b;
    public final pav c;

    public a(pav pavVar, tj60 tj60Var, Context context) {
        this.a = context;
        this.b = tj60Var;
        this.c = pavVar;
    }

    public final void a(yq yqVar, ymj ymjVar) {
        ShowFavoritesNotification showFavoritesNotification = new ShowFavoritesNotification(this.a, this.c, yqVar.b, yqVar.c, yqVar.a, new ppr0(6, ymjVar, this), new ShowFavoritesNotificationController$show$notification$2(0, this, a.class, "hide", "hide()V", 0));
        showFavoritesNotification.setExpiresListener(new wz1(18, this));
        tj60 tj60Var = this.b;
        tj60Var.e(showFavoritesNotification);
        tj60Var.f();
        showFavoritesNotification.startExpiresTimer();
    }
}
