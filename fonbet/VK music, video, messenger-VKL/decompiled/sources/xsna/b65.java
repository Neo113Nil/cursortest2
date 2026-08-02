package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class b65 implements a.d, a.d.InterfaceC0113d {

    @NonNull
    public static final b65 c = new b65(new Bundle());
    public final Bundle b;

    public /* synthetic */ b65(Bundle bundle) {
        this.b = bundle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b65) {
            return dq70.a(this.b, ((b65) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
