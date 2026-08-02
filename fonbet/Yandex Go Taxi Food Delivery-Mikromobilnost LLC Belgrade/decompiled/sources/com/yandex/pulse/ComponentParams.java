package com.yandex.pulse;

import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.cvu0;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eBC\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000RP\u0010\t\u001aB\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u0003 \r* \u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\n0\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/yandex/pulse/ComponentParams;", "", "histogramPrefix", "", "channel", "", "packageName", "versionString", "metricaApiKey", "variations", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "kotlin.jvm.PlatformType", "Companion", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ComponentParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final int channel;
    public final String histogramPrefix;
    public final String metricaApiKey;
    public final String packageName;
    public final Map<String, String> variations;
    public final String versionString;

    public ComponentParams(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        this.channel = i;
        this.packageName = str2;
        this.versionString = str3;
        this.metricaApiKey = str4;
        this.histogramPrefix = INSTANCE.sanitizePrefix(str);
        this.variations = Collections.unmodifiableMap(map);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0006"}, d2 = {"Lcom/yandex/pulse/ComponentParams$Companion;", "", "()V", "sanitizePrefix", "", AppSettingsContract$Setting.COLUMN_PREFIX, "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String sanitizePrefix(String prefix) {
            return prefix.length() == 0 ? "" : cvu0.s(prefix, Extension.DOT_CHAR, false) ? prefix : prefix.concat(Extension.DOT_CHAR);
        }

        private Companion() {
        }
    }
}
