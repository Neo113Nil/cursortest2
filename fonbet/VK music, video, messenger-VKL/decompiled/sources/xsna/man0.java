package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.ui.SuperAppFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SuperAppPermissionController.kt */
/* loaded from: classes6.dex */
public final class man0 {
    public final WeakReference<Fragment> a;
    public final WeakReference<Runnable> b;
    public boolean c;

    /* compiled from: SuperAppPermissionController.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((man0) this.receiver).a();
            return s3q0.a;
        }
    }

    public man0(SuperAppFragment superAppFragment, a72 a72Var) {
        this.a = new WeakReference<>(superAppFragment);
        this.b = new WeakReference<>(a72Var);
    }

    public final void a() {
        Fragment fragment = this.a.get();
        Context mo2getContext = fragment != null ? fragment.mo2getContext() : null;
        if (mo2getContext == null) {
            return;
        }
        if (!q7n0.a().d().b(mo2getContext)) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            PermissionHelper.g(permissionHelper, mo2getContext, PermissionHelper.h, PermissionHelper.i, 0, R.string.vk_widget_request_geo_permission_rationale, new a(0, this, man0.class, "requestGeoPermission", "requestGeoPermission()V", 0), null, null, 200);
        } else {
            if (!q7n0.a().d().c(mo2getContext)) {
                q7n0.a().d().a(mo2getContext, new y3l0(this, 8), new e20(28));
                return;
            }
            Runnable runnable = this.b.get();
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
