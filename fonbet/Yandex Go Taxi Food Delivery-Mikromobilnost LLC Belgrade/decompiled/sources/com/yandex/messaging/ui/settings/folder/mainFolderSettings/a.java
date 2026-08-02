package com.yandex.messaging.ui.settings.folder.mainFolderSettings;

import defpackage.a500;
import defpackage.bvf0;
import defpackage.c500;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.j721;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.o430;
import defpackage.sc5;
import defpackage.t7t;
import defpackage.t8t;
import defpackage.tje;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a extends sc5 {
    public final t8t w;
    public final r0 x;

    public a(t8t t8tVar, j721 j721Var, t7t t7tVar) {
        this.w = t8tVar;
        r0 c = bvf0.c(new c500(0));
        this.x = c;
        m0 m0Var = new m0(t7tVar.a(zy11.a), c, new MainFolderSettingsViewModel$uiState$1(3, null));
        k5c a = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        o430 o430Var = e3n.b;
        e.R(m0Var, a, jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), a500.a);
        tje.N(ds31.a(this), null, null, new MainFolderSettingsViewModel$loadExcludedFolders$1(this, null), 3);
    }
}
