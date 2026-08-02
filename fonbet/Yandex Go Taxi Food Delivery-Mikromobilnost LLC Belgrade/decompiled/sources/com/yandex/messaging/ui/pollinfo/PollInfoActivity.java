package com.yandex.messaging.ui.pollinfo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import com.yandex.messaging.activity.MessengerActivityBase;
import com.yandex.messaging.ui.pollinfo.PollInfoActivity;
import defpackage.ai91;
import defpackage.eja1;
import defpackage.fcg;
import defpackage.g990;
import defpackage.i3y;
import defpackage.j40;
import defpackage.jqr;
import defpackage.mt11;
import defpackage.n751;
import defpackage.ps11;
import defpackage.sls;
import defpackage.u1w;
import defpackage.wwd0;
import defpackage.z83;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/yandex/messaging/ui/pollinfo/PollInfoActivity;", "Lcom/yandex/messaging/activity/MessengerActivityBase;", "<init>", "()V", "Lzy11;", "applyInsets", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "Landroid/os/PersistableBundle;", "outPersistentState", "onSaveInstanceState", "(Landroid/os/Bundle;Landroid/os/PersistableBundle;)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lps11;", "ui$delegate", "Li3y;", "getUi", "()Lps11;", "ui", "Lj40;", "permissionManager$delegate", "getPermissionManager", "()Lj40;", "permissionManager", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PollInfoActivity extends MessengerActivityBase {
    public static final int $stable = 8;

    /* renamed from: permissionManager$delegate, reason: from kotlin metadata */
    private final i3y permissionManager;

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui;

    public PollInfoActivity() {
        final int i = 0;
        this.ui = kotlin.a.a(new sls(this) { // from class: swd0
            public final /* synthetic */ PollInfoActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ps11 ui_delegate$lambda$0;
                j40 permissionManager_delegate$lambda$1;
                int i2 = i;
                PollInfoActivity pollInfoActivity = this.b;
                switch (i2) {
                    case 0:
                        ui_delegate$lambda$0 = PollInfoActivity.ui_delegate$lambda$0(pollInfoActivity);
                        return ui_delegate$lambda$0;
                    default:
                        permissionManager_delegate$lambda$1 = PollInfoActivity.permissionManager_delegate$lambda$1(pollInfoActivity);
                        return permissionManager_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        this.permissionManager = kotlin.a.a(new sls(this) { // from class: swd0
            public final /* synthetic */ PollInfoActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ps11 ui_delegate$lambda$0;
                j40 permissionManager_delegate$lambda$1;
                int i22 = i2;
                PollInfoActivity pollInfoActivity = this.b;
                switch (i22) {
                    case 0:
                        ui_delegate$lambda$0 = PollInfoActivity.ui_delegate$lambda$0(pollInfoActivity);
                        return ui_delegate$lambda$0;
                    default:
                        permissionManager_delegate$lambda$1 = PollInfoActivity.permissionManager_delegate$lambda$1(pollInfoActivity);
                        return permissionManager_delegate$lambda$1;
                }
            }
        });
    }

    private final void applyInsets() {
        ai91.b(new g990(15), getUi().c.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 applyInsets$lambda$3(View view, n751 n751Var) {
        u1w g = n751Var.a.g(519);
        view.setPadding(g.a, g.b, g.c, g.d);
        return n751Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j40 getPermissionManager() {
        return (j40) this.permissionManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ps11 getUi() {
        return (ps11) this.ui.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j40 permissionManager_delegate$lambda$1(PollInfoActivity pollInfoActivity) {
        return new j40(pollInfoActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ps11 ui_delegate$lambda$0(PollInfoActivity pollInfoActivity) {
        return new ps11(pollInfoActivity);
    }

    @Override // com.yandex.messaging.activity.MessengerActivityBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Bundle extras;
        super.onCreate(savedInstanceState);
        setContentView(getUi().getRoot());
        if (savedInstanceState == null || (extras = savedInstanceState.getBundle(wwd0.class.getName())) == null) {
            extras = getIntent().getExtras();
        }
        wwd0 wwd0Var = extras != null ? new wwd0(extras) : null;
        z83.d(wwd0Var, null);
        if (wwd0Var == null) {
            return;
        }
        e.H(eja1.s(this), new jqr(((fcg) mt11.a(this)).b().b, new PollInfoActivity$onCreate$1(this, wwd0Var, null), 3));
        applyInsets();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        getPermissionManager().c(requestCode, permissions, grantResults);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putBundle(wwd0.class.getName(), getIntent().getExtras());
    }
}
