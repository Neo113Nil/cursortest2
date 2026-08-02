package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.hihealth.HuaweiHiHealth;
import com.huawei.hms.hihealth.data.Scopes;
import com.huawei.hms.hihealth.result.HealthKitAuthResult;
import com.huawei.hms.support.account.AccountAuthManager;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.feature.request.AbstractAuthParams;
import com.vk.superapp.vkhealth.permissions.api.HuaweiHealthAuthorizationError;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: VkHealthHuaweiHealthPermissionsProvider.kt */
/* loaded from: classes6.dex */
public final class yxu0 {
    public static gzs<s3q0> e;
    public static gzs<s3q0> f;
    public static boolean g;
    public static final String[] h;
    public static final ArrayList i;
    public static final /* synthetic */ qcy<Object>[] b = {new MutablePropertyReference1Impl(yxu0.class, "currentAccountId", "getCurrentAccountId()Ljava/lang/String;", 0), p5j.a(0, yxu0.class, "isHuaweiPermissionGranted", "isHuaweiPermissionGranted()Z", fpf0.a)};
    public static final yxu0 a = new yxu0();
    public static final tw8 c = new tw8("VkHealthHuaweiHealthPermissionsProvider", "pref_vk_run_huawei_current_account_id");
    public static final f18 d = new f18("VkHealthHuaweiHealthPermissionsProvider", "pref_vk_run_huawei_permissions_granted", false);

    static {
        String[] strArr = {Scopes.HEALTHKIT_STEP_READ, Scopes.HEALTHKIT_DISTANCE_READ};
        h = strArr;
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.add(new Scope(strArr[i2]));
        }
        i = arrayList;
    }

    public static boolean c(Context context) {
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context) == 0;
    }

    public final boolean a(Throwable th) {
        if (!(th instanceof HuaweiHealthAuthorizationError)) {
            return false;
        }
        g(false);
        g = true;
        return true;
    }

    public final boolean b() {
        AuthAccount authResult = AccountAuthManager.getAuthResult();
        if (g) {
            return false;
        }
        if (authResult != null) {
            return AccountAuthManager.containScopes(authResult, i);
        }
        qcy<Object> qcyVar = b[1];
        return d.a().booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        if (xsna.myc0.k(r10, r11, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (xsna.myc0.k(r10, r11, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
    
        if (xsna.myc0.k(r11, r12, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, int i2, int i3, Intent intent, ContinuationImpl continuationImpl) {
        uxu0 uxu0Var;
        int i4;
        if (continuationImpl instanceof uxu0) {
            uxu0Var = (uxu0) continuationImpl;
            int i5 = uxu0Var.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                uxu0Var.label = i5 - Integer.MIN_VALUE;
                Object obj = uxu0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = uxu0Var.label;
                if (i4 != 0) {
                    kotlin.a.a(obj);
                    if (i2 != 4727) {
                        return s3q0.a;
                    }
                    if (e == null || f == null) {
                        xgx0.a.getClass();
                        xgx0.a("VkHealthHuaweiHealthPermissionsProvider.onActivityResult() -> no active callback that can process result. Handling skipped");
                        return s3q0.a;
                    }
                    xgx0 xgx0Var = xgx0.a;
                    StringBuilder a2 = odj.a(i2, i3, "VkHealthHuaweiHealthPermissionsProvider.onActivityResult() -> requestCode: ", ", resultCode: ", ", intent: ");
                    a2.append(intent);
                    a2.append(", thread: ");
                    a2.append(Thread.currentThread().getName());
                    String sb = a2.toString();
                    xgx0Var.getClass();
                    xgx0.a(sb);
                    if (i3 != -1) {
                        gzs<s3q0> gzsVar = f;
                        if (gzsVar != null) {
                            gzsVar.invoke();
                        }
                        return s3q0.a;
                    }
                    HealthKitAuthResult parseHealthKitAuthResultFromIntent = HuaweiHiHealth.getSettingController(context).parseHealthKitAuthResultFromIntent(intent);
                    if (parseHealthKitAuthResultFromIntent != null) {
                        if (!parseHealthKitAuthResultFromIntent.isSuccess()) {
                            ovj io2 = dgn0.f().getIo();
                            vxu0 vxu0Var = new vxu0(2, null);
                            uxu0Var.label = 1;
                        } else if (parseHealthKitAuthResultFromIntent.getAuthAccount() == null) {
                            ovj io3 = dgn0.f().getIo();
                            wxu0 wxu0Var = new wxu0(2, null);
                            uxu0Var.label = 2;
                        } else {
                            ovj io4 = dgn0.f().getIo();
                            xxu0 xxu0Var = new xxu0(parseHealthKitAuthResultFromIntent, null);
                            uxu0Var.label = 3;
                        }
                        return coroutineSingletons;
                    }
                    gzs<s3q0> gzsVar2 = f;
                    if (gzsVar2 != null) {
                        gzsVar2.invoke();
                    }
                } else if (i4 == 1) {
                    kotlin.a.a(obj);
                    gzs<s3q0> gzsVar3 = f;
                    if (gzsVar3 != null) {
                        gzsVar3.invoke();
                    }
                } else if (i4 == 2) {
                    kotlin.a.a(obj);
                    gzs<s3q0> gzsVar4 = f;
                    if (gzsVar4 != null) {
                        gzsVar4.invoke();
                    }
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    g = false;
                    qcy<Object> qcyVar = b[1];
                    if (d.a().booleanValue()) {
                        gzs<s3q0> gzsVar5 = e;
                        if (gzsVar5 != null) {
                            gzsVar5.invoke();
                        }
                    } else {
                        gzs<s3q0> gzsVar6 = f;
                        if (gzsVar6 != null) {
                            gzsVar6.invoke();
                        }
                    }
                }
                e = null;
                f = null;
                return s3q0.a;
            }
        }
        uxu0Var = new uxu0(this, continuationImpl);
        Object obj2 = uxu0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = uxu0Var.label;
        if (i4 != 0) {
        }
        e = null;
        f = null;
        return s3q0.a;
    }

    public final void e(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        Activity a2 = kxu0Var.a();
        if (a2 == null || a2.isDestroyed() || a2.isFinishing()) {
            gzsVar2.invoke();
            return;
        }
        if (b()) {
            gzsVar.invoke();
            return;
        }
        e = gzsVar;
        f = gzsVar2;
        Intent requestAuthorizationIntent = HuaweiHiHealth.getSettingController(a2).requestAuthorizationIntent((String[]) jw5.y(AbstractAuthParams.OPENID.getScopeUri(), h), true);
        Fragment fragment = kxu0Var.a;
        if (fragment != null) {
            fragment.startActivityForResult(requestAuthorizationIntent, 4727);
            return;
        }
        Activity a3 = kxu0Var.a();
        if (a3 != null) {
            a3.startActivityForResult(requestAuthorizationIntent, 4727);
        }
    }

    public final void f(kxu0 kxu0Var, cg1 cg1Var, xm6 xm6Var) {
        Activity a2 = kxu0Var.a();
        if (a2 == null || a2.isDestroyed() || a2.isFinishing()) {
            xm6Var.invoke();
        } else {
            if (!b()) {
                cg1Var.invoke();
                return;
            }
            Task<Void> cancelAuthorization = HuaweiHiHealth.getConsentsController(a2).cancelAuthorization(false);
            cancelAuthorization.c(new xqg0(1, cancelAuthorization, cg1Var));
            cancelAuthorization.b(new hl30(xm6Var, 21));
        }
    }

    public final void g(boolean z) {
        qcy<Object> qcyVar = b[1];
        d.b(z);
    }
}
