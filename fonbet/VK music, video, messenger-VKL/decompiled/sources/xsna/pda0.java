package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class pda0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pda0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fqh0 fqh0Var;
        cri.a.e eVar;
        String str;
        cri.a.C2678a c2678a;
        int i;
        tlh0 tlh0Var;
        q630.a aVar;
        cri.a.b bVar;
        LayoutNode.a aVar2;
        cri.a.c cVar;
        cri.a.d dVar;
        String str2;
        frv0 frv0Var;
        switch (this.b) {
            case 0:
                ((GalleryFragmentImpl) this.d).P = ((PhotoVideoAttachActivity) this.c).Q.getBottom();
                return s3q0.a;
            default:
                fqh0 fqh0Var2 = (fqh0) this.c;
                wzs wzsVar = (wzs) this.d;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar3.J(spg0Var) ? 4 : 2;
                }
                if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-331823586, intValue, -1, "com.vk.core.compose.component.SearchDecorationBox.<anonymous> (VkSearchTextField.kt:177)");
                    }
                    boolean z = fqh0Var2.f;
                    String str3 = fqh0Var2.a;
                    tlh0 tlh0Var2 = fqh0Var2.c;
                    jiv0.c(z, aVar3, 0);
                    dt1.a.getClass();
                    ty6.b bVar2 = dt1.a.l;
                    q630.a aVar4 = q630.a.a;
                    q630 a = spg0Var.a(aVar4, bVar2);
                    float f = kqu0.t;
                    q630 b = spg0Var.b(1.0f, s200.E(a, f, f), true);
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, b);
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
                    cri.a.c cVar2 = cri.a.f;
                    k9q0.w(aVar3, d, cVar2);
                    cri.a.e eVar2 = cri.a.e;
                    k9q0.w(aVar3, D, eVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar3 = cri.a.g;
                    k9q0.w(aVar3, valueOf, bVar3);
                    cri.a.C2678a c2678a2 = cri.a.h;
                    k9q0.t(aVar3, c2678a2);
                    cri.a.d dVar2 = cri.a.d;
                    k9q0.w(aVar3, c, dVar2);
                    wzsVar.invoke(aVar3, 0);
                    if (str3.length() == 0) {
                        aVar3.K(-1432922777);
                        String str4 = fqh0Var2.b;
                        if (androidx.compose.runtime.b.d()) {
                            str2 = str4;
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        } else {
                            str2 = str4;
                        }
                        wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var2 = wuv0Var.N;
                        if (androidx.compose.runtime.b.d()) {
                            frv0Var = frv0Var2;
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        } else {
                            frv0Var = frv0Var2;
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getText().p;
                        tlh0Var = tlh0Var2;
                        aVar = aVar4;
                        aVar2 = aVar5;
                        dVar = dVar2;
                        c2678a = c2678a2;
                        str = str3;
                        bVar = bVar3;
                        fqh0Var = fqh0Var2;
                        eVar = eVar2;
                        cVar = cVar2;
                        i = 0;
                        yqv0.c(str2, null, j, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar3, 100663296, 48, 5882);
                        aVar3 = aVar3;
                    } else {
                        fqh0Var = fqh0Var2;
                        eVar = eVar2;
                        str = str3;
                        c2678a = c2678a2;
                        i = 0;
                        tlh0Var = tlh0Var2;
                        aVar = aVar4;
                        bVar = bVar3;
                        aVar2 = aVar5;
                        cVar = cVar2;
                        dVar = dVar2;
                        aVar3.K(-1439910146);
                    }
                    aVar3.j();
                    aVar3.G();
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, aVar3, i);
                    int hashCode2 = Long.hashCode(n34.n(aVar3));
                    sy90 D2 = aVar3.D();
                    q630 c2 = qri.c(aVar3, aVar);
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar2);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a2, cVar);
                    k9q0.w(aVar3, D2, eVar);
                    ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                    k9q0.w(aVar3, c2, dVar);
                    if (tlh0Var != null) {
                        aVar3.K(-1767270323);
                        tlh0Var.a(54, aVar3);
                    } else {
                        aVar3.K(-1774621632);
                    }
                    aVar3.j();
                    fqh0 fqh0Var3 = fqh0Var;
                    jiv0.a(str, fqh0Var3.d, fqh0Var3.e, aVar3, 6);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
