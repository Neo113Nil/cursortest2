package defpackage;

import com.yandex.go.slot.dto.SlotItemActionDto$Deeplink;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenUrl;
import com.yandex.go.slot.dto.SlotItemActionDto$Type;
import com.yandex.go.slot.dto.b2;

/* loaded from: classes13.dex */
public final class elv0 implements sqs0 {
    @Override // defpackage.sqs0
    public final nqs0 a(b2 b2Var) {
        String str;
        if ((b2Var instanceof SlotItemActionDto$OpenUrl) && (str = ((SlotItemActionDto$OpenUrl) b2Var).a) != null && str.length() != 0) {
            return new dlv0(SlotItemActionDto$Type.OPEN_URL.getAnalyticsName(), str);
        }
        if (b2Var instanceof SlotItemActionDto$Deeplink) {
            String str2 = ((SlotItemActionDto$Deeplink) b2Var).a;
            if (str2.length() != 0) {
                return new blv0(SlotItemActionDto$Type.DEEPLINK.getAnalyticsName(), str2);
            }
        }
        return clv0.a;
    }
}
