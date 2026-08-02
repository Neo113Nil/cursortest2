package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.List;
import ru.yandex.taxi.address.experiment.i;
import ru.yandex.taxi.address.experiment.k;
import ru.yandex.taxi.address.experiment.l;
import ru.yandex.taxi.address.experiment.n;

/* loaded from: classes9.dex */
public final class m660 extends xqt {
    public static final m660 e = new m660();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, l.INSTANCE.serializer(), qoi0.a(l.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, k.Companion.serializer(), qoi0.a(k.class)), new f9("vertical", n.Companion.serializer(), qoi0.a(n.class)), new f9(Constants.KEY_SERVICE, i.Companion.serializer(), qoi0.a(i.class)));
    }
}
