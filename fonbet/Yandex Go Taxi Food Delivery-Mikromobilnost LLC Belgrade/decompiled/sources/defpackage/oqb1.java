package defpackage;

import com.yandex.go.payments.cards.nfc.enums.TagTypeEnum;
import com.yandex.go.payments.cards.nfc.enums.TagValueTypeEnum;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class oqb1 {
    public static final x82 a(String str) {
        return new x82(Collections.singleton(str));
    }

    public static ArrayList c(byte[] bArr, s6x0... s6x0VarArr) {
        ArrayList arrayList = new ArrayList();
        List d0 = j73.d0(s6x0VarArr);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() > 0) {
            l4x0 d = d(byteArrayInputStream);
            s6x0 s6x0Var = d.a;
            if (d0.contains(s6x0Var)) {
                arrayList.add(d);
            } else if (s6x0Var.e == TagTypeEnum.CONSTRUCTED) {
                arrayList.addAll(c(d.b, (s6x0[]) Arrays.copyOf(s6x0VarArr, s6x0VarArr.length)));
            }
        }
        return arrayList;
    }

    public static l4x0 d(ByteArrayInputStream byteArrayInputStream) {
        byte[] bArr;
        byteArrayInputStream.mark(0);
        int read = byteArrayInputStream.read();
        while (true) {
            byte b = (byte) read;
            if (read == -1 || !(b == -1 || b == 0)) {
                break;
            }
            byteArrayInputStream.mark(0);
            read = byteArrayInputStream.read();
        }
        byteArrayInputStream.reset();
        if (byteArrayInputStream.available() < 2) {
            ny61.g(oyr.i(byteArrayInputStream.available(), "Error parsing data. Available bytes < 2 . Length="));
            return null;
        }
        byte[] f = f(byteArrayInputStream);
        byteArrayInputStream.mark(0);
        int available = byteArrayInputStream.available();
        int g = g(byteArrayInputStream);
        int available2 = byteArrayInputStream.available();
        byteArrayInputStream.reset();
        int i = available - available2;
        byte[] bArr2 = new byte[i];
        int i2 = 1;
        if (i < 1 || i > 4) {
            ny61.g(oyr.i(i, "Number of length bytes must be from 1 to 4. Found "));
            return null;
        }
        byteArrayInputStream.read(bArr2, 0, i);
        int a = ddb1.a(bArr2);
        s6x0 h = h(f);
        if (a == 128) {
            byteArrayInputStream.mark(0);
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int read2 = byteArrayInputStream.read();
                if (read2 < 0) {
                    ny61.g(oyr.i(byteArrayInputStream.available(), "Error parsing data. TLV length byte indicated indefinite length, but EOS was reached before 0x0000 was found"));
                    return null;
                }
                if (i2 == 0 && read2 == 0) {
                    g = i3 - 1;
                    bArr = new byte[g];
                    byteArrayInputStream.reset();
                    byteArrayInputStream.read(bArr, 0, g);
                    break;
                }
                i3 = i4;
                i2 = read2;
            }
        } else {
            if (byteArrayInputStream.available() < g) {
                throw new IllegalArgumentException(oyr.t(b64.s(g, byteArrayInputStream.available(), "Length byte(s) indicated ", " value bytes, but only ", " "), byteArrayInputStream.available() > 1 ? "are" : "is", " available"));
            }
            bArr = new byte[g];
            byteArrayInputStream.read(bArr, 0, g);
        }
        byteArrayInputStream.mark(0);
        int read3 = byteArrayInputStream.read();
        while (true) {
            byte b2 = (byte) read3;
            if (read3 == -1 || !(b2 == -1 || b2 == 0)) {
                break;
            }
            byteArrayInputStream.mark(0);
            read3 = byteArrayInputStream.read();
        }
        byteArrayInputStream.reset();
        return new l4x0(h, g, bArr);
    }

    public static byte[] e(byte[] bArr, s6x0... s6x0VarArr) {
        byte[] bArr2 = null;
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            List d0 = j73.d0(s6x0VarArr);
            while (byteArrayInputStream.available() > 0) {
                try {
                    l4x0 d = d(byteArrayInputStream);
                    byte[] bArr3 = d.b;
                    s6x0 s6x0Var = d.a;
                    if (d0.contains(s6x0Var)) {
                        return bArr3;
                    }
                    if ((s6x0Var.e == TagTypeEnum.CONSTRUCTED) && (bArr2 = e(bArr3, (s6x0[]) Arrays.copyOf(s6x0VarArr, s6x0VarArr.length))) != null) {
                        return bArr2;
                    }
                } catch (IllegalArgumentException e) {
                    jst.e.j(e);
                }
            }
        }
        return bArr2;
    }

    public static byte[] f(ByteArrayInputStream byteArrayInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte read = (byte) byteArrayInputStream.read();
        byteArrayOutputStream.write(read);
        if (((byte) (read & 31)) == 31) {
            while (true) {
                int read2 = byteArrayInputStream.read();
                if (read2 >= 0) {
                    byte b = (byte) read2;
                    byteArrayOutputStream.write(b);
                    if (!ddb1.c(b, 7) || (ddb1.c(b, 7) && (b & Byte.MAX_VALUE) == 0)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int g(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read();
        if (read < 0) {
            ny61.g(oyr.i(read, "Negative length: "));
            return 0;
        }
        if (read <= 127 || read == 128) {
            return read;
        }
        int i = read & HProv.PP_VERSION_TIMESTAMP;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int read2 = byteArrayInputStream.read();
            if (read2 < 0) {
                ny61.g("EOS when reading length bytes");
                return 0;
            }
            i2 = (i2 << 8) | read2;
        }
        return i2;
    }

    public static s6x0 h(byte[] bArr) {
        HashMap hashMap = txn.a;
        s6x0 s6x0Var = bArr == null ? null : (s6x0) txn.a.get(new r67(bArr));
        return s6x0Var == null ? new s6x0(bArr, TagValueTypeEnum.BINARY, "[UNKNOWN TAG]") : s6x0Var;
    }

    public abstract Map b();
}
