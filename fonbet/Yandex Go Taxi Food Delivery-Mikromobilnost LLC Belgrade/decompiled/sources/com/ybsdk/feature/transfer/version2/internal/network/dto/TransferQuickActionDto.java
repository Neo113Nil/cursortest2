package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferQuickActionDto;", "", "title", "", "actions", "", "icon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTitle", "()Ljava/lang/String;", "getActions", "()Ljava/util/List;", "getIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferQuickActionDto {
    private final List<String> actions;
    private final Themes<String> icon;
    private final String title;

    public TransferQuickActionDto(@Json(name = "title") String str, @Json(name = "actions") List<String> list, @Json(name = "icon") Themes<String> themes) {
        this.title = str;
        this.actions = list;
        this.icon = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferQuickActionDto copy$default(TransferQuickActionDto transferQuickActionDto, String str, List list, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferQuickActionDto.title;
        }
        if ((i & 2) != 0) {
            list = transferQuickActionDto.actions;
        }
        if ((i & 4) != 0) {
            themes = transferQuickActionDto.icon;
        }
        return transferQuickActionDto.copy(str, list, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component2() {
        return this.actions;
    }

    public final Themes<String> component3() {
        return this.icon;
    }

    public final TransferQuickActionDto copy(@Json(name = "title") String title, @Json(name = "actions") List<String> actions, @Json(name = "icon") Themes<String> icon) {
        return new TransferQuickActionDto(title, actions, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferQuickActionDto)) {
            return false;
        }
        TransferQuickActionDto transferQuickActionDto = (TransferQuickActionDto) other;
        return jl40.l(this.title, transferQuickActionDto.title) && jl40.l(this.actions, transferQuickActionDto.actions) && jl40.l(this.icon, transferQuickActionDto.icon);
    }

    public final List<String> getActions() {
        return this.actions;
    }

    public final Themes<String> getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.icon.hashCode() + unr0.c(this.title.hashCode() * 31, 31, this.actions);
    }

    public String toString() {
        String str = this.title;
        List<String> list = this.actions;
        return smw0.l(xvz.r("TransferQuickActionDto(title=", str, ", actions=", list, ", icon="), this.icon, Extension.C_BRAKE);
    }
}
