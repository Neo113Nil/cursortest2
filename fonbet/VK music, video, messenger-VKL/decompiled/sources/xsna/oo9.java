package xsna;

import android.content.Context;
import android.view.SurfaceView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.media.MediaUtils;
import java.util.concurrent.Executor;
import xsna.pk9;

/* compiled from: CameraViewHolder.java */
/* loaded from: classes3.dex */
public class oo9 {
    public final aj9 b;
    public final Executor c;
    public SurfaceView d;
    public pk9.b e;
    public boolean f = false;

    public oo9(@NonNull aj9 aj9Var, Context context, Executor executor) {
        this.b = aj9Var;
        this.c = executor;
        io9.f(context.getApplicationContext());
    }

    public void a(@Nullable MediaUtils.g gVar) {
        throw null;
    }

    public void b(boolean z) {
        throw null;
    }

    public final SurfaceView c() {
        SurfaceView surfaceView = this.d;
        if (surfaceView != null) {
            return surfaceView;
        }
        return null;
    }
}
