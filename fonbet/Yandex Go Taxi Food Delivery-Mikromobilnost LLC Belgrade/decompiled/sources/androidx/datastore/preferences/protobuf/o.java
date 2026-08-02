package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import defpackage.au50;
import defpackage.b64;
import defpackage.cxs0;
import defpackage.g8e;
import defpackage.nyo;
import defpackage.qyo;
import defpackage.tom0;
import defpackage.tyo;
import defpackage.xt10;
import defpackage.zxq;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class o implements tom0 {
    public final xt10 a;
    public final q b;
    public final boolean c;
    public final tyo d;

    public o(q qVar, tyo tyoVar, xt10 xt10Var) {
        this.b = qVar;
        ((j) tyoVar).getClass();
        this.c = xt10Var instanceof GeneratedMessageLite.a;
        this.d = tyoVar;
        this.a = xt10Var;
    }

    public static o j(q qVar, tyo tyoVar, xt10 xt10Var) {
        return new o(qVar, tyoVar, xt10Var);
    }

    @Override // defpackage.tom0
    public final boolean a(Object obj) {
        ((j) this.d).getClass();
        ((GeneratedMessageLite.a) obj).extensions.b();
        return true;
    }

    @Override // defpackage.tom0
    public final void b(Object obj, Object obj2) {
        p.l(this.b, obj, obj2);
        if (this.c) {
            p.k(this.d, obj, obj2);
        }
    }

    @Override // defpackage.tom0
    public final void c(Object obj) {
        ((s) this.b).getClass();
        r rVar = ((GeneratedMessageLite) obj).unknownFields;
        if (rVar.e) {
            rVar.e = false;
        }
        ((j) this.d).getClass();
        ((GeneratedMessageLite.a) obj).extensions.d();
    }

    @Override // defpackage.tom0
    public final GeneratedMessageLite d() {
        xt10 xt10Var = this.a;
        return xt10Var instanceof GeneratedMessageLite ? ((GeneratedMessageLite) xt10Var).l() : xt10Var.newBuilderForType().d();
    }

    @Override // defpackage.tom0
    public final int e(a aVar) {
        ((s) this.b).getClass();
        r rVar = ((GeneratedMessageLite) aVar).unknownFields;
        int i = rVar.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < rVar.a; i2++) {
                int i3 = rVar.b[i2] >>> 3;
                i += i.b(3, (ByteString) rVar.c[i2]) + i.e(i3) + i.d(2) + (i.d(1) * 2);
            }
            rVar.d = i;
        }
        if (this.c) {
            ((j) this.d).getClass();
            cxs0 cxs0Var = ((GeneratedMessageLite.a) aVar).extensions.a;
            if (cxs0Var.a.size() > 0) {
                Map.Entry c = cxs0Var.c(0);
                b64.D(c.getKey());
                c.getValue();
                throw null;
            }
            Iterator it = cxs0Var.d().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                b64.D(entry.getKey());
                entry.getValue();
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.tom0
    public final boolean f(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        s sVar = (s) this.b;
        sVar.getClass();
        r rVar = generatedMessageLite.unknownFields;
        sVar.getClass();
        if (!rVar.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        j jVar = (j) this.d;
        jVar.getClass();
        zxq zxqVar = ((GeneratedMessageLite.a) generatedMessageLite).extensions;
        jVar.getClass();
        return zxqVar.equals(((GeneratedMessageLite.a) generatedMessageLite2).extensions);
    }

    @Override // defpackage.tom0
    public final void g(Object obj, f fVar, qyo qyoVar) {
        q qVar = this.b;
        r a = qVar.a(obj);
        tyo tyoVar = this.d;
        ((j) tyoVar).getClass();
        GeneratedMessageLite.a aVar = (GeneratedMessageLite.a) obj;
        zxq zxqVar = aVar.extensions;
        if (zxqVar.b) {
            aVar.extensions = zxqVar.clone();
        }
        while (fVar.a() != Integer.MAX_VALUE) {
            try {
                o oVar = this;
                f fVar2 = fVar;
                qyo qyoVar2 = qyoVar;
                if (!oVar.k(fVar2, qyoVar2, tyoVar, qVar, a)) {
                    break;
                }
                this = oVar;
                fVar = fVar2;
                qyoVar = qyoVar2;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = a;
            }
        }
    }

    @Override // defpackage.tom0
    public final void h(Object obj, au50 au50Var) {
        ((j) this.d).getClass();
        Iterator c = ((GeneratedMessageLite.a) obj).extensions.c();
        if (c.hasNext()) {
            throw g8e.j((Map.Entry) c.next());
        }
        ((s) this.b).getClass();
        r rVar = ((GeneratedMessageLite) obj).unknownFields;
        rVar.getClass();
        au50Var.getClass();
        i iVar = (i) au50Var.b;
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int i = rVar.a - 1; i >= 0; i--) {
                int i2 = rVar.b[i] >>> 3;
                Object obj2 = rVar.c[i];
                if (obj2 instanceof ByteString) {
                    iVar.v(i2, (ByteString) obj2);
                } else {
                    iVar.u(i2, (xt10) obj2);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < rVar.a; i3++) {
            int i4 = rVar.b[i3] >>> 3;
            Object obj3 = rVar.c[i3];
            if (obj3 instanceof ByteString) {
                iVar.v(i4, (ByteString) obj3);
            } else {
                iVar.u(i4, (xt10) obj3);
            }
        }
    }

    @Override // defpackage.tom0
    public final int i(GeneratedMessageLite generatedMessageLite) {
        ((s) this.b).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode();
        if (!this.c) {
            return hashCode;
        }
        ((j) this.d).getClass();
        return ((GeneratedMessageLite.a) generatedMessageLite).extensions.a.hashCode() + (hashCode * 53);
    }

    public final boolean k(f fVar, qyo qyoVar, tyo tyoVar, q qVar, r rVar) {
        int i = fVar.b;
        xt10 xt10Var = this.a;
        if (i != 11) {
            if ((i & 7) != 2) {
                return fVar.x();
            }
            ((j) tyoVar).getClass();
            b64.D(qyoVar.a.get(new nyo(i >>> 3, xt10Var)));
            return qVar.b(rVar, fVar, 0);
        }
        ByteString byteString = null;
        int i2 = 0;
        while (fVar.a() != Integer.MAX_VALUE) {
            int i3 = fVar.b;
            if (i3 == 16) {
                fVar.w(0);
                i2 = fVar.a.z();
                ((j) tyoVar).getClass();
                b64.D(qyoVar.a.get(new nyo(i2, xt10Var)));
            } else if (i3 == 26) {
                byteString = fVar.e();
            } else if (!fVar.x()) {
                break;
            }
        }
        if (fVar.b != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (byteString == null) {
            return true;
        }
        ((s) qVar).getClass();
        rVar.c((i2 << 3) | 2, byteString);
        return true;
    }
}
