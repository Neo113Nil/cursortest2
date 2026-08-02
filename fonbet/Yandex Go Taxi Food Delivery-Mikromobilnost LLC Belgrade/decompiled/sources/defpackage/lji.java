package defpackage;

import com.yandex.go.zone.dto.objects.DeliveryPinLead$Icon;
import com.yandex.go.zone.dto.objects.p1;
import com.yandex.go.zone.dto.objects.r1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes15.dex */
public final class lji extends xqt {
    public static final lji e = new lji();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, r1.INSTANCE.serializer(), qoi0.a(r1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("icon", DeliveryPinLead$Icon.Companion.serializer(), qoi0.a(DeliveryPinLead$Icon.class)), new f9("eta", p1.INSTANCE.serializer(), qoi0.a(p1.class)));
    }
}
