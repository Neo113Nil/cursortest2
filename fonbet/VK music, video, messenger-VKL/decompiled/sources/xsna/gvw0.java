package xsna;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.permission.PermissionHelper;
import com.vk.voip.ui.permissions.OverlayPermissionFragment;
import com.vkontakte.android.R;
import java.util.Arrays;
import kotlin.Pair;
import xsna.hvw0;

/* compiled from: VoipPermissions.kt */
/* loaded from: classes7.dex */
public final class gvw0 {
    public final Context a;
    public final ivw0 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public /* synthetic */ gvw0(Context context) {
        this(context, null);
    }

    public static void a(Context context) {
        if (!(context instanceof FragmentActivity)) {
            throw new UnsupportedOperationException("Context is not instant of FragmentActivity!");
        }
    }

    public static void j(gvw0 gvw0Var, gzs gzsVar, gzs gzsVar2, int i) {
        Integer valueOf = Integer.valueOf(R.string.superapp_pip_permission_message);
        gzs gzsVar3 = (i & 2) != 0 ? null : gzsVar2;
        Integer num = (i & 4) != 0 ? null : valueOf;
        final boolean z = (i & 8) != 0;
        if (Settings.canDrawOverlays(gvw0Var.a)) {
            gzsVar.invoke();
        } else {
            gvw0Var.d = true;
            gvw0Var.f(new gzs() { // from class: xsna.fvw0
                @Override // xsna.gzs
                public final Object invoke() {
                    OverlayPermissionFragment overlayPermissionFragment = new OverlayPermissionFragment();
                    overlayPermissionFragment.setArguments(yfb.b(new Pair("IS_FORCED_NIGHT_THEME_KEY", Boolean.valueOf(z))));
                    return overlayPermissionFragment;
                }
            }, new asy(num, gvw0Var, gzsVar, gzsVar3, 3), new noq0(2, gvw0Var, gzsVar3));
        }
    }

    public final boolean b() {
        PermissionHelper.a.getClass();
        return tvo.a(this.a, (String[]) Arrays.copyOf(new String[0], 0));
    }

    public final boolean c() {
        int unsafeCheckOpNoThrow;
        Context context = this.a;
        Object systemService = context.getSystemService("appops");
        Integer num = null;
        AppOpsManager appOpsManager = systemService instanceof AppOpsManager ? (AppOpsManager) systemService : null;
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (gz80.a(29)) {
            if (appOpsManager != null) {
                unsafeCheckOpNoThrow = appOpsManager.unsafeCheckOpNoThrow("android:picture_in_picture", myUid, packageName);
                num = Integer.valueOf(unsafeCheckOpNoThrow);
            }
        } else if (gz80.a(26) && appOpsManager != null) {
            num = Integer.valueOf(appOpsManager.checkOpNoThrow("android:picture_in_picture", myUid, packageName));
        }
        return num != null && num.intValue() == 0;
    }

    public final boolean d() {
        PermissionHelper.a.getClass();
        return tvo.a(this.a, (String[]) Arrays.copyOf(new String[0], 0));
    }

    public final boolean e() {
        return this.c || this.d || this.e || this.g || this.i || this.h || this.f;
    }

    public final <T extends Fragment> void f(gzs<? extends T> gzsVar, izs<? super T, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        Context context = this.a;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null) {
            throw new UnsupportedOperationException("Context is not instant of FragmentActivity!");
        }
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new w8c0(gzsVar, fragmentActivity, izsVar, izsVar2, 1));
        ea0.a(fragmentActivity, new w2j0(handler, 27));
    }

    public final void g(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        a(this.a);
        this.i = true;
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.l(permissionHelper, this.a, PermissionHelper.l, new wo1(22, this, gzsVar), new npw0(1, this, gzsVar2), 4);
    }

    public final void h(gzs<s3q0> gzsVar, wzs<? super Boolean, ? super Boolean, s3q0> wzsVar) {
        a(this.a);
        this.i = true;
        this.h = true;
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.l(permissionHelper, this.a, PermissionHelper.v, new gnx0(1, this, gzsVar), new ydn0(5, this, wzsVar), 4);
    }

    public final void i(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        a(this.a);
        this.h = true;
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.l(permissionHelper, this.a, PermissionHelper.m, new xm6(20, this, gzsVar), new g6m0(9, this, gzsVar2), 4);
    }

    public gvw0(Context context, ivw0 ivw0Var) {
        this.a = context;
        this.b = ivw0Var;
        if (ivw0Var == null || !d()) {
            return;
        }
        ivw0Var.b.onNext(hvw0.a.a);
    }
}
