package com.yandex.messaging.ui.timeline;

import android.content.Intent;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.internal.entities.AddresseeType;
import defpackage.at2;
import defpackage.eil0;
import defpackage.ike;
import defpackage.j3b;
import defpackage.kgx;
import defpackage.m5g0;
import defpackage.p4t;
import defpackage.pb;
import defpackage.q6b;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.vse;
import defpackage.w270;
import defpackage.x22;
import defpackage.x270;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class b {
    public static final /* synthetic */ kgx[] p;
    public final x22 a;
    public final at2 b;
    public final q6b c;
    public final ChatRequest d;
    public final w270 e;
    public final eil0 f;
    public final tpr g;
    public final pb h;
    public final int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final rp3 m;
    public Intent n;
    public final ike o;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("chatOpenJob", 0, "getChatOpenJob()Lkotlinx/coroutines/Job;", b.class);
        qoi0.a.getClass();
        p = new kgx[]{mutablePropertyReference1Impl};
    }

    public b(x22 x22Var, at2 at2Var, vse vseVar, q6b q6bVar, ChatRequest chatRequest, p4t p4tVar, w270 w270Var, eil0 eil0Var) {
        this.a = x22Var;
        this.b = at2Var;
        this.c = q6bVar;
        this.d = chatRequest;
        this.e = w270Var;
        this.f = eil0Var;
        tpr a = p4tVar.a(chatRequest);
        this.g = a;
        this.h = new pb(a, 26);
        this.i = hashCode();
        this.m = new rp3();
        this.o = vseVar.c(true);
    }

    public final void a(j3b j3bVar, Intent intent) {
        if (this.j) {
            return;
        }
        if ("com.yandex.messenger.Chat.OPEN".equals(intent != null ? intent.getAction() : null)) {
            q6b q6bVar = this.c;
            if (q6bVar.l) {
                ChatRequest chatRequest = q6bVar.b;
                String str = q6bVar.i;
                List list = q6bVar.m;
                m5g0 m5g0Var = q6bVar.n;
                ExistingChatRequest existingChatRequest = chatRequest instanceof ExistingChatRequest ? (ExistingChatRequest) chatRequest : null;
                Map i = kotlin.collections.b.i(new Pair("chat id", existingChatRequest != null ? existingChatRequest.id() : null), new Pair("chat type", j3bVar != null ? j3bVar.N : null), new Pair("messages_count", list != null ? Integer.valueOf(list.size()) : null), new Pair("message_timestamps", list != null ? kotlin.collections.a.X(list, Extension.FIX_SPACE, null, null, null, 62) : null), new Pair("addressee id", str), new Pair("transit_id", m5g0Var != null ? m5g0Var.a : null), new Pair("from_xiva_push", Boolean.valueOf(m5g0Var != null)));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : i.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                this.a.reportEvent("notification_opened", linkedHashMap);
            }
        }
        this.j = true;
    }

    public final void b(j3b j3bVar, x270 x270Var) {
        Map i;
        if (this.k) {
            return;
        }
        this.k = true;
        q6b q6bVar = this.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q6bVar.a.a());
        linkedHashMap.put("chat window", Integer.valueOf(this.i));
        x270Var.a.getClass();
        Pair[] pairArr = {new Pair("group call", "no call"), new Pair("meeting id", null)};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            if (pair.f() != null) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((Pair) it.next());
        }
        linkedHashMap.putAll(kotlin.collections.b.s(arrayList2));
        if (j3bVar != null) {
            String str = j3bVar.N;
            Pair pair2 = new Pair("chat id", j3bVar.b);
            Pair pair3 = new Pair("type", str);
            Pair pair4 = new Pair("notifications", !j3bVar.j ? BackendConfig.Restrictions.ENABLED : BackendConfig.Restrictions.DISABLED);
            AddresseeType.Companion companion = AddresseeType.INSTANCE;
            String str2 = j3bVar.e;
            boolean c = str2 != null ? this.b.a().c(str2) : false;
            companion.getClass();
            i = kotlin.collections.b.i(pair2, pair3, pair4, new Pair("addressee type", (c ? AddresseeType.CONTACT : AddresseeType.OTHER).getReportName()), new Pair("chat_opened_by_invite_link", Boolean.valueOf(q6bVar.t)));
        } else {
            i = kotlin.collections.b.i(new Pair("type", StringUtils.UNDEFINED), new Pair("chat id", q6bVar.b.uniqueRequestId()));
        }
        linkedHashMap.putAll(i);
        this.a.reportEvent("chat opened", linkedHashMap);
    }

    public final void c(tls tlsVar) {
        tje.N(this.o, null, null, new ChatReporter$withThreadInfo$1(this, tlsVar, null), 3);
    }
}
