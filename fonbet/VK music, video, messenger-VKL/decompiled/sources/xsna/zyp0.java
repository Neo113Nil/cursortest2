package xsna;

import com.facebook.soloader.MinElf;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UiDtoHolderParamsPostProcessorImpl.kt */
/* loaded from: classes4.dex */
public final class zyp0 implements yzs<List<? extends ol60>, Integer, ol60, nl60> {
    public final pl60 b;

    public zyp0(pl60 pl60Var) {
        this.b = pl60Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009f  */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nl60 invoke(List<? extends ol60> list, Integer num, ol60 ol60Var) {
        int i;
        ol60 ol60Var2;
        int i2;
        int i3;
        int i4;
        int b;
        float a;
        int b2;
        float a2;
        Integer valueOf;
        Integer valueOf2;
        int b3;
        long j;
        List<? extends ol60> list2 = list;
        int intValue = num.intValue();
        ol60 ol60Var3 = ol60Var;
        z1c0 z1c0Var = ol60Var3 instanceof z1c0 ? (z1c0) ol60Var3 : null;
        u1c0 u1c0Var = z1c0Var != null ? z1c0Var.h : null;
        boolean z = u1c0Var instanceof f28;
        pl60 pl60Var = this.b;
        if (z) {
            pl60Var.getClass();
            long j2 = ((short) 0) & 65535;
            long b4 = ((short) (u1c0Var != null ? cn70.b(12) : 0)) & 65535;
            j = (j2 << 32) | (j2 << 48) | (b4 << 16) | b4;
        } else {
            int i5 = ol60Var3.b;
            pl60Var.getClass();
            boolean z2 = pl60Var.a;
            if (lbs.s(i5) && i5 != 215 && i5 != 220 && i5 != 352 && i5 != 257 && i5 != 258 && i5 != 344 && i5 != 345) {
                switch (i5) {
                    case 203:
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                        break;
                    default:
                        i = cn70.b(8);
                        break;
                }
                HashSet hashSet = pl60.d;
                ol60Var2 = (ol60) j5g.b0(intValue - 1, list2);
                if (ol60Var2 != null) {
                    i4 = 2;
                    i2 = 16;
                    b = 0;
                    i3 = 0;
                } else {
                    int i6 = ol60Var2.b;
                    int i7 = ol60Var2.e;
                    ol60 ol60Var4 = list2.get(intValue);
                    i2 = 16;
                    int i8 = ol60Var4.b;
                    int i9 = ol60Var4.e;
                    i3 = 0;
                    if (i7 == 4 && i9 == 2) {
                        if (hashSet.contains(Integer.valueOf(i8)) && ((i8 == 302 || i8 == 331) && i6 == 317)) {
                            b = cn70.b(4);
                            i4 = 2;
                        }
                        i4 = 2;
                        b = 0;
                    } else {
                        if (hashSet.contains(Integer.valueOf(i6)) || hashSet.contains(Integer.valueOf(i8))) {
                            int i10 = pl60.f;
                            int i11 = pl60.g;
                            qen qenVar = pl60Var.b;
                            int i12 = (i8 << 16) | (i6 & MinElf.PN_XNUM);
                            HashMap<Integer, Integer> hashMap = pl60.c;
                            i4 = 2;
                            if (hashMap.containsKey(Integer.valueOf(i12))) {
                                Integer num2 = hashMap.get(Integer.valueOf(i12));
                                if (num2 != null) {
                                    b = num2.intValue();
                                }
                                b = 0;
                            } else if (lbs.s(i8)) {
                                if (lbs.y(i6)) {
                                    a = dq.a(5.5f, 0.5f);
                                    b = (int) a;
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                } else {
                                    qenVar.getClass();
                                    if (!qen.d(i6)) {
                                        if (qen.d(i6)) {
                                            b = cn70.b(8);
                                        } else if (qen.e(i6)) {
                                            b = i11 - i10;
                                        }
                                        hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                    }
                                    b = 0;
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                }
                            } else if (pl60.a(i8)) {
                                if (lbs.y(i6)) {
                                    a = dq.a(0.5f, 0.5f);
                                    b = (int) a;
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                } else {
                                    if (lbs.v(i6)) {
                                        b = cn70.b(8);
                                    } else if (lbs.z(i6)) {
                                        b = cn70.b(8);
                                    } else if (lbs.s(i6)) {
                                        b = cn70.b(8);
                                    } else if (lbs.n(i6)) {
                                        b = cn70.b(8);
                                    } else if (i6 == 194) {
                                        b = cn70.b(0);
                                    } else if (pl60.a(i6)) {
                                        b = cn70.b(4);
                                    } else if (pl60.b(i6)) {
                                        b = cn70.b(6);
                                    } else if (i6 != 7) {
                                        if (i6 == 124) {
                                            b = cn70.b(4);
                                        }
                                        b = 0;
                                    } else {
                                        b = cn70.b(8);
                                    }
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                }
                            } else if (pl60.b(i8)) {
                                if (i8 != 342) {
                                    if (i8 != 346) {
                                        if (i8 == 357) {
                                            if (z2) {
                                                b = cn70.b(-64);
                                            } else {
                                                if (z2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                b = cn70.b(-94);
                                            }
                                        }
                                        b = 0;
                                    } else if (z2) {
                                        b = cn70.b(-64);
                                    } else {
                                        if (z2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        b = cn70.b(-94);
                                    }
                                } else if (z2) {
                                    b = cn70.b(-52);
                                } else {
                                    if (z2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    b = cn70.b(-44);
                                }
                                hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                            } else if (lbs.y(i8)) {
                                qenVar.getClass();
                                if (qen.d(i6)) {
                                    a = dq.a(-7.0f, 0.5f);
                                } else {
                                    if (qen.d(i6)) {
                                        b = cn70.b(-5);
                                    } else if (qen.e(i6)) {
                                        a = dq.a(1.5f, 0.5f);
                                    } else if (qen.b(i6)) {
                                        b = cn70.b(-2);
                                    } else if (i6 == 15) {
                                        b = cn70.b(-12);
                                    } else {
                                        if (i6 != 369) {
                                            if (i6 == 46) {
                                                b = cn70.b(-8);
                                            } else if (i6 == 268 || i6 == 269) {
                                                b = cn70.b(-8);
                                            } else if (i6 != 149) {
                                                if (qen.c(i6)) {
                                                    b = cn70.b(-8);
                                                } else if (i6 == 70 || i6 == 96) {
                                                    b = cn70.b(-8);
                                                } else if (i6 == 45) {
                                                    b = cn70.b(-8);
                                                } else if (i6 == 80) {
                                                    b = cn70.b(-2);
                                                } else if (i6 == 329) {
                                                    a = dq.a(4.5f, 0.5f);
                                                } else if (i6 == 330) {
                                                    a = dq.a(1.5f, 0.5f);
                                                } else if (i6 == 356) {
                                                    a2 = cn70.a() * 1.5f;
                                                    b2 = (int) a2;
                                                    b = -b2;
                                                }
                                            }
                                        }
                                        b = 0;
                                    }
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                }
                                b = (int) a;
                                hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                            } else if (lbs.t(i8) || lbs.p(i8)) {
                                qenVar.getClass();
                                if (qen.d(i6)) {
                                    a = dq.a(-7.5f, 0.5f);
                                    b = (int) a;
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                } else {
                                    if (qen.d(i6)) {
                                        b = cn70.b(-5);
                                    } else if (qen.b(i6)) {
                                        b = cn70.b(-2);
                                    } else if (i6 == 15) {
                                        b = cn70.b(-12);
                                    } else {
                                        if (i6 != 369) {
                                            if (i6 == 301) {
                                                b = cn70.b(-8);
                                            } else if (i6 == 14 || i6 == 317) {
                                                b = cn70.b(4);
                                            } else if (i6 == 340) {
                                                b = cn70.b(4);
                                            }
                                        }
                                        b = 0;
                                    }
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                }
                            } else if (lbs.v(i8)) {
                                qenVar.getClass();
                                if (qen.d(i6)) {
                                    b2 = cn70.b(6);
                                    b = -b2;
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                } else {
                                    if (qen.d(i6)) {
                                        b = cn70.b(2);
                                    } else {
                                        if (lbs.y(i6)) {
                                            a2 = dq.a(0.5f, 0.5f);
                                        } else if (lbs.t(i6) || lbs.p(i6)) {
                                            a2 = dq.a(2.5f, 0.5f);
                                        } else {
                                            if (qen.e(i6)) {
                                                b = (i11 - i10) - pl60.j;
                                            }
                                            b = 0;
                                        }
                                        b2 = (int) a2;
                                        b = -b2;
                                    }
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                }
                            } else if (lbs.z(i8)) {
                                qenVar.getClass();
                                if (qen.d(i6)) {
                                    b2 = cn70.b(4);
                                    b = -b2;
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                } else if (qen.d(i6)) {
                                    b = cn70.b(4);
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                } else {
                                    if (lbs.y(i6)) {
                                        a = dq.a(0.5f, 0.5f);
                                        b = (int) a;
                                        hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                    }
                                    b = 0;
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                }
                            } else if (lbs.A(i8)) {
                                qenVar.getClass();
                                if (!qen.d(i6)) {
                                    if (qen.d(i6)) {
                                        b = cn70.b(8);
                                        hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                    } else if (lbs.y(i6)) {
                                        a = dq.a(4.5f, 0.5f);
                                        b = (int) a;
                                        hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                    }
                                }
                                b = 0;
                                hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                            } else if (lbs.u(i8)) {
                                if (i6 == 302) {
                                    b = cn70.b(0);
                                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                                }
                                b = 0;
                                hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                            } else {
                                if (!lbs.w(i8)) {
                                    if (!lbs.x(i8)) {
                                        qenVar.getClass();
                                        if (i8 != 75) {
                                            if (!qen.e(i8)) {
                                                if (i8 != 187) {
                                                    switch (i8) {
                                                        case 1:
                                                            b = pl60.c(i6);
                                                            break;
                                                        case 7:
                                                            if (!lbs.y(i6)) {
                                                                if (!qen.d(i6)) {
                                                                    if (qen.d(i6)) {
                                                                        b = cn70.b(4);
                                                                        break;
                                                                    }
                                                                    b = 0;
                                                                    break;
                                                                } else {
                                                                    b2 = cn70.b(4);
                                                                    b = -b2;
                                                                    break;
                                                                }
                                                            } else {
                                                                a = dq.a(1.5f, 0.5f);
                                                                b = (int) a;
                                                                break;
                                                            }
                                                        case 18:
                                                            if (i6 != 1) {
                                                                b = pl60.c(i6);
                                                                break;
                                                            } else {
                                                                b = cn70.b(0);
                                                                break;
                                                            }
                                                        case 40:
                                                            if (!lbs.y(i6)) {
                                                                if (!qen.d(i6)) {
                                                                    if (qen.d(i6)) {
                                                                        b = cn70.b(-4);
                                                                        break;
                                                                    }
                                                                    b = 0;
                                                                    break;
                                                                } else {
                                                                    b = cn70.b(-12);
                                                                    break;
                                                                }
                                                            } else {
                                                                a2 = dq.a(7.5f, 0.5f);
                                                                b2 = (int) a2;
                                                                b = -b2;
                                                                break;
                                                            }
                                                        case 48:
                                                            if (lbs.y(i6)) {
                                                                a2 = dq.a(3.5f, 0.5f);
                                                                b2 = (int) a2;
                                                                b = -b2;
                                                                break;
                                                            }
                                                            b = 0;
                                                            break;
                                                        case 60:
                                                        case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                                            if (i6 == 1) {
                                                                b = cn70.b(-1);
                                                                break;
                                                            }
                                                            b = 0;
                                                            break;
                                                        case 65:
                                                            if (i6 == 1) {
                                                                b = cn70.b(-6);
                                                                break;
                                                            } else {
                                                                if (i6 == 60) {
                                                                    b = cn70.b(4);
                                                                    break;
                                                                }
                                                                b = 0;
                                                                break;
                                                            }
                                                        case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                                                            if (!pl60.b(i6)) {
                                                                if (pl60.a(i6)) {
                                                                    b = cn70.b(4);
                                                                    break;
                                                                }
                                                                b = 0;
                                                                break;
                                                            } else {
                                                                b = cn70.b(4);
                                                                break;
                                                            }
                                                        case 97:
                                                            if (!lbs.v(i6)) {
                                                                if (!lbs.s(i6)) {
                                                                    if (i6 == 124) {
                                                                        b = cn70.b(4);
                                                                        break;
                                                                    }
                                                                    b = 0;
                                                                    break;
                                                                } else {
                                                                    b = cn70.b(4);
                                                                    break;
                                                                }
                                                            } else {
                                                                b = cn70.b(4);
                                                                break;
                                                            }
                                                        case 356:
                                                            if (!qen.d(i6)) {
                                                                if (!qen.d(i6)) {
                                                                    if (qen.e(i6)) {
                                                                        b = cn70.b(4);
                                                                        break;
                                                                    }
                                                                    b = 0;
                                                                    break;
                                                                } else {
                                                                    b = cn70.b(-4);
                                                                    break;
                                                                }
                                                            } else {
                                                                b = cn70.b(-4);
                                                                break;
                                                            }
                                                        default:
                                                            b = 0;
                                                            break;
                                                    }
                                                } else {
                                                    if (qen.d(i6)) {
                                                        b2 = cn70.b(12);
                                                        b = -b2;
                                                    }
                                                    b = 0;
                                                }
                                            } else if (qen.d(i6)) {
                                                b2 = cn70.b(4);
                                                b = -b2;
                                            } else {
                                                if (lbs.y(i6)) {
                                                    a = dq.a(0.5f, 0.5f);
                                                    b = (int) a;
                                                }
                                                b = 0;
                                            }
                                        } else {
                                            int i13 = pl60.e;
                                            b = qen.e(i6) ? (i11 - i13) - i10 : qen.d(i6) ? (pl60.i - i13) - pl60.h : 0;
                                        }
                                    } else {
                                        b = pl60Var.d(i6);
                                    }
                                } else {
                                    b = pl60Var.d(i6);
                                }
                                hashMap.put(Integer.valueOf(i12), Integer.valueOf(b));
                            }
                        }
                        i4 = 2;
                        b = 0;
                    }
                }
                ol60 ol60Var5 = (ol60) j5g.b0(intValue + 1, list2);
                valueOf = ol60Var5 == null ? Integer.valueOf(ol60Var5.b) : null;
                valueOf2 = ol60Var5 == null ? Integer.valueOf(ol60Var5.e) : null;
                if (valueOf2 != null || (valueOf2.intValue() & 2) == i4) {
                    int i14 = list2.get(intValue).b;
                    b3 = ((i14 != 60 || i14 == 65) ? cn70.b(24) : i14 != 189 ? (i14 == 1101 || i14 == 1107 || i14 == 1109 || i14 == 1112 || i14 == 1114) ? i3 : cn70.b(14) : cn70.b(i2)) - ((valueOf != null && valueOf.intValue() == 202) ? pl60.k : i3);
                } else {
                    b3 = i3;
                }
                long j3 = ((short) i) & 65535;
                j = ((((short) b) & 65535) << 48) | ((((short) b3) & 65535) << 32) | (j3 << i2) | j3;
            }
            i = 0;
            HashSet hashSet2 = pl60.d;
            ol60Var2 = (ol60) j5g.b0(intValue - 1, list2);
            if (ol60Var2 != null) {
            }
            ol60 ol60Var52 = (ol60) j5g.b0(intValue + 1, list2);
            if (ol60Var52 == null) {
            }
            if (ol60Var52 == null) {
            }
            if (valueOf2 != null) {
            }
            int i142 = list2.get(intValue).b;
            if (valueOf != null) {
                b3 = ((i142 != 60 || i142 == 65) ? cn70.b(24) : i142 != 189 ? (i142 == 1101 || i142 == 1107 || i142 == 1109 || i142 == 1112 || i142 == 1114) ? i3 : cn70.b(14) : cn70.b(i2)) - ((valueOf != null && valueOf.intValue() == 202) ? pl60.k : i3);
                long j32 = ((short) i) & 65535;
                j = ((((short) b) & 65535) << 48) | ((((short) b3) & 65535) << 32) | (j32 << i2) | j32;
            }
            b3 = ((i142 != 60 || i142 == 65) ? cn70.b(24) : i142 != 189 ? (i142 == 1101 || i142 == 1107 || i142 == 1109 || i142 == 1112 || i142 == 1114) ? i3 : cn70.b(14) : cn70.b(i2)) - ((valueOf != null && valueOf.intValue() == 202) ? pl60.k : i3);
            long j322 = ((short) i) & 65535;
            j = ((((short) b) & 65535) << 48) | ((((short) b3) & 65535) << 32) | (j322 << i2) | j322;
        }
        return new nl60(j);
    }

    public /* synthetic */ zyp0() {
        this(new pl60(false));
    }
}
