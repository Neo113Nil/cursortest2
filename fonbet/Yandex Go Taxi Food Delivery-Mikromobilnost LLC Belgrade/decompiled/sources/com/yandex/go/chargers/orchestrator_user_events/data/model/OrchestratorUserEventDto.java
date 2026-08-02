package com.yandex.go.chargers.orchestrator_user_events.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.qje;
import defpackage.y570;
import defpackage.zzs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/orchestrator_user_events/data/model/OrchestratorUserEventDto;", "", "Companion", "EventType", "$serializer", "com/yandex/go/chargers/orchestrator_user_events/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrchestratorUserEventDto {
    public static final b Companion = new b();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(24)), null, null, null};
    public final EventType a;
    public final zzs b;
    public final Integer c;
    public final Boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/chargers/orchestrator_user_events/data/model/OrchestratorUserEventDto$EventType;", "", "Companion", "com/yandex/go/chargers/orchestrator_user_events/data/model/c", "DISCOVERY", "STATION", "OFFER", "ORDER_LEASING", "ORDER_FINISH", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class EventType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final EventType DISCOVERY;
        public static final EventType OFFER;
        public static final EventType ORDER_FINISH;
        public static final EventType ORDER_LEASING;
        public static final EventType STATION;

        static {
            EventType eventType = new EventType("DISCOVERY", 0);
            DISCOVERY = eventType;
            EventType eventType2 = new EventType("STATION", 1);
            STATION = eventType2;
            EventType eventType3 = new EventType("OFFER", 2);
            OFFER = eventType3;
            EventType eventType4 = new EventType("ORDER_LEASING", 3);
            ORDER_LEASING = eventType4;
            EventType eventType5 = new EventType("ORDER_FINISH", 4);
            ORDER_FINISH = eventType5;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5};
            $VALUES = eventTypeArr;
            $ENTRIES = kotlin.enums.a.a(eventTypeArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(25));
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ OrchestratorUserEventDto(int i, EventType eventType, zzs zzsVar, Integer num, Boolean bool) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, OrchestratorUserEventDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = eventType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public OrchestratorUserEventDto(EventType eventType, zzs zzsVar, Integer num, Boolean bool) {
        this.a = eventType;
        this.b = zzsVar;
        this.c = num;
        this.d = bool;
    }
}
