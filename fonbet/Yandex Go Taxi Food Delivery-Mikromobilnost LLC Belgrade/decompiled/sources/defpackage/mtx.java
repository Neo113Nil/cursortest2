package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class mtx extends RecyclerView.g {
    public Integer a;
    public final /* synthetic */ LinearLayoutManager b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Div2View d;
    public final /* synthetic */ rvo e;

    public mtx(LinearLayoutManager linearLayoutManager, ArrayList arrayList, Div2View div2View, rvo rvoVar) {
        this.b = linearLayoutManager;
        this.c = arrayList;
        this.d = div2View;
        this.e = rvoVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        List<v3k> list;
        LinearLayoutManager linearLayoutManager = this.b;
        if (linearLayoutManager != null) {
            int M1 = linearLayoutManager.M1();
            Integer num = this.a;
            if (num != null && M1 == num.intValue()) {
                return;
            }
            boolean z = this.a == null;
            this.a = Integer.valueOf(M1);
            if (z || (list = this.c) == null) {
                return;
            }
            for (v3k v3kVar : list) {
                Div2View div2View = this.d;
                y6k actionHandler = div2View.getActionHandler();
                if (actionHandler != null) {
                    actionHandler.handleAction(v3kVar, div2View, this.e);
                }
            }
        }
    }
}
