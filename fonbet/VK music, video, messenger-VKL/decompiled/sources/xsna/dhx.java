package xsna;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class dhx {
    public static final com.google.android.gms.common.api.a<a.d.c> a = new com.google.android.gms.common.api.a<>("IdentityCredentials.API", new a(), new a.g());

    /* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
    public static final class a extends a.AbstractC0111a<fvv, a.d.c> {
        @Override // com.google.android.gms.common.api.a.AbstractC0111a
        @NonNull
        public final fvv buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull olc olcVar, @NonNull a.d.c cVar, @NonNull x3j x3jVar, @NonNull i380 i380Var) {
            return new fvv(context, looper, 352, olcVar, x3jVar, i380Var);
        }
    }
}
