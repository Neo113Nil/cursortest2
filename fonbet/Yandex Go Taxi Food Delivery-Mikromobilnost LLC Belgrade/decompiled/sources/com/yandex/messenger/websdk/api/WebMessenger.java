package com.yandex.messenger.websdk.api;

import android.content.Context;
import android.os.Handler;
import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.messenger.websdk.api.WebMessenger;
import com.yandex.messenger.websdk.internal.MainWebMessengerFragment;
import defpackage.bo41;
import defpackage.ec01;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.i8b;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.q221;
import defpackage.qh41;
import defpackage.qoi0;
import defpackage.r221;
import defpackage.s221;
import defpackage.sls;
import defpackage.sms;
import defpackage.t221;
import defpackage.tls;
import defpackage.u221;
import defpackage.uj41;
import defpackage.v221;
import defpackage.w221;
import defpackage.yx1;
import defpackage.zn41;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messenger/websdk/api/WebMessenger;", "", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebMessenger {
    public final MessengerParams a;
    public final i3y b;
    public final i3y c;
    public final qh41 d;

    public WebMessenger(Context context, MessengerParams messengerParams, MessengerAnalyticsFactory messengerAnalyticsFactory, NotificationClickIntentFactory notificationClickIntentFactory, NotificationDecorator notificationDecorator, WebChromeClientConfig webChromeClientConfig) {
        this.a = messengerParams;
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: lh41
            public final /* synthetic */ WebMessenger b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                WebMessenger webMessenger = this.b;
                switch (i2) {
                    case 0:
                        return (vh60) webMessenger.d.m.getValue();
                    default:
                        return (jm3) webMessenger.d.k.getValue();
                }
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: lh41
            public final /* synthetic */ WebMessenger b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                WebMessenger webMessenger = this.b;
                switch (i22) {
                    case 0:
                        return (vh60) webMessenger.d.m.getValue();
                    default:
                        return (jm3) webMessenger.d.k.getValue();
                }
            }
        });
        WeakReference weakReference = uj41.a;
        if (weakReference == null || ((uj41) weakReference.get()) == null) {
            uj41.a = new WeakReference(new uj41());
        }
        qh41 qh41Var = new qh41(context, messengerParams, messengerAnalyticsFactory, notificationClickIntentFactory, notificationDecorator, webChromeClientConfig, new sms(13));
        this.d = qh41Var;
        qh41Var.r.b("wm_init_sdk");
        jl40.f = false;
    }

    public static MainWebMessengerFragment c(WebMessenger webMessenger, ChatRequest chatRequest, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        String str2 = (i & 4) == 0 ? "" : null;
        webMessenger.getClass();
        jl40.m();
        qh41 qh41Var = webMessenger.d;
        qh41Var.r.c("wm_get_chat_frame", chatRequest.d());
        return new MainWebMessengerFragment(qh41Var, chatRequest, str, str2);
    }

    public final Authentication a() {
        return (Authentication) this.c.getValue();
    }

    public final Cancelable b(ChatRequest chatRequest, tls tlsVar, tls tlsVar2) {
        String str;
        boolean z = chatRequest instanceof i8b;
        if (jl40.f && z) {
            ny61.f("Counters cannot handle inviteHash");
            return null;
        }
        final yx1 yx1Var = this.d.u;
        yx1Var.getClass();
        final s221 r221Var = chatRequest != null ? new r221(chatRequest) : q221.a;
        ec01 ec01Var = new ec01(11, tlsVar2);
        LinkedHashMap linkedHashMap = (LinkedHashMap) yx1Var.e;
        jl40.m();
        w221 w221Var = (w221) ((ConcurrentHashMap) yx1Var.c).get(r221Var);
        if (w221Var != null) {
            ec01Var.invoke(w221Var);
        }
        ((LinkedHashSet) yx1Var.d).add(r221Var);
        if (!linkedHashMap.containsKey(r221Var)) {
            linkedHashMap.put(r221Var, new u221());
        }
        final t221 t221Var = new t221(tlsVar, ec01Var);
        final u221 u221Var = (u221) linkedHashMap.get(r221Var);
        if (u221Var == null) {
            ny61.r("Subscription must be created");
            return null;
        }
        u221Var.a(t221Var);
        ChatRequest chatRequest2 = r221Var.getChatRequest();
        if (chatRequest2 == null || (str = chatRequest2.b()) == null) {
            str = "*";
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) yx1Var.h;
        bo41 bo41Var = (bo41) yx1Var.b;
        v221 v221Var = new v221(yx1Var, r221Var);
        HashMap hashMap = bo41Var.c;
        jl40.m();
        HashMap hashMap2 = bo41Var.b;
        Object obj = hashMap2.get(str);
        if (obj == null) {
            obj = new ArrayList();
            hashMap2.put(str, obj);
        }
        ((List) obj).add(v221Var);
        if (bo41Var.b().contains(str)) {
            v221Var.a();
        } else {
            v221Var.b();
        }
        Integer num = str.equals("*") ? bo41Var.f : (Integer) hashMap.get(str);
        if (num != null) {
            v221Var.c(bo41Var.e(v221Var, num));
        } else if (hashMap.containsKey("*")) {
            bo41Var.c(0, str, true);
        }
        linkedHashMap2.put(r221Var, new zn41(bo41Var, str, v221Var));
        return new Cancelable() { // from class: p221
            @Override // com.yandex.messenger.websdk.api.Cancelable
            public final void cancel() {
                boolean isEmpty;
                u221 u221Var2 = u221.this;
                t221 t221Var2 = t221Var;
                yx1 yx1Var2 = yx1Var;
                s221 s221Var = r221Var;
                synchronized (u221Var2) {
                    u221Var2.a.remove(t221Var2);
                }
                Handler handler = t221Var2.c;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                t221Var2.c = null;
                synchronized (u221Var2) {
                    isEmpty = u221Var2.a.isEmpty();
                }
                if (isEmpty) {
                    yx1Var2.getClass();
                    LinkedHashMap linkedHashMap3 = (LinkedHashMap) yx1Var2.h;
                    LinkedHashMap linkedHashMap4 = (LinkedHashMap) yx1Var2.g;
                    Cancelable cancelable = (Cancelable) linkedHashMap4.get(s221Var);
                    if (cancelable != null) {
                        linkedHashMap4.remove(s221Var);
                        cancelable.cancel();
                    }
                    Closeable closeable = (Closeable) linkedHashMap3.get(s221Var);
                    if (closeable != null) {
                        linkedHashMap3.remove(s221Var);
                        closeable.close();
                    }
                    ((LinkedHashSet) yx1Var2.d).remove(s221Var);
                    ((ConcurrentHashMap) yx1Var2.c).remove(s221Var);
                }
            }
        };
    }

    public final String toString() {
        MessengerParams messengerParams = this.a;
        MessengerEnvironment messengerEnvironment = messengerParams.e;
        String d = qoi0.a(messengerEnvironment.getClass()).d();
        String str = messengerParams.c;
        if (evu0.J(str)) {
            str = null;
        }
        if (str == null) {
            str = "no workspace";
        }
        return oyr.q(d, ";", str, ";", messengerEnvironment.b());
    }
}
