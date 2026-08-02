package xsna;

import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachesState;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SimpleAttachesModel.kt */
/* loaded from: classes2.dex */
public final class fpj0 extends l56<SimpleAttachListItem> {
    public final k220 a = new k220(26);
    public final io.reactivex.rxjava3.subjects.d<PageLoadingState<SimpleAttachListItem>> b = io.reactivex.rxjava3.subjects.d.O0(new SimpleAttachesState(EmptyList.b, false, false, false));

    @Override // xsna.t990
    public final io.reactivex.rxjava3.core.q<List<SimpleAttachListItem>> a() {
        return this.b.U(new tf3(new epj0(0), 28));
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
