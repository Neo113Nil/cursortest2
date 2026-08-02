package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes8.dex */
public abstract class TokenBase {
    protected final long mHigh;
    protected final long mLow;

    public TokenBase(long j, long j2) {
        this.mHigh = j;
        this.mLow = j2;
    }

    @CalledByNative
    private long getHighForSerialization() {
        return this.mHigh;
    }

    @CalledByNative
    private long getLowForSerialization() {
        return this.mLow;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            TokenBase tokenBase = (TokenBase) obj;
            if (tokenBase.mHigh == this.mHigh && tokenBase.mLow == this.mLow) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.mLow;
        long j2 = this.mHigh;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }
}
