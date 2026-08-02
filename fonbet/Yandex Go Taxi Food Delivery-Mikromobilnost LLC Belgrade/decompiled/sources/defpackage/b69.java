package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.ybsdk.widgets.common.BlendingGradientView;
import com.ybsdk.widgets.common.CodeInputView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class b69 extends e69 {
    public final ef90 h = new ef90();
    public final df90 i = new df90();
    public int j = -1;
    public final int k;
    public final z59[] l;
    public z59 m;
    public List n;
    public List o;
    public a69 p;
    public int q;

    public b69(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = bac.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new z59[8];
        int i2 = 0;
        while (true) {
            z59[] z59VarArr = this.l;
            if (i2 >= 8) {
                this.m = z59VarArr[0];
                return;
            } else {
                z59VarArr[i2] = new z59();
                i2++;
            }
        }
    }

    @Override // defpackage.e69
    public final f69 b() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new f69(list, false);
    }

    @Override // defpackage.e69
    public final void c(c69 c69Var) {
        ByteBuffer byteBuffer = c69Var.w;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ef90 ef90Var = this.h;
        ef90Var.I(limit, array);
        while (ef90Var.a() >= 3) {
            int y = ef90Var.y();
            int i = y & 3;
            boolean z = (y & 4) == 4;
            byte y2 = (byte) ef90Var.y();
            byte y3 = (byte) ef90Var.y();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (y2 & DerValue.TAG_PRIVATE) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            lk91.j("Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = y2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        a69 a69Var = new a69(i2, i4, 0);
                        this.p = a69Var;
                        byte[] bArr = a69Var.b;
                        a69Var.e = 1;
                        bArr[0] = y3;
                    } else {
                        d6z.l(i == 2);
                        a69 a69Var2 = this.p;
                        if (a69Var2 == null) {
                            lk91.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = a69Var2.b;
                            int i5 = a69Var2.e;
                            int i6 = i5 + 1;
                            a69Var2.e = i6;
                            bArr2[i5] = y2;
                            a69Var2.e = i5 + 2;
                            bArr2[i6] = y3;
                        }
                    }
                    a69 a69Var3 = this.p;
                    if (a69Var3.e == (a69Var3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // defpackage.e69, defpackage.jyg
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // defpackage.e69
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        int i;
        boolean z;
        int i2;
        int i3;
        char c;
        a69 a69Var = this.p;
        if (a69Var == null) {
            return;
        }
        int i4 = 2;
        boolean z2 = true;
        if (a69Var.e != (a69Var.d * 2) - 1) {
            lk91.d("DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        a69 a69Var2 = this.p;
        byte[] bArr = a69Var2.b;
        int i5 = a69Var2.e;
        df90 df90Var = this.i;
        df90Var.k(i5, bArr);
        boolean z3 = false;
        while (true) {
            if (df90Var.b() > 0) {
                int i6 = 3;
                int g = df90Var.g(3);
                int g2 = df90Var.g(5);
                int i7 = 7;
                if (g == 7) {
                    df90Var.o(i4);
                    g = df90Var.g(6);
                    if (g < 7) {
                        xvz.v(g, "Invalid extended service number: ");
                    }
                }
                if (g2 == 0) {
                    if (g != 0) {
                        lk91.j("serviceNumber is non-zero (" + g + ") when blockSize is 0");
                    }
                } else if (g != this.k) {
                    df90Var.p(g2);
                } else {
                    int e = (g2 * 8) + df90Var.e();
                    while (df90Var.e() < e) {
                        int g3 = df90Var.g(8);
                        if (g3 != 16) {
                            if (g3 <= 31) {
                                if (g3 != 0) {
                                    if (g3 == i6) {
                                        this.n = k();
                                    } else if (g3 != 8) {
                                        switch (g3) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (g3 < 17 || g3 > 23) {
                                                    if (g3 < 24 || g3 > 31) {
                                                        xvz.v(g3, "Invalid C0 command: ");
                                                        break;
                                                    } else {
                                                        lk91.j("Currently unsupported COMMAND_P16 Command: " + g3);
                                                        df90Var.o(16);
                                                        break;
                                                    }
                                                } else {
                                                    lk91.j("Currently unsupported COMMAND_EXT1 Command: " + g3);
                                                    df90Var.o(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i7;
                            } else if (g3 <= 127) {
                                z59 z59Var = this.m;
                                if (g3 == 127) {
                                    z59Var.a((char) 9835);
                                } else {
                                    z59Var.a((char) (g3 & 255));
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i7;
                                z3 = true;
                            } else {
                                if (g3 <= 159) {
                                    z59[] z59VarArr = this.l;
                                    switch (g3) {
                                        case 128:
                                        case HProv.PP_SECURITY_LEVEL /* 129 */:
                                        case 130:
                                        case HProv.PP_FAST_CODE /* 131 */:
                                        case HProv.PP_CONTAINER_EXTENSION /* 132 */:
                                        case HProv.PP_ENUM_CONTAINER_EXTENSION /* 133 */:
                                        case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
                                        case HProv.PP_CONTAINER_DEFAULT /* 135 */:
                                            i = i6;
                                            z = true;
                                            int i8 = g3 - 128;
                                            if (this.q != i8) {
                                                this.q = i8;
                                                this.m = z59VarArr[i8];
                                                break;
                                            }
                                            break;
                                        case HProv.PP_LCD_QUERY /* 136 */:
                                            i = i6;
                                            z = true;
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (df90Var.f()) {
                                                    z59 z59Var2 = z59VarArr[8 - i9];
                                                    z59Var2.a.clear();
                                                    z59Var2.b.clear();
                                                    z59Var2.o = -1;
                                                    z59Var2.p = -1;
                                                    z59Var2.q = -1;
                                                    z59Var2.s = -1;
                                                    z59Var2.u = 0;
                                                }
                                            }
                                            break;
                                        case HProv.PP_ENUM_LOG /* 137 */:
                                            i = i6;
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (df90Var.f()) {
                                                    z59VarArr[8 - i10].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case HProv.PP_VERSION_EX /* 138 */:
                                            i = i6;
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (df90Var.f()) {
                                                    z59VarArr[8 - i11].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            i = i6;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (df90Var.f()) {
                                                    z59VarArr[8 - i12].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case PollMessageDraft.MAX_ANSWER_LENGTH /* 140 */:
                                            i = i6;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (df90Var.f()) {
                                                    z59VarArr[8 - i13].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            i = i6;
                                            df90Var.o(8);
                                            z = true;
                                            break;
                                        case 142:
                                            i = i6;
                                            z = true;
                                            break;
                                        case 143:
                                            i = i6;
                                            l();
                                            z = true;
                                            break;
                                        case 144:
                                            int i14 = i4;
                                            if (!this.m.c) {
                                                df90Var.o(16);
                                                i = 3;
                                                z = true;
                                                break;
                                            } else {
                                                df90Var.g(4);
                                                df90Var.g(i14);
                                                df90Var.g(i14);
                                                boolean f = df90Var.f();
                                                boolean f2 = df90Var.f();
                                                i = 3;
                                                df90Var.g(3);
                                                df90Var.g(3);
                                                this.m.e(f, f2);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.m.c) {
                                                int c2 = z59.c(df90Var.g(2), df90Var.g(2), df90Var.g(2), df90Var.g(2));
                                                int c3 = z59.c(df90Var.g(2), df90Var.g(2), df90Var.g(2), df90Var.g(2));
                                                df90Var.o(2);
                                                z59.c(df90Var.g(2), df90Var.g(2), df90Var.g(2), 0);
                                                this.m.f(c2, c3);
                                            } else {
                                                df90Var.o(24);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case HProv.PP_CONTAINER_STATUS /* 146 */:
                                            if (this.m.c) {
                                                df90Var.o(4);
                                                int g4 = df90Var.g(4);
                                                df90Var.o(2);
                                                df90Var.g(6);
                                                z59 z59Var3 = this.m;
                                                if (z59Var3.u != g4) {
                                                    z59Var3.a('\n');
                                                }
                                                z59Var3.u = g4;
                                            } else {
                                                df90Var.o(16);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            xvz.v(g3, "Invalid C1 command: ");
                                            i = i6;
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int c4 = z59.c(df90Var.g(2), df90Var.g(2), df90Var.g(2), df90Var.g(2));
                                                df90Var.g(2);
                                                z59.c(df90Var.g(2), df90Var.g(2), df90Var.g(2), 0);
                                                df90Var.f();
                                                df90Var.f();
                                                df90Var.g(2);
                                                df90Var.g(2);
                                                int g5 = df90Var.g(2);
                                                df90Var.o(8);
                                                z59 z59Var4 = this.m;
                                                z59Var4.n = c4;
                                                z59Var4.k = g5;
                                            } else {
                                                df90Var.o(32);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 152:
                                        case BlendingGradientView.BASE_ALPHA /* 153 */:
                                        case 154:
                                        case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        case 156:
                                        case 157:
                                        case HProv.PP_LICENSE /* 158 */:
                                        case 159:
                                            int i15 = g3 - 152;
                                            z59 z59Var5 = z59VarArr[i15];
                                            df90Var.o(i4);
                                            boolean f3 = df90Var.f();
                                            df90Var.o(i4);
                                            int g6 = df90Var.g(i6);
                                            boolean f4 = df90Var.f();
                                            int g7 = df90Var.g(i7);
                                            int g8 = df90Var.g(8);
                                            int g9 = df90Var.g(4);
                                            int g10 = df90Var.g(4);
                                            df90Var.o(i4);
                                            df90Var.o(6);
                                            df90Var.o(i4);
                                            int g11 = df90Var.g(i6);
                                            int g12 = df90Var.g(i6);
                                            ArrayList arrayList = z59Var5.a;
                                            z59Var5.c = true;
                                            z59Var5.d = f3;
                                            z59Var5.e = g6;
                                            z59Var5.f = f4;
                                            z59Var5.g = g7;
                                            z59Var5.h = g8;
                                            z59Var5.i = g9;
                                            int i16 = g10 + 1;
                                            if (z59Var5.j != i16) {
                                                z59Var5.j = i16;
                                                while (true) {
                                                    if (arrayList.size() >= z59Var5.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (g11 != 0 && z59Var5.l != g11) {
                                                z59Var5.l = g11;
                                                int i17 = g11 - 1;
                                                int i18 = z59.B[i17];
                                                boolean z4 = z59.A[i17];
                                                int i19 = z59.y[i17];
                                                int i20 = z59.z[i17];
                                                int i21 = z59.x[i17];
                                                z59Var5.n = i18;
                                                z59Var5.k = i21;
                                            }
                                            if (g12 != 0 && z59Var5.m != g12) {
                                                z59Var5.m = g12;
                                                int i22 = g12 - 1;
                                                int i23 = z59.D[i22];
                                                int i24 = z59.C[i22];
                                                z59Var5.e(false, false);
                                                z59Var5.f(z59.v, z59.E[i22]);
                                            }
                                            if (this.q != i15) {
                                                this.q = i15;
                                                this.m = z59VarArr[i15];
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                    }
                                } else {
                                    i = i6;
                                    z = true;
                                    if (g3 <= 255) {
                                        this.m.a((char) (g3 & 255));
                                    } else {
                                        xvz.v(g3, "Invalid base command: ");
                                        i3 = 2;
                                        i2 = 7;
                                    }
                                }
                                z3 = z;
                                i3 = 2;
                                i2 = 7;
                            }
                            z = true;
                        } else {
                            i = i6;
                            z = true;
                            int g13 = df90Var.g(8);
                            if (g13 <= 31) {
                                i2 = 7;
                                if (g13 > 7) {
                                    if (g13 <= 15) {
                                        df90Var.o(8);
                                    } else if (g13 <= 23) {
                                        df90Var.o(16);
                                    } else if (g13 <= 31) {
                                        df90Var.o(24);
                                    }
                                }
                            } else {
                                i2 = 7;
                                if (g13 <= 127) {
                                    if (g13 == 32) {
                                        this.m.a(HexString.CHAR_SPACE);
                                    } else if (g13 == 33) {
                                        this.m.a((char) 160);
                                    } else if (g13 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (g13 == 42) {
                                        this.m.a((char) 352);
                                    } else if (g13 == 44) {
                                        this.m.a((char) 338);
                                    } else if (g13 == 63) {
                                        this.m.a((char) 376);
                                    } else if (g13 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (g13 == 58) {
                                        this.m.a((char) 353);
                                    } else if (g13 == 60) {
                                        this.m.a((char) 339);
                                    } else if (g13 != 61) {
                                        switch (g13) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case SAFETY_TIPS_VALUE:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a(CodeInputView.PLACEHOLDER);
                                                break;
                                            default:
                                                switch (g13) {
                                                    case HProv.PP_INFO /* 118 */:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case Constants.VPN_TRAFFIC /* 121 */:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case HProv.PP_PASSWD_TERM /* 123 */:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case HProv.PP_SAME_MEDIA /* 124 */:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case HProv.PP_DELETE_KEYSET /* 125 */:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case HProv.PP_DELETE_SAVED_PASSWD /* 126 */:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case HProv.PP_VERSION_TIMESTAMP /* 127 */:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        xvz.v(g13, "Invalid G2 character: ");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    z3 = true;
                                } else {
                                    if (g13 > 159) {
                                        i3 = 2;
                                        c = 6;
                                        if (g13 <= 255) {
                                            if (g13 == 160) {
                                                this.m.a((char) 13252);
                                            } else {
                                                xvz.v(g13, "Invalid G3 character: ");
                                                this.m.a('_');
                                            }
                                            z3 = true;
                                        } else {
                                            xvz.v(g13, "Invalid extended command: ");
                                        }
                                    } else if (g13 <= 135) {
                                        df90Var.o(32);
                                    } else if (g13 <= 143) {
                                        df90Var.o(40);
                                    } else if (g13 <= 159) {
                                        i3 = 2;
                                        df90Var.o(2);
                                        c = 6;
                                        df90Var.o(df90Var.g(6) * 8);
                                    }
                                    boolean z5 = z;
                                    i6 = i;
                                    i4 = i3;
                                    z2 = z5;
                                    i7 = i2;
                                }
                            }
                            i3 = 2;
                        }
                        c = 6;
                        boolean z52 = z;
                        i6 = i;
                        i4 = i3;
                        z2 = z52;
                        i7 = i2;
                    }
                }
            }
        }
        if (z3) {
            this.n = k();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k() {
        Layout.Alignment alignment;
        boolean z;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            z59[] z59VarArr = this.l;
            z59 z59Var = z59VarArr[i];
            if (z59Var.c && (!z59Var.a.isEmpty() || z59Var.b.length() != 0)) {
                z59 z59Var2 = z59VarArr[i];
                if (z59Var2.d) {
                    ArrayList arrayList2 = z59Var2.a;
                    y59 y59Var = null;
                    if (z59Var2.c && (!arrayList2.isEmpty() || z59Var2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) z59Var2.b());
                        int i3 = z59Var2.k;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i3 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i3 != 3) {
                                ny61.e(z59Var2.k, "Unexpected justification value: ");
                                return null;
                            }
                            Layout.Alignment alignment2 = alignment;
                            z = z59Var2.f;
                            int i4 = z59Var2.h;
                            int i5 = z59Var2.g;
                            if (z) {
                                f = i4 / 209.0f;
                                f2 = i5 / 74.0f;
                            } else {
                                f = i4 / 99.0f;
                                f2 = i5 / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i6 = z59Var2.i;
                            int i7 = i6 / 3;
                            int i8 = i7 != 0 ? 0 : i7 == 1 ? 1 : 2;
                            int i9 = i6 % 3;
                            int i10 = i9 != 0 ? 0 : i9 == 1 ? 1 : 2;
                            int i11 = z59Var2.n;
                            y59Var = new y59(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 == z59.w, i11, z59Var2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        z = z59Var2.f;
                        int i42 = z59Var2.h;
                        int i52 = z59Var2.g;
                        if (z) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i62 = z59Var2.i;
                        int i72 = i62 / 3;
                        if (i72 != 0) {
                        }
                        int i92 = i62 % 3;
                        if (i92 != 0) {
                        }
                        int i112 = z59Var2.n;
                        y59Var = new y59(spannableStringBuilder, alignment22, f42, i8, f32, i10, i112 == z59.w, i112, z59Var2.e);
                    }
                    if (y59Var != null) {
                        arrayList.add(y59Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, y59.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((y59) arrayList.get(i12)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
