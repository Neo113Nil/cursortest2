package com.yandex.go.agreement.api.trackable.network;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.rm6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/agreement/api/trackable/network/CachedTrackableAcceptance;", "", "Companion", "$serializer", "com/yandex/go/agreement/api/trackable/network/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CachedTrackableAcceptance {
    public static final a Companion = new a();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(26))};
    public final String a;
    public final String b;
    public final String c;
    public final TrackableAcceptanceActionParam.Status d;

    public /* synthetic */ CachedTrackableAcceptance(int i, TrackableAcceptanceActionParam.Status status, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = status;
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

    /* renamed from: c, reason: from getter */
    public final TrackableAcceptanceActionParam.Status getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedTrackableAcceptance)) {
            return false;
        }
        CachedTrackableAcceptance cachedTrackableAcceptance = (CachedTrackableAcceptance) obj;
        return jl40.l(this.a, cachedTrackableAcceptance.a) && jl40.l(this.b, cachedTrackableAcceptance.b) && jl40.l(this.c, cachedTrackableAcceptance.c) && this.d == cachedTrackableAcceptance.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TrackableAcceptanceActionParam.Status status = this.d;
        return hashCode3 + (status != null ? status.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CachedTrackableAcceptance(acceptanceId=", this.a, ", acceptedTime=", this.b, ", zoneName=");
        v.append(this.c);
        v.append(", status=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CachedTrackableAcceptance() {
        this(null, 15);
    }

    public CachedTrackableAcceptance(TrackableAcceptanceActionParam.Status status, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = status;
    }

    public /* synthetic */ CachedTrackableAcceptance(String str, int i) {
        this(null, (i & 1) != 0 ? "" : str, null, null);
    }
}
