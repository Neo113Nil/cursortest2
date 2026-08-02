package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/CloseAccountButtonDto;", "", "layoutId", "", "title", "action", "icon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getLayoutId", "()Ljava/lang/String;", "getTitle", "getAction", "getIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CloseAccountButtonDto {
    private final String action;
    private final Themes<String> icon;
    private final String layoutId;
    private final String title;

    public CloseAccountButtonDto(@Json(name = "layout_id") String str, @Json(name = "title") String str2, @Json(name = "action") String str3, @Json(name = "icon") Themes<String> themes) {
        this.layoutId = str;
        this.title = str2;
        this.action = str3;
        this.icon = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CloseAccountButtonDto copy$default(CloseAccountButtonDto closeAccountButtonDto, String str, String str2, String str3, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = closeAccountButtonDto.layoutId;
        }
        if ((i & 2) != 0) {
            str2 = closeAccountButtonDto.title;
        }
        if ((i & 4) != 0) {
            str3 = closeAccountButtonDto.action;
        }
        if ((i & 8) != 0) {
            themes = closeAccountButtonDto.icon;
        }
        return closeAccountButtonDto.copy(str, str2, str3, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLayoutId() {
        return this.layoutId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Themes<String> component4() {
        return this.icon;
    }

    public final CloseAccountButtonDto copy(@Json(name = "layout_id") String layoutId, @Json(name = "title") String title, @Json(name = "action") String action, @Json(name = "icon") Themes<String> icon) {
        return new CloseAccountButtonDto(layoutId, title, action, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseAccountButtonDto)) {
            return false;
        }
        CloseAccountButtonDto closeAccountButtonDto = (CloseAccountButtonDto) other;
        return jl40.l(this.layoutId, closeAccountButtonDto.layoutId) && jl40.l(this.title, closeAccountButtonDto.title) && jl40.l(this.action, closeAccountButtonDto.action) && jl40.l(this.icon, closeAccountButtonDto.icon);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getIcon() {
        return this.icon;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.layoutId.hashCode() * 31, 31, this.title), 31, this.action);
        Themes<String> themes = this.icon;
        return b + (themes == null ? 0 : themes.hashCode());
    }

    public String toString() {
        String str = this.layoutId;
        String str2 = this.title;
        String str3 = this.action;
        Themes<String> themes = this.icon;
        StringBuilder v = b64.v("CloseAccountButtonDto(layoutId=", str, ", title=", str2, ", action=");
        v.append(str3);
        v.append(", icon=");
        v.append(themes);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
