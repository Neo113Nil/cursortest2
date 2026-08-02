package com.yandex.mobile.ads.features.debugpanel.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.features.debugpanel.common.BaseActivity;
import defpackage.bh61;
import defpackage.gp51;
import defpackage.gp81;
import defpackage.h971;
import defpackage.i3y;
import defpackage.m971;
import defpackage.mb81;
import defpackage.me81;
import defpackage.ne81;
import defpackage.q971;
import defpackage.tje;
import defpackage.tse;
import defpackage.wz61;
import defpackage.z481;
import defpackage.zgv;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.a;
import yads.r91;
import yads.t91;
import yads.v91;
import yads.w91;
import yads.y91;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/mobile/ads/features/debugpanel/ui/IntegrationInspectorActivity;", "Lcom/yandex/mobile/ads/features/debugpanel/common/BaseActivity;", "Lq971;", "<init>", "()V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IntegrationInspectorActivity extends BaseActivity<q971> {
    private final i3y d = a.a(new r91(this));
    private final i3y e = a.a(new y91(this));
    private final i3y f = a.a(new w91(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IntegrationInspectorActivity integrationInspectorActivity, View view) {
        integrationInspectorActivity.b().a(m971.a);
    }

    public static final z481 b(IntegrationInspectorActivity integrationInspectorActivity) {
        return (z481) integrationInspectorActivity.f.getValue();
    }

    private final void d() {
        ((ImageButton) findViewById(R$id.toolbar_share_button)).setOnClickListener(new zgv(2, this));
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity
    public final gp81 c() {
        h971 h971Var = (h971) this.d.getValue();
        h971Var.getClass();
        return new gp51(10, h971Var);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().a(wz61.a);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_debug);
        d();
        b().a(bh61.a);
        tse a = getA();
        tje.N(a, null, null, new t91(this, null), 3);
        tje.N(a, null, null, new v91(this, null), 3);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onDestroy() {
        ne81 ne81Var = (ne81) ((h971) this.d.getValue()).r.getValue();
        Iterator it = ne81Var.b.iterator();
        while (it.hasNext()) {
            ((me81) it.next()).a.a();
        }
        ne81Var.b.clear();
        super.onDestroy();
    }

    public static final h971 a(IntegrationInspectorActivity integrationInspectorActivity) {
        return (h971) integrationInspectorActivity.d.getValue();
    }

    public static final mb81 c(IntegrationInspectorActivity integrationInspectorActivity) {
        return (mb81) integrationInspectorActivity.e.getValue();
    }
}
