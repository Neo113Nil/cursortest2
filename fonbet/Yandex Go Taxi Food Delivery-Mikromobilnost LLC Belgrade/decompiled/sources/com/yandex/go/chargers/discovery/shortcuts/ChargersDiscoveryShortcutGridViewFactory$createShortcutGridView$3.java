package com.yandex.go.chargers.discovery.shortcuts;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersMainScreenButtonV5;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersMainScreenCloseReason;
import defpackage.bx9;
import defpackage.ew9;
import defpackage.hx9;
import defpackage.qw9;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        bx9 bx9Var = (bx9) this.receiver;
        qw9 qw9Var = bx9Var.E;
        qw9Var.a(ChargersAnalytics$ChargersMainScreenButtonV5.Qr);
        qw9Var.c = ChargersAnalytics$ChargersMainScreenCloseReason.ScanQr;
        ((hx9) bx9Var.D.b).r(new ew9(5));
        return zy11.a;
    }
}
