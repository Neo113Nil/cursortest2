package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import xsna.xxt0;

/* compiled from: ViewHolderPlayerHoldersProviderFactory.kt */
/* loaded from: classes17.dex */
public final class yxt0 implements v1b0 {
    public final LinearLayoutManager a;
    public final /* synthetic */ q8e b;
    public final /* synthetic */ xxt0 c;

    public yxt0(q8e q8eVar, xxt0 xxt0Var) {
        this.b = q8eVar;
        this.c = xxt0Var;
        this.a = (LinearLayoutManager) q8eVar.getLayoutManager();
    }

    @Override // xsna.v1b0
    public final t1b0 a(int i) {
        o0f o0fVar;
        RecyclerView.e0 findViewHolderForLayoutPosition = this.b.findViewHolderForLayoutPosition(i);
        if (findViewHolderForLayoutPosition == null || this.a.v() == -1 || (o0fVar = (o0f) this.c.a.invoke(findViewHolderForLayoutPosition)) == null) {
            return null;
        }
        return new xxt0.a(o0fVar);
    }

    @Override // xsna.v1b0
    public final List<Integer> b() {
        q8e q8eVar = this.b;
        int childCount = q8eVar.getChildCount();
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            arrayList.add(Integer.valueOf(this.a.getPosition(q8eVar.getChildAt(i))));
        }
        return arrayList;
    }
}
