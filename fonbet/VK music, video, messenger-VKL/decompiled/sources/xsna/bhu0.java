package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.button.DropdownButton$Appearance;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.NetError;
import ru.ok.gl.tf.Tensorflow;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkButton.kt */
/* loaded from: classes17.dex */
public final class bhu0 {

    /* compiled from: VkButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DropdownButton$Appearance.values().length];
            try {
                iArr[DropdownButton$Appearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DropdownButton$Appearance.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final spg0 spg0Var, final ButtonSize buttonSize, final ButtonStyle buttonStyle, final ButtonAppearance buttonAppearance, final lgu0 lgu0Var, final boolean z, final cp8 cp8Var, final cp8 cp8Var2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1558083213);
        if ((i & 48) == 0) {
            i2 = (M.o(buttonSize.ordinal()) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(buttonStyle.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.o(buttonAppearance.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(lgu0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(cp8Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.J(cp8Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.J(null) ? 67108864 : 33554432;
        }
        if (M.t(i2 & 1, (38347921 & i2) != 38347920)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1558083213, i2, -1, "com.vk.core.compose.component.ButtonContent (VkButton.kt:402)");
            }
            if (cp8Var != null) {
                cp8Var.b(buttonSize, buttonStyle, buttonAppearance, z);
            }
            if (cp8Var2 != null) {
                cp8Var2.b(buttonSize, buttonStyle, buttonAppearance, z);
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            hr80.z().getClass();
            op8.h();
            float f = kqu0.s;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.o), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (cp8Var != null) {
                M.K(603149649);
                cp8Var.a(lgu0Var, M, ((i2 >> 9) & 112) | 390);
            } else {
                M.K(588191219);
            }
            M.j();
            if (cp8Var2 != null) {
                M.K(603243889);
                cp8Var2.a(lgu0Var, M, ((i2 >> 9) & 112) | 390);
            } else {
                M.K(588191219);
            }
            M.j();
            M.K(588191219);
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rgu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bhu0.a(spg0.this, buttonSize, buttonStyle, buttonAppearance, lgu0Var, z, cp8Var, cp8Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final ButtonSize buttonSize, final ButtonStyle buttonStyle, final ButtonAppearance buttonAppearance, final lgu0 lgu0Var, final boolean z, final boolean z2, final boolean z3, final lg90 lg90Var, final l5g l5gVar, final pco pcoVar, String str, final Integer num, final lg90 lg90Var2, final l5g l5gVar2, final pco pcoVar2, androidx.compose.runtime.a aVar, final int i) {
        String str2;
        androidx.compose.runtime.a aVar2;
        uco ucoVar;
        int i2;
        int i3;
        uco ucoVar2;
        uco ucoVar3;
        uco ucoVar4;
        androidx.compose.runtime.a M = aVar.M(1678359466);
        int i4 = (M.o(buttonAppearance.ordinal()) ? 256 : 128) | i | (M.o(buttonSize.ordinal()) ? 4 : 2) | (M.o(buttonStyle.ordinal()) ? 32 : 16) | (M.J(lgu0Var) ? 2048 : 1024) | (M.l(z) ? 16384 : 8192) | (M.J(null) ? 131072 : 65536) | (M.l(z2) ? 1048576 : 524288) | (M.l(z3) ? 8388608 : 4194304) | (M.y(lg90Var) ? 67108864 : 33554432) | (M.J(l5gVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i5 = 4096 | (M.J(pcoVar) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.J(num) ? 256 : 128) | (M.y(lg90Var2) ? 2048 : 1024) | (M.J(l5gVar2) ? 16384 : 8192) | (M.J(pcoVar2) ? 131072 : 65536) | (M.J(null) ? 1048576 : 524288);
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (599187 & i5) == 599186) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1678359466, i4, i5, "com.vk.core.compose.component.ButtonContent (VkButton.kt:447)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            hr80.z().getClass();
            op8.h();
            float f = kqu0.s;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.o), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (z2) {
                M.K(1638402062);
                ucoVar = null;
                m2e0 a3 = cp8.c.a.a(null, null, null, M, 24576, 15);
                M = M;
                a3.b(buttonSize, buttonStyle, buttonAppearance, z);
                a3.a(lgu0Var, M, ((i4 >> 6) & 112) | 390);
                s3q0 s3q0Var = s3q0.a;
            } else {
                ucoVar = null;
                M.K(1622286836);
            }
            M.j();
            if (z3 && z2) {
                M.K(1622286836);
                M.j();
                str2 = str;
                aVar2 = M;
            } else {
                M.K(1638676722);
                if (lg90Var != null) {
                    M.K(1638681155);
                    if (pcoVar != null) {
                        float f2 = pcoVar.b;
                        i2 = 390;
                        ucoVar4 = new uco(byc0.b(f2, f2));
                    } else {
                        i2 = 390;
                        ucoVar4 = ucoVar;
                    }
                    int i6 = i4 >> 24;
                    int i7 = (i6 & 112) | 196616 | (i6 & 14);
                    i3 = i4;
                    aVar2 = M;
                    str2 = str;
                    pqv a4 = cp8.b.a.a(lg90Var, l5gVar, ucoVar4, null, null, aVar2, i7, 24);
                    a4.b(buttonSize, buttonStyle, buttonAppearance, z);
                    a4.a(lgu0Var, aVar2, i2 | ((i3 >> 6) & 112));
                    s3q0 s3q0Var2 = s3q0.a;
                } else {
                    i2 = 390;
                    i3 = i4;
                    aVar2 = M;
                    str2 = str;
                    aVar2.K(1622286836);
                }
                aVar2.j();
                if (str2 == null || str2.length() == 0) {
                    ucoVar2 = null;
                    aVar2.K(1622286836);
                } else {
                    aVar2.K(1638964402);
                    ucoVar2 = null;
                    gio0 a5 = cp8.d.a.a(str2, null, aVar2, ((i5 >> 3) & 14) | 3072 | ((i5 >> 12) & 896), 2);
                    a5.b(buttonSize, buttonStyle, buttonAppearance, z);
                    a5.a(lgu0Var, aVar2, i2 | ((i3 >> 6) & 112));
                    s3q0 s3q0Var3 = s3q0.a;
                }
                aVar2.j();
                if (num == null) {
                    aVar2.K(1639208991);
                } else {
                    aVar2.K(1639208992);
                    aVar2.K(745615038);
                    int intValue = num.intValue();
                    int i8 = ((i5 >> 6) & 14) | 3072 | ((i3 >> 12) & 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1070742643, i8, -1, "com.vk.core.compose.component.button.Button.Slot.Counter.Companion.invoke (Button.kt:96)");
                    }
                    int i9 = i8 << 3;
                    int i10 = (i9 & 896) | 6 | (i9 & 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-261266690, i10, -1, "com.vk.core.compose.component.button.remember (CounterImpl.kt:54)");
                    }
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = new qxj(intValue);
                        aVar2.R(x);
                    }
                    qxj qxjVar = (qxj) x;
                    ((zak0) qxjVar.e).setValue(num);
                    ((zak0) qxjVar.f).setValue(ucoVar2);
                    ((zak0) qxjVar.g).setValue(ucoVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    qxjVar.b(buttonSize, buttonStyle, buttonAppearance, z);
                    qxjVar.a(lgu0Var, aVar2, i2 | ((i3 >> 6) & 112));
                    s3q0 s3q0Var4 = s3q0.a;
                    aVar2.j();
                }
                aVar2.j();
                if (lg90Var2 != null) {
                    aVar2.K(1639490379);
                    if (pcoVar2 != null) {
                        float f3 = pcoVar2.b;
                        ucoVar3 = new uco(byc0.b(f3, f3));
                    } else {
                        ucoVar3 = ucoVar2;
                    }
                    int i11 = i5 >> 9;
                    pqv a6 = cp8.b.a.a(lg90Var2, l5gVar2, ucoVar3, null, null, aVar2, 196616 | (i11 & 14) | (i11 & 112), 24);
                    a6.b(buttonSize, buttonStyle, buttonAppearance, z);
                    a6.a(lgu0Var, aVar2, i2 | ((i3 >> 6) & 112));
                    s3q0 s3q0Var5 = s3q0.a;
                } else {
                    aVar2.K(1622286836);
                }
                aVar2.j();
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final String str3 = str2;
            s.d = new wzs(buttonStyle, buttonAppearance, lgu0Var, z, z2, z3, lg90Var, l5gVar, pcoVar, str3, num, lg90Var2, l5gVar2, pcoVar2, i) { // from class: xsna.ygu0
                public final /* synthetic */ ButtonStyle c;
                public final /* synthetic */ ButtonAppearance d;
                public final /* synthetic */ lgu0 e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ lg90 i;
                public final /* synthetic */ l5g j;
                public final /* synthetic */ pco k;
                public final /* synthetic */ String l;
                public final /* synthetic */ Integer m;
                public final /* synthetic */ lg90 n;
                public final /* synthetic */ l5g o;
                public final /* synthetic */ pco p;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(134217729);
                    bhu0.b(ButtonSize.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final gzs gzsVar, ButtonSize buttonSize, ButtonStyle buttonStyle, final ButtonAppearance buttonAppearance, q630 q630Var, r5j0 r5j0Var, s890 s890Var, boolean z, String str, rv5 rv5Var, sg50 sg50Var, boolean z2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        r5j0 r5j0Var2;
        s890 s890Var2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final ButtonSize buttonSize2;
        final ButtonStyle buttonStyle2;
        final String str2;
        final rv5 rv5Var2;
        final s890 s890Var3;
        final boolean z4;
        final q630 q630Var3;
        final r5j0 r5j0Var3;
        final sg50 sg50Var2;
        final boolean z5;
        androidx.compose.runtime.f s;
        int i16;
        int i17;
        int i18;
        boolean z6;
        a.C0011a.C0012a c0012a;
        s890 s890Var4;
        int i19;
        sg50 sg50Var3;
        boolean z7;
        s890 s890Var5;
        int i20;
        String str3;
        rv5 rv5Var3;
        r5j0 r5j0Var4;
        int i21;
        androidx.compose.runtime.a M = aVar.M(1881298300);
        if ((i & 6) == 0) {
            i4 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.o(buttonSize.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.o(buttonStyle.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= M.o(buttonAppearance.ordinal()) ? 2048 : 1024;
        }
        int i22 = i3 & 16;
        if (i22 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i3 & 32) == 0) {
                    r5j0Var2 = r5j0Var;
                    if (M.J(r5j0Var2)) {
                        i21 = 131072;
                        i4 |= i21;
                    }
                } else {
                    r5j0Var2 = r5j0Var;
                }
                i21 = 65536;
                i4 |= i21;
            } else {
                r5j0Var2 = r5j0Var;
            }
            if ((i & 1572864) != 0) {
                s890Var2 = s890Var;
                i4 |= ((i3 & 64) == 0 && M.J(s890Var2)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            } else {
                s890Var2 = s890Var;
            }
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
                z3 = z;
            } else {
                z3 = z;
                if ((i & 12582912) == 0) {
                    i4 |= M.l(z3) ? 8388608 : 4194304;
                }
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i7 = i22;
                i4 |= M.J(str) ? 67108864 : 33554432;
                i8 = i3 & 512;
                if (i8 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i9 = i8;
                    i4 |= M.J(rv5Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = (M.J(sg50Var) ? 4 : 2) | i2;
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    i13 = i3 & 2048;
                    if (i13 == 0) {
                        i12 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i14 = i13;
                        i12 |= M.l(z2) ? 32 : 16;
                        if ((i2 & 384) == 0) {
                            i12 |= M.y(jaiVar) ? 256 : 128;
                        }
                        i15 = i4;
                        if (M.t(i15 & 1, (306783379 & i4) == 306783378 || (i12 & 147) != 146)) {
                            M.V();
                            int i23 = i & 1;
                            a.C0011a.C0012a c0012a2 = a.C0011a.a;
                            if (i23 == 0 || M.i()) {
                                if (i7 != 0) {
                                    q630Var2 = q630.a.a;
                                }
                                if ((i3 & 32) != 0) {
                                    i16 = i15 & (-458753);
                                    r5j0Var2 = hr80.z().x((i15 >> 3) & 14, M);
                                } else {
                                    i16 = i15;
                                }
                                if ((i3 & 64) != 0) {
                                    int i24 = i16 >> 3;
                                    i18 = i6;
                                    c0012a = c0012a2;
                                    i17 = i12;
                                    z6 = false;
                                    buttonStyle2 = buttonStyle;
                                    buttonSize2 = buttonSize;
                                    s890Var4 = hr80.z().c(buttonSize, buttonStyle, false, M, (i24 & 112) | (i24 & 14) | 384, 0).getValue();
                                    i19 = i16 & (-3670017);
                                } else {
                                    buttonStyle2 = buttonStyle;
                                    i17 = i12;
                                    i18 = i6;
                                    z6 = false;
                                    buttonSize2 = buttonSize;
                                    c0012a = c0012a2;
                                    s890Var4 = s890Var2;
                                    i19 = i16;
                                }
                                if (i5 != 0) {
                                    z3 = true;
                                }
                                String str4 = i18 != 0 ? null : str;
                                rv5 rv5Var4 = i9 != 0 ? null : rv5Var;
                                if (i11 != 0) {
                                    Object x = M.x();
                                    if (x == c0012a) {
                                        x = ir.h(M);
                                    }
                                    sg50Var3 = (sg50) x;
                                } else {
                                    sg50Var3 = sg50Var;
                                }
                                if (i14 != 0) {
                                    s890Var5 = s890Var4;
                                    i20 = i19;
                                    str3 = str4;
                                    rv5Var3 = rv5Var4;
                                    z7 = z6;
                                } else {
                                    z7 = z2;
                                    s890Var5 = s890Var4;
                                    i20 = i19;
                                    str3 = str4;
                                    rv5Var3 = rv5Var4;
                                }
                                r5j0Var4 = r5j0Var2;
                            } else {
                                M.h();
                                i20 = (i3 & 32) != 0 ? i15 & (-458753) : i15;
                                if ((i3 & 64) != 0) {
                                    i20 &= -3670017;
                                }
                                buttonStyle2 = buttonStyle;
                                str3 = str;
                                rv5Var3 = rv5Var;
                                sg50Var3 = sg50Var;
                                z7 = z2;
                                s890Var5 = s890Var2;
                                i17 = i12;
                                c0012a = c0012a2;
                                r5j0Var4 = r5j0Var2;
                                buttonSize2 = buttonSize;
                            }
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1881298300, i20, i17, "com.vk.core.compose.component.VkButton (VkButton.kt:170)");
                            }
                            wh50 e = sdi.e(sg50Var3, M, i17 & 14);
                            hr80.z().getClass();
                            bn20 z8 = hr80.z();
                            int i25 = i20 >> 6;
                            int i26 = i25 & 14;
                            int i27 = i25 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                            lgu0 b = z8.b(buttonStyle2, buttonAppearance, M, i27);
                            int i28 = i20 >> 3;
                            int i29 = i28 & 14;
                            int i30 = i17;
                            pco pcoVar = new pco(hr80.z().w(buttonSize2, M, i29));
                            if (z7) {
                                pcoVar = null;
                            }
                            q630 b2 = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pcoVar != null ? pcoVar.b : 0, 1, q630Var2);
                            boolean J = M.J(e) | ((i20 & 896) == 256) | M.n(0.7f);
                            Object x2 = M.x();
                            if (J || x2 == c0012a) {
                                x2 = new x7t0(3, buttonStyle2, e);
                                M.R(x2);
                            }
                            q630 a2 = rdu.a(b2, (izs) x2);
                            mlg0 a3 = buttonStyle2 != ButtonStyle.Link ? qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false) : null;
                            int i31 = (i20 >> 15) & 896;
                            boolean z9 = z3;
                            y18 t = hr80.z().t(buttonStyle2, buttonAppearance, z9, M, i27 | i31);
                            int i32 = (i28 & 112) | ((i20 >> 9) & 14);
                            hr80.z().getClass();
                            M.K(-870876875);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-870876875, i32, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.backgroundBlurRadius (MilkshakeButtonDefaults.kt:227)");
                            }
                            float f = 0;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            hr80.z().getClass();
                            int i33 = i30 << 12;
                            sg50 sg50Var4 = sg50Var3;
                            f(gzsVar, a2, z9, sg50Var4, a3, t, hr80.z().y(buttonSize2, M, i29), op8.f(buttonStyle2, M, i26), r5j0Var4, b, s890Var5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rv5Var3, f, str3, z7, jaiVar, M, i31 | (i20 & 14) | ((i30 << 9) & 7168) | (234881024 & (i20 << 9)), ((i20 >> 12) & 57344) | ((i20 >> 18) & 14) | ((i20 >> 21) & 896) | (458752 & i33) | (i33 & 3670016), 2048);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var2;
                            z4 = z9;
                            sg50Var2 = sg50Var4;
                            r5j0Var3 = r5j0Var4;
                            s890Var3 = s890Var5;
                            rv5Var2 = rv5Var3;
                            str2 = str3;
                            z5 = z7;
                        } else {
                            buttonSize2 = buttonSize;
                            buttonStyle2 = buttonStyle;
                            M.h();
                            str2 = str;
                            rv5Var2 = rv5Var;
                            s890Var3 = s890Var2;
                            z4 = z3;
                            q630Var3 = q630Var2;
                            r5j0Var3 = r5j0Var2;
                            sg50Var2 = sg50Var;
                            z5 = z2;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.xgu0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int I = ne7.I(i | 1);
                                    int I2 = ne7.I(i2);
                                    bhu0.c(gzs.this, buttonSize2, buttonStyle2, buttonAppearance, q630Var3, r5j0Var3, s890Var3, z4, str2, rv5Var2, sg50Var2, z5, jaiVar, (androidx.compose.runtime.a) obj, I, I2, i3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i14 = i13;
                    if ((i2 & 384) == 0) {
                    }
                    i15 = i4;
                    if (M.t(i15 & 1, (306783379 & i4) == 306783378 || (i12 & 147) != 146)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i13 = i3 & 2048;
                if (i13 == 0) {
                }
                i14 = i13;
                if ((i2 & 384) == 0) {
                }
                i15 = i4;
                if (M.t(i15 & 1, (306783379 & i4) == 306783378 || (i12 & 147) != 146)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            i7 = i22;
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i13 = i3 & 2048;
            if (i13 == 0) {
            }
            i14 = i13;
            if ((i2 & 384) == 0) {
            }
            i15 = i4;
            if (M.t(i15 & 1, (306783379 & i4) == 306783378 || (i12 & 147) != 146)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((196608 & i) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i22;
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        i14 = i13;
        if ((i2 & 384) == 0) {
        }
        i15 = i4;
        if (M.t(i15 & 1, (306783379 & i4) == 306783378 || (i12 & 147) != 146)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final gzs gzsVar, final ButtonStyle buttonStyle, final ButtonAppearance buttonAppearance, q630 q630Var, ButtonSize buttonSize, r5j0 r5j0Var, cp8 cp8Var, cp8 cp8Var2, boolean z, sg50 sg50Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final q630 q630Var2;
        int i4;
        int i5;
        cp8 cp8Var3;
        int i6;
        cp8 cp8Var4;
        int i7;
        boolean z2;
        int i8;
        androidx.compose.runtime.a aVar2;
        final ButtonSize buttonSize2;
        final r5j0 r5j0Var2;
        final sg50 sg50Var2;
        final boolean z3;
        final cp8 cp8Var5;
        final cp8 cp8Var6;
        androidx.compose.runtime.f s;
        int i9;
        ButtonSize buttonSize3;
        cp8 cp8Var7;
        r5j0 r5j0Var3;
        sg50 sg50Var3;
        boolean z4;
        boolean z5;
        androidx.compose.runtime.a M = aVar.M(181523156);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.o(buttonStyle.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.o(buttonAppearance.ordinal()) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= M.o(buttonSize == null ? -1 : buttonSize.ordinal()) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                cp8Var3 = cp8Var;
                i3 |= M.J(cp8Var3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    cp8Var4 = cp8Var2;
                    i3 |= M.J(cp8Var4) ? 8388608 : 4194304;
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= M.J(null) ? 67108864 : 33554432;
                    }
                    i7 = i2 & 512;
                    if (i7 == 0) {
                        i3 |= 805306368;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i & 805306368) == 0) {
                            i3 |= M.l(z2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                        }
                    }
                    i8 = i3;
                    boolean z6 = true;
                    if (M.t(i8 & 1, (i3 & 306783379) == 306783378)) {
                        aVar2 = M;
                        aVar2.h();
                        buttonSize2 = buttonSize;
                        r5j0Var2 = r5j0Var;
                        sg50Var2 = sg50Var;
                        z3 = z2;
                        cp8Var5 = cp8Var3;
                        cp8Var6 = cp8Var4;
                    } else {
                        M.V();
                        int i11 = i & 1;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (i11 == 0 || M.i()) {
                            if (i10 != 0) {
                                q630Var2 = q630.a.a;
                            }
                            ButtonSize buttonSize4 = i4 != 0 ? ButtonSize.Medium : buttonSize;
                            r5j0 x = hr80.z().x((i8 >> 12) & 14, M);
                            i9 = i8 & (-458753);
                            if (i5 != 0) {
                                cp8Var3 = null;
                            }
                            if (i6 != 0) {
                                cp8Var4 = null;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            Object x2 = M.x();
                            if (x2 == c0012a) {
                                x2 = ir.h(M);
                            }
                            cp8 cp8Var8 = cp8Var4;
                            buttonSize3 = buttonSize4;
                            cp8Var7 = cp8Var8;
                            r5j0Var3 = x;
                            sg50Var3 = (sg50) x2;
                        } else {
                            M.h();
                            r5j0Var3 = r5j0Var;
                            sg50Var3 = sg50Var;
                            i9 = i8 & (-458753);
                            cp8Var7 = cp8Var4;
                            buttonSize3 = buttonSize;
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(181523156, i9, 54, "com.vk.core.compose.component.VkButton (VkButton.kt:228)");
                        }
                        azl azlVar = (azl) M.r(uvi.h);
                        Object x3 = M.x();
                        if (x3 == c0012a) {
                            x3 = androidx.compose.runtime.k.b(null);
                            M.R(x3);
                        }
                        wh50 wh50Var = (wh50) x3;
                        Object x4 = M.x();
                        if (x4 == c0012a) {
                            x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                            M.R(x4);
                        }
                        wh50 wh50Var2 = (wh50) x4;
                        List I = rl3.I(new cp8[]{cp8Var3, cp8Var7, null});
                        if (!I.isEmpty()) {
                            Iterator it = I.iterator();
                            while (it.hasNext()) {
                                if (((cp8) it.next()) instanceof cp8.c) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                        z4 = false;
                        Boolean valueOf = Boolean.valueOf(z4);
                        boolean l = M.l(z4);
                        int i12 = i9;
                        Object x5 = M.x();
                        if (l || x5 == c0012a) {
                            z5 = z2;
                            x5 = new zgu0(z4, wh50Var, wh50Var2, null);
                            M.R(x5);
                        } else {
                            z5 = z2;
                        }
                        bap.g(valueOf, (wzs) x5, M, 0);
                        boolean z7 = ((i12 & 3670016) == 1048576) | ((i12 & 29360128) == 8388608) | ((i12 & 234881024) == 67108864);
                        Object x6 = M.x();
                        if (z7 || x6 == c0012a) {
                            List I2 = rl3.I(new cp8[]{cp8Var3, cp8Var7, null});
                            if (!I2.isEmpty()) {
                                Iterator it2 = I2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    cp8 cp8Var9 = (cp8) it2.next();
                                    if (!(cp8Var9 instanceof cp8.b) && !(cp8Var9 instanceof cp8.c)) {
                                        z6 = false;
                                        break;
                                    }
                                }
                            }
                            x6 = Boolean.valueOf(z6);
                            M.R(x6);
                        }
                        boolean booleanValue = ((Boolean) x6).booleanValue();
                        boolean J = M.J(azlVar);
                        Object x7 = M.x();
                        if (J || x7 == c0012a) {
                            x7 = new c3b(azlVar, wh50Var2, wh50Var, 6);
                            M.R(x7);
                        }
                        final cp8 cp8Var10 = cp8Var7;
                        final cp8 cp8Var11 = cp8Var3;
                        final ButtonSize buttonSize5 = buttonSize3;
                        final boolean z8 = z5;
                        int i13 = i12 << 3;
                        aVar2 = M;
                        boolean z9 = z5;
                        c(gzsVar, buttonSize3, buttonStyle, buttonAppearance, txj0.v(sv1.z(q630Var2, (izs) x7), (!z4 || ((pco) wh50Var.getValue()) == null) ? Float.NaN : ((pco) wh50Var.getValue()).b), r5j0Var3, hr80.z().c(buttonSize3, buttonStyle, booleanValue, M, ((i12 >> 12) & 14) | (i12 & 112), 0).getValue(), z9, null, null, sg50Var3, booleanValue, kai.c(984037167, new yzs() { // from class: xsna.ogu0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                spg0 spg0Var = (spg0) obj;
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= aVar3.J(spg0Var) ? 4 : 2;
                                }
                                if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(984037167, intValue, -1, "com.vk.core.compose.component.VkButton.<anonymous> (VkButton.kt:261)");
                                    }
                                    bn20 z10 = hr80.z();
                                    ButtonStyle buttonStyle2 = ButtonStyle.this;
                                    ButtonAppearance buttonAppearance2 = buttonAppearance;
                                    bhu0.a(spg0Var, buttonSize5, buttonStyle2, buttonAppearance2, z10.b(buttonStyle2, buttonAppearance2, aVar3, 0), z8, cp8Var11, cp8Var10, aVar3, intValue & 14);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, M), aVar2, (i12 & 14) | ((i12 >> 9) & 112) | (i13 & 896) | (i13 & 7168) | ((i12 >> 6) & 29360128) | 100663296, 390, 512);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        cp8Var5 = cp8Var3;
                        buttonSize2 = buttonSize3;
                        r5j0Var2 = r5j0Var3;
                        z3 = z9;
                        sg50Var2 = sg50Var3;
                        cp8Var6 = cp8Var7;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.pgu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                bhu0.d(gzs.this, buttonStyle, buttonAppearance, q630Var2, buttonSize2, r5j0Var2, cp8Var5, cp8Var6, z3, sg50Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                cp8Var4 = cp8Var2;
                if ((i2 & 256) == 0) {
                }
                i7 = i2 & 512;
                if (i7 == 0) {
                }
                i8 = i3;
                boolean z62 = true;
                if (M.t(i8 & 1, (i3 & 306783379) == 306783378)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            cp8Var3 = cp8Var;
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            cp8Var4 = cp8Var2;
            if ((i2 & 256) == 0) {
            }
            i7 = i2 & 512;
            if (i7 == 0) {
            }
            i8 = i3;
            boolean z622 = true;
            if (M.t(i8 & 1, (i3 & 306783379) == 306783378)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        cp8Var3 = cp8Var;
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        cp8Var4 = cp8Var2;
        if ((i2 & 256) == 0) {
        }
        i7 = i2 & 512;
        if (i7 == 0) {
        }
        i8 = i3;
        boolean z6222 = true;
        if (M.t(i8 & 1, (i3 & 306783379) == 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final gzs gzsVar, final ButtonSize buttonSize, final ButtonStyle buttonStyle, final ButtonAppearance buttonAppearance, q630 q630Var, r5j0 r5j0Var, boolean z, boolean z2, lg90 lg90Var, l5g l5gVar, pco pcoVar, String str, Integer num, lg90 lg90Var2, l5g l5gVar2, pco pcoVar2, boolean z3, rv5 rv5Var, String str2, sg50 sg50Var, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3, final int i4) {
        int i5;
        q630 q630Var2;
        r5j0 r5j0Var2;
        int i6;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        androidx.compose.runtime.a aVar2;
        final pco pcoVar3;
        final String str3;
        final Integer num2;
        final lg90 lg90Var3;
        final pco pcoVar4;
        final boolean z6;
        final rv5 rv5Var2;
        final String str4;
        final sg50 sg50Var2;
        final q630 q630Var3;
        final r5j0 r5j0Var3;
        final boolean z7;
        final boolean z8;
        final lg90 lg90Var4;
        final l5g l5gVar3;
        final l5g l5gVar4;
        androidx.compose.runtime.f s;
        l5g l5gVar5;
        l5g l5gVar6;
        pco pcoVar5;
        boolean z9;
        rv5 rv5Var3;
        String str5;
        final lg90 lg90Var5;
        sg50 sg50Var3;
        int i28;
        androidx.compose.runtime.a M = aVar.M(1363465274);
        if ((i & 6) == 0) {
            i5 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= M.o(buttonSize.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= M.o(buttonStyle.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= M.o(buttonAppearance.ordinal()) ? 2048 : 1024;
        }
        int i29 = i4 & 16;
        if (i29 != 0) {
            i5 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i5 |= M.J(q630Var2) ? 16384 : 8192;
            if ((i & 196608) != 0) {
                r5j0Var2 = r5j0Var;
                i5 |= ((i4 & 32) == 0 && M.J(r5j0Var2)) ? 131072 : 65536;
            } else {
                r5j0Var2 = r5j0Var;
            }
            i6 = i5 | 1572864;
            i7 = i4 & 128;
            if (i7 == 0) {
                i6 = i5 | 14155776;
            } else if ((i & 12582912) == 0) {
                z4 = z;
                i6 |= M.l(z4) ? 8388608 : 4194304;
                i8 = i4 & 256;
                if (i8 != 0) {
                    i6 |= 100663296;
                    z5 = z2;
                } else {
                    z5 = z2;
                    if ((i & 100663296) == 0) {
                        i6 |= M.l(z5) ? 67108864 : 33554432;
                    }
                }
                i9 = i4 & 512;
                if (i9 != 0) {
                    i6 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i6 |= (i & 1073741824) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 536870912 : 268435456;
                }
                i10 = i4 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i11 = i2 | (M.J(l5gVar) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                i12 = i4 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                    i13 = i12;
                } else if ((i2 & 48) == 0) {
                    i13 = i12;
                    i11 |= M.J(pcoVar) ? 32 : 16;
                } else {
                    i13 = i12;
                }
                int i30 = i11;
                i14 = i4 & 4096;
                if (i14 != 0) {
                    i15 = i30 | 384;
                } else {
                    int i31 = i30;
                    if ((i2 & 384) == 0) {
                        i31 |= M.J(str) ? 256 : 128;
                    }
                    i15 = i31;
                }
                i16 = i4 & 8192;
                if (i16 != 0) {
                    i17 = i15 | 3072;
                } else {
                    int i32 = i15;
                    if ((i2 & 3072) == 0) {
                        i17 = i32 | (M.J(num) ? 2048 : 1024);
                    } else {
                        i17 = i32;
                    }
                }
                i18 = i4 & 16384;
                if (i18 != 0) {
                    i19 = i17 | 24576;
                } else {
                    int i33 = i17;
                    if ((i2 & 24576) == 0) {
                        i19 = i33 | ((i2 & 32768) == 0 ? M.J(lg90Var2) : M.y(lg90Var2) ? 16384 : 8192);
                    } else {
                        i19 = i33;
                    }
                }
                i20 = i4 & 32768;
                if (i20 != 0) {
                    i19 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i21 = i19 | (M.J(l5gVar2) ? 131072 : 65536);
                    i22 = i4 & 65536;
                    if (i22 == 0) {
                        i21 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i21 |= M.J(pcoVar2) ? 1048576 : 524288;
                    }
                    i23 = i4 & 131072;
                    if (i23 == 0) {
                        i21 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i21 |= M.l(z3) ? 8388608 : 4194304;
                    }
                    i24 = i4 & SQLiteDatabase.OPEN_PRIVATECACHE;
                    if (i24 == 0) {
                        i21 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i21 |= M.J(rv5Var) ? 67108864 : 33554432;
                    }
                    i25 = i4 & 524288;
                    if (i25 == 0) {
                        i21 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i21 |= M.J(str2) ? 536870912 : 268435456;
                    }
                    i26 = i21;
                    if ((i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
                        i27 = 6;
                    } else if ((i3 & 6) == 0) {
                        i27 = i3 | (M.J(null) ? 4 : 2);
                    } else {
                        i27 = i3;
                    }
                    if (M.t(i6 & 1, ((i6 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && ((i27 | 48) & 19) == 18) ? false : true)) {
                        aVar2 = M;
                        aVar2.h();
                        pcoVar3 = pcoVar;
                        str3 = str;
                        num2 = num;
                        lg90Var3 = lg90Var2;
                        pcoVar4 = pcoVar2;
                        z6 = z3;
                        rv5Var2 = rv5Var;
                        str4 = str2;
                        sg50Var2 = sg50Var;
                        q630Var3 = q630Var2;
                        r5j0Var3 = r5j0Var2;
                        z7 = z4;
                        z8 = z5;
                        lg90Var4 = lg90Var;
                        l5gVar3 = l5gVar;
                        l5gVar4 = l5gVar2;
                    } else {
                        M.V();
                        int i34 = i & 1;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (i34 == 0 || M.i()) {
                            if (i29 != 0) {
                                q630Var2 = q630.a.a;
                            }
                            if ((i4 & 32) != 0) {
                                r5j0 x = hr80.z().x((i6 >> 3) & 14, M);
                                i6 &= -458753;
                                r5j0Var2 = x;
                            }
                            if (i7 != 0) {
                                z4 = false;
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            lg90 lg90Var6 = i9 != 0 ? null : lg90Var;
                            l5gVar5 = i10 != 0 ? null : l5gVar;
                            pcoVar3 = i13 != 0 ? null : pcoVar;
                            str3 = i14 != 0 ? null : str;
                            num2 = i16 != 0 ? null : num;
                            lg90Var3 = i18 != 0 ? null : lg90Var2;
                            l5gVar6 = i20 != 0 ? null : l5gVar2;
                            pcoVar5 = i22 != 0 ? null : pcoVar2;
                            z9 = i23 != 0 ? true : z3;
                            rv5Var3 = i24 != 0 ? null : rv5Var;
                            str5 = i25 != 0 ? null : str2;
                            lg90 lg90Var7 = lg90Var6;
                            Object x2 = M.x();
                            if (x2 == c0012a) {
                                x2 = ir.h(M);
                            }
                            lg90Var5 = lg90Var7;
                            sg50Var3 = (sg50) x2;
                            i28 = i6;
                        } else {
                            M.h();
                            if ((i4 & 32) != 0) {
                                i6 &= -458753;
                            }
                            l5gVar5 = l5gVar;
                            pcoVar3 = pcoVar;
                            str3 = str;
                            num2 = num;
                            lg90Var3 = lg90Var2;
                            l5gVar6 = l5gVar2;
                            pcoVar5 = pcoVar2;
                            z9 = z3;
                            rv5Var3 = rv5Var;
                            str5 = str2;
                            sg50Var3 = sg50Var;
                            i28 = i6;
                            lg90Var5 = lg90Var;
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1363465274, i28, i26, "com.vk.core.compose.component.VkButton (VkButton.kt:310)");
                        }
                        azl azlVar = (azl) M.r(uvi.h);
                        Object x3 = M.x();
                        if (x3 == c0012a) {
                            x3 = androidx.compose.runtime.k.b(null);
                            M.R(x3);
                        }
                        wh50 wh50Var = (wh50) x3;
                        Object x4 = M.x();
                        if (x4 == c0012a) {
                            x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                            M.R(x4);
                        }
                        wh50 wh50Var2 = (wh50) x4;
                        int i35 = i28;
                        Boolean valueOf = Boolean.valueOf(z4);
                        final l5g l5gVar7 = l5gVar5;
                        boolean z10 = (i35 & 29360128) == 8388608;
                        Object x5 = M.x();
                        if (z10 || x5 == c0012a) {
                            x5 = new ahu0(z4, wh50Var, wh50Var2, null);
                            M.R(x5);
                        }
                        bap.g(valueOf, (wzs) x5, M, (i35 >> 21) & 14);
                        boolean z11 = (lg90Var5 != null || z4) && str3 == null;
                        boolean J = M.J(azlVar);
                        Object x6 = M.x();
                        if (J || x6 == c0012a) {
                            x6 = new w95(azlVar, wh50Var2, wh50Var);
                            M.R(x6);
                        }
                        aVar2 = M;
                        final boolean z12 = z4;
                        final pco pcoVar6 = pcoVar3;
                        final String str6 = str3;
                        final Integer num3 = num2;
                        final lg90 lg90Var8 = lg90Var3;
                        final boolean z13 = z5;
                        final l5g l5gVar8 = l5gVar6;
                        final pco pcoVar7 = pcoVar5;
                        final boolean z14 = z9;
                        lg90 lg90Var9 = lg90Var5;
                        sg50 sg50Var4 = sg50Var3;
                        c(gzsVar, buttonSize, buttonStyle, buttonAppearance, txj0.v(sv1.z(q630Var2, (izs) x6), (!z4 || ((pco) wh50Var.getValue()) == null) ? Float.NaN : ((pco) wh50Var.getValue()).b), r5j0Var2, hr80.z().c(buttonSize, buttonStyle, z11, M, (i35 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0).getValue(), z9, str5, rv5Var3, sg50Var4, z11, kai.c(-1952048619, new yzs() { // from class: xsna.tgu0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1952048619, intValue, -1, "com.vk.core.compose.component.VkButton.<anonymous> (VkButton.kt:341)");
                                    }
                                    bn20 z15 = hr80.z();
                                    ButtonStyle buttonStyle2 = ButtonStyle.this;
                                    ButtonAppearance buttonAppearance2 = buttonAppearance;
                                    bhu0.b(buttonSize, buttonStyle2, buttonAppearance2, z15.b(buttonStyle2, buttonAppearance2, aVar3, 0), z14, z12, z13, lg90Var5, l5gVar7, pcoVar6, str6, num3, lg90Var8, l5gVar8, pcoVar7, aVar3, 134217728);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), aVar2, (i35 & 466942) | (i26 & 29360128) | ((i26 >> 3) & 234881024) | ((i26 << 3) & 1879048192), 390, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        r5j0Var3 = r5j0Var2;
                        z7 = z4;
                        lg90Var4 = lg90Var9;
                        l5gVar3 = l5gVar7;
                        q630Var3 = q630Var2;
                        z8 = z5;
                        l5gVar4 = l5gVar6;
                        pcoVar4 = pcoVar5;
                        z6 = z9;
                        rv5Var2 = rv5Var3;
                        str4 = str5;
                        sg50Var2 = sg50Var4;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.ugu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int I = ne7.I(i | 1);
                                int I2 = ne7.I(i2);
                                int I3 = ne7.I(i3);
                                bhu0.e(gzs.this, buttonSize, buttonStyle, buttonAppearance, q630Var3, r5j0Var3, z7, z8, lg90Var4, l5gVar3, pcoVar3, str3, num2, lg90Var3, l5gVar4, pcoVar4, z6, rv5Var2, str4, sg50Var2, (androidx.compose.runtime.a) obj, I, I2, I3, i4);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i21 = i19;
                i22 = i4 & 65536;
                if (i22 == 0) {
                }
                i23 = i4 & 131072;
                if (i23 == 0) {
                }
                i24 = i4 & SQLiteDatabase.OPEN_PRIVATECACHE;
                if (i24 == 0) {
                }
                i25 = i4 & 524288;
                if (i25 == 0) {
                }
                i26 = i21;
                if ((i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
                }
                if (M.t(i6 & 1, ((i6 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && ((i27 | 48) & 19) == 18) ? false : true)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            z4 = z;
            i8 = i4 & 256;
            if (i8 != 0) {
            }
            i9 = i4 & 512;
            if (i9 != 0) {
            }
            i10 = i4 & 1024;
            if (i10 != 0) {
            }
            i12 = i4 & 2048;
            if (i12 != 0) {
            }
            int i302 = i11;
            i14 = i4 & 4096;
            if (i14 != 0) {
            }
            i16 = i4 & 8192;
            if (i16 != 0) {
            }
            i18 = i4 & 16384;
            if (i18 != 0) {
            }
            i20 = i4 & 32768;
            if (i20 != 0) {
            }
            i21 = i19;
            i22 = i4 & 65536;
            if (i22 == 0) {
            }
            i23 = i4 & 131072;
            if (i23 == 0) {
            }
            i24 = i4 & SQLiteDatabase.OPEN_PRIVATECACHE;
            if (i24 == 0) {
            }
            i25 = i4 & 524288;
            if (i25 == 0) {
            }
            i26 = i21;
            if ((i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            }
            if (M.t(i6 & 1, ((i6 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && ((i27 | 48) & 19) == 18) ? false : true)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 196608) != 0) {
        }
        i6 = i5 | 1572864;
        i7 = i4 & 128;
        if (i7 == 0) {
        }
        z4 = z;
        i8 = i4 & 256;
        if (i8 != 0) {
        }
        i9 = i4 & 512;
        if (i9 != 0) {
        }
        i10 = i4 & 1024;
        if (i10 != 0) {
        }
        i12 = i4 & 2048;
        if (i12 != 0) {
        }
        int i3022 = i11;
        i14 = i4 & 4096;
        if (i14 != 0) {
        }
        i16 = i4 & 8192;
        if (i16 != 0) {
        }
        i18 = i4 & 16384;
        if (i18 != 0) {
        }
        i20 = i4 & 32768;
        if (i20 != 0) {
        }
        i21 = i19;
        i22 = i4 & 65536;
        if (i22 == 0) {
        }
        i23 = i4 & 131072;
        if (i23 == 0) {
        }
        i24 = i4 & SQLiteDatabase.OPEN_PRIVATECACHE;
        if (i24 == 0) {
        }
        i25 = i4 & 524288;
        if (i25 == 0) {
        }
        i26 = i21;
        if ((i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
        }
        if (M.t(i6 & 1, ((i6 & 306783379) != 306783378 && (i26 & 306783379) == 306783378 && ((i27 | 48) & 19) == 18) ? false : true)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final gzs gzsVar, q630 q630Var, boolean z, sg50 sg50Var, buw buwVar, y18 y18Var, frv0 frv0Var, bcl bclVar, r5j0 r5j0Var, final lgu0 lgu0Var, s890 s890Var, float f, rv5 rv5Var, float f2, String str, boolean z2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        boolean z3;
        int i6;
        sg50 sg50Var2;
        int i7;
        buw buwVar2;
        int i8;
        y18 y18Var2;
        frv0 frv0Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.a aVar2;
        final bcl bclVar2;
        final s890 s890Var2;
        final float f3;
        final boolean z4;
        final boolean z5;
        final sg50 sg50Var3;
        final buw buwVar3;
        final q630 q630Var3;
        final r5j0 r5j0Var2;
        final float f4;
        final rv5 rv5Var2;
        final frv0 frv0Var3;
        final y18 y18Var3;
        final String str2;
        androidx.compose.runtime.f s;
        sg50 sg50Var4;
        r5j0 r5j0Var3;
        sg50 sg50Var5;
        int i18;
        s890 s890Var3;
        float f5;
        int i19;
        buw buwVar4;
        y18 y18Var4;
        int i20;
        float f6;
        bcl bclVar3;
        float f7;
        rv5 rv5Var3;
        String str3;
        boolean z6;
        s890 s890Var4;
        q630 q630Var4;
        r5j0 r5j0Var4;
        s890 s890Var5;
        rv5 rv5Var4;
        float f8;
        int i21;
        int i22;
        int i23;
        androidx.compose.runtime.a M = aVar.M(1115769961);
        if ((i & 6) == 0) {
            i4 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i24 = i3 & 2;
        if (i24 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                z3 = z;
                i4 |= M.l(z3) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    sg50Var2 = sg50Var;
                    i4 |= M.J(sg50Var2) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        buwVar2 = buwVar;
                        i4 |= M.J(buwVar2) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            y18Var2 = y18Var;
                        } else {
                            y18Var2 = y18Var;
                            if ((i & 196608) == 0) {
                                i4 |= M.J(y18Var2) ? 131072 : 65536;
                            }
                        }
                        if ((i & 1572864) == 0) {
                            frv0Var2 = frv0Var;
                            i4 |= ((i3 & 64) == 0 && M.J(frv0Var2)) ? 1048576 : 524288;
                        } else {
                            frv0Var2 = frv0Var;
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= M.J(bclVar) ? 8388608 : 4194304;
                        }
                        if ((i & 100663296) == 0) {
                            if ((i3 & 256) == 0 && M.J(r5j0Var)) {
                                i23 = 67108864;
                                i4 |= i23;
                            }
                            i23 = 33554432;
                            i4 |= i23;
                        }
                        if ((i & 805306368) == 0) {
                            i4 |= M.J(lgu0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                        }
                        if ((i2 & 6) == 0) {
                            if ((i3 & 1024) == 0 && M.J(s890Var)) {
                                i22 = 4;
                                i10 = i2 | i22;
                            }
                            i22 = 2;
                            i10 = i2 | i22;
                        } else {
                            i10 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            if ((i3 & 2048) == 0 && M.n(f)) {
                                i21 = 32;
                                i10 |= i21;
                            }
                            i21 = 16;
                            i10 |= i21;
                        }
                        int i25 = i10;
                        i11 = i3 & 4096;
                        if (i11 != 0) {
                            i12 = i25 | 384;
                        } else if ((i2 & 384) == 0) {
                            i12 = i25 | (M.J(rv5Var) ? 256 : 128);
                        } else {
                            i12 = i25;
                        }
                        i13 = i3 & 8192;
                        if (i13 != 0) {
                            i14 = i12 | 3072;
                        } else {
                            int i26 = i12;
                            if ((i2 & 3072) == 0) {
                                i14 = i26 | (M.n(f2) ? 2048 : 1024);
                            } else {
                                i14 = i26;
                            }
                        }
                        i15 = i3 & 16384;
                        if (i15 != 0) {
                            i16 = i14 | 24576;
                        } else {
                            i16 = i14;
                            if ((i2 & 24576) == 0) {
                                i16 |= M.J(str) ? 16384 : 8192;
                                i17 = i3 & 32768;
                                if (i17 == 0) {
                                    i16 |= 196608;
                                } else if ((i2 & 196608) == 0) {
                                    i16 |= M.l(z2) ? 131072 : 65536;
                                }
                                if ((i2 & 1572864) == 0) {
                                    i16 |= M.y(jaiVar) ? 1048576 : 524288;
                                }
                                if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 599187) != 599186)) {
                                    aVar2 = M;
                                    aVar2.h();
                                    bclVar2 = bclVar;
                                    s890Var2 = s890Var;
                                    f3 = f2;
                                    z4 = z2;
                                    z5 = z3;
                                    sg50Var3 = sg50Var2;
                                    buwVar3 = buwVar2;
                                    q630Var3 = q630Var2;
                                    r5j0Var2 = r5j0Var;
                                    f4 = f;
                                    rv5Var2 = rv5Var;
                                    frv0Var3 = frv0Var2;
                                    y18Var3 = y18Var2;
                                    str2 = str;
                                } else {
                                    M.V();
                                    int i27 = i & 1;
                                    q630 q630Var5 = q630.a.a;
                                    a.C0011a.C0012a c0012a = a.C0011a.a;
                                    kq2 kq2Var = null;
                                    if (i27 == 0 || M.i()) {
                                        if (i24 != 0) {
                                            q630Var2 = q630Var5;
                                        }
                                        boolean z7 = i5 == 0 ? z3 : true;
                                        if (i6 != 0) {
                                            Object x = M.x();
                                            if (x == c0012a) {
                                                x = ir.h(M);
                                            }
                                            sg50Var4 = (sg50) x;
                                        } else {
                                            sg50Var4 = sg50Var2;
                                        }
                                        if (i7 != 0) {
                                            buwVar2 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                                        }
                                        if (i8 != 0) {
                                            y18Var2 = null;
                                        }
                                        if ((i3 & 64) != 0) {
                                            frv0Var2 = hr80.z().y(ButtonSize.Medium, M, 6);
                                            i4 &= -3670017;
                                        }
                                        bcl bclVar4 = i9 != 0 ? null : bclVar;
                                        if ((i3 & 256) != 0) {
                                            bn20 z8 = hr80.z();
                                            ButtonSize buttonSize = ButtonSize.Small;
                                            r5j0Var3 = z8.x(6, M);
                                            i4 &= -234881025;
                                        } else {
                                            r5j0Var3 = r5j0Var;
                                        }
                                        if ((i3 & 1024) != 0) {
                                            hr80.z().getClass();
                                            float f9 = 0;
                                            if (androidx.compose.runtime.b.d()) {
                                                sg50Var5 = sg50Var4;
                                                i18 = i4;
                                                androidx.compose.runtime.b.f(546389566, 0, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.contentPadding (VkButtonDefaults.kt:150)");
                                            } else {
                                                sg50Var5 = sg50Var4;
                                                i18 = i4;
                                            }
                                            boolean n = M.n(f9) | M.n(f9) | M.n(f9) | M.n(f9);
                                            Object x2 = M.x();
                                            if (n || x2 == c0012a) {
                                                x2 = new u890(f9, f9, f9, f9);
                                                M.R(x2);
                                            }
                                            s890Var3 = (s890) x2;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            i16 &= -15;
                                        } else {
                                            sg50Var5 = sg50Var4;
                                            i18 = i4;
                                            s890Var3 = s890Var;
                                        }
                                        if ((i3 & 2048) != 0) {
                                            f5 = hr80.z().w(ButtonSize.Medium, M, 6);
                                            i16 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                        } else {
                                            f5 = f;
                                        }
                                        rv5 rv5Var5 = i11 != 0 ? null : rv5Var;
                                        float f10 = i13 != 0 ? 0 : f2;
                                        String str4 = i15 != 0 ? null : str;
                                        if (i17 != 0) {
                                            buwVar4 = buwVar2;
                                            y18Var4 = y18Var2;
                                            i20 = i16;
                                            f6 = f5;
                                            bclVar3 = bclVar4;
                                            f7 = f10;
                                            z3 = z7;
                                            rv5Var3 = rv5Var5;
                                            str3 = str4;
                                            s890Var4 = s890Var3;
                                            z6 = false;
                                            q630Var4 = q630Var2;
                                            i19 = i18;
                                        } else {
                                            i19 = i18;
                                            buwVar4 = buwVar2;
                                            y18Var4 = y18Var2;
                                            i20 = i16;
                                            f6 = f5;
                                            bclVar3 = bclVar4;
                                            f7 = f10;
                                            z3 = z7;
                                            rv5Var3 = rv5Var5;
                                            str3 = str4;
                                            z6 = z2;
                                            s890Var4 = s890Var3;
                                            q630Var4 = q630Var2;
                                        }
                                        r5j0Var4 = r5j0Var3;
                                        sg50Var2 = sg50Var5;
                                    } else {
                                        M.h();
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        if ((i3 & 256) != 0) {
                                            i4 &= -234881025;
                                        }
                                        if ((i3 & 1024) != 0) {
                                            i16 &= -15;
                                        }
                                        if ((i3 & 2048) != 0) {
                                            i16 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                        }
                                        s890Var4 = s890Var;
                                        rv5Var3 = rv5Var;
                                        str3 = str;
                                        z6 = z2;
                                        i19 = i4;
                                        buwVar4 = buwVar2;
                                        q630Var4 = q630Var2;
                                        y18Var4 = y18Var2;
                                        i20 = i16;
                                        bclVar3 = bclVar;
                                        r5j0Var4 = r5j0Var;
                                        f6 = f;
                                        f7 = f2;
                                    }
                                    M.S();
                                    final frv0 frv0Var4 = frv0Var2;
                                    if (androidx.compose.runtime.b.d()) {
                                        s890Var5 = s890Var4;
                                        androidx.compose.runtime.b.f(1115769961, i19, i20, "com.vk.core.compose.component.VkButton (VkButton.kt:96)");
                                    } else {
                                        s890Var5 = s890Var4;
                                    }
                                    int i28 = i19 >> 6;
                                    int i29 = (i28 & 14) | ((i19 >> 24) & 112);
                                    final wh50 b = lgu0Var.b(z3, M, i29);
                                    wh50 a2 = lgu0Var.a(z3, M, i29);
                                    int i30 = i20;
                                    int i31 = i19;
                                    if (rv5Var3 == null || pco.a(f7, 0) <= 0) {
                                        rv5Var4 = rv5Var3;
                                        f8 = f7;
                                        M.K(1152485217);
                                        M.j();
                                    } else {
                                        M.K(1152293048);
                                        rv5 rv5Var6 = rv5Var3;
                                        float f11 = f7;
                                        q630Var5 = lv5.a(q630Var5, rv5Var6, f11, null, new rek0(((l5g) lgu0Var.a(z3, M, i29).getValue()).a), null, 44);
                                        rv5Var4 = rv5Var6;
                                        f8 = f11;
                                        M.j();
                                    }
                                    Object x3 = M.x();
                                    if (x3 == c0012a) {
                                        x3 = new qit0(2);
                                        M.R(x3);
                                    }
                                    q630 b2 = egi0.b(q630Var4, false, (izs) x3);
                                    long j = ((l5g) a2.getValue()).a;
                                    long j2 = ((l5g) a2.getValue()).a;
                                    if (bclVar3 == null) {
                                        M.K(1152792147);
                                    } else {
                                        M.K(-1486833810);
                                        kq2Var = bclVar3.a(z3, sg50Var2, M, (i28 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i31 >> 15) & 896));
                                    }
                                    M.j();
                                    final s890 s890Var6 = s890Var5;
                                    final float f12 = f6;
                                    final boolean z9 = z6;
                                    final q630 q630Var6 = q630Var5;
                                    q630 q630Var7 = q630Var4;
                                    int i32 = i31 << 12;
                                    int i33 = (i31 & 14) | ((i31 >> 18) & 896) | (i31 & 458752) | (i32 & 29360128) | (i32 & 234881024) | ((i31 << 21) & 1879048192);
                                    int i34 = ((i30 >> 12) & 14) | 48;
                                    aVar2 = M;
                                    boolean z10 = z3;
                                    sg50 sg50Var6 = sg50Var2;
                                    uov0.b(gzsVar, b2, r5j0Var4, j, j2, y18Var4, kq2Var != null ? ((pco) kq2Var.getValue()).b : 0, sg50Var6, buwVar4, z10, str3, kai.c(-742801900, new wzs() { // from class: xsna.vgu0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                                            int intValue = ((Integer) obj2).intValue();
                                            if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-742801900, intValue, -1, "com.vk.core.compose.component.VkButton.<anonymous> (VkButton.kt:123)");
                                                }
                                                pqo pqoVar = hfj.a;
                                                mtk0 mtk0Var = mtk0.this;
                                                c9e0[] c9e0VarArr = {pqoVar.b(Float.valueOf(l5g.e(((l5g) mtk0Var.getValue()).a))), vcl0.b(l5g.c(14, ((l5g) mtk0Var.getValue()).a, 1.0f), yfj.a)};
                                                final frv0 frv0Var5 = frv0Var4;
                                                final float f13 = f12;
                                                final q630 q630Var8 = q630Var6;
                                                final s890 s890Var7 = s890Var6;
                                                final jai jaiVar2 = jaiVar;
                                                final boolean z11 = z9;
                                                rvi.b(c9e0VarArr, kai.c(-152002220, new wzs() { // from class: xsna.qgu0
                                                    @Override // xsna.wzs
                                                    public final Object invoke(Object obj3, Object obj4) {
                                                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                                                        int intValue2 = ((Integer) obj4).intValue();
                                                        if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(-152002220, intValue2, -1, "com.vk.core.compose.component.VkButton.<anonymous>.<anonymous> (VkButton.kt:127)");
                                                            }
                                                            final float f14 = f13;
                                                            final q630 q630Var9 = q630Var8;
                                                            final s890 s890Var8 = s890Var7;
                                                            final jai jaiVar3 = jaiVar2;
                                                            final boolean z12 = z11;
                                                            grv0.a(frv0.this, kai.c(395985240, new wzs() { // from class: xsna.sgu0
                                                                @Override // xsna.wzs
                                                                public final Object invoke(Object obj5, Object obj6) {
                                                                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj5;
                                                                    int intValue3 = ((Integer) obj6).intValue();
                                                                    if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                        if (androidx.compose.runtime.b.d()) {
                                                                            androidx.compose.runtime.b.f(395985240, intValue3, -1, "com.vk.core.compose.component.VkButton.<anonymous>.<anonymous>.<anonymous> (VkButton.kt:128)");
                                                                        }
                                                                        pco pcoVar = new pco(f14);
                                                                        if (z12) {
                                                                            pcoVar = null;
                                                                        }
                                                                        q630 C = s200.C(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pcoVar != null ? pcoVar.b : 0, 1, q630.a.a).g(q630Var9), s890Var8);
                                                                        a.c cVar = androidx.compose.foundation.layout.a.e;
                                                                        dt1.a.getClass();
                                                                        androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(cVar, dt1.a.l, aVar5, 54);
                                                                        int hashCode = Long.hashCode(n34.n(aVar5));
                                                                        sy90 D = aVar5.D();
                                                                        q630 c = qri.c(aVar5, C);
                                                                        cri.h7.getClass();
                                                                        LayoutNode.a aVar6 = cri.a.b;
                                                                        if (aVar5.N() == null) {
                                                                            n34.r();
                                                                            throw null;
                                                                        }
                                                                        aVar5.H();
                                                                        if (aVar5.L()) {
                                                                            aVar5.I(aVar6);
                                                                        } else {
                                                                            aVar5.f();
                                                                        }
                                                                        k9q0.w(aVar5, a3, cri.a.f);
                                                                        k9q0.w(aVar5, D, cri.a.e);
                                                                        k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
                                                                        k9q0.t(aVar5, cri.a.h);
                                                                        k9q0.w(aVar5, c, cri.a.d);
                                                                        jaiVar3.invoke(tpg0.a, aVar5, 6);
                                                                        aVar5.G();
                                                                        if (androidx.compose.runtime.b.d()) {
                                                                            androidx.compose.runtime.b.e();
                                                                        }
                                                                    } else {
                                                                        aVar5.h();
                                                                    }
                                                                    return s3q0.a;
                                                                }
                                                            }, aVar4), aVar4, 48);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar4.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, aVar3), aVar3, 56);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar3.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, M), aVar2, i33, i34, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    f4 = f12;
                                    f3 = f8;
                                    frv0Var3 = frv0Var4;
                                    r5j0Var2 = r5j0Var4;
                                    y18Var3 = y18Var4;
                                    sg50Var3 = sg50Var6;
                                    z5 = z10;
                                    str2 = str3;
                                    s890Var2 = s890Var6;
                                    z4 = z9;
                                    q630Var3 = q630Var7;
                                    rv5Var2 = rv5Var4;
                                    bclVar2 = bclVar3;
                                    buwVar3 = buwVar4;
                                }
                                s = aVar2.s();
                                if (s == null) {
                                    s.d = new wzs() { // from class: xsna.wgu0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int I = ne7.I(i | 1);
                                            int I2 = ne7.I(i2);
                                            bhu0.f(gzs.this, q630Var3, z5, sg50Var3, buwVar3, y18Var3, frv0Var3, bclVar2, r5j0Var2, lgu0Var, s890Var2, f4, rv5Var2, f3, str2, z4, jaiVar, (androidx.compose.runtime.a) obj, I, I2, i3);
                                            return s3q0.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        }
                        i17 = i3 & 32768;
                        if (i17 == 0) {
                        }
                        if ((i2 & 1572864) == 0) {
                        }
                        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 599187) != 599186)) {
                        }
                        s = aVar2.s();
                        if (s == null) {
                        }
                    }
                    buwVar2 = buwVar;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    if ((i2 & 6) == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    int i252 = i10;
                    i11 = i3 & 4096;
                    if (i11 != 0) {
                    }
                    i13 = i3 & 8192;
                    if (i13 != 0) {
                    }
                    i15 = i3 & 16384;
                    if (i15 != 0) {
                    }
                    i17 = i3 & 32768;
                    if (i17 == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 599187) != 599186)) {
                    }
                    s = aVar2.s();
                    if (s == null) {
                    }
                }
                sg50Var2 = sg50Var;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                buwVar2 = buwVar;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i2522 = i10;
                i11 = i3 & 4096;
                if (i11 != 0) {
                }
                i13 = i3 & 8192;
                if (i13 != 0) {
                }
                i15 = i3 & 16384;
                if (i15 != 0) {
                }
                i17 = i3 & 32768;
                if (i17 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 599187) != 599186)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            z3 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            sg50Var2 = sg50Var;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            buwVar2 = buwVar;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i25222 = i10;
            i11 = i3 & 4096;
            if (i11 != 0) {
            }
            i13 = i3 & 8192;
            if (i13 != 0) {
            }
            i15 = i3 & 16384;
            if (i15 != 0) {
            }
            i17 = i3 & 32768;
            if (i17 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 599187) != 599186)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        sg50Var2 = sg50Var;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        buwVar2 = buwVar;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i252222 = i10;
        i11 = i3 & 4096;
        if (i11 != 0) {
        }
        i13 = i3 & 8192;
        if (i13 != 0) {
        }
        i15 = i3 & 16384;
        if (i15 != 0) {
        }
        i17 = i3 & 32768;
        if (i17 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 599187) != 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void g(final String str, final gzs gzsVar, final q630 q630Var, final DropdownButton$Appearance dropdownButton$Appearance, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        ButtonAppearance buttonAppearance;
        androidx.compose.runtime.a M = aVar.M(-1207724673);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.o(dropdownButton$Appearance == null ? -1 : dropdownButton$Appearance.ordinal()) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1207724673, i2, -1, "com.vk.core.compose.component.VkDropdownButton (VkButton.kt:376)");
            }
            ButtonSize buttonSize = ButtonSize.Small;
            int i3 = a.$EnumSwitchMapping$0[dropdownButton$Appearance.ordinal()];
            if (i3 == 1) {
                buttonAppearance = ButtonAppearance.Accent;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buttonAppearance = ButtonAppearance.Neutral;
            }
            ButtonAppearance buttonAppearance2 = buttonAppearance;
            ButtonStyle buttonStyle = ButtonStyle.Link;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1793527244, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DropdownOutline16> (VkSdkIcons.kt:762)");
            }
            lg90 b = or.b(M, 1577142419, R.drawable.vk_icon_dropdown_outline_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = ((i2 >> 3) & 14) | Tensorflow.FRAME_WIDTH;
            int i5 = i2 << 6;
            aVar2 = M;
            e(gzsVar2, buttonSize, buttonStyle, buttonAppearance2, q630Var, null, false, false, null, null, null, str, null, b, null, null, false, null, null, null, aVar2, i4 | (57344 & i5), (i5 & 896) | 32768, 0, 4173792);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ngu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bhu0.g(str, gzsVar, q630Var, dropdownButton$Appearance, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
