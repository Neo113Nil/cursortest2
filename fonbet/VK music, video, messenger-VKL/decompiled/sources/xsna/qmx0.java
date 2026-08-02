package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.d;
import com.vk.core.compose.component.group.header.f;
import java.util.HashSet;
import ru.ok.gl.tf.Tensorflow;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: WidgetContainer.kt */
/* loaded from: classes17.dex */
public final class qmx0 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final rmx0 rmx0Var, q630 q630Var, final izs izsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        q630 q630Var5;
        int i4;
        q630.a aVar2;
        int i5;
        String str;
        a.C0011a.C0012a c0012a;
        com.vk.core.compose.component.group.header.d dVar;
        a.C0011a.C0012a c0012a2;
        int i6;
        String str2;
        Integer num = rmx0Var.c;
        String str3 = rmx0Var.d;
        androidx.compose.runtime.a M = aVar.M(-1821766208);
        int i7 = i | (M.J(rmx0Var) ? 4 : 2);
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i7 |= M.J(q630Var2) ? 32 : 16;
            i3 = i7 | (!M.y(izsVar) ? 256 : 128);
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630.a aVar3 = q630.a.a;
                q630 q630Var6 = i8 != 0 ? aVar3 : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1821766208, i3, -1, "com.vk.community.design.compose.widget.WidgetContainer (WidgetContainer.kt:47)");
                }
                q630 f = txj0.f(q630Var6, 1.0f);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, f);
                cri.h7.getClass();
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
                k9q0.w(M, a, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                String str4 = rmx0Var.a;
                a.C0011a.C0012a c0012a3 = a.C0011a.a;
                if (str4 == null) {
                    M.K(-1559542985);
                    M.j();
                    i4 = i3;
                    q630Var5 = q630Var6;
                    c0012a2 = c0012a3;
                    aVar2 = aVar3;
                    i6 = 2;
                } else {
                    M.K(-1559542984);
                    b.c cVar = b.c.a;
                    M.K(226790041);
                    String str5 = rmx0Var.b;
                    if (str5 == null || drm0.N(str5)) {
                        q630Var4 = aVar3;
                    } else {
                        boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
                        Object x = M.x();
                        if (z || x == c0012a3) {
                            x = new ocv0(1, izsVar, rmx0Var);
                            M.R(x);
                        }
                        q630Var4 = ojc.c(aVar3, false, null, null, (gzs) x, 15);
                    }
                    M.j();
                    if (num == null) {
                        M.K(-1453242455);
                        M.j();
                        i4 = i3;
                        q630Var5 = q630Var6;
                        i5 = 1;
                        aVar2 = aVar3;
                        str = str4;
                        c0012a = c0012a3;
                        dVar = null;
                    } else {
                        M.K(-1453242454);
                        CounterSize counterSize = CounterSize.Small;
                        q630 q630Var7 = q630Var6;
                        CounterAppearance.Design design = CounterAppearance.Design.Neutral;
                        CounterMode counterMode = CounterMode.Tertiary;
                        int intValue = num.intValue();
                        q630Var5 = q630Var7;
                        i4 = i3;
                        aVar2 = aVar3;
                        i5 = 1;
                        str = str4;
                        c0012a = c0012a3;
                        com.vk.core.compose.component.group.header.d a2 = d.a.a(intValue, design, counterMode, counterSize, null, M, 200112, 16);
                        M.j();
                        dVar = a2;
                    }
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new nuv0(i5);
                        M.R(x2);
                    }
                    c0012a2 = c0012a;
                    i6 = 2;
                    com.vk.core.compose.component.group.header.g.b(f.a.a(str, null, dVar, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, false, M, 805306368, 442), q630Var4, cVar, null, null, null, false, M, 384, 120);
                    M = M;
                    s3q0 s3q0Var = s3q0.a;
                    M.j();
                }
                jaiVar.invoke(M, 6);
                boolean z2 = str3 == null || drm0.N(str3) || (str2 = rmx0Var.e) == null || drm0.N(str2);
                Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                HashSet hashSet = iah0.a;
                SeparatorDpi separatorDpi = fnj.d(context) ? SeparatorDpi.At2x : SeparatorDpi.At3x;
                if (z2) {
                    M.K(-1557557620);
                    ck70.b(aVar2, 4, M, 6);
                } else {
                    M.K(-1558250749);
                    q630.a aVar5 = aVar2;
                    androidx.compose.runtime.a aVar6 = M;
                    ijv0.c(separatorDpi, SeparatorAppearance.Primary, s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i6, aVar5), aVar6, Tensorflow.FRAME_WIDTH, 0);
                    q630 E = ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 1, txj0.f(aVar5, 1.0f)), "CommunityProfileWidgetButton");
                    gio0 a3 = cp8.d.a.a(str3, null, aVar6, 3072, 6);
                    ButtonSize buttonSize = ButtonSize.Small;
                    ButtonStyle buttonStyle = ButtonStyle.Link;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean z3 = ((i4 & 896) == 256) | ((i4 & 14) == 4);
                    Object x3 = aVar6.x();
                    if (z3 || x3 == c0012a2) {
                        x3 = new d5(27, izsVar, rmx0Var);
                        aVar6.R(x3);
                    }
                    bhu0.d((gzs) x3, buttonStyle, buttonAppearance, E, buttonSize, null, null, a3, false, null, aVar6, 25008, 3936);
                    M = aVar6;
                    M.j();
                }
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.pmx0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qmx0.a(rmx0.this, q630Var3, izsVar, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i3 = i7 | (!M.y(izsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
