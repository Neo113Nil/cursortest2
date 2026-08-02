package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.oy20;
import xsna.py20;
import xsna.q630;
import xsna.qy20;
import xsna.ty6;

/* compiled from: VkModalCardContent.kt */
/* loaded from: classes17.dex */
public final class e5v0 {
    /* JADX WARN: Removed duplicated region for block: B:121:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final gzs<s3q0> gzsVar, q630 q630Var, qy20 qy20Var, py20 py20Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, oy20 oy20Var, boolean z, boolean z2, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        qy20 qy20Var2;
        int i5;
        py20 py20Var2;
        int i6;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar2;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        androidx.compose.runtime.a aVar2;
        final SemanticsConfiguration semanticsConfiguration2;
        final boolean z4;
        final q630 q630Var3;
        final qy20 qy20Var3;
        final py20 py20Var3;
        final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar3;
        final oy20 oy20Var2;
        final boolean z5;
        androidx.compose.runtime.f s;
        int i13;
        float f;
        int i14;
        u890 u890Var;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar4;
        oy20 oy20Var3;
        int i15;
        androidx.compose.runtime.a M = aVar.M(-1670202433);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                qy20Var2 = qy20Var;
                i3 |= M.J(qy20Var2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    py20Var2 = py20Var;
                    i3 |= M.J(py20Var2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        wzsVar2 = wzsVar;
                        i3 |= M.y(wzsVar2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= M.J(oy20Var) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                            z3 = z;
                        } else {
                            z3 = z;
                            if ((i & 1572864) == 0) {
                                i3 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                            }
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i10 = i9;
                            i3 |= M.l(z2) ? 8388608 : 4194304;
                            i11 = i2 & 256;
                            if (i11 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i12 = i11;
                                i3 |= M.J(semanticsConfiguration) ? 67108864 : 33554432;
                                if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                                    q630.a aVar3 = q630.a.a;
                                    if (i16 != 0) {
                                        q630Var2 = aVar3;
                                    }
                                    if (i4 != 0) {
                                        qy20Var2 = null;
                                    }
                                    py20 py20Var4 = i5 != 0 ? null : py20Var2;
                                    wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar5 = i6 != 0 ? null : wzsVar2;
                                    oy20 oy20Var4 = i7 != 0 ? null : oy20Var;
                                    if (i8 != 0) {
                                        z3 = true;
                                    }
                                    boolean z6 = i10 != 0 ? true : z2;
                                    SemanticsConfiguration semanticsConfiguration3 = i12 != 0 ? null : semanticsConfiguration;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1670202433, i3, -1, "com.vk.core.compose.component.modal.card.VkModalCardContent (VkModalCardContent.kt:70)");
                                    }
                                    float f2 = uy20.a;
                                    float f3 = z3 ? 16 : 0;
                                    qy20.d dVar = qy20Var2 instanceof qy20.d ? (qy20.d) qy20Var2 : null;
                                    if (z3 && (dVar == null || dVar.b())) {
                                        if (dVar != null) {
                                            float f4 = uy20.d;
                                            i13 = i3;
                                            u890Var = s200.n(f4, f4, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                            f = f3;
                                        } else {
                                            i13 = i3;
                                            float f5 = uy20.d;
                                            f = f3;
                                            u890Var = s200.n(f5, kqu0.w, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                        }
                                        i14 = 0;
                                    } else {
                                        i13 = i3;
                                        f = f3;
                                        i14 = 0;
                                        float f6 = 0;
                                        u890Var = new u890(f6, f6, f6, f6);
                                    }
                                    q630 F = s200.F(z3 ? uy20.d : i14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
                                    int i17 = i13 >> 3;
                                    dt1.a.getClass();
                                    cp10 d = ja8.d(dt1.a.b, false);
                                    int hashCode = Long.hashCode(n34.n(M));
                                    sy90 D = M.D();
                                    q630 c = qri.c(M, q630Var2);
                                    cri.h7.getClass();
                                    boolean z7 = z3;
                                    LayoutNode.a aVar4 = cri.a.b;
                                    if (M.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    M.H();
                                    if (M.L()) {
                                        M.I(aVar4);
                                    } else {
                                        M.f();
                                    }
                                    q630 q630Var4 = q630Var2;
                                    cri.a.c cVar = cri.a.f;
                                    k9q0.w(M, d, cVar);
                                    cri.a.e eVar = cri.a.e;
                                    k9q0.w(M, D, eVar);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    cri.a.b bVar = cri.a.g;
                                    k9q0.w(M, valueOf, bVar);
                                    cri.a.C2678a c2678a = cri.a.h;
                                    k9q0.t(M, c2678a);
                                    cri.a.d dVar2 = cri.a.d;
                                    k9q0.w(M, c, dVar2);
                                    SemanticsConfiguration semanticsConfiguration4 = semanticsConfiguration3;
                                    q630 f7 = txj0.f(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7), 1.0f);
                                    ty6.a aVar5 = dt1.a.o;
                                    a.l lVar = androidx.compose.foundation.layout.a.a;
                                    oy20 oy20Var5 = oy20Var4;
                                    wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar6 = wzsVar5;
                                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(uy20.b), aVar5, M, 54);
                                    int hashCode2 = Long.hashCode(n34.n(M));
                                    sy90 D2 = M.D();
                                    q630 c2 = qri.c(M, f7);
                                    if (M.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    M.H();
                                    if (M.L()) {
                                        M.I(aVar4);
                                    } else {
                                        M.f();
                                    }
                                    k9q0.w(M, a, cVar);
                                    k9q0.w(M, D2, eVar);
                                    ur.d(hashCode2, M, bVar, M, c2678a);
                                    k9q0.w(M, c2, dVar2);
                                    if (qy20Var2 == null) {
                                        M.K(642483317);
                                        M.j();
                                    } else {
                                        M.K(-256369396);
                                        qy20.b.a(s200.C(aVar3, u890Var), qy20Var2, M, i17 & 112);
                                        M.j();
                                        s3q0 s3q0Var = s3q0.a;
                                    }
                                    if (py20Var4 == null) {
                                        M.K(642542434);
                                        M.j();
                                    } else {
                                        M.K(-256367489);
                                        py20.b.a(F, py20Var4, M, (i13 >> 6) & 112);
                                        M.j();
                                        s3q0 s3q0Var2 = s3q0.a;
                                    }
                                    if (wzsVar6 == null) {
                                        M.K(642610511);
                                        f9t.e(aVar3, M, 6);
                                        M.j();
                                        wzsVar4 = wzsVar6;
                                    } else {
                                        M.K(642664048);
                                        wzsVar4 = wzsVar6;
                                        wzsVar4.invoke(M, Integer.valueOf((i13 >> 12) & 14));
                                        M.j();
                                    }
                                    if (oy20Var5 == null) {
                                        M.K(642731906);
                                        M.j();
                                        oy20Var3 = oy20Var5;
                                    } else {
                                        M.K(-256361377);
                                        oy20Var3 = oy20Var5;
                                        oy20.c.a(F, oy20Var3, M, (i13 >> 12) & 112);
                                        M.j();
                                        s3q0 s3q0Var3 = s3q0.a;
                                    }
                                    M.G();
                                    if (z6) {
                                        M.K(-1746376364);
                                        if (androidx.compose.runtime.b.d()) {
                                            i15 = 0;
                                            androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                                        } else {
                                            i15 = 0;
                                        }
                                        lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, i15);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, i15, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        semanticsConfiguration2 = semanticsConfiguration4;
                                        nzu0.c(gzsVar, b, d370.N(R.string.vk_modal_close_button_description, 0, M), s200.D(com.vk.core.compose.component.semantics.b.b(ra8.a.b(aVar3, dt1.a.d), semanticsConfiguration2), uy20.a), 44, ylu0Var.getIcon().b, false, null, false, null, null, M, (i13 & 14) | 24640, 1984);
                                        aVar2 = M;
                                    } else {
                                        aVar2 = M;
                                        semanticsConfiguration2 = semanticsConfiguration4;
                                        aVar2.K(-1749893655);
                                    }
                                    aVar2.j();
                                    aVar2.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    wzsVar3 = wzsVar4;
                                    oy20Var2 = oy20Var3;
                                    py20Var3 = py20Var4;
                                    qy20Var3 = qy20Var2;
                                    z5 = z6;
                                    z4 = z7;
                                    q630Var3 = q630Var4;
                                } else {
                                    aVar2 = M;
                                    aVar2.h();
                                    semanticsConfiguration2 = semanticsConfiguration;
                                    z4 = z3;
                                    q630Var3 = q630Var2;
                                    qy20Var3 = qy20Var2;
                                    py20Var3 = py20Var2;
                                    wzsVar3 = wzsVar2;
                                    oy20Var2 = oy20Var;
                                    z5 = z2;
                                }
                                s = aVar2.s();
                                if (s != null) {
                                    s.d = new wzs() { // from class: xsna.d5v0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            e5v0.a(gzs.this, q630Var3, qy20Var3, py20Var3, wzsVar3, oy20Var2, z4, z5, semanticsConfiguration2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                            return s3q0.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            i12 = i11;
                            if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                            }
                            s = aVar2.s();
                            if (s != null) {
                            }
                        }
                        i10 = i9;
                        i11 = i2 & 256;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                        }
                        s = aVar2.s();
                        if (s != null) {
                        }
                    }
                    wzsVar2 = wzsVar;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i2 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                py20Var2 = py20Var;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                wzsVar2 = wzsVar;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i2 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            qy20Var2 = qy20Var;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            py20Var2 = py20Var;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            wzsVar2 = wzsVar;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i2 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        qy20Var2 = qy20Var;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        py20Var2 = py20Var;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        wzsVar2 = wzsVar;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i2 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void b(q630 q630Var, qy20 qy20Var, xy20 xy20Var, jai jaiVar, ty20 ty20Var, androidx.compose.runtime.a aVar, int i, int i2) {
        androidx.compose.runtime.a aVar2;
        if ((i2 & 1) != 0) {
            q630Var = q630.a.a;
        }
        q630 q630Var2 = q630Var;
        jai jaiVar2 = (i2 & 8) != 0 ? null : jaiVar;
        ty20 ty20Var2 = (i2 & 32) != 0 ? null : ty20Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1148729524, i, -1, "com.vk.core.compose.component.modal.card.VkModalCardContent (VkModalCardContent.kt:40)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new u3c0(8);
            aVar2 = aVar;
            aVar2.R(x);
        } else {
            aVar2 = aVar;
        }
        a((gzs) x, q630Var2, qy20Var, xy20Var, jaiVar2, ty20Var2, true, false, null, aVar2, 12582918 | ((i << 3) & 57344), 256);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }
}
