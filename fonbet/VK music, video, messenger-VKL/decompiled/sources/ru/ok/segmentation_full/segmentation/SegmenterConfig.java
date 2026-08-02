package ru.ok.segmentation_full.segmentation;

/* loaded from: classes9.dex */
public class SegmenterConfig {
    public final boolean isQuantized;
    public final boolean maskIsFirstOutput;

    public static class Builder {
        private boolean isQuantized = false;
        private boolean maskIsFirstOutput = true;

        public SegmenterConfig build() {
            return new SegmenterConfig(this);
        }

        public Builder setMaskIsFirstOutput(boolean z) {
            this.maskIsFirstOutput = z;
            return this;
        }

        public Builder setQuantized(boolean z) {
            this.isQuantized = z;
            return this;
        }
    }

    public SegmenterConfig(Builder builder) {
        this.isQuantized = builder.isQuantized;
        this.maskIsFirstOutput = builder.maskIsFirstOutput;
    }
}
