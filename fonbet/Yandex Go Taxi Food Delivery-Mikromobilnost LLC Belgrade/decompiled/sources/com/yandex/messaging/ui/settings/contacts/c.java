package com.yandex.messaging.ui.settings.contacts;

import com.yandex.messaging.internal.authorized.sync.d;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.ha2;
import defpackage.k5c;
import defpackage.sc5;
import defpackage.wsr0;
import defpackage.x22;
import defpackage.xsr0;
import defpackage.yde;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class c extends sc5 {
    public final r0 A;
    public final gci0 B;
    public final gci0 C;
    public final com.yandex.messaging.domain.contacts.a w;
    public final d x;
    public final x22 y;
    public final r0 z;

    public c(com.yandex.messaging.domain.contacts.a aVar, d dVar, x22 x22Var) {
        this.w = aVar;
        this.x = dVar;
        this.y = x22Var;
        Boolean bool = Boolean.FALSE;
        r0 c = bvf0.c(bool);
        this.z = c;
        r0 c2 = bvf0.c(bool);
        this.A = c2;
        this.B = e.d(c2);
        ha2 n = e.n(dVar.m, dVar.l, c, new ContactsSettingsViewModel$uiState$1(this, null));
        k5c a = ds31.a(this);
        xsr0.a.getClass();
        this.C = e.R(n, a, wsr0.b, new yde(0));
        x22Var.reportEvent("contacts_settings_open", Z(this));
    }

    public static LinkedHashMap Z(c cVar) {
        return cVar.Y(((Boolean) cVar.x.k.a.getValue()).booleanValue());
    }

    public final LinkedHashMap Y(boolean z) {
        d dVar = this.x;
        return kotlin.collections.b.l(new Pair("permission_enabled", dVar.j.a.getValue()), new Pair("setting_enabled", Boolean.valueOf(z)), new Pair("uploaded_ever", dVar.l.getValue()));
    }
}
