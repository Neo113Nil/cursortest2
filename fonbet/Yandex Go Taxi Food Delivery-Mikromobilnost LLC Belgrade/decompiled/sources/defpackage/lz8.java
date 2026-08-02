package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.summary.requirements.list.carousel.recycler.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class lz8 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ a c;
    public final /* synthetic */ pm5 w;

    public /* synthetic */ lz8(tls tlsVar, a aVar, pm5 pm5Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = aVar;
        this.w = pm5Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pm5 pm5Var = this.w;
        a aVar = this.c;
        tls tlsVar = this.b;
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        switch (i) {
            case 0:
                knj0 o = knj0.o(layoutInflater, viewGroup);
                RecyclerView recyclerView = o.a;
                xw31.E(recyclerView, null, null, null, Integer.valueOf(tje.u(8, recyclerView.getContext())));
                return new mz8(o, tlsVar, aVar, pm5Var);
            default:
                return new nz8(knj0.o(layoutInflater, viewGroup), tlsVar, aVar, pm5Var);
        }
    }
}
