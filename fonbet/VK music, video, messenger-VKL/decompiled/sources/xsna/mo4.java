package xsna;

import android.content.Context;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.hfr;

/* compiled from: AudioFocusOrchestratorImpl.kt */
/* loaded from: classes3.dex */
public final class mo4 implements lo4 {
    public static final bpn0 d = new bpn0(new n1(4));
    public final LinkedHashMap<jo4, a.C3353a> a = new LinkedHashMap<>();
    public a b;
    public a c;

    /* compiled from: AudioFocusOrchestratorImpl.kt */
    public static final class a {
        public final jo4 a;
        public final C3353a b;

        /* compiled from: AudioFocusOrchestratorImpl.kt */
        /* renamed from: xsna.mo4$a$a, reason: collision with other inner class name */
        public static final class C3353a {
            public final boolean a;
            public final boolean b;

            public C3353a(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3353a)) {
                    return false;
                }
                C3353a c3353a = (C3353a) obj;
                return this.a == c3353a.a && this.b == c3353a.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OrchestraPartInfo(isCurrentlyFocused=");
                sb.append(this.a);
                sb.append(", pausedByFocusLoss=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        public a(jo4 jo4Var, C3353a c3353a) {
            this.a = jo4Var;
            this.b = c3353a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OrchestraPart(orchestraPart=" + this.a + ", info=" + this.b + ')';
        }
    }

    public static void e(a aVar) {
        jo4 jo4Var;
        xv40 h;
        jo4 jo4Var2;
        xv40 h2;
        if (aVar != null && (jo4Var2 = aVar.a) != null && (h2 = jo4Var2.h()) != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            h2.a(context);
        }
        if (aVar == null || (jo4Var = aVar.a) == null || (h = jo4Var.h()) == null) {
            return;
        }
        h.b(-2);
    }

    @Override // xsna.lo4
    public final void a(ko4 ko4Var) {
        a.C3353a c3353a;
        if (b(ko4Var) == 1) {
            return;
        }
        L.p(new Object[0]);
        a aVar = this.b;
        if (aVar != null && (c3353a = aVar.b) != null && c3353a.a) {
            a.C3353a c3353a2 = new a.C3353a(false, true);
            this.a.put(aVar.a, c3353a2);
            a aVar2 = this.b;
            a aVar3 = aVar2 != null ? new a(aVar2.a, c3353a2) : null;
            this.c = aVar3;
            e(aVar3);
        }
        f(ko4Var);
    }

    @Override // xsna.lo4
    public final int b(ko4 ko4Var) {
        a aVar;
        a.C3353a c3353a;
        a aVar2;
        a.C3353a c3353a2;
        a aVar3 = this.b;
        if (!epx.f(aVar3 != null ? aVar3.a : null, ko4Var) || (aVar2 = this.b) == null || (c3353a2 = aVar2.b) == null || !c3353a2.a) {
            a aVar4 = this.c;
            if (epx.f(aVar4 != null ? aVar4.a : null, ko4Var) && (aVar = this.c) != null && (c3353a = aVar.b) != null && !c3353a.a) {
                return c3353a.b ? 4 : 2;
            }
            a.C3353a c3353a3 = this.a.get(ko4Var);
            if (c3353a3 == null) {
                return 0;
            }
            if (!c3353a3.a) {
                return c3353a3.b ? 4 : 2;
            }
        }
        return 1;
    }

    @Override // xsna.lo4
    public final void c(ko4 ko4Var) {
        L.p(new Object[0]);
        this.a.remove(ko4Var);
        a aVar = this.b;
        if (epx.f(aVar != null ? aVar.a : null, ko4Var)) {
            this.b = null;
            return;
        }
        a aVar2 = this.c;
        if (epx.f(aVar2 != null ? aVar2.a : null, ko4Var)) {
            this.c = null;
        }
    }

    @Override // xsna.lo4
    public final void d(ko4 ko4Var, boolean z, boolean z2) {
        int b = b(ko4Var);
        if (b == 2 || b == 4) {
            return;
        }
        L.p(new Object[0]);
        a aVar = this.b;
        if (aVar != null) {
            jo4 jo4Var = aVar.a;
            if (!epx.f(jo4Var, ko4Var) && aVar.b.a) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.w, new Object[]{"Inconsistency detected - the last focused part(=" + aVar + ") doesn't equal to the part that wants to abandon audio focus(=" + jo4Var + ')'});
                }
            }
        }
        LinkedHashMap<jo4, a.C3353a> linkedHashMap = this.a;
        if (z2) {
            linkedHashMap.put(ko4Var, new a.C3353a(false, false));
            xv40 xv40Var = ko4Var.c;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            xv40Var.a(context);
            g(ko4Var);
            return;
        }
        a.C3353a c3353a = new a.C3353a(false, z);
        a aVar2 = new a(ko4Var, c3353a);
        linkedHashMap.put(ko4Var, c3353a);
        this.b = aVar2;
        this.c = aVar2;
        if (z) {
            return;
        }
        e(aVar2);
        g(ko4Var);
    }

    public final void f(jo4 jo4Var) {
        a.C3353a c3353a = new a.C3353a(true, false);
        a aVar = new a(jo4Var, c3353a);
        this.a.put(jo4Var, c3353a);
        this.b = aVar;
        xv40 h = jo4Var.h();
        if (h != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            h.c(context);
        }
    }

    public final void g(ko4 ko4Var) {
        if (!ko4Var.d.a()) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.i, new Object[]{"Handing over the audio focus forbidden for " + ko4Var});
            return;
        }
        hfr.a aVar = new hfr.a(rli0.l(new i5g(this.a.entrySet()), new s9(ko4Var, 5)));
        Object obj = null;
        while (aVar.hasNext()) {
            Object next = aVar.next();
            Map.Entry entry = (Map.Entry) next;
            if (((a.C3353a) entry.getValue()).b && ((jo4) entry.getKey()).getConfig().b()) {
                obj = next;
            }
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 != null) {
            f((jo4) entry2.getKey());
            return;
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.i, new Object[]{"No orchestra part was found to hand over an audio focus to"});
    }

    @Override // xsna.lo4
    public final void release() {
        L.p(new Object[0]);
        this.b = null;
        this.c = null;
        this.a.clear();
    }
}
