package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.ko01;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u000eR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrReaderDescription;", "", "", "isEnabled", "", "", "Lcom/ybsdk/core/utils/text/Text;", "descriptionTextsByOrigin", "<init>", "(ZLjava/util/Map;)V", "Lko01;", "toEntity", "()Lko01;", "component1", "()Z", "component2", "()Ljava/util/Map;", "copy", "(ZLjava/util/Map;)Lcom/ybsdk/rconfig/configs/QrReaderDescription;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/util/Map;", "getDescriptionTextsByOrigin", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QrReaderDescription {

    @Json(name = "description_texts_by_origin")
    private final Map<String, Text> descriptionTextsByOrigin;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public QrReaderDescription(boolean z, Map<String, ? extends Text> map) {
        this.isEnabled = z;
        this.descriptionTextsByOrigin = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QrReaderDescription copy$default(QrReaderDescription qrReaderDescription, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = qrReaderDescription.isEnabled;
        }
        if ((i & 2) != 0) {
            map = qrReaderDescription.descriptionTextsByOrigin;
        }
        return qrReaderDescription.copy(z, map);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final Map<String, Text> component2() {
        return this.descriptionTextsByOrigin;
    }

    public final QrReaderDescription copy(boolean isEnabled, Map<String, ? extends Text> descriptionTextsByOrigin) {
        return new QrReaderDescription(isEnabled, descriptionTextsByOrigin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrReaderDescription)) {
            return false;
        }
        QrReaderDescription qrReaderDescription = (QrReaderDescription) other;
        return this.isEnabled == qrReaderDescription.isEnabled && jl40.l(this.descriptionTextsByOrigin, qrReaderDescription.descriptionTextsByOrigin);
    }

    public final Map<String, Text> getDescriptionTextsByOrigin() {
        return this.descriptionTextsByOrigin;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Map<String, Text> map = this.descriptionTextsByOrigin;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final ko01 toEntity() {
        return new ko01(this.isEnabled, this.descriptionTextsByOrigin);
    }

    public String toString() {
        return "QrReaderDescription(isEnabled=" + this.isEnabled + ", descriptionTextsByOrigin=" + this.descriptionTextsByOrigin + Extension.C_BRAKE;
    }
}
