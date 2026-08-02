package ru.ok.android.webrtc.layout;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class VideoDisplayLayout {
    public final int a;
    public final int b;
    public final Fit c;

    public static final class Builder {
        public int a = 0;
        public int b = 0;
        public Fit c = Fit.COVER;

        public VideoDisplayLayout build() {
            if (this.a <= 0 || this.b <= 0) {
                throw new IllegalArgumentException("width and height must be positive");
            }
            return new VideoDisplayLayout(this);
        }

        public Builder setFit(@NonNull Fit fit) {
            this.c = fit;
            return this;
        }

        public Builder setHeight(int i) {
            this.b = i;
            return this;
        }

        public Builder setWidth(int i) {
            this.a = i;
            return this;
        }
    }

    public enum Fit {
        COVER,
        CONTAIN
    }

    public VideoDisplayLayout(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VideoDisplayLayout.class == obj.getClass()) {
            VideoDisplayLayout videoDisplayLayout = (VideoDisplayLayout) obj;
            if (this.a == videoDisplayLayout.a && this.b == videoDisplayLayout.b && this.c == videoDisplayLayout.c) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Fit getFit() {
        return this.c;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public String toString() {
        return "VideoDisplayLayout{width=" + this.a + ", height=" + this.b + ", fit=" + this.c + '}';
    }
}
