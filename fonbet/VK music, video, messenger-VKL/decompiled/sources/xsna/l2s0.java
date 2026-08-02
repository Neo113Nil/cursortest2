package xsna;

import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachesState;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VideoAttachesModel.kt */
/* loaded from: classes2.dex */
public final class l2s0 extends l56<SimpleAttachListItem> {
    public final u620 a = new u620(28);
    public final io.reactivex.rxjava3.subjects.d<PageLoadingState<SimpleAttachListItem>> b = io.reactivex.rxjava3.subjects.d.O0(new SimpleAttachesState(EmptyList.b, false, false, false));

    @Override // xsna.t990
    public final io.reactivex.rxjava3.core.q<List<SimpleAttachListItem>> a() {
        return this.b.U(new k2s0(new n1g0(9), 0));
    }

    @Override // xsna.l56
    public final izs<HistoryAttach, SimpleAttachListItem> b() {
        return this.a;
    }

    @Override // xsna.l56
    public final io.reactivex.rxjava3.subjects.d<PageLoadingState<SimpleAttachListItem>> c() {
        return this.b;
    }

    @Override // xsna.t990
    public final PageLoadingState getState() {
        return (SimpleAttachesState) this.b.P0();
    }
}
