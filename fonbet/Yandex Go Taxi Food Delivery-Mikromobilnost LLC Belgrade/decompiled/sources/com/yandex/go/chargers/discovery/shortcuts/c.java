package com.yandex.go.chargers.discovery.shortcuts;

import android.content.Context;
import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import defpackage.bx9;
import defpackage.e48;
import defpackage.hh8;
import defpackage.i47;
import defpackage.kqe;
import defpackage.lx9;
import defpackage.nx9;
import defpackage.oep0;
import defpackage.qxf;
import defpackage.s6k0;
import defpackage.tse;
import defpackage.uxr0;
import defpackage.wpa;
import defpackage.xpa;
import defpackage.y50;
import defpackage.yvf0;
import defpackage.zuj0;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes12.dex */
public final class c {
    public final Context a;
    public final tse b;
    public final y50 c;
    public final kqe d;
    public final xpa e;
    public final wpa f;
    public final i47 g;
    public final com.yandex.go.chargers.data.e h;
    public final uxr0 i;
    public final yvf0 j;
    public final zuj0 k;
    public final oep0 l;

    public c(Context context, tse tseVar, y50 y50Var, kqe kqeVar, xpa xpaVar, wpa wpaVar, i47 i47Var, com.yandex.go.chargers.data.e eVar, uxr0 uxr0Var, qxf qxfVar, zuj0 zuj0Var, oep0 oep0Var) {
        this.a = context;
        this.b = tseVar;
        this.c = y50Var;
        this.d = kqeVar;
        this.e = xpaVar;
        this.f = wpaVar;
        this.g = i47Var;
        this.h = eVar;
        this.i = uxr0Var;
        this.j = qxfVar;
        this.k = zuj0Var;
        this.l = oep0Var;
    }

    public final ShortcutsView a(bx9 bx9Var) {
        nx9 nx9Var = new nx9(0);
        return this.d.a(this.a, new d(this.c, new ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$1(1, bx9Var, bx9.class, "onStoryClicked", "onStoryClicked(Ljava/lang/String;)V", 0), new ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$2(0, bx9Var, bx9.class, "onSupportClicked", "onSupportClicked()V", 0), new ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$3(0, bx9Var, bx9.class, "onQrClicked", "onQrClicked()V", 0), new ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$4(0, bx9Var, bx9.class, "onSuperPassClicked", "onSuperPassClicked()V", 0), new ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$5(0, bx9Var, bx9.class, "onActiveSuperPassClicked", "onActiveSuperPassClicked()V", 0), new ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$6(0, bx9Var, bx9.class, "onSubscriptionClicked", "onSubscriptionClicked()V", 0), new ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$7(0, bx9Var, bx9.class, "onDvizhSubscriptionClicked", "onDvizhSubscriptionClicked()V", 0), new ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$8(1, bx9Var, bx9.class, "onPlusHomeClicked", "onPlusHomeClicked(Ljava/lang/String;)V", 0), new ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$9(0, bx9Var, bx9.class, "onPartnerSubscriptionClicked", "onPartnerSubscriptionClicked()V", 0), new ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$10(0, bx9Var, bx9.class, "onChargersPassesClicked", "onChargersPassesClicked()V", 0), new hh8(15, bx9Var), this.j, this.k, this.l), this.i.a(nx9Var), new lx9(), new s6k0("chargers-discovery", ProductsScreenType$Type.CHARGERS_DISCOVERY, nx9Var), new e48(16, this), ShortcutViewSourceType.CHARGERS_DISCOVERY);
    }
}
