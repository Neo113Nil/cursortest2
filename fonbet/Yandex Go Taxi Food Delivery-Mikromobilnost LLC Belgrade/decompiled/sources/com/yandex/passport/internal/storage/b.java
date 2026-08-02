package com.yandex.passport.internal.storage;

import android.content.SharedPreferences;
import com.yandex.passport.common.core.Uid;
import defpackage.kgx;
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.uo2;
import defpackage.x96;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class b {
    public static final /* synthetic */ kgx[] d = {new MutablePropertyReference1Impl("isAutoLoginDisabled", 0, "isAutoLoginDisabled()Z", b.class), oyr.B(qoi0.a, b.class, "isSubscriptionAllowed", "isSubscriptionAllowed()Z", 0), new MutablePropertyReference1Impl("latestSyncTimestamps", 0, "getLatestSyncTimestamps()Ljava/util/List;", b.class)};
    public final x96 a;
    public final x96 b;
    public final uo2 c;

    public b(i iVar, Uid uid) {
        this.a = new x96(iVar.a, "is_auto_login_disabled/%s/" + uid.getValue(), false);
        SharedPreferences sharedPreferences = iVar.a;
        this.b = new x96(sharedPreferences, "is_subscription_allowed/" + uid.getValue(), true);
        this.c = new uo2(sharedPreferences, EmptyList.a, "sync_timestamps/%s/" + uid.getValue(), false, new com.yandex.passport.internal.core.announcing.f(11), new com.yandex.passport.internal.core.announcing.f(10));
    }

    public final boolean a() {
        return ((Boolean) this.a.getValue(this, d[0])).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.b.getValue(this, d[1])).booleanValue();
    }

    public final void c(boolean z) {
        this.a.setValue(this, d[0], Boolean.valueOf(z));
    }

    public final void d(boolean z) {
        this.b.setValue(this, d[1], Boolean.valueOf(z));
    }
}
