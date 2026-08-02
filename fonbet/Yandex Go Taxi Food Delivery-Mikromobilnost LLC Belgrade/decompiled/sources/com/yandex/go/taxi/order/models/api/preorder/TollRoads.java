package com.yandex.go.taxi.order.models.api.preorder;

import defpackage.gsq0;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/TollRoads;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/preorder/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TollRoads {
    public static final d Companion = new d();
    public final boolean a;
    public final boolean b;

    public /* synthetic */ TollRoads(int i, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TollRoads)) {
            return false;
        }
        TollRoads tollRoads = (TollRoads) obj;
        return this.a == tollRoads.a && this.b == tollRoads.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("TollRoads(userChoseTollRoad=", ", userHadChoice=", Extension.C_BRAKE, this.a, this.b);
    }

    public TollRoads(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public TollRoads() {
        this(false, false);
    }
}
