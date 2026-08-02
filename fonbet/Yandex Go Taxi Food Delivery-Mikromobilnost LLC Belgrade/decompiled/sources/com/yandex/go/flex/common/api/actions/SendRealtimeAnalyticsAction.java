package com.yandex.go.flex.common.api.actions;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kr;
import defpackage.qje;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.wrp0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/SendRealtimeAnalyticsAction;", "Lkr;", "Companion", "Event", "$serializer", "com/yandex/go/flex/common/api/actions/j0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SendRealtimeAnalyticsAction extends kr {
    public static final j0 Companion = new j0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(18))};
    public final List a;

    public /* synthetic */ SendRealtimeAnalyticsAction(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SendRealtimeAnalyticsAction) && jl40.l(this.a, ((SendRealtimeAnalyticsAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("SendRealtimeAnalyticsAction(events=", Extension.C_BRAKE, this.a);
    }

    public SendRealtimeAnalyticsAction() {
        this.a = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/SendRealtimeAnalyticsAction$Event;", "", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/k0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Event {
        public static final k0 Companion = new k0();
        public final String a;
        public final String b;
        public final String c;
        public final kotlinx.serialization.json.c d;
        public final kotlinx.serialization.json.c e;
        public final kotlinx.serialization.json.c f;
        public final Boolean g;
        public final String h;

        public /* synthetic */ Event(int i, String str, String str2, String str3, kotlinx.serialization.json.c cVar, kotlinx.serialization.json.c cVar2, kotlinx.serialization.json.c cVar3, Boolean bool, String str4) {
            if (15 != (i & 15)) {
                qje.Z(i, 15, SendRealtimeAnalyticsAction$Event$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = cVar;
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = cVar2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = cVar3;
            }
            if ((i & 64) == 0) {
                this.g = Boolean.FALSE;
            } else {
                this.g = bool;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return false;
            }
            Event event = (Event) obj;
            return jl40.l(this.a, event.a) && jl40.l(this.b, event.b) && jl40.l(this.c, event.c) && jl40.l(this.d, event.d) && jl40.l(this.e, event.e) && jl40.l(this.f, event.f) && jl40.l(this.g, event.g) && jl40.l(this.h, event.h);
        }

        public final int hashCode() {
            int d = unr0.d(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d.a);
            kotlinx.serialization.json.c cVar = this.e;
            int hashCode = (d + (cVar == null ? 0 : cVar.a.hashCode())) * 31;
            kotlinx.serialization.json.c cVar2 = this.f;
            int hashCode2 = (hashCode + (cVar2 == null ? 0 : cVar2.a.hashCode())) * 31;
            Boolean bool = this.g;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.h;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("Event(creativeId=", this.a, ", creativeType=", this.b, ", eventType=");
            v.append(this.c);
            v.append(", payload=");
            v.append(this.d);
            v.append(", clientPayload=");
            v.append(this.e);
            v.append(", elementPayload=");
            v.append(this.f);
            v.append(", isUnique=");
            v.append(this.g);
            v.append(", reportGroupId=");
            v.append(this.h);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public Event(int i, String str, String str2, String str3, kotlinx.serialization.json.c cVar) {
            Boolean bool = (i & 64) != 0 ? Boolean.FALSE : Boolean.TRUE;
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = cVar;
            this.e = null;
            this.f = null;
            this.g = bool;
            this.h = null;
        }
    }
}
