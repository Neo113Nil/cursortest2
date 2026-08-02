package ru.ok.android.webrtc.protocol;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcResponse;
import xsna.xq;

/* loaded from: classes9.dex */
public class RtcCommandConfig<Command extends RtcCommand<Response>, Response extends RtcResponse> {

    @NonNull
    public final Command command;

    @Nullable
    public final RtcCommandOnErrorListener<Command, Response> errorListener;
    public final long maxRetryCount;
    public final long maxRetryTimeoutMs;
    public final long minRetryTimeoutMs;
    public final float retryBackoffFactor;
    public final float retryBackoffJitter;

    @Nullable
    public final RtcCommandOnSentListener<Command, Response> sentListener;

    @Nullable
    public final RtcCommandOnSuccessListener<Command, Response> successListener;

    public static class Builder<Command extends RtcCommand<Response>, Response extends RtcResponse> {
        public final RtcCommand a;
        public RtcCommandOnSentListener b = null;
        public RtcCommandOnSuccessListener c = null;
        public RtcCommandOnErrorListener d = null;
        public long e = 0;
        public long f = TimeUnit.MILLISECONDS.toMillis(200);
        public long g = TimeUnit.SECONDS.toMillis(4);
        public float h = 2.0f;
        public float i = 0.1f;

        public Builder(@NonNull Command command) {
            if (command == null) {
                throw new IllegalArgumentException("Illegal 'command' value: null");
            }
            this.a = command;
        }

        public RtcCommandConfig<Command, Response> build() {
            return new RtcCommandConfig<>(this);
        }

        public Builder<Command, Response> setErrorListener(@Nullable RtcCommandOnErrorListener<Command, Response> rtcCommandOnErrorListener) {
            this.d = rtcCommandOnErrorListener;
            return this;
        }

        public Builder<Command, Response> setMaxRetryCount(long j) {
            this.e = j;
            return this;
        }

        public Builder<Command, Response> setMaxRetryTimeoutMs(long j) {
            this.g = j;
            return this;
        }

        public Builder<Command, Response> setMinRetryTimeoutMs(long j) {
            this.f = j;
            return this;
        }

        public Builder<Command, Response> setRetryBackoffFactor(float f) {
            this.h = f;
            return this;
        }

        public Builder<Command, Response> setRetryBackoffJitter(float f) {
            this.i = f;
            return this;
        }

        public Builder<Command, Response> setSentListener(@Nullable RtcCommandOnSentListener<Command, Response> rtcCommandOnSentListener) {
            this.b = rtcCommandOnSentListener;
            return this;
        }

        public Builder<Command, Response> setSuccessListener(@Nullable RtcCommandOnSuccessListener<Command, Response> rtcCommandOnSuccessListener) {
            this.c = rtcCommandOnSuccessListener;
            return this;
        }
    }

    public RtcCommandConfig(Builder builder) {
        Command command = (Command) builder.a;
        if (command == null) {
            throw new IllegalArgumentException("Illegal 'command' value: null");
        }
        long j = builder.e;
        if (j < 0) {
            throw new IllegalArgumentException("Illegal 'maxRetryCount' value: " + builder.e);
        }
        long j2 = builder.f;
        if (j2 < 0) {
            throw new IllegalArgumentException("Illegal 'minRetryTimeoutMs' value: " + builder.f);
        }
        long j3 = builder.g;
        if (j3 < 0) {
            throw new IllegalArgumentException("Illegal 'maxRetryTimeoutMs' value: " + builder.g);
        }
        float f = builder.h;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + builder.h);
        }
        float f2 = builder.i;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + builder.i);
        }
        this.command = command;
        this.sentListener = builder.b;
        this.successListener = builder.c;
        this.errorListener = builder.d;
        this.maxRetryCount = j;
        this.minRetryTimeoutMs = j2;
        this.maxRetryTimeoutMs = j3;
        this.retryBackoffFactor = f;
        this.retryBackoffJitter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RtcCommandConfig{command=");
        sb.append(this.command);
        sb.append(", sentListener=");
        sb.append(this.sentListener);
        sb.append(", successListener=");
        sb.append(this.successListener);
        sb.append(", errorListener=");
        sb.append(this.errorListener);
        sb.append(", maxRetryCount=");
        sb.append(this.maxRetryCount);
        sb.append(", minRetryTimeoutMs=");
        sb.append(this.minRetryTimeoutMs);
        sb.append(", maxRetryTimeoutMs=");
        sb.append(this.maxRetryTimeoutMs);
        sb.append(", retryBackoffFactor=");
        sb.append(this.retryBackoffFactor);
        sb.append(", retryBackoffJitter=");
        return xq.c('}', this.retryBackoffJitter, sb);
    }
}
