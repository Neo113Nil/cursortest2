package xsna;

import com.google.common.collect.ImmutableList;
import com.vk.dto.fave.MarketFavable;
import java.util.List;
import xsna.npl;
import xsna.uon0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class wll implements uon0.a, npl.h.a, io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wll(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.npl.h.a
    public com.google.common.collect.g a(int i, pfp0 pfp0Var, int[] iArr) {
        npl.d dVar = (npl.d) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        ImmutableList.b bVar = ImmutableList.c;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i2 = 0; i2 < pfp0Var.a; i2++) {
            aVar.c(new npl.g(i, pfp0Var, i2, dVar, iArr[i2], str, str2));
        }
        return aVar.g();
    }

    @Override // xsna.uon0.a
    public Object execute() {
        yll yllVar = (yll) this.b;
        eo5 eo5Var = (eo5) this.c;
        yllVar.d.O3(eo5Var, (a0q) this.d);
        yllVar.a.b(eo5Var, 1);
        return null;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        b5u b5uVar = (b5u) this.b;
        lml0 lml0Var = (lml0) this.c;
        List list = (List) this.d;
        MarketFavable s = ao8.s(b5uVar.a);
        bml0 bml0Var = (bml0) lml0Var.c.a.getValue();
        isq.b(bml0Var.b, bml0Var.a, s, null, new wbi(11, s, new ud0(yVar, lml0Var, list, 3)), new ue40(7, s, new l2e(yVar, lml0Var, list, 6)), false, null, null, 480);
    }
}
