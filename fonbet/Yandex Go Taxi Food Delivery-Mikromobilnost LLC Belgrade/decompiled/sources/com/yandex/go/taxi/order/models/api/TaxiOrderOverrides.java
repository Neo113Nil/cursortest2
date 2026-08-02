package com.yandex.go.taxi.order.models.api;

import com.yandex.go.taxi.order.models.api.response.CancelRules;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.z2y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrderOverrides;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/k", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxiOrderOverrides {
    public static final k Companion = new k();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2y0(14)), null};
    public final CancelRules a;
    public final DriveState b;
    public final String c;

    public /* synthetic */ TaxiOrderOverrides(int i, CancelRules cancelRules, DriveState driveState, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = cancelRules;
        }
        if ((i & 2) == 0) {
            this.b = DriveState.SEARCH;
        } else {
            this.b = driveState;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public static TaxiOrderOverrides a(TaxiOrderOverrides taxiOrderOverrides, CancelRules cancelRules, DriveState driveState, String str, int i) {
        if ((i & 1) != 0) {
            cancelRules = taxiOrderOverrides.a;
        }
        if ((i & 2) != 0) {
            driveState = taxiOrderOverrides.b;
        }
        if ((i & 4) != 0) {
            str = taxiOrderOverrides.c;
        }
        return new TaxiOrderOverrides(cancelRules, driveState, str);
    }

    /* renamed from: b, reason: from getter */
    public final DriveState getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final TaxiOrderOverrides d(CancelRules cancelRules) {
        return a(this, cancelRules, null, null, 6);
    }

    public final TaxiOrderOverrides e(String str) {
        return a(this, null, null, str, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderOverrides)) {
            return false;
        }
        TaxiOrderOverrides taxiOrderOverrides = (TaxiOrderOverrides) obj;
        return jl40.l(this.a, taxiOrderOverrides.a) && this.b == taxiOrderOverrides.b && jl40.l(this.c, taxiOrderOverrides.c);
    }

    public final int hashCode() {
        CancelRules cancelRules = this.a;
        int hashCode = (this.b.hashCode() + ((cancelRules == null ? 0 : cancelRules.hashCode()) * 31)) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiOrderOverrides(cancelRules=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", version=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public TaxiOrderOverrides() {
        this(0);
    }

    public TaxiOrderOverrides(CancelRules cancelRules, DriveState driveState, String str) {
        this.a = cancelRules;
        this.b = driveState;
        this.c = str;
    }

    public /* synthetic */ TaxiOrderOverrides(int i) {
        this(null, DriveState.SEARCH, null);
    }
}
