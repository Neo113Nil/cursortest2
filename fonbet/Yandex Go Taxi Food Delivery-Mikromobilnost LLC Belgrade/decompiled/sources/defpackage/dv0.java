package defpackage;

import com.yandex.mapkit.search.Response;
import com.yandex.mapkit.search.Session;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public final class dv0 implements Session.SearchListener {
    public final /* synthetic */ j18 a;

    public dv0(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // com.yandex.mapkit.search.Session.SearchListener
    public final void onSearchError(Error error) {
        this.a.resumeWith(null);
    }

    @Override // com.yandex.mapkit.search.Session.SearchListener
    public final void onSearchResponse(Response response) {
        this.a.resumeWith(response.getCollection().getChildren());
    }
}
