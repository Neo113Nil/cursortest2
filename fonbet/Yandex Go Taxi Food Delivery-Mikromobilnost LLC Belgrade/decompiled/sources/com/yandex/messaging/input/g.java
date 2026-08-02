package com.yandex.messaging.input;

import android.app.Activity;
import android.widget.Toast;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.core.net.entities.MessengerSupportContext;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.internal.auth.AuthorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.entities.StickerMessageData;
import defpackage.ax80;
import defpackage.ck51;
import defpackage.clb1;
import defpackage.dct;
import defpackage.g720;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.i720;
import defpackage.ik51;
import defpackage.j3b;
import defpackage.jn3;
import defpackage.jqr;
import defpackage.kse;
import defpackage.lqo;
import defpackage.oyh0;
import defpackage.p4t;
import defpackage.q6b;
import defpackage.tje;
import defpackage.uqq0;
import defpackage.w7b;
import defpackage.wk31;
import defpackage.x1z0;
import defpackage.x22;
import defpackage.xdf0;
import defpackage.yw80;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class g {
    public final Activity a;
    public final q6b b;
    public final w7b c;
    public final x22 d;
    public final lqo e;
    public final i720 f;
    public final Moshi g;
    public final ik51 h;
    public final MessengerEnvironment i;
    public final ck51 j;
    public final com.yandex.messaging.internal.view.input.c k;
    public final xdf0 l;
    public final h3y m;
    public final kse n;
    public long o;
    public j3b p;
    public boolean q;

    public g(Activity activity, q6b q6bVar, w7b w7bVar, com.yandex.messaging.navigation.c cVar, p4t p4tVar, dct dctVar, x22 x22Var, lqo lqoVar, i720 i720Var, Moshi moshi, ik51 ik51Var, MessengerEnvironment messengerEnvironment, jn3 jn3Var, ck51 ck51Var, com.yandex.messaging.internal.view.input.c cVar2, xdf0 xdf0Var, h3y h3yVar, kse kseVar) {
        this.a = activity;
        this.b = q6bVar;
        this.c = w7bVar;
        this.d = x22Var;
        this.e = lqoVar;
        this.f = i720Var;
        this.g = moshi;
        this.h = ik51Var;
        this.i = messengerEnvironment;
        this.j = ck51Var;
        this.k = cVar2;
        this.l = xdf0Var;
        this.m = h3yVar;
        this.n = kseVar;
        ChatRequest chatRequest = q6bVar.b;
        kotlinx.coroutines.flow.e.H(cVar, new jqr(dctVar.a(chatRequest), new TimelineSendMessageFacade$1(this, null), 3));
        kotlinx.coroutines.flow.e.H(cVar, new jqr(p4tVar.a(chatRequest), new TimelineSendMessageFacade$2(this, null), 3));
        kotlinx.coroutines.flow.e.H(cVar, new jqr(kotlinx.coroutines.flow.e.i(new AuthorizationObservable$authStateFlow$$inlined$disposableFlowWrapper$1(null, jn3Var)), new TimelineSendMessageFacade$3(this, null), 3));
    }

    public static void d(g gVar, String str, boolean z, String[] strArr, ForwardMessageRef[] forwardMessageRefArr, boolean z2, Map map, String str2, boolean z3, String str3, g720 g720Var, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            strArr = null;
        }
        if ((i & 8) != 0) {
            forwardMessageRefArr = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            z3 = false;
        }
        if ((i & 256) != 0) {
            str3 = null;
        }
        if ((i & 512) != 0) {
            g720Var = null;
        }
        if (gVar.a()) {
            return;
        }
        w7b w7bVar = gVar.c;
        if (g720Var == null) {
            g720Var = gVar.b.a;
        }
        CustomPayload b = gVar.b(map);
        w7bVar.b.getClass();
        yw80 d = ax80.d(str, z, strArr, forwardMessageRefArr, g720Var, z2, z3, b, str2, str3);
        if (d == null) {
            return;
        }
        w7bVar.c.c(w7bVar.a, d);
    }

    public final boolean a() {
        long j = this.o;
        if (j <= 0) {
            return false;
        }
        j3b j3bVar = this.p;
        this.d.f("rate limiter toast shown", "chat_id", j3bVar != null ? j3bVar.b : null, "wait_for", Long.valueOf(j));
        Toast.makeText(this.a, oyh0.messaging_sending_messages_temporary_blocked, 0).show();
        return true;
    }

    public final CustomPayload b(Map map) {
        i3y a = kotlin.a.a(new x1z0(22));
        JsonAdapter adapter = this.g.adapter(MessengerSupportContext.class);
        String str = this.b.q;
        MessengerSupportContext messengerSupportContext = str != null ? (MessengerSupportContext) adapter.fromJson(str) : null;
        j3b j3bVar = this.p;
        if ((j3bVar != null && j3bVar.E) || messengerSupportContext != null) {
            CustomPayload customPayload = (CustomPayload) a.getValue();
            i720 i720Var = this.f;
            customPayload.setServiceName(i720Var.c);
            customPayload.setUserAgent(i720Var.c());
            customPayload.setTarget(i720Var.b());
            customPayload.setLocale(i720Var.a());
            customPayload.setContext(messengerSupportContext);
        }
        if (map != null) {
            ((CustomPayload) a.getValue()).setCallbackData(map);
        }
        if (a.isInitialized()) {
            return (CustomPayload) a.getValue();
        }
        return null;
    }

    public final void c(ArrayList arrayList, String str, String[] strArr, ForwardMessageRef[] forwardMessageRefArr, String str2, g720 g720Var) {
        boolean z;
        tje.e();
        com.yandex.messaging.internal.view.input.c cVar = this.k;
        boolean z2 = ((uqq0) cVar.f.a.getValue()).a;
        boolean z3 = ((uqq0) cVar.f.a.getValue()).b;
        if (a()) {
            return;
        }
        List J0 = kotlin.collections.a.J0(arrayList);
        String[] strArr2 = strArr != null ? (String[]) strArr.clone() : null;
        ForwardMessageRef[] forwardMessageRefArr2 = forwardMessageRefArr != null ? (ForwardMessageRef[]) forwardMessageRefArr.clone() : null;
        j3b j3bVar = this.p;
        if (j3bVar != null) {
            String str3 = j3bVar.b;
            z = this.h.a(str3, j3bVar.K, j3bVar.E, j3bVar.M, ChatId.Companion.b(str3), clb1.d(this.i), this.q);
        } else {
            z = false;
        }
        boolean z4 = z;
        tje.N(this.l, this.n.d, null, new TimelineSendMessageFacade$sendMediaMessagesImpl$1(((wk31) this.m.get()).c, z4, J0, this, g720Var, str, strArr2, forwardMessageRefArr2, z2, z3, str2, null), 2);
    }

    public final void e(String str, String str2) {
        tje.e();
        if (a()) {
            return;
        }
        g720 g720Var = this.b.a;
        CustomPayload b = b(null);
        w7b w7bVar = this.c;
        w7bVar.getClass();
        StickerMessageData stickerMessageData = new StickerMessageData(str2, str);
        w7bVar.b.getClass();
        String uuid = UUID.randomUUID().toString();
        tje.e();
        w7bVar.c.c(w7bVar.a, new yw80(uuid, stickerMessageData, b, null, null, null, null, g720Var, false, false, null, null));
    }
}
