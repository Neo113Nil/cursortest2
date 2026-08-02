package com.yandex.go.loyalty.api.data.model.common;

import android.graphics.PointF;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vix;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/loyalty/api/data/model/common/LinearColorSettings;", "", "Companion", "com/yandex/go/loyalty/api/data/model/common/d", "$serializer", "go-client-android.features.loyalty:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LinearColorSettings {
    public static final d Companion = new d();
    public static final i3y[] e;
    public final List a;
    public final List b;
    public final List c;
    public final float d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new vix(25)), kotlin.a.b(lazyThreadSafetyMode, new vix(26)), kotlin.a.b(lazyThreadSafetyMode, new vix(27)), null};
    }

    public /* synthetic */ LinearColorSettings(int i, List list, List list2, List list3, float f) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list3;
        }
        if ((i & 8) == 0) {
            this.d = 0.0f;
        } else {
            this.d = f;
        }
    }

    public static PointF e(List list) {
        if (list.size() != 2) {
            return new PointF(0.0f, 0.0f);
        }
        float floatValue = ((Number) list.get(0)).floatValue();
        if (floatValue <= 0.0f) {
            floatValue = 0.0f;
        } else if (floatValue >= 1.0f) {
            floatValue = 1.0f;
        }
        float floatValue2 = ((Number) list.get(1)).floatValue();
        return new PointF(floatValue, floatValue2 > 0.0f ? floatValue2 >= 1.0f ? 1.0f : floatValue2 : 0.0f);
    }

    /* renamed from: a, reason: from getter */
    public final float getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public final PointF c() {
        return e(this.c);
    }

    public final PointF d() {
        return e(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearColorSettings)) {
            return false;
        }
        LinearColorSettings linearColorSettings = (LinearColorSettings) obj;
        return jl40.l(this.a, linearColorSettings.a) && jl40.l(this.b, linearColorSettings.b) && jl40.l(this.c, linearColorSettings.c) && Float.compare(this.d, linearColorSettings.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = qv10.v("LinearColorSettings(colors=", this.a, ", rawStartPoint=", this.b, ", rawEndPoint=");
        v.append(this.c);
        v.append(", angle=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public LinearColorSettings() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = emptyList;
        this.d = 0.0f;
    }
}
