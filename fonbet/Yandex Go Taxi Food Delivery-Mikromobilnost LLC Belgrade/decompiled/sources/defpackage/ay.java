package defpackage;

import com.yandex.go.chargers.data.model.Action$Info;
import com.yandex.go.chargers.data.model.Action$OpenDiscountDetails;
import com.yandex.go.chargers.data.model.a;
import com.yandex.go.chargers.data.model.d;
import java.util.Arrays;
import java.util.List;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes12.dex */
public final class ay extends xqt {
    public static final ay e = new ay();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d.INSTANCE.serializer(), qoi0.a(d.class));
    }

    @Override // defpackage.h9
    public final List f() {
        a aVar = Action$Info.Companion;
        return Arrays.asList(new f9("info", aVar.serializer(), qoi0.a(Action$Info.class)), new f9(MetaDataField.SCREEN_FIELD, aVar.serializer(), qoi0.a(Action$Info.class)), new f9("open_discount_details", Action$OpenDiscountDetails.Companion.serializer(), qoi0.a(Action$OpenDiscountDetails.class)));
    }
}
