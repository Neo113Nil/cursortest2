package xsna;

import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import java.util.List;
import xsna.hfz;

/* compiled from: PageLoadingModel.kt */
/* loaded from: classes2.dex */
public interface t990<T, R extends hfz> {
    io.reactivex.rxjava3.core.q<List<R>> a();

    PageLoadingState<R> getState();
}
