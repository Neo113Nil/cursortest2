package com.yandex.messaging.internal.search;

import android.content.SharedPreferences;
import defpackage.dnr;
import defpackage.gym;
import defpackage.i3y;
import defpackage.rol0;

/* loaded from: classes15.dex */
public final class a {
    public final SharedPreferences a;
    public final gym b;
    public final String c;
    public final i3y d = kotlin.a.a(new dnr(22, this));

    public a(SharedPreferences sharedPreferences, gym gymVar, String str) {
        this.a = sharedPreferences;
        this.b = gymVar;
        this.c = str;
        new rol0(new GlobalSearchRecentItemsStore$data$1(this, null));
    }
}
