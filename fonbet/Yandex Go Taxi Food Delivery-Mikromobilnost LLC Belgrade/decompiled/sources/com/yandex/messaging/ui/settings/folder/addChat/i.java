package com.yandex.messaging.ui.settings.folder.addChat;

import defpackage.ad0;
import defpackage.bvf0;
import defpackage.cd0;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.ec0;
import defpackage.gci0;
import defpackage.ha2;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.l7t;
import defpackage.mth;
import defpackage.o430;
import defpackage.p0;
import defpackage.sc5;
import defpackage.vng;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zb0;
import defpackage.zy11;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class i extends sc5 {
    public final r0 A;
    public final r0 B;
    public final gci0 C;
    public final ec0 w;
    public final l7t x;
    public final com.yandex.messaging.ui.folders.f y;
    public final com.yandex.messaging.internal.backendconfig.a z;

    public i(ec0 ec0Var, com.yandex.messaging.domain.folders.g gVar, l7t l7tVar, com.yandex.messaging.ui.folders.f fVar, com.yandex.messaging.internal.backendconfig.a aVar) {
        this.w = ec0Var;
        this.x = l7tVar;
        this.y = fVar;
        this.z = aVar;
        r0 c = bvf0.c("");
        this.A = c;
        r0 c2 = bvf0.c(new ad0(ec0Var.b, ec0Var.a));
        this.B = c2;
        ha2 m = kotlinx.coroutines.flow.e.m(kotlinx.coroutines.flow.e.X(vng.l(new mth(c2, 6), new p0(14), vng.c), new AddChatsFolderViewModel$special$$inlined$flatMapLatest$1(this, null)), gVar.a(zy11.a), c, new cd0(0, kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.p(c, 100L), new AddChatsFolderViewModel$special$$inlined$flatMapLatest$2(this, null)), this), new AddChatsFolderViewModel$uiState$3(this, null));
        k5c a = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        o430 o430Var = e3n.b;
        this.C = kotlinx.coroutines.flow.e.R(m, a, jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), zb0.a);
    }
}
