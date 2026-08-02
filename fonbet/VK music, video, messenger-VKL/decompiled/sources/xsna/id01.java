package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class id01 {
    public final Context a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final Boolean e;
    public final long f;

    @Nullable
    public final zzcl g;
    public final boolean h;

    @Nullable
    public final Long i;

    @Nullable
    public final String j;

    @VisibleForTesting
    public id01(Context context, @Nullable zzcl zzclVar, @Nullable Long l) {
        this.h = true;
        exc0.i(context);
        Context applicationContext = context.getApplicationContext();
        exc0.i(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (zzclVar != null) {
            this.g = zzclVar;
            this.b = zzclVar.zzf;
            this.c = zzclVar.zze;
            this.d = zzclVar.zzd;
            this.h = zzclVar.zzc;
            this.f = zzclVar.zzb;
            this.j = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
