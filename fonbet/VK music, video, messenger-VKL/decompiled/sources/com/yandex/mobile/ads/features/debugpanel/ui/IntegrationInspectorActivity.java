package com.yandex.mobile.ads.features.debugpanel.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.features.debugpanel.common.BaseActivity;
import java.util.Iterator;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.myc0;
import xsna.u01;
import xsna.yvj;
import yads.ac1;
import yads.b90;
import yads.bm3;
import yads.cc1;
import yads.dc1;
import yads.e90;
import yads.et;
import yads.fc1;
import yads.m70;
import yads.nc1;
import yads.o90;
import yads.q90;
import yads.y80;
import yads.yb1;
import yads.z70;

/* loaded from: classes8.dex */
public final class IntegrationInspectorActivity extends BaseActivity<nc1> {
    private final Lazy d = new bpn0(new yb1(this));
    private final Lazy e = new bpn0(new fc1(this));
    private final Lazy f = new bpn0(new dc1(this));

    public static final m70 a(IntegrationInspectorActivity integrationInspectorActivity) {
        return (m70) integrationInspectorActivity.d.getValue();
    }

    public static final o90 b(IntegrationInspectorActivity integrationInspectorActivity) {
        return (o90) integrationInspectorActivity.f.getValue();
    }

    public static final q90 c(IntegrationInspectorActivity integrationInspectorActivity) {
        return (q90) integrationInspectorActivity.e.getValue();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().a(b90.a);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_debug);
        d();
        b().a(y80.a);
        yvj a = a();
        myc0.h(a, null, null, new ac1(this, null), 3);
        myc0.h(a, null, null, new cc1(this, null), 3);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onDestroy() {
        z70 z70Var = (z70) ((m70) this.d.getValue()).r.getValue();
        Iterator it = z70Var.b.iterator();
        while (it.hasNext()) {
            ((et) it.next()).cancel();
        }
        z70Var.b.clear();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IntegrationInspectorActivity integrationInspectorActivity, View view) {
        integrationInspectorActivity.b().a(e90.a);
    }

    private final void d() {
        ((ImageButton) findViewById(R$id.toolbar_share_button)).setOnClickListener(new u01(this, 5));
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity
    public final bm3 c() {
        return ((m70) this.d.getValue()).a();
    }
}
