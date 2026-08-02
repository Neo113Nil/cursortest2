package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.commons.http.Http;

/* compiled from: PostDisplayItemsOffsetCalculator.kt */
/* loaded from: classes.dex */
public final class k2c0 {
    public static final HashMap<Integer, Integer> b = new HashMap<>();
    public static final HashSet c = izi0.d(78, Integer.valueOf(PsExtractor.AUDIO_STREAM), 194, 193, 238, 50, 52, 53, 11, 110, 111, 302, 331, 181, 329, 330, 350, 2, 37, 178, 372, 5, Integer.valueOf(PsExtractor.PRIVATE_STREAM_1), 51, 59, 353, Integer.valueOf(Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE), Integer.valueOf(Http.StatusCode.SEE_OTHER), 41, 70, 96, 45, 46, 148, 81, 42, 97, 7, 48, 40, 1, 73, 341, Integer.valueOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), 297, 343, 348, 365, 202, 60, 65, 203, 204, 205, 352, 206, 207, Integer.valueOf(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE), 258, 257, Integer.valueOf(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE), Integer.valueOf(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE), Integer.valueOf(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE), Integer.valueOf(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE), Integer.valueOf(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE), 344, 345, 293, Integer.valueOf(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE), 211, 75, 187);
    public static final int d = cn70.b(6);
    public static final int e = cn70.b(4);
    public static final int f = cn70.b(12);
    public static final int g = cn70.b(12);
    public static final int h = cn70.b(12);
    public static final int i = cn70.b(6);
    public static final int j = cn70.b(8);
    public final qen a = new qen();

    public static int a(int i2, List list) {
        u1c0 u1c0Var = (u1c0) j5g.b0(i2 + 1, list);
        Integer valueOf = u1c0Var != null ? Integer.valueOf(u1c0Var.d) : null;
        if (valueOf != null && (valueOf.intValue() & 2) != 2) {
            return 0;
        }
        int f2 = ((u1c0) list.get(i2)).f();
        return f2 == 189 ? cn70.b(16) : (f2 == 60 || f2 == 65) ? cn70.b(24) : f2 != 1123 ? cn70.b(14) : cn70.b(0);
    }

    public static boolean c(int i2) {
        if (i2 == 238 || i2 == 297 || i2 == 343 || i2 == 348 || i2 == 365) {
            return true;
        }
        switch (i2) {
            case PsExtractor.AUDIO_STREAM /* 192 */:
            case 193:
            case 194:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(int i2) {
        return i2 == 342 || i2 == 346 || i2 == 357;
    }

    public static int e(int i2) {
        if (lbs.y(i2)) {
            return cn70.b(-5);
        }
        if (lbs.v(i2)) {
            return (int) dq.a(-2.5f, 0.5f);
        }
        if (lbs.s(i2)) {
            return (int) dq.a(-2.5f, 0.5f);
        }
        if (lbs.z(i2)) {
            return cn70.b(-2);
        }
        if (lbs.w(i2)) {
            return (int) dq.a(-2.5f, 0.5f);
        }
        if (lbs.x(i2)) {
            return cn70.b(-10);
        }
        if (c(i2)) {
            return cn70.b(-2);
        }
        if (lbs.A(i2)) {
            return cn70.b(-2);
        }
        if (lbs.u(i2)) {
            return cn70.b(-2);
        }
        if (i2 != 7) {
            if (i2 == 18) {
                return cn70.b(-10);
            }
            if (i2 == 26 || i2 == 40) {
                return cn70.b(-4);
            }
            if (i2 != 48) {
                if (i2 == 78) {
                    return cn70.b(-1);
                }
                if (i2 != 97) {
                    if (i2 == 124 || i2 == 187) {
                        return cn70.b(-6);
                    }
                    if (i2 != 231) {
                        return 0;
                    }
                    return cn70.b(-2);
                }
            }
        }
        return cn70.b(-2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        if (xsna.qen.e(r9) != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(int i2, List list, boolean z) {
        int b2;
        float a;
        int b3;
        int b4;
        float a2;
        int i3 = j;
        HashSet hashSet = c;
        if (i2 == 0) {
            int f2 = ((u1c0) list.get(i2)).f();
            if (hashSet.contains(Integer.valueOf(f2)) && f2 == 202) {
                return -i3;
            }
        } else {
            u1c0 u1c0Var = (u1c0) j5g.b0(i2 - 1, list);
            if (u1c0Var != null) {
                int f3 = u1c0Var.f();
                int i4 = u1c0Var.d;
                u1c0 u1c0Var2 = (u1c0) list.get(i2);
                int f4 = u1c0Var2.f();
                int i5 = u1c0Var2.d;
                if (i4 == 4 && i5 == 2) {
                    if (hashSet.contains(Integer.valueOf(f4))) {
                        boolean z2 = f4 == 302 || f4 == 331;
                        boolean z3 = f4 == 202;
                        if (z2 && f3 == 317) {
                            return cn70.b(4);
                        }
                        if (z3) {
                            return -i3;
                        }
                    }
                } else if (hashSet.contains(Integer.valueOf(f3)) || hashSet.contains(Integer.valueOf(f4))) {
                    int i6 = (f4 << 16) | (65535 & f3);
                    Integer valueOf = Integer.valueOf(i6);
                    HashMap<Integer, Integer> hashMap = b;
                    if (!hashMap.containsKey(valueOf)) {
                        boolean s = lbs.s(f4);
                        int i7 = e;
                        int i8 = f;
                        qen qenVar = this.a;
                        if (!s) {
                            if (!c(f4)) {
                                if (!d(f4)) {
                                    if (!lbs.y(f4)) {
                                        if (!lbs.t(f4) && !lbs.p(f4)) {
                                            if (!lbs.v(f4)) {
                                                if (!lbs.z(f4)) {
                                                    if (!lbs.A(f4)) {
                                                        if (!lbs.u(f4)) {
                                                            if (!lbs.w(f4)) {
                                                                if (!lbs.x(f4)) {
                                                                    qenVar.getClass();
                                                                    if (f4 != 75) {
                                                                        if (!qen.e(f4)) {
                                                                            if (f4 != 187) {
                                                                                switch (f4) {
                                                                                    case 1:
                                                                                        b2 = e(f3);
                                                                                        break;
                                                                                    case 7:
                                                                                        if (!lbs.y(f3)) {
                                                                                            if (!qen.d(f3)) {
                                                                                                if (qen.d(f3)) {
                                                                                                    b2 = cn70.b(4);
                                                                                                    break;
                                                                                                }
                                                                                                b2 = 0;
                                                                                                break;
                                                                                            } else {
                                                                                                b3 = cn70.b(4);
                                                                                                b2 = -b3;
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            a = dq.a(1.5f, 0.5f);
                                                                                            b2 = (int) a;
                                                                                            break;
                                                                                        }
                                                                                    case 18:
                                                                                        b4 = f3 == 1 ? cn70.b(0) : e(f3);
                                                                                        b2 = b4;
                                                                                        break;
                                                                                    case 40:
                                                                                        if (!lbs.y(f3)) {
                                                                                            if (!qen.d(f3)) {
                                                                                                if (qen.d(f3)) {
                                                                                                    b2 = cn70.b(-4);
                                                                                                    break;
                                                                                                }
                                                                                                b2 = 0;
                                                                                                break;
                                                                                            } else {
                                                                                                b2 = cn70.b(-12);
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            a2 = dq.a(7.5f, 0.5f);
                                                                                            b3 = (int) a2;
                                                                                            b2 = -b3;
                                                                                            break;
                                                                                        }
                                                                                    case 48:
                                                                                        if (lbs.y(f3)) {
                                                                                            a2 = dq.a(3.5f, 0.5f);
                                                                                            b3 = (int) a2;
                                                                                            b2 = -b3;
                                                                                            break;
                                                                                        }
                                                                                        b2 = 0;
                                                                                        break;
                                                                                    case 60:
                                                                                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                                                                        if (f3 == 1) {
                                                                                            b2 = cn70.b(-1);
                                                                                            break;
                                                                                        }
                                                                                        b2 = 0;
                                                                                        break;
                                                                                    case 65:
                                                                                        if (f3 == 1) {
                                                                                            b2 = cn70.b(-6);
                                                                                            break;
                                                                                        } else {
                                                                                            if (f3 == 60) {
                                                                                                b2 = cn70.b(4);
                                                                                                break;
                                                                                            }
                                                                                            b2 = 0;
                                                                                            break;
                                                                                        }
                                                                                    case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                                                                                        if (!d(f3)) {
                                                                                            if (c(f3)) {
                                                                                                b2 = cn70.b(4);
                                                                                                break;
                                                                                            }
                                                                                            b2 = 0;
                                                                                            break;
                                                                                        } else {
                                                                                            b2 = cn70.b(4);
                                                                                            break;
                                                                                        }
                                                                                    case 97:
                                                                                        if (!lbs.v(f3)) {
                                                                                            if (!lbs.s(f3)) {
                                                                                                if (f3 == 124) {
                                                                                                    b2 = cn70.b(4);
                                                                                                    break;
                                                                                                }
                                                                                                b2 = 0;
                                                                                                break;
                                                                                            } else {
                                                                                                b2 = cn70.b(4);
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            b2 = cn70.b(4);
                                                                                            break;
                                                                                        }
                                                                                    case 356:
                                                                                        if (!qen.d(f3)) {
                                                                                            if (!qen.d(f3)) {
                                                                                                if (qen.e(f3)) {
                                                                                                    b2 = cn70.b(4);
                                                                                                    break;
                                                                                                }
                                                                                                b2 = 0;
                                                                                                break;
                                                                                            } else {
                                                                                                b2 = cn70.b(-4);
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            b2 = cn70.b(-4);
                                                                                            break;
                                                                                        }
                                                                                    default:
                                                                                        b2 = 0;
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                if (qen.d(f3)) {
                                                                                    b3 = cn70.b(12);
                                                                                    b2 = -b3;
                                                                                }
                                                                                b2 = 0;
                                                                            }
                                                                        } else if (qen.d(f3)) {
                                                                            b3 = cn70.b(4);
                                                                            b2 = -b3;
                                                                        } else {
                                                                            if (lbs.y(f3)) {
                                                                                a = dq.a(0.5f, 0.5f);
                                                                                b2 = (int) a;
                                                                            }
                                                                            b2 = 0;
                                                                        }
                                                                    } else {
                                                                        boolean e2 = qen.e(f3);
                                                                        int i9 = d;
                                                                        if (e2) {
                                                                            i8 -= i9;
                                                                            b2 = i8 - i7;
                                                                        } else {
                                                                            if (qen.d(f3)) {
                                                                                b2 = (h - i9) - g;
                                                                            }
                                                                            b2 = 0;
                                                                        }
                                                                    }
                                                                } else {
                                                                    b2 = f(f3);
                                                                }
                                                            } else {
                                                                b2 = f(f3);
                                                            }
                                                        } else {
                                                            if (f3 == 302) {
                                                                b2 = cn70.b(0);
                                                            }
                                                            b2 = 0;
                                                        }
                                                    } else {
                                                        qenVar.getClass();
                                                        if (!qen.d(f3)) {
                                                            if (qen.d(f3)) {
                                                                b2 = cn70.b(8);
                                                            } else if (lbs.y(f3)) {
                                                                a = dq.a(4.5f, 0.5f);
                                                                b2 = (int) a;
                                                            }
                                                        }
                                                        b2 = 0;
                                                    }
                                                } else {
                                                    qenVar.getClass();
                                                    if (qen.d(f3)) {
                                                        b3 = cn70.b(4);
                                                        b2 = -b3;
                                                    } else if (qen.d(f3)) {
                                                        b2 = cn70.b(4);
                                                    } else {
                                                        if (lbs.y(f3)) {
                                                            a = dq.a(0.5f, 0.5f);
                                                            b2 = (int) a;
                                                        }
                                                        b2 = 0;
                                                    }
                                                }
                                            } else {
                                                qenVar.getClass();
                                                if (qen.d(f3)) {
                                                    b3 = cn70.b(6);
                                                    b2 = -b3;
                                                } else if (qen.d(f3)) {
                                                    b2 = cn70.b(2);
                                                } else {
                                                    if (lbs.y(f3)) {
                                                        a2 = dq.a(0.5f, 0.5f);
                                                    } else if (lbs.t(f3) || lbs.p(f3)) {
                                                        a2 = dq.a(2.5f, 0.5f);
                                                    } else {
                                                        if (qen.e(f3)) {
                                                            b2 = (i8 - i7) - i;
                                                        }
                                                        b2 = 0;
                                                    }
                                                    b3 = (int) a2;
                                                    b2 = -b3;
                                                }
                                            }
                                        } else {
                                            qenVar.getClass();
                                            if (qen.d(f3)) {
                                                a = dq.a(-7.5f, 0.5f);
                                                b2 = (int) a;
                                            } else if (qen.d(f3)) {
                                                b2 = cn70.b(-5);
                                            } else if (qen.b(f3)) {
                                                b2 = cn70.b(-2);
                                            } else if (f3 == 15) {
                                                b2 = cn70.b(-12);
                                            } else {
                                                if (f3 != 369) {
                                                    if (f3 == 301) {
                                                        b2 = cn70.b(-8);
                                                    } else if (f3 == 14 || f3 == 317) {
                                                        b2 = cn70.b(4);
                                                    } else if (f3 == 340) {
                                                        b2 = cn70.b(4);
                                                    }
                                                }
                                                b2 = 0;
                                            }
                                        }
                                    } else {
                                        qenVar.getClass();
                                        if (qen.d(f3)) {
                                            a = dq.a(-7.0f, 0.5f);
                                        } else if (qen.d(f3)) {
                                            b2 = cn70.b(-5);
                                        } else if (qen.e(f3)) {
                                            a = dq.a(1.5f, 0.5f);
                                        } else if (qen.b(f3)) {
                                            b2 = cn70.b(-2);
                                        } else if (f3 == 15) {
                                            b2 = cn70.b(-12);
                                        } else {
                                            if (f3 != 369) {
                                                if (f3 == 46) {
                                                    b2 = cn70.b(-8);
                                                } else if (f3 == 268 || f3 == 269) {
                                                    b2 = cn70.b(-8);
                                                } else if (f3 != 149) {
                                                    if (qen.c(f3)) {
                                                        b2 = cn70.b(-8);
                                                    } else if (f3 == 70 || f3 == 96) {
                                                        b2 = cn70.b(-8);
                                                    } else if (f3 == 45) {
                                                        b2 = cn70.b(-8);
                                                    } else if (f3 == 80) {
                                                        b2 = cn70.b(-2);
                                                    } else if (f3 == 329) {
                                                        a = dq.a(4.5f, 0.5f);
                                                    } else if (f3 == 330) {
                                                        a = dq.a(1.5f, 0.5f);
                                                    } else if (f3 == 356) {
                                                        a2 = cn70.a() * 1.5f;
                                                        b3 = (int) a2;
                                                        b2 = -b3;
                                                    }
                                                }
                                            }
                                            b2 = 0;
                                        }
                                        b2 = (int) a;
                                    }
                                } else if (f4 != 342) {
                                    if (f4 != 346) {
                                        if (f4 == 357) {
                                            if (z) {
                                                b4 = cn70.b(-64);
                                            } else {
                                                if (z) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                b4 = cn70.b(-94);
                                            }
                                        }
                                        b2 = 0;
                                    } else if (z) {
                                        b4 = cn70.b(-64);
                                    } else {
                                        if (z) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        b4 = cn70.b(-94);
                                    }
                                    b2 = b4;
                                } else if (z) {
                                    b2 = cn70.b(-52);
                                } else {
                                    if (z) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    b2 = cn70.b(-46);
                                }
                            } else if (lbs.y(f3)) {
                                a = dq.a(0.5f, 0.5f);
                                b2 = (int) a;
                            } else if (lbs.v(f3)) {
                                b2 = cn70.b(8);
                            } else if (lbs.z(f3)) {
                                b2 = cn70.b(8);
                            } else if (lbs.s(f3)) {
                                b2 = cn70.b(8);
                            } else if (lbs.n(f3)) {
                                b2 = cn70.b(8);
                            } else if (f3 == 194) {
                                b2 = cn70.b(0);
                            } else if (c(f3)) {
                                b2 = cn70.b(4);
                            } else if (d(f3)) {
                                b2 = cn70.b(6);
                            } else if (f3 != 7) {
                                if (f3 == 124) {
                                    b2 = cn70.b(4);
                                }
                                b2 = 0;
                            } else {
                                b2 = cn70.b(8);
                            }
                        } else if (lbs.y(f3)) {
                            a = dq.a(5.5f, 0.5f);
                            b2 = (int) a;
                        } else {
                            qenVar.getClass();
                            if (!qen.d(f3)) {
                                if (qen.d(f3)) {
                                    b2 = cn70.b(8);
                                }
                            }
                            b2 = 0;
                        }
                        hashMap.put(Integer.valueOf(i6), Integer.valueOf(b2));
                        return b2;
                    }
                    Integer num = hashMap.get(Integer.valueOf(i6));
                    if (num != null) {
                        return num.intValue();
                    }
                }
            }
        }
        return 0;
    }

    public final int f(int i2) {
        if (lbs.y(i2)) {
            return -((int) dq.a(2.5f, 0.5f));
        }
        this.a.getClass();
        if (qen.d(i2)) {
            return cn70.b(-8);
        }
        return 0;
    }
}
