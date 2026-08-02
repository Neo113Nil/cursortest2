package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.tsp0;

/* compiled from: DefaultTsPayloadReaderFactory.java */
/* loaded from: classes12.dex */
public final class bql {
    public final int a;
    public final List<androidx.media3.common.a> b;

    public bql(int i, List<androidx.media3.common.a> list) {
        this.a = i;
        this.b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tsp0 a(int i, tsp0.b bVar) {
        String str = bVar.a;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new z1a0(new dg30(str, bVar.a(), "video/mp2t"));
            }
            if (i == 21) {
                return new z1a0(new csv());
            }
            if (i == 27) {
                if (c(4)) {
                    return null;
                }
                return new z1a0(new ksu(new e6i0(b(bVar)), c(1), c(8)));
            }
            if (i == 36) {
                return new z1a0(new msu(new e6i0(b(bVar))));
            }
            if (i == 45) {
                return new z1a0(new fg30());
            }
            if (i == 89) {
                return new z1a0(new qoo(bVar.c));
            }
            if (i == 172) {
                return new z1a0(new qi(str, bVar.a(), "video/mp2t"));
            }
            if (i == 257) {
                return new a2i0(new fm90("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new z1a0(new ino(str, bVar.a(), 5408));
                }
                switch (i) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new z1a0(new v21(bVar.a(), str, "video/mp2t", false));
                    case 16:
                        return new z1a0(new gsu(new hhq0(b(bVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new z1a0(new mmy(str, bVar.a()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new z1a0(new mi(str, bVar.a(), "video/mp2t"));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new a2i0(new fm90(MimeTypes.APPLICATION_SCTE35));
                                    case 135:
                                        break;
                                    case PRIVACY_URL_ERROR_VALUE:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new z1a0(new ino(str, bVar.a(), 4096));
        }
        return new z1a0(new fsu(new hhq0(b(bVar)), "video/mp2t"));
    }

    public final List<androidx.media3.common.a> b(tsp0.b bVar) {
        String str;
        int i;
        List<byte[]> list;
        boolean c = c(32);
        List<androidx.media3.common.a> list2 = this.b;
        if (c) {
            return list2;
        }
        xi90 xi90Var = new xi90(bVar.d);
        while (xi90Var.a() > 0) {
            int C = xi90Var.C();
            int C2 = xi90Var.b + xi90Var.C();
            if (C == 134) {
                ArrayList arrayList = new ArrayList();
                int C3 = xi90Var.C() & 31;
                for (int i2 = 0; i2 < C3; i2++) {
                    String A = xi90Var.A(3, StandardCharsets.UTF_8);
                    int C4 = xi90Var.C();
                    boolean z = (C4 & 128) != 0;
                    if (z) {
                        i = C4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte C5 = (byte) xi90Var.C();
                    xi90Var.Q(1);
                    if (z) {
                        boolean z2 = (C5 & 64) != 0;
                        byte[] bArr = tzf.a;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    a.C0043a c0043a = new a.C0043a();
                    c0043a.m = io20.q(str);
                    c0043a.d = A;
                    c0043a.J = i;
                    c0043a.p = list;
                    arrayList.add(new androidx.media3.common.a(c0043a));
                }
                list2 = arrayList;
            }
            xi90Var.P(C2);
        }
        return list2;
    }

    public final boolean c(int i) {
        return (i & this.a) != 0;
    }
}
