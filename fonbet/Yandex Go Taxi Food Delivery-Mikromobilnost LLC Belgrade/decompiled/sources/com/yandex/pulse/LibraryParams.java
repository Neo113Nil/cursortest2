package com.yandex.pulse;

import defpackage.jxi;
import defpackage.oyr;
import defpackage.w53;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0002\f\rBC\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/yandex/pulse/LibraryParams;", "Lcom/yandex/pulse/ComponentParams;", "histogramPrefix", "", "channel", "", "packageName", "versionString", "metricaApiKey", "variations", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Builder", "Companion", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LibraryParams extends ComponentParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u000bJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000fJ\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\bJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/pulse/LibraryParams$Builder;", "", "<init>", "()V", "", "name", "value", "addVariationImpl", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/pulse/LibraryParams$Builder;", "histogramPrefix", "setHistogramPrefix", "(Ljava/lang/String;)Lcom/yandex/pulse/LibraryParams$Builder;", "", "channel", "setChannel", "(I)Lcom/yandex/pulse/LibraryParams$Builder;", "packageName", "setPackageName", "versionString", "setVersionString", "metricaApiKey", "setMetricaApiKey", "testId", "addVariationFromAB", "addVariation", "Lcom/yandex/pulse/LibraryParams;", "build", "()Lcom/yandex/pulse/LibraryParams;", "Ljava/lang/String;", CA20Status.STATUS_USER_I, "Lw53;", "variations", "Lw53;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private int channel;
        private String histogramPrefix;
        private String metricaApiKey;
        private String packageName;
        private final w53 variations = new w53();
        private String versionString;

        private final Builder addVariationImpl(String name, String value) {
            this.variations.put(name, value);
            return this;
        }

        @jxi
        public final Builder addVariation(String name, String value) {
            return addVariationImpl(name, value);
        }

        public final Builder addVariationFromAB(int testId) {
            return addVariationImpl(oyr.i(testId, "ab-"), String.valueOf(testId));
        }

        public final LibraryParams build() {
            String str;
            String str2 = this.histogramPrefix;
            if (str2 == null) {
                str2 = null;
                str = null;
            } else {
                str = null;
            }
            int i = this.channel;
            String str3 = this.packageName;
            if (str3 == null) {
                str3 = str;
            }
            String str4 = this.versionString;
            if (str4 == null) {
                str4 = str;
            }
            String str5 = this.metricaApiKey;
            if (str5 != null) {
                str = str5;
            }
            return new LibraryParams(str2, i, str3, str4, str, this.variations, null);
        }

        public final Builder setChannel(int channel) {
            this.channel = channel;
            return this;
        }

        public final Builder setHistogramPrefix(String histogramPrefix) {
            this.histogramPrefix = histogramPrefix;
            return this;
        }

        public final Builder setMetricaApiKey(String metricaApiKey) {
            this.metricaApiKey = metricaApiKey;
            return this;
        }

        public final Builder setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public final Builder setVersionString(String versionString) {
            this.versionString = versionString;
            return this;
        }
    }

    public /* synthetic */ LibraryParams(String str, int i, String str2, String str3, String str4, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, map);
    }

    public static final Builder builder() {
        return INSTANCE.builder();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/yandex/pulse/LibraryParams$Companion;", "", "()V", "builder", "Lcom/yandex/pulse/LibraryParams$Builder;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    private LibraryParams(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        super(str, i, str2, str3, str4, map);
    }
}
