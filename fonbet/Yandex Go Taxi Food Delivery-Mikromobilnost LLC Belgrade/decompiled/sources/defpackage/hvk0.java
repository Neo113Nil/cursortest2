package defpackage;

import com.yandex.go.slot.dto.SlotItemActionDto$Deeplink;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenUrl;
import com.yandex.go.slot.dto.b2;

/* loaded from: classes14.dex */
public final class hvk0 implements sqs0 {
    @Override // defpackage.sqs0
    public final nqs0 a(b2 b2Var) {
        if (b2Var instanceof SlotItemActionDto$Deeplink) {
            return new yuk0(((SlotItemActionDto$Deeplink) b2Var).a);
        }
        if (!(b2Var instanceof SlotItemActionDto$OpenUrl)) {
            return zuk0.a;
        }
        String str = ((SlotItemActionDto$OpenUrl) b2Var).a;
        return (str == null || evu0.J(str)) ? zuk0.a : new avk0(str);
    }
}
