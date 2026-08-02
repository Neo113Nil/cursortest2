package com.ybsdk.rconfig.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/rconfig/model/ThemedImage;", "", "", "light", "dark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/model/ThemedImage;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLight", "getDark", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ThemedImage {

    @Json(name = "dark")
    private final String dark;

    @Json(name = "light")
    private final String light;

    public ThemedImage(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public static /* synthetic */ ThemedImage copy$default(ThemedImage themedImage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themedImage.light;
        }
        if ((i & 2) != 0) {
            str2 = themedImage.dark;
        }
        return themedImage.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLight() {
        return this.light;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDark() {
        return this.dark;
    }

    public final ThemedImage copy(String light, String dark) {
        return new ThemedImage(light, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemedImage)) {
            return false;
        }
        ThemedImage themedImage = (ThemedImage) other;
        return jl40.l(this.light, themedImage.light) && jl40.l(this.dark, themedImage.dark);
    }

    public final String getDark() {
        return this.dark;
    }

    public final String getLight() {
        return this.light;
    }

    public int hashCode() {
        return this.dark.hashCode() + (this.light.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("ThemedImage(light=", this.light, ", dark=", this.dark, Extension.C_BRAKE);
    }
}
