package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import kotlin.Triple;
import xsna.q630;

/* compiled from: DonutBadge.kt */
/* loaded from: classes18.dex */
public final class own {
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0135, code lost:
    
        if (r6 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final us2 us2Var, q630 q630Var, gzs<s3q0> gzsVar, long j, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        gzs<s3q0> gzsVar2;
        int i4;
        final long j2;
        final q630 q630Var3;
        final gzs<s3q0> gzsVar3;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(1334615550);
        int i5 = i | (M.J(us2Var) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i5 | (M.J(q630Var2) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
            gzsVar2 = gzsVar;
        } else {
            gzsVar2 = gzsVar;
            i4 = i3 | (M.y(gzsVar2) ? 256 : 128);
        }
        int i8 = i4 | 3072;
        if (M.t(i8 & 1, (i8 & 1171) != 1170)) {
            q630.a aVar2 = q630.a.a;
            q630 q630Var5 = i6 != 0 ? aVar2 : q630Var2;
            gzs<s3q0> gzsVar4 = i7 != 0 ? null : gzsVar2;
            long j3 = l5g.k;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1334615550, i8, -1, "com.vk.donut.design.compose.badge.DonutBadge (DonutBadge.kt:29)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            M.K(1020162217);
            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j4 = ylu0Var.getText().o;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ContentBadgeAppearance.a aVar3 = new ContentBadgeAppearance.a(12, ylu0Var2.getBackground().j, j4, 0L);
            qzu0.a.getClass();
            Triple triple = new Triple(contentBadgeMode, aVar3, qzu0.I(M));
            M.j();
            ContentBadgeMode contentBadgeMode2 = (ContentBadgeMode) triple.d();
            ContentBadgeAppearance contentBadgeAppearance = (ContentBadgeAppearance) triple.g();
            lg90 lg90Var = (lg90) triple.h();
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Medium;
            M.K(-1629644162);
            if (gzsVar4 != null) {
                boolean J = M.J(gzsVar4);
                Object x2 = M.x();
                if (J || x2 == c0012a) {
                    x2 = new nn0(1, gzsVar4);
                    M.R(x2);
                }
                q630Var4 = q630Var5.g(ojc.b(aVar2, sg50Var, null, false, null, (gzs) x2, 28));
            }
            q630Var4 = q630Var5;
            M.j();
            q630 q630Var6 = q630Var5;
            gzs<s3q0> gzsVar5 = gzsVar4;
            rnu0.e(contentBadgeSize, contentBadgeMode2, contentBadgeAppearance, ahn.E(q630Var4, "donut_badge_badge"), lmc.f(lg90Var, new l5g(j3), M, 440, 0), us2Var, M, ((i8 << 15) & 458752) | 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = j3;
            q630Var3 = q630Var6;
            gzsVar3 = gzsVar5;
        } else {
            M.h();
            j2 = j;
            q630Var3 = q630Var2;
            gzsVar3 = gzsVar2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var3, gzsVar3, j2, i, i2) { // from class: xsna.nwn
                public final /* synthetic */ q630 c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ long e;
                public final /* synthetic */ int f;

                {
                    this.f = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    own.a(us2.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I, this.f);
                    return s3q0.a;
                }
            };
        }
    }
}
