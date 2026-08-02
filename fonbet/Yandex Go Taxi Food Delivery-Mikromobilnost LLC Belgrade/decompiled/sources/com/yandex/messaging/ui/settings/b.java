package com.yandex.messaging.ui.settings;

import android.content.SharedPreferences;
import android.os.Handler;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.h3y;
import defpackage.ij60;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.o430;
import defpackage.oyh0;
import defpackage.wi60;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.yi60;
import defpackage.yr31;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class b extends yr31 {
    public final h3y b;
    public final com.yandex.messaging.domain.statuses.c c;
    public final wi60 w;
    public final r0 x;

    public b(SharedPreferences sharedPreferences, Handler handler, yi60 yi60Var, h3y h3yVar, com.yandex.messaging.domain.statuses.c cVar, h3y h3yVar2, wi60 wi60Var) {
        this.b = h3yVar;
        this.c = cVar;
        this.w = wi60Var;
        ij60 ij60Var = new ij60(oyh0.profile_notification_settings_switch_text, null, wi60Var.a(), true, true, true, sharedPreferences.getBoolean("enable_all_notifications_sound", true), sharedPreferences.getBoolean("enable_all_notifications_vibrate", true));
        r0 c = bvf0.c(ij60Var);
        this.x = c;
        n nVar = new n(c, new NotificationSettingsViewModel$uiState$1(this, null));
        k5c a = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        o430 o430Var = e3n.b;
        kotlinx.coroutines.flow.e.R(nVar, a, jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), ij60Var);
    }
}
