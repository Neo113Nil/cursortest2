package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;

/* compiled from: CameraFactory.java */
/* loaded from: classes11.dex */
public interface oi9 {

    /* compiled from: CameraFactory.java */
    public interface a {
        @NonNull
        se9 a(@NonNull Context context, @NonNull sk5 sk5Var, @Nullable nl9 nl9Var) throws InitializationException;
    }

    @Nullable
    bj9 a();

    @NonNull
    we9 c(@NonNull String str) throws CameraUnavailableException;

    @NonNull
    LinkedHashSet d();
}
