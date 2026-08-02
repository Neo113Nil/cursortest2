package ru.ok.android.externcalls.sdk.ml.model;

import java.io.Serializable;
import xsna.epx;
import xsna.i5s;
import xsna.urd0;

/* compiled from: AvailableMLFeatureInfo.kt */
/* loaded from: classes9.dex */
public final class AvailableMLFeatureInfo implements Serializable {
    private final String path;
    private final MLFeatureType type;
    private final String version;

    public AvailableMLFeatureInfo(MLFeatureType mLFeatureType, String str, String str2) {
        this.type = mLFeatureType;
        this.version = str;
        this.path = str2;
    }

    public static /* synthetic */ AvailableMLFeatureInfo copy$default(AvailableMLFeatureInfo availableMLFeatureInfo, MLFeatureType mLFeatureType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            mLFeatureType = availableMLFeatureInfo.type;
        }
        if ((i & 2) != 0) {
            str = availableMLFeatureInfo.version;
        }
        if ((i & 4) != 0) {
            str2 = availableMLFeatureInfo.path;
        }
        return availableMLFeatureInfo.copy(mLFeatureType, str, str2);
    }

    public final MLFeatureType component1() {
        return this.type;
    }

    public final String component2() {
        return this.version;
    }

    public final String component3() {
        return this.path;
    }

    public final AvailableMLFeatureInfo copy(MLFeatureType mLFeatureType, String str, String str2) {
        return new AvailableMLFeatureInfo(mLFeatureType, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableMLFeatureInfo)) {
            return false;
        }
        AvailableMLFeatureInfo availableMLFeatureInfo = (AvailableMLFeatureInfo) obj;
        return this.type == availableMLFeatureInfo.type && epx.f(this.version, availableMLFeatureInfo.version) && epx.f(this.path, availableMLFeatureInfo.path);
    }

    public final String getPath() {
        return this.path;
    }

    public final MLFeatureType getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.path.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.version);
    }

    public String toString() {
        MLFeatureType mLFeatureType = this.type;
        String str = this.version;
        String str2 = this.path;
        StringBuilder sb = new StringBuilder("AvailableMLFeatureInfo(type=");
        sb.append(mLFeatureType);
        sb.append(", version=");
        sb.append(str);
        sb.append(", path=");
        return i5s.a(sb, str2, ")");
    }
}
