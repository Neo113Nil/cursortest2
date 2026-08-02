package com.yandex.go.inapp_calls.navigation.loader;

import com.yandex.go.inapp_calls.repository.c;
import defpackage.ea0;
import defpackage.fkv;
import defpackage.h55;
import defpackage.m950;
import defpackage.njv;
import defpackage.sjv;
import defpackage.tje;
import defpackage.ujv;

/* loaded from: classes12.dex */
public final class a extends h55 {
    public final c D;
    public final ea0 E;
    public final njv F;

    public a(c cVar, ea0 ea0Var, njv njvVar) {
        super(null);
        this.D = cVar;
        this.E = ea0Var;
        this.F = njvVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new InAppCallsLoaderRouter$onLaunch$1(this, (sjv) obj, null), 3);
    }

    public final void P(sjv sjvVar) {
        String str;
        fkv fkvVar = sjvVar.b;
        if (fkvVar == null || (str = fkvVar.a) == null) {
            str = "";
        }
        this.F.b(str, sjvVar.c.b, false);
        A((m950) this.E.get(), sjvVar, new ujv(this, sjvVar));
    }
}
