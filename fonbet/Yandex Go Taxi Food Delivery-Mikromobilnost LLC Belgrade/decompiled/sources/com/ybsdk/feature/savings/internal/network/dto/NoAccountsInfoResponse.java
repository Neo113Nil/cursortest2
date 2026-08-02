package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/NoAccountsInfoResponse;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "buttonText", "action", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getButtonText", "getAction", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NoAccountsInfoResponse {
    private final String action;
    private final String buttonText;
    private final String description;
    private final Themes<String> image;
    private final String title;

    public NoAccountsInfoResponse(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "button_text") String str3, @Json(name = "action") String str4, @Json(name = "image") Themes<String> themes) {
        this.title = str;
        this.description = str2;
        this.buttonText = str3;
        this.action = str4;
        this.image = themes;
    }

    public static /* synthetic */ NoAccountsInfoResponse copy$default(NoAccountsInfoResponse noAccountsInfoResponse, String str, String str2, String str3, String str4, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noAccountsInfoResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = noAccountsInfoResponse.description;
        }
        if ((i & 4) != 0) {
            str3 = noAccountsInfoResponse.buttonText;
        }
        if ((i & 8) != 0) {
            str4 = noAccountsInfoResponse.action;
        }
        if ((i & 16) != 0) {
            themes = noAccountsInfoResponse.image;
        }
        Themes themes2 = themes;
        String str5 = str3;
        return noAccountsInfoResponse.copy(str, str2, str5, str4, themes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Themes<String> component5() {
        return this.image;
    }

    public final NoAccountsInfoResponse copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "button_text") String buttonText, @Json(name = "action") String action, @Json(name = "image") Themes<String> image) {
        return new NoAccountsInfoResponse(title, description, buttonText, action, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoAccountsInfoResponse)) {
            return false;
        }
        NoAccountsInfoResponse noAccountsInfoResponse = (NoAccountsInfoResponse) other;
        return jl40.l(this.title, noAccountsInfoResponse.title) && jl40.l(this.description, noAccountsInfoResponse.description) && jl40.l(this.buttonText, noAccountsInfoResponse.buttonText) && jl40.l(this.action, noAccountsInfoResponse.action) && jl40.l(this.image, noAccountsInfoResponse.image);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        return this.image.hashCode() + unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttonText), 31, this.action);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.buttonText;
        String str4 = this.action;
        Themes<String> themes = this.image;
        StringBuilder v = b64.v("NoAccountsInfoResponse(title=", str, ", description=", str2, ", buttonText=");
        g8e.D(v, str3, ", action=", str4, ", image=");
        return smw0.l(v, themes, Extension.C_BRAKE);
    }
}
