package xsna;

import com.vk.core.compose.component.cell.content.RichCell$Middle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rgk implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rgk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                ygk ygkVar = (ygk) this.c;
                float floatValue = ((Float) obj3).floatValue();
                ((Float) obj4).floatValue();
                ((zak0) ygkVar.i).setValue(Boolean.TRUE);
                ygkVar.j(floatValue, ((ov70) obj2).a);
                break;
            default:
                RichCell$Middle.c.a aVar = (RichCell$Middle.c.a) this.c;
                spg0 spg0Var = (spg0) obj;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar2.J(spg0Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar2.J(q630Var) ? 32 : 16;
                }
                if (aVar2.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1072589940, i, -1, "com.vk.core.compose.component.cell.content.toSexyCellAlong.<anonymous> (SexyMiddleTextImpl.kt:271)");
                    }
                    aVar.b(spg0Var, q630Var, RichCell$Middle.Size.Medium, aVar2, (i & 14) | 384 | (i & 112));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
