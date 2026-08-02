package defpackage;

import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftDto$AviaTransferDraft;
import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftDto$TrainTransferDraft;
import com.yandex.go.transfer_requirement.transferapi.draft.d;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class hi01 extends xqt {
    public static final hi01 e = new hi01();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d.INSTANCE.serializer(), qoi0.a(d.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("avia", TransferDraftDto$AviaTransferDraft.Companion.serializer(), qoi0.a(TransferDraftDto$AviaTransferDraft.class)), new f9("train", TransferDraftDto$TrainTransferDraft.Companion.serializer(), qoi0.a(TransferDraftDto$TrainTransferDraft.class)));
    }
}
