package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.controls.SelectionControlsMiddle$TitleIconPosition;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: SelectionControlsMiddle.kt */
/* loaded from: classes17.dex */
public final class qci0 {
    public static final /* synthetic */ qci0 a = new qci0();

    /* compiled from: SelectionControlsMiddle.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectionControlsMiddle$TitleIconPosition.values().length];
            try {
                iArr[SelectionControlsMiddle$TitleIconPosition.AfterTitleText.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectionControlsMiddle$TitleIconPosition.ComponentEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static rci0 d(int i, String str, String str2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return new rci0(str, SelectionControlsMiddle$TitleIconPosition.ComponentEnd, l5g.k, str2);
    }

    public final void a(final String str, final frv0 frv0Var, final frv0 frv0Var2, long j, final q630 q630Var, final SelectionControlsMiddle$TitleIconPosition selectionControlsMiddle$TitleIconPosition, final long j2, final String str2, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        frv0 frv0Var3;
        final long j3;
        androidx.compose.runtime.a M = aVar.M(-2124582774);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            frv0Var3 = frv0Var;
            i2 |= M.J(frv0Var3) ? 32 : 16;
        } else {
            frv0Var3 = frv0Var;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(frv0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.p(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? M.J(null) : M.y(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.o(selectionControlsMiddle$TitleIconPosition == null ? -1 : selectionControlsMiddle$TitleIconPosition.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= M.p(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.J(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= M.l(z) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i3 = i2;
        int i4 = (M.y(null) ? 4 : 2) | 48;
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2124582774, i3, i4, "com.vk.core.compose.component.controls.SelectionControlsMiddle.Companion.Impl (SelectionControlsMiddle.kt:87)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = kqu0.q;
            dt1.a.getClass();
            int i5 = i3 >> 12;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(f, dt1.a.l), dt1.a.n, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            if (str == null) {
                M.K(1747368162);
            } else {
                M.K(1750711295);
                int i6 = i3 >> 9;
                a.b(str, frv0Var3, selectionControlsMiddle$TitleIconPosition, j2, z, M, (i3 & 14) | 12582912 | (i3 & 112) | 512 | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (458752 & i5) | ((i4 << 18) & 3670016));
            }
            M.j();
            if (str2 != null) {
                M.K(1751159586);
                j3 = j;
                yqv0.c(str2, null, zjq.g(j3, !z), null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, M, (i3 >> 24) & 14, (i3 << 3) & 7168, 8186);
            } else {
                j3 = j;
                M.K(1747368162);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            j3 = j;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pci0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qci0.this.a(str, frv0Var, frv0Var2, j3, q630Var, selectionControlsMiddle$TitleIconPosition, j2, str2, z, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(final String str, final frv0 frv0Var, SelectionControlsMiddle$TitleIconPosition selectionControlsMiddle$TitleIconPosition, final long j, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        frv0 frv0Var2;
        SelectionControlsMiddle$TitleIconPosition selectionControlsMiddle$TitleIconPosition2;
        androidx.compose.runtime.a M = aVar.M(-1031881380);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            frv0Var2 = frv0Var;
            i2 |= M.J(frv0Var2) ? 32 : 16;
        } else {
            frv0Var2 = frv0Var;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(null) : M.y(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.o(selectionControlsMiddle$TitleIconPosition == null ? -1 : selectionControlsMiddle$TitleIconPosition.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.p(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1031881380, i2, -1, "com.vk.core.compose.component.controls.SelectionControlsMiddle.Companion.TitleRow (SelectionControlsMiddle.kt:123)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.r), bVar, M, 48);
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
            if (str != null) {
                M.K(2115987023);
                M.K(2116258428);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new zsw(19);
                    M.R(x);
                }
                int i3 = i2 << 3;
                int i4 = (i3 & 112) | 113246214 | (i3 & 896) | 4096 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016);
                frv0 frv0Var3 = frv0Var2;
                selectionControlsMiddle$TitleIconPosition2 = selectionControlsMiddle$TitleIconPosition;
                a.c(str, frv0Var3, selectionControlsMiddle$TitleIconPosition2, j, z, (izs) x, M, i4);
                M.j();
                M.j();
            } else {
                selectionControlsMiddle$TitleIconPosition2 = selectionControlsMiddle$TitleIconPosition;
                if (selectionControlsMiddle$TitleIconPosition2 == SelectionControlsMiddle$TitleIconPosition.ComponentEnd) {
                    M.K(2116469972);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    f9t.e(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 0);
                } else {
                    M.K(2111337922);
                }
                M.j();
            }
            M.K(2111337922);
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            selectionControlsMiddle$TitleIconPosition2 = selectionControlsMiddle$TitleIconPosition;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final SelectionControlsMiddle$TitleIconPosition selectionControlsMiddle$TitleIconPosition3 = selectionControlsMiddle$TitleIconPosition2;
            s.d = new wzs() { // from class: xsna.nci0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qci0.this.b(str, frv0Var, selectionControlsMiddle$TitleIconPosition3, j, z, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(final String str, final frv0 frv0Var, final SelectionControlsMiddle$TitleIconPosition selectionControlsMiddle$TitleIconPosition, final long j, final boolean z, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        frv0 frv0Var2;
        izs izsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-666694790);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            frv0Var2 = frv0Var;
            i2 |= M.J(frv0Var2) ? 256 : 128;
        } else {
            frv0Var2 = frv0Var;
        }
        if ((i & 24576) == 0) {
            i2 |= M.o(selectionControlsMiddle$TitleIconPosition == null ? -1 : selectionControlsMiddle$TitleIconPosition.ordinal()) ? 16384 : 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 8388608 : 4194304;
        } else {
            izsVar2 = izsVar;
        }
        if (M.t(i2 & 1, (4726931 & i2) != 4726930)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-666694790, i2, -1, "com.vk.core.compose.component.controls.SelectionControlsMiddle.Companion.TitleText (SelectionControlsMiddle.kt:158)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long g = zjq.g(ylu0Var.getText().m, !z);
            int i4 = a.$EnumSwitchMapping$0[selectionControlsMiddle$TitleIconPosition.ordinal()];
            q630 q630Var = q630.a.a;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                q630Var = tpg0Var.b(1.0f, q630Var, true);
            }
            aVar2 = M;
            yqv0.c(str, q630Var, g, null, null, 0, 0, null, 0, false, 0, 0, izsVar2, frv0Var2, aVar2, (i2 >> 3) & 14, ((i2 >> 15) & 896) | ((i2 << 3) & 7168), 4088);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.oci0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qci0.this.c(str, frv0Var, selectionControlsMiddle$TitleIconPosition, j, z, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
