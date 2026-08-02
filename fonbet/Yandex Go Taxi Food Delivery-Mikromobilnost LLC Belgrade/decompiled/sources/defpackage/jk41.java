package defpackage;

import java.io.Closeable;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import okio.ByteString;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes4.dex */
public final class jk41 implements Closeable {
    public boolean A;
    public boolean B;
    public boolean C;
    public ot10 F;
    public final qq6 a;
    public final ik41 b;
    public final boolean c;
    public final boolean w;
    public boolean x;
    public int y;
    public long z;
    public final yp6 D = new yp6();
    public final yp6 E = new yp6();
    public final byte[] G = null;

    public jk41(qq6 qq6Var, ik41 ik41Var, boolean z, boolean z2) {
        this.a = qq6Var;
        this.b = ik41Var;
        this.c = z;
        this.w = z2;
    }

    public final void a() {
        d();
        if (this.B) {
            c();
            return;
        }
        int i = this.y;
        if (i != 1 && i != 2) {
            TimeZone timeZone = bg61.a;
            throw new ProtocolException("Unknown opcode: ".concat(Integer.toHexString(i)));
        }
        while (!this.x) {
            long j = this.z;
            yp6 yp6Var = this.E;
            if (j > 0) {
                this.a.C1(yp6Var, j);
            }
            if (this.A) {
                if (this.C) {
                    ot10 ot10Var = this.F;
                    if (ot10Var == null) {
                        ot10Var = new ot10(this.w);
                        this.F = ot10Var;
                    }
                    yp6 yp6Var2 = ot10Var.b;
                    if (yp6Var2.b != 0) {
                        ny61.g("Failed requirement.");
                        return;
                    }
                    Inflater inflater = ot10Var.c;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        ot10Var.c = inflater;
                    }
                    usv usvVar = ot10Var.w;
                    if (usvVar == null) {
                        usvVar = new usv(yp6Var2, inflater);
                        ot10Var.w = usvVar;
                    }
                    if (ot10Var.a) {
                        inflater.reset();
                    }
                    yp6Var2.N1(yp6Var);
                    yp6Var2.n0(65535);
                    long bytesRead = inflater.getBytesRead() + yp6Var2.b;
                    do {
                        usvVar.a(yp6Var, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        yp6Var2.clear();
                        usvVar.close();
                        ot10Var.w = null;
                        ot10Var.c = null;
                    }
                }
                ik41 ik41Var = this.b;
                if (i != 1) {
                    ((ydi0) ik41Var).b.f(yp6Var.l0(yp6Var.b));
                    return;
                } else {
                    ydi0 ydi0Var = (ydi0) ik41Var;
                    ydi0Var.b.e(ydi0Var, yp6Var.I0());
                    return;
                }
            }
            while (!this.x) {
                d();
                if (!this.B) {
                    break;
                } else {
                    c();
                }
            }
            if (this.y != 0) {
                int i2 = this.y;
                TimeZone timeZone2 = bg61.a;
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(Integer.toHexString(i2)));
            }
        }
        ny61.v("closed");
    }

    public final void c() {
        String str;
        short s;
        long j = this.z;
        if (j > 0) {
            this.a.C1(this.D, j);
        }
        switch (this.y) {
            case 8:
                yp6 yp6Var = this.D;
                long j2 = yp6Var.b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = yp6Var.readShort();
                    str = this.D.I0();
                    String i = (s < 1000 || s >= 5000) ? oyr.i(s, "Code must be in range [1000,5000): ") : ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : oyr.j(s, "Code ", " is reserved and may not be used.");
                    if (i != null) {
                        throw new ProtocolException(i);
                    }
                } else {
                    str = "";
                    s = 1005;
                }
                ydi0 ydi0Var = (ydi0) this.b;
                if (s == -1) {
                    ny61.g("Failed requirement.");
                    return;
                }
                synchronized (ydi0Var) {
                    if (ydi0Var.t != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    ydi0Var.t = s;
                    ydi0Var.u = str;
                }
                ydi0Var.b.c(ydi0Var, s, str);
                this.x = true;
                return;
            case 9:
                ik41 ik41Var = this.b;
                yp6 yp6Var2 = this.D;
                ByteString l0 = yp6Var2.l0(yp6Var2.b);
                ydi0 ydi0Var2 = (ydi0) ik41Var;
                synchronized (ydi0Var2) {
                    try {
                        if (!ydi0Var2.v && (!ydi0Var2.s || !ydi0Var2.q.isEmpty())) {
                            ydi0Var2.p.add(l0);
                            ydi0Var2.g();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                ik41 ik41Var2 = this.b;
                yp6 yp6Var3 = this.D;
                yp6Var3.l0(yp6Var3.b);
                ydi0 ydi0Var3 = (ydi0) ik41Var2;
                synchronized (ydi0Var3) {
                    ydi0Var3.x = false;
                }
                return;
            default:
                int i2 = this.y;
                TimeZone timeZone = bg61.a;
                throw new ProtocolException("Unknown control opcode: ".concat(Integer.toHexString(i2)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ot10 ot10Var = this.F;
        if (ot10Var != null) {
            yf61.b(ot10Var);
        }
        yf61.b(this.a);
    }

    public final void d() {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.x) {
            ny61.v("closed");
            return;
        }
        qq6 qq6Var = this.a;
        long h = qq6Var.timeout().h();
        qq6Var.timeout().b();
        try {
            byte readByte = qq6Var.readByte();
            byte[] bArr = yf61.a;
            qq6Var.timeout().g(h, timeUnit);
            int i = readByte & PKIBody._CCP;
            this.y = i;
            boolean z2 = (readByte & DerValue.TAG_CONTEXT) != 0;
            this.A = z2;
            boolean z3 = (readByte & 8) != 0;
            this.B = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (readByte & DerValue.TAG_APPLICATION) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.C = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((readByte & BlobHeaderStructure.BLOB_VERSION) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((readByte & PKIBody._CKUANN) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte readByte2 = qq6Var.readByte();
            boolean z5 = (readByte2 & DerValue.TAG_CONTEXT) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = readByte2 & Byte.MAX_VALUE;
            this.z = j;
            if (j == 126) {
                this.z = qq6Var.readShort() & 65535;
            } else if (j == 127) {
                long readLong = qq6Var.readLong();
                this.z = readLong;
                if (readLong < 0) {
                    long j2 = this.z;
                    TimeZone timeZone = bg61.a;
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(j2) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.B && this.z > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                qq6Var.readFully(this.G);
            }
        } catch (Throwable th) {
            qq6Var.timeout().g(h, timeUnit);
            throw th;
        }
    }
}
