package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemActionDto$CopyToClipboard;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemActionDto$Deeplink;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class o410 extends xqt {
    public static final o410 e = new o410();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m410.INSTANCE.serializer(), qoi0.a(m410.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(Constants.DEEPLINK, MasstransitSlotItemActionDto$Deeplink.Companion.serializer(), qoi0.a(MasstransitSlotItemActionDto$Deeplink.class)), new f9("copy_to_clipboard", MasstransitSlotItemActionDto$CopyToClipboard.Companion.serializer(), qoi0.a(MasstransitSlotItemActionDto$CopyToClipboard.class)), new f9("activation_with_onboarding", k410.INSTANCE.serializer(), qoi0.a(k410.class)));
    }
}
