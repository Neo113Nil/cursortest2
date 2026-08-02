package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface oxy {
    void cleanLoadingTask();

    Future getLoadingTask();

    boolean isImageLoaded();

    boolean isImagePreview();

    void saveLoadingTask(Future future);

    void setImage(Drawable drawable);
}
