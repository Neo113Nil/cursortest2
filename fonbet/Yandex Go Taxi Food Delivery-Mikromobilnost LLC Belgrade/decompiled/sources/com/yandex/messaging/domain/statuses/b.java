package com.yandex.messaging.domain.statuses;

import android.content.SharedPreferences;
import com.yandex.messaging.core.net.entities.UserStatusPresetBucket;
import defpackage.at2;
import defpackage.dlf;
import defpackage.i3y;
import defpackage.k020;
import defpackage.l020;
import defpackage.oo31;
import defpackage.sb7;
import defpackage.tje;
import defpackage.to3;
import defpackage.xdf0;
import defpackage.ybf;

/* loaded from: classes15.dex */
public final class b {
    public final k020 a;
    public final dlf b;
    public final SharedPreferences c;
    public boolean d;
    public final i3y e = kotlin.a.a(new ybf(5, this));

    public b(k020 k020Var, sb7 sb7Var, dlf dlfVar, xdf0 xdf0Var, to3 to3Var, at2 at2Var, SharedPreferences sharedPreferences) {
        this.a = k020Var;
        this.b = dlfVar;
        this.c = sharedPreferences;
        this.d = sharedPreferences.getBoolean("IS_CUSTOM_STATUSES_ENABLED", false);
        at2Var.S();
        tje.N(xdf0Var, null, null, new CustomStatusesRepository$1(sb7Var, this, null), 3);
    }

    public final void a(UserStatusPresetBucket userStatusPresetBucket, l020 l020Var) {
        this.d = true;
        oo31.n(this.c, "IS_CUSTOM_STATUSES_ENABLED", true);
        if (l020Var != null) {
            l020Var.W(userStatusPresetBucket);
            return;
        }
        l020 C = this.a.C();
        try {
            C.W(userStatusPresetBucket);
            C.s();
            C.close();
        } finally {
        }
    }
}
