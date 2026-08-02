package com.yandex.go.eboks.objects.domain;

import defpackage.hin;
import defpackage.lhn;
import defpackage.mhn;
import defpackage.pgn;
import defpackage.pvn;
import defpackage.tpr;
import java.util.List;
import ru.yandex.taxi.common_models.net.map_object.Trigger;

/* loaded from: classes12.dex */
public final class c {
    public final pgn a;
    public final hin b;

    public c(pgn pgnVar, hin hinVar) {
        this.a = pgnVar;
        this.b = hinVar;
    }

    public final tpr a(mhn mhnVar) {
        List list;
        lhn lhnVar = mhnVar.f;
        return (lhnVar == null || (list = (List) lhnVar.a.get(Trigger.TAP)) == null) ? pvn.a : new kotlinx.coroutines.flow.n(new b(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.C(new kotlinx.coroutines.flow.g(list), new EboksObjectsActionHandlingInteractor$handleMapObjectTap$$inlined$flatMapMerge$1(null, this.a))), this, mhnVar), new EboksObjectsActionHandlingInteractor$deselectPreviousIfExist$1(this, null));
    }
}
