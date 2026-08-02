package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.rie;

/* compiled from: ClipsItemsCacheRecyclerListenerImpl.kt */
/* loaded from: classes16.dex */
public final class uie extends rie {
    public final oie b;
    public final ClipFeedListFragment.g c;
    public int d;
    public boolean e;

    public uie(oie oieVar, ClipFeedListFragment.g gVar) {
        this.b = oieVar;
        this.c = gVar;
    }

    @Override // xsna.rie
    public final void l(RecyclerView recyclerView) {
        n(recyclerView);
    }

    @Override // xsna.rie
    public final void m() {
        this.d = 0;
    }

    public final void n(RecyclerView recyclerView) {
        ClipFeedListFragment.g gVar = this.c;
        ClipFeedListFragment clipFeedListFragment = ClipFeedListFragment.this;
        int i = ClipFeedListFragment.a2;
        int size = clipFeedListFragment.ro().size();
        int i2 = size - 1;
        if (size == 0) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        if (this.d <= x) {
            this.d = x;
            int min = Math.min(i2, x + 1);
            oie oieVar = this.b;
            int min2 = Math.min(i2, oieVar.b() + min);
            int min3 = Math.min(i2, v);
            int min4 = Math.min(i2, x);
            ArrayList a = gVar.a(new k9x(min, min2, 1));
            ArrayList arrayList = new ArrayList();
            for (Object obj : a) {
                if (obj instanceof rie.a.C3610a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((rie.a.C3610a) it.next()).a);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                SdkVideoFile sdkVideoFile = (SdkVideoFile) next;
                if (!dgd.c(sdkVideoFile) && !sdkVideoFile.v()) {
                    arrayList3.add(next);
                }
            }
            ArrayList a2 = gVar.a(new k9x(min3, min4, 1));
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : a2) {
                if (obj2 instanceof rie.a.C3610a) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((rie.a.C3610a) it3.next()).a);
            }
            oieVar.a(new fgg0(arrayList3), arrayList5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (recyclerView.getScrollState() == 0 && this.e) {
            this.e = false;
            n(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.e = (i == 0 && i2 == 0) ? false : true;
    }
}
