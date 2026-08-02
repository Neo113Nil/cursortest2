package com.google.android.play.core.review;

import android.app.PendingIntent;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.x4e;

/* loaded from: classes11.dex */
final class zza extends ReviewInfo {
    private final PendingIntent zza;
    private final boolean zzb;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            ny61.t("Null pendingIntent");
            throw null;
        }
        this.zza = pendingIntent;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.zza.equals(reviewInfo.zza()) && this.zzb == reviewInfo.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.zzb ? 1237 : 1231) ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return x4e.i(unr0.x("ReviewInfo{pendingIntent=", this.zza.toString(), ", isNoOp="), this.zzb, "}");
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean zzb() {
        return this.zzb;
    }
}
