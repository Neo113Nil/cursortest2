package xsna;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import xsna.dz9;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class to01 implements dz9.a {
    public final Status b;
    public final ApplicationMetadata c;
    public final String d;
    public final String e;
    public final boolean f;

    public to01(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.b = status;
        this.c = applicationMetadata;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    @Override // xsna.dz9.a
    public final String d() {
        return this.d;
    }

    @Override // xsna.dz9.a
    public final ApplicationMetadata e() {
        return this.c;
    }

    @Override // xsna.dz9.a
    public final boolean g() {
        return this.f;
    }

    @Override // xsna.dz9.a
    public final String getSessionId() {
        return this.e;
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.b;
    }
}
