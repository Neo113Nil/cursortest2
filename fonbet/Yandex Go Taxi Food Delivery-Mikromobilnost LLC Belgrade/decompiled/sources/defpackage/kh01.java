package defpackage;

import com.yandex.go.transfer_requirement.transferapi.check.TransferCheckDto$AviaTransferCheck;
import com.yandex.go.transfer_requirement.transferapi.check.TransferCheckDto$TrainTransferCheck;
import com.yandex.go.transfer_requirement.transferapi.check.c;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class kh01 extends xqt {
    public static final kh01 e = new kh01();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, c.INSTANCE.serializer(), qoi0.a(c.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("avia", TransferCheckDto$AviaTransferCheck.Companion.serializer(), qoi0.a(TransferCheckDto$AviaTransferCheck.class)), new f9("train", TransferCheckDto$TrainTransferCheck.Companion.serializer(), qoi0.a(TransferCheckDto$TrainTransferCheck.class)));
    }
}
