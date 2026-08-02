package com.yandex.messaging.ui.migration;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.messaging.activity.MessengerActivityBase;
import defpackage.fcg;
import defpackage.k200;
import defpackage.kse;
import defpackage.mkn;
import defpackage.mx60;
import defpackage.nyh0;
import defpackage.pub1;
import defpackage.q5z;
import defpackage.v0d;
import defpackage.vef0;
import defpackage.vs4;
import defpackage.z8g;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/messaging/ui/migration/MigrationEnvironmentActivity;", "Lcom/yandex/messaging/activity/MessengerActivityBase;", "<init>", "()V", "Lzy11;", "logoutAndExit", "openTelemostInGooglePlay", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MigrationEnvironmentActivity extends MessengerActivityBase {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public final void logoutAndExit() {
        vef0 vef0Var = (vef0) ((z8g) ((fcg) getSdkComponent()).a.b).z.get();
        q5z.h(vef0Var);
        vef0Var.b.reportEvent("force_logout");
        kse.b(vef0Var.a);
        vef0Var.a();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$0(MigrationEnvironmentActivity migrationEnvironmentActivity, mx60 mx60Var) {
        migrationEnvironmentActivity.logoutAndExit();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openTelemostInGooglePlay() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(nyh0.telemost_google_play_link))));
    }

    @Override // com.yandex.messaging.activity.MessengerActivityBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mkn.b(this);
        v0d.a(this, new androidx.compose.runtime.internal.a(1403926642, new vs4(26, this), true));
        pub1.c(getOnBackPressedDispatcher(), this, new k200(27, this));
    }
}
