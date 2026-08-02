package com.yandex.messaging.input.bricks.writing;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.yandex.messaging.input.f;
import com.yandex.messaging.input.g;
import com.yandex.messaging.input.quote.QuotePresenter$QuoteType;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import defpackage.as10;
import defpackage.cs10;
import defpackage.d1w;
import defpackage.ds10;
import defpackage.evu0;
import defpackage.g720;
import defpackage.h1w;
import defpackage.h3y;
import defpackage.i4u;
import defpackage.j1w;
import defpackage.jl40;
import defpackage.k0b;
import defpackage.l1w;
import defpackage.m1w;
import defpackage.ny61;
import defpackage.p1w;
import defpackage.pzt0;
import defpackage.q6b;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uqq0;
import defpackage.w511;
import defpackage.wy31;
import defpackage.xv10;
import defpackage.zbu0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class e {
    public pzt0 A;
    public String B;
    public final com.yandex.messaging.input.voice.b C;
    public final Context a;
    public final com.yandex.messaging.navigation.c b;
    public final g c;
    public final k0b d;
    public final m1w e;
    public final com.yandex.messaging.input.preview.a f;
    public final com.yandex.messaging.input.quote.a g;
    public final InputTextController h;
    public final h3y i;
    public final q6b j;
    public final b k;
    public final zbu0 l;
    public final com.yandex.messaging.internal.view.input.e m;
    public final com.yandex.messaging.internal.view.input.c n;
    public final f o;
    public InputWritingPhase p = InputWritingPhase.Empty;
    public String q = "";
    public String r = "";
    public final ArrayList s = new ArrayList();
    public boolean t = true;
    public xv10 u;
    public String v;
    public long w;
    public boolean x;
    public boolean y;
    public boolean z;

    public e(Context context, com.yandex.messaging.navigation.c cVar, g gVar, k0b k0bVar, m1w m1wVar, com.yandex.messaging.input.preview.a aVar, com.yandex.messaging.input.quote.a aVar2, InputTextController inputTextController, h3y h3yVar, q6b q6bVar, b bVar, zbu0 zbu0Var, wy31 wy31Var, com.yandex.messaging.internal.view.input.e eVar, com.yandex.messaging.internal.view.input.c cVar2, f fVar) {
        this.a = context;
        this.b = cVar;
        this.c = gVar;
        this.d = k0bVar;
        this.e = m1wVar;
        this.f = aVar;
        this.g = aVar2;
        this.h = inputTextController;
        this.i = h3yVar;
        this.j = q6bVar;
        this.k = bVar;
        this.l = zbu0Var;
        this.m = eVar;
        this.n = cVar2;
        this.o = fVar;
        this.B = q6bVar.c;
        this.C = wy31Var.get();
        aVar2.G = new i4u(this);
    }

    public static ForwardMessageRef[] a(xv10 xv10Var) {
        List<ServerMessageRef> list = (List) xv10Var.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (ServerMessageRef serverMessageRef : list) {
            ForwardMessageRef forwardMessageRef = new ForwardMessageRef();
            forwardMessageRef.chatId = serverMessageRef.getRequiredChatId();
            forwardMessageRef.timestamp = serverMessageRef.getTimestamp();
            arrayList.add(forwardMessageRef);
        }
        return (ForwardMessageRef[]) kotlin.collections.a.x0(arrayList, new h1w()).toArray(new ForwardMessageRef[0]);
    }

    public final void b(boolean z) {
        com.yandex.messaging.input.preview.a aVar = this.f;
        if (!z) {
            this.q = "";
            b bVar = this.k;
            tje.N(bVar.d, null, null, new InputDraftController$clear$1(bVar, null), 3);
            aVar.f = "";
            aVar.a();
        }
        this.g.f(null);
        this.s.clear();
        a aVar2 = (a) this.i.get();
        aVar2.c.a.c(8);
        aVar2.b.e(EmptyList.a);
        g();
        aVar.e = true;
        aVar.a();
    }

    public final String c() {
        String str = this.q;
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = jl40.q(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public final void d() {
        d1w d1wVar;
        d1w d1wVar2;
        if (this.t) {
            return;
        }
        InputWritingPhase inputWritingPhase = this.p;
        String str = this.q;
        long j = this.w;
        boolean z = this.g.c() == null && this.x;
        p1w p1wVar = new p1w(inputWritingPhase, str, j, z);
        boolean z2 = z;
        m1w m1wVar = this.e;
        j1w j1wVar = m1wVar.a;
        Mesix mesix = m1wVar.c;
        int i = l1w.a[inputWritingPhase.ordinal()];
        ds10 ds10Var = as10.a;
        if (i == 1) {
            if (!evu0.J(evu0.k0(str).toString())) {
                ny61.r("Text should be empty in Empty phase.");
                return;
            }
            m1wVar.b(str);
            if (j > 0) {
                ds10Var = m1wVar.a(p1wVar);
            } else if (z2) {
                ds10Var = cs10.c;
            }
            boolean z3 = mesix.getState() instanceof as10;
            mesix.setState(ds10Var);
            if (!z3 && (ds10Var instanceof as10) && (d1wVar = m1wVar.d) != null) {
                d1wVar.invoke();
            }
            j1wVar.w.setVisibility(8);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                w511.b();
                return;
            }
            m1wVar.b(str);
            mesix.setState(j > 0 ? m1wVar.a(p1wVar) : cs10.d);
            j1wVar.w.setVisibility(8);
            return;
        }
        m1wVar.b(str);
        if (j > 0) {
            ds10Var = m1wVar.a(p1wVar);
        }
        boolean z4 = mesix.getState() instanceof as10;
        mesix.setState(ds10Var);
        if (!z4 && (ds10Var instanceof as10) && (d1wVar2 = m1wVar.d) != null) {
            d1wVar2.invoke();
        }
        j1wVar.w.setVisibility(8);
    }

    public final void e(List list) {
        if (this.j.o != null && list.isEmpty()) {
            this.y = true;
        }
        ArrayList arrayList = this.s;
        arrayList.clear();
        arrayList.addAll(list);
        g();
        d();
    }

    public final void f() {
        ForwardMessageRef[] forwardMessageRefArr;
        InputTextController inputTextController = this.h;
        String[] mentionedUsers = inputTextController.getMentionedUsers();
        String createDecodedText = inputTextController.createDecodedText();
        int length = createDecodedText.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = jl40.q(createDecodedText.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String obj = createDecodedText.subSequence(i, length + 1).toString();
        com.yandex.messaging.input.quote.a aVar = this.g;
        xv10 e = aVar.e();
        String str = e != null ? (String) e.w : null;
        xv10 e2 = aVar.e();
        g720 g720Var = e2 != null ? (g720) e2.x : null;
        ArrayList arrayList = this.s;
        boolean isEmpty = arrayList.isEmpty();
        String str2 = obj;
        g gVar = this.c;
        if (isEmpty) {
            List c = aVar.c();
            com.yandex.messaging.input.preview.a aVar2 = this.f;
            if (c != null) {
                boolean z3 = !aVar2.e;
                xv10 e3 = aVar.e();
                if (e3 == null || (forwardMessageRefArr = a(e3)) == null) {
                    forwardMessageRefArr = new ForwardMessageRef[0];
                }
                gVar.getClass();
                com.yandex.messaging.internal.view.input.c cVar = gVar.k;
                tje.e();
                g.d(gVar, str2, z3, mentionedUsers, forwardMessageRefArr, ((uqq0) cVar.f.a.getValue()).a, null, null, ((uqq0) cVar.f.a.getValue()).b, str, g720Var, 96);
                aVar.a();
            } else {
                boolean z4 = !aVar2.e;
                gVar.getClass();
                tje.e();
                com.yandex.messaging.internal.view.input.c cVar2 = gVar.k;
                g.d(gVar, str2, z4, mentionedUsers, null, ((uqq0) cVar2.f.a.getValue()).a, null, null, ((uqq0) cVar2.f.a.getValue()).b, null, null, 864);
            }
        } else {
            String str3 = str;
            g720 g720Var2 = g720Var;
            if (TextUtils.isEmpty(str2)) {
                str2 = null;
            }
            xv10 e4 = aVar.e();
            gVar.c(arrayList, str2, mentionedUsers, e4 != null ? a(e4) : null, str3, g720Var2);
        }
        com.yandex.messaging.internal.view.input.e eVar = this.m;
        if (eVar.d()) {
            eVar.a().c.a(false);
            com.yandex.messaging.internal.view.input.b bVar = eVar.a().c;
            SharedPreferences.Editor edit = bVar.a.edit();
            edit.putBoolean(bVar.b, true);
            edit.apply();
        }
        eVar.c.c(false);
        this.o.a.b(false);
        b(false);
        d();
    }

    public final void g() {
        InputWritingPhase inputWritingPhase;
        com.yandex.messaging.input.quote.a aVar = this.g;
        if (aVar.e() != null) {
            xv10 e = aVar.e();
            if ((e != null ? (QuotePresenter$QuoteType) e.c : null) == QuotePresenter$QuoteType.FORWARD) {
                inputWritingPhase = InputWritingPhase.ReadyToSend;
                if (c().length() == 0 || !this.s.isEmpty()) {
                    inputWritingPhase = InputWritingPhase.ReadyToSend;
                }
                this.p = inputWritingPhase;
            }
        }
        inputWritingPhase = InputWritingPhase.Empty;
        if (c().length() == 0) {
        }
        inputWritingPhase = InputWritingPhase.ReadyToSend;
        this.p = inputWritingPhase;
    }
}
