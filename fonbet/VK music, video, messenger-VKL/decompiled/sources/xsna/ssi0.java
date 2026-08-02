package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.zzay;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class ssi0 {
    public static final o100 b = new o100("Session", null);

    @Nullable
    public final d001 a;

    public ssi0(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        this.a = zzay.zzb(context, str, str2, new j301(this));
    }

    public abstract void a(boolean z);

    public long b() {
        exc0.e("Must be called from the main thread.");
        return 0L;
    }

    public final boolean c() {
        exc0.e("Must be called from the main thread.");
        d001 d001Var = this.a;
        if (d001Var != null) {
            try {
                return d001Var.zzi();
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", "isConnected", d001.class.getSimpleName());
            }
        }
        return false;
    }

    public abstract void f(@Nullable Bundle bundle);

    public abstract void g(@Nullable Bundle bundle);

    public final int i() {
        exc0.e("Must be called from the main thread.");
        d001 d001Var = this.a;
        if (d001Var != null) {
            try {
                if (d001Var.zze() >= 211100000) {
                    return d001Var.zzo();
                }
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", "getSessionStartType", d001.class.getSimpleName());
            }
        }
        return 0;
    }

    public void d(@Nullable Bundle bundle) {
    }

    public void e(@Nullable Bundle bundle) {
    }

    public void h(@Nullable Bundle bundle) {
    }
}
