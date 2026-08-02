package org.chromium.base;

import internal.org.jni_zero.CalledByNative;
import java.util.Optional;
import xsna.ja3;

@FunctionalInterface
/* loaded from: classes8.dex */
public interface Callback<T> {

    public static abstract class Helper {
        @CalledByNative
        public static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.lambda$bind$0(Boolean.valueOf(z));
        }

        @CalledByNative
        public static void onIntResultFromNative(Callback callback, int i) {
            callback.lambda$bind$0(Integer.valueOf(i));
        }

        @CalledByNative
        public static void onLongResultFromNative(Callback callback, long j) {
            callback.lambda$bind$0(Long.valueOf(j));
        }

        @CalledByNative
        public static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.lambda$bind$0(obj);
        }

        @CalledByNative
        public static void onOptionalStringResultFromNative(Callback<Optional<String>> callback, boolean z, String str) {
            callback.lambda$bind$0(z ? Optional.of(str) : Optional.empty());
        }

        @CalledByNative
        public static void onTimeResultFromNative(Callback callback, long j) {
            callback.lambda$bind$0(Long.valueOf(j));
        }

        @CalledByNative
        public static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }

    static <T> void runNullSafe(Callback<T> callback, T t) {
        if (callback != null) {
            callback.lambda$bind$0(t);
        }
    }

    default Runnable bind(T t) {
        return new ja3(1, this, t);
    }

    /* renamed from: onResult, reason: merged with bridge method [inline-methods] */
    void lambda$bind$0(T t);
}
