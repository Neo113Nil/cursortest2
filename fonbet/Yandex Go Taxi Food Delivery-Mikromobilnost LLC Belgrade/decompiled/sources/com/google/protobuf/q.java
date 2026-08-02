package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import defpackage.bxs0;
import defpackage.eac;
import defpackage.evf0;
import defpackage.gp50;
import defpackage.ny61;
import defpackage.pyo;
import defpackage.qxs;
import defpackage.rxs;
import defpackage.som0;
import defpackage.syo;
import defpackage.tt10;
import defpackage.v43;
import defpackage.wt10;
import defpackage.yxq;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class q implements som0 {
    public final wt10 a;
    public final s b;
    public final boolean c;
    public final syo d;

    public q(s sVar, syo syoVar, wt10 wt10Var) {
        this.b = sVar;
        ((m) syoVar).getClass();
        this.c = wt10Var instanceof GeneratedMessageLite.a;
        this.d = syoVar;
        this.a = wt10Var;
    }

    public static q k(s sVar, syo syoVar, wt10 wt10Var) {
        return new q(sVar, syoVar, wt10Var);
    }

    @Override // defpackage.som0
    public final boolean a(Object obj) {
        ((m) this.d).getClass();
        return ((GeneratedMessageLite.a) obj).a.l();
    }

    @Override // defpackage.som0
    public final void b(Object obj, Object obj2) {
        r.l(this.b, obj, obj2);
        if (this.c) {
            ((m) this.d).getClass();
            yxq yxqVar = ((GeneratedMessageLite.a) obj2).a;
            if (yxqVar.j()) {
                return;
            }
            ((GeneratedMessageLite.a) obj).f().p(yxqVar);
        }
    }

    @Override // defpackage.som0
    public final void c(Object obj) {
        ((u) this.b).getClass();
        t tVar = ((GeneratedMessageLite) obj).unknownFields;
        if (tVar.e) {
            tVar.e = false;
        }
        ((m) this.d).getClass();
        ((GeneratedMessageLite.a) obj).a.o();
    }

    @Override // defpackage.som0
    public final Object d() {
        wt10 wt10Var = this.a;
        return wt10Var instanceof GeneratedMessageLite ? ((GeneratedMessageLite) wt10Var).newMutableInstance() : wt10Var.newBuilderForType().buildPartial();
    }

    @Override // defpackage.som0
    public final int e(b bVar) {
        ((u) this.b).getClass();
        t tVar = ((GeneratedMessageLite) bVar).unknownFields;
        int i = tVar.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < tVar.a; i2++) {
                int i3 = tVar.b[i2] >>> 3;
                i += l.b(3, (ByteString) tVar.c[i2]) + l.g(i3) + l.f(2) + (l.f(1) * 2);
            }
            tVar.d = i;
        }
        if (!this.c) {
            return i;
        }
        ((m) this.d).getClass();
        bxs0 bxs0Var = ((GeneratedMessageLite.a) bVar).a.a;
        int i4 = bxs0Var.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += yxq.h(bxs0Var.c(i6));
        }
        Iterator it = bxs0Var.d().iterator();
        while (it.hasNext()) {
            i5 += yxq.h((Map.Entry) it.next());
        }
        return i + i5;
    }

    @Override // defpackage.som0
    public final void f(Object obj, i iVar, pyo pyoVar) {
        s sVar = this.b;
        t a = sVar.a(obj);
        syo syoVar = this.d;
        ((m) syoVar).getClass();
        yxq f = ((GeneratedMessageLite.a) obj).f();
        while (iVar.b() != Integer.MAX_VALUE) {
            try {
                q qVar = this;
                i iVar2 = iVar;
                pyo pyoVar2 = pyoVar;
                if (!qVar.l(iVar2, pyoVar2, syoVar, f, sVar, a)) {
                    break;
                }
                this = qVar;
                iVar = iVar2;
                pyoVar = pyoVar2;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = a;
            }
        }
    }

    @Override // defpackage.som0
    public final int g(GeneratedMessageLite generatedMessageLite) {
        ((u) this.b).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode();
        if (!this.c) {
            return hashCode;
        }
        ((m) this.d).getClass();
        return ((GeneratedMessageLite.a) generatedMessageLite).a.a.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.som0
    public final boolean h(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        u uVar = (u) this.b;
        uVar.getClass();
        t tVar = generatedMessageLite.unknownFields;
        uVar.getClass();
        if (!tVar.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        m mVar = (m) this.d;
        mVar.getClass();
        yxq yxqVar = ((GeneratedMessageLite.a) generatedMessageLite).a;
        mVar.getClass();
        return yxqVar.equals(((GeneratedMessageLite.a) generatedMessageLite2).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca A[EDGE_INSN: B:37:0x00ca->B:38:0x00ca BREAK  A[LOOP:1: B:20:0x0071->B:28:0x009c], SYNTHETIC] */
    @Override // defpackage.som0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj, byte[] bArr, int i, int i2, v43 v43Var) {
        q qVar = this;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        t tVar = generatedMessageLite.unknownFields;
        if (tVar == t.f) {
            tVar = new t();
            generatedMessageLite.unknownFields = tVar;
        }
        t tVar2 = tVar;
        yxq f = ((GeneratedMessageLite.a) obj).f();
        int i3 = i;
        rxs rxsVar = null;
        while (i3 < i2) {
            rxs rxsVar2 = rxsVar;
            int r = d.r(bArr, i3, v43Var);
            int i4 = v43Var.a;
            pyo pyoVar = (pyo) v43Var.e;
            wt10 wt10Var = qVar.a;
            syo syoVar = qVar.d;
            int i5 = 2;
            if (i4 == 11) {
                int i6 = 0;
                ByteString byteString = null;
                while (r < i2) {
                    r = d.r(bArr, r, v43Var);
                    int i7 = v43Var.a;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != i5) {
                        if (i8 == 3) {
                            if (rxsVar2 != null) {
                                r = d.e(evf0.c.a(rxsVar2.b.getClass()), bArr, r, i2, v43Var);
                                f.r(rxsVar2.c, v43Var.c);
                            } else if (i9 == 2) {
                                r = d.a(bArr, r, v43Var);
                                byteString = (ByteString) v43Var.c;
                            }
                            i5 = 2;
                        }
                        if (i7 != 12) {
                            break;
                        }
                        r = d.w(i7, bArr, r, i2, v43Var);
                        i5 = 2;
                    } else {
                        if (i9 == 0) {
                            r = d.r(bArr, r, v43Var);
                            i6 = v43Var.a;
                            ((m) syoVar).getClass();
                            rxsVar2 = pyoVar.a(i6, wt10Var);
                            i5 = 2;
                        }
                        if (i7 != 12) {
                        }
                    }
                }
                if (byteString != null) {
                    tVar2.f((i6 << 3) | 2, byteString);
                }
                qVar = this;
                i3 = r;
            } else if ((i4 & 7) == 2) {
                ((m) syoVar).getClass();
                rxsVar2 = pyoVar.a(i4 >>> 3, wt10Var);
                if (rxsVar2 != null) {
                    i3 = d.e(evf0.c.a(rxsVar2.b.getClass()), bArr, r, i2, v43Var);
                    f.r(rxsVar2.c, v43Var.c);
                } else {
                    i3 = d.p(i4, bArr, r, i2, tVar2, v43Var);
                }
            } else {
                i3 = d.w(i4, bArr, r, i2, v43Var);
            }
            rxsVar = rxsVar2;
        }
        if (i3 != i2) {
            throw InvalidProtocolBufferException.j();
        }
    }

    @Override // defpackage.som0
    public final void j(Object obj, gp50 gp50Var) {
        ((m) this.d).getClass();
        Iterator n = ((GeneratedMessageLite.a) obj).a.n();
        while (n.hasNext()) {
            Map.Entry entry = (Map.Entry) n.next();
            qxs qxsVar = (qxs) entry.getKey();
            if (qxsVar.c.a() != WireFormat$JavaType.MESSAGE || qxsVar.w || qxsVar.x) {
                ny61.r("Found invalid MessageSet item.");
                return;
            }
            gp50Var.V(qxsVar.b, entry.getValue());
        }
        ((u) this.b).getClass();
        t tVar = ((GeneratedMessageLite) obj).unknownFields;
        tVar.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int i = tVar.a - 1; i >= 0; i--) {
                gp50Var.V(tVar.b[i] >>> 3, tVar.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < tVar.a; i2++) {
            gp50Var.V(tVar.b[i2] >>> 3, tVar.c[i2]);
        }
    }

    public final boolean l(i iVar, pyo pyoVar, syo syoVar, yxq yxqVar, s sVar, t tVar) {
        int i;
        int i2;
        int i3 = iVar.b;
        eac eacVar = iVar.a;
        wt10 wt10Var = this.a;
        if (i3 != 11) {
            if ((i3 & 7) != 2) {
                if (eacVar.e() || (i2 = iVar.b) == iVar.c) {
                    return false;
                }
                return eacVar.C(i2);
            }
            ((m) syoVar).getClass();
            rxs a = pyoVar.a(i3 >>> 3, wt10Var);
            if (a == null) {
                return sVar.b(tVar, iVar, 0);
            }
            yxqVar.r(a.c, iVar.B(a.b().getClass(), pyoVar));
            return true;
        }
        rxs rxsVar = null;
        ByteString byteString = null;
        int i4 = 0;
        while (iVar.b() != Integer.MAX_VALUE) {
            int i5 = iVar.b;
            if (i5 != 16) {
                if (i5 != 26) {
                    if (i5 == 12) {
                        break;
                    }
                    if (!((eacVar.e() || (i = iVar.b) == iVar.c) ? false : eacVar.C(i))) {
                        break;
                    }
                } else if (rxsVar != null) {
                    ((m) syoVar).getClass();
                    yxqVar.r(rxsVar.c, iVar.B(rxsVar.b().getClass(), pyoVar));
                } else {
                    byteString = iVar.j();
                }
            } else {
                i4 = iVar.Q();
                ((m) syoVar).getClass();
                rxsVar = pyoVar.a(i4, wt10Var);
            }
        }
        if (iVar.b != 12) {
            throw InvalidProtocolBufferException.b();
        }
        if (byteString != null) {
            if (rxsVar != null) {
                ((m) syoVar).getClass();
                tt10 newBuilderForType = rxsVar.b.newBuilderForType();
                eac k = byteString.k();
                newBuilderForType.mergeFrom(k, pyoVar);
                yxqVar.r(rxsVar.c, newBuilderForType.buildPartial());
                k.a(0);
                return true;
            }
            ((u) sVar).getClass();
            tVar.f((i4 << 3) | 2, byteString);
        }
        return true;
    }
}
