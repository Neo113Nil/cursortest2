package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class os91 implements jp60 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final lxq g;
    public static final lxq h;
    public static final ns91 i;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final ip60 d;
    public final q691 e = new q691(this, 4);

    /* JADX WARN: Type inference failed for: r0v10, types: [ns91] */
    static {
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        g = new lxq("key", x4e.u(uw51.p(cs91.class, nr91Var.a())));
        nr91 nr91Var2 = new nr91();
        nr91Var2.a = 2;
        h = new lxq("value", x4e.u(uw51.p(cs91.class, nr91Var2.a())));
        i = new ip60() { // from class: ns91
            @Override // defpackage.uyn
            public final void a(Object obj, Object obj2) {
                Map.Entry entry = (Map.Entry) obj;
                jp60 jp60Var = (jp60) obj2;
                jp60Var.f(os91.g, entry.getKey());
                jp60Var.f(os91.h, entry.getValue());
            }
        };
    }

    public os91(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ip60 ip60Var) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = ip60Var;
    }

    public static int j(lxq lxqVar) {
        cs91 cs91Var = (cs91) lxqVar.b(cs91.class);
        if (cs91Var != null) {
            return cs91Var.zza();
        }
        ny61.x("Field has no @Protobuf config");
        return 0;
    }

    public final void a(lxq lxqVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((j(lxqVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // defpackage.jp60
    public final /* synthetic */ jp60 b(lxq lxqVar, boolean z) {
        h(lxqVar, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.jp60
    public final /* synthetic */ jp60 c(lxq lxqVar, int i2) {
        h(lxqVar, i2, true);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 d(lxq lxqVar, double d) {
        a(lxqVar, d, true);
        return this;
    }

    @Override // defpackage.jp60
    public final /* synthetic */ jp60 e(lxq lxqVar, long j) {
        i(lxqVar, j, true);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 f(lxq lxqVar, Object obj) {
        g(lxqVar, obj, true);
        return this;
    }

    public final void g(lxq lxqVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((j(lxqVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(lxqVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                k(i, lxqVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(lxqVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            l((j(lxqVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            i(lxqVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            h(lxqVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((j(lxqVar) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        ip60 ip60Var = (ip60) this.b.get(obj.getClass());
        if (ip60Var != null) {
            k(ip60Var, lxqVar, obj, z);
            return;
        }
        h131 h131Var = (h131) this.c.get(obj.getClass());
        if (h131Var != null) {
            q691 q691Var = this.e;
            q691Var.b = false;
            q691Var.d = lxqVar;
            q691Var.c = z;
            h131Var.a(obj, q691Var);
            return;
        }
        if (obj instanceof sr91) {
            h(lxqVar, ((sr91) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(lxqVar, ((Enum) obj).ordinal(), true);
        } else {
            k(this.d, lxqVar, obj, z);
        }
    }

    public final void h(lxq lxqVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        cs91 cs91Var = (cs91) lxqVar.b(cs91.class);
        if (cs91Var == null) {
            ny61.x("Field has no @Protobuf config");
            return;
        }
        int ordinal = cs91Var.zzb().ordinal();
        if (ordinal == 0) {
            l(cs91Var.zza() << 3);
            l(i2);
        } else if (ordinal == 1) {
            l(cs91Var.zza() << 3);
            l((i2 + i2) ^ (i2 >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((cs91Var.zza() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void i(lxq lxqVar, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        cs91 cs91Var = (cs91) lxqVar.b(cs91.class);
        if (cs91Var == null) {
            ny61.x("Field has no @Protobuf config");
            return;
        }
        int ordinal = cs91Var.zzb().ordinal();
        if (ordinal == 0) {
            l(cs91Var.zza() << 3);
            m(j);
        } else if (ordinal == 1) {
            l(cs91Var.zza() << 3);
            m((j >> 63) ^ (j + j));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((cs91Var.zza() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void k(ip60 ip60Var, lxq lxqVar, Object obj, boolean z) {
        c591 c591Var = new c591(4);
        c591Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = c591Var;
            try {
                ip60Var.a(obj, this);
                this.a = outputStream;
                long j = c591Var.b;
                c591Var.close();
                if (z && j == 0) {
                    return;
                }
                l((j(lxqVar) << 3) | 2);
                m(j);
                ip60Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c591Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i2) {
        while (true) {
            long j = i2 & (-128);
            int i3 = i2 & HProv.PP_VERSION_TIMESTAMP;
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i3);
                return;
            } else {
                outputStream.write(i3 | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            long j2 = (-128) & j;
            int i2 = ((int) j) & HProv.PP_VERSION_TIMESTAMP;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(i2);
                return;
            } else {
                outputStream.write(i2 | 128);
                j >>>= 7;
            }
        }
    }
}
