package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class ilb1 {
    public static au2 a;

    public static final au2 a() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("ChevronDownM", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(zp2.d);
        a6t0 a6t0Var2 = new a6t0(iq2.g);
        uq90 g = tse0.g(16.5f, 10.0f, 12.0f, 14.5f);
        g.h(7.5f, 10.0f);
        lgvVar.b(1.0f, 1.0f, 1.75f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 2, 0, a6t0Var, a6t0Var2, "", g.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final boolean b(kk2 kk2Var) {
        int length = kk2Var.b.length();
        List list = kk2Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ik2 ik2Var = (ik2) list.get(i);
                if ((ik2Var.c() instanceof kky) && mk2.d(0, length, ik2Var.d(), ik2Var.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static h920 c(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            ny61.v("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    h920 h920Var = new h920();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    h920Var.b = duplicate;
                    h920Var.a = position;
                    int i6 = position - duplicate.getInt(position);
                    h920Var.c = i6;
                    h920Var.d = h920Var.b.getShort(i6);
                    return h920Var;
                }
            }
        }
        ny61.v("Cannot read metadata.");
        return null;
    }
}
