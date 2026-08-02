package xsna;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.utils.Logger;
import xsna.cbv0;
import xsna.gku0;
import xsna.jsn;

/* compiled from: VkPayCheckout.kt */
/* loaded from: classes6.dex */
public final class bbv0 {
    public static bbv0 h;
    public static io.reactivex.rxjava3.subjects.g<iku0> i;
    public final VkTransactionInfo a;
    public VkPayCheckoutConfig b;
    public final WeakReference<ebv0> c;
    public final gbv0 d;
    public final shn0 e;
    public volatile boolean f;
    public static final a g = new a();
    public static final l4k0 j = new l4k0(12);
    public static final ev60 k = new ev60(23);

    /* compiled from: VkPayCheckout.kt */
    public static final class a {
        public static void a() {
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            if (!wdx0Var.k() && (f().b.d instanceof VkPayCheckoutConfig.Environment.Production)) {
                bbv0.k.getClass();
                throw new IllegalStateException("VKPay Checkout: ".concat("You must be logged in to use VKPay Checkout"));
            }
            if (f().b.b.c.length() == 0) {
                bbv0.g.getClass();
                VkPayCheckoutConfig.Environment environment = f().b.d;
                if ((environment instanceof VkPayCheckoutConfig.Environment.Production ? (VkPayCheckoutConfig.Environment.Production) environment : null) != null && (!(r1 instanceof VkPayCheckoutConfig.Environment.ProductionWithTestMerchant))) {
                    bbv0.k.getClass();
                    throw new IllegalStateException("VKPay Checkout: ".concat("Merchant signature must be not empty"));
                }
            }
            if (f().a.c.length() == 0) {
                throw new IllegalStateException("Order id must be not empty");
            }
        }

        public static boolean b() {
            gbv0 gbv0Var = f().d;
            try {
                a();
                return true;
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                gku0.a aVar = new gku0.a(message);
                c(e);
                gbv0Var.m(aVar);
                return false;
            }
        }

        public static void c(Throwable th) {
            xgx0 xgx0Var = xgx0.a;
            ev60 ev60Var = bbv0.k;
            String A = mnh0.A(th);
            ev60Var.getClass();
            String concat = "VKPay Checkout: ".concat(A);
            xgx0Var.getClass();
            xgx0.b(concat);
        }

        public static void d(String str) {
            xgx0 xgx0Var = xgx0.a;
            bbv0.k.getClass();
            String concat = "VKPay Checkout: ".concat(str);
            xgx0Var.getClass();
            xgx0.a(concat);
        }

        public static zav0 e(kti ktiVar) {
            io.reactivex.rxjava3.disposables.c cVar;
            if (bbv0.i == null) {
                bbv0.i = io.reactivex.rxjava3.subjects.g.N0();
            }
            io.reactivex.rxjava3.subjects.g<iku0> gVar = bbv0.i;
            if (gVar != null) {
                int i = 1;
                cVar = gVar.subscribe(new z2v0(new fvq0(ktiVar, 15), i), new xzu0(new abv0(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i));
            } else {
                cVar = null;
            }
            return new zav0(cVar);
        }

        public static bbv0 f() {
            bbv0 bbv0Var = bbv0.h;
            if (bbv0Var != null) {
                return bbv0Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public static void g(FragmentManager fragmentManager, VkTransactionInfo vkTransactionInfo, VkPayCheckoutConfig vkPayCheckoutConfig) {
            try {
                kbv0.d.a();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
            if (bbv0.h != null) {
                d("Can't run multiple instances of VKPay Checkout at same time");
                return;
            }
            Fragment H = fragmentManager.H(null);
            ebv0 ebv0Var = H instanceof ebv0 ? (ebv0) H : null;
            if (ebv0Var == null) {
                ebv0Var = new ebv0();
                Bundle bundle = new Bundle(2);
                bundle.putParcelable("key_config", vkPayCheckoutConfig);
                bundle.putParcelable("key_transaction_info", vkTransactionInfo);
                ebv0Var.setArguments(bundle);
            }
            ebv0Var.H = new zo80(15);
            shn0 shn0Var = new shn0(new uen0(String.valueOf(vkPayCheckoutConfig.c.getUserId().b), vkPayCheckoutConfig.f, vkTransactionInfo.c));
            gbv0 gbv0Var = new gbv0(new WeakReference(ebv0Var));
            bbv0.h = new bbv0(vkTransactionInfo, vkPayCheckoutConfig, new WeakReference(ebv0Var), gbv0Var, shn0Var);
            if (b()) {
                if (vkPayCheckoutConfig.l) {
                    h(gbv0Var, ebv0Var, shn0Var, fragmentManager);
                } else {
                    ebv0Var.G = new juw0(1, shn0Var, new stg0(gbv0Var, 29));
                    ebv0Var.Td(fragmentManager, null);
                }
            }
        }

        public static void h(gbv0 gbv0Var, ebv0 ebv0Var, shn0 shn0Var, FragmentManager fragmentManager) {
            sgn0 sgn0Var = e370.g;
            if (sgn0Var == null) {
                sgn0Var = null;
            }
            new io.reactivex.rxjava3.internal.operators.single.d0(sgn0Var.c().q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()), new uq(12), null).subscribe(new wbs0(new wyh(gbv0Var, ebv0Var, shn0Var, fragmentManager, 5), 4), new fsq0(new mdk0(gbv0Var, 21), 5));
        }
    }

    public bbv0(VkTransactionInfo vkTransactionInfo, VkPayCheckoutConfig vkPayCheckoutConfig, WeakReference weakReference, gbv0 gbv0Var, shn0 shn0Var) {
        String str;
        this.a = vkTransactionInfo;
        this.b = vkPayCheckoutConfig;
        this.c = weakReference;
        this.d = gbv0Var;
        this.e = shn0Var;
        boolean z = false;
        r490.b = new x25(0);
        Application d = dgn0.d();
        sgn0 sgn0Var = e370.g;
        String str2 = null;
        (sgn0Var == null ? null : sgn0Var).b(d, this.b.d instanceof VkPayCheckoutConfig.Environment.Production);
        VkPayCheckoutConfig vkPayCheckoutConfig2 = this.b;
        VkPayCheckoutConfig.Environment environment = vkPayCheckoutConfig2.d;
        boolean z2 = environment instanceof VkPayCheckoutConfig.Environment.Sandbox;
        if (z2) {
            str2 = ((VkPayCheckoutConfig.Environment.Sandbox) environment).f.h();
        } else if (environment instanceof VkPayCheckoutConfig.Environment.ProductionWithTestMerchant) {
            str2 = ((VkPayCheckoutConfig.Environment.ProductionWithTestMerchant) environment).b.h();
        }
        g.getClass();
        if (z2) {
            String h2 = ((VkPayCheckoutConfig.Environment.Sandbox) environment).f.h();
            j.getClass();
            str = h2.concat("/vksdk/v1");
        } else {
            if (!(environment instanceof VkPayCheckoutConfig.Environment.Production)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sdk.money.mail.ru/vksdk/v1";
        }
        cbv0.a aVar = new cbv0.a(str, str2);
        boolean z3 = true;
        if ((environment instanceof VkPayCheckoutConfig.Environment.ProductionWithTestMerchant) || (z2 && ((VkPayCheckoutConfig.Environment.Sandbox) environment).e)) {
            z = true;
        }
        ksn ksnVar = new ksn(new cbv0(aVar, z));
        if (z2) {
            z3 = ((VkPayCheckoutConfig.Environment.Sandbox) environment).c;
        } else if (!(environment instanceof VkPayCheckoutConfig.Environment.Production)) {
            throw new NoWhenBranchMatchedException();
        }
        sdi.f = new a8c(z3 ? new jsn(ksnVar, new jsn.b(vkPayCheckoutConfig2, vkTransactionInfo)) : new tu20());
        shn0Var.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.START_SESSION);
    }
}
