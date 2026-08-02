package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.input.InputSelect$State;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: VideoSearchFilterSpinner.kt */
/* loaded from: classes5.dex */
public final class ret0 {
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0116, code lost:
    
        if (r14 == androidx.compose.runtime.a.C0011a.a) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, final wzs wzsVar) {
        androidx.compose.runtime.a aVar2;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(-1607161868);
        int i2 = 256;
        int i3 = i | (M.J(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(wzsVar) ? 256 : 128);
        int i4 = 0;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            int i5 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1607161868, i3, -1, "com.vk.search.ui.DropDown (VideoSearchFilterSpinner.kt:69)");
            }
            q630.a aVar3 = q630.a.a;
            float f = 1.0f;
            q630 D = p490.D(txj0.h(txj0.f(aVar3, 1.0f), list.size() * 44), p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a2 = yu50.a(M, c, cri.a.d, -1506748407, list);
            final int i6 = 0;
            androidx.compose.runtime.a aVar5 = M;
            while (a2.hasNext()) {
                Object next = a2.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    e43.t();
                    throw null;
                }
                final ecr ecrVar = (ecr) next;
                String str = (String) izsVar.invoke(ecrVar);
                q630 a3 = o19.a(txj0.f(aVar3, f), ecrVar.isEnabled() ? f : 0.64f);
                boolean isEnabled = ecrVar.isEnabled();
                int i8 = ((i3 & 896) == i2 ? 1 : i4) | (aVar5.o(i6) ? 1 : 0) | (aVar5.y(ecrVar) ? 1 : 0);
                Object x = aVar5.x();
                if (i8 == 0) {
                    obj = x;
                }
                gzs gzsVar = new gzs() { // from class: xsna.pet0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        ecr ecrVar2 = ecrVar;
                        wzs.this.invoke(Integer.valueOf(i6), ecrVar2);
                        return s3q0.a;
                    }
                };
                aVar5.R(gzsVar);
                obj = gzsVar;
                q630 E = s200.E(ojc.c(a3, isEnabled, null, null, (gzs) obj, 14), kqu0.b, kqu0.v);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, i4, i5, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.a aVar6 = aVar5;
                yqv0.c(str, E, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.c0, aVar6, 0, 0, 8188);
                f = f;
                aVar5 = aVar6;
                i6 = i7;
                i4 = i4;
                i2 = i2;
                i5 = i5;
            }
            aVar2 = aVar5;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new a9c(i, 5, list, wzsVar, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String str, final String str2, final List list, final izs izsVar, final wzs wzsVar, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-252599605);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(list) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.y(wzsVar) ? 16384 : 8192) | (M.l(z) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-252599605, i2, -1, "com.vk.search.ui.VideoSearchFilterSpinner (VideoSearchFilterSpinner.kt:35)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new w3i(4, wh50Var);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            nvu0.a(g8s.b.a.a(s2x.b.a.b(str2, booleanValue, izsVar2, null, null, ylu0Var.getText().m, 0L, null, kai.c(551579606, new kxs(1, list, wzsVar, wh50Var, izsVar), M), aVar2, ((i2 >> 3) & 14) | 384, 952), InputSelect$State.Default, z, null, aVar2, ((i2 >> 9) & 896) | 24624, 8), null, h8s.a.a(str, false, null, null, null, aVar2, (i2 & 14) | 196608, 30), null, null, aVar2, 0, 26);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, str2, list, izsVar, wzsVar, z, i) { // from class: xsna.qet0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ List d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ wzs f;
                public final /* synthetic */ boolean g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ret0.b(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
