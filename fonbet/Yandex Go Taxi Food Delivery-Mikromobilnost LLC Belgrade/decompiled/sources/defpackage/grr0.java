package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalButtonDto$Action$Accept;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalButtonDto$Action$Deeplink;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class grr0 extends xqt {
    public static final grr0 e = new grr0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, drr0.INSTANCE.serializer(), qoi0.a(drr0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("accept", SharingPersonalGoalButtonDto$Action$Accept.Companion.serializer(), qoi0.a(SharingPersonalGoalButtonDto$Action$Accept.class)), new f9("close", drr0.INSTANCE.serializer(), qoi0.a(drr0.class)), new f9(Constants.DEEPLINK, SharingPersonalGoalButtonDto$Action$Deeplink.Companion.serializer(), qoi0.a(SharingPersonalGoalButtonDto$Action$Deeplink.class)));
    }
}
