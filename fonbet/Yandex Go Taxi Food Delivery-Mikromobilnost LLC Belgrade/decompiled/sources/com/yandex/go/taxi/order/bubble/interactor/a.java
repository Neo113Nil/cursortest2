package com.yandex.go.taxi.order.bubble.interactor;

import defpackage.ah00;
import defpackage.di70;
import defpackage.lp00;
import defpackage.sf30;
import java.util.Map;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.intersection.ParticipantRelationsMode;
import ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$ExecuteOn;

/* loaded from: classes14.dex */
public final class a {
    public final lp00 a;
    public final ah00 b;
    public final ru.yandex.taxi.map_common.map.process.b c;
    public boolean d;

    public a(lp00 lp00Var, ah00 ah00Var, ru.yandex.taxi.map_common.map.process.b bVar) {
        this.a = lp00Var;
        this.b = ah00Var;
        this.c = bVar;
    }

    public final void a(Map map, sf30 sf30Var) {
        if (map.isEmpty()) {
            sf30Var.run();
            return;
        }
        boolean z = this.d;
        lp00 lp00Var = this.a;
        if (!z) {
            Participant participant = Participant.COMPANIONS_IN_SEARCH_COLLECTION;
            ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) lp00Var;
            aVar.a(participant, new di70(this, map, 0));
            aVar.h(participant, participant, ParticipantRelationsMode.MANY_TO_MANY);
            this.d = true;
        }
        Participant participant2 = Participant.COMPANIONS_IN_SEARCH_COLLECTION;
        ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var).b(participant2, participant2);
        MapComputationsProcessor$ExecuteOn mapComputationsProcessor$ExecuteOn = MapComputationsProcessor$ExecuteOn.MAIN;
        OrderAnimatedBubbleIntersectionInteractor$checkIntersections$1 orderAnimatedBubbleIntersectionInteractor$checkIntersections$1 = new OrderAnimatedBubbleIntersectionInteractor$checkIntersections$1(this, map, sf30Var, null);
        ru.yandex.taxi.map_common.map.process.b bVar = this.c;
        ru.yandex.taxi.map_common.map.process.a.a(mapComputationsProcessor$ExecuteOn, bVar.b, bVar.a, bVar.c, orderAnimatedBubbleIntersectionInteractor$checkIntersections$1);
    }
}
