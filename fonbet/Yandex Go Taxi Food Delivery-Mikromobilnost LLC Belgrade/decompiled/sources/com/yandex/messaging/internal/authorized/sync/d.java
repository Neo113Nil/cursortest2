package com.yandex.messaging.internal.authorized.sync;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.messaging.internal.authorized.j;
import defpackage.bi91;
import defpackage.bvf0;
import defpackage.eke;
import defpackage.gci0;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.tje;
import defpackage.wsr0;
import defpackage.x22;
import defpackage.x4e;
import defpackage.xdf0;
import defpackage.xsr0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class d {
    public final Context a;
    public final xdf0 b;
    public final SharedPreferences c;
    public final SharedPreferences d;
    public final j e;
    public final r0 f;
    public final r0 g;
    public final r0 h;
    public final ContactsSyncManager$prefsListener$1 i;
    public final gci0 j;
    public final gci0 k;
    public final c l;
    public final gci0 m;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.messaging.internal.authorized.sync.ContactsSyncManager$prefsListener$1] */
    public d(Context context, xdf0 xdf0Var, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, j jVar, x22 x22Var, eke ekeVar) {
        this.a = context;
        this.b = xdf0Var;
        this.c = sharedPreferences;
        this.d = sharedPreferences2;
        this.e = jVar;
        r0 c = bvf0.c(Boolean.valueOf(bi91.f(context)));
        this.f = c;
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.g = c2;
        r0 c3 = bvf0.c(Integer.valueOf(sharedPreferences.getInt("contacts_uploaded_vers", -1)));
        this.h = c3;
        this.i = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.yandex.messaging.internal.authorized.sync.ContactsSyncManager$prefsListener$1
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String key) {
                if (jl40.l(key, "CONTACT_SYNC_ENABLED_FOR_GUID")) {
                    d dVar = d.this;
                    dVar.e.a(new ContactsSyncManager$updateSyncEnabledValue$1(dVar, null));
                }
                if (jl40.l(key, "contacts_uploaded_vers")) {
                    d dVar2 = d.this;
                    r0 r0Var = dVar2.h;
                    Integer valueOf = Integer.valueOf(dVar2.c.getInt("contacts_uploaded_vers", -1));
                    r0Var.getClass();
                    r0Var.m(null, valueOf);
                }
            }
        };
        gci0 d = kotlinx.coroutines.flow.e.d(c);
        this.j = d;
        gci0 d2 = kotlinx.coroutines.flow.e.d(c2);
        this.k = d2;
        this.l = new c(c3);
        m0 m0Var = new m0(d, d2, new ContactsSyncManager$isContactSyncAllowed$1(3, null));
        xsr0.a.getClass();
        this.m = kotlinx.coroutines.flow.e.R(m0Var, xdf0Var, wsr0.b, Boolean.valueOf(((Boolean) d.a.getValue()).booleanValue() && ((Boolean) d2.a.getValue()).booleanValue()));
        if (sharedPreferences.contains("contacts_sync_enabled")) {
            boolean z = sharedPreferences.getBoolean("contacts_sync_enabled", false);
            tje.N(xdf0Var, null, null, new ContactsSyncManager$migrateSyncEnabledPreference$1(this, null), 3);
            c(z);
        }
        jVar.a(new ContactsSyncManager$updateSyncEnabledValue$1(this, null));
        jVar.a(new ContactsSyncManager$1(this, null));
        tje.N(xdf0Var, null, null, new ContactsSyncManager$2(this, ekeVar, x22Var, null), 3);
    }

    public final void a() {
        r0 r0Var = this.f;
        if (!((Boolean) r0Var.getValue()).booleanValue() && bi91.f(this.a)) {
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            this.e.a(new ContactsSyncManager$onPermissionsMayChange$1(2, null));
        }
    }

    public final void b() {
        x4e.z(-1, this.h, null);
        tje.N(this.b, null, null, new ContactsSyncManager$resetUploaded$1(this, null), 3);
    }

    public final void c(boolean z) {
        qv10.B(z, this.g, null);
        this.e.a(new ContactsSyncManager$setContactSyncEnabled$1(this, z, null));
    }

    public final void d() {
        x4e.z(9, this.h, null);
        tje.N(this.b, null, null, new ContactsSyncManager$setUploaded$1(this, null), 3);
    }
}
