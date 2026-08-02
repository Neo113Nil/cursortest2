package com.yandex.mobile.ads.common;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/yandex/mobile/ads/common/AdRequestError;", "", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "adUnitId", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", CA20Status.STATUS_USER_I, "getCode", "b", "Ljava/lang/String;", "getDescription", "c", "getAdUnitId", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdRequestError {

    /* renamed from: a, reason: from kotlin metadata */
    private final int code;

    /* renamed from: b, reason: from kotlin metadata */
    private final String description;

    /* renamed from: c, reason: from kotlin metadata */
    private final String adUnitId;

    public AdRequestError(int i, String str, String str2) {
        this.code = i;
        this.description = str;
        this.adUnitId = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !AdRequestError.class.equals(other.getClass())) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) other;
        if (this.code == adRequestError.code && jl40.l(this.adUnitId, adRequestError.adUnitId)) {
            return jl40.l(this.description, adRequestError.description);
        }
        return false;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        int hashCode = ((this.description.hashCode() * 31) + this.code) * 31;
        String str = this.adUnitId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = this.code;
        String str = this.description;
        String str2 = this.adUnitId;
        if (str2 == null) {
            str2 = "";
        }
        return oyr.t(unr0.v(i, "AdRequestError (code: ", ", description: ", str, ", adUnitId: "), str2, Extension.C_BRAKE);
    }
}
