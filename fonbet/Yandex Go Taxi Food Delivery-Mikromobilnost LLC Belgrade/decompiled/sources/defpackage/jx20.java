package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class jx20 implements z910 {
    public final /* synthetic */ bz40 a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ jh6 c;

    public jx20(bz40 bz40Var, wg6 wg6Var, jh6 jh6Var) {
        this.a = bz40Var;
        this.b = wg6Var;
        this.c = jh6Var;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        x910 x910Var = (x910) list.get(0);
        x910 x910Var2 = (x910) list.get(1);
        x910 x910Var3 = (x910) list.get(2);
        x910 x910Var4 = (x910) list.get(3);
        x910 x910Var5 = (x910) list.get(4);
        final o l0 = x910Var.l0(n8e.b(n8e.i(j), j, 0, 0, 0, 10));
        final o l02 = x910Var5.l0(n8e.b(n8e.i(j), j, 0, 0, 0, 10));
        int h = n8e.h(j) - l0.b;
        this.a.e.setIntValue(l02.b);
        final o l03 = x910Var3.l0(n8e.b(n8e.i(j), j, 0, 0, h, 2));
        final o l04 = x910Var4.l0(n8e.b(n8e.i(j), j, 0, 0, 0, 10));
        final o l05 = x910Var2.l0(n8e.b(n8e.i(j), j, 0, 0, 0, 10));
        int i = n8e.i(j);
        final int h2 = n8e.h(j);
        wg6 wg6Var = this.b;
        wg6Var.B.setIntValue(h2);
        wg6Var.A.setIntValue(l03.b);
        wg6Var.C.setIntValue(l02.b);
        final jh6 jh6Var = this.c;
        w = kVar.w(i, h2, b.f(), new tls() { // from class: ix20
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a aVar = (o.a) obj;
                o oVar = o.this;
                int i2 = oVar.b;
                int i3 = h2;
                jh6Var.getClass();
                aVar.g(oVar, 0, i3 - i2, 0.0f);
                o oVar2 = l05;
                aVar.g(oVar2, 0, i3 - oVar2.b, 0.0f);
                aVar.g(l03, 0, i3, 0.0f);
                o oVar3 = l04;
                aVar.g(oVar3, 0, i3 - oVar3.b, 0.0f);
                o oVar4 = l02;
                aVar.g(oVar4, 0, i3 - oVar4.b, 0.0f);
                return zy11.a;
            }
        });
        return w;
    }
}
