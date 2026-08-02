package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes6.dex */
public final class krx0 {
    public boolean e;
    public List a = EmptyList.a;
    public PriceUpdate$PriceLoadingState b = PriceUpdate$PriceLoadingState.LOADED;
    public int c = -1;
    public int d = -1;
    public Map f = b.f();

    public final lrx0 a() {
        List list = this.a;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = this.b;
        boolean z = this.e;
        int i = this.c;
        return new lrx0(list, priceUpdate$PriceLoadingState, i, i < 0 ? -1 : this.d, z, this.f);
    }
}
