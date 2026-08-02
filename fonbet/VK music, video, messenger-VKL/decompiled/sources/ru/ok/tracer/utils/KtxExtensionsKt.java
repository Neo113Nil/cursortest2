package ru.ok.tracer.utils;

import kotlin.random.Random;

/* compiled from: KtxExtensions.kt */
/* loaded from: classes9.dex */
public final class KtxExtensionsKt {
    public static final boolean testProbability(Long l) {
        if (l == null) {
            return false;
        }
        long longValue = l.longValue();
        if (longValue < 0) {
            return false;
        }
        if (longValue == 0) {
            return true;
        }
        Random.b.getClass();
        return Random.c.n(longValue) == 0;
    }
}
