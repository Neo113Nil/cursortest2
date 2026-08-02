package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.Peer;
import java.util.List;

/* compiled from: ImItemListStoriesHelper.kt */
/* loaded from: classes2.dex */
public final class j7w {
    public final io.reactivex.rxjava3.subjects.f<Peer> a = new io.reactivex.rxjava3.subjects.f<>();

    public final void a(RecyclerView recyclerView, List<? extends hfz> list) {
        int v;
        int x;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && (v = linearLayoutManager.v()) < (x = linearLayoutManager.x()) && v >= 0 && v < list.size() && x >= 0 && x < list.size()) {
            for (hfz hfzVar : list.subList(v, x)) {
                boolean z = hfzVar instanceof zfm;
                io.reactivex.rxjava3.subjects.f<Peer> fVar = this.a;
                if (z) {
                    fVar.onNext(((zfm) hfzVar).b);
                } else if (hfzVar instanceof j0b) {
                    fVar.onNext(new Peer.Channel(((j0b) hfzVar).b));
                }
            }
        }
    }
}
