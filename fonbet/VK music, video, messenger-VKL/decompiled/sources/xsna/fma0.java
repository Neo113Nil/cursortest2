package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PinGrid.kt */
/* loaded from: classes15.dex */
public final class fma0 {
    public static final void a(final float f, final izs izsVar, final gzs gzsVar, final jai jaiVar, final q630 q630Var, final boolean z, long j, final float f2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final long j2;
        boolean z2;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(-1127082590);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(jaiVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | (M.l(z) ? 131072 : 65536) | 1572864 | (M.n(f2) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            long j3 = l5g.j;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1127082590, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.view.PinGrid (PinGrid.kt:37)");
            }
            ArrayList arrayList = new ArrayList(3);
            for (int i3 = 0; i3 < 3; i3++) {
                ArrayList arrayList2 = new ArrayList(3);
                for (int i4 = 0; i4 < 3; i4++) {
                    arrayList2.add(Integer.valueOf((i3 * 3) + 1 + i4));
                }
                arrayList.add(arrayList2);
            }
            boolean z4 = true;
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                HashSet hashSet = iah0.a;
                x = fnj.b(context) ? androidx.compose.foundation.layout.a.f : androidx.compose.foundation.layout.a.g;
                M.R(x);
            }
            a.f fVar = (a.f) x;
            q630 F = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.d(q630Var, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(fVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(150461015);
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                q630.a aVar4 = q630.a.a;
                if (hasNext) {
                    List list = (List) it.next();
                    q630 f3 = txj0.f(aVar4, 1.0f);
                    dt1.a.getClass();
                    Iterator it2 = it;
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(fVar, dt1.a.k, M, 6);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, f3);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a2, cri.a.f);
                    k9q0.w(M, D2, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c2, cri.a.d);
                    M.K(-1614526440);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        int intValue = ((Number) it3.next()).intValue();
                        boolean y = M.y(context) | M.o(intValue);
                        Object x2 = M.x();
                        if (y || x2 == c0012a) {
                            x2 = new w53(context, intValue, 3);
                            M.R(x2);
                        }
                        q630 b = egi0.b(aVar4, false, (izs) x2);
                        a.f fVar2 = fVar;
                        long j4 = j3;
                        String valueOf = String.valueOf(intValue);
                        boolean o = ((i2 & 112) == 32 ? z4 : false) | M.o(intValue);
                        Object x3 = M.x();
                        if (o || x3 == c0012a) {
                            x3 = new uif(intValue, z4 ? 1 : 0, izsVar);
                            M.R(x3);
                        }
                        androidx.compose.runtime.a aVar6 = M;
                        sna0.a(valueOf, j4, f, (gzs) x3, b, aVar6, Tensorflow.FRAME_WIDTH);
                        c0012a = c0012a;
                        j3 = j4;
                        M = aVar6;
                        z4 = true;
                        fVar = fVar2;
                    }
                    long j5 = j3;
                    androidx.compose.runtime.a aVar7 = M;
                    aVar7.j();
                    aVar7.G();
                    M = aVar7;
                    j3 = j5;
                    it = it2;
                    z4 = true;
                    fVar = fVar;
                } else {
                    long j6 = j3;
                    androidx.compose.runtime.a aVar8 = M;
                    a.C0011a.C0012a c0012a2 = c0012a;
                    aVar8.j();
                    q630 f4 = txj0.f(aVar4, 1.0f);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(fVar, dt1.a.k, aVar8, 6);
                    int hashCode3 = Long.hashCode(n34.n(aVar8));
                    sy90 D3 = aVar8.D();
                    q630 c3 = qri.c(aVar8, f4);
                    cri.h7.getClass();
                    LayoutNode.a aVar9 = cri.a.b;
                    if (aVar8.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar8.H();
                    if (aVar8.L()) {
                        aVar8.I(aVar9);
                    } else {
                        aVar8.f();
                    }
                    k9q0.w(aVar8, a3, cri.a.f);
                    k9q0.w(aVar8, D3, cri.a.e);
                    k9q0.w(aVar8, Integer.valueOf(hashCode3), cri.a.g);
                    k9q0.t(aVar8, cri.a.h);
                    k9q0.w(aVar8, c3, cri.a.d);
                    boolean y2 = aVar8.y(context);
                    Object x4 = aVar8.x();
                    if (y2 || x4 == c0012a2) {
                        z2 = true;
                        x4 = new wbv(context, 1);
                        aVar8.R(x4);
                    } else {
                        z2 = true;
                    }
                    yj6.a(j6, f, gzsVar, o19.a(egi0.b(aVar4, false, (izs) x4), z ? 1.0f : 0.0f), iji.a, aVar8, 24630 | (i2 & 896), 0);
                    boolean y3 = aVar8.y(context);
                    Object x5 = aVar8.x();
                    if (y3 || x5 == c0012a2) {
                        z3 = false;
                        x5 = new dma0(context, 0);
                        aVar8.R(x5);
                    } else {
                        z3 = false;
                    }
                    q630 b2 = egi0.b(aVar4, z3, (izs) x5);
                    if ((i2 & 112) == 32) {
                        z3 = z2;
                    }
                    Object x6 = aVar8.x();
                    if (z3 || x6 == c0012a2) {
                        x6 = new sv7(izsVar, 4);
                        aVar8.R(x6);
                    }
                    sna0.a("0", j6, f, (gzs) x6, b2, aVar8, Tensorflow.FRAME_WIDTH);
                    aVar2 = aVar8;
                    jaiVar.invoke(aVar2, Integer.valueOf((i2 >> 9) & 14));
                    aVar2.G();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = j6;
                }
            }
        } else {
            aVar2 = M;
            aVar2.h();
            j2 = j;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(f, izsVar, gzsVar, jaiVar, q630Var, z, j2, f2, i) { // from class: xsna.ema0
                public final /* synthetic */ float b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ jai e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ long h;
                public final /* synthetic */ float i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(7);
                    fma0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
