package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.yandex.messaging.activity.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class do3 extends ss11 implements cl3 {
    public static final /* synthetic */ kgx[] I = {new MutablePropertyReference1Impl("profileSubscription", 0, "getProfileSubscription()Lcom/yandex/alicekit/core/Disposable;", do3.class), oyr.B(qoi0.a, do3.class, "authStateSubscription", "getAuthStateSubscription()Lcom/yandex/alicekit/core/Disposable;", 0), new MutablePropertyReference1Impl("reloginSubscription", 0, "getReloginSubscription()Lcom/yandex/alicekit/core/Disposable;", do3.class), new MutablePropertyReference1Impl("accountChooseSubscription", 0, "getAccountChooseSubscription()Lcom/yandex/alicekit/core/Disposable;", do3.class)};
    public final Bundle A;
    public boolean B;
    public final qp3 C;
    public final qp3 D;
    public final qp3 E;
    public final qp3 F;
    public dzj0 G;
    public vbb H;
    public final nyv a;
    public final Activity b;
    public final pu31 c;
    public final b w;
    public final x22 x;
    public final am2 y;
    public final rz10 z;

    public do3(nyv nyvVar, Activity activity, pu31 pu31Var, b bVar, x22 x22Var, am2 am2Var, rz10 rz10Var, Bundle bundle, Bundle bundle2) {
        this.a = nyvVar;
        this.b = activity;
        this.c = pu31Var;
        this.w = bVar;
        this.x = x22Var;
        this.y = am2Var;
        this.z = rz10Var;
        this.A = bundle;
        this.B = bundle2 != null ? bundle2.getBoolean("extra_auth_in_progress", false) : false;
        this.C = new qp3();
        this.D = new qp3();
        this.E = new qp3();
        this.F = new qp3();
    }

    @Override // defpackage.cl3
    public final void b() {
        Closeable closeable;
        if (this.B) {
            return;
        }
        tje.e();
        this.x.c("am account request", CRLReasonCodeExtension.REASON, r());
        int i = 1;
        this.B = true;
        if (this.z.f) {
            am2 am2Var = this.y;
            if (((SharedPreferences) ((i3y) am2Var.c).getValue()).getBoolean("auto_login_enabled", true)) {
                kgx[] kgxVarArr = I;
                kgx kgxVar = kgxVarArr[3];
                qp3 qp3Var = this.F;
                qp3Var.b(null);
                vbb vbbVar = this.H;
                if (vbbVar == null) {
                    ny61.r("Cannot create filter because activityComponent is not initialized");
                    return;
                }
                vh3 c = vbbVar.R().c();
                co3 co3Var = new co3(this, i);
                if (((SharedPreferences) ((i3y) am2Var.c).getValue()).getBoolean("auto_login_enabled", true)) {
                    closeable = new v94(c, (qp90) am2Var.b, co3Var);
                } else {
                    co3Var.invoke(null);
                    closeable = e1k.M1;
                }
                kgx kgxVar2 = kgxVarArr[3];
                qp3Var.b(closeable);
                return;
            }
        }
        s();
    }

    @Override // defpackage.cl3
    public final void d() {
    }

    @Override // defpackage.cl3
    public final void e() {
        Activity activity = this.b;
        activity.setResult(-1);
        activity.finish();
    }

    @Override // defpackage.cl3
    public final void g() {
        Intent a;
        Bundle bundle = this.A;
        boolean z = bundle != null ? bundle.getBoolean("phone_required", true) : true;
        Activity activity = this.b;
        if (!z) {
            activity.setResult(-1);
            activity.finish();
        } else {
            if (this.B) {
                return;
            }
            tje.e();
            this.x.c("am phone number request", CRLReasonCodeExtension.REASON, r());
            this.B = true;
            vbb vbbVar = this.H;
            if (vbbVar == null || (a = vbbVar.R().a(null)) == null) {
                return;
            }
            activity.startActivityForResult(a, 2);
        }
    }

    @Override // defpackage.cl3
    public final void h() {
    }

    @Override // com.yandex.bricks.Brick
    public final void onActivityResult(int i, int i2, Intent intent) {
        vbb vbbVar = this.H;
        if (vbbVar == null) {
            if (intent != null) {
                this.G = new dzj0(i, i2, intent);
                return;
            }
            return;
        }
        this.B = false;
        if (i == 1) {
            this.x.f("am account answer", "answer", i2 == -1 ? "success" : "fail", CRLReasonCodeExtension.REASON, r());
            vbbVar.Q().b(i2, intent);
        } else if (i == 2) {
            this.x.f("am phone number answer", "answer", i2 == -1 ? "success" : "fail", CRLReasonCodeExtension.REASON, r());
            vbbVar.Q().a(i2);
        }
        if (i2 != -1) {
            Activity activity = this.b;
            activity.setResult(0);
            activity.finish();
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        this.c.a(getView(), "authorize modal activity", null);
        co3 co3Var = new co3(this, 0);
        b bVar = this.w;
        vpp0 vpp0Var = new vpp0(bVar.a, bVar, co3Var);
        kgx kgxVar = I[0];
        this.C.b(vpp0Var);
        dzj0 dzj0Var = this.G;
        if (dzj0Var == null) {
            return;
        }
        this.G = null;
        if (this.B) {
            onActivityResult(dzj0Var.a, dzj0Var.b, dzj0Var.c);
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        kgx[] kgxVarArr = I;
        kgx kgxVar = kgxVarArr[1];
        this.D.b(null);
        kgx kgxVar2 = kgxVarArr[2];
        this.E.b(null);
        kgx kgxVar3 = kgxVarArr[0];
        this.C.b(null);
        kgx kgxVar4 = kgxVarArr[3];
        this.F.b(null);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickPause() {
        super.onBrickPause();
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) this.a.w;
        if (animatedVectorDrawableCompat != null) {
            animatedVectorDrawableCompat.stop();
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickResume() {
        super.onBrickResume();
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) this.a.w;
        if (animatedVectorDrawableCompat != null) {
            animatedVectorDrawableCompat.start();
        }
    }

    @Override // defpackage.ss11
    public final ms11 q() {
        return this.a;
    }

    public final String r() {
        String string;
        Bundle bundle = this.A;
        return (bundle == null || (string = bundle.getString(CRLReasonCodeExtension.REASON)) == null) ? StringUtils.UNDEFINED : string;
    }

    public final void s() {
        Intent i;
        vbb vbbVar = this.H;
        if (vbbVar != null) {
            oo90 R = vbbVar.R();
            hj3 hj3Var = new hj3(R.c(), R.a.a(), new bm3(true), r());
            qp90 qp90Var = R.c;
            com.yandex.messaging.auth.passport.b bVar = qp90Var.b;
            if (bVar == null) {
                qp90Var.b("createLoginIntent");
                i = null;
            } else {
                i = bVar.c.i(qp90Var.a, mtf0.a(hj3Var));
            }
            if (i != null) {
                this.b.startActivityForResult(i, 1);
            }
        }
    }
}
