package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/AutoPullPermissionDto;", "", "id", "", "title", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "actionDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getActionDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoPullPermissionDto {
    private final String actionDescription;
    private final String id;
    private final Themes<String> image;
    private final String title;

    public AutoPullPermissionDto(@Json(name = "id") String str, @Json(name = "title") String str2, @Json(name = "image") Themes<String> themes, @Json(name = "action_description") String str3) {
        this.id = str;
        this.title = str2;
        this.image = themes;
        this.actionDescription = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoPullPermissionDto copy$default(AutoPullPermissionDto autoPullPermissionDto, String str, String str2, Themes themes, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoPullPermissionDto.id;
        }
        if ((i & 2) != 0) {
            str2 = autoPullPermissionDto.title;
        }
        if ((i & 4) != 0) {
            themes = autoPullPermissionDto.image;
        }
        if ((i & 8) != 0) {
            str3 = autoPullPermissionDto.actionDescription;
        }
        return autoPullPermissionDto.copy(str, str2, themes, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> component3() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getActionDescription() {
        return this.actionDescription;
    }

    public final AutoPullPermissionDto copy(@Json(name = "id") String id, @Json(name = "title") String title, @Json(name = "image") Themes<String> image, @Json(name = "action_description") String actionDescription) {
        return new AutoPullPermissionDto(id, title, image, actionDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoPullPermissionDto)) {
            return false;
        }
        AutoPullPermissionDto autoPullPermissionDto = (AutoPullPermissionDto) other;
        return jl40.l(this.id, autoPullPermissionDto.id) && jl40.l(this.title, autoPullPermissionDto.title) && jl40.l(this.image, autoPullPermissionDto.image) && jl40.l(this.actionDescription, autoPullPermissionDto.actionDescription);
    }

    public final String getActionDescription() {
        return this.actionDescription;
    }

    public final String getId() {
        return this.id;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.title);
        Themes<String> themes = this.image;
        return this.actionDescription.hashCode() + ((b + (themes == null ? 0 : themes.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        Themes<String> themes = this.image;
        String str3 = this.actionDescription;
        StringBuilder v = b64.v("AutoPullPermissionDto(id=", str, ", title=", str2, ", image=");
        v.append(themes);
        v.append(", actionDescription=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
