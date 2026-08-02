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

/* loaded from: classes7.dex */
public final class py61 extends x771 {
    public final dl81 g = new dl81();
    public final uh81 h = new uh81();
    public int i = -1;
    public final int j;
    public final lj61[] k;
    public lj61 l;
    public List m;
    public List n;
    public a69 o;
    public int p;

    public py61(int i, List list) {
        this.j = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.k = new lj61[8];
        int i2 = 0;
        while (true) {
            lj61[] lj61VarArr = this.k;
            if (i2 >= 8) {
                this.l = lj61VarArr[0];
                return;
            } else {
                lj61VarArr[i2] = new lj61();
                i2++;
            }
        }
    }

    @Override // defpackage.x771
    public final void c(q171 q171Var) {
        ByteBuffer byteBuffer = q171Var.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        dl81 dl81Var = this.g;
        dl81Var.a = array;
        dl81Var.c = limit;
        dl81Var.b = 0;
        while (dl81Var.c - dl81Var.b >= 3) {
            int s = dl81Var.s();
            int i = s & 3;
            boolean z = (s & 4) == 4;
            byte s2 = (byte) dl81Var.s();
            byte s3 = (byte) dl81Var.s();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        g();
                        int i2 = (s2 & DerValue.TAG_PRIVATE) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            for (int i4 = 0; i4 < 8; i4++) {
                                this.k[i4].f();
                            }
                            nba1.e();
                        }
                        this.i = i2;
                        int i5 = s2 & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        a69 a69Var = new a69(i2, i5, 3);
                        this.o = a69Var;
                        byte[] bArr = a69Var.b;
                        a69Var.e = 1;
                        bArr[0] = s3;
                    } else {
                        if (i != 2) {
                            w511.q();
                            return;
                        }
                        a69 a69Var2 = this.o;
                        if (a69Var2 == null) {
                            nba1.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = a69Var2.b;
                            int i6 = a69Var2.e;
                            int i7 = i6 + 1;
                            a69Var2.e = i7;
                            bArr2[i6] = s2;
                            a69Var2.e = i6 + 2;
                            bArr2[i7] = s3;
                        }
                    }
                    a69 a69Var3 = this.o;
                    if (a69Var3.e == (a69Var3.d * 2) - 1) {
                        g();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // defpackage.x771
    public final shu d() {
        List list = this.m;
        this.n = list;
        list.getClass();
        return new shu(list, 1);
    }

    @Override // defpackage.x771
    public final boolean f() {
        return this.m != this.n;
    }

    @Override // defpackage.x771, defpackage.c581
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        lj61[] lj61VarArr = this.k;
        this.l = lj61VarArr[0];
        for (int i = 0; i < 8; i++) {
            lj61VarArr[i].f();
        }
        this.o = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x00fa. Please report as an issue. */
    public final void g() {
        lj61[] lj61VarArr;
        boolean z;
        boolean z2;
        char c;
        int i;
        int i2;
        lj61[] lj61VarArr2 = this.k;
        uh81 uh81Var = this.h;
        a69 a69Var = this.o;
        if (a69Var == null) {
            return;
        }
        int i3 = 2;
        if (a69Var.e != (a69Var.d * 2) - 1) {
            int i4 = a69Var.c;
            synchronized (nba1.a) {
            }
        }
        a69 a69Var2 = this.o;
        byte[] bArr = a69Var2.b;
        int i5 = a69Var2.e;
        uh81Var.a = bArr;
        uh81Var.b = 0;
        uh81Var.c = 0;
        uh81Var.d = i5;
        boolean z3 = false;
        while (true) {
            if (uh81Var.e() > 0) {
                int i6 = 3;
                int a = uh81Var.a(3);
                int a2 = uh81Var.a(5);
                if (a == 7) {
                    uh81Var.h(i3);
                    a = uh81Var.a(6);
                    if (a < 7) {
                        nba1.e();
                    }
                }
                if (a2 == 0) {
                    if (a != 0) {
                        nba1.e();
                    }
                } else if (a != this.j) {
                    uh81Var.j(a2);
                } else {
                    int i7 = (a2 * 8) + uh81Var.i();
                    while (uh81Var.i() < i7) {
                        int a3 = uh81Var.a(8);
                        if (a3 != 16) {
                            if (a3 <= 31) {
                                if (a3 != 0) {
                                    if (a3 == i6) {
                                        this.m = h();
                                    } else if (a3 != 8) {
                                        switch (a3) {
                                            case 12:
                                                for (int i8 = 0; i8 < 8; i8++) {
                                                    lj61VarArr2[i8].f();
                                                }
                                                break;
                                            case 13:
                                                this.l.c('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (a3 < 17 || a3 > 23) {
                                                    if (a3 < 24 || a3 > 31) {
                                                        nba1.e();
                                                        break;
                                                    } else {
                                                        nba1.e();
                                                        uh81Var.h(16);
                                                        break;
                                                    }
                                                } else {
                                                    nba1.e();
                                                    uh81Var.h(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        lj61 lj61Var = this.l;
                                        int length = lj61Var.b.length();
                                        if (length > 0) {
                                            lj61Var.b.delete(length - 1, length);
                                        }
                                    }
                                }
                                lj61VarArr = lj61VarArr2;
                                i = i3;
                                z = true;
                                z2 = false;
                            } else {
                                if (a3 <= 127) {
                                    lj61 lj61Var2 = this.l;
                                    if (a3 == 127) {
                                        lj61Var2.c((char) 9835);
                                    } else {
                                        lj61Var2.c((char) (a3 & 255));
                                    }
                                } else {
                                    if (a3 <= 159) {
                                        switch (a3) {
                                            case 128:
                                            case HProv.PP_SECURITY_LEVEL /* 129 */:
                                            case 130:
                                            case HProv.PP_FAST_CODE /* 131 */:
                                            case HProv.PP_CONTAINER_EXTENSION /* 132 */:
                                            case HProv.PP_ENUM_CONTAINER_EXTENSION /* 133 */:
                                            case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
                                            case HProv.PP_CONTAINER_DEFAULT /* 135 */:
                                                lj61VarArr = lj61VarArr2;
                                                z = true;
                                                z2 = false;
                                                int i9 = a3 - 128;
                                                if (this.p != i9) {
                                                    this.p = i9;
                                                    this.l = lj61VarArr[i9];
                                                    break;
                                                }
                                                break;
                                            case HProv.PP_LCD_QUERY /* 136 */:
                                                lj61VarArr = lj61VarArr2;
                                                z = true;
                                                for (int i10 = 1; i10 <= 8; i10++) {
                                                    if (uh81Var.k()) {
                                                        lj61 lj61Var3 = lj61VarArr[8 - i10];
                                                        lj61Var3.a.clear();
                                                        lj61Var3.b.clear();
                                                        lj61Var3.p = -1;
                                                        lj61Var3.q = -1;
                                                        lj61Var3.r = -1;
                                                        lj61Var3.t = -1;
                                                        lj61Var3.v = 0;
                                                    }
                                                }
                                                z2 = false;
                                                break;
                                            case HProv.PP_ENUM_LOG /* 137 */:
                                                lj61VarArr = lj61VarArr2;
                                                for (int i11 = 1; i11 <= 8; i11++) {
                                                    if (uh81Var.k()) {
                                                        lj61VarArr[8 - i11].d = true;
                                                    }
                                                }
                                                z = true;
                                                i = 2;
                                                z2 = false;
                                                break;
                                            case HProv.PP_VERSION_EX /* 138 */:
                                                lj61VarArr = lj61VarArr2;
                                                for (int i12 = 1; i12 <= 8; i12++) {
                                                    if (uh81Var.k()) {
                                                        lj61VarArr[8 - i12].d = false;
                                                    }
                                                }
                                                i = 2;
                                                z = true;
                                                z2 = false;
                                                break;
                                            case 139:
                                                lj61VarArr = lj61VarArr2;
                                                for (int i13 = 1; i13 <= 8; i13++) {
                                                    if (uh81Var.k()) {
                                                        lj61VarArr[8 - i13].d = !r3.d;
                                                    }
                                                }
                                                i = 2;
                                                z = true;
                                                z2 = false;
                                                break;
                                            case PollMessageDraft.MAX_ANSWER_LENGTH /* 140 */:
                                                lj61VarArr = lj61VarArr2;
                                                for (int i14 = 1; i14 <= 8; i14++) {
                                                    if (uh81Var.k()) {
                                                        lj61VarArr[8 - i14].f();
                                                    }
                                                }
                                                i = 2;
                                                z = true;
                                                z2 = false;
                                                break;
                                            case 141:
                                                lj61VarArr = lj61VarArr2;
                                                uh81Var.h(8);
                                                i = 2;
                                                z = true;
                                                z2 = false;
                                                break;
                                            case 142:
                                                break;
                                            case 143:
                                                lj61VarArr = lj61VarArr2;
                                                for (int i15 = 0; i15 < 8; i15++) {
                                                    lj61VarArr[i15].f();
                                                }
                                                i = 2;
                                                z = true;
                                                z2 = false;
                                                break;
                                            case 144:
                                                lj61VarArr = lj61VarArr2;
                                                i2 = i3;
                                                if (!this.l.c) {
                                                    uh81Var.h(16);
                                                    i = i2;
                                                    i6 = 3;
                                                    z = true;
                                                    z2 = false;
                                                    break;
                                                } else {
                                                    uh81Var.a(4);
                                                    uh81Var.a(i2);
                                                    uh81Var.a(i2);
                                                    boolean k = uh81Var.k();
                                                    boolean k2 = uh81Var.k();
                                                    i6 = 3;
                                                    uh81Var.a(3);
                                                    uh81Var.a(3);
                                                    this.l.e(k, k2);
                                                    i = 2;
                                                    z = true;
                                                    z2 = false;
                                                }
                                            case 145:
                                                lj61VarArr = lj61VarArr2;
                                                if (!this.l.c) {
                                                    uh81Var.h(24);
                                                    i = 2;
                                                    i6 = 3;
                                                    z = true;
                                                    z2 = false;
                                                    break;
                                                } else {
                                                    i2 = 2;
                                                    int a4 = lj61.a(uh81Var.a(2), uh81Var.a(2), uh81Var.a(2), uh81Var.a(2));
                                                    int a5 = lj61.a(uh81Var.a(2), uh81Var.a(2), uh81Var.a(2), uh81Var.a(2));
                                                    uh81Var.h(2);
                                                    lj61.a(uh81Var.a(2), uh81Var.a(2), uh81Var.a(2), 0);
                                                    this.l.d(a4, a5);
                                                    i = i2;
                                                    i6 = 3;
                                                    z = true;
                                                    z2 = false;
                                                }
                                            case HProv.PP_CONTAINER_STATUS /* 146 */:
                                                lj61VarArr = lj61VarArr2;
                                                if (this.l.c) {
                                                    uh81Var.h(4);
                                                    int a6 = uh81Var.a(4);
                                                    uh81Var.h(2);
                                                    uh81Var.a(6);
                                                    lj61 lj61Var4 = this.l;
                                                    if (lj61Var4.v != a6) {
                                                        lj61Var4.c('\n');
                                                    }
                                                    lj61Var4.v = a6;
                                                } else {
                                                    uh81Var.h(16);
                                                }
                                                i = 2;
                                                i6 = 3;
                                                z = true;
                                                z2 = false;
                                                break;
                                            case 147:
                                            case 148:
                                            case 149:
                                            case 150:
                                            default:
                                                nba1.e();
                                                break;
                                            case 151:
                                                lj61VarArr = lj61VarArr2;
                                                if (this.l.c) {
                                                    int a7 = lj61.a(uh81Var.a(2), uh81Var.a(2), uh81Var.a(2), uh81Var.a(2));
                                                    uh81Var.a(2);
                                                    lj61.a(uh81Var.a(2), uh81Var.a(2), uh81Var.a(2), 0);
                                                    uh81Var.k();
                                                    uh81Var.k();
                                                    uh81Var.a(2);
                                                    uh81Var.a(2);
                                                    int a8 = uh81Var.a(2);
                                                    uh81Var.h(8);
                                                    lj61 lj61Var5 = this.l;
                                                    lj61Var5.o = a7;
                                                    lj61Var5.l = a8;
                                                } else {
                                                    uh81Var.h(32);
                                                }
                                                i = 2;
                                                i6 = 3;
                                                z = true;
                                                z2 = false;
                                                break;
                                            case 152:
                                            case BlendingGradientView.BASE_ALPHA /* 153 */:
                                            case 154:
                                            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                            case 156:
                                            case 157:
                                            case HProv.PP_LICENSE /* 158 */:
                                            case 159:
                                                int i16 = a3 - 152;
                                                lj61 lj61Var6 = lj61VarArr2[i16];
                                                uh81Var.h(i3);
                                                boolean k3 = uh81Var.k();
                                                boolean k4 = uh81Var.k();
                                                uh81Var.k();
                                                int a9 = uh81Var.a(i6);
                                                boolean k5 = uh81Var.k();
                                                int a10 = uh81Var.a(7);
                                                int a11 = uh81Var.a(8);
                                                int a12 = uh81Var.a(4);
                                                int a13 = uh81Var.a(4);
                                                uh81Var.h(i3);
                                                uh81Var.a(6);
                                                uh81Var.h(i3);
                                                int a14 = uh81Var.a(3);
                                                lj61VarArr = lj61VarArr2;
                                                int a15 = uh81Var.a(3);
                                                lj61Var6.c = true;
                                                ArrayList arrayList = lj61Var6.a;
                                                lj61Var6.d = k3;
                                                lj61Var6.k = k4;
                                                lj61Var6.e = a9;
                                                lj61Var6.f = k5;
                                                lj61Var6.g = a10;
                                                lj61Var6.h = a11;
                                                lj61Var6.i = a12;
                                                int i17 = a13 + 1;
                                                if (lj61Var6.j != i17) {
                                                    lj61Var6.j = i17;
                                                    while (true) {
                                                        if ((k4 && arrayList.size() >= lj61Var6.j) || arrayList.size() >= 15) {
                                                            arrayList.remove(0);
                                                        }
                                                    }
                                                }
                                                if (a14 != 0 && lj61Var6.m != a14) {
                                                    lj61Var6.m = a14;
                                                    int i18 = a14 - 1;
                                                    int i19 = lj61.C[i18];
                                                    boolean z4 = lj61.B[i18];
                                                    int i20 = lj61.z[i18];
                                                    int i21 = lj61.A[i18];
                                                    int i22 = lj61.y[i18];
                                                    lj61Var6.o = i19;
                                                    lj61Var6.l = i22;
                                                }
                                                if (a15 != 0 && lj61Var6.n != a15) {
                                                    lj61Var6.n = a15;
                                                    int i23 = a15 - 1;
                                                    int i24 = lj61.E[i23];
                                                    int i25 = lj61.D[i23];
                                                    lj61Var6.e(false, false);
                                                    lj61Var6.d(lj61.w, lj61.F[i23]);
                                                }
                                                if (this.p != i16) {
                                                    this.p = i16;
                                                    this.l = lj61VarArr[i16];
                                                }
                                                i = 2;
                                                i6 = 3;
                                                z = true;
                                                z2 = false;
                                                break;
                                        }
                                        c = 7;
                                        z3 = z;
                                    } else {
                                        lj61VarArr = lj61VarArr2;
                                        z = true;
                                        z2 = false;
                                        if (a3 <= 255) {
                                            this.l.c((char) (a3 & 255));
                                        } else {
                                            nba1.e();
                                            i = 2;
                                        }
                                    }
                                    i = 2;
                                    c = 7;
                                    z3 = z;
                                }
                                lj61VarArr = lj61VarArr2;
                                i = i3;
                                z = true;
                                z2 = false;
                                c = 7;
                                z3 = z;
                            }
                            c = 7;
                        } else {
                            lj61VarArr = lj61VarArr2;
                            z = true;
                            z2 = false;
                            int a16 = uh81Var.a(8);
                            if (a16 <= 31) {
                                c = 7;
                                if (a16 > 7) {
                                    if (a16 <= 15) {
                                        uh81Var.h(8);
                                    } else if (a16 <= 23) {
                                        uh81Var.h(16);
                                    } else if (a16 <= 31) {
                                        uh81Var.h(24);
                                    }
                                }
                            } else {
                                c = 7;
                                if (a16 <= 127) {
                                    if (a16 == 32) {
                                        this.l.c(HexString.CHAR_SPACE);
                                    } else if (a16 == 33) {
                                        this.l.c((char) 160);
                                    } else if (a16 == 37) {
                                        this.l.c((char) 8230);
                                    } else if (a16 == 42) {
                                        this.l.c((char) 352);
                                    } else if (a16 == 44) {
                                        this.l.c((char) 338);
                                    } else if (a16 == 63) {
                                        this.l.c((char) 376);
                                    } else if (a16 == 57) {
                                        this.l.c((char) 8482);
                                    } else if (a16 == 58) {
                                        this.l.c((char) 353);
                                    } else if (a16 == 60) {
                                        this.l.c((char) 339);
                                    } else if (a16 != 61) {
                                        switch (a16) {
                                            case 48:
                                                this.l.c((char) 9608);
                                                break;
                                            case 49:
                                                this.l.c((char) 8216);
                                                break;
                                            case 50:
                                                this.l.c((char) 8217);
                                                break;
                                            case SAFETY_TIPS_VALUE:
                                                this.l.c((char) 8220);
                                                break;
                                            case 52:
                                                this.l.c((char) 8221);
                                                break;
                                            case 53:
                                                this.l.c(CodeInputView.PLACEHOLDER);
                                                break;
                                            default:
                                                switch (a16) {
                                                    case HProv.PP_INFO /* 118 */:
                                                        this.l.c((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.l.c((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.l.c((char) 8541);
                                                        break;
                                                    case Constants.VPN_TRAFFIC /* 121 */:
                                                        this.l.c((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.l.c((char) 9474);
                                                        break;
                                                    case HProv.PP_PASSWD_TERM /* 123 */:
                                                        this.l.c((char) 9488);
                                                        break;
                                                    case HProv.PP_SAME_MEDIA /* 124 */:
                                                        this.l.c((char) 9492);
                                                        break;
                                                    case HProv.PP_DELETE_KEYSET /* 125 */:
                                                        this.l.c((char) 9472);
                                                        break;
                                                    case HProv.PP_DELETE_SAVED_PASSWD /* 126 */:
                                                        this.l.c((char) 9496);
                                                        break;
                                                    case HProv.PP_VERSION_TIMESTAMP /* 127 */:
                                                        this.l.c((char) 9484);
                                                        break;
                                                    default:
                                                        nba1.e();
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.l.c((char) 8480);
                                    }
                                    i = 2;
                                } else if (a16 > 159) {
                                    i = 2;
                                    if (a16 > 255) {
                                        nba1.e();
                                    } else if (a16 == 160) {
                                        this.l.c((char) 13252);
                                    } else {
                                        nba1.e();
                                        this.l.c('_');
                                    }
                                } else if (a16 <= 135) {
                                    uh81Var.h(32);
                                } else if (a16 <= 143) {
                                    uh81Var.h(40);
                                } else if (a16 <= 159) {
                                    i = 2;
                                    uh81Var.h(2);
                                    uh81Var.h(uh81Var.a(6) * 8);
                                }
                                z3 = z;
                            }
                            i = 2;
                        }
                        lj61VarArr2 = lj61VarArr;
                        i3 = i;
                    }
                }
            }
        }
        if (z3) {
            this.m = h();
        }
        this.o = null;
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
    public final List h() {
        Layout.Alignment alignment;
        boolean z;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            lj61[] lj61VarArr = this.k;
            lj61 lj61Var = lj61VarArr[i];
            if (lj61Var.c && (!lj61Var.a.isEmpty() || lj61Var.b.length() != 0)) {
                lj61 lj61Var2 = lj61VarArr[i];
                boolean z2 = lj61Var2.d;
                ArrayList arrayList2 = lj61Var2.a;
                if (z2) {
                    q291 q291Var = null;
                    if (lj61Var2.c && (!arrayList2.isEmpty() || lj61Var2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) lj61Var2.b());
                        int i3 = lj61Var2.l;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i3 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i3 != 3) {
                                ny61.e(lj61Var2.l, "Unexpected justification value: ");
                                return null;
                            }
                            Layout.Alignment alignment2 = alignment;
                            z = lj61Var2.f;
                            int i4 = lj61Var2.h;
                            int i5 = lj61Var2.g;
                            if (z) {
                                f = i4 / 209.0f;
                                f2 = i5 / 74.0f;
                            } else {
                                f = i4 / 99.0f;
                                f2 = i5 / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i6 = lj61Var2.i;
                            int i7 = i6 / 3;
                            int i8 = i7 != 0 ? 0 : i7 == 1 ? 1 : 2;
                            int i9 = i6 % 3;
                            int i10 = i9 != 0 ? 0 : i9 == 1 ? 1 : 2;
                            int i11 = lj61Var2.o;
                            q291Var = new q291(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 == lj61.x, i11, lj61Var2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        z = lj61Var2.f;
                        int i42 = lj61Var2.h;
                        int i52 = lj61Var2.g;
                        if (z) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i62 = lj61Var2.i;
                        int i72 = i62 / 3;
                        if (i72 != 0) {
                        }
                        int i92 = i62 % 3;
                        if (i92 != 0) {
                        }
                        int i112 = lj61Var2.o;
                        q291Var = new q291(spannableStringBuilder, alignment22, f42, i8, f32, i10, i112 == lj61.x, i112, lj61Var2.e);
                    }
                    if (q291Var != null) {
                        arrayList.add(q291Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, q291.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((q291) arrayList.get(i12)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }
}
