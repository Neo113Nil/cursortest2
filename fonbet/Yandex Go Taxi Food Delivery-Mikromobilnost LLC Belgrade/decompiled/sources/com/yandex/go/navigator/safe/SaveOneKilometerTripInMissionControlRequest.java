package com.yandex.go.navigator.safe;

import defpackage.gsq0;
import defpackage.qv10;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/safe/SaveOneKilometerTripInMissionControlRequest;", "", "Companion", "$serializer", "com/yandex/go/navigator/safe/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SaveOneKilometerTripInMissionControlRequest {
    public static final b Companion = new b();
    public final long a;

    public /* synthetic */ SaveOneKilometerTripInMissionControlRequest(int i, long j) {
        if ((i & 1) == 0) {
            this.a = System.currentTimeMillis();
        } else {
            this.a = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SaveOneKilometerTripInMissionControlRequest) && this.a == ((SaveOneKilometerTripInMissionControlRequest) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qv10.k(this.a, "SaveOneKilometerTripInMissionControlRequest(timestamp=", Extension.C_BRAKE);
    }

    public SaveOneKilometerTripInMissionControlRequest(long j) {
        this.a = j;
    }

    public SaveOneKilometerTripInMissionControlRequest() {
        this(System.currentTimeMillis());
    }
}
