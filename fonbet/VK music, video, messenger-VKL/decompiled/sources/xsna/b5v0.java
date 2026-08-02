package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.WeakHashMap;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yqx0;

/* compiled from: VkModalCardBottomSheet.kt */
/* loaded from: classes17.dex */
public final class b5v0 {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b4  */
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
        int i9;
        int i10;
        int i11;
        int i12;
        androidx.compose.runtime.a aVar2;
        final oy20 oy20Var2;
        final boolean z3;
        final q630 q630Var3;
        final qy20 qy20Var3;
        final py20 py20Var3;
        final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar3;
        final boolean z4;
        final SemanticsConfiguration semanticsConfiguration2;
        androidx.compose.runtime.f s;
        SemanticsConfiguration semanticsConfiguration3;
        androidx.compose.runtime.a M = aVar.M(83339359);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
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
                        } else if ((i & 1572864) == 0) {
                            i3 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
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
                                    if (i13 != 0) {
                                        q630Var2 = q630.a.a;
                                    }
                                    if (i4 != 0) {
                                        qy20Var2 = null;
                                    }
                                    if (i5 != 0) {
                                        py20Var2 = null;
                                    }
                                    if (i6 != 0) {
                                        wzsVar2 = null;
                                    }
                                    oy20 oy20Var3 = i7 != 0 ? null : oy20Var;
                                    boolean z5 = i8 != 0 ? true : z;
                                    boolean z6 = i10 != 0 ? true : z2;
                                    SemanticsConfiguration semanticsConfiguration4 = i12 == 0 ? semanticsConfiguration : null;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(83339359, i3, -1, "com.vk.core.compose.component.modal.card.VkModalCardBottomSheet (VkModalCardBottomSheet.kt:44)");
                                    }
                                    if (oq.h(270465219, M)) {
                                        semanticsConfiguration3 = semanticsConfiguration4;
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    } else {
                                        semanticsConfiguration3 = semanticsConfiguration4;
                                    }
                                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    final oy20 oy20Var4 = oy20Var3;
                                    final SemanticsConfiguration semanticsConfiguration5 = semanticsConfiguration3;
                                    final boolean z7 = z5;
                                    final qy20 qy20Var4 = qy20Var2;
                                    final boolean z8 = z6;
                                    final py20 py20Var4 = py20Var2;
                                    final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar4 = wzsVar2;
                                    oy20Var2 = oy20Var4;
                                    aVar2 = M;
                                    sx20.a(gzsVar, txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, uy20.c, 1, q630Var2), sx20.f(6, 2, M), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, ylu0Var.d().a, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, dz5.c, null, null, kai.c(1154399681, new yzs() { // from class: xsna.z4v0
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1154399681, intValue, -1, "com.vk.core.compose.component.modal.card.VkModalCardBottomSheet.<anonymous> (VkModalCardBottomSheet.kt:77)");
                                                }
                                                a.m mVar = androidx.compose.foundation.layout.a.c;
                                                dt1.a.getClass();
                                                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                                                int hashCode = Long.hashCode(n34.n(aVar3));
                                                sy90 D = aVar3.D();
                                                q630.a aVar4 = q630.a.a;
                                                q630 c = qri.c(aVar3, aVar4);
                                                cri.h7.getClass();
                                                LayoutNode.a aVar5 = cri.a.b;
                                                if (aVar3.N() == null) {
                                                    n34.r();
                                                    throw null;
                                                }
                                                aVar3.H();
                                                if (aVar3.L()) {
                                                    aVar3.I(aVar5);
                                                } else {
                                                    aVar3.f();
                                                }
                                                k9q0.w(aVar3, a, cri.a.f);
                                                k9q0.w(aVar3, D, cri.a.e);
                                                k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                                k9q0.t(aVar3, cri.a.h);
                                                k9q0.w(aVar3, c, cri.a.d);
                                                q630 D2 = s200.D(aVar4, kqu0.t);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                }
                                                ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                                e5v0.a(gzs.this, hr80.m(D2, ylu0Var2.getBackground().r, vog0.b(kqu0.f)), qy20Var4, py20Var4, wzsVar4, oy20Var4, z7, z8, semanticsConfiguration5, aVar3, 0, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1596175702, 6, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:176)");
                                                }
                                                WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                                                te2 te2Var = yqx0.a.c(aVar3).e;
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                                f9t.e(pli.x(te2Var), aVar3, 0);
                                                aVar3.G();
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar3.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, M), aVar2, i3 & 14);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    q630Var3 = q630Var2;
                                    qy20Var3 = qy20Var2;
                                    z4 = z7;
                                    py20Var3 = py20Var2;
                                    z3 = z8;
                                    semanticsConfiguration2 = semanticsConfiguration5;
                                    wzsVar3 = wzsVar4;
                                } else {
                                    aVar2 = M;
                                    aVar2.h();
                                    oy20Var2 = oy20Var;
                                    z3 = z2;
                                    q630Var3 = q630Var2;
                                    qy20Var3 = qy20Var2;
                                    py20Var3 = py20Var2;
                                    wzsVar3 = wzsVar2;
                                    z4 = z;
                                    semanticsConfiguration2 = semanticsConfiguration;
                                }
                                s = aVar2.s();
                                if (s != null) {
                                    s.d = new wzs() { // from class: xsna.a5v0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            b5v0.a(gzs.this, q630Var3, qy20Var3, py20Var3, wzsVar3, oy20Var2, z4, z3, semanticsConfiguration2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
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
}
