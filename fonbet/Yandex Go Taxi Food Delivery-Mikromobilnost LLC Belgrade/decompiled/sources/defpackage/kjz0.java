package defpackage;

import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums.TagTypeEnum;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums.TagValueTypeEnum;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.exceptions.TlvException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final class kjz0 {
    public static p6x0 a(ByteArrayInputStream byteArrayInputStream) {
        byte[] bArr;
        if (byteArrayInputStream.available() < 2) {
            throw new TlvException(oyr.i(byteArrayInputStream.available(), "Error parsing data. Available bytes < 2 . Length="));
        }
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
            throw new TlvException(oyr.i(byteArrayInputStream.available(), "Error parsing data. Available bytes < 2 . Length="));
        }
        byte[] d = d(byteArrayInputStream);
        byteArrayInputStream.mark(0);
        int available = byteArrayInputStream.available();
        int e = e(byteArrayInputStream);
        int available2 = byteArrayInputStream.available();
        byteArrayInputStream.reset();
        int i = available - available2;
        byte[] bArr2 = new byte[i];
        int i2 = 1;
        if (i < 1 || i > 4) {
            throw new TlvException(oyr.i(i, "Number of length bytes must be from 1 to 4. Found "));
        }
        byteArrayInputStream.read(bArr2, 0, i);
        int b2 = cdb1.b(bArr2);
        la60 f = f(d);
        if (b2 == 128) {
            byteArrayInputStream.mark(0);
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int read2 = byteArrayInputStream.read();
                if (read2 < 0) {
                    throw new TlvException(oyr.i(byteArrayInputStream.available(), "Error parsing data. TagAndLengthValue length byte indicated indefinite length, but EOS was reached before 0x0000 was found"));
                }
                if (i2 == 0 && read2 == 0) {
                    e = i3 - 1;
                    bArr = new byte[e];
                    byteArrayInputStream.reset();
                    byteArrayInputStream.read(bArr, 0, e);
                    break;
                }
                i3 = i4;
                i2 = read2;
            }
        } else {
            if (byteArrayInputStream.available() < e) {
                throw new TlvException(oyr.t(b64.s(e, byteArrayInputStream.available(), "Length byte(s) indicated ", " value bytes, but only ", " "), byteArrayInputStream.available() > 1 ? "are" : "is", " available"));
            }
            bArr = new byte[e];
            byteArrayInputStream.read(bArr, 0, e);
        }
        byteArrayInputStream.mark(0);
        int read3 = byteArrayInputStream.read();
        while (true) {
            byte b3 = (byte) read3;
            if (read3 == -1 || !(b3 == -1 || b3 == 0)) {
                break;
            }
            byteArrayInputStream.mark(0);
            read3 = byteArrayInputStream.read();
        }
        byteArrayInputStream.reset();
        return new p6x0(f, e, bArr2, bArr);
    }

    public static byte[] b(byte[] bArr, la60... la60VarArr) {
        int i;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] bArr2 = null;
        while (byteArrayInputStream.available() > 0) {
            p6x0 a = a(byteArrayInputStream);
            byte[] bArr3 = a.d;
            la60 la60Var = a.a;
            if (la60[].class.getComponentType().isInstance(la60Var)) {
                i = 0;
                while (i < la60VarArr.length) {
                    if (la60Var.equals(la60VarArr[i])) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            if (i == -1) {
                if (la60Var.e == TagTypeEnum.CONSTRUCTED && (bArr2 = b(bArr3, (la60[]) Arrays.copyOf(la60VarArr, la60VarArr.length))) != null) {
                    break;
                }
            } else {
                return bArr3;
            }
        }
        return bArr2;
    }

    public static ArrayList c(byte[] bArr, la60... la60VarArr) {
        int i;
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() > 0) {
            p6x0 a = a(byteArrayInputStream);
            la60 la60Var = a.a;
            if (la60[].class.getComponentType().isInstance(la60Var)) {
                i = 0;
                while (i < la60VarArr.length) {
                    if (la60Var.equals(la60VarArr[i])) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            if (i != -1) {
                arrayList.add(a);
            } else if (la60Var.e == TagTypeEnum.CONSTRUCTED) {
                arrayList.addAll(c(a.d, (la60[]) Arrays.copyOf(la60VarArr, la60VarArr.length)));
            }
        }
        return arrayList;
    }

    public static byte[] d(ByteArrayInputStream byteArrayInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte read = (byte) byteArrayInputStream.read();
        byteArrayOutputStream.write(read);
        if ((read & 31) == 31) {
            while (true) {
                int read2 = byteArrayInputStream.read();
                if (read2 >= 0) {
                    byte b = (byte) read2;
                    byteArrayOutputStream.write(b);
                    if (!cdb1.f(b) || (cdb1.f(b) && (b & Byte.MAX_VALUE) == 0)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int e(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read();
        if (read < 0) {
            throw new TlvException(oyr.i(read, "Negative length: "));
        }
        if (read <= 127 || read == 128) {
            return read;
        }
        int i = read & HProv.PP_VERSION_TIMESTAMP;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int read2 = byteArrayInputStream.read();
            if (read2 < 0) {
                throw new TlvException("EOS when reading length bytes");
            }
            i2 = (i2 << 8) | read2;
        }
        return i2;
    }

    public static la60 f(byte[] bArr) {
        la60 la60Var = (la60) sxn.a.get(new q67(bArr));
        return la60Var == null ? new la60(bArr, TagValueTypeEnum.BINARY, "[UNKNOWN TAG]") : la60Var;
    }
}
