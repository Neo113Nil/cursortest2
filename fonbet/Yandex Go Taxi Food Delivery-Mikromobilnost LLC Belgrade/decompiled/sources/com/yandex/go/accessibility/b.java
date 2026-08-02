package com.yandex.go.accessibility;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import defpackage.ac20;
import defpackage.cne0;
import defpackage.d9;
import defpackage.dne0;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.lz60;
import defpackage.mdh;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.sme0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes.dex */
public final class b implements lz60 {
    public static final /* synthetic */ kgx[] i = {new MutablePropertyReference1Impl("lastDataTimestamp", 0, "getLastDataTimestamp()J", b.class)};
    public final Context a;
    public final tse b;
    public final tt2 c;
    public final rqo d;
    public final ac20 e;
    public final i3y f = kotlin.a.a(new d9(1, this));
    public final sme0 g;
    public final String h;

    public b(Context context, tse tseVar, tt2 tt2Var, rqo rqoVar, ac20 ac20Var, dne0 dne0Var) {
        this.a = context;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = rqoVar;
        this.e = ac20Var;
        cne0 a = dne0Var.a("accessibility_settings");
        this.g = new sme0(0, a, a, "last_data_timestamp");
        this.h = "AccessibilitySettingsInteractor";
    }

    public final List d(int i2) {
        return ((AccessibilityManager) this.a.getApplicationContext().getSystemService("accessibility")).getEnabledAccessibilityServiceList(i2);
    }

    @Override // defpackage.lz60
    public final void g() {
        if (System.currentTimeMillis() - ((Number) this.g.getValue(this, i[0])).longValue() <= 86400000) {
            return;
        }
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.b, mdh.b, null, new AccessibilitySettingsInteractor$onLargestContentfulPaint$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.h;
    }

    public final ContentResolver i() {
        return (ContentResolver) this.f.getValue();
    }

    public final Boolean j(String str) {
        try {
            int i2 = Settings.Secure.getInt(i(), str);
            if (i2 == 0) {
                return Boolean.FALSE;
            }
            if (i2 != 1) {
                return null;
            }
            return Boolean.TRUE;
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }
}
