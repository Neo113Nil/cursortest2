package xsna;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: MeteringRepeatingSession.java */
/* loaded from: classes11.dex */
public final class hj20 {
    public unw a;

    @NonNull
    public final androidx.camera.core.impl.r b;

    /* compiled from: MeteringRepeatingSession.java */
    public class a implements o0t<Void> {
        public final /* synthetic */ Surface b;
        public final /* synthetic */ SurfaceTexture c;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.b = surface;
            this.c = surfaceTexture;
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // xsna.o0t
        public final void onSuccess(@Nullable Void r1) {
            this.b.release();
            this.c.release();
        }
    }

    /* compiled from: MeteringRepeatingSession.java */
    public static class b implements androidx.camera.core.impl.u<vfq0> {

        @NonNull
        public final androidx.camera.core.impl.n s;

        public b() {
            androidx.camera.core.impl.n z = androidx.camera.core.impl.n.z();
            z.C(androidx.camera.core.impl.u.j, new jf9());
            this.s = z;
        }

        @Override // androidx.camera.core.impl.q
        @NonNull
        public final Config getConfig() {
            return this.s;
        }
    }

    public hj20(@NonNull tg9 tg9Var) {
        Size size;
        b bVar = new b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) tg9Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            s100.a("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.", null);
            size = new Size(0, 0);
        } else {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(34);
            if (outputSizes == null) {
                s100.a("MeteringRepeating", "Can not get output size list.", null);
                size = new Size(0, 0);
            } else {
                size = (Size) Collections.min(Arrays.asList(outputSizes), new gj20());
            }
        }
        Objects.toString(size);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        r.b c = r.b.c(bVar);
        c.b.c = 1;
        unw unwVar = new unw(surface);
        this.a = unwVar;
        r0t.a(r0t.e(unwVar.e), new a(surface, surfaceTexture), xo9.g());
        c.a(this.a);
        this.b = c.b();
    }
}
