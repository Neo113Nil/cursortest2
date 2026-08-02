package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.type.DeniedReason;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vk.superapp.vkhealth.permissions.api.type.PermissionsResult;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.d1v;
import xsna.g0v;

/* compiled from: VkHealthPermissionsManager.kt */
/* loaded from: classes11.dex */
public interface ayu0 {
    public static final a a = a.a;

    /* compiled from: VkHealthPermissionsManager.kt */
    /* loaded from: classes6.dex */
    public static final class b {
    }

    Set<String> a(RequestedMiniApp requestedMiniApp);

    boolean b(Context context);

    void c(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2);

    void d(d1v.b bVar);

    void e(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, RequestedMiniApp requestedMiniApp);

    void f(Throwable th);

    Intent g();

    MobileServicesType h(Context context);

    void i(Context context, xgb0 xgb0Var);

    void j(Context context, RequestedMiniApp requestedMiniApp, izs<? super Throwable, s3q0> izsVar, izs<? super iyu0, s3q0> izsVar2);

    boolean k(Throwable th);

    void l(Context context, ee8 ee8Var);

    void m(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, RequestedMiniApp requestedMiniApp);

    void n(kxu0 kxu0Var, cg1 cg1Var, xm6 xm6Var);

    void o(Context context, int i, Intent intent, int i2);

    /* compiled from: VkHealthPermissionsManager.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final iyu0 b = new iyu0(false, false, false, false, false, new g0v.a((DeniedReason) null, 3), HealthConnectSdkStatus.UNAVAILABLE, MobileServicesType.NONE);
        private static final ayu0 STUB = new C2580a();

        public static ayu0 a() {
            return STUB;
        }

        /* compiled from: VkHealthPermissionsManager.kt */
        /* renamed from: xsna.ayu0$a$a, reason: collision with other inner class name */
        public static final class C2580a implements ayu0 {
            @Override // xsna.ayu0
            public final Set<String> a(RequestedMiniApp requestedMiniApp) {
                return EmptySet.b;
            }

            @Override // xsna.ayu0
            public final boolean b(Context context) {
                return false;
            }

            @Override // xsna.ayu0
            public final Intent g() {
                return new Intent();
            }

            @Override // xsna.ayu0
            public final MobileServicesType h(Context context) {
                return MobileServicesType.NONE;
            }

            @Override // xsna.ayu0
            public final void i(Context context, xgb0 xgb0Var) {
                xgb0Var.invoke(PermissionsResult.DENIED);
            }

            @Override // xsna.ayu0
            public final void j(Context context, RequestedMiniApp requestedMiniApp, izs<? super Throwable, s3q0> izsVar, izs<? super iyu0, s3q0> izsVar2) {
                izsVar2.invoke(a.b);
            }

            @Override // xsna.ayu0
            public final boolean k(Throwable th) {
                return false;
            }

            @Override // xsna.ayu0
            public final void d(d1v.b bVar) {
            }

            @Override // xsna.ayu0
            public final void f(Throwable th) {
            }

            @Override // xsna.ayu0
            public final void l(Context context, ee8 ee8Var) {
            }

            @Override // xsna.ayu0
            public final void c(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
            }

            @Override // xsna.ayu0
            public final void n(kxu0 kxu0Var, cg1 cg1Var, xm6 xm6Var) {
            }

            @Override // xsna.ayu0
            public final void e(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, RequestedMiniApp requestedMiniApp) {
            }

            @Override // xsna.ayu0
            public final void m(kxu0 kxu0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, RequestedMiniApp requestedMiniApp) {
            }

            @Override // xsna.ayu0
            public final void o(Context context, int i, Intent intent, int i2) {
            }
        }
    }
}
