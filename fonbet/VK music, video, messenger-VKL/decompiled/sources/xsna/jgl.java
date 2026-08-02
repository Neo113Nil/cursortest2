package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.bridges.ImageViewer;
import java.util.Set;

/* compiled from: DefaultImageViewerConfigProvider.kt */
/* loaded from: classes7.dex */
public final class jgl implements ymw {
    public final Context a;

    public jgl(Activity activity) {
        this.a = activity;
    }

    @Override // xsna.ymw
    public final boolean a() {
        return false;
    }

    @Override // xsna.ymw
    public final Set<ImageViewer.ControlsOptions.MenuItem> b() {
        ImageViewer.ControlsOptions.MenuItem.Companion.getClass();
        return ImageViewer.ControlsOptions.MenuItem.a.a();
    }

    @Override // xsna.ymw
    public final Boolean c() {
        return null;
    }

    @Override // xsna.ymw
    public final Context j() {
        return this.a;
    }
}
