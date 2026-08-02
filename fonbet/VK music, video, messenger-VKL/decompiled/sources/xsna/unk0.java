package xsna;

import okio.ByteString;
import xsna.nnk0;
import xsna.zt80;

/* compiled from: SseReader.kt */
/* loaded from: classes3.dex */
public final class unk0 {
    public static final zt80 c = zt80.a.b(ByteString.a.b("\r\n"), ByteString.a.b("\r"), ByteString.a.b("\n"), ByteString.a.b("data: "), ByteString.a.b("data:"), ByteString.a.b("data\r\n"), ByteString.a.b("data\r"), ByteString.a.b("data\n"), ByteString.a.b("id: "), ByteString.a.b("id:"), ByteString.a.b("id\r\n"), ByteString.a.b("id\r"), ByteString.a.b("id\n"), ByteString.a.b("event: "), ByteString.a.b("event:"), ByteString.a.b("event\r\n"), ByteString.a.b("event\r"), ByteString.a.b("event\n"), ByteString.a.b("retry: "), ByteString.a.b("retry:"));
    public static final ByteString d = ByteString.a.b("\r\n");
    public final bn8 a;
    public String b;

    public unk0(bn8 bn8Var) {
        this.a = bn8Var;
    }

    public final nnk0 a(vl8 vl8Var) {
        long j;
        String str = this.b;
        while (true) {
            String str2 = null;
            while (true) {
                bn8 bn8Var = this.a;
                zt80 zt80Var = c;
                int F3 = bn8Var.F3(zt80Var);
                if (F3 < 0 || F3 >= 3) {
                    ByteString byteString = d;
                    if (3 <= F3 && F3 < 5) {
                        vl8Var.I(10);
                        bn8Var.z1(vl8Var, bn8Var.d(byteString));
                        bn8Var.F3(zt80Var);
                    } else if (5 <= F3 && F3 < 8) {
                        vl8Var.I(10);
                    } else if (8 <= F3 && F3 < 10) {
                        str = bn8Var.D1();
                        if (str.length() <= 0) {
                            str = null;
                        }
                    } else if (10 <= F3 && F3 < 13) {
                        str = null;
                    } else if (13 <= F3 && F3 < 15) {
                        str2 = bn8Var.D1();
                        if (str2.length() > 0) {
                        }
                    } else if (15 > F3 || F3 >= 18) {
                        if (18 <= F3 && F3 < 20) {
                            String D1 = bn8Var.D1();
                            byte[] bArr = x2r0.a;
                            try {
                                j = Long.parseLong(D1);
                            } catch (NumberFormatException unused) {
                                j = -1;
                            }
                            if (j != -1) {
                                return new nnk0.d(j);
                            }
                        } else {
                            if (F3 != -1) {
                                throw new AssertionError();
                            }
                            long d2 = bn8Var.d(byteString);
                            if (d2 == -1) {
                                return null;
                            }
                            bn8Var.skip(d2);
                            bn8Var.F3(zt80Var);
                        }
                    }
                } else if (vl8Var.c != 0) {
                    this.b = str;
                    vl8Var.skip(1L);
                    return new nnk0.b(str, str2, vl8Var.x());
                }
            }
        }
    }
}
