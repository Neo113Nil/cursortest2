package com.yandex.go.taxi.order.chat.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.messenger_native.d;
import com.yandex.go.taxi.order.chat.domain.model.MessengerType;
import com.yandex.go.taxi.order.chat.ui.messenger.TaxiOrderMessengerModalView;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.isolated.IsolatedChatConfig;
import com.yandex.messaging.isolated.IsolatedTranslatorConfig;
import com.yandex.messaging.isolated.MessengerChatFragment;
import com.yandex.messaging.ui.timeline.ChatOpenTarget;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.WebMessenger;
import com.yandex.messenger.websdk.internal.MainWebMessengerFragment;
import com.yandex.messenger.websdk.internal.web.MessageType;
import defpackage.a441;
import defpackage.avj0;
import defpackage.bcb1;
import defpackage.bcy0;
import defpackage.c1b;
import defpackage.c9v;
import defpackage.ccb1;
import defpackage.d1b;
import defpackage.e420;
import defpackage.ew2;
import defpackage.f420;
import defpackage.f8b;
import defpackage.g720;
import defpackage.gw00;
import defpackage.hdu;
import defpackage.heb;
import defpackage.hqr0;
import defpackage.j5z;
import defpackage.jb7;
import defpackage.jl40;
import defpackage.jtq0;
import defpackage.k0p;
import defpackage.kob0;
import defpackage.kyh0;
import defpackage.m3y0;
import defpackage.m5g0;
import defpackage.n3y0;
import defpackage.nax;
import defpackage.nh41;
import defpackage.o3y0;
import defpackage.p3y0;
import defpackage.p520;
import defpackage.p8b;
import defpackage.pg7;
import defpackage.q6b;
import defpackage.qh41;
import defpackage.r350;
import defpackage.rh41;
import defpackage.s720;
import defpackage.t120;
import defpackage.tt2;
import defpackage.u3y0;
import defpackage.u45;
import defpackage.w030;
import defpackage.w040;
import defpackage.w511;
import defpackage.y7y0;
import defpackage.ye0;
import defpackage.z8g;
import defpackage.zdb;
import defpackage.zhm;
import defpackage.zuj0;
import defpackage.zzf;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes15.dex */
public final class b extends k0p {
    public final FragmentActivity H;
    public final j5z I;
    public final t120 J;
    public final u3y0 K;
    public final WebMessenger L;
    public final s720 M;
    public final jtq0 N;
    public final y7y0 O;
    public final w030 P;
    public final boolean Q;

    public b(FragmentActivity fragmentActivity, j5z j5zVar, t120 t120Var, u3y0 u3y0Var, WebMessenger webMessenger, s720 s720Var, jtq0 jtq0Var, y7y0 y7y0Var, w030 w030Var) {
        super(1);
        this.H = fragmentActivity;
        this.I = j5zVar;
        this.J = t120Var;
        this.K = u3y0Var;
        this.L = webMessenger;
        this.M = s720Var;
        this.N = jtq0Var;
        this.O = y7y0Var;
        this.P = w030Var;
        this.Q = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.P;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.Q;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        n3y0 n3y0Var = (n3y0) obj;
        p3y0 p3y0Var = new p3y0(this);
        MessengerType messengerType = n3y0Var.c;
        kob0 kob0Var = this.K.a;
        return new TaxiOrderMessengerModalView(this.H, new m3y0((pg7) kob0Var.a.get(), (zuj0) kob0Var.b.get(), (zhm) kob0Var.c.get(), (d) kob0Var.d.get(), (r350) kob0Var.e.get(), (nh41) kob0Var.f.get(), (tt2) kob0Var.g.get(), n3y0Var, p3y0Var, messengerType), new TaxiOrderMessengerRouter$provideModalView$2(0, this, b.class, "commitFragmentTransaction", "commitFragmentTransaction()V", 0));
    }

    @Override // defpackage.k0p
    public final FragmentActivity T() {
        return this.H;
    }

    @Override // defpackage.k0p
    public final Fragment U(Object obj) {
        n3y0 n3y0Var = (n3y0) obj;
        int i = o3y0.a[n3y0Var.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return null;
            }
            t120 t120Var = this.J;
            String str = n3y0Var.b;
            String a = this.I.a.a().a();
            Context context = t120Var.a;
            jb7 jb7Var = new jb7(context);
            int i2 = g720.c;
            ((zzf) new com.yandex.messaging.sdk.a(context).b()).e.get();
            p520 p520Var = new p520("ru.yandex.taxi", TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
            ExistingChatRequest a2 = p8b.a(str);
            IsolatedChatConfig isolatedChatConfig = new IsolatedChatConfig(false, false, false, false, null, false, 0, false, false, false, new IsolatedTranslatorConfig(a, null, 2, null), 895, null);
            ((z8g) jb7Var.k()).a().f("tech_create_chat_fragment", "chat", a2.uniqueRequestId(), "source", p520Var);
            MessengerChatFragment messengerChatFragment = new MessengerChatFragment();
            q6b q6bVar = new q6b(p520Var, a2, null, null, isolatedChatConfig, 1769464);
            Bundle c = q6bVar.c();
            c.putParcelable("Messaging.Arguments.ChatRequest", q6bVar.b);
            ccb1.f("Messaging.Arguments.Text", q6bVar.c, c);
            ccb1.f("Messaging.Arguments.Payload", q6bVar.d, c);
            ServerMessageRef serverMessageRef = q6bVar.e;
            if (serverMessageRef != null) {
                c.putParcelable("Messaging.Arguments.MessageRef", serverMessageRef);
            }
            LocalMessageRef localMessageRef = q6bVar.f;
            if (localMessageRef != null) {
                c.putParcelable("Messaging.Arguments.LocalMessageRef", localMessageRef);
            }
            c.putBoolean("Messaging.Arguments.Invite", q6bVar.g);
            c.putBoolean("Messaging.Arguments.Join", q6bVar.h);
            ccb1.f("Messaging.Arguments.BotRequest", q6bVar.i, c);
            c.putBoolean("Messaging.Arguments.OpenSearch", q6bVar.j);
            ChatOpenTarget chatOpenTarget = q6bVar.k;
            ccb1.f("Messaging.Arguments.Target", chatOpenTarget != null ? chatOpenTarget.getValue() : null, c);
            c.putBoolean("Messaging.Arguments.FromNotification", q6bVar.l);
            List list = q6bVar.m;
            c.putLongArray("Messaging.Arguments.MessageTimestamps", list != null ? kotlin.collections.a.K0(list) : null);
            m5g0 m5g0Var = q6bVar.n;
            if (m5g0Var != null) {
                c.putAll(m5g0Var.a());
            }
            hqr0 hqr0Var = q6bVar.o;
            if (hqr0Var != null) {
                c.putAll(bcb1.s(hqr0Var));
            }
            ccb1.f("Messaging.Arguments.STICKERPACK", q6bVar.p, c);
            ccb1.f("Messaging.Arguments.SupportContext", q6bVar.q, c);
            c.putBoolean("Messaging.Arguments.OpenKeyboard", q6bVar.r);
            IsolatedChatConfig isolatedChatConfig2 = q6bVar.s;
            if (isolatedChatConfig2 != null) {
                c.putParcelable("Messaging.Arguments.IsolatedChatConfig", isolatedChatConfig2);
            }
            c.putBoolean("Messaging.Arguments.PersonalInviteLink", q6bVar.t);
            ccb1.f("Messaging.Arguments.Action", q6bVar.u, c);
            messengerChatFragment.setArguments(c);
            return messengerChatFragment;
        }
        boolean z = n3y0Var.a.b().V().r0;
        y7y0 y7y0Var = this.O;
        String str2 = "";
        if (!y7y0Var.b) {
            y7y0Var.b = true;
            str2 = ((avj0) y7y0Var.a).i(kyh0.chat_automatic_greeting, "");
        }
        String str3 = str2;
        s720 s720Var = this.M;
        WebMessenger webMessenger = s720Var.a;
        bcy0 bcy0Var = s720Var.b;
        rh41 rh41Var = bcy0Var.a;
        bcy0Var.b.getClass();
        f420 f420Var = bcy0Var.c;
        MessengerParams a3 = rh41Var.a(99L, "yandexgo", !((e420) f420Var.c()).b || ((e420) f420Var.c()).c, !((e420) f420Var.c()).b || ((e420) f420Var.c()).d, z, f420Var.d());
        webMessenger.getClass();
        jl40.m();
        webMessenger.d.r.b("wm_set_messenger_params_api");
        qh41 qh41Var = webMessenger.d;
        if (qh41Var.g.equals(a3)) {
            qh41Var.r.b("wm_set_messenger_params_skipped_unchanged");
        } else {
            qh41Var.g = a3;
            d1b d1bVar = (d1b) qh41Var.x.getValue();
            ye0 ye0Var = d1bVar.d;
            if (ye0Var instanceof c1b) {
                heb p = ((c1b) ye0Var).p();
                ew2 ew2Var = p.g;
                if (p.C == null) {
                    ew2Var.b("wm_set_dynamic_flags_skipped_no_webview");
                } else {
                    a441 a441Var = p.A;
                    MessengerParams messengerParams = (MessengerParams) ((zdb) a441Var.c).invoke();
                    w040 w040Var = new w040(a441Var, messengerParams);
                    a441.x(messengerParams, w040Var);
                    LinkedHashMap d = w040Var.d();
                    if (!d.isEmpty()) {
                        c9v c9vVar = p.C;
                        if (c9vVar == null) {
                            c9vVar = null;
                        }
                        hdu hduVar = p.e().a;
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : d.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", "setFlags");
                        jSONObject2.put(Constants.KEY_DATA, new JSONObject().put("flags", jSONObject));
                        c9v.h(c9vVar, nax.b(hdu.n(hduVar, MessageType.Request, jSONObject2, null)));
                        ew2Var.c("wm_set_dynamic_flags", gw00.e(new Pair("count", Integer.valueOf(d.size()))));
                    }
                }
            } else {
                d1bVar.a.b("wm_set_dynamic_flags_no_webview");
            }
        }
        WebMessenger webMessenger2 = this.L;
        f8b f8bVar = new f8b(n3y0Var.b);
        String jSONObject3 = new JSONObject().put(ClidProvider.TIMESTAMP, this.N.d()).toString();
        webMessenger2.getClass();
        jl40.m();
        qh41 qh41Var2 = webMessenger2.d;
        qh41Var2.r.c("wm_get_chat_frame", f8bVar.d());
        return new MainWebMessengerFragment(qh41Var2, f8bVar, jSONObject3, str3);
    }
}
