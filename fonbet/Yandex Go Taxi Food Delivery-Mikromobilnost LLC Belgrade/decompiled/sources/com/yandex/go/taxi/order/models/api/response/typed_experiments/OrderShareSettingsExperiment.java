package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import defpackage.c6z;
import defpackage.fs70;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/OrderShareSettingsExperiment;", "Ln96;", "Lc6z;", "Companion", "SharedMessage", "com/yandex/go/taxi/order/models/api/response/typed_experiments/d", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrderShareSettingsExperiment extends n96 implements c6z {
    public static final d Companion = new d();
    public static final i3y[] i = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fs70(29)), null, null, null, null, null};
    public static final OrderShareSettingsExperiment j = new OrderShareSettingsExperiment(0);
    public final boolean b;
    public final Map c;
    public final SharedMessage d;
    public final String e;
    public final boolean f;
    public final long g;
    public final boolean h;

    public /* synthetic */ OrderShareSettingsExperiment(int i2, boolean z, Map map, SharedMessage sharedMessage, String str, boolean z2, long j2, boolean z3) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = SharedMessage.c;
        } else {
            this.d = sharedMessage;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i2 & 32) == 0) {
            this.g = 0L;
        } else {
            this.g = j2;
        }
        if ((i2 & 64) == 0) {
            this.h = false;
        } else {
            this.h = z3;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/OrderShareSettingsExperiment$SharedMessage;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/typed_experiments/e", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class SharedMessage {
        public static final e Companion = new e();
        public static final SharedMessage c = new SharedMessage(0);
        public final String a;
        public final String b;

        public /* synthetic */ SharedMessage(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public SharedMessage(int i) {
            this.a = "";
            this.b = "";
        }

        public SharedMessage() {
            this(0);
        }
    }

    public OrderShareSettingsExperiment() {
        this(0);
    }

    public OrderShareSettingsExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = SharedMessage.c;
        this.e = "";
        this.f = false;
        this.g = 0L;
        this.h = false;
    }
}
