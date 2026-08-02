package ru.ok.android.internal.tracer;

import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* compiled from: ThrowableDecorator.kt */
/* loaded from: classes9.dex */
public final class ThrowableDecoratorKt {
    public static final ThrowableDecorator withMetadata(Throwable th, Pair<String, ? extends Object>... pairArr) {
        return new ThrowableDecorator(th, (Pair<String, ? extends Object>[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final ThrowableDecorator withMetadata(Throwable th, String str, Object obj) {
        return new ThrowableDecorator(th, (Pair<String, ? extends Object>[]) new Pair[]{new Pair(str, obj)});
    }

    public static final ThrowableDecorator withMetadata(Throwable th, Map<String, ? extends Object> map) {
        return new ThrowableDecorator(th, map);
    }
}
