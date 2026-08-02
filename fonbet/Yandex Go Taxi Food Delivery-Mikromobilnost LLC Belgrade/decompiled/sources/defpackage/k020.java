package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.room.util.a;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.Metadata;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.data.e;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatFlags;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.messaging.internal.images.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class k020 {
    public final Context a;
    public final at2 b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final q8g f;
    public final yvf0 g;
    public final h3y h;
    public final ouf0 i;
    public final e j;
    public final h3y k;
    public l020 l;
    public volatile x4b0 m;

    public k020(Context context, at2 at2Var, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, q8g q8gVar, yvf0 yvf0Var, h3y h3yVar4, ouf0 ouf0Var, e eVar, h3y h3yVar5) {
        this.a = context;
        this.b = at2Var;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
        this.f = q8gVar;
        this.g = yvf0Var;
        this.h = h3yVar4;
        this.i = ouf0Var;
        this.j = eVar;
        this.k = h3yVar5;
        at2Var.c0(new j020(this));
    }

    public final x4b0 A() {
        if (this.m != null) {
            return this.m;
        }
        z7b0 z7b0Var = (z7b0) a.b(this.b.k0().a, true, false, new dia0(19));
        if (z7b0Var == null) {
            return null;
        }
        List<n5b0> list = (List) a.b(this.b.W().a, true, false, new dia0(15));
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (n5b0 n5b0Var : list) {
            arrayList.add(new w4b0(n5b0Var.a, n5b0Var.f, n5b0Var.b, n5b0Var.c, n5b0Var.d, n5b0Var.g, n5b0Var.e));
        }
        this.m = new x4b0(z7b0Var.b, z7b0Var.c, z7b0Var.d, z7b0Var.e, z7b0Var.f, z7b0Var.g, z7b0Var.h, z7b0Var.i, z7b0Var.j, (w4b0[]) arrayList.toArray(new w4b0[0]), z7b0Var.m);
        return this.m;
    }

    public final Object B(yls ylsVar) {
        return this.b.o0(new vmz(21, ylsVar, this));
    }

    public final l020 C() {
        this.c.get();
        Looper.myLooper();
        z83.i();
        z83.i();
        q8g q8gVar = this.f;
        z8g z8gVar = q8gVar.a;
        p8g p8gVar = q8gVar.b;
        p720 p720Var = new p720();
        xvf0 xvf0Var = z8gVar.d;
        h420 h420Var = z8gVar.i;
        eqh eqhVar = p8gVar.z;
        mwq mwqVar = new mwq(xvf0Var, h420Var, eqhVar, 17);
        uc50 uc50Var = new uc50(xvf0Var, eqhVar, 5);
        h420 h420Var2 = z8gVar.k;
        edf0 edf0Var = p8gVar.O;
        xvf0 xvf0Var2 = z8gVar.y;
        nt0 nt0Var = new nt0((xvf0) h420Var2, (xvf0) eqhVar, (xvf0) edf0Var, xvf0Var2, z8gVar.e0, z8gVar.N, (xvf0) mwqVar, (xvf0) uc50Var, p8gVar.q1, (xvf0) h420Var, 7, false);
        fat0 fat0Var = new fat0(eqhVar, xvf0Var2, 27);
        int i = 20;
        c4p c4pVar = new c4p((xvf0) eqhVar, (xvf0) new mu7(z5b.a, bdb.a, i), 10);
        xvf0 b = i5m.b(new br10(p720Var, eqhVar, 23));
        eqh eqhVar2 = p8gVar.z;
        br10 br10Var = new br10(p720Var, eqhVar2, i);
        br10 br10Var2 = new br10(p720Var, eqhVar2, 19);
        xvf0 b2 = i5m.b(new qh9(br10Var, br10Var2, b, 0));
        xvf0 b3 = i5m.b(new qh9(br10Var, br10Var2, b2, 1));
        eqh eqhVar3 = p8gVar.z;
        br10 br10Var3 = new br10(p720Var, eqhVar3, 12);
        br10 br10Var4 = new br10(p720Var, eqhVar3, 16);
        br10 br10Var5 = new br10(p720Var, eqhVar3, 26);
        br10 br10Var6 = new br10(p720Var, eqhVar3, 13);
        br10 br10Var7 = new br10(p720Var, eqhVar3, 17);
        br10 br10Var8 = new br10(p720Var, eqhVar3, 9);
        int i2 = 15;
        q720 q720Var = new q720(p720Var, eqhVar3, i2);
        br10 br10Var9 = new br10(p720Var, eqhVar3, i2);
        q720 q720Var2 = new q720(p720Var, eqhVar3, 6);
        q720 q720Var3 = new q720(p720Var, eqhVar3, 1);
        q720 q720Var4 = new q720(p720Var, eqhVar3, 16);
        q720 q720Var5 = new q720(p720Var, eqhVar3, 11);
        q720 q720Var6 = new q720(p720Var, eqhVar3, 13);
        q720 q720Var7 = new q720(p720Var, eqhVar3, 12);
        q720 q720Var8 = new q720(p720Var, eqhVar3, 8);
        q720 q720Var9 = new q720(p720Var, eqhVar3, 10);
        q720 q720Var10 = new q720(p720Var, eqhVar3, 0);
        br10 br10Var10 = new br10(p720Var, eqhVar3, 25);
        xvf0 b4 = i5m.b(new zs0(z8gVar.k, q720Var4, q720Var, q720Var5, q720Var6, q720Var7, q720Var8, q720Var9, br10Var, q720Var10, br10Var10, p8gVar.M, p8gVar.O, p8gVar.W1, p8gVar.X1, b2, p8gVar.A0));
        xvf0 b5 = i5m.b(new kdb(p8gVar.H, p8gVar.z, br10Var, br10Var2, br10Var3, br10Var4, br10Var5, br10Var6, br10Var7, br10Var8, q720Var, br10Var9, q720Var2, q720Var3, p8gVar.O, p8gVar.W1, b4, nt0Var, fat0Var, b3, b2, new m7q0(z8gVar.e, 0), cx6.a));
        eqh eqhVar4 = p8gVar.z;
        br10 br10Var11 = new br10(p720Var, eqhVar4, 29);
        xvf0 b6 = i5m.b(new qx4(z8gVar.k, p8gVar.z, q720Var10, br10Var11, new br10(p720Var, eqhVar4, 28), new br10(p720Var, eqhVar4, 27), new br10(p720Var, eqhVar4, 11), z8gVar.N, p8gVar.O, p8gVar.E1, p8gVar.Y1, b2, z8gVar.y, z8gVar.e, i5m.b(new ncb(p8gVar.Z1, br10Var11, q720Var10, z8gVar.y, b2, z8gVar.N))));
        eqh eqhVar5 = p8gVar.z;
        q720 q720Var11 = new q720(p720Var, eqhVar5, 2);
        q720 q720Var12 = new q720(p720Var, eqhVar5, 4);
        q720 q720Var13 = new q720(p720Var, eqhVar5, 9);
        br10 br10Var12 = new br10(p720Var, eqhVar5, 21);
        q720 q720Var14 = new q720(p720Var, eqhVar5, 7);
        br10 br10Var13 = new br10(p720Var, eqhVar5, 10);
        int i3 = 14;
        l020 l020Var = (l020) i5m.b(new qx4(p8gVar.H, p8gVar.z, nt0Var, fat0Var, z8gVar.e, c4pVar, b, b2, b3, b5, b4, b6, i5m.b(new kkt(q720Var11, q720Var12, q720Var13, q720Var10, br10Var12, q720Var14, br10Var13, new q720(p720Var, eqhVar5, 3), new q720(p720Var, eqhVar5, 5), br10Var10, new br10(p720Var, eqhVar5, 18), new br10(p720Var, eqhVar5, i3), new q720(p720Var, eqhVar5, i3), new br10(p720Var, eqhVar5, 22), p8gVar.H, z8gVar.A0, p8gVar.R, p8gVar.O, z8gVar.f0, b2, elf.a)), i5m.b(new prq(br10Var13, new br10(p720Var, p8gVar.z, 24), b2, p8gVar.P0, z8gVar.f0)), i5m.b(new m580(q720Var8, br10Var13, br10Var12, nt0Var, q720Var4, q720Var9, q720Var, b4, b2)))).get();
        this.l = l020Var;
        return l020Var;
    }

    public final j3b a(t2b t2bVar) {
        Long l = t2bVar.t;
        long j = t2bVar.a;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        at2 at2Var = this.b;
        udb a = at2Var.c().a(longValue);
        if (a == null) {
            return null;
        }
        String str = a.b;
        String str2 = a.d;
        int i = a.e;
        String str3 = a.f;
        Long l2 = a.g;
        long j2 = a.i;
        boolean z = a.m;
        boolean z2 = a.n;
        boolean z3 = a.o;
        int i2 = a.p;
        boolean z4 = a.q;
        boolean z5 = a.r;
        boolean z6 = a.s;
        String str4 = a.t;
        boolean z7 = a.u;
        long j3 = a.z;
        long j4 = a.A;
        long j5 = a.B;
        long j6 = a.C;
        boolean z8 = a.D;
        boolean a2 = ChatFlags.a(j2, 1L);
        boolean a3 = ChatFlags.a(j2, 4L);
        boolean a4 = ChatFlags.a(j2, 128L);
        boolean a5 = ChatFlags.a(j2, 8L);
        ChatNamespaces.b(str);
        boolean z9 = z || z3;
        ChatNamespaces.a(str);
        if (!a5 && !a3 && !a2 && !ChatId.Companion.f(str)) {
            ChatNamespaces.b(str);
        }
        ChatId.Companion.b(str);
        if (j4 <= 0 || j5 == -1 || !z9) {
        }
        z83.c(null, z && z3);
        if (a4) {
            z83.i();
        }
        fzy0 fzy0Var = (fzy0) a.b(at2Var.d0().a, true, false, new pzy0(j, 1));
        Integer num = (Integer) a.b(at2Var.V().a, true, false, new cs0(j, 26));
        Integer num2 = fzy0Var != null ? fzy0Var.d : null;
        long j7 = t2bVar.a;
        String str5 = t2bVar.b;
        boolean z10 = fzy0Var != null && fzy0Var.f;
        Long l3 = t2bVar.t;
        Long l4 = t2bVar.u;
        Long l5 = t2bVar.w;
        int longValue2 = l5 != null ? (int) l5.longValue() : 0;
        return new j3b(j7, str5, str2, fzy0Var != null ? fzy0Var.c : 0, str3, l2, num2, j2, num != null ? num.intValue() : 0, false, false, z10, z2, false, i2, z4, z5, z6, str4, z7, l3, l4, j3, longValue2, j4, j5, j6, z8);
    }

    public final String b(String str) {
        ChatId a = ChatId.Companion.a(str);
        ChatId.PrivateChatId privateChatId = a instanceof ChatId.PrivateChatId ? (ChatId.PrivateChatId) a : null;
        if (privateChatId == null) {
            return null;
        }
        if (!((el21) this.g.get()).c().equals(privateChatId.c())) {
            return privateChatId.c();
        }
        String str2 = privateChatId.a;
        return ChatId.Companion.e(str2) ? str2.substring(37, 73) : "";
    }

    public final in21 c(UserData userData) {
        aae a;
        String str = userData.displayName;
        if (userData.isDisplayRestricted) {
            str = this.a.getResources().getString(oyh0.empty_user_placeholder);
        }
        String f = b.f(userData.avatarId);
        String str2 = userData.phoneId;
        if (str2 != null && (a = ((com.yandex.messaging.internal.storage.contacts.a) this.e.get()).a(str2)) != null) {
            String str3 = a.d;
            if (!((el21) this.g.get()).c().equals(userData.userId) && str3 != null && !evu0.J(str3)) {
                str = str3;
            }
        }
        String str4 = str;
        String str5 = userData.userId;
        String str6 = userData.nickname;
        String str7 = userData.phoneId;
        boolean z = userData.isRobot;
        UserData.RobotInfo robotInfo = userData.robotInfo;
        return new in21(str4, f, str5, str6, str7, null, null, z, robotInfo != null ? robotInfo.cannotBeBlocked : false, robotInfo != null ? robotInfo.isSupport : false, robotInfo != null ? robotInfo.disablePrivates : false, Long.valueOf(userData.version), userData.displayName, userData.accountDeleted, false);
    }

    public final void d(tls tlsVar) {
        l020 C = C();
        try {
            tlsVar.invoke(C);
            C.s();
            C.close();
        } finally {
        }
    }

    public final long e() {
        return ((Number) a.b(this.b.A().a, true, false, new nqi0(22))).longValue();
    }

    public final long f() {
        return ((Number) a.b(this.b.A().a, true, false, new nqi0(16))).longValue();
    }

    public final x221 g(Long l, ChatRequest chatRequest) {
        int i;
        int intValue;
        at2 at2Var = this.b;
        d421 d421Var = (d421) a.b(at2Var.J().a, true, false, new of11(19));
        if (d421Var == null) {
            return null;
        }
        int i2 = d421Var.c;
        int i3 = d421Var.d;
        if (l != null) {
            if (l.longValue() == 0) {
                i3 = ((Number) a.b(at2Var.d0().a, true, false, new uiy0(25))).intValue();
                intValue = ((Number) a.b(at2Var.c().a, true, false, new teb(5))).intValue();
            } else {
                i3 = ((Number) a.b(at2Var.d0().a, true, false, new vh10(l.longValue(), 29))).intValue();
                intValue = ((Number) a.b(at2Var.c().a, true, false, new hcb(l.longValue(), 23))).intValue();
            }
            i = intValue + i3;
            i2 -= i;
        } else {
            i = 0;
        }
        if (chatRequest == null) {
            return new x221(i2, i, 0, i3);
        }
        if (!chatRequest.handle((l8b) new egz())) {
            return null;
        }
        j3b j3bVar = (j3b) chatRequest.handle(new xl10(this));
        if (j3bVar != null) {
            boolean z = j3bVar.j;
            boolean z2 = j3bVar.m;
            int i4 = j3bVar.d;
            boolean z3 = j3bVar.l;
            if (!j3bVar.J) {
                r4 = (j3bVar.C || z3 || j3bVar.n) ? i4 : 0;
                if (j3bVar.L && !z2 && !z) {
                    i2 -= r4;
                }
                if (l != null && !z2 && !z) {
                    i -= r4;
                }
            } else if (z3) {
                r4 = i4;
            }
        }
        return new x221(i2, i, r4, i3);
    }

    public final boolean h(ServerMessageRef serverMessageRef) {
        at2 at2Var = this.b;
        Long c = at2Var.Y().c(serverMessageRef.getRequiredChatId());
        if (c == null) {
            return false;
        }
        long longValue = c.longValue();
        return ((Boolean) a.b(at2Var.b().a, true, false, new j2b(18, longValue, serverMessageRef.getTimestamp()))).booleanValue();
    }

    public final boolean i(String str) {
        return jl40.l((Boolean) a.b(this.b.c().a, true, false, new b5a(str, 25)), Boolean.FALSE);
    }

    public final long j(String str) {
        return this.b.S().a(str);
    }

    public final j3b k(long j) {
        at2 at2Var = this.b;
        udb a = at2Var.c().a(j);
        if (a != null) {
            return new j3b(a.a, a.b, a.d, a.e, a.f, a.g, a.h, a.i, a.j, a.k, a.l, a.m, a.n, a.o, a.p, a.q, a.r, a.s, a.t, a.u, null, null, a.z, 0, a.A, a.B, a.C, a.D);
        }
        t2b t2bVar = (t2b) a.b(at2Var.Y().a, true, false, new hcb(j, 4));
        if (t2bVar == null) {
            w511.f(qv10.j(j, "No chat or thread found for chatInternalId="));
            return null;
        }
        j3b a2 = a(t2bVar);
        if (a2 != null) {
            return a2;
        }
        w511.f(g8e.o("No parent chat found for threadId=", t2bVar.b));
        return null;
    }

    public final j3b l(String str) {
        ChatId a = ChatId.Companion.a(str);
        boolean z = (a instanceof ChatId.ThreadId) && ((ChatId.ThreadId) a).d >= 0;
        at2 at2Var = this.b;
        if (z) {
            t2b a2 = at2Var.Y().a(str);
            if (a2 == null) {
                return null;
            }
            return a(a2);
        }
        udb udbVar = (udb) a.b(at2Var.c().a, true, false, new b5a(str, 24));
        if (udbVar != null) {
            return new j3b(udbVar.a, udbVar.b, udbVar.d, udbVar.e, udbVar.f, udbVar.g, udbVar.h, udbVar.i, udbVar.j, udbVar.k, udbVar.l, udbVar.m, udbVar.n, udbVar.o, udbVar.p, udbVar.q, udbVar.r, udbVar.s, udbVar.t, udbVar.u, null, null, udbVar.z, 0, udbVar.A, udbVar.B, udbVar.C, udbVar.D);
        }
        return null;
    }

    public final j3b m(String str) {
        udb udbVar = (udb) a.b(this.b.c().a, true, false, new b5a(str, 26));
        if (udbVar != null) {
            return new j3b(udbVar.a, udbVar.b, udbVar.d, udbVar.e, udbVar.f, udbVar.g, udbVar.h, udbVar.i, udbVar.j, udbVar.k, udbVar.l, udbVar.m, udbVar.n, udbVar.o, udbVar.p, udbVar.q, udbVar.r, udbVar.s, udbVar.t, udbVar.u, null, null, udbVar.z, 0, udbVar.A, udbVar.B, udbVar.C, udbVar.D);
        }
        return null;
    }

    public final Metadata n(long j) {
        return this.b.m0().a(j, this.i, (Moshi) this.h.get());
    }

    public final List o(o1b0 o1b0Var) {
        boolean f = ChatId.Companion.f(o1b0Var.b);
        at2 at2Var = this.b;
        if (!f) {
            return at2Var.a0().a(o1b0Var.a);
        }
        Long l = o1b0Var.i;
        if (l != null) {
            List a = at2Var.a0().a(l.longValue());
            if (a != null) {
                return a;
            }
        }
        return EmptyList.a;
    }

    public final yab p(int i, long j, long j2) {
        at2 at2Var = this.b;
        long g = at2Var.Y().g(j);
        az10 B = at2Var.B();
        return new yab(B.S(i, j, j2), (Moshi) this.h.get(), g);
    }

    public final yab q(int i, long j, long j2) {
        at2 at2Var = this.b;
        long g = at2Var.Y().g(j);
        az10 B = at2Var.B();
        return new yab(B.O(i, j, j2 - 1), (Moshi) this.h.get(), g);
    }

    public final String r() {
        String str;
        x4b0 A = A();
        if (A == null) {
            return null;
        }
        w4b0 b = A.b(Long.valueOf(this.j.c()));
        return (b == null || (str = b.c) == null) ? A.g : str;
    }

    public final com.yandex.messaging.domain.statuses.a[] s() {
        omf[] omfVarArr = (omf[]) a.b(this.b.j0().a, true, false, new a5f(13));
        ArrayList arrayList = new ArrayList(omfVarArr.length);
        for (omf omfVar : omfVarArr) {
            arrayList.add(new com.yandex.messaging.domain.statuses.a(new clf(omfVar.c, omfVar.b, omfVar.f, null), StatusAvailability.INSTANCE.findByTypeOrDefault(omfVar.d), omfVar.e == 1));
        }
        return (com.yandex.messaging.domain.statuses.a[]) arrayList.toArray(new com.yandex.messaging.domain.statuses.a[0]);
    }

    public final ywr t(long j, String str) {
        gwr l = this.b.l();
        Map map = (Map) a.b(l.a, true, false, new cwr(j, str, l));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new ywr((hwr) entry.getKey(), kotlin.collections.a.N0((List) entry.getValue())));
        }
        return (ywr) kotlin.collections.a.R(arrayList);
    }

    public final String u(String str) {
        return (String) a.b(this.b.Y().a, true, false, new b5a(str, 17));
    }

    public final boolean v() {
        return ((Boolean) a.b(this.b.W().a, true, false, new dia0(16))).booleanValue();
    }

    public final x400 w(long j) {
        gwr l = this.b.l();
        return (x400) a.b(l.a, true, false, new bwr(j, l, 1));
    }

    public final yab x(long j, abz0 abz0Var) {
        return alb1.i(this.b.B(), (Moshi) this.h.get(), j, abz0Var.a);
    }

    public final yab y(long j, LocalMessageRef localMessageRef) {
        long timestamp = localMessageRef.getTimestamp();
        h3y h3yVar = this.h;
        at2 at2Var = this.b;
        if (timestamp != 0) {
            return alb1.i(at2Var.B(), (Moshi) h3yVar.get(), j, localMessageRef.getTimestamp());
        }
        if (localMessageRef.getMessageId() == null) {
            ny61.k();
            return null;
        }
        az10 B = at2Var.B();
        return new yab(B.Y(j, localMessageRef.getMessageId()), (Moshi) h3yVar.get(), 0L);
    }

    public final yd80 z(Long l) {
        sdb sdbVar;
        ezy0 ezy0Var;
        at2 at2Var = this.b;
        ueb c = at2Var.c();
        int i = 4;
        if (l == null) {
            sdbVar = (sdb) a.b(c.a, true, false, new teb(6));
        } else if (l.longValue() == 0) {
            sdbVar = (sdb) a.b(c.a, true, false, new teb(i));
        } else {
            sdbVar = (sdb) a.b(c.a, true, false, new hcb(l.longValue(), 22));
        }
        qzy0 d0 = at2Var.d0();
        if (l == null) {
            ezy0Var = (ezy0) a.b(d0.a, true, false, new uiy0(28));
        } else if (l.longValue() == 0) {
            ezy0Var = (ezy0) a.b(d0.a, true, false, new uiy0(27));
        } else {
            ezy0Var = (ezy0) a.b(d0.a, true, false, new pzy0(l.longValue(), i));
        }
        return new yd80(sdbVar.a, sdbVar.b, ezy0Var.a);
    }
}
