package xsna;

import android.annotation.SuppressLint;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: ImageProxy.java */
/* loaded from: classes11.dex */
public interface alw extends AutoCloseable {

    /* compiled from: ImageProxy.java */
    public interface a {
    }

    @NonNull
    ojw B();

    @NonNull
    @SuppressLint({"ArrayReturn"})
    a[] M2();

    int getFormat();

    int getHeight();

    @Nullable
    Image getImage();

    int getWidth();
}
