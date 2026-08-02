package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.feed.tool.view.newsfeed.digest.DigestLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;

/* compiled from: DigestGridHolder.kt */
/* loaded from: classes4.dex */
public final class dym extends qi6<Digest> implements ent0 {
    public final Lazy C;
    public final DigestLayout D;
    public final cym E;

    public dym(ViewGroup viewGroup, bpn0 bpn0Var) {
        super(R.layout.news_digest_grid, viewGroup);
        this.C = bpn0Var;
        DigestLayout digestLayout = (DigestLayout) this.itemView.findViewById(R.id.grid);
        this.D = digestLayout;
        cym cymVar = new cym(new jn4(this));
        this.E = cymVar;
        digestLayout.setColumnCount(3);
        digestLayout.setItemSpacing(iah0.a(5.0f));
        digestLayout.setAdapter(cymVar);
    }

    @Override // xsna.qi6
    public final void E6(Digest digest) {
        cym cymVar = this.E;
        cymVar.getClass();
        List<DigestItem> list = digest.m;
        ArrayList arrayList = cymVar.b;
        arrayList.clear();
        arrayList.addAll(list);
        DigestLayout digestLayout = cymVar.a;
        if (digestLayout != null) {
            GridLayout.Spec spec = DigestLayout.f;
            digestLayout.a();
        }
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        Digest q6 = q6();
        if (q6 != null) {
            Iterator<DigestItem> it = q6.m.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().h) {
                    break;
                }
                i++;
            }
            View childAt = this.D.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt != null ? childAt.getLayoutParams() : null;
            Object obj = layoutParams instanceof DigestLayout.b ? ((DigestLayout.b) layoutParams).a : null;
            ent0 ent0Var = obj instanceof ent0 ? (ent0) obj : null;
            if (ent0Var != null) {
                return ent0Var.q3();
            }
        }
        return null;
    }
}
