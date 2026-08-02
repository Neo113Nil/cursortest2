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

/* loaded from: classes.dex */
public final class kvf0 implements jp60 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final lxq g;
    public static final lxq h;
    public static final jcx i;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final ip60 d;
    public final mvf0 e = new mvf0(this);

    static {
        nb3 nb3Var = new nb3();
        nb3Var.a = 1;
        g = new lxq("key", x4e.u(x4e.o(dvf0.class, nb3Var.a())));
        nb3 nb3Var2 = new nb3();
        nb3Var2.a = 2;
        h = new lxq("value", x4e.u(x4e.o(dvf0.class, nb3Var2.a())));
        i = new jcx(1);
    }

    public kvf0(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ip60 ip60Var) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = ip60Var;
    }

    public static int k(lxq lxqVar) {
        dvf0 dvf0Var = (dvf0) lxqVar.b(dvf0.class);
        if (dvf0Var != null) {
            return dvf0Var.tag();
        }
        ny61.x("Field has no @Protobuf config");
        return 0;
    }

    public final void a(lxq lxqVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((k(lxqVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // defpackage.jp60
    public final jp60 b(lxq lxqVar, boolean z) {
        g(lxqVar, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 c(lxq lxqVar, int i2) {
        g(lxqVar, i2, true);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 d(lxq lxqVar, double d) {
        a(lxqVar, d, true);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 e(lxq lxqVar, long j) {
        h(lxqVar, j, true);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 f(lxq lxqVar, Object obj) {
        i(lxqVar, obj, true);
        return this;
    }

    public final void g(lxq lxqVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        dvf0 dvf0Var = (dvf0) lxqVar.b(dvf0.class);
        if (dvf0Var == null) {
            ny61.x("Field has no @Protobuf config");
            return;
        }
        int i3 = jvf0.a[dvf0Var.intEncoding().ordinal()];
        if (i3 == 1) {
            l(dvf0Var.tag() << 3);
            l(i2);
        } else if (i3 == 2) {
            l(dvf0Var.tag() << 3);
            l((i2 << 1) ^ (i2 >> 31));
        } else {
            if (i3 != 3) {
                return;
            }
            l((dvf0Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void h(lxq lxqVar, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        dvf0 dvf0Var = (dvf0) lxqVar.b(dvf0.class);
        if (dvf0Var == null) {
            ny61.x("Field has no @Protobuf config");
            return;
        }
        int i2 = jvf0.a[dvf0Var.intEncoding().ordinal()];
        if (i2 == 1) {
            l(dvf0Var.tag() << 3);
            m(j);
        } else if (i2 == 2) {
            l(dvf0Var.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (i2 != 3) {
                return;
            }
            l((dvf0Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(lxq lxqVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((k(lxqVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(lxqVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(i, lxqVar, (Map.Entry) it2.next(), false);
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
            l((k(lxqVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(lxqVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            g(lxqVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((k(lxqVar) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        ip60 ip60Var = (ip60) this.b.get(obj.getClass());
        if (ip60Var != null) {
            j(ip60Var, lxqVar, obj, z);
            return;
        }
        h131 h131Var = (h131) this.c.get(obj.getClass());
        if (h131Var != null) {
            mvf0 mvf0Var = this.e;
            mvf0Var.a = false;
            mvf0Var.c = lxqVar;
            mvf0Var.b = z;
            h131Var.a(obj, mvf0Var);
            return;
        }
        if (obj instanceof wuf0) {
            g(lxqVar, ((wuf0) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            g(lxqVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, lxqVar, obj, z);
        }
    }

    public final void j(ip60 ip60Var, lxq lxqVar, Object obj, boolean z) {
        lby lbyVar = new lby();
        lbyVar.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = lbyVar;
            try {
                ip60Var.a(obj, this);
                this.a = outputStream;
                long j = lbyVar.a;
                lbyVar.close();
                if (z && j == 0) {
                    return;
                }
                l((k(lxqVar) << 3) | 2);
                m(j);
                ip60Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                lbyVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i2) {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & HProv.PP_VERSION_TIMESTAMP);
                return;
            } else {
                outputStream.write((i2 & HProv.PP_VERSION_TIMESTAMP) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & HProv.PP_VERSION_TIMESTAMP);
                return;
            } else {
                outputStream.write((((int) j) & HProv.PP_VERSION_TIMESTAMP) | 128);
                j >>>= 7;
            }
        }
    }
}
