package defpackage;

import com.yandex.mapkit.search.SuggestResponse;
import com.yandex.mapkit.search.SuggestSession;
import com.yandex.runtime.Error;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;

/* loaded from: classes15.dex */
public final class bv0 implements SuggestSession.SuggestListener {
    public final /* synthetic */ j18 a;

    public bv0(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // com.yandex.mapkit.search.SuggestSession.SuggestListener
    public final void onError(Error error) {
        this.a.resumeWith(EmptyList.a);
    }

    @Override // com.yandex.mapkit.search.SuggestSession.SuggestListener
    public final void onResponse(SuggestResponse suggestResponse) {
        this.a.resumeWith(b.s(b.g(new h73(1, suggestResponse.getItems()), av0.b)));
    }
}
