package com.ybsdk.feature.savings.internal.network.dto.v4;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.savings.internal.network.dto.DivSavingsAccountResponse;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsShelfDtoV4;", "", "id", "", "icon", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "title", "subtitle", "subtitleDivWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divWidget", "items", "", "Lcom/ybsdk/feature/savings/internal/network/dto/DivSavingsAccountResponse;", "dragAndDropEnabled", "", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Z)V", "getId", "()Ljava/lang/String;", "getIcon", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getTitle", "getSubtitle", "getSubtitleDivWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getDivWidget", "getItems", "()Ljava/util/List;", "getDragAndDropEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsShelfDtoV4 {

    @Json(name = "divkit_widget")
    private final DivDataDto divWidget;

    @Json(name = "drag_and_drop_enabled")
    private final boolean dragAndDropEnabled;

    @Json(name = "icon")
    private final ThemedParameter<String> icon;

    @Json(name = "id")
    private final String id;

    @Json(name = "items")
    private final List<DivSavingsAccountResponse> items;

    @Json(name = "subtitle")
    private final String subtitle;

    @Json(name = "subtitle_divkit_widget")
    private final DivDataDto subtitleDivWidget;

    @Json(name = "title")
    private final String title;

    public SavingsShelfDtoV4(String str, ThemedParameter<String> themedParameter, String str2, String str3, DivDataDto divDataDto, DivDataDto divDataDto2, List<DivSavingsAccountResponse> list, boolean z) {
        this.id = str;
        this.icon = themedParameter;
        this.title = str2;
        this.subtitle = str3;
        this.subtitleDivWidget = divDataDto;
        this.divWidget = divDataDto2;
        this.items = list;
        this.dragAndDropEnabled = z;
    }

    public static /* synthetic */ SavingsShelfDtoV4 copy$default(SavingsShelfDtoV4 savingsShelfDtoV4, String str, ThemedParameter themedParameter, String str2, String str3, DivDataDto divDataDto, DivDataDto divDataDto2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsShelfDtoV4.id;
        }
        if ((i & 2) != 0) {
            themedParameter = savingsShelfDtoV4.icon;
        }
        if ((i & 4) != 0) {
            str2 = savingsShelfDtoV4.title;
        }
        if ((i & 8) != 0) {
            str3 = savingsShelfDtoV4.subtitle;
        }
        if ((i & 16) != 0) {
            divDataDto = savingsShelfDtoV4.subtitleDivWidget;
        }
        if ((i & 32) != 0) {
            divDataDto2 = savingsShelfDtoV4.divWidget;
        }
        if ((i & 64) != 0) {
            list = savingsShelfDtoV4.items;
        }
        if ((i & 128) != 0) {
            z = savingsShelfDtoV4.dragAndDropEnabled;
        }
        List list2 = list;
        boolean z2 = z;
        DivDataDto divDataDto3 = divDataDto;
        DivDataDto divDataDto4 = divDataDto2;
        return savingsShelfDtoV4.copy(str, themedParameter, str2, str3, divDataDto3, divDataDto4, list2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final ThemedParameter<String> component2() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final DivDataDto getSubtitleDivWidget() {
        return this.subtitleDivWidget;
    }

    /* renamed from: component6, reason: from getter */
    public final DivDataDto getDivWidget() {
        return this.divWidget;
    }

    public final List<DivSavingsAccountResponse> component7() {
        return this.items;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDragAndDropEnabled() {
        return this.dragAndDropEnabled;
    }

    public final SavingsShelfDtoV4 copy(String id, ThemedParameter<String> icon, String title, String subtitle, DivDataDto subtitleDivWidget, DivDataDto divWidget, List<DivSavingsAccountResponse> items, boolean dragAndDropEnabled) {
        return new SavingsShelfDtoV4(id, icon, title, subtitle, subtitleDivWidget, divWidget, items, dragAndDropEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsShelfDtoV4)) {
            return false;
        }
        SavingsShelfDtoV4 savingsShelfDtoV4 = (SavingsShelfDtoV4) other;
        return jl40.l(this.id, savingsShelfDtoV4.id) && jl40.l(this.icon, savingsShelfDtoV4.icon) && jl40.l(this.title, savingsShelfDtoV4.title) && jl40.l(this.subtitle, savingsShelfDtoV4.subtitle) && jl40.l(this.subtitleDivWidget, savingsShelfDtoV4.subtitleDivWidget) && jl40.l(this.divWidget, savingsShelfDtoV4.divWidget) && jl40.l(this.items, savingsShelfDtoV4.items) && this.dragAndDropEnabled == savingsShelfDtoV4.dragAndDropEnabled;
    }

    public final DivDataDto getDivWidget() {
        return this.divWidget;
    }

    public final boolean getDragAndDropEnabled() {
        return this.dragAndDropEnabled;
    }

    public final ThemedParameter<String> getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DivSavingsAccountResponse> getItems() {
        return this.items;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final DivDataDto getSubtitleDivWidget() {
        return this.subtitleDivWidget;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(tse0.d(this.icon, this.id.hashCode() * 31, 31), 31, this.title), 31, this.subtitle);
        DivDataDto divDataDto = this.subtitleDivWidget;
        int hashCode = (b + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        DivDataDto divDataDto2 = this.divWidget;
        return Boolean.hashCode(this.dragAndDropEnabled) + unr0.c((hashCode + (divDataDto2 != null ? divDataDto2.hashCode() : 0)) * 31, 31, this.items);
    }

    public String toString() {
        String str = this.id;
        ThemedParameter<String> themedParameter = this.icon;
        String str2 = this.title;
        String str3 = this.subtitle;
        DivDataDto divDataDto = this.subtitleDivWidget;
        DivDataDto divDataDto2 = this.divWidget;
        List<DivSavingsAccountResponse> list = this.items;
        boolean z = this.dragAndDropEnabled;
        StringBuilder sb = new StringBuilder("SavingsShelfDtoV4(id=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(themedParameter);
        sb.append(", title=");
        g8e.D(sb, str2, ", subtitle=", str3, ", subtitleDivWidget=");
        sb.append(divDataDto);
        sb.append(", divWidget=");
        sb.append(divDataDto2);
        sb.append(", items=");
        sb.append(list);
        sb.append(", dragAndDropEnabled=");
        sb.append(z);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
