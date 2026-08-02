package defpackage;

import com.yandex.go.chargers.passes.data.ChargersPassCardDto$Active;
import com.yandex.go.chargers.passes.data.ChargersPassCardDto$Expired;
import com.yandex.go.chargers.passes.data.ChargersPassCardDto$FailedRenewal;
import com.yandex.go.chargers.passes.data.q;
import java.util.Arrays;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes12.dex */
public final class bfa extends xqt {
    public static final bfa e = new bfa();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, q.INSTANCE.serializer(), qoi0.a(q.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(ClidProvider.APP_ACTIVE, ChargersPassCardDto$Active.Companion.serializer(), qoi0.a(ChargersPassCardDto$Active.class)), new f9("failed_renewal", ChargersPassCardDto$FailedRenewal.Companion.serializer(), qoi0.a(ChargersPassCardDto$FailedRenewal.class)), new f9("expired", ChargersPassCardDto$Expired.Companion.serializer(), qoi0.a(ChargersPassCardDto$Expired.class)));
    }
}
