package defpackage;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class i77 extends FilterOutputStream {
    public final /* synthetic */ int a = 0;
    public ByteOrder b;
    public final OutputStream c;

    public i77(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.c = new DataOutputStream(outputStream);
        this.b = byteOrder;
    }

    public void a(ByteOrder byteOrder) {
        this.b = byteOrder;
    }

    public void c(int i) {
        ((DataOutputStream) this.c).write(i);
    }

    public final void d(int i) {
        int i2 = this.a;
        OutputStream outputStream = this.c;
        switch (i2) {
            case 0:
                ByteOrder byteOrder = this.b;
                if (byteOrder != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((i >>> 24) & 255);
                        outputStream.write((i >>> 16) & 255);
                        outputStream.write((i >>> 8) & 255);
                        outputStream.write(i & 255);
                        break;
                    }
                } else {
                    outputStream.write(i & 255);
                    outputStream.write((i >>> 8) & 255);
                    outputStream.write((i >>> 16) & 255);
                    outputStream.write((i >>> 24) & 255);
                    break;
                }
                break;
            default:
                DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
                ByteOrder byteOrder2 = this.b;
                if (byteOrder2 != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                        dataOutputStream.write((i >>> 24) & 255);
                        dataOutputStream.write((i >>> 16) & 255);
                        dataOutputStream.write((i >>> 8) & 255);
                        dataOutputStream.write(i & 255);
                        break;
                    }
                } else {
                    dataOutputStream.write(i & 255);
                    dataOutputStream.write((i >>> 8) & 255);
                    dataOutputStream.write((i >>> 16) & 255);
                    dataOutputStream.write((i >>> 24) & 255);
                    break;
                }
                break;
        }
    }

    public final void e(short s) {
        int i = this.a;
        OutputStream outputStream = this.c;
        switch (i) {
            case 0:
                ByteOrder byteOrder = this.b;
                if (byteOrder != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((s >>> 8) & 255);
                        outputStream.write(s & 255);
                        break;
                    }
                } else {
                    outputStream.write(s & 255);
                    outputStream.write((s >>> 8) & 255);
                    break;
                }
                break;
            default:
                DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
                ByteOrder byteOrder2 = this.b;
                if (byteOrder2 != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                        dataOutputStream.write((s >>> 8) & 255);
                        dataOutputStream.write(s & 255);
                        break;
                    }
                } else {
                    dataOutputStream.write(s & 255);
                    dataOutputStream.write((s >>> 8) & 255);
                    break;
                }
                break;
        }
    }

    public void k(long j) {
        if (j <= _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
            d((int) j);
        } else {
            ny61.g("val is larger than the maximum value of a 32-bit unsigned integer");
        }
    }

    public void n(int i) {
        if (i <= 65535) {
            e((short) i);
        } else {
            ny61.g("val is larger than the maximum value of a 16-bit unsigned integer");
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                this.c.write(bArr);
                break;
            default:
                ((DataOutputStream) this.c).write(bArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i77(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.c = outputStream;
        this.b = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                this.c.write(bArr, i, i2);
                break;
            default:
                ((DataOutputStream) this.c).write(bArr, i, i2);
                break;
        }
    }
}
