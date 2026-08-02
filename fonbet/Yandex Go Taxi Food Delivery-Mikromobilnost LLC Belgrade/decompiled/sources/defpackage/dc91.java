package defpackage;

import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class dc91 extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z);
        }
        Log.isLoggable("CloudMessengerCompat", 3);
        return zzd.class;
    }
}
