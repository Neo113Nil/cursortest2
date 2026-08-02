package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/rconfig/configs/PushNotificationReplacement;", "", "old", "", "new", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOld", "()Ljava/lang/String;", "getNew", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PushNotificationReplacement {

    @Json(name = "new")
    private final String new;

    @Json(name = "old")
    private final String old;

    public PushNotificationReplacement(String str, String str2) {
        this.old = str;
        this.new = str2;
    }

    public static /* synthetic */ PushNotificationReplacement copy$default(PushNotificationReplacement pushNotificationReplacement, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushNotificationReplacement.old;
        }
        if ((i & 2) != 0) {
            str2 = pushNotificationReplacement.new;
        }
        return pushNotificationReplacement.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOld() {
        return this.old;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNew() {
        return this.new;
    }

    public final PushNotificationReplacement copy(String old, String r2) {
        return new PushNotificationReplacement(old, r2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushNotificationReplacement)) {
            return false;
        }
        PushNotificationReplacement pushNotificationReplacement = (PushNotificationReplacement) other;
        return jl40.l(this.old, pushNotificationReplacement.old) && jl40.l(this.new, pushNotificationReplacement.new);
    }

    public final String getNew() {
        return this.new;
    }

    public final String getOld() {
        return this.old;
    }

    public int hashCode() {
        return this.new.hashCode() + (this.old.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("PushNotificationReplacement(old=", this.old, ", new=", this.new, Extension.C_BRAKE);
    }
}
