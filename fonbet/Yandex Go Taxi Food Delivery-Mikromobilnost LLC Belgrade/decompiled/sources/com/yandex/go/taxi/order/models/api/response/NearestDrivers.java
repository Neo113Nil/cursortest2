package com.yandex.go.taxi.order.models.api.response;

import defpackage.ah40;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ic50;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/NearestDrivers;", "", "Companion", "Driver", "Position", "com/yandex/go/taxi/order/models/api/response/v0", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NearestDrivers {
    public static final v0 Companion = new v0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ic50(8))};
    public static final NearestDrivers c = new NearestDrivers(0);
    public final List a;

    public /* synthetic */ NearestDrivers(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public NearestDrivers(int i) {
        this.a = EmptyList.a;
    }

    public NearestDrivers() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/NearestDrivers$Driver;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/w0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class Driver {
        public static final w0 Companion = new w0();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(25))};
        public final String a;
        public final String b;
        public final boolean c;
        public final List d;

        public /* synthetic */ Driver(int i, String str, String str2, List list, boolean z) {
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
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
        }

        public Driver() {
            this.a = "";
            this.b = "";
            this.c = false;
            this.d = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/NearestDrivers$Position;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/x0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class Position {
        public static final x0 Companion = new x0();
        public final double a;
        public final double b;
        public final double c;
        public final double d;
        public final String e;

        public /* synthetic */ Position(int i, double d, double d2, double d3, double d4, String str) {
            if ((i & 1) == 0) {
                this.a = 0.0d;
            } else {
                this.a = d;
            }
            if ((i & 2) == 0) {
                this.b = 0.0d;
            } else {
                this.b = d2;
            }
            if ((i & 4) == 0) {
                this.c = 0.0d;
            } else {
                this.c = d3;
            }
            if ((i & 8) == 0) {
                this.d = 0.0d;
            } else {
                this.d = d4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str;
            }
        }

        public Position() {
            this.a = 0.0d;
            this.b = 0.0d;
            this.c = 0.0d;
            this.d = 0.0d;
            this.e = null;
        }
    }
}
