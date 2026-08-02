package com.monetization.ads.mediation.base;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/monetization/ads/mediation/base/MediatedAdRequestError;", "", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "<init>", "(ILjava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", CA20Status.STATUS_USER_I, "getCode", "b", "Ljava/lang/String;", "getDescription", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediatedAdRequestError {

    /* renamed from: a, reason: from kotlin metadata */
    private final int code;

    /* renamed from: b, reason: from kotlin metadata */
    private final String description;

    public MediatedAdRequestError(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!MediatedAdRequestError.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        MediatedAdRequestError mediatedAdRequestError = (MediatedAdRequestError) other;
        if (this.code != mediatedAdRequestError.code) {
            return false;
        }
        return jl40.l(this.description, mediatedAdRequestError.description);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.code * 31);
    }

    public String toString() {
        return oyr.l(this.code, "AdRequestError (code: ", ", description: ", this.description, Extension.C_BRAKE);
    }
}
