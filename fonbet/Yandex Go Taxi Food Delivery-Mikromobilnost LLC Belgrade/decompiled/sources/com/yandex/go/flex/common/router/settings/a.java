package com.yandex.go.flex.common.router.settings;

import android.content.Context;
import defpackage.h55;
import defpackage.tje;
import defpackage.y50;
import ru.yandex.taxi.activity.g;

/* loaded from: classes12.dex */
public final class a extends h55 {
    public final Context D;
    public final y50 E;
    public final g F;

    public a(Context context, y50 y50Var, g gVar) {
        super(null);
        this.D = context;
        this.E = y50Var;
        this.F = gVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new OpenSettingsRouter$onLaunch$1(this, null), 3);
    }
}
