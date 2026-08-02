package defpackage;

import com.yandex.go.zone.dto.objects.ServiceLevelWidget$Invisible;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeAlert;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeBalance;
import com.yandex.go.zone.dto.objects.e5;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class hwq0 extends xqt {
    public static final hwq0 e = new hwq0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e5.INSTANCE.serializer(), qoi0.a(e5.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("surge_balance", ServiceLevelWidget$SurgeBalance.Companion.serializer(), qoi0.a(ServiceLevelWidget$SurgeBalance.class)), new f9("hidden", ServiceLevelWidget$Invisible.Companion.serializer(), qoi0.a(ServiceLevelWidget$Invisible.class)), new f9("surge_alert", ServiceLevelWidget$SurgeAlert.Companion.serializer(), qoi0.a(ServiceLevelWidget$SurgeAlert.class)));
    }
}
