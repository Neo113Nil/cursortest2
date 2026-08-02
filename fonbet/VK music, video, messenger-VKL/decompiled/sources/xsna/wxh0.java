package xsna;

import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.search.ui.api.SearchQuery;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wxh0 implements wzs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ wxh0(boolean z, SearchQueryValueHelper searchQueryValueHelper, boolean z2, long j) {
        this.b = z;
        this.c = z2;
        this.d = j;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        SearchQueryValueHelper.a aVar = (SearchQueryValueHelper.a) obj;
        Boolean bool = (Boolean) obj2;
        if (bool.booleanValue() && this.b) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        if (bool.booleanValue()) {
            return io.reactivex.rxjava3.core.q.T(aVar.a);
        }
        if (this.c && aVar.b == SearchQueryValueHelper.ChangeType.SILENT) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        SearchQueryValueHelper.ChangeType changeType = aVar.b;
        SearchQuery searchQuery = aVar.a;
        if (changeType != SearchQueryValueHelper.ChangeType.KEYBOARD) {
            return io.reactivex.rxjava3.core.q.T(searchQuery);
        }
        return new io.reactivex.rxjava3.internal.operators.observable.v(io.reactivex.rxjava3.core.q.T(searchQuery), io.reactivex.rxjava3.core.q.C0(this.d, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()));
    }
}
