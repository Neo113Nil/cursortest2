package sg.bigo.ads.bf;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.X3;

/* loaded from: classes9.dex */
final class a {
    @Nullable
    public static sg.bigo.ads.an.a a(@NonNull Context context) {
        try {
            Object invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            Boolean bool = (Boolean) invoke.getClass().getMethod(X3.j.M, null).invoke(invoke, null);
            String str = (String) invoke.getClass().getMethod("getId", null).invoke(invoke, null);
            if (str != null && bool != null) {
                return new sg.bigo.ads.an.a(str, bool.booleanValue());
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
