package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;
import ru.yandex.taxi.preorder.suggested.selection.b;

/* loaded from: classes6.dex */
public final class gcv0 extends RecyclerView.g {
    public final /* synthetic */ SuggestsView a;

    public gcv0(SuggestsView suggestsView) {
        this.a = suggestsView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        b bVar;
        b bVar2;
        b bVar3;
        String str;
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int M1 = linearLayoutManager.M1();
            int H1 = linearLayoutManager.H1();
            int itemCount = linearLayoutManager.getItemCount() - 1;
            SuggestsView suggestsView = this.a;
            if (M1 == itemCount) {
                bVar3 = suggestsView.adapter;
                if (bVar3 == null) {
                    bVar3 = null;
                }
                int i3 = 0;
                for (b8v0 b8v0Var : bVar3.x) {
                    if ((b8v0Var instanceof x9v0) && ((str = ((x9v0) b8v0Var).A) == null || str.length() == 0)) {
                        i3++;
                    }
                }
                ((SuggestsView.a) bVar3.y.b).N0(i3);
            }
            if (H1 == 0 && i2 != 0) {
                bVar2 = suggestsView.adapter;
                ((SuggestsView.a) (bVar2 != null ? bVar2 : null).y.b).w6();
            } else if (i2 > 0) {
                bVar = suggestsView.adapter;
                ((SuggestsView.a) (bVar != null ? bVar : null).y.b).T8();
            }
        }
    }
}
