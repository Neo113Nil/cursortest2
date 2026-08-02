package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;

/* compiled from: TargetConfig.java */
/* loaded from: classes11.dex */
public interface x3o0<T> extends androidx.camera.core.impl.q {

    @NonNull
    public static final androidx.camera.core.impl.a o = Config.a.a(String.class, "camerax.core.target.name");

    @NonNull
    public static final androidx.camera.core.impl.a p = Config.a.a(Class.class, "camerax.core.target.class");

    @Nullable
    default String i(@Nullable String str) {
        return (String) g(o, str);
    }
}
