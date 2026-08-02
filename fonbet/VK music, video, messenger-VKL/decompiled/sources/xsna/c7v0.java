package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.oauth.VkOAuthGoal;
import com.vk.auth.oauth.VkOAuthRouterInfo;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.silentauth.SilentAuthInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.eeu0;
import xsna.p4g;
import xsna.q55;
import xsna.t6v0;
import xsna.wbu0;
import xsna.x65;

/* compiled from: VkOauthActivityDelegate.kt */
/* loaded from: classes15.dex */
public final class c7v0 implements i90 {
    public final DefaultAuthActivity b;
    public final VkOAuthService c;
    public final SilentAuthInfo d;
    public final Bundle e;
    public final VkOAuthGoal f;
    public w6v0 g;
    public boolean h;
    public boolean i;
    public final c j = new c();
    public final Object k = msy.a(LazyThreadSafetyMode.NONE, new hri0(this, 21));
    public final sj20 l = new sj20(new ptl0(this, 17), new fem0(this, 14), new m0t0(this, 4));
    public xpu0 m;

    /* compiled from: VkOauthActivityDelegate.kt */
    public static final class a {
        public static void a(Intent intent) {
            intent.putExtra("VK_OAUTH_CLOSE_RESULT", true);
        }
    }

    /* compiled from: VkOauthActivityDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkOAuthGoal.values().length];
            try {
                iArr[VkOAuthGoal.AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkOAuthGoal.ADDITIONAL_OAUTH_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkOAuthGoal.ACTIVATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VkOauthActivityDelegate.kt */
    public static final class c implements u6v0 {
        public c() {
        }

        @Override // xsna.u6v0
        public final void a() {
            par0 par0Var = par0.a;
            StringBuilder sb = new StringBuilder("[OAuthDelegate] onAlreadyActivated, service=");
            c7v0 c7v0Var = c7v0.this;
            sb.append(c7v0Var.c);
            String sb2 = sb.toString();
            par0Var.getClass();
            par0.a(sb2);
            c7v0Var.h = true;
            c7v0Var.i = true;
            c7v0Var.b.finish();
        }

        @Override // xsna.u6v0
        public final void b() {
            par0 par0Var = par0.a;
            StringBuilder sb = new StringBuilder("[OAuthDelegate] onSuccessActivated, service=");
            c7v0 c7v0Var = c7v0.this;
            sb.append(c7v0Var.c);
            String sb2 = sb.toString();
            par0Var.getClass();
            par0.a(sb2);
            c7v0Var.h = true;
            c7v0Var.i = false;
            c7v0Var.b.finish();
        }

        @Override // xsna.u6v0
        public final void onError() {
            par0 par0Var = par0.a;
            StringBuilder sb = new StringBuilder("[OAuthDelegate] onError, service=");
            c7v0 c7v0Var = c7v0.this;
            sb.append(c7v0Var.c);
            String sb2 = sb.toString();
            par0Var.getClass();
            par0.a(sb2);
            c7v0Var.h = false;
            c7v0Var.i = false;
        }
    }

    /* compiled from: VkOauthActivityDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((DefaultAuthActivity) this.receiver).finish();
            return s3q0.a;
        }
    }

    /* compiled from: VkOauthActivityDelegate.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((DefaultAuthActivity) this.receiver).finish();
            return s3q0.a;
        }
    }

    public c7v0(DefaultAuthActivity defaultAuthActivity, VkOAuthRouterInfo vkOAuthRouterInfo) {
        this.b = defaultAuthActivity;
        this.c = vkOAuthRouterInfo.b;
        this.d = vkOAuthRouterInfo.c;
        this.e = vkOAuthRouterInfo.d;
        this.f = vkOAuthRouterInfo.e;
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        return new wcl(this.b, new DialogInterface.OnDismissListener() { // from class: xsna.z6v0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c7v0.this.b.finish();
            }
        });
    }

    @Override // xsna.x65
    public final void S(boolean z) {
        if (z) {
            xpu0 xpu0Var = this.m;
            if (xpu0Var != null) {
                xpu0Var.show();
                return;
            }
            return;
        }
        xpu0 xpu0Var2 = this.m;
        if (xpu0Var2 != null) {
            xpu0Var2.dismiss();
        }
    }

    @Override // xsna.x65
    public final void U2(String str, String str2, String str3, gzs<s3q0> gzsVar, String str4, final gzs<s3q0> gzsVar2, boolean z, final gzs<s3q0> gzsVar3, gzs<s3q0> gzsVar4) {
        eeu0.a aVar = new eeu0.a(hnj.a(this.b));
        aVar.c = z;
        aVar.setTitle(str);
        AlertController.b bVar = aVar.a;
        bVar.f = str2;
        aVar.j(str3, new oyb0(2, gzsVar));
        bVar.n = new DialogInterface.OnCancelListener() { // from class: xsna.a7v0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                gzs gzsVar5 = gzs.this;
                if (gzsVar5 != null) {
                    gzsVar5.invoke();
                }
            }
        };
        aVar.i(new j9a(gzsVar4, 2));
        if (str4 != null) {
            aVar.f(str4, new DialogInterface.OnClickListener() { // from class: xsna.b7v0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    gzs gzsVar5 = gzs.this;
                    if (gzsVar5 != null) {
                        gzsVar5.invoke();
                    }
                }
            });
        }
        aVar.m();
    }

    public final boolean a(boolean z) {
        int i = b.$EnumSwitchMapping$0[this.f.ordinal()];
        if (i == 1 || i == 2) {
            return z;
        }
        if (i == 3) {
            return this.h;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(int i, int i2, Intent intent) {
        if (intent.getBooleanExtra("VkAuthLib__activityResultHandled", false)) {
            return;
        }
        w6v0 w6v0Var = this.g;
        if (w6v0Var == null) {
            w6v0Var = null;
        }
        if (w6v0Var.onActivityResult(i, i2, intent)) {
            return;
        }
        DefaultAuthActivity defaultAuthActivity = this.b;
        defaultAuthActivity.G = true;
        defaultAuthActivity.finish();
    }

    public final void c(Bundle bundle) {
        DefaultAuthActivity defaultAuthActivity = this.b;
        defaultAuthActivity.overridePendingTransition(0, 0);
        this.h = bundle != null ? bundle.getBoolean("oauthServiceConnected", false) : false;
        this.i = bundle != null ? bundle.getBoolean("oauthServiceAlreadyConnected", false) : false;
        w6v0 w6v0Var = new w6v0(this.c, this.f, this.j);
        this.g = w6v0Var;
        w6v0Var.y0(this);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        xpu0 xpu0Var = new xpu0(superappUiRouterBridge.u(defaultAuthActivity, true));
        xpu0Var.a(new vyq0(this, 9));
        this.m = xpu0Var;
    }

    public final void d() {
        w6v0 w6v0Var = this.g;
        if (w6v0Var == null) {
            w6v0Var = null;
        }
        w6v0Var.onDestroy();
        w6v0 w6v0Var2 = this.g;
        (w6v0Var2 != null ? w6v0Var2 : null).e();
    }

    public final void f(boolean z) {
        t6v0 dVar;
        xpu0 xpu0Var = this.m;
        if (xpu0Var != null) {
            xpu0Var.b();
        }
        this.m = null;
        this.b.overridePendingTransition(0, 0);
        boolean a2 = a(z);
        VkOAuthGoal vkOAuthGoal = this.f;
        if (a2) {
            int i = b.$EnumSwitchMapping$0[vkOAuthGoal.ordinal()];
            if (i == 1 || i == 2) {
                dVar = new t6v0.c();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = this.i ? new t6v0.b() : new t6v0.a();
            }
        } else {
            dVar = new t6v0.d();
        }
        par0 par0Var = par0.a;
        String str = "[OAuthDelegate] onFinish, service=" + this.c + ", goal=" + vkOAuthGoal + ", result=" + dVar;
        par0Var.getClass();
        par0.a(str);
        q55 q55Var = q55.a;
        List y0 = j5g.y0(q55.b);
        q55.b bVar = new q55.b(par0.a);
        p4g.a aVar = p4g.a;
        Iterator it = y0.iterator();
        while (it.hasNext()) {
            try {
                ((s25) it.next()).r(dVar);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                bVar.invoke(th);
            }
        }
    }

    public final void g(Bundle bundle) {
        bundle.putBoolean("oauthServiceConnected", this.h);
        bundle.putBoolean("oauthServiceAlreadyConnected", this.i);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void h() {
        w6v0 w6v0Var;
        DefaultAuthActivity defaultAuthActivity = this.b;
        SilentAuthInfo silentAuthInfo = this.d;
        if (silentAuthInfo == null) {
            w6v0 w6v0Var2 = this.g;
            w6v0Var = w6v0Var2 != null ? w6v0Var2 : null;
            w6v0Var.getClass();
            par0 par0Var = par0.a;
            String str = "[OAuthPresenter] onOpenOAuthFlow, service=" + w6v0Var.x + ", goal=" + w6v0Var.y;
            par0Var.getClass();
            par0.a(str);
            ((do70) w6v0Var.B.getValue()).b(defaultAuthActivity, this.e);
            return;
        }
        w6v0 w6v0Var3 = this.g;
        w6v0Var = w6v0Var3 != null ? w6v0Var3 : null;
        w6v0Var.getClass();
        par0 par0Var2 = par0.a;
        StringBuilder sb = new StringBuilder("[OAuthPresenter] onOpenOAuthSilentFlow, service=");
        VkOAuthService vkOAuthService = w6v0Var.x;
        sb.append(vkOAuthService);
        sb.append(", goal=");
        sb.append(w6v0Var.y);
        String sb2 = sb.toString();
        par0Var2.getClass();
        par0.a(sb2);
        wzs<Context, SilentAuthInfo, s3q0> wzsVar = w6v0Var.G.get(vkOAuthService);
        if (wzsVar != null) {
            wzsVar.invoke(defaultAuthActivity, silentAuthInfo);
        }
    }

    @Override // xsna.x65
    public final void qi(String str) {
        DefaultAuthActivity defaultAuthActivity = this.b;
        Toast.makeText(defaultAuthActivity, str, 1).show();
        defaultAuthActivity.finish();
    }

    @Override // xsna.x65
    public final void vf(wbu0.a aVar) {
        x65.a.b(this, aVar);
    }

    @Override // xsna.x65
    public final void wa(String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        DefaultAuthActivity defaultAuthActivity = this.b;
        x65.a.a(this, defaultAuthActivity.getString(R.string.vk_auth_error), str, defaultAuthActivity.getString(R.string.vk_ok), gzsVar == null ? new d(0, defaultAuthActivity, DefaultAuthActivity.class, "finish", "finish()V", 0) : gzsVar, null, null, true, gzsVar2 == null ? new e(0, defaultAuthActivity, DefaultAuthActivity.class, "finish", "finish()V", 0) : gzsVar2, null, 256);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.i90
    public final void xc(String str, String str2) {
        ((ek20) this.k.getValue()).a(this.b.getSupportFragmentManager(), this.l, new mj20(str, str2, VerificationMethodTypes.PASSKEY, false));
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }
}
