package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.zzay;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class f701 extends AsyncTask {
    public static final o100 c = new o100("FetchBitmapTask", null);

    @Nullable
    public final kc01 a;
    public final i201 b;

    public f701(Context context, int i, int i2, i201 i201Var) {
        this.b = i201Var;
        this.a = zzay.zze(context.getApplicationContext(), this, new c601(this), i, i2, false, 2097152L, 5, 333, 10000);
    }

    @Override // android.os.AsyncTask
    @Nullable
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        kc01 kc01Var;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (kc01Var = this.a) != null) {
            try {
                return kc01Var.T(uri);
            } catch (RemoteException unused) {
                c.b("Unable to call %s on %s.", "doFetch", kc01.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        i201 i201Var = this.b;
        if (i201Var != null) {
            ttz0 ttz0Var = i201Var.e;
            if (ttz0Var != null) {
                ttz0Var.zza(bitmap);
            }
            i201Var.d = null;
        }
    }
}
