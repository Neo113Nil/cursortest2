package com.yandex.go.taxi.order.bubble.interactor;

import defpackage.ah00;
import defpackage.di70;
import defpackage.lp00;
import java.util.Map;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.intersection.ParticipantRelationsMode;
import ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$ExecuteOn;

/* loaded from: classes14.dex */
public final class b {
    public final lp00 a;
    public final ah00 b;
    public final ru.yandex.taxi.map_common.map.process.b c;
    public boolean d;

    public b(lp00 lp00Var, ah00 ah00Var, ru.yandex.taxi.map_common.map.process.b bVar) {
        this.a = lp00Var;
        this.b = ah00Var;
        this.c = bVar;
    }

    public final void a(Map map) {
        if (map.isEmpty()) {
            return;
        }
        boolean z = this.d;
        lp00 lp00Var = this.a;
        if (!z) {
            Participant participant = Participant.ORDER_STYLED_BUBBLES_COLLECTION;
            ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) lp00Var;
            aVar.a(participant, new di70(this, map, 1));
            Participant participant2 = Participant.SOURCE_POINT_PIN;
            ParticipantRelationsMode participantRelationsMode = ParticipantRelationsMode.MANY_TO_ONE;
            aVar.h(participant, participant2, participantRelationsMode);
            aVar.h(participant, Participant.DESTINATION_POINT_PIN, participantRelationsMode);
            aVar.h(participant, Participant.CHECK_IN_POINT_PIN, participantRelationsMode);
            aVar.h(participant, Participant.CAR_ICON, participantRelationsMode);
            this.d = true;
        }
        Participant participant3 = Participant.ORDER_STYLED_BUBBLES_COLLECTION;
        ru.yandex.taxi.map_common.map.intersection.a aVar2 = (ru.yandex.taxi.map_common.map.intersection.a) lp00Var;
        aVar2.b(participant3, Participant.SOURCE_POINT_PIN);
        aVar2.b(participant3, Participant.DESTINATION_POINT_PIN);
        aVar2.b(participant3, Participant.CHECK_IN_POINT_PIN);
        aVar2.b(participant3, Participant.CAR_ICON);
        MapComputationsProcessor$ExecuteOn mapComputationsProcessor$ExecuteOn = MapComputationsProcessor$ExecuteOn.MAIN;
        OrderBubblePinIntersectionInteractor$checkIntersections$1 orderBubblePinIntersectionInteractor$checkIntersections$1 = new OrderBubblePinIntersectionInteractor$checkIntersections$1(this, map, null);
        ru.yandex.taxi.map_common.map.process.b bVar = this.c;
        ru.yandex.taxi.map_common.map.process.a.a(mapComputationsProcessor$ExecuteOn, bVar.b, bVar.a, bVar.c, orderBubblePinIntersectionInteractor$checkIntersections$1);
    }
}
