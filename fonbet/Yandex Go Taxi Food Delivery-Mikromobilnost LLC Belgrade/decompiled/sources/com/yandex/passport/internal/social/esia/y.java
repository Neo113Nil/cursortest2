package com.yandex.passport.internal.social.esia;

import com.yandex.passport.internal.social.esia.EsiaBindViewModel$Result;
import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes15.dex */
public final class y implements ymi0 {
    public static final y a = new y();

    @Override // defpackage.ymi0
    public final Object a(Object obj, Object obj2) {
        EsiaBindViewModel$InternalState esiaBindViewModel$InternalState = (EsiaBindViewModel$InternalState) obj;
        x xVar = (x) obj2;
        if (xVar instanceof r) {
            return EsiaBindViewModel$InternalState.copy$default(esiaBindViewModel$InternalState, null, null, EsiaBindViewModel$State.copy$default(esiaBindViewModel$InternalState.getUiState(), null, ((r) xVar).a, null, false, false, 29, null), 3, null);
        }
        if (xVar instanceof t) {
            return EsiaBindViewModel$InternalState.copy$default(esiaBindViewModel$InternalState, null, null, EsiaBindViewModel$State.copy$default(esiaBindViewModel$InternalState.getUiState(), null, null, ((t) xVar).a, false, false, 27, null), 3, null);
        }
        if (xVar instanceof u) {
            return EsiaBindViewModel$InternalState.copy$default(esiaBindViewModel$InternalState, null, null, EsiaBindViewModel$State.copy$default(esiaBindViewModel$InternalState.getUiState(), null, null, ((u) xVar).a, false, false, 27, null), 3, null);
        }
        if (xVar instanceof w) {
            return EsiaBindViewModel$InternalState.copy$default(esiaBindViewModel$InternalState, null, null, EsiaBindViewModel$State.copy$default(esiaBindViewModel$InternalState.getUiState(), ((w) xVar).a, null, null, false, false, 30, null), 3, null);
        }
        if (xVar instanceof v) {
            return EsiaBindViewModel$InternalState.copy$default(esiaBindViewModel$InternalState, null, null, EsiaBindViewModel$State.copy$default(esiaBindViewModel$InternalState.getUiState(), null, null, null, false, ((v) xVar).a, 15, null), 3, null);
        }
        if (xVar instanceof s) {
            return EsiaBindViewModel$InternalState.copy$default(esiaBindViewModel$InternalState, null, null, EsiaBindViewModel$State.copy$default(esiaBindViewModel$InternalState.getUiState(), EsiaBindViewModel$Result.Canceled.INSTANCE, null, null, false, false, 14, null), 3, null);
        }
        w511.b();
        return null;
    }
}
