package xsna;

import android.content.Context;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.superapp.api.states.VkAuthState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x35 implements izs {
    public final /* synthetic */ AuthModel b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ VkAuthState f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ VkAuthMetaInfo j;
    public final /* synthetic */ MailAuthFlowConfig k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ SilentAuthSource m;
    public final /* synthetic */ Boolean n;

    public /* synthetic */ x35(AuthModel authModel, boolean z, String str, Context context, VkAuthState vkAuthState, String str2, String str3, String str4, VkAuthMetaInfo vkAuthMetaInfo, MailAuthFlowConfig mailAuthFlowConfig, Context context2, SilentAuthSource silentAuthSource, Boolean bool) {
        this.b = authModel;
        this.c = z;
        this.d = str;
        this.e = context;
        this.f = vkAuthState;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = vkAuthMetaInfo;
        this.k = mailAuthFlowConfig;
        this.l = context2;
        this.m = silentAuthSource;
        this.n = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        SilentAuthSource silentAuthSource;
        SilentAuthSource silentAuthSource2;
        Boolean bool;
        Boolean bool2;
        io.reactivex.rxjava3.core.q L;
        String str = (String) obj;
        VkAuthState vkAuthState = this.f;
        if (str != null) {
            vkAuthState.d.put("validate_session", str);
        }
        l55 l55Var = l55.a;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        wfn0 e = vdx0Var.e();
        AuthModel authModel = this.b;
        boolean a = authModel.n().a();
        String f = authModel.f();
        boolean z3 = this.c;
        String str2 = this.d;
        if (z3 && str2 != null && !drm0.N(str2)) {
            jsp0.a.getClass();
            if (jsp0.a(this.e)) {
                z = false;
                z2 = true;
                boolean z4 = z;
                io.reactivex.rxjava3.internal.operators.observable.m1 o = e.o(vkAuthState, this.g, a, f, false, this.h, z2, z3, this.i);
                String str3 = !z3 ? str2 : null;
                l55Var.getClass();
                VkAuthMetaInfo vkAuthMetaInfo = this.j;
                final e45 e45Var = new e45(vkAuthMetaInfo, 0);
                io.reactivex.rxjava3.core.q<R> L2 = o.U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.f45
                    @Override // io.reactivex.rxjava3.functions.l
                    public final Object apply(Object obj2) {
                        return (AuthResult) e45.this.invoke(obj2);
                    }
                }).L(new h45(new g45(authModel, vkAuthState, str3)), z4);
                d45 d45Var = new d45(new c45(0));
                L2.getClass();
                io.reactivex.rxjava3.internal.operators.observable.o1 o1Var = new io.reactivex.rxjava3.internal.operators.observable.o1(L2, d45Var);
                MailAuthFlowConfig mailAuthFlowConfig = this.k;
                io.reactivex.rxjava3.internal.operators.observable.o1 o1Var2 = new io.reactivex.rxjava3.internal.operators.observable.o1(o1Var, new nx1(new o45(mailAuthFlowConfig, 0)));
                if (!z3) {
                    str2 = null;
                }
                boolean z5 = (mailAuthFlowConfig == null && mailAuthFlowConfig.d) ? true : z4;
                silentAuthSource = SilentAuthSource.BY_GRAY_LINK;
                silentAuthSource2 = this.m;
                if (silentAuthSource2 == silentAuthSource || z5) {
                    bool = Boolean.TRUE;
                    bool2 = this.n;
                    if (!epx.f(bool2, bool)) {
                        io.reactivex.rxjava3.core.q h = l55.h(o1Var2, this.l, vkAuthMetaInfo, vkAuthState, str2, null);
                        final w45 w45Var = new w45(silentAuthSource2, bool2, mailAuthFlowConfig);
                        L = h.L(new io.reactivex.rxjava3.functions.l() { // from class: xsna.x45
                            @Override // io.reactivex.rxjava3.functions.l
                            public final Object apply(Object obj2) {
                                return (io.reactivex.rxjava3.core.t) w45.this.invoke(obj2);
                            }
                        }, z4);
                        return L.a0(io.reactivex.rxjava3.android.schedulers.a.b());
                    }
                }
                int i = 0;
                L = new io.reactivex.rxjava3.internal.operators.observable.o1(o1Var2, new j45(new i45(vkAuthState, i), i));
                return L.a0(io.reactivex.rxjava3.android.schedulers.a.b());
            }
        }
        z = false;
        z2 = false;
        boolean z42 = z;
        io.reactivex.rxjava3.internal.operators.observable.m1 o2 = e.o(vkAuthState, this.g, a, f, false, this.h, z2, z3, this.i);
        if (!z3) {
        }
        l55Var.getClass();
        VkAuthMetaInfo vkAuthMetaInfo2 = this.j;
        final e45 e45Var2 = new e45(vkAuthMetaInfo2, 0);
        io.reactivex.rxjava3.core.q<R> L22 = o2.U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.f45
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj2) {
                return (AuthResult) e45.this.invoke(obj2);
            }
        }).L(new h45(new g45(authModel, vkAuthState, str3)), z42);
        d45 d45Var2 = new d45(new c45(0));
        L22.getClass();
        io.reactivex.rxjava3.internal.operators.observable.o1 o1Var3 = new io.reactivex.rxjava3.internal.operators.observable.o1(L22, d45Var2);
        MailAuthFlowConfig mailAuthFlowConfig2 = this.k;
        io.reactivex.rxjava3.internal.operators.observable.o1 o1Var22 = new io.reactivex.rxjava3.internal.operators.observable.o1(o1Var3, new nx1(new o45(mailAuthFlowConfig2, 0)));
        if (!z3) {
        }
        if (mailAuthFlowConfig2 == null) {
        }
        silentAuthSource = SilentAuthSource.BY_GRAY_LINK;
        silentAuthSource2 = this.m;
        if (silentAuthSource2 == silentAuthSource) {
        }
        bool = Boolean.TRUE;
        bool2 = this.n;
        if (!epx.f(bool2, bool)) {
        }
        int i2 = 0;
        L = new io.reactivex.rxjava3.internal.operators.observable.o1(o1Var22, new j45(new i45(vkAuthState, i2), i2));
        return L.a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
