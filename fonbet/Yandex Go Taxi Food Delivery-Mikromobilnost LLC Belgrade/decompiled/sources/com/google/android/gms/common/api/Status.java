package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.hwa1;
import defpackage.kjz;
import defpackage.m50;
import defpackage.ooc;
import defpackage.uyj0;
import defpackage.yi6;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements uyj0, ReflectedParcelable {
    private final int zza;
    private final String zzb;
    private final PendingIntent zzc;
    private final ConnectionResult zzd;
    public static final Status RESULT_SUCCESS_CACHE = new Status(-1);
    public static final Status RESULT_SUCCESS = new Status(0);
    public static final Status RESULT_INTERRUPTED = new Status(14);
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);
    public static final Status RESULT_TIMEOUT = new Status(15);
    public static final Status RESULT_CANCELED = new Status(16);
    public static final Status RESULT_API_NOT_CONNECTED = new Status(17);
    public static final Status RESULT_DEAD_CLIENT = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new zze();

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.zza = i;
        this.zzb = str;
        this.zzc = pendingIntent;
        this.zzd = connectionResult;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.zza == status.zza && ooc.m(this.zzb, status.zzb) && ooc.m(this.zzc, status.zzc) && ooc.m(this.zzd, status.zzd);
    }

    public ConnectionResult getConnectionResult() {
        return this.zzd;
    }

    public PendingIntent getResolution() {
        return this.zzc;
    }

    @Override // defpackage.uyj0
    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.zza;
    }

    public String getStatusMessage() {
        return this.zzb;
    }

    public boolean hasResolution() {
        return this.zzc != null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd});
    }

    public boolean isCanceled() {
        return this.zza == 16;
    }

    public boolean isInterrupted() {
        return this.zza == 14;
    }

    public boolean isSuccess() {
        return this.zza <= 0;
    }

    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        Bundle bundle;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        if (hasResolution()) {
            if (Build.VERSION.SDK_INT >= 34) {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                bundle = pendingIntentBackgroundActivityStartMode.toBundle();
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            PendingIntent pendingIntent = this.zzc;
            cvw.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0, bundle2);
        }
    }

    public String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(zza(), "statusCode");
        kjzVar.b(this.zzc, "resolution");
        return kjzVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int statusCode = getStatusCode();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(statusCode);
        bb1.g0(parcel, 2, getStatusMessage(), false);
        bb1.f0(parcel, 3, this.zzc, i, false);
        bb1.f0(parcel, 4, getConnectionResult(), i, false);
        bb1.o0(parcel, n0);
    }

    public final String zza() {
        String str = this.zzb;
        return str != null ? str : hwa1.e(this.zza);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i, String str) {
        this(i, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i) {
        this(i, str, connectionResult.getResolution(), connectionResult);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }

    public void startResolutionForResult(m50 m50Var) {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zzc;
            cvw.l(pendingIntent);
            m50Var.a(new yi6(pendingIntent.getIntentSender()).c());
        }
    }
}
