package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fitness.data.DataType;
import com.vk.superapp.bridges.dto.analytics.VkRunPermissionItem;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.dyu0;
import xsna.omr;

/* compiled from: VkHealthGoogleFitPermissionsProvider.kt */
/* loaded from: classes6.dex */
public final class oxu0 {
    public static final oxu0 a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final tw8 c;
    public static fyu0 d;
    public static gyu0 e;
    public static final omr f;
    public static final omr g;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(oxu0.class, "currentAccountId", "getCurrentAccountId()Ljava/lang/String;", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
        a = new oxu0();
        c = new tw8("VkHealthGoogleFitPermissionsProvider", "pref_google_fit_current_account_id");
        omr.a aVar = new omr.a();
        DataType dataType = DataType.m;
        aVar.a(dataType);
        DataType dataType2 = DataType.f;
        aVar.a(dataType2);
        f = new omr(aVar);
        omr.a aVar2 = new omr.a();
        aVar2.a(dataType);
        aVar2.a(dataType2);
        aVar2.a(DataType.h);
        g = new omr(aVar2);
    }

    public static boolean a(Context context, RequestedMiniApp requestedMiniApp) {
        RequestedMiniApp requestedMiniApp2 = RequestedMiniApp.VK_STEPS;
        omr omrVar = g;
        omr omrVar2 = f;
        GoogleSignInAccount a2 = com.google.android.gms.auth.api.signin.a.a(context, requestedMiniApp == requestedMiniApp2 ? omrVar2 : omrVar);
        String str = a2.b;
        if (str == null) {
            str = "";
        }
        qcy<Object> qcyVar = b[0];
        c.g(str);
        if (requestedMiniApp == requestedMiniApp2) {
            omrVar = omrVar2;
        }
        exc0.j(omrVar, "Please provide a non-null GoogleSignInOptionsExtension");
        Scope[] c2 = com.google.android.gms.auth.api.signin.a.c(omrVar.a());
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, c2);
        boolean containsAll = new HashSet(a2.j).containsAll(hashSet);
        xgx0 xgx0Var = xgx0.a;
        StringBuilder sb = new StringBuilder("VkHealthGoogleFitPermissionsProvider.isGoogleFitPermissionsAvailable() -> isGoogleFitPermissionsGranted ");
        sb.append(containsAll);
        sb.append(", thread: ");
        mft0.a(sb, xgx0Var);
        return containsAll;
    }

    public static Object c(kxu0 kxu0Var, RequestedMiniApp requestedMiniApp, fyu0 fyu0Var, gyu0 gyu0Var, dyu0.c cVar) {
        Activity a2 = kxu0Var.a();
        if (a2 == null || a2.isDestroyed() || a2.isFinishing()) {
            Object invoke = gyu0Var.invoke(cVar);
            return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : s3q0.a;
        }
        d = fyu0Var;
        e = gyu0Var;
        RequestedMiniApp requestedMiniApp2 = RequestedMiniApp.VK_STEPS;
        omr omrVar = g;
        omr omrVar2 = f;
        GoogleSignInAccount a3 = com.google.android.gms.auth.api.signin.a.a(a2, requestedMiniApp == requestedMiniApp2 ? omrVar2 : omrVar);
        String str = a3.b;
        if (str == null) {
            str = "";
        }
        qcy<Object> qcyVar = b[0];
        c.g(str);
        int i = requestedMiniApp == requestedMiniApp2 ? Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE : Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE;
        if (requestedMiniApp == requestedMiniApp2) {
            omrVar = omrVar2;
        }
        Fragment fragment = kxu0Var.a;
        if (fragment != null) {
            Scope[] c2 = com.google.android.gms.auth.api.signin.a.c(omrVar.a());
            exc0.j(c2, "Please provide at least one scope");
            fragment.startActivityForResult(com.google.android.gms.auth.api.signin.a.b(fragment.getActivity(), a3, c2), i);
        } else {
            Activity a4 = kxu0Var.a();
            if (a4 != null) {
                Scope[] c3 = com.google.android.gms.auth.api.signin.a.c(omrVar.a());
                exc0.j(c3, "Please provide at least one scope");
                a4.startActivityForResult(com.google.android.gms.auth.api.signin.a.b(a4, a3, c3), i);
            }
        }
        return s3q0.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(1:(4:15|16|17|18)(2:12|13))(3:20|21|22))(2:39|(2:45|(2:63|64)(7:49|(1:51)(1:62)|52|(1:54)(1:61)|55|(1:57)(1:60)|(2:59|33)))(2:43|44))|23|(1:25)(1:38)|26|(5:28|(2:30|(2:32|33))|16|17|18)(5:34|(1:36)|16|17|18)|65|66|17|18))|67|6|7|(0)(0)|23|(0)(0)|26|(0)(0)|65|66|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
    
        if (r11.invoke(r1) == r2) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:15:0x002c, B:16:0x0100, B:21:0x0044, B:23:0x00c4, B:26:0x00d9, B:28:0x00de, B:30:0x00e2, B:34:0x00ef, B:36:0x00f3, B:49:0x0064, B:51:0x009a, B:55:0x00a5, B:60:0x00bf, B:62:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:15:0x002c, B:16:0x0100, B:21:0x0044, B:23:0x00c4, B:26:0x00d9, B:28:0x00de, B:30:0x00e2, B:34:0x00ef, B:36:0x00f3, B:49:0x0064, B:51:0x009a, B:55:0x00a5, B:60:0x00bf, B:62:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, int i, int i2, Intent intent, ContinuationImpl continuationImpl) {
        nxu0 nxu0Var;
        int i3;
        RequestedMiniApp requestedMiniApp;
        boolean a2;
        udx0 udx0Var;
        if (continuationImpl instanceof nxu0) {
            nxu0Var = (nxu0) continuationImpl;
            int i4 = nxu0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nxu0Var.label = i4 - Integer.MIN_VALUE;
                Object obj = nxu0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = nxu0Var.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    if (i != 114 && i != 115) {
                        return s3q0.a;
                    }
                    if (d == null || e == null) {
                        xgx0.a.getClass();
                        xgx0.a("VkHealthGoogleFitPermissionsProvider.onActivityResult() -> no active callback that can process result. Handling skipped");
                        return s3q0.a;
                    }
                    xgx0 xgx0Var = xgx0.a;
                    String str = "VkHealthGoogleFitPermissionsProvider.onActivityResult() -> requestCode: " + i + ", resultCode: " + i2 + ", intent: " + intent + ", thread: " + Thread.currentThread().getName();
                    xgx0Var.getClass();
                    xgx0.a(str);
                    requestedMiniApp = i == 114 ? RequestedMiniApp.VK_STEPS : RequestedMiniApp.VK_WORKOUT;
                    boolean z = i2 == -1;
                    nxu0Var.L$0 = context;
                    nxu0Var.L$1 = requestedMiniApp;
                    nxu0Var.label = 1;
                    Object k = myc0.k(dgn0.f().getIo(), new lxu0(z, null), nxu0Var);
                    if (k != obj2) {
                        k = s3q0.a;
                    }
                    if (k == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2 && i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        d = null;
                        e = null;
                        return s3q0.a;
                    }
                    RequestedMiniApp requestedMiniApp2 = (RequestedMiniApp) nxu0Var.L$1;
                    Context context2 = (Context) nxu0Var.L$0;
                    kotlin.a.a(obj);
                    requestedMiniApp = requestedMiniApp2;
                    context = context2;
                }
                a2 = a(context, requestedMiniApp);
                List<VkRunPermissionItem> singletonList = Collections.singletonList(new VkRunPermissionItem(VkRunPermissionItem.VkRunPermission.GOOGLE_FIT, a2));
                udx0Var = e370.i;
                if (udx0Var != null) {
                    udx0Var = null;
                }
                udx0Var.e(singletonList);
                if (a2) {
                    gyu0 gyu0Var = e;
                    if (gyu0Var != null) {
                        nxu0Var.L$0 = null;
                        nxu0Var.L$1 = null;
                        nxu0Var.label = 3;
                    }
                    d = null;
                    e = null;
                    return s3q0.a;
                }
                fyu0 fyu0Var = d;
                if (fyu0Var != null) {
                    nxu0Var.L$0 = null;
                    nxu0Var.L$1 = null;
                    nxu0Var.label = 2;
                    if (fyu0Var.invoke(nxu0Var) == obj2) {
                        return obj2;
                    }
                }
                d = null;
                e = null;
                return s3q0.a;
                xgx0 xgx0Var2 = xgx0.a;
                String str2 = "\nVkHealthGoogleFitPermissionsProvider.onActivityResult() -> Error dew to method evaluation. This could cause a bug for WebApps\nthrowable: " + th + ",\nstackTrace: " + mnh0.A(th) + ",\nthread: " + Thread.currentThread().getName();
                xgx0Var2.getClass();
                xgx0.b(str2);
                return s3q0.a;
            }
        }
        nxu0Var = new nxu0(this, continuationImpl);
        Object obj3 = nxu0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = nxu0Var.label;
        if (i3 != 0) {
        }
        a2 = a(context, requestedMiniApp);
        List<VkRunPermissionItem> singletonList2 = Collections.singletonList(new VkRunPermissionItem(VkRunPermissionItem.VkRunPermission.GOOGLE_FIT, a2));
        udx0Var = e370.i;
        if (udx0Var != null) {
        }
        udx0Var.e(singletonList2);
        if (a2) {
        }
        xgx0 xgx0Var22 = xgx0.a;
        String str22 = "\nVkHealthGoogleFitPermissionsProvider.onActivityResult() -> Error dew to method evaluation. This could cause a bug for WebApps\nthrowable: " + th + ",\nstackTrace: " + mnh0.A(th) + ",\nthread: " + Thread.currentThread().getName();
        xgx0Var22.getClass();
        xgx0.b(str22);
        return s3q0.a;
    }
}
