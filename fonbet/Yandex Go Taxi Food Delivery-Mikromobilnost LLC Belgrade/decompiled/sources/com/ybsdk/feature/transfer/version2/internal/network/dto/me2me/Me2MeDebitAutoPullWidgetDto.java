package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullWidgetDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "themes", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto$Theme;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getThemes", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Me2MeDebitAutoPullWidgetDto {
    private final String description;
    private final Themes<WidgetDto.Theme> themes;
    private final String title;

    public Me2MeDebitAutoPullWidgetDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "themes") Themes<WidgetDto.Theme> themes) {
        this.title = str;
        this.description = str2;
        this.themes = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Me2MeDebitAutoPullWidgetDto copy$default(Me2MeDebitAutoPullWidgetDto me2MeDebitAutoPullWidgetDto, String str, String str2, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = me2MeDebitAutoPullWidgetDto.title;
        }
        if ((i & 2) != 0) {
            str2 = me2MeDebitAutoPullWidgetDto.description;
        }
        if ((i & 4) != 0) {
            themes = me2MeDebitAutoPullWidgetDto.themes;
        }
        return me2MeDebitAutoPullWidgetDto.copy(str, str2, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<WidgetDto.Theme> component3() {
        return this.themes;
    }

    public final Me2MeDebitAutoPullWidgetDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "themes") Themes<WidgetDto.Theme> themes) {
        return new Me2MeDebitAutoPullWidgetDto(title, description, themes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Me2MeDebitAutoPullWidgetDto)) {
            return false;
        }
        Me2MeDebitAutoPullWidgetDto me2MeDebitAutoPullWidgetDto = (Me2MeDebitAutoPullWidgetDto) other;
        return jl40.l(this.title, me2MeDebitAutoPullWidgetDto.title) && jl40.l(this.description, me2MeDebitAutoPullWidgetDto.description) && jl40.l(this.themes, me2MeDebitAutoPullWidgetDto.themes);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<WidgetDto.Theme> getThemes() {
        return this.themes;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.themes.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.description);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        return smw0.l(b64.v("Me2MeDebitAutoPullWidgetDto(title=", str, ", description=", str2, ", themes="), this.themes, Extension.C_BRAKE);
    }
}
