package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import java.util.Iterator;
import xsna.yux;

/* compiled from: ClipSnapFocusHelper.kt */
/* loaded from: classes17.dex */
public final class ocd implements izs<Integer, s3q0> {
    public final pxc b;
    public final ClipFeedAdapter c;
    public final gxp0 d;
    public final yux e;
    public final yux f;
    public boolean g;
    public String h;

    public ocd(pxc pxcVar, ClipFeedAdapter clipFeedAdapter, gxp0 gxp0Var, yux yuxVar, yux yuxVar2, boolean z) {
        this.b = pxcVar;
        this.c = clipFeedAdapter;
        this.d = gxp0Var;
        this.e = yuxVar;
        this.f = yuxVar2;
        this.g = z;
    }

    public static void e(int i, RecyclerView recyclerView, boolean z) {
        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition instanceof s1d) {
            ((s1d) findViewHolderForAdapterPosition).o.x0.a(z ? ClipItemViewEvent.OnSnapFocusChanged.FOCUSED : ClipItemViewEvent.OnSnapFocusChanged.UNFOCUSED);
        }
    }

    public final void a(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b.invoke();
        if (recyclerView == null) {
            return;
        }
        ClipFeedAdapter clipFeedAdapter = this.c;
        Object b0 = j5g.b0(i, clipFeedAdapter.h.f);
        FeedItem feedItem = b0 instanceof FeedItem ? (FeedItem) b0 : null;
        gxp0 gxp0Var = this.d;
        gxp0Var.d.setValue(gxp0Var, gxp0.i[3], Boolean.valueOf(feedItem instanceof FeedItem.e));
        String F = feedItem != null ? feedItem.F() : null;
        if (F == null) {
            F = "";
        }
        yux yuxVar = this.e;
        yux.a aVar = yuxVar.b;
        qcy<?>[] qcyVarArr = yux.e;
        aVar.setValue(yuxVar, qcyVarArr[1], F);
        String F2 = feedItem != null ? feedItem.F() : null;
        String str = F2 != null ? F2 : "";
        yux yuxVar2 = this.f;
        yuxVar2.b.setValue(yuxVar2, qcyVarArr[1], str);
        if (epx.f(this.h, feedItem != null ? feedItem.F() : null)) {
            return;
        }
        String str2 = this.h;
        if (str2 != null) {
            Iterator<hfz> it = clipFeedAdapter.h.f.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                hfz next = it.next();
                FeedItem feedItem2 = next instanceof FeedItem ? (FeedItem) next : null;
                if (str2.equals(feedItem2 != null ? feedItem2.F() : null)) {
                    break;
                } else {
                    i2++;
                }
            }
            e(i2, recyclerView, false);
        } else {
            e(i - 1, recyclerView, false);
            e(i + 1, recyclerView, false);
        }
        e(i, recyclerView, true);
        this.h = feedItem != null ? feedItem.F() : null;
    }

    public final void c() {
        if (this.g) {
            return;
        }
        this.g = true;
    }

    public final void d() {
        if (this.g) {
            g();
            this.g = false;
        }
    }

    public final void g() {
        RecyclerView recyclerView = (RecyclerView) this.b.invoke();
        if (recyclerView == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int v = linearLayoutManager.v();
        Integer valueOf = v != -1 ? Integer.valueOf(v) : null;
        if (valueOf != null) {
            a(valueOf.intValue());
        }
    }

    @Override // xsna.izs
    public final /* bridge */ /* synthetic */ s3q0 invoke(Integer num) {
        a(num.intValue());
        return s3q0.a;
    }
}
