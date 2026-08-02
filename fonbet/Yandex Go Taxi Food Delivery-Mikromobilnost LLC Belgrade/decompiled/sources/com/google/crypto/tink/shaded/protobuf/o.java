package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import defpackage.axs0;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.oyo;
import defpackage.rom0;
import defpackage.ryo;
import defpackage.vt10;
import defpackage.w43;
import defpackage.xxq;
import defpackage.yv4;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class o implements rom0 {
    public final vt10 a;
    public final q b;
    public final boolean c;
    public final ryo d;

    public o(q qVar, ryo ryoVar, vt10 vt10Var) {
        this.b = qVar;
        ((i) ryoVar).getClass();
        this.c = vt10Var instanceof GeneratedMessageLite.a;
        this.d = ryoVar;
        this.a = vt10Var;
    }

    public static o k(q qVar, ryo ryoVar, vt10 vt10Var) {
        return new o(qVar, ryoVar, vt10Var);
    }

    @Override // defpackage.rom0
    public final boolean a(Object obj) {
        ((i) this.d).getClass();
        ((GeneratedMessageLite.a) obj).extensions.e();
        return true;
    }

    @Override // defpackage.rom0
    public final void b(Object obj, Object obj2) {
        p.x(this.b, obj, obj2);
        if (this.c) {
            ryo ryoVar = this.d;
            xxq c = ryoVar.c(obj2);
            if (c.d()) {
                return;
            }
            ryoVar.d(obj).getClass();
            xxq.h(c);
        }
    }

    @Override // defpackage.rom0
    public final void c(Object obj) {
        ((s) this.b).getClass();
        ((GeneratedMessageLite) obj).unknownFields.e = false;
        this.d.f(obj);
    }

    @Override // defpackage.rom0
    public final Object d() {
        vt10 vt10Var = this.a;
        return vt10Var instanceof GeneratedMessageLite ? ((GeneratedMessageLite) vt10Var).q() : vt10Var.newBuilderForType().buildPartial();
    }

    @Override // defpackage.rom0
    public final boolean e(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
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
        i iVar = (i) this.d;
        iVar.getClass();
        xxq xxqVar = ((GeneratedMessageLite.a) generatedMessageLite).extensions;
        iVar.getClass();
        return xxqVar.equals(((GeneratedMessageLite.a) generatedMessageLite2).extensions);
    }

    @Override // defpackage.rom0
    public final int f(GeneratedMessageLite generatedMessageLite) {
        ((s) this.b).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode();
        if (!this.c) {
            return hashCode;
        }
        ((i) this.d).getClass();
        return ((GeneratedMessageLite.a) generatedMessageLite).extensions.a.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.rom0
    public final int g(a aVar) {
        ((s) this.b).getClass();
        r rVar = ((GeneratedMessageLite) aVar).unknownFields;
        int i = rVar.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < rVar.a; i2++) {
                int i3 = rVar.b[i2] >>> 3;
                i += g.a(3, (ByteString) rVar.c[i2]) + g.j(i3) + g.i(2) + (g.i(1) * 2);
            }
            rVar.d = i;
        }
        if (this.c) {
            ((i) this.d).getClass();
            axs0 axs0Var = ((GeneratedMessageLite.a) aVar).extensions.a;
            if (axs0Var.b.size() > 0) {
                Map.Entry c = axs0Var.c(0);
                if (c.getKey() != null) {
                    ny61.u();
                    return 0;
                }
                c.getValue();
                throw null;
            }
            Iterator it = axs0Var.d().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null) {
                    ny61.u();
                    return 0;
                }
                entry.getValue();
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[EDGE_INSN: B:27:0x008c->B:28:0x008c BREAK  A[LOOP:1: B:13:0x0052->B:21:0x0052], SYNTHETIC] */
    @Override // defpackage.rom0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, byte[] bArr, int i, int i2, w43 w43Var) {
        int i3;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        r rVar = generatedMessageLite.unknownFields;
        if (rVar == r.f) {
            rVar = r.c();
            generatedMessageLite.unknownFields = rVar;
        }
        r rVar2 = rVar;
        GeneratedMessageLite.a aVar = (GeneratedMessageLite.a) obj;
        xxq xxqVar = aVar.extensions;
        if (xxqVar.b) {
            aVar.extensions = xxqVar.clone();
        }
        while (i < i2) {
            int i4 = c.i(bArr, i, w43Var);
            int i5 = w43Var.a;
            oyo oyoVar = w43Var.d;
            vt10 vt10Var = this.a;
            ryo ryoVar = this.d;
            if (i5 == 11) {
                int i6 = i2;
                w43 w43Var2 = w43Var;
                int i7 = 0;
                ByteString byteString = null;
                while (true) {
                    if (i4 >= i6) {
                        i3 = i4;
                        break;
                    }
                    i3 = c.i(bArr, i4, w43Var2);
                    int i8 = w43Var2.a;
                    int i9 = i8 >>> 3;
                    int i10 = i8 & 7;
                    if (i9 != 2) {
                        if (i9 == 3 && i10 == 2) {
                            i4 = c.a(bArr, i3, w43Var2);
                            byteString = (ByteString) w43Var2.c;
                        }
                        if (i8 != 12) {
                            break;
                        } else {
                            i4 = c.m(i8, bArr, i3, i6, w43Var2);
                        }
                    } else if (i10 == 0) {
                        i4 = c.i(bArr, i3, w43Var2);
                        i7 = w43Var2.a;
                        ((i) ryoVar).getClass();
                        oyoVar.a(vt10Var, i7);
                    } else if (i8 != 12) {
                    }
                }
                if (byteString != null) {
                    rVar2.d((i7 << 3) | 2, byteString);
                }
                i = i3;
                i2 = i6;
                w43Var = w43Var2;
            } else if ((i5 & 7) == 2) {
                ((i) ryoVar).getClass();
                oyoVar.a(vt10Var, i5 >>> 3);
                i = c.g(i5, bArr, i4, i2, rVar2, w43Var);
            } else {
                i = c.m(i5, bArr, i4, i2, w43Var);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.i();
        }
    }

    @Override // defpackage.rom0
    public final void i(Object obj, h hVar) {
        ((i) this.d).getClass();
        Iterator f = ((GeneratedMessageLite.a) obj).extensions.f();
        if (f.hasNext()) {
            throw g8e.j((Map.Entry) f.next());
        }
        ((s) this.b).getClass();
        r rVar = ((GeneratedMessageLite) obj).unknownFields;
        rVar.getClass();
        hVar.getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int i = rVar.a - 1; i >= 0; i--) {
                hVar.l(rVar.b[i] >>> 3, rVar.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < rVar.a; i2++) {
            hVar.l(rVar.b[i2] >>> 3, rVar.c[i2]);
        }
    }

    @Override // defpackage.rom0
    public final void j(Object obj, f fVar, oyo oyoVar) {
        q qVar = this.b;
        r a = qVar.a(obj);
        ryo ryoVar = this.d;
        ((i) ryoVar).getClass();
        GeneratedMessageLite.a aVar = (GeneratedMessageLite.a) obj;
        xxq xxqVar = aVar.extensions;
        if (xxqVar.b) {
            aVar.extensions = xxqVar.clone();
        }
        while (fVar.a() != Integer.MAX_VALUE) {
            try {
                o oVar = this;
                f fVar2 = fVar;
                oyo oyoVar2 = oyoVar;
                if (!oVar.l(fVar2, oyoVar2, ryoVar, qVar, a)) {
                    break;
                }
                this = oVar;
                fVar = fVar2;
                oyoVar = oyoVar2;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = a;
            }
        }
    }

    public final boolean l(f fVar, oyo oyoVar, ryo ryoVar, q qVar, r rVar) {
        int i;
        int i2;
        int i3 = fVar.b;
        yv4 yv4Var = fVar.a;
        vt10 vt10Var = this.a;
        if (i3 != 11) {
            if ((i3 & 7) == 2) {
                ((i) ryoVar).getClass();
                oyoVar.a(vt10Var, i3 >>> 3);
                return qVar.b(rVar, fVar);
            }
            if (yv4Var.e() || (i2 = fVar.b) == fVar.c) {
                return false;
            }
            return yv4Var.B(i2);
        }
        ByteString byteString = null;
        int i4 = 0;
        while (fVar.a() != Integer.MAX_VALUE) {
            int i5 = fVar.b;
            if (i5 == 16) {
                fVar.v(0);
                i4 = yv4Var.z();
                ((i) ryoVar).getClass();
                oyoVar.a(vt10Var, i4);
            } else if (i5 == 26) {
                byteString = fVar.e();
            } else {
                if (!((yv4Var.e() || (i = fVar.b) == fVar.c) ? false : yv4Var.B(i))) {
                    break;
                }
            }
        }
        if (fVar.b != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (byteString == null) {
            return true;
        }
        ((s) qVar).getClass();
        rVar.d((i4 << 3) | 2, byteString);
        return true;
    }
}
