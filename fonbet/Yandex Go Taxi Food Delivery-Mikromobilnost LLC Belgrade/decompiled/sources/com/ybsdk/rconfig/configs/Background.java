package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J+\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/Background;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "color", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Background {

    @Json(name = "color")
    private final ThemedParameter<String> color;

    @Json(name = "image")
    private final ThemedParameter<String> image;

    public /* synthetic */ Background(ThemedParameter themedParameter, ThemedParameter themedParameter2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedParameter, themedParameter2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Background copy$default(Background background, ThemedParameter themedParameter, ThemedParameter themedParameter2, int i, Object obj) {
        if ((i & 1) != 0) {
            themedParameter = background.image;
        }
        if ((i & 2) != 0) {
            themedParameter2 = background.color;
        }
        return background.copy(themedParameter, themedParameter2);
    }

    public final ThemedParameter<String> component1() {
        return this.image;
    }

    public final ThemedParameter<String> component2() {
        return this.color;
    }

    public final Background copy(ThemedParameter<String> image, ThemedParameter<String> color) {
        return new Background(image, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Background)) {
            return false;
        }
        Background background = (Background) other;
        return jl40.l(this.image, background.image) && jl40.l(this.color, background.color);
    }

    public final ThemedParameter<String> getColor() {
        return this.color;
    }

    public final ThemedParameter<String> getImage() {
        return this.image;
    }

    public int hashCode() {
        ThemedParameter<String> themedParameter = this.image;
        return this.color.hashCode() + ((themedParameter == null ? 0 : themedParameter.hashCode()) * 31);
    }

    public String toString() {
        return "Background(image=" + this.image + ", color=" + this.color + Extension.C_BRAKE;
    }

    public Background(ThemedParameter<String> themedParameter, ThemedParameter<String> themedParameter2) {
        this.image = themedParameter;
        this.color = themedParameter2;
    }
}
