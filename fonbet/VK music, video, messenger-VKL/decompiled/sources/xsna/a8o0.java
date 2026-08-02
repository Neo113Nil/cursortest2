package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class a8o0 implements a.d, a.d.InterfaceC0113d {

    @NonNull
    public static final a8o0 c = new a8o0(null);

    @Nullable
    public final String b;

    public /* synthetic */ a8o0(String str) {
        this.b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a8o0) {
            return dq70.b(this.b, ((a8o0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
