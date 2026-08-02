package xsna;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes13.dex */
public final /* synthetic */ class z501 implements OnFailureListener {
    public static final /* synthetic */ z501 a = new z501();

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        f3u f3uVar = ru20.f;
        if (Log.isLoggable(f3uVar.a, 6)) {
            String str = f3uVar.b;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }
}
