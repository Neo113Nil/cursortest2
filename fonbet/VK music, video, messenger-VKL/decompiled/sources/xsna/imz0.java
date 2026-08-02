package xsna;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import java.util.Arrays;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dq70;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class imz0 {
    public final ty2 a;
    public final Feature b;

    public /* synthetic */ imz0(ty2 ty2Var, Feature feature) {
        this.a = ty2Var;
        this.b = feature;
    }

    public final /* synthetic */ ty2 a() {
        return this.a;
    }

    public final /* synthetic */ Feature b() {
        return this.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof imz0) {
            imz0 imz0Var = (imz0) obj;
            if (dq70.b(this.a, imz0Var.a) && dq70.b(this.b, imz0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.a, "key");
        aVar.a(this.b, SignalingProtocol.KEY_FEATURE);
        return aVar.toString();
    }
}
