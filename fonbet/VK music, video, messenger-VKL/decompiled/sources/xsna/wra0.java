package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.compose.component.defaults.PlaceholderSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.dt1;
import xsna.wra0;

/* compiled from: Placeholder.kt */
/* loaded from: classes17.dex */
public interface wra0 {

    /* compiled from: Placeholder.kt */
    public interface a {

        /* compiled from: Placeholder.kt */
        /* renamed from: xsna.wra0$a$a, reason: collision with other inner class name */
        public static final class C3954a {
            public static r48 a(String str, gzs gzsVar, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, boolean z, lg90 lg90Var, l5g l5gVar, pco pcoVar, lg90 lg90Var2, l5g l5gVar2, pco pcoVar2, boolean z2, boolean z3, String str2, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2, int i3) {
                l5g l5gVar3;
                pco pcoVar3;
                String str3;
                SemanticsConfiguration semanticsConfiguration2;
                ButtonSize buttonSize2 = (i3 & 4) != 0 ? ButtonSize.Medium : buttonSize;
                ButtonStyle buttonStyle2 = (i3 & 8) != 0 ? ButtonStyle.Primary : buttonStyle;
                ButtonAppearance buttonAppearance2 = (i3 & 16) != 0 ? null : buttonAppearance;
                boolean z4 = (i3 & 32) != 0 ? false : z;
                lg90 lg90Var3 = (i3 & 64) != 0 ? null : lg90Var;
                l5g l5gVar4 = (i3 & 128) != 0 ? null : l5gVar;
                pco pcoVar4 = (i3 & 256) != 0 ? null : pcoVar;
                lg90 lg90Var4 = (i3 & 1024) != 0 ? null : lg90Var2;
                l5g l5gVar5 = (i3 & 2048) != 0 ? null : l5gVar2;
                pco pcoVar5 = (i3 & 4096) != 0 ? null : pcoVar2;
                boolean z5 = (i3 & 8192) != 0 ? false : z2;
                boolean z6 = (i3 & 16384) != 0 ? true : z3;
                String str4 = (32768 & i3) != 0 ? null : str2;
                SemanticsConfiguration semanticsConfiguration3 = (i3 & 65536) != 0 ? null : semanticsConfiguration;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1643893620, i, i2, "com.vk.core.compose.component.placeholder.Placeholder.Bottom.Button.Companion.invoke (Placeholder.kt:311)");
                }
                int i4 = i << 3;
                int i5 = ((i2 >> 21) & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | C.DEFAULT_MUXED_BUFFER_SIZE | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192);
                int i6 = i2 << 3;
                int i7 = ((i >> 27) & 14) | 64 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-18343445, i5, i7, "com.vk.core.compose.component.placeholder.remember (BottomButtonImpl.kt:108)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    r48 r48Var = new r48(str, gzsVar, buttonSize2, buttonStyle2, buttonAppearance2, z4, lg90Var3, l5gVar4, pcoVar4, null, lg90Var4, l5gVar5, pcoVar5, z5, z6, str4, semanticsConfiguration3);
                    l5gVar3 = l5gVar5;
                    pcoVar3 = pcoVar5;
                    str3 = str4;
                    semanticsConfiguration2 = semanticsConfiguration3;
                    aVar.R(r48Var);
                    x = r48Var;
                } else {
                    l5gVar3 = l5gVar5;
                    pcoVar3 = pcoVar5;
                    str3 = str4;
                    semanticsConfiguration2 = semanticsConfiguration3;
                }
                r48 r48Var2 = (r48) x;
                ((zak0) r48Var2.b).setValue(str);
                ((zak0) r48Var2.c).setValue(gzsVar);
                ((zak0) r48Var2.d).setValue(buttonSize2);
                ((zak0) r48Var2.e).setValue(buttonStyle2);
                ((zak0) r48Var2.f).setValue(buttonAppearance2);
                ((zak0) r48Var2.g).setValue(Boolean.valueOf(z4));
                ((zak0) r48Var2.h).setValue(lg90Var3);
                ((zak0) r48Var2.i).setValue(l5gVar4);
                ((zak0) r48Var2.j).setValue(pcoVar4);
                ((zak0) r48Var2.k).setValue(null);
                ((zak0) r48Var2.l).setValue(lg90Var4);
                ((zak0) r48Var2.m).setValue(l5gVar3);
                ((zak0) r48Var2.n).setValue(pcoVar3);
                ((zak0) r48Var2.a).setValue(Boolean.valueOf(z5));
                ((zak0) r48Var2.p).setValue(str3);
                ((zak0) r48Var2.q).setValue(semanticsConfiguration2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return r48Var2;
            }
        }

        /* compiled from: Placeholder.kt */
        public static final class b {
            public static final void a(q630 q630Var, PlaceholderMode placeholderMode, ButtonSize buttonSize, a aVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
                int i3;
                PlaceholderMode placeholderMode2;
                final a aVar3;
                final q630 q630Var2;
                final ButtonSize buttonSize2;
                androidx.compose.runtime.a M = aVar2.M(-1638278390);
                if ((i & 6) == 0) {
                    i3 = (M.J(q630Var) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= M.o(placeholderMode.ordinal()) ? 32 : 16;
                }
                int i4 = i2 & 4;
                if (i4 != 0) {
                    i3 |= 384;
                } else if ((i & 384) == 0) {
                    i3 |= M.o(buttonSize == null ? -1 : buttonSize.ordinal()) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i3 |= (i & 4096) == 0 ? M.J(aVar) : M.y(aVar) ? 2048 : 1024;
                }
                if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
                    if (i4 != 0) {
                        buttonSize = ButtonSize.Medium;
                    }
                    ButtonSize buttonSize3 = buttonSize;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1638278390, i3, -1, "com.vk.core.compose.component.placeholder.Placeholder.Bottom.Button.ComposeDefaultImpls.Content$default (Placeholder.kt:-1)");
                    }
                    placeholderMode2 = placeholderMode;
                    aVar.a(q630Var, placeholderMode2, buttonSize3, M, i3 & 8190);
                    aVar3 = aVar;
                    q630Var2 = q630Var;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    buttonSize2 = buttonSize3;
                } else {
                    placeholderMode2 = placeholderMode;
                    aVar3 = aVar;
                    q630Var2 = q630Var;
                    M.h();
                    buttonSize2 = buttonSize;
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    final PlaceholderMode placeholderMode3 = placeholderMode2;
                    s.d = new wzs() { // from class: xsna.xra0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            wra0.a.b.a(q630.this, placeholderMode3, buttonSize2, aVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                }
            }
        }

        void a(q630 q630Var, PlaceholderMode placeholderMode, ButtonSize buttonSize, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: Placeholder.kt */
    public static final class b {
        public static y48 a(r48 r48Var, r48 r48Var2, r48 r48Var3, androidx.compose.runtime.a aVar, int i) {
            if ((i & 2) != 0) {
                r48Var2 = null;
            }
            if ((i & 4) != 0) {
                r48Var3 = null;
            }
            PlaceholderSize placeholderSize = PlaceholderSize.Large;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1741020439, 24576, -1, "com.vk.core.compose.component.placeholder.Placeholder.Bottom.Companion.invoke (Placeholder.kt:362)");
            }
            aVar.K(715286835);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1526458560, 6, -1, "com.vk.core.compose.component.placeholder.remember (BottomImpl.kt:56)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new y48(r48Var, r48Var2, r48Var3);
                aVar.R(x);
            }
            y48 y48Var = (y48) x;
            ((zak0) y48Var.a).setValue(r48Var);
            ((zak0) y48Var.b).setValue(r48Var2);
            ((zak0) y48Var.c).setValue(r48Var3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return y48Var;
        }
    }

    /* compiled from: Placeholder.kt */
    public static final class c {
        public static final void a(q630 q630Var, PlaceholderMode placeholderMode, dt1.b bVar, wra0 wra0Var, androidx.compose.runtime.a aVar, int i, int i2) {
            int i3;
            dt1.b bVar2;
            androidx.compose.runtime.a M = aVar.M(-413537144);
            if ((i & 6) == 0) {
                i3 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= M.o(placeholderMode.ordinal()) ? 32 : 16;
            }
            int i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= M.J(bVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= M.J(wra0Var) ? 2048 : 1024;
            }
            if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
                if (i4 != 0) {
                    dt1.a.getClass();
                    bVar = dt1.a.o;
                }
                dt1.b bVar3 = bVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-413537144, i3, -1, "com.vk.core.compose.component.placeholder.Placeholder.Bottom.ComposeDefaultImpls.Content$default (Placeholder.kt:-1)");
                }
                wra0Var.a(q630Var, placeholderMode, bVar3, M, i3 & 8190);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                bVar2 = bVar3;
            } else {
                M.h();
                bVar2 = bVar;
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new yra0(q630Var, placeholderMode, bVar2, wra0Var, i, i2, 0);
            }
        }
    }

    void a(q630 q630Var, PlaceholderMode placeholderMode, dt1.b bVar, androidx.compose.runtime.a aVar, int i);
}
