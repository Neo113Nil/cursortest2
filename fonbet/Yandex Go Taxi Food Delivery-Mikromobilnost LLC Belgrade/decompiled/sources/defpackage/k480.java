package defpackage;

import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import com.yandex.go.zone.dto.objects.DefaultOrderPopup;
import com.yandex.go.zone.dto.objects.DeliveryInsuranceModal;
import com.yandex.go.zone.dto.objects.s6;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class k480 extends xqt {
    public static final k480 e = new k480();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, s6.INSTANCE.serializer(), qoi0.a(s6.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("default", DefaultOrderPopup.Companion.serializer(), qoi0.a(DefaultOrderPopup.class)), new f9("bullets", BulletsOrderPopup.Companion.serializer(), qoi0.a(BulletsOrderPopup.class)), new f9("delivery_insurance_modal", DeliveryInsuranceModal.Companion.serializer(), qoi0.a(DeliveryInsuranceModal.class)));
    }
}
