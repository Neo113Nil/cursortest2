package com.yandex.passport.internal.ui.sloth.ebs;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 12\u00020\u0001:\u00012B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b#\u0010\u0017J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/ebs/BiometricVerificationProperties;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/common/core/Uid;", "uid", "", "biometricSessionId", "flowId", "serviceId", "Lcom/yandex/passport/common/ui/AppTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "<init>", "(Lcom/yandex/passport/common/core/Uid;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/passport/common/ui/AppTheme;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/common/core/Uid;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/yandex/passport/common/ui/AppTheme;", "copy", "(Lcom/yandex/passport/common/core/Uid;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/passport/common/ui/AppTheme;)Lcom/yandex/passport/internal/ui/sloth/ebs/BiometricVerificationProperties;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/common/core/Uid;", "getUid", "Ljava/lang/String;", "getBiometricSessionId", "getFlowId", "getServiceId", "Lcom/yandex/passport/common/ui/AppTheme;", "getTheme", "Companion", "com/yandex/passport/internal/ui/sloth/ebs/f", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BiometricVerificationProperties implements Parcelable {
    private static final String KEY_BIOMETRIC_VERIFICATION_PROPERTIES = "biometric_verification_props";
    private final String biometricSessionId;
    private final String flowId;
    private final String serviceId;
    private final AppTheme theme;
    private final Uid uid;
    public static final f Companion = new f();
    public static final int $stable = Uid.$stable;
    public static final Parcelable.Creator<BiometricVerificationProperties> CREATOR = new Creator();

    public BiometricVerificationProperties(Uid uid, String str, String str2, String str3, AppTheme appTheme) {
        this.uid = uid;
        this.biometricSessionId = str;
        this.flowId = str2;
        this.serviceId = str3;
        this.theme = appTheme;
    }

    public static /* synthetic */ BiometricVerificationProperties copy$default(BiometricVerificationProperties biometricVerificationProperties, Uid uid, String str, String str2, String str3, AppTheme appTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            uid = biometricVerificationProperties.uid;
        }
        if ((i & 2) != 0) {
            str = biometricVerificationProperties.biometricSessionId;
        }
        if ((i & 4) != 0) {
            str2 = biometricVerificationProperties.flowId;
        }
        if ((i & 8) != 0) {
            str3 = biometricVerificationProperties.serviceId;
        }
        if ((i & 16) != 0) {
            appTheme = biometricVerificationProperties.theme;
        }
        AppTheme appTheme2 = appTheme;
        String str4 = str2;
        return biometricVerificationProperties.copy(uid, str, str4, str3, appTheme2);
    }

    /* renamed from: component1, reason: from getter */
    public final Uid getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBiometricSessionId() {
        return this.biometricSessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFlowId() {
        return this.flowId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* renamed from: component5, reason: from getter */
    public final AppTheme getTheme() {
        return this.theme;
    }

    public final BiometricVerificationProperties copy(Uid uid, String biometricSessionId, String flowId, String serviceId, AppTheme theme) {
        return new BiometricVerificationProperties(uid, biometricSessionId, flowId, serviceId, theme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricVerificationProperties)) {
            return false;
        }
        BiometricVerificationProperties biometricVerificationProperties = (BiometricVerificationProperties) other;
        return jl40.l(this.uid, biometricVerificationProperties.uid) && jl40.l(this.biometricSessionId, biometricVerificationProperties.biometricSessionId) && jl40.l(this.flowId, biometricVerificationProperties.flowId) && jl40.l(this.serviceId, biometricVerificationProperties.serviceId) && this.theme == biometricVerificationProperties.theme;
    }

    public final String getBiometricSessionId() {
        return this.biometricSessionId;
    }

    public final String getFlowId() {
        return this.flowId;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final AppTheme getTheme() {
        return this.theme;
    }

    public final Uid getUid() {
        return this.uid;
    }

    public int hashCode() {
        int b = unr0.b(this.uid.hashCode() * 31, 31, this.biometricSessionId);
        String str = this.flowId;
        return this.theme.hashCode() + unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.serviceId);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_BIOMETRIC_VERIFICATION_PROPERTIES, this));
    }

    public String toString() {
        return "BiometricVerificationProperties(uid=" + this.uid + ", biometricSessionId=" + this.biometricSessionId + ", flowId=" + this.flowId + ", serviceId=" + this.serviceId + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.uid, flags);
        dest.writeString(this.biometricSessionId);
        dest.writeString(this.flowId);
        dest.writeString(this.serviceId);
        dest.writeString(this.theme.name());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BiometricVerificationProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricVerificationProperties createFromParcel(Parcel parcel) {
            return new BiometricVerificationProperties((Uid) parcel.readParcelable(BiometricVerificationProperties.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), AppTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricVerificationProperties[] newArray(int i) {
            return new BiometricVerificationProperties[i];
        }
    }
}
