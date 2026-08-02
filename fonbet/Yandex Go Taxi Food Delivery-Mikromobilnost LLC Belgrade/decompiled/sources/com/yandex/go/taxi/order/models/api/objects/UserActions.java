package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.qv10;
import defpackage.z121;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/UserActions;", "", "Companion", "Action", "$serializer", "com/yandex/go/taxi/order/models/api/objects/s1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UserActions {
    public static final s1 Companion = new s1();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z121(24))};
    public final Map a;

    public /* synthetic */ UserActions(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = kotlin.collections.b.f();
        } else {
            this.a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserActions) && jl40.l(this.a, ((UserActions) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("UserActions(actions=", Extension.C_BRAKE, this.a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/UserActions$Action;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/r1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Action {
        public static final r1 Companion = new r1();
        public final Object a;

        public /* synthetic */ Action(int i, Object obj) {
            if ((i & 1) == 0) {
                this.a = new Object();
            } else {
                this.a = obj;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Action) && jl40.l(this.a, ((Action) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return qv10.p("Action(value=", Extension.C_BRAKE, this.a);
        }

        public Action(Object obj) {
            this.a = obj;
        }

        public Action() {
            this(new Object());
        }
    }

    public UserActions(Map map) {
        this.a = map;
    }

    public UserActions() {
        this(kotlin.collections.b.f());
    }
}
