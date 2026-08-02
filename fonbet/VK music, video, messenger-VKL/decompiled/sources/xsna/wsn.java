package xsna;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import okio.ByteString;

/* compiled from: DnsRecordCodec.kt */
/* loaded from: classes8.dex */
public final class wsn {
    public static final /* synthetic */ int a = 0;

    static {
        Charset charset = StandardCharsets.US_ASCII;
    }

    public static ArrayList a(String str, ByteString byteString) throws Exception {
        ArrayList arrayList = new ArrayList();
        vl8 vl8Var = new vl8();
        vl8Var.H(byteString);
        vl8Var.readShort();
        short readShort = vl8Var.readShort();
        if (((readShort & 65535) >> 15) == 0) {
            throw new IllegalArgumentException("not a response");
        }
        int i = readShort & 15;
        if (i == 2) {
            throw new UnknownHostException(str.concat(": SERVFAIL"));
        }
        if (i == 3) {
            throw new UnknownHostException(str.concat(": NXDOMAIN"));
        }
        int readShort2 = vl8Var.readShort() & 65535;
        int readShort3 = vl8Var.readShort() & 65535;
        vl8Var.readShort();
        vl8Var.readShort();
        for (int i2 = 0; i2 < readShort2; i2++) {
            byte readByte = vl8Var.readByte();
            if (readByte < 0) {
                vl8Var.skip(1L);
            } else {
                while (readByte > 0) {
                    vl8Var.skip(readByte);
                    readByte = vl8Var.readByte();
                }
            }
            vl8Var.readShort();
            vl8Var.readShort();
        }
        for (int i3 = 0; i3 < readShort3; i3++) {
            byte readByte2 = vl8Var.readByte();
            if (readByte2 < 0) {
                vl8Var.skip(1L);
            } else {
                while (readByte2 > 0) {
                    vl8Var.skip(readByte2);
                    readByte2 = vl8Var.readByte();
                }
            }
            int readShort4 = vl8Var.readShort() & 65535;
            vl8Var.readShort();
            vl8Var.readInt();
            int readShort5 = vl8Var.readShort() & 65535;
            if (readShort4 == 1 || readShort4 == 28) {
                byte[] bArr = new byte[readShort5];
                vl8Var.read(bArr, 0, readShort5);
                arrayList.add(InetAddress.getByAddress(bArr));
            } else {
                vl8Var.skip(readShort5);
            }
        }
        return arrayList;
    }
}
