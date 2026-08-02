package com.yandex.messaging.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import androidx.fragment.app.Fragment;
import defpackage.dlb1;
import defpackage.f02;
import defpackage.hi91;
import defpackage.i3y;
import defpackage.ids;
import defpackage.jxi;
import defpackage.n751;
import defpackage.noh;
import defpackage.s120;
import defpackage.u1w;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0011\u00101\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/yandex/messaging/navigation/BaseMessengerFragment;", "Ls120;", "T", "Landroidx/fragment/app/Fragment;", "", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;)V", "Landroid/os/Bundle;", "args", "", "onNewArgs", "(Landroid/os/Bundle;)Z", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "", "requestCode", "", "", "permissions", "", "grantResults", "Lzy11;", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "scrollToTop", "()V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Lnoh;", "getActivityComponentAsync", "()Lnoh;", "Lcom/yandex/alicekit/core/permissions/b;", "permissionManager$delegate", "Li3y;", "getPermissionManager", "()Lcom/yandex/alicekit/core/permissions/b;", "permissionManager", "getArguments", "()Ls120;", "arguments", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class BaseMessengerFragment<T extends s120> extends Fragment {
    public static final int $stable = 8;
    private final Activity activity;
    private final noh activityComponentAsync;

    /* renamed from: permissionManager$delegate, reason: from kotlin metadata */
    private final i3y permissionManager = kotlin.a.a(new f02(24, this));

    public BaseMessengerFragment(Activity activity, noh nohVar) {
        this.activity = activity;
        this.activityComponentAsync = nohVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ids permissionManager_delegate$lambda$0(BaseMessengerFragment baseMessengerFragment) {
        return new ids(baseMessengerFragment);
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final noh getActivityComponentAsync() {
        return this.activityComponentAsync;
    }

    public final T getArguments() {
        return (T) dlb1.b(requireArguments());
    }

    public final com.yandex.alicekit.core.permissions.b getPermissionManager() {
        return (com.yandex.alicekit.core.permissions.b) this.permissionManager.getValue();
    }

    public WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
        u1w g = n751.h(null, insets).a.g(527);
        hi91.i(g.a, g.b, g.c, g.d, v);
        return insets;
    }

    public boolean onNewArgs(Bundle args) {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @jxi
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        getPermissionManager().c(requestCode, permissions, grantResults);
    }

    public void scrollToTop() {
    }
}
