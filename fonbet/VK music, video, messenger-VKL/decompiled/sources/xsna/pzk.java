package xsna;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class pzk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ String b;
    public final /* synthetic */ vxk c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    public pzk(String str, vxk vxkVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = str;
        this.c = vxkVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        mtk0 b;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a aVar3 = aVar;
        int intValue = num.intValue();
        if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1126347158, intValue, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:2032)");
            }
            float f = zzk.g;
            float f2 = zzk.e;
            q630.a aVar4 = q630.a.a;
            q630 n = txj0.n(aVar4, f, f2);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int m = n34.m(aVar3);
            sy90 D = aVar3.D();
            q630 c = qri.c(aVar3, n);
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
            k9q0.w(aVar3, d, cri.a.f);
            k9q0.w(aVar3, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (aVar3.L() || !epx.f(aVar3.x(), Integer.valueOf(m))) {
                kr.a(m, aVar3, m, bVar);
            }
            k9q0.w(aVar3, c, cri.a.d);
            Object x = aVar3.x();
            if (x == a.C0011a.a) {
                x = new sm(18);
                aVar3.R(x);
            }
            q630 a = egi0.a(aVar4, (izs) x);
            vxk vxkVar = this.c;
            long j = vxkVar.o;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1233694918, 0, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:940)");
            }
            boolean z = this.e;
            boolean z2 = this.f;
            boolean z3 = this.g;
            if (z && z3) {
                j = vxkVar.p;
            } else if (z && !z3) {
                j = vxkVar.q;
            } else if (z2 && z3) {
                j = vxkVar.w;
            } else if (!z2 || z3) {
                if (this.d && z3) {
                    j = vxkVar.t;
                } else if (z3) {
                    j = vxkVar.n;
                }
            }
            long j2 = j;
            if (z2) {
                aVar3.K(-969483020);
                b = androidx.compose.runtime.k.c(new l5g(j2), aVar3, 0);
                aVar3.j();
                aVar2 = aVar3;
            } else {
                aVar3.K(-969417610);
                b = lwj0.b(j2, lb30.a(MotionSchemeKeyTokens.DefaultEffects, aVar3), null, aVar3, 0, 12);
                aVar2 = aVar3;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            cjo0.c(this.b, a, ((l5g) b.getValue()).a, 0L, 0L, new obo0(3), 0L, 0, false, 0, 0, null, aVar2, 0, 0, 261112);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3.h();
        }
        return s3q0.a;
    }
}
