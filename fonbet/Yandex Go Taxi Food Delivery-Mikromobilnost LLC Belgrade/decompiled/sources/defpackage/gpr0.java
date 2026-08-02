package defpackage;

import com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV2DataRepositoryMediator$positionFlow$$inlined$flow$api$1;
import com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV2DataRepositoryMediator$stateFlow$$inlined$flow$api$1;
import com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV2DataRepositoryMediator$styleFlow$$inlined$flow$api$1;
import com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV2DataRepositoryMediator$visibilityFlow$$inlined$flowOrDefault$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class gpr0 extends b1c0 {
    public final mzb0 a;

    public gpr0(mzb0 mzb0Var) {
        this.a = mzb0Var;
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return e.X(this.a.b, new SharedPinDataHolder$PinV2DataRepositoryMediator$positionFlow$$inlined$flow$api$1(tprVar, null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        return e.X(this.a.b, new SharedPinDataHolder$PinV2DataRepositoryMediator$stateFlow$$inlined$flow$api$1(tprVar, null));
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        return e.X(this.a.b, new SharedPinDataHolder$PinV2DataRepositoryMediator$styleFlow$$inlined$flow$api$1());
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return e.X(this.a.b, new SharedPinDataHolder$PinV2DataRepositoryMediator$visibilityFlow$$inlined$flowOrDefault$1(Boolean.FALSE, null));
    }
}
