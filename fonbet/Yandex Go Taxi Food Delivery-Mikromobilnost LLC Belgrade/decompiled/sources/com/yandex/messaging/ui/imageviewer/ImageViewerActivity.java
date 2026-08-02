package com.yandex.messaging.ui.imageviewer;

import android.content.Context;
import android.os.Bundle;
import com.yandex.messaging.activity.MessengerActivityBase;
import defpackage.fcg;
import defpackage.i3y;
import defpackage.j40;
import defpackage.jhv;
import defpackage.l7;
import defpackage.mt11;
import defpackage.nka1;
import defpackage.onp0;
import defpackage.os11;
import defpackage.q5z;
import defpackage.rz10;
import defpackage.tzt;
import defpackage.z8g;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J/\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/messaging/ui/imageviewer/ImageViewerActivity;", "Lcom/yandex/messaging/activity/MessengerActivityBase;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "outState", "onSaveInstanceState", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "Los11;", "ui$delegate", "Li3y;", "getUi", "()Los11;", "ui", "Lcom/yandex/alicekit/core/permissions/b;", "permissionManager", "Lcom/yandex/alicekit/core/permissions/b;", "Ljhv;", "brick", "Ljhv;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ImageViewerActivity extends MessengerActivityBase {
    public static final int $stable = 8;
    private jhv brick;

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui = kotlin.a.a(new tzt(9, this));
    private final com.yandex.alicekit.core.permissions.b permissionManager = new j40(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final os11 getUi() {
        return (os11) this.ui.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final os11 ui_delegate$lambda$0(ImageViewerActivity imageViewerActivity) {
        return new os11(imageViewerActivity);
    }

    @Override // com.yandex.messaging.activity.MessengerActivityBase, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override // com.yandex.messaging.activity.MessengerActivityBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        applyForcedDarkThemeOverlay();
        super.onCreate(savedInstanceState);
        setContentView(getUi().getRoot());
        e.H(nka1.c(this), new l7(14, ((fcg) mt11.a(this)).b().b, this, savedInstanceState));
        rz10 rz10Var = ((z8g) onp0.a(this)).a.k;
        q5z.i(rz10Var);
        if (rz10Var.a.a) {
            postponeEnterTransition();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.permissionManager.getClass();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        this.permissionManager.c(requestCode, permissions, grantResults);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        jhv jhvVar = this.brick;
        if (jhvVar != null) {
            jhvVar.onSaveInstanceState(outState);
        }
    }
}
