package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.z411;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/TransportRouteSection;", "", "Companion", "Cube", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/z0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransportRouteSection {
    public static final z0 Companion = new z0();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z411(10)), null};
    public final String a;
    public final List b;
    public final Integer c;

    public /* synthetic */ TransportRouteSection(int i, Integer num, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Integer getC() {
        return this.c;
    }

    public TransportRouteSection() {
        this.a = "";
        this.b = EmptyList.a;
        this.c = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/TransportRouteSection$Cube;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/a1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Cube {
        public static final a1 Companion = new a1();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z411(11))};
        public final String a;
        public final String b;
        public final String c;
        public final TransportCubeIconBackgroundType d;

        public /* synthetic */ Cube(int i, String str, String str2, String str3, TransportCubeIconBackgroundType transportCubeIconBackgroundType) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = transportCubeIconBackgroundType;
            }
        }

        public Cube() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = null;
        }
    }
}
