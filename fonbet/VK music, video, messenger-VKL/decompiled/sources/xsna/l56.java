package xsna;

import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.hfz;

/* compiled from: BaseAttachesModel.kt */
/* loaded from: classes2.dex */
public abstract class l56<R extends hfz> implements t990<HistoryAttach, R> {
    public abstract izs<HistoryAttach, R> b();

    public abstract io.reactivex.rxjava3.subjects.d<PageLoadingState<R>> c();

    public final void d(List<HistoryAttach> list) {
        List<HistoryAttach> list2 = list;
        izs<HistoryAttach, R> b = b();
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(b.invoke((HistoryAttach) it.next()));
        }
        c().onNext(PageLoadingState.Ab(getState(), arrayList, null, null, null, 14));
    }

    public final void e(boolean z) {
        c().onNext(PageLoadingState.Ab(getState(), null, Boolean.valueOf(z), null, null, 13));
    }

    public final void f(boolean z) {
        c().onNext(PageLoadingState.Ab(getState(), null, null, Boolean.valueOf(z), null, 11));
    }

    public final void g(boolean z) {
        c().onNext(PageLoadingState.Ab(getState(), null, null, null, Boolean.valueOf(z), 7));
    }
}
