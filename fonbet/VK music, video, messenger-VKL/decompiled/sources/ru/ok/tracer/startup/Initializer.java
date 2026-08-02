package ru.ok.tracer.startup;

import android.content.Context;
import java.util.List;

/* compiled from: Initializer.kt */
/* loaded from: classes11.dex */
public interface Initializer<T> {
    T create(Context context);

    List<Class<? extends Initializer<?>>> dependencies();
}
