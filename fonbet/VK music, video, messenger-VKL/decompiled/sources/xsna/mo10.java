package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.superapp.analytics.MaxMessengerAnalytics;
import com.vk.toggle.anonymous.SakFeatures;
import kotlin.Result;

/* compiled from: MaxMessengerOpenerDelegate.kt */
/* loaded from: classes15.dex */
public final class mo10 {
    public final MaxMessengerAnalytics a;
    public final Context b;
    public final a66 c;
    public final hb0<String> d;
    public boolean e;
    public String f;
    public final jo10 g;
    public final bpn0 h = new bpn0(new lo10(this, 0));

    public mo10(MaxMessengerAnalytics maxMessengerAnalytics, Context context, a66 a66Var) {
        this.a = maxMessengerAnalytics;
        this.b = context;
        this.c = a66Var;
        this.d = a66Var.registerForActivityResult(new msg0(), new ua0() { // from class: xsna.ko10
            @Override // xsna.ua0
            public final void onActivityResult(Object obj) {
                mo10 mo10Var = mo10.this;
                MaxMessengerAnalytics maxMessengerAnalytics2 = mo10Var.a;
                if (!((Boolean) obj).booleanValue()) {
                    maxMessengerAnalytics2.o();
                    par0.a.getClass();
                    par0.a("DefaultClientSeamlessInstallFlow onSeamlessInstallCancel");
                } else {
                    par0.a.getClass();
                    par0.a("DefaultClientSeamlessInstallFlow onSeamlessInstallSuccess");
                    maxMessengerAnalytics2.j();
                    mo10Var.g.a(mo10Var.b, mo10Var.f, mo10Var.e);
                }
            }
        });
        this.g = new jo10(maxMessengerAnalytics);
    }

    public final void a(String str, boolean z) {
        Object failure;
        this.f = str;
        Context context = this.b;
        boolean b = xhr0.b(context, "ru.oneme.app");
        boolean b2 = xhr0.b(context, "ru.vk.store");
        this.a.d(z);
        if (!b) {
            this.e = true;
        }
        if (b && this.g.a(context, str, this.e)) {
            return;
        }
        boolean h = SakFeatures.Type.SAK_SEAMLESS_FLOW.h();
        if (b2 && h) {
            osg0 osg0Var = (osg0) this.h.getValue();
            bjk bjkVar = new bjk(this, 17);
            l1i l1iVar = new l1i(this, 13);
            MaxMessengerAnalytics maxMessengerAnalytics = osg0Var.b;
            try {
                failure = osg0Var.a.kn();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Intent intent = null;
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) failure;
            if (fragmentActivity == null) {
                par0.a.getClass();
                par0.a("DefaultClientSeamlessInstallFlow No available activityContext");
            } else {
                osg0Var.d = fragmentActivity;
                Intent intent2 = new Intent("ru.vk.provider.install.rapid.RapidTokenProvider");
                ResolveInfo resolveInfo = (ResolveInfo) j5g.a0(fragmentActivity.getPackageManager().queryIntentServices(intent2, 0));
                ServiceInfo serviceInfo = resolveInfo != null ? resolveInfo.serviceInfo : null;
                if (serviceInfo != null) {
                    intent2.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
                    intent = intent2;
                }
                if (intent == null) {
                    par0.a.getClass();
                    par0.a("DefaultClientSeamlessInstallFlow Unable to start install");
                    maxMessengerAnalytics.i();
                } else {
                    par0.a.getClass();
                    par0.a("DefaultClientSeamlessInstallFlow Service binding called");
                    try {
                        osg0Var.a();
                        nsg0 nsg0Var = new nsg0(osg0Var, l1iVar, bjkVar);
                        maxMessengerAnalytics.q();
                        fragmentActivity.bindService(intent, nsg0Var, 1);
                        osg0Var.c = nsg0Var;
                        return;
                    } catch (Exception unused) {
                        maxMessengerAnalytics.i();
                        osg0Var.a();
                    }
                }
            }
        }
        b(b2);
    }

    public final void b(boolean z) {
        Context context = this.b;
        jo10 jo10Var = this.g;
        if (z) {
            jo10Var.getClass();
            try {
                context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://www.rustore.ru/catalog/app/".concat("ru.oneme.app"))).addFlags(268435456));
                jo10Var.a.l(MaxMessengerAnalytics.MarketName.RUSTORE);
                par0.a.getClass();
                par0.a("DefaultClientSeamlessInstallFlow Success opening rustore fullscreen");
                return;
            } catch (Throwable unused) {
                par0.a.getClass();
                par0.a("DefaultClientSeamlessInstallFlow Error opening rustore fullscreen");
            }
        }
        MaxMessengerAnalytics maxMessengerAnalytics = jo10Var.a;
        try {
            context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=".concat("ru.oneme.app"))).addFlags(268435456));
            par0.a.getClass();
            par0.a("DefaultClientSeamlessInstallFlow Success opening any market");
            maxMessengerAnalytics.l(MaxMessengerAnalytics.MarketName.OTHER);
        } catch (Throwable unused2) {
            par0.a.getClass();
            par0.a("DefaultClientSeamlessInstallFlow Error opening any market");
            maxMessengerAnalytics.f();
        }
    }
}
