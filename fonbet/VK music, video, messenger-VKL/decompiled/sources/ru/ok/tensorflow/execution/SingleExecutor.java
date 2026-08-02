package ru.ok.tensorflow.execution;

import android.util.Pair;

/* loaded from: classes9.dex */
public interface SingleExecutor<T, R> {
    Pair<Boolean, R> execute(T t);
}
