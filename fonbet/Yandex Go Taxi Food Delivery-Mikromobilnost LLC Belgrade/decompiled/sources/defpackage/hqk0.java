package defpackage;

import com.yandex.go.address.search.common.presenter.b;
import com.yandex.go.suggest.DestinationSuggest;
import java.util.List;

/* loaded from: classes12.dex */
public final class hqk0 extends b {
    public String v0;

    @Override // com.yandex.go.address.search.common.presenter.b
    public final void Gh(List list) {
    }

    @Override // com.yandex.go.address.search.common.presenter.b
    public final boolean Jh(int i) {
        Kh(null);
        return true;
    }

    @Override // com.yandex.go.address.search.common.presenter.b
    public final igq0 Mh(DestinationSuggest destinationSuggest) {
        return new r400(9);
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void oh(String str) {
        this.v0 = str;
    }

    @Override // com.yandex.go.address.search.common.presenter.i
    public final String zh() {
        return this.v0;
    }
}
