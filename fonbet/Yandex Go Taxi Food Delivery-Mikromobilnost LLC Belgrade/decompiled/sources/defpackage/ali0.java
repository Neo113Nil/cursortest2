package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes14.dex */
public final /* synthetic */ class ali0 implements zls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ m3u0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ali0(int i, m3u0 m3u0Var) {
        this.c = i;
        this.b = m3u0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        aa10 w;
        aa10 w2;
        int i = this.a;
        int i2 = this.c;
        m3u0 m3u0Var = this.b;
        k kVar = (k) obj;
        x910 x910Var = (x910) obj2;
        n8e n8eVar = (n8e) obj3;
        switch (i) {
            case 0:
                o l0 = x910Var.l0(n8eVar.a);
                int i3 = (i2 / 2) - l0.b;
                if (i3 < 0) {
                    i3 = 0;
                }
                int abs = (int) (Math.abs(((Number) m3u0Var.getValue()).floatValue()) * i3);
                w = kVar.w(l0.a, l0.b + (abs >= 0 ? abs : 0), b.f(), new q83(l0, 10));
                return w;
            default:
                o l02 = x910Var.l0(n8eVar.a);
                int intValue = ((Number) m3u0Var.getValue()).intValue();
                int i4 = l02.b;
                if (intValue != 0) {
                    int i5 = i4 + intValue + i2;
                    i4 = i5 >= 0 ? i5 : 0;
                }
                w2 = kVar.w(l02.a, i4, b.f(), new q83(l02, 17));
                return w2;
        }
    }

    public /* synthetic */ ali0(m3u0 m3u0Var, int i) {
        this.b = m3u0Var;
        this.c = i;
    }
}
