package xsna;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public interface vnv extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    public static abstract class a extends com.google.android.gms.internal.common.zzb implements vnv {
        @NonNull
        public static vnv f(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof vnv ? (vnv) queryLocalInterface : new a101(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
        }
    }
}
