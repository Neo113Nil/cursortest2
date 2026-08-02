package one.video.calls.sdk.experiments.models;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* loaded from: classes8.dex */
public final class PcapLabelConfig {
    public final String a;
    public final Source b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Source {
        public static final Source AI_OPUS_BWE;
        public static final Source NS;
        public static final /* synthetic */ Source[] a;
        public static final /* synthetic */ zrp b;

        static {
            Source source = new Source("NS", 0);
            NS = source;
            Source source2 = new Source("AI_OPUS_BWE", 1);
            AI_OPUS_BWE = source2;
            Source[] sourceArr = {source, source2};
            a = sourceArr;
            b = new asp(sourceArr);
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) a.clone();
        }
    }

    public PcapLabelConfig(String str, Source source) {
        this.a = str;
        this.b = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcapLabelConfig)) {
            return false;
        }
        PcapLabelConfig pcapLabelConfig = (PcapLabelConfig) obj;
        return epx.f(this.a, pcapLabelConfig.a) && this.b == pcapLabelConfig.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PcapLabelConfig(label=" + this.a + ", source=" + this.b + ")";
    }
}
