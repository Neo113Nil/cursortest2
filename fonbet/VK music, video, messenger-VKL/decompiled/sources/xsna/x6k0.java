package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes12.dex */
public abstract class x6k0 extends com.google.android.gms.common.api.b<a.d.c> {
    private static final a.g zza;
    private static final a.AbstractC0111a zzb;
    private static final com.google.android.gms.common.api.a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        htz0 htz0Var = new htz0();
        zzb = htz0Var;
        zzc = new com.google.android.gms.common.api.a("SmsRetriever.API", htz0Var, gVar);
    }

    public x6k0(@NonNull Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<a.d.c>) zzc, a.d.U6, b.a.c);
    }

    @NonNull
    public abstract Task<Void> startSmsRetriever();

    @NonNull
    public abstract Task<Void> startSmsUserConsent(@Nullable String str);

    public x6k0(@NonNull Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) zzc, a.d.U6, b.a.c);
    }
}
