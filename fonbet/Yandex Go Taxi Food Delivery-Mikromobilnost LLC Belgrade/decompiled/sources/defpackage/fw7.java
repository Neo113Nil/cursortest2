package defpackage;

import com.yandex.delivery.mapper.model.CancelType;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CancelMessageDto;

/* loaded from: classes.dex */
public final class fw7 {
    public final dw7 a;

    public fw7(dw7 dw7Var) {
        this.a = dw7Var;
    }

    public static jw7 a(CancelMessageDto cancelMessageDto) {
        CancelType cancelType;
        String title = cancelMessageDto.getTitle();
        String body = cancelMessageDto.getBody();
        hw7 hw7Var = new hw7(cancelMessageDto.getCloseButton().getTitle());
        CancelMessageDto.ConfirmButtonDto confirmButton = cancelMessageDto.getConfirmButton();
        iw7 iw7Var = null;
        if (confirmButton != null) {
            String title2 = confirmButton.getTitle();
            int i = ew7.a[confirmButton.getCancelType().ordinal()];
            if (i == 1) {
                cancelType = CancelType.FREE;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                cancelType = CancelType.PAID;
            }
            iw7Var = new iw7(title2, cancelType);
        }
        return new jw7(title, body, hw7Var, iw7Var);
    }
}
