package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.dto.common.id.UserId;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.dto.auth.AuthPayload;
import com.vk.superapp.api.dto.auth.AuthTarget;
import com.vk.superapp.api.states.VkAuthState;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l45 implements izs {
    public final /* synthetic */ AuthPayload b;
    public final /* synthetic */ VkAuthMetaInfo c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ UserId e;
    public final /* synthetic */ VkAuthState f;
    public final /* synthetic */ String g;

    public /* synthetic */ l45(AuthPayload authPayload, VkAuthMetaInfo vkAuthMetaInfo, Context context, UserId userId, VkAuthState vkAuthState, String str) {
        this.b = authPayload;
        this.c = vkAuthMetaInfo;
        this.d = context;
        this.e = userId;
        this.f = vkAuthState;
        this.g = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.q d;
        io.reactivex.rxjava3.core.x b;
        io.reactivex.rxjava3.core.x a;
        AuthPayload authPayload = this.b;
        VkAuthMetaInfo vkAuthMetaInfo = this.c;
        Context context = this.d;
        final UserId userId = this.e;
        VkAuthState vkAuthState = this.f;
        String str = this.g;
        AuthResult authResult = (AuthResult) obj;
        AuthTarget authTarget = vkAuthMetaInfo.f;
        SilentAuthSource silentAuthSource = vkAuthMetaInfo.e;
        int i = 0;
        AuthTarget a2 = AuthTarget.a(authTarget, null, false, silentAuthSource == SilentAuthSource.FAST_LOGIN || silentAuthSource == SilentAuthSource.SILENT_LOGIN, false, 27);
        Bundle l = authResult.l();
        if (l == null) {
            try {
                q55 q55Var = q55.a;
                l = q55.c().a.K;
            } catch (Throwable unused) {
                l = null;
            }
            if (l == null) {
                l = new Bundle();
            }
        }
        final AuthResult a3 = AuthResult.a(authResult, null, null, authPayload, a2, 0L, l, null, 8310783);
        final p15 p15Var = new p15(vkAuthMetaInfo, a3, false, RegistrationStatParamsFactory.b);
        l55.a.getClass();
        r55 r55Var = r55.a;
        int i2 = 5;
        int i3 = 3;
        io.reactivex.rxjava3.internal.operators.completable.s m = io.reactivex.rxjava3.core.a.m(e43.l(new io.reactivex.rxjava3.internal.operators.observable.l0(r55.h().d(a3), new gv(new defpackage.c(i2, context, a3), 4)).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.a55
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                p15 p15Var2 = p15.this;
                String str2 = p15Var2.d;
                bVar.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ACCESS_TOKEN_PROVIDED, null, null, null, null, null, str2, 190);
                p15Var2.c(userId, a3.d);
            }
        }), io.reactivex.rxjava3.core.a.l(new uy3(a3, 1)).q(io.reactivex.rxjava3.schedulers.a.b()), io.reactivex.rxjava3.core.a.l(new c55(str, a3, vkAuthState, i)).q(io.reactivex.rxjava3.schedulers.a.b())));
        if (a3.u()) {
            l2a0 l2a0Var = (l2a0) l55.e.getValue();
            String n = a3.n();
            if (n == null) {
                n = "";
            }
            a = l2a0Var.a(a3.getUid(), n, a3.d());
            d = new io.reactivex.rxjava3.internal.operators.single.s(a, new ps2(new k82(1, m, context), i3)).d(io.reactivex.rxjava3.core.q.T(a3)).r0(io.reactivex.rxjava3.android.schedulers.a.b());
        } else if (a3.p()) {
            b = ((zbp) l55.c.getValue()).b(a3.getUid(), a3.j(), a3.d());
            d = new io.reactivex.rxjava3.internal.operators.single.s(b, new h8(new com.vk.libvideo.design.view.video.a(1, a3, m), i2)).d(io.reactivex.rxjava3.core.q.T(a3)).r0(io.reactivex.rxjava3.android.schedulers.a.b());
        } else {
            d = m.d(io.reactivex.rxjava3.core.q.T(a3));
        }
        io.reactivex.rxjava3.functions.a aVar = new io.reactivex.rxjava3.functions.a() { // from class: xsna.z45
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                l55.a.getClass();
                ((i2a0) l55.f.getValue()).clear();
                ((wbp) l55.d.getValue()).clear();
            }
        };
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        return d.E(lVar, lVar, io.reactivex.rxjava3.internal.functions.a.c, aVar);
    }
}
