package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: Initializer.java */
/* loaded from: classes12.dex */
public interface lzw<T> {
    @NonNull
    T create(@NonNull Context context);

    @NonNull
    List<Class<? extends lzw<?>>> dependencies();
}
