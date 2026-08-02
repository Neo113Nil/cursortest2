package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.Arrays;
import xsna.qlb0;
import xsna.tgw;

/* loaded from: classes10.dex */
public final class jd0 implements ul0 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final ad3 c = new ad3();
    public tl0 d;
    public int e;
    public int f;
    public long g;

    public final void a(yj1 yj1Var) {
        this.d = yj1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:286:0x05ed. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(ld0 ld0Var) {
        long j;
        int i;
        int i2;
        boolean z;
        int i3;
        li1 li1Var;
        String str;
        boolean z2;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        zj1 zj1Var;
        int i8;
        int i9;
        zj1 zj1Var2;
        int i10;
        int i11;
        int i12;
        long j2;
        int i13;
        int i14;
        int i15;
        int a;
        if (this.d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            id0 id0Var = (id0) this.b.peek();
            int i16 = 1;
            if (id0Var != null && ld0Var.d >= id0Var.b) {
                ((yj1) this.d).a.b(((id0) this.b.pop()).a);
                return true;
            }
            int i17 = 8;
            int i18 = 0;
            if (this.e == 0) {
                long a2 = this.c.a(ld0Var, true, false, 4);
                if (a2 == -2) {
                    ld0Var.f = 0;
                    while (true) {
                        ld0Var.b(this.a, 0, 4, false);
                        byte b = this.a[0];
                        i15 = 0;
                        while (true) {
                            long[] jArr = ad3.d;
                            if (i15 < 8) {
                                j = -1;
                                long j3 = b & jArr[i15];
                                i15++;
                                if (j3 != 0) {
                                }
                            } else {
                                j = -1;
                                i15 = -1;
                            }
                        }
                        if (i15 != -1 && i15 <= 4) {
                            a = (int) ad3.a(this.a, i15, false);
                            ((yj1) this.d).a.getClass();
                            if (a == 357149030 || a == 524531317 || a == 475249515 || a == 374648427) {
                            }
                        }
                        ld0Var.a(1);
                    }
                    ld0Var.a(i15);
                    a2 = a;
                } else {
                    j = -1;
                }
                if (a2 == j) {
                    return false;
                }
                this.f = (int) a2;
                this.e = 1;
            } else {
                j = -1;
            }
            if (this.e == 1) {
                this.g = this.c.a(ld0Var, false, true, 8);
                this.e = 2;
            }
            tl0 tl0Var = this.d;
            int i19 = this.f;
            ((yj1) tl0Var).a.getClass();
            int i20 = 3;
            switch (i19) {
                case MRAID_JS_WRITE_FAILED_VALUE:
                case PRIVACY_URL_ERROR_VALUE:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case AD_RESPONSE_EMPTY_VALUE:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i = 3;
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i = 5;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0) {
                if (i == 1) {
                    long j4 = ld0Var.d;
                    this.b.push(new id0(this.f, this.g + j4));
                    tl0 tl0Var2 = this.d;
                    int i21 = this.f;
                    long j5 = this.g;
                    ak1 ak1Var = ((yj1) tl0Var2).a;
                    qq0 qq0Var = ak1Var.b0;
                    if (qq0Var == null) {
                        throw new IllegalStateException();
                    }
                    if (i21 == 160) {
                        i2 = 0;
                        ak1Var.Q = false;
                        ak1Var.R = 0L;
                    } else if (i21 == 174) {
                        i2 = 0;
                        ak1Var.u = new zj1();
                    } else if (i21 != 187) {
                        if (i21 == 19899) {
                            ak1Var.w = -1;
                            ak1Var.x = j;
                        } else if (i21 == 20533) {
                            ak1Var.a(i21);
                            ak1Var.u.h = true;
                        } else if (i21 == 21968) {
                            ak1Var.a(i21);
                            ak1Var.u.x = true;
                        } else if (i21 == 408125543) {
                            long j6 = ak1Var.q;
                            if (j6 != j && j6 != j4) {
                                throw new pc2("Multiple Segment elements not supported", null, true, 1);
                            }
                            ak1Var.q = j4;
                            ak1Var.p = j5;
                        } else if (i21 == 475249515) {
                            ak1Var.C = new li1(0);
                            ak1Var.D = new li1(0);
                        } else if (i21 == 524531317 && !ak1Var.v) {
                            if (!ak1Var.d || ak1Var.z == j) {
                                qq0Var.a(new yx2(ak1Var.t, 0L));
                                ak1Var.v = true;
                            } else {
                                ak1Var.y = true;
                            }
                        }
                        i2 = 0;
                    } else {
                        i2 = 0;
                        ak1Var.E = false;
                    }
                    this.e = i2;
                    return true;
                }
                byte b2 = 255;
                if (i == 2) {
                    long j7 = this.g;
                    if (j7 > 8) {
                        throw new pc2("Invalid integer size: " + this.g, null, true, 1);
                    }
                    tl0 tl0Var3 = this.d;
                    int i22 = this.f;
                    int i23 = (int) j7;
                    ld0Var.a(this.a, 0, i23, false);
                    long j8 = 0;
                    for (int i24 = 0; i24 < i23; i24++) {
                        j8 = (j8 << 8) | (this.a[i24] & 255);
                    }
                    ak1 ak1Var2 = ((yj1) tl0Var3).a;
                    ak1Var2.getClass();
                    if (i22 != 20529) {
                        if (i22 != 20530) {
                            switch (i22) {
                                case MRAID_JS_WRITE_FAILED_VALUE:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.d = (int) j8;
                                    break;
                                case PRIVACY_URL_ERROR_VALUE:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.V = j8 == 1;
                                    break;
                                case 155:
                                    ak1Var2.I = ak1Var2.a(j8);
                                    break;
                                case 159:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.O = (int) j8;
                                    break;
                                case 176:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.m = (int) j8;
                                    break;
                                case 179:
                                    li1 li1Var2 = ak1Var2.C;
                                    if (li1Var2 != null && ak1Var2.D != null) {
                                        li1Var2.a(ak1Var2.a(j8));
                                        break;
                                    } else {
                                        throw new pc2(tgw.b(i22, "Element ", " must be in a Cues"), null, true, 1);
                                    }
                                    break;
                                case 186:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.n = (int) j8;
                                    break;
                                case AD_RESPONSE_EMPTY_VALUE:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.c = (int) j8;
                                    break;
                                case 231:
                                    ak1Var2.B = ak1Var2.a(j8);
                                    break;
                                case 238:
                                    ak1Var2.P = (int) j8;
                                    break;
                                case 241:
                                    z = true;
                                    if (!ak1Var2.E) {
                                        if (ak1Var2.C != null && (li1Var = ak1Var2.D) != null) {
                                            li1Var.a(j8);
                                            ak1Var2.E = true;
                                            break;
                                        } else {
                                            throw new pc2(tgw.b(i22, "Element ", " must be in a Cues"), null, true, 1);
                                        }
                                    }
                                    break;
                                case 251:
                                    z = true;
                                    ak1Var2.Q = true;
                                    break;
                                case 16871:
                                    z = true;
                                    ak1Var2.a(i22);
                                    ak1Var2.u.g = (int) j8;
                                    break;
                                case 16980:
                                    z = true;
                                    if (j8 != 3) {
                                        throw new pc2(qlb0.a(j8, "ContentCompAlgo ", " not supported"), null, true, 1);
                                    }
                                    break;
                                case 17029:
                                    if (j8 < 1 || j8 > 2) {
                                        throw new pc2(qlb0.a(j8, "DocTypeReadVersion ", " not supported"), null, true, 1);
                                    }
                                    break;
                                case 17143:
                                    z = true;
                                    if (j8 != 1) {
                                        throw new pc2(qlb0.a(j8, "EBMLReadVersion ", " not supported"), null, true, 1);
                                    }
                                    break;
                                case 18401:
                                    z = true;
                                    if (j8 != 5) {
                                        throw new pc2(qlb0.a(j8, "ContentEncAlgo ", " not supported"), null, true, 1);
                                    }
                                    break;
                                case 18408:
                                    if (j8 != 1) {
                                        throw new pc2(qlb0.a(j8, "AESSettingsCipherMode ", " not supported"), null, true, 1);
                                    }
                                    break;
                                case 21420:
                                    ak1Var2.x = j8 + ak1Var2.q;
                                    break;
                                case 21432:
                                    int i25 = (int) j8;
                                    ak1Var2.a(i22);
                                    if (i25 == 0) {
                                        i3 = 0;
                                        ak1Var2.u.w = 0;
                                        z = true;
                                        this.e = i3;
                                        return z;
                                    }
                                    z = true;
                                    if (i25 != 1) {
                                        if (i25 != 3) {
                                            if (i25 == 15) {
                                                ak1Var2.u.w = 3;
                                                break;
                                            }
                                        } else {
                                            ak1Var2.u.w = 1;
                                            break;
                                        }
                                    } else {
                                        ak1Var2.u.w = 2;
                                        break;
                                    }
                                    break;
                                case 21680:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.o = (int) j8;
                                    break;
                                case 21682:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.q = (int) j8;
                                    break;
                                case 21690:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.p = (int) j8;
                                    break;
                                case 21930:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.U = j8 == 1;
                                    break;
                                case 21998:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.f = (int) j8;
                                    break;
                                case 22186:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.R = j8;
                                    break;
                                case 22203:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.S = j8;
                                    break;
                                case 25188:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.P = (int) j8;
                                    break;
                                case 30114:
                                    ak1Var2.R = j8;
                                    break;
                                case 30321:
                                    ak1Var2.a(i22);
                                    int i26 = (int) j8;
                                    if (i26 == 0) {
                                        i3 = 0;
                                        ak1Var2.u.r = 0;
                                        z = true;
                                        this.e = i3;
                                        return z;
                                    }
                                    z = true;
                                    if (i26 != 1) {
                                        if (i26 != 2) {
                                            if (i26 == 3) {
                                                ak1Var2.u.r = 3;
                                                break;
                                            }
                                        } else {
                                            ak1Var2.u.r = 2;
                                            break;
                                        }
                                    } else {
                                        ak1Var2.u.r = 1;
                                        break;
                                    }
                                    break;
                                case 2352003:
                                    ak1Var2.a(i22);
                                    ak1Var2.u.e = (int) j8;
                                    break;
                                case 2807729:
                                    ak1Var2.r = j8;
                                    break;
                                default:
                                    switch (i22) {
                                        case 21945:
                                            ak1Var2.a(i22);
                                            int i27 = (int) j8;
                                            z = true;
                                            if (i27 != 1) {
                                                if (i27 == 2) {
                                                    ak1Var2.u.A = 1;
                                                    break;
                                                }
                                            } else {
                                                ak1Var2.u.A = 2;
                                                break;
                                            }
                                            break;
                                        case 21946:
                                            ak1Var2.a(i22);
                                            int i28 = (int) j8;
                                            if (i28 != 1) {
                                                if (i28 == 16) {
                                                    i20 = 6;
                                                } else if (i28 == 18) {
                                                    i20 = 7;
                                                } else if (i28 != 6 && i28 != 7) {
                                                    i20 = -1;
                                                }
                                            }
                                            if (i20 != -1) {
                                                ak1Var2.u.z = i20;
                                                break;
                                            }
                                            break;
                                        case 21947:
                                            ak1Var2.a(i22);
                                            zj1 zj1Var3 = ak1Var2.u;
                                            zj1Var3.x = true;
                                            int i29 = (int) j8;
                                            int i30 = i29 != 1 ? i29 != 9 ? (i29 == 4 || i29 == 5 || i29 == 6 || i29 == 7) ? 2 : -1 : 6 : 1;
                                            if (i30 != -1) {
                                                zj1Var3.y = i30;
                                                break;
                                            }
                                            break;
                                        case 21948:
                                            ak1Var2.a(i22);
                                            ak1Var2.u.B = (int) j8;
                                            break;
                                        case 21949:
                                            ak1Var2.a(i22);
                                            ak1Var2.u.C = (int) j8;
                                            break;
                                    }
                                    this.e = i3;
                                    return z;
                            }
                        } else if (j8 != 1) {
                            throw new pc2(qlb0.a(j8, "ContentEncodingScope ", " not supported"), null, true, 1);
                        }
                        i3 = 0;
                        z = true;
                        this.e = i3;
                        return z;
                    }
                    z = true;
                    if (j8 != 0) {
                        throw new pc2(qlb0.a(j8, "ContentEncodingOrder ", " not supported"), null, true, 1);
                    }
                    i3 = 0;
                    this.e = i3;
                    return z;
                }
                if (i == 3) {
                    long j9 = this.g;
                    if (j9 > 2147483647L) {
                        throw new pc2("String element size: " + this.g, null, true, 1);
                    }
                    tl0 tl0Var4 = this.d;
                    int i31 = this.f;
                    int i32 = (int) j9;
                    if (i32 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i32];
                        ld0Var.a(bArr, 0, i32, false);
                        while (i32 > 0 && bArr[i32 - 1] == 0) {
                            i32--;
                        }
                        str = new String(bArr, 0, i32);
                    }
                    ak1 ak1Var3 = ((yj1) tl0Var4).a;
                    ak1Var3.getClass();
                    if (i31 != 134) {
                        if (i31 != 17026) {
                            if (i31 == 21358) {
                                ak1Var3.a(i31);
                                ak1Var3.u.a = str;
                            } else if (i31 == 2274716) {
                                ak1Var3.a(i31);
                                ak1Var3.u.W = str;
                            }
                        } else if ("webm".equals(str)) {
                            z2 = true;
                        } else if (!"matroska".equals(str)) {
                            throw new pc2(xsna.zr.a("DocType ", str, " not supported"), null, true, 1);
                        }
                        i4 = 0;
                        z2 = true;
                        this.e = i4;
                        return z2;
                    }
                    z2 = true;
                    ak1Var3.a(i31);
                    ak1Var3.u.b = str;
                    i4 = 0;
                    this.e = i4;
                    return z2;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new pc2(nh2.a("Invalid element type ", i), null, true, 1);
                    }
                    long j10 = this.g;
                    if (j10 != 4 && j10 != 8) {
                        throw new pc2("Invalid float size: " + this.g, null, true, 1);
                    }
                    tl0 tl0Var5 = this.d;
                    int i33 = this.f;
                    int i34 = (int) j10;
                    ld0Var.a(this.a, 0, i34, false);
                    int i35 = 0;
                    long j11 = 0;
                    while (i35 < i34) {
                        j11 = (j11 << 8) | (this.a[i35] & b2);
                        i35++;
                        b2 = 255;
                    }
                    double intBitsToFloat = i34 == 4 ? Float.intBitsToFloat((int) j11) : Double.longBitsToDouble(j11);
                    ak1 ak1Var4 = ((yj1) tl0Var5).a;
                    if (i33 == 181) {
                        ak1Var4.a(i33);
                        ak1Var4.u.Q = (int) intBitsToFloat;
                    } else if (i33 != 17545) {
                        switch (i33) {
                            case 21969:
                                ak1Var4.a(i33);
                                ak1Var4.u.D = (float) intBitsToFloat;
                                break;
                            case 21970:
                                ak1Var4.a(i33);
                                ak1Var4.u.E = (float) intBitsToFloat;
                                break;
                            case 21971:
                                ak1Var4.a(i33);
                                ak1Var4.u.F = (float) intBitsToFloat;
                                break;
                            case 21972:
                                ak1Var4.a(i33);
                                ak1Var4.u.G = (float) intBitsToFloat;
                                break;
                            case 21973:
                                ak1Var4.a(i33);
                                ak1Var4.u.H = (float) intBitsToFloat;
                                break;
                            case 21974:
                                ak1Var4.a(i33);
                                ak1Var4.u.I = (float) intBitsToFloat;
                                break;
                            case 21975:
                                ak1Var4.a(i33);
                                ak1Var4.u.J = (float) intBitsToFloat;
                                break;
                            case 21976:
                                ak1Var4.a(i33);
                                ak1Var4.u.K = (float) intBitsToFloat;
                                break;
                            case 21977:
                                ak1Var4.a(i33);
                                ak1Var4.u.L = (float) intBitsToFloat;
                                break;
                            case 21978:
                                ak1Var4.a(i33);
                                ak1Var4.u.M = (float) intBitsToFloat;
                                break;
                            default:
                                switch (i33) {
                                    case 30323:
                                        ak1Var4.a(i33);
                                        ak1Var4.u.s = (float) intBitsToFloat;
                                        break;
                                    case 30324:
                                        ak1Var4.a(i33);
                                        ak1Var4.u.t = (float) intBitsToFloat;
                                        break;
                                    case 30325:
                                        ak1Var4.a(i33);
                                        ak1Var4.u.u = (float) intBitsToFloat;
                                        break;
                                    default:
                                        ak1Var4.getClass();
                                        break;
                                }
                        }
                    } else {
                        ak1Var4.s = (long) intBitsToFloat;
                    }
                    this.e = 0;
                    return true;
                }
                tl0 tl0Var6 = this.d;
                int i36 = this.f;
                int i37 = (int) this.g;
                ak1 ak1Var5 = ((yj1) tl0Var6).a;
                ak1Var5.getClass();
                if (i36 == 161 || i36 == 163) {
                    if (ak1Var5.G == 0) {
                        i5 = i36;
                        ak1Var5.M = (int) ak1Var5.b.a(ld0Var, false, true, 8);
                        ak1Var5.N = ak1Var5.b.c;
                        ak1Var5.I = C.TIME_UNSET;
                        ak1Var5.G = 1;
                        ak1Var5.g.c(0);
                    } else {
                        i5 = i36;
                    }
                    zj1 zj1Var4 = (zj1) ak1Var5.c.get(ak1Var5.M);
                    if (zj1Var4 != null) {
                        zj1Var4.X.getClass();
                        if (ak1Var5.G == 1) {
                            ak1Var5.a(ld0Var, 3);
                            int i38 = (ak1Var5.g.a[2] & 6) >> 1;
                            if (i38 == 0) {
                                ak1Var5.K = 1;
                                int[] iArr = ak1Var5.L;
                                if (iArr == null) {
                                    iArr = new int[1];
                                } else if (iArr.length < 1) {
                                    iArr = new int[Math.max(iArr.length * 2, 1)];
                                }
                                ak1Var5.L = iArr;
                                iArr[0] = (i37 - ak1Var5.N) - 3;
                            } else {
                                ak1Var5.a(ld0Var, 4);
                                int i39 = (ak1Var5.g.a[3] & 255) + 1;
                                ak1Var5.K = i39;
                                int[] iArr2 = ak1Var5.L;
                                if (iArr2 == null) {
                                    iArr2 = new int[i39];
                                } else if (iArr2.length < i39) {
                                    iArr2 = new int[Math.max(iArr2.length * 2, i39)];
                                }
                                ak1Var5.L = iArr2;
                                if (i38 == 2) {
                                    int i40 = (i37 - ak1Var5.N) - 4;
                                    int i41 = ak1Var5.K;
                                    Arrays.fill(iArr2, 0, i41, i40 / i41);
                                } else {
                                    if (i38 != 1) {
                                        if (i38 != 3) {
                                            throw new pc2(nh2.a("Unexpected lacing value: ", i38), null, true, 1);
                                        }
                                        int i42 = 0;
                                        int i43 = 0;
                                        int i44 = 4;
                                        while (true) {
                                            int i45 = ak1Var5.K - i16;
                                            if (i42 < i45) {
                                                ak1Var5.L[i42] = i18;
                                                int i46 = i44 + 1;
                                                ak1Var5.a(ld0Var, i46);
                                                if (ak1Var5.g.a[i44] == 0) {
                                                    boolean z4 = i16;
                                                    throw new pc2("No valid varint length mask found", null, z4, z4 ? 1 : 0);
                                                }
                                                int i47 = i18;
                                                while (true) {
                                                    if (i47 < i17) {
                                                        i10 = i17;
                                                        int i48 = i16 << (7 - i47);
                                                        i12 = i18;
                                                        if ((ak1Var5.g.a[i44] & i48) != 0) {
                                                            int i49 = i46 + i47;
                                                            ak1Var5.a(ld0Var, i49);
                                                            zj1Var2 = zj1Var4;
                                                            j2 = ak1Var5.g.a[i44] & 255 & (~i48);
                                                            while (i46 < i49) {
                                                                j2 = (j2 << i10) | (ak1Var5.g.a[i46] & 255);
                                                                i46++;
                                                                i5 = i5;
                                                            }
                                                            i11 = i5;
                                                            if (i42 > 0) {
                                                                j2 -= (1 << ((i47 * 7) + 6)) - 1;
                                                            }
                                                            i44 = i49;
                                                        } else {
                                                            i47++;
                                                            i17 = i10;
                                                            i18 = i12;
                                                            i16 = 1;
                                                        }
                                                    } else {
                                                        zj1Var2 = zj1Var4;
                                                        i10 = i17;
                                                        i11 = i5;
                                                        i12 = i18;
                                                        i44 = i46;
                                                        j2 = 0;
                                                    }
                                                }
                                                if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                                    int i50 = (int) j2;
                                                    int[] iArr3 = ak1Var5.L;
                                                    if (i42 != 0) {
                                                        i50 += iArr3[i42 - 1];
                                                    }
                                                    iArr3[i42] = i50;
                                                    i43 += i50;
                                                    i42++;
                                                    zj1Var4 = zj1Var2;
                                                    i17 = i10;
                                                    i5 = i11;
                                                    i18 = i12;
                                                    i16 = 1;
                                                }
                                            } else {
                                                zj1Var = zj1Var4;
                                                i8 = i5;
                                                i9 = i18;
                                                ak1Var5.L[i45] = ((i37 - ak1Var5.N) - i44) - i43;
                                            }
                                        }
                                        throw new pc2("EBML lacing sample size out of range.", null, true, 1);
                                    }
                                    int i51 = 0;
                                    int i52 = 0;
                                    int i53 = 4;
                                    while (true) {
                                        int i54 = ak1Var5.K - 1;
                                        if (i51 < i54) {
                                            ak1Var5.L[i51] = 0;
                                            while (true) {
                                                i13 = i53 + 1;
                                                ak1Var5.a(ld0Var, i13);
                                                int i55 = ak1Var5.g.a[i53] & 255;
                                                int[] iArr4 = ak1Var5.L;
                                                i14 = iArr4[i51] + i55;
                                                iArr4[i51] = i14;
                                                if (i55 != 255) {
                                                    break;
                                                }
                                                i53 = i13;
                                            }
                                            i52 += i14;
                                            i51++;
                                            i53 = i13;
                                        } else {
                                            ak1Var5.L[i54] = ((i37 - ak1Var5.N) - i53) - i52;
                                        }
                                    }
                                }
                            }
                            zj1Var = zj1Var4;
                            i8 = i5;
                            i9 = 0;
                            byte[] bArr2 = ak1Var5.g.a;
                            ak1Var5.H = ak1Var5.a((bArr2[1] & 255) | (bArr2[i9] << 8)) + ak1Var5.B;
                            zj1Var4 = zj1Var;
                            i5 = i8;
                            ak1Var5.O = (zj1Var4.d == 2 || (i5 == 163 && (ak1Var5.g.a[2] & 128) == 128)) ? 1 : i9;
                            ak1Var5.G = 2;
                            ak1Var5.J = i9;
                            i6 = 163;
                        } else {
                            i6 = 163;
                        }
                        if (i5 == i6) {
                            while (true) {
                                int i56 = ak1Var5.J;
                                if (i56 < ak1Var5.K) {
                                    ak1Var5.a(zj1Var4, ak1Var5.H + ((ak1Var5.J * zj1Var4.e) / 1000), ak1Var5.O, ak1Var5.a(ld0Var, zj1Var4, ak1Var5.L[i56], false), 0);
                                    ak1Var5.J++;
                                } else {
                                    i7 = 0;
                                    z3 = true;
                                    ak1Var5.G = 0;
                                }
                            }
                        } else {
                            z3 = true;
                            while (true) {
                                int i57 = ak1Var5.J;
                                if (i57 < ak1Var5.K) {
                                    int[] iArr5 = ak1Var5.L;
                                    iArr5[i57] = ak1Var5.a(ld0Var, zj1Var4, iArr5[i57], true);
                                    ak1Var5.J++;
                                } else {
                                    i7 = 0;
                                }
                            }
                        }
                        this.e = i7;
                        return z3;
                    }
                    ld0Var.a(i37 - ak1Var5.N);
                    ak1Var5.G = 0;
                } else if (i36 != 165) {
                    if (i36 == 16877) {
                        ak1Var5.a(i36);
                        zj1 zj1Var5 = ak1Var5.u;
                        int i58 = zj1Var5.g;
                        if (i58 == 1685485123 || i58 == 1685480259) {
                            byte[] bArr3 = new byte[i37];
                            zj1Var5.N = bArr3;
                            ld0Var.a(bArr3, 0, i37, false);
                        } else {
                            ld0Var.a(i37);
                        }
                    } else if (i36 == 16981) {
                        ak1Var5.a(i36);
                        byte[] bArr4 = new byte[i37];
                        ak1Var5.u.i = bArr4;
                        ld0Var.a(bArr4, 0, i37, false);
                    } else if (i36 == 18402) {
                        byte[] bArr5 = new byte[i37];
                        ld0Var.a(bArr5, 0, i37, false);
                        ak1Var5.a(i36);
                        ak1Var5.u.j = new p83(1, 0, 0, bArr5);
                    } else if (i36 == 21419) {
                        Arrays.fill(ak1Var5.i.a, (byte) 0);
                        ld0Var.a(ak1Var5.i.a, 4 - i37, i37, false);
                        ak1Var5.i.e(0);
                        ak1Var5.w = (int) ak1Var5.i.n();
                    } else if (i36 == 25506) {
                        ak1Var5.a(i36);
                        byte[] bArr6 = new byte[i37];
                        ak1Var5.u.k = bArr6;
                        ld0Var.a(bArr6, 0, i37, false);
                    } else {
                        if (i36 != 30322) {
                            throw new pc2(nh2.a("Unexpected id: ", i36), null, true, 1);
                        }
                        ak1Var5.a(i36);
                        byte[] bArr7 = new byte[i37];
                        ak1Var5.u.v = bArr7;
                        ld0Var.a(bArr7, 0, i37, false);
                    }
                } else if (ak1Var5.G == 2) {
                    zj1 zj1Var6 = (zj1) ak1Var5.c.get(ak1Var5.M);
                    if (ak1Var5.P == 4 && "V_VP9".equals(zj1Var6.b)) {
                        ak1Var5.n.c(i37);
                        ld0Var.a(ak1Var5.n.a, 0, i37, false);
                    } else {
                        ld0Var.a(i37);
                    }
                }
                z3 = true;
                i7 = 0;
                this.e = i7;
                return z3;
            }
            ld0Var.a((int) this.g);
            this.e = 0;
        }
    }

    public final void a() {
        this.e = 0;
        this.b.clear();
        ad3 ad3Var = this.c;
        ad3Var.b = 0;
        ad3Var.c = 0;
    }
}
