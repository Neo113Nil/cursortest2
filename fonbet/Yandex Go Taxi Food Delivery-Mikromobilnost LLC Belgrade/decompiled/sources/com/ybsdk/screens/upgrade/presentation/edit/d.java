package com.ybsdk.screens.upgrade.presentation.edit;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import defpackage.ba21;
import defpackage.des0;
import defpackage.j3h;
import defpackage.np41;
import defpackage.tfl0;

/* loaded from: classes2.dex */
public final class d implements a {
    public final c a;

    public d(c cVar) {
        this.a = cVar;
    }

    public final b a(UpgradeEditFragment.UpgradeEditScreenParams upgradeEditScreenParams) {
        c cVar = this.a;
        return new b((com.ybsdk.screens.upgrade.domain.interactors.c) cVar.a.get(), (ba21) cVar.b.get(), (des0) cVar.c.get(), (AppAnalyticsReporter) cVar.d.get(), (com.ybsdk.rconfig.b) cVar.e.get(), (np41) cVar.f.get(), (tfl0) cVar.g.get(), (j3h) cVar.h.get(), upgradeEditScreenParams);
    }
}
