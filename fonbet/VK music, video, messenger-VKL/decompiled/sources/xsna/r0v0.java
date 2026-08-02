package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: VkImage.kt */
/* loaded from: classes17.dex */
public final class r0v0 {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(lg90 lg90Var, q630 q630Var, dt1 dt1Var, wkj wkjVar, float f, d6g d6gVar, SemanticsConfiguration semanticsConfiguration, String str, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        dt1 dt1Var2;
        int i5;
        wkj wkjVar2;
        int i6;
        float f2;
        int i7;
        d6g d6gVar2;
        int i8;
        int i9;
        int i10;
        String str2;
        q630 q630Var3;
        dt1 dt1Var3;
        androidx.compose.runtime.a aVar2;
        wkj wkjVar3;
        float f3;
        d6g d6gVar3;
        SemanticsConfiguration semanticsConfiguration2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(895563574);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                dt1Var2 = dt1Var;
                i3 |= M.J(dt1Var2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    wkjVar2 = wkjVar;
                    i3 |= M.J(wkjVar2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f2 = f;
                        i3 |= M.n(f2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            d6gVar2 = d6gVar;
                            i3 |= M.J(d6gVar2) ? 131072 : 65536;
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= M.J(semanticsConfiguration) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                            }
                            i9 = i2 & 128;
                            if (i9 == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i10 = i9;
                                i3 |= M.J(str) ? 8388608 : 4194304;
                                if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
                                    q630.a aVar3 = q630.a.a;
                                    q630 q630Var4 = i11 != 0 ? aVar3 : q630Var2;
                                    if (i4 != 0) {
                                        dt1.a.getClass();
                                        dt1Var3 = dt1.a.f;
                                    } else {
                                        dt1Var3 = dt1Var2;
                                    }
                                    wkjVar3 = i5 != 0 ? wkj.a.b : wkjVar2;
                                    if (i6 != 0) {
                                        f2 = 1.0f;
                                    }
                                    String str3 = null;
                                    d6gVar3 = i7 == 0 ? d6gVar2 : null;
                                    SemanticsConfiguration semanticsConfiguration3 = i8 != 0 ? null : semanticsConfiguration;
                                    if (i10 == 0) {
                                        str3 = str;
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(895563574, i3, -1, "com.vk.core.compose.component.image.VkImage (VkImage.kt:32)");
                                    }
                                    q630 d = txj0.d(q630Var4, 1.0f);
                                    if (semanticsConfiguration3 != null) {
                                        d = d.g(com.vk.core.compose.component.semantics.b.b(aVar3, semanticsConfiguration3));
                                    }
                                    int i12 = (i3 & 14) | 8 | ((i3 >> 18) & 112);
                                    int i13 = i3 << 3;
                                    int i14 = i12 | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (i13 & 3670016);
                                    q630 q630Var5 = d;
                                    f3 = f2;
                                    q630 q630Var6 = q630Var4;
                                    String str4 = str3;
                                    vjw.a(lg90Var, str4, q630Var5, dt1Var3, wkjVar3, f3, d6gVar3, M, i14, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    str2 = str4;
                                    aVar2 = M;
                                    semanticsConfiguration2 = semanticsConfiguration3;
                                    q630Var3 = q630Var6;
                                } else {
                                    M.h();
                                    str2 = str;
                                    q630Var3 = q630Var2;
                                    dt1Var3 = dt1Var2;
                                    aVar2 = M;
                                    wkjVar3 = wkjVar2;
                                    f3 = f2;
                                    d6gVar3 = d6gVar2;
                                    semanticsConfiguration2 = semanticsConfiguration;
                                }
                                s = aVar2.s();
                                if (s != null) {
                                    s.d = new jgx(lg90Var, q630Var3, dt1Var3, wkjVar3, f3, d6gVar3, semanticsConfiguration2, str2, i, i2);
                                    return;
                                }
                                return;
                            }
                            i10 = i9;
                            if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
                            }
                            s = aVar2.s();
                            if (s != null) {
                            }
                        }
                        d6gVar2 = d6gVar;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        i9 = i2 & 128;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
                        }
                        s = aVar2.s();
                        if (s != null) {
                        }
                    }
                    f2 = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    d6gVar2 = d6gVar;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                wkjVar2 = wkjVar;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f2 = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                d6gVar2 = d6gVar;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            dt1Var2 = dt1Var;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            wkjVar2 = wkjVar;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f2 = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            d6gVar2 = d6gVar;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        dt1Var2 = dt1Var;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        wkjVar2 = wkjVar;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        d6gVar2 = d6gVar;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
