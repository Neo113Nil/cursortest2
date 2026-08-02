package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: MovieTextField.kt */
/* loaded from: classes16.dex */
public final class mf30 implements vbp0 {
    public final UIBlockTopshelf.TopshelfItem a;
    public final View b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    public mf30(ConstraintLayout constraintLayout, LayoutInflater layoutInflater, boolean z, UIBlockTopshelf.TopshelfItem topshelfItem, boolean z2) {
        int i;
        Collection collection;
        UIBlockTopshelf.a aVar = topshelfItem.d;
        this.a = topshelfItem;
        boolean z3 = false;
        View inflate = layoutInflater.inflate(R.layout.catalog_video_topshelf, (ViewGroup) constraintLayout, false);
        if (z) {
            i = (int) layoutInflater.getContext().getResources().getDimension(R.dimen.video_topshelf_tablet_texts_width);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = -1;
        }
        inflate.setLayoutParams(new ConstraintLayout.b(i, -2));
        ((TextView) inflate.findViewById(R.id.title)).setText(aVar.c.g());
        ((TextView) inflate.findViewById(R.id.subtitle)).setText(aVar.c.d());
        ComposeView composeView = (ComposeView) inflate.findViewById(R.id.metaCount);
        composeView.setContent(new jai(253100468, new zu3(this, 11), true));
        if ((topshelfItem instanceof UIBlockTopshelf.TopshelfPlaylist) && topshelfItem.f != null) {
            z3 = true;
        }
        bwt0.p0(composeView, z3);
        UIBlockTopshelf.TopshelfMeta topshelfMeta = aVar.d;
        StringBuilder sb = new StringBuilder();
        String h = topshelfMeta.h();
        if (h != null) {
            h = drm0.N(h) ? null : h;
            if (h != null) {
                sb.append(drm0.p0(h).toString());
            }
        }
        List<String> g = topshelfMeta.g();
        if (g != null) {
            List V = j5g.V(g);
            ArrayList arrayList = new ArrayList(c5g.u(V, 10));
            Iterator it = V.iterator();
            while (it.hasNext()) {
                arrayList.add(drm0.p0((String) it.next()).toString());
            }
            collection = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!drm0.N((String) next)) {
                    collection.add(next);
                }
            }
        } else {
            collection = 0;
        }
        collection = collection == 0 ? EmptyList.b : collection;
        if (!collection.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            int size = collection.size();
            ArrayList arrayList2 = collection;
            if (size > 3) {
                ArrayList arrayList3 = new ArrayList(j5g.H0(collection, 3));
                arrayList3.set(e43.h(arrayList3), ((String) j5g.i0(arrayList3)) + "...");
                arrayList2 = arrayList3;
            }
            sb.append(j5g.g0(arrayList2, ", ", null, null, 0, null, 62));
        }
        String d = topshelfMeta.d();
        if (d != null) {
            d = (drm0.N(d) || !z2) ? null : d;
            if (d != null) {
                if (sb.length() > 0) {
                    sb.append(" · ");
                }
                sb.append(drm0.p0(d).toString());
            }
        }
        String sb2 = sb.toString();
        ((TextView) inflate.findViewById(R.id.metaInfo)).setText(drm0.N(sb2) ? null : sb2);
        this.b = inflate;
    }

    @Override // xsna.vbp0
    public final View getView() {
        return this.b;
    }

    @Override // xsna.vbp0
    public final void destroy() {
    }
}
