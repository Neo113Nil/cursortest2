package defpackage;

import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$DetailedPrice;
import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$Icon;
import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$Spacer;
import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$Text;
import com.yandex.go.taxi.order.detailed_price.data.api.response.i;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class a3j extends xqt {
    public static final a3j e = new a3j();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, i.INSTANCE.serializer(), qoi0.a(i.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("detailed_price", DetailedPriceItem$DetailedPrice.Companion.serializer(), qoi0.a(DetailedPriceItem$DetailedPrice.class)), new f9("text", DetailedPriceItem$Text.Companion.serializer(), qoi0.a(DetailedPriceItem$Text.class)), new f9("icon", DetailedPriceItem$Icon.Companion.serializer(), qoi0.a(DetailedPriceItem$Icon.class)), new f9("spacer", DetailedPriceItem$Spacer.Companion.serializer(), qoi0.a(DetailedPriceItem$Spacer.class)));
    }
}
