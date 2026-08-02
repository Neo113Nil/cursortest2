package defpackage;

import com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV1DataRepositoryMediator$anchorFlow$$inlined$flow$api$1;
import com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1;
import com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV1DataRepositoryMediator$pinTextFlow$$inlined$flow$api$1;
import com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV1DataRepositoryMediator$stateFlow$$inlined$flow$api$1;
import com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV1DataRepositoryMediator$styleFlow$$inlined$flow$api$1;
import com.yandex.go.pin.api.repository.SharedPinDataHolder$PinV1DataRepositoryMediator$visibilityFlow$$inlined$flowOrDefault$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class fpr0 extends y0c0 {
    public final mzb0 a;

    public fpr0(mzb0 mzb0Var) {
        this.a = mzb0Var;
    }

    @Override // defpackage.y0c0
    public final tpr a() {
        return e.X(this.a.b, new SharedPinDataHolder$PinV1DataRepositoryMediator$anchorFlow$$inlined$flow$api$1());
    }

    @Override // defpackage.y0c0
    public final tpr b() {
        return e.X(this.a.b, new SharedPinDataHolder$PinV1DataRepositoryMediator$idleDrawableFlow$$inlined$flow$api$1());
    }

    @Override // defpackage.y0c0
    public final tpr c() {
        return e.X(this.a.b, new SharedPinDataHolder$PinV1DataRepositoryMediator$pinTextFlow$$inlined$flow$api$1());
    }

    @Override // defpackage.y0c0
    public final tpr d(tpr tprVar) {
        return e.X(this.a.b, new SharedPinDataHolder$PinV1DataRepositoryMediator$stateFlow$$inlined$flow$api$1(tprVar, null));
    }

    @Override // defpackage.y0c0
    public final tpr e() {
        return e.X(this.a.b, new SharedPinDataHolder$PinV1DataRepositoryMediator$styleFlow$$inlined$flow$api$1());
    }

    @Override // defpackage.y0c0
    public final tpr f() {
        return e.X(this.a.b, new SharedPinDataHolder$PinV1DataRepositoryMediator$visibilityFlow$$inlined$flowOrDefault$1(Boolean.FALSE, null));
    }
}
