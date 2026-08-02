package xsna;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.auth_blockstore.zzab;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.f5o0;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public final class glx extends com.google.android.gms.common.api.b<a.d.c> {
    public static final com.google.android.gms.common.api.a<a.d.c> a = new com.google.android.gms.common.api.a<>("RestoreCredential.API", new a(), new a.g());

    /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
    public static final class a extends a.AbstractC0111a<acg0, a.d.c> {
        @Override // com.google.android.gms.common.api.a.AbstractC0111a
        @NonNull
        public final acg0 buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull olc olcVar, @NonNull a.d.c cVar, @NonNull x3j x3jVar, @NonNull i380 i380Var) {
            return new acg0(context, looper, 381, olcVar, x3jVar, i380Var);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
    public static final class b extends jmv {
        public final /* synthetic */ TaskCompletionSource<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TaskCompletionSource<Boolean> taskCompletionSource) {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback");
            this.a = taskCompletionSource;
        }
    }

    public final Task<Boolean> a(@NonNull ClearRestoreCredentialRequest clearRestoreCredentialRequest) {
        f5o0.a a2 = f5o0.a();
        a2.d = new Feature[]{zzab.zzi};
        dlx dlxVar = new dlx();
        dlxVar.b = clearRestoreCredentialRequest;
        a2.a = dlxVar;
        a2.e = 1694;
        return doRead(a2.a());
    }
}
