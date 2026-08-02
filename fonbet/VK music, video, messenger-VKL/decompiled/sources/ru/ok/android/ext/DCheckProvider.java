package ru.ok.android.ext;

import androidx.annotation.NonNull;
import xsna.e9e0;

/* loaded from: classes11.dex */
abstract class DCheckProvider<T> implements e9e0<T> {
    private volatile T object;

    @NonNull
    public abstract T create();

    @Override // xsna.e9e0
    public final T get() {
        if (this.object == null) {
            synchronized (this) {
                try {
                    if (this.object == null) {
                        this.object = create();
                    }
                } finally {
                }
            }
        }
        return this.object;
    }
}
