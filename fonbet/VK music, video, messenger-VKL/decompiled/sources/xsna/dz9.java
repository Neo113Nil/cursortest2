package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class dz9 {
    public static final /* synthetic */ int a = 0;

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    public interface a extends qdg0 {
        @Nullable
        String d();

        @Nullable
        ApplicationMetadata e();

        boolean g();

        @Nullable
        String getSessionId();
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    public static final class b implements a.d {
        public final CastDevice b;
        public final vr01 c;
        public final Bundle d;
        public final String e = UUID.randomUUID().toString();

        /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
        public static final class a {
            public final CastDevice a;
            public final vr01 b;
            public Bundle c;

            public a(@NonNull CastDevice castDevice, @NonNull vr01 vr01Var) {
                exc0.j(castDevice, "CastDevice parameter cannot be null");
                this.a = castDevice;
                this.b = vr01Var;
            }
        }

        public /* synthetic */ b(a aVar) {
            this.b = aVar.a;
            this.c = aVar.b;
            this.d = aVar.c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return dq70.b(this.b, bVar.b) && dq70.a(this.d, bVar.d) && dq70.b(this.e, bVar.e);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.b, this.d, 0, this.e});
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    public interface d {
        void a(@NonNull String str);
    }

    static {
        new x801();
        exc0.j(qxz0.a, "Cannot construct an Api with a null ClientKey");
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    public static class c {
        public void onApplicationStatusChanged() {
        }

        public void onDeviceNameChanged() {
        }

        public void onVolumeChanged() {
        }

        public void onActiveInputStateChanged(int i) {
        }

        public void onApplicationDisconnected(int i) {
        }

        public void onApplicationMetadataChanged(@Nullable ApplicationMetadata applicationMetadata) {
        }

        public void onStandbyStateChanged(int i) {
        }
    }
}
