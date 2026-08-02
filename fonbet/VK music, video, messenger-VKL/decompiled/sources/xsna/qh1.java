package xsna;

import androidx.recyclerview.widget.m;
import com.vk.photos.root.albumdetails.presentation.k;
import java.util.ArrayList;

/* compiled from: AlbumDetailsPhoto.kt */
/* loaded from: classes4.dex */
public final class qh1 extends m.e<k.c.C1491c> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(k.c.C1491c c1491c, k.c.C1491c c1491c2) {
        return c1491c.equals(c1491c2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(k.c.C1491c c1491c, k.c.C1491c c1491c2) {
        return c1491c.a.c == c1491c2.a.c;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(k.c.C1491c c1491c, k.c.C1491c c1491c2) {
        k.c.C1491c c1491c3 = c1491c;
        k.c.C1491c c1491c4 = c1491c2;
        ArrayList arrayList = new ArrayList();
        boolean z = c1491c3.d;
        boolean z2 = c1491c4.d;
        if (!epx.f(c1491c3.a.y, c1491c4.a.y) || z != z2) {
            arrayList.add(baa0.IMAGE);
        }
        if (c1491c3.c != c1491c4.c) {
            arrayList.add(baa0.CLICK_LISTENER);
        }
        if (!epx.f(c1491c3.b, c1491c4.b)) {
            arrayList.add(baa0.SELECTED);
        }
        return arrayList;
    }
}
