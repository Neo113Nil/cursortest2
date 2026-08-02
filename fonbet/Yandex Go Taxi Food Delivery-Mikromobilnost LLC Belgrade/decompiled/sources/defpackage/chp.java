package defpackage;

import com.yandex.go.slot.dto.SlotItemActionDto$Deeplink;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenSettingsModal;
import com.yandex.go.slot.dto.SlotItemActionDto$Type;
import com.yandex.go.slot.dto.b2;
import java.util.List;

/* loaded from: classes5.dex */
public final class chp implements sqs0 {
    @Override // defpackage.sqs0
    public final nqs0 a(b2 b2Var) {
        if (b2Var instanceof SlotItemActionDto$Deeplink) {
            return new ygp(SlotItemActionDto$Type.DEEPLINK.getAnalyticsName(), ((SlotItemActionDto$Deeplink) b2Var).a);
        }
        if (!(b2Var instanceof SlotItemActionDto$OpenSettingsModal)) {
            return zgp.a;
        }
        SlotItemActionDto$OpenSettingsModal slotItemActionDto$OpenSettingsModal = (SlotItemActionDto$OpenSettingsModal) b2Var;
        SlotItemActionDto$OpenSettingsModal.Button button = slotItemActionDto$OpenSettingsModal.d;
        String str = button.a;
        y9r0 y9r0Var = new y9r0(str, button.b);
        n7v n7vVar = slotItemActionDto$OpenSettingsModal.a;
        String str2 = slotItemActionDto$OpenSettingsModal.b;
        List list = slotItemActionDto$OpenSettingsModal.c;
        return (str2.length() <= 0 || str.length() <= 0 || list.isEmpty()) ? zgp.a : new ahp(SlotItemActionDto$Type.OPEN_SETTINGS_MODAL.getAnalyticsName(), new z9r0(n7vVar, str2, y9r0Var, list));
    }
}
