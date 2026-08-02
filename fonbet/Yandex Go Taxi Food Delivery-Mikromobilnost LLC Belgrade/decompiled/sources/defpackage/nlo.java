package defpackage;

import android.util.Log;
import androidx.exifinterface.media.a;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class nlo {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public nlo(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static nlo a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new nlo(1, 1, new byte[]{(byte) (str.charAt(0) - MoneyInputEditView.DEFAULT_VALUE)});
        }
        byte[] bytes = str.getBytes(a.b0);
        return new nlo(1, bytes.length, bytes);
    }

    public static nlo b(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(a.b0);
        return new nlo(2, bytes.length, bytes);
    }

    public static nlo c(long j, ByteOrder byteOrder) {
        return d(new long[]{j}, byteOrder);
    }

    public static nlo d(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[a.S[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new nlo(4, jArr.length, wrap.array());
    }

    public static nlo e(plo[] ploVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[a.S[5] * ploVarArr.length]);
        wrap.order(byteOrder);
        for (plo ploVar : ploVarArr) {
            wrap.putInt((int) ploVar.a);
            wrap.putInt((int) ploVar.b);
        }
        return new nlo(5, ploVarArr.length, wrap.array());
    }

    public static nlo f(int i, ByteOrder byteOrder) {
        return g(new int[]{i}, byteOrder);
    }

    public static nlo g(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[a.S[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new nlo(3, iArr.length, wrap.array());
    }

    public final double h(ByteOrder byteOrder) {
        Object k = k(byteOrder);
        if (k == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (k instanceof String) {
            return Double.parseDouble((String) k);
        }
        if (k instanceof long[]) {
            if (((long[]) k).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (k instanceof int[]) {
            if (((int[]) k).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (k instanceof double[]) {
            double[] dArr = (double[]) k;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(k instanceof plo[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        plo[] ploVarArr = (plo[]) k;
        if (ploVarArr.length == 1) {
            return ploVarArr[0].a();
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final int i(ByteOrder byteOrder) {
        Object k = k(byteOrder);
        if (k == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (k instanceof String) {
            return Integer.parseInt((String) k);
        }
        if (k instanceof long[]) {
            long[] jArr = (long[]) k;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(k instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) k;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String j(ByteOrder byteOrder) {
        Object k = k(byteOrder);
        if (k == null) {
            return null;
        }
        if (k instanceof String) {
            return (String) k;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (k instanceof long[]) {
            long[] jArr = (long[]) k;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (k instanceof int[]) {
            int[] iArr = (int[]) k;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (k instanceof double[]) {
            double[] dArr = (double[]) k;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(k instanceof plo[])) {
            return null;
        }
        plo[] ploVarArr = (plo[]) k;
        while (i < ploVarArr.length) {
            sb.append(ploVarArr[i].a);
            sb.append('/');
            sb.append(ploVarArr[i].b);
            i++;
            if (i != ploVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v11, types: [plo[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [double[]] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [double[]] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v7, types: [long[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [plo[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int[]] */
    public final Serializable k(ByteOrder byteOrder) {
        Throwable th;
        mlo mloVar;
        byte b;
        ?? str;
        byte[] bArr = this.d;
        mlo mloVar2 = null;
        try {
            mloVar = new mlo(bArr);
            try {
                mloVar.c = byteOrder;
                int i = this.a;
                int i2 = 0;
                int i3 = this.b;
                switch (i) {
                    case 1:
                    case 6:
                        if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                            str = new String(new char[]{(char) (b + 48)});
                            break;
                        } else {
                            String str2 = new String(bArr, a.b0);
                            try {
                                mloVar.close();
                                return str2;
                            } catch (IOException e) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                return str2;
                            }
                        }
                    case 2:
                    case 7:
                        if (i3 >= a.T.length) {
                            int i4 = 0;
                            while (true) {
                                byte[] bArr2 = a.T;
                                if (i4 >= bArr2.length) {
                                    i2 = bArr2.length;
                                } else if (bArr[i4] == bArr2[i4]) {
                                    i4++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (i2 < i3) {
                            byte b2 = bArr[i2];
                            if (b2 == 0) {
                                str = sb.toString();
                                break;
                            } else {
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i2++;
                            }
                        }
                        str = sb.toString();
                    case 3:
                        str = new int[i3];
                        while (i2 < i3) {
                            str[i2] = mloVar.readUnsignedShort();
                            i2++;
                        }
                    case 4:
                        str = new long[i3];
                        while (i2 < i3) {
                            str[i2] = mloVar.readInt() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                            i2++;
                        }
                    case 5:
                        str = new plo[i3];
                        while (i2 < i3) {
                            str[i2] = new plo(0, mloVar.readInt() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD, mloVar.readInt() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            i2++;
                        }
                    case 8:
                        str = new int[i3];
                        while (i2 < i3) {
                            str[i2] = mloVar.readShort();
                            i2++;
                        }
                    case 9:
                        str = new int[i3];
                        while (i2 < i3) {
                            str[i2] = mloVar.readInt();
                            i2++;
                        }
                    case 10:
                        str = new plo[i3];
                        while (i2 < i3) {
                            str[i2] = new plo(0, mloVar.readInt(), mloVar.readInt());
                            i2++;
                        }
                    case 11:
                        str = new double[i3];
                        while (i2 < i3) {
                            str[i2] = mloVar.readFloat();
                            i2++;
                        }
                    case 12:
                        str = new double[i3];
                        while (i2 < i3) {
                            str[i2] = mloVar.readDouble();
                            i2++;
                        }
                    default:
                        try {
                            mloVar.close();
                            return null;
                        } catch (IOException e2) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                            return null;
                        }
                }
                try {
                    mloVar.close();
                    return str;
                } catch (IOException e3) {
                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                    return str;
                }
            } catch (IOException unused) {
                if (mloVar != null) {
                    try {
                        mloVar.close();
                    } catch (IOException e4) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                mloVar2 = mloVar;
                if (mloVar2 == null) {
                    throw th;
                }
                try {
                    mloVar2.close();
                    throw th;
                } catch (IOException e5) {
                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            mloVar = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Extension.O_BRAKE);
        sb.append(a.R[this.a]);
        sb.append(", data length:");
        return oyr.m(this.d.length, Extension.C_BRAKE, sb);
    }

    public nlo(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }
}
