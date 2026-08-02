package com.yandex.pulse;

import android.content.Context;
import defpackage.jxi;
import defpackage.oyr;
import defpackage.w53;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011Ba\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fR\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/pulse/ApplicationParams;", "Lcom/yandex/pulse/ComponentParams;", "histogramPrefix", "", "channel", "", "packageName", "versionString", "metricaApiKey", "metricaDeviceId", "variations", "", "processCpuMonitoringParams", "Lcom/yandex/pulse/ProcessCpuMonitoringParams;", "metricaUuid", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/yandex/pulse/ProcessCpuMonitoringParams;Ljava/lang/String;)V", "Builder", "Companion", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApplicationParams extends ComponentParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final String metricaDeviceId;
    public final String metricaUuid;
    public final ProcessCpuMonitoringParams processCpuMonitoringParams;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u000bJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u000bJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u000fJ\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u000bJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u000bJ\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010'R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010&¨\u0006-"}, d2 = {"Lcom/yandex/pulse/ApplicationParams$Builder;", "", "<init>", "()V", "", "name", "value", "addVariationImpl", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/pulse/ApplicationParams$Builder;", "histogramPrefix", "setHistogramPrefix", "(Ljava/lang/String;)Lcom/yandex/pulse/ApplicationParams$Builder;", "", "channel", "setChannel", "(I)Lcom/yandex/pulse/ApplicationParams$Builder;", "Landroid/content/Context;", "context", "setPackageName", "(Landroid/content/Context;)Lcom/yandex/pulse/ApplicationParams$Builder;", "versionString", "setVersionString", "metricaApiKey", "setMetricaApiKey", "testId", "addVariationFromAB", "addVariation", "Lcom/yandex/pulse/ProcessCpuMonitoringParams;", "processCpuMonitoringParams", "setProcessCpuMonitoringParams", "(Lcom/yandex/pulse/ProcessCpuMonitoringParams;)Lcom/yandex/pulse/ApplicationParams$Builder;", "metricaDeviceId", "setMetricaDeviceId", "metricaUuid", "setMetricaUuid", "Lcom/yandex/pulse/ApplicationParams;", "build", "()Lcom/yandex/pulse/ApplicationParams;", "Ljava/lang/String;", CA20Status.STATUS_USER_I, "packageName", "Lw53;", "variations", "Lw53;", "Lcom/yandex/pulse/ProcessCpuMonitoringParams;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private int channel;
        private String histogramPrefix;
        private String metricaApiKey;
        private String metricaDeviceId;
        private String metricaUuid;
        private String packageName;
        private ProcessCpuMonitoringParams processCpuMonitoringParams;
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

        public final ApplicationParams build() {
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
            return new ApplicationParams(str2, i, str3, str4, str, this.metricaDeviceId, this.variations, this.processCpuMonitoringParams, this.metricaUuid, null);
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

        public final Builder setMetricaDeviceId(String metricaDeviceId) {
            this.metricaDeviceId = metricaDeviceId;
            return this;
        }

        public final Builder setMetricaUuid(String metricaUuid) {
            this.metricaUuid = metricaUuid;
            return this;
        }

        public final Builder setPackageName(Context context) {
            this.packageName = context.getPackageName();
            return this;
        }

        public final Builder setProcessCpuMonitoringParams(ProcessCpuMonitoringParams processCpuMonitoringParams) {
            this.processCpuMonitoringParams = processCpuMonitoringParams;
            return this;
        }

        public final Builder setVersionString(String versionString) {
            this.versionString = versionString;
            return this;
        }
    }

    private ApplicationParams(String str, int i, String str2, String str3, String str4, String str5, Map<String, String> map, ProcessCpuMonitoringParams processCpuMonitoringParams, String str6) {
        super(str, i, str2, str3, str4, map);
        this.metricaDeviceId = str5;
        this.processCpuMonitoringParams = processCpuMonitoringParams;
        this.metricaUuid = str6;
    }

    public static final Builder builder() {
        return INSTANCE.builder();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/yandex/pulse/ApplicationParams$Companion;", "", "()V", "builder", "Lcom/yandex/pulse/ApplicationParams$Builder;", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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

    public /* synthetic */ ApplicationParams(String str, int i, String str2, String str3, String str4, String str5, Map map, ProcessCpuMonitoringParams processCpuMonitoringParams, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, str5, map, processCpuMonitoringParams, str6);
    }
}
