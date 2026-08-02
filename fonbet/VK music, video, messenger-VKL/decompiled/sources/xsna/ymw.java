package xsna;

import android.content.Context;
import com.vk.bridges.ImageViewer;
import java.util.Set;

/* compiled from: ImageViewerConfigProvider.kt */
/* loaded from: classes7.dex */
public interface ymw {
    default boolean a() {
        return false;
    }

    default Set<ImageViewer.ControlsOptions.MenuItem> b() {
        ImageViewer.ControlsOptions.MenuItem.Companion.getClass();
        return ImageViewer.ControlsOptions.MenuItem.a.a();
    }

    default Boolean c() {
        return null;
    }

    Context j();
}
