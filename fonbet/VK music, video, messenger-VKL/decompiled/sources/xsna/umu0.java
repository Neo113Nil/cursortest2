package xsna;

import android.content.Context;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.main.AuthModel;
import java.util.List;

/* compiled from: VkConnectCommon.kt */
/* loaded from: classes.dex */
public final class umu0 {
    public final Context a;
    public final AuthModel b;
    public final ycu0 c;
    public final yui d;
    public final gau e;
    public final xjv0 f;
    public final mq9 g;
    public final com.vk.auth.main.j h;
    public final wg9 i;
    public final com.vk.auth.oauth.a j;
    public final tmu0 k;
    public final r1d0 l;
    public final z25 m;
    public final l2q n;
    public final List<AccountProfileType> o;
    public final mui0 p;
    public final sxi0 q;
    public final y140 r;
    public final tby s;
    public final zg9 t;

    public umu0(Context context, AuthModel authModel, ycu0 ycu0Var, yui yuiVar, gau gauVar, xjv0 xjv0Var, mq9 mq9Var, com.vk.auth.main.j jVar, wg9 wg9Var, com.vk.auth.oauth.a aVar, tmu0 tmu0Var, r1d0 r1d0Var, z25 z25Var, l2q l2qVar, List list, mui0 mui0Var, sxi0 sxi0Var, y140 y140Var, tby tbyVar, zg9 zg9Var) {
        this.a = context;
        this.b = authModel;
        this.c = ycu0Var;
        this.d = yuiVar;
        this.e = gauVar;
        this.f = xjv0Var;
        this.g = mq9Var;
        this.h = jVar;
        this.i = wg9Var;
        this.j = aVar;
        this.k = tmu0Var;
        this.l = r1d0Var;
        this.m = z25Var;
        this.n = l2qVar;
        this.o = list;
        this.p = mui0Var;
        this.q = sxi0Var;
        this.r = y140Var;
        this.s = tbyVar;
        this.t = zg9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umu0)) {
            return false;
        }
        umu0 umu0Var = (umu0) obj;
        return epx.f(this.a, umu0Var.a) && epx.f(this.b, umu0Var.b) && this.c.equals(umu0Var.c) && this.d.equals(umu0Var.d) && this.e.equals(umu0Var.e) && epx.f(this.f, umu0Var.f) && this.g.equals(umu0Var.g) && AuthActivity.class.equals(AuthActivity.class) && this.h.equals(umu0Var.h) && this.i.equals(umu0Var.i) && this.j.equals(umu0Var.j) && this.k.equals(umu0Var.k) && this.l.equals(umu0Var.l) && this.m.equals(umu0Var.m) && this.n.equals(umu0Var.n) && epx.f(this.o, umu0Var.o) && this.p.equals(umu0Var.p) && this.q.equals(umu0Var.q) && epx.f(this.r, umu0Var.r) && this.s.equals(umu0Var.s) && this.t.equals(umu0Var.t);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.t.hashCode() + ((this.s.hashCode() + qoy.b((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + fw3.a((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + qoy.b((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((AuthActivity.class.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, true)) * 31)) * 31)) * 31, 961, this.o)) * 31)) * 31)) * 31, 31, true)) * 961)) * 31);
    }

    public final String toString() {
        return "VkConnectCommonConfig(appContext=" + this.a + ", clientInfo=null, signUpModel=" + this.b + ", uiManager=" + this.c + ", usersStore=" + this.d + ", libverifyControllerProvider=" + this.e + ", libverifySessionDelegate=null, silentTokenExchanger=" + this.f + ", okAppKeyProvider=" + this.g + ", authActivityClass=" + AuthActivity.class + ", authStateSender=" + this.h + ", credentialsManagerProvider=" + this.i + ", oAuthManager=" + this.j + ", extraValidationRouterFactory=" + this.k + ", enableLogs=true, authConfigModifier=" + this.l + ", authDebugRouter=" + this.m + ", exchangeTokenRepository=" + this.n + ", allowedProfileTypes=" + this.o + ", multiAccountUsersProvider=null, sessionReadOnlyRepository=" + this.p + ", sessionWriteOnlyRepository=" + this.q + ", multiAccountConfig=" + this.r + ", isPasskeyConfigured=true, oAuthTestConfig=" + this.s + ", okFlowAuthConfig=null, suspiciousAuthTestWereaction=" + this.t + ", carCompatMode=false)";
    }
}
