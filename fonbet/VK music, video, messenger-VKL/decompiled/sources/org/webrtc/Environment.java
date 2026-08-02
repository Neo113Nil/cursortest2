package org.webrtc;

import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public final class Environment implements AutoCloseable {
    private final long webrtcEnv;

    public static class Builder {

        @Nullable
        private String fieldTrials;

        public Environment build() {
            return new Environment(this.fieldTrials, 0);
        }

        public Builder setFieldTrials(String str) {
            this.fieldTrials = str;
            return this;
        }
    }

    public /* synthetic */ Environment(String str, int i) {
        this(str);
    }

    public static Builder builder() {
        return new Builder();
    }

    private static native long nativeCreate(@Nullable String str);

    private static native void nativeFree(long j);

    @Override // java.lang.AutoCloseable
    public void close() {
        nativeFree(this.webrtcEnv);
    }

    public long ref() {
        return this.webrtcEnv;
    }

    private Environment(@Nullable String str) {
        this.webrtcEnv = nativeCreate(str);
    }
}
