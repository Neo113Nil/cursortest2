package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class hru extends lys {
    public static final /* synthetic */ int T = 0;
    public final qw8 S;

    public hru(pqw0 pqw0Var, tls tlsVar) {
        super(pqw0Var);
        pw8 pw8Var = new pw8(1, tlsVar);
        g0c a = qoi0.a(cru.class);
        sw41 sw41Var = new sw41(2);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, sw41Var);
        g0c a3 = qoi0.a(bru.class);
        qw8 qw8Var = new qw8(pw8Var, scc.g(zxsVar, new zxs(a3.a(), 0, null, emptyList, null, new jiz0(27))), 1);
        this.S = qw8Var;
        RecyclerView recyclerView = pqw0Var.b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(qw8Var);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        eru eruVar = (eru) obj;
        RobotoTextView robotoTextView = ((pqw0) ((zo31) this.R)).c;
        zqu zquVar = eruVar.a;
        robotoTextView.setVisibility((zquVar != null ? zquVar.a : null) != null ? 0 : 8);
        zqu zquVar2 = eruVar.a;
        robotoTextView.setText(zquVar2 != null ? zquVar2.a : null);
        this.S.submitList(eruVar.b, null);
    }
}
