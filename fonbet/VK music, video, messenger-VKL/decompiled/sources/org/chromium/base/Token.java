package org.chromium.base;

import android.os.Bundle;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes8.dex */
public final class Token extends TokenBase {
    private static final String KEY_HIGH = "high";
    private static final String KEY_LOW = "low";

    public interface Natives {
        Token createRandom();
    }

    @CalledByNative
    public Token(long j, long j2) {
        super(j, j2);
    }

    public static Token createRandom() {
        return TokenJni.get().createRandom();
    }

    public static Token maybeCreateFromBundle(Bundle bundle) {
        if (bundle != null && bundle.containsKey(KEY_HIGH) && bundle.containsKey(KEY_LOW)) {
            return new Token(bundle.getLong(KEY_HIGH), bundle.getLong(KEY_LOW));
        }
        return null;
    }

    public long getHigh() {
        return this.mHigh;
    }

    public long getLow() {
        return this.mLow;
    }

    public boolean isZero() {
        return this.mHigh == 0 && this.mLow == 0;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong(KEY_HIGH, getHigh());
        bundle.putLong(KEY_LOW, getLow());
        return bundle;
    }

    public String toString() {
        return String.format("%016X%016X", Long.valueOf(this.mHigh), Long.valueOf(this.mLow));
    }
}
