package xsna;

import android.app.Activity;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.vk.core.preference.Preference;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.c63;

/* compiled from: NotificationGdprServiceImpl.kt */
/* loaded from: classes.dex */
public final class aa70 implements z970 {
    public a a;

    /* compiled from: NotificationGdprServiceImpl.kt */
    /* loaded from: classes5.dex */
    public static final class a extends c63.b {
        public final /* synthetic */ Handler b;
        public final /* synthetic */ tzz c;
        public final /* synthetic */ Ref$BooleanRef d;
        public final /* synthetic */ aa70 e;
        public final /* synthetic */ io.reactivex.rxjava3.core.b f;

        public a(Handler handler, tzz tzzVar, Ref$BooleanRef ref$BooleanRef, aa70 aa70Var, io.reactivex.rxjava3.core.b bVar) {
            this.b = handler;
            this.c = tzzVar;
            this.d = ref$BooleanRef;
            this.e = aa70Var;
            this.f = bVar;
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            boolean hasCallbacks;
            Handler handler = this.b;
            tzz tzzVar = this.c;
            hasCallbacks = handler.hasCallbacks(tzzVar);
            if (hasCallbacks) {
                handler.removeCallbacks(tzzVar);
            } else if (this.d.element) {
                return;
            }
            int a = anj.a(activity, "android.permission.POST_NOTIFICATIONS");
            io.reactivex.rxjava3.core.b bVar = this.f;
            if (a == 0 || Preference.f("notification_gdpr_dialog").getBoolean("dialog_already_shown", false)) {
                bVar.onComplete();
                return;
            }
            boolean a2 = gz80.a(33);
            aa70 aa70Var = this.e;
            if (!a2) {
                i0q0.f(new s2b(activity, aa70Var, bVar, 7));
                return;
            }
            if (aa70.b(activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null)) {
                return;
            }
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            permissionHelper.d(activity, PermissionHelper.b, R.string.vk_permissions_notifications, R.string.vk_permissions_notifications, new yq1(13, aa70Var, bVar), new defpackage.o(28, aa70Var, bVar));
        }
    }

    public static boolean b(AppCompatActivity appCompatActivity) {
        if (appCompatActivity == null) {
            return false;
        }
        Fragment H = appCompatActivity.getSupportFragmentManager().H("PermissionFragmentTag");
        com.vk.permission.d dVar = H instanceof com.vk.permission.d ? (com.vk.permission.d) H : null;
        return dVar != null && dVar.isAdded();
    }

    @Override // xsna.z970
    public final io.reactivex.rxjava3.core.a a() {
        return (!gz80.a(33) || Preference.f("notification_gdpr_dialog").getBoolean("dialog_already_shown", false)) ? io.reactivex.rxjava3.internal.operators.completable.i.b : new io.reactivex.rxjava3.internal.operators.completable.e(new qu50(this, 2));
    }
}
