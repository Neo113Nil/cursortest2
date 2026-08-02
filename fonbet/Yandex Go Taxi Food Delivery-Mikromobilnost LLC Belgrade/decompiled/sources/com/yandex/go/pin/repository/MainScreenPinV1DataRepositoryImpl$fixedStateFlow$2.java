package com.yandex.go.pin.repository;

import com.yandex.go.pin.api.v1.Pin$State;
import defpackage.bms;
import defpackage.w511;
import defpackage.wa00;
import defpackage.xa00;
import defpackage.ybo;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.address.repository.AddressResolveRepository;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class MainScreenPinV1DataRepositoryImpl$fixedStateFlow$2 extends AdaptedFunctionReference implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ybo yboVar = (ybo) obj3;
        ((xa00) this.receiver).getClass();
        int i = wa00.a[((AddressResolveRepository.State) obj2).ordinal()];
        if (i == 1 || i == 2) {
            return Pin$State.IN_PROGRESS;
        }
        if (i == 3) {
            return Pin$State.ERROR;
        }
        if (i == 4) {
            return Pin$State.IDLE;
        }
        if (i == 5) {
            return booleanValue ? yboVar.a > 0 ? Pin$State.TEXT : Pin$State.IDLE : Pin$State.IN_PROGRESS;
        }
        w511.b();
        return null;
    }
}
