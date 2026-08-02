package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.narratives.Narrative;
import java.util.List;
import xsna.gu1;

/* compiled from: AllHighlightsAdapter.kt */
/* loaded from: classes3.dex */
public final class xt1 extends m.b {
    public final /* synthetic */ List<gu1> b;
    public final /* synthetic */ List<gu1> c;

    /* JADX WARN: Multi-variable type inference failed */
    public xt1(List<? extends gu1> list, List<? extends gu1> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        List<gu1> list = this.b;
        gu1 gu1Var = list.get(i);
        List<gu1> list2 = this.c;
        gu1 gu1Var2 = list2.get(i2);
        if (!(gu1Var instanceof gu1.b) || !(gu1Var2 instanceof gu1.b)) {
            return epx.f(list.get(i), list2.get(i2));
        }
        Narrative narrative = ((gu1.b) gu1Var).b;
        Narrative narrative2 = ((gu1.b) gu1Var2).b;
        return epx.f(narrative, narrative2) && epx.f(narrative.d, narrative2.d) && epx.f(narrative.e, narrative2.e) && epx.f(narrative.l, narrative2.l) && narrative.k == narrative2.k && narrative.j == narrative2.j;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        gu1 gu1Var = this.b.get(i);
        gu1 gu1Var2 = this.c.get(i2);
        gu1.a aVar = gu1.a.b;
        if (epx.f(gu1Var, aVar) && epx.f(gu1Var2, aVar)) {
            return true;
        }
        return ((gu1Var instanceof gu1.b) && (gu1Var2 instanceof gu1.b)) ? epx.f(((gu1.b) gu1Var).b, ((gu1.b) gu1Var2).b) : (gu1Var instanceof gu1.c) && (gu1Var2 instanceof gu1.c);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.b.size();
    }
}
