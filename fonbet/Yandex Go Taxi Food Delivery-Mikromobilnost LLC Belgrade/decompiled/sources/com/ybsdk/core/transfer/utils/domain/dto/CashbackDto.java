package com.ybsdk.core.transfer.utils.domain.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;", "", "label", "", "amount", "title", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getLabel", "()Ljava/lang/String;", "getAmount", "getTitle", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CashbackDto {
    private final String amount;
    private final Themes<String> image;
    private final String label;
    private final String title;

    public CashbackDto(@Json(name = "label") String str, @Json(name = "amount") String str2, @Json(name = "title") String str3, @Json(name = "image") Themes<String> themes) {
        this.label = str;
        this.amount = str2;
        this.title = str3;
        this.image = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashbackDto copy$default(CashbackDto cashbackDto, String str, String str2, String str3, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashbackDto.label;
        }
        if ((i & 2) != 0) {
            str2 = cashbackDto.amount;
        }
        if ((i & 4) != 0) {
            str3 = cashbackDto.title;
        }
        if ((i & 8) != 0) {
            themes = cashbackDto.image;
        }
        return cashbackDto.copy(str, str2, str3, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> component4() {
        return this.image;
    }

    public final CashbackDto copy(@Json(name = "label") String label, @Json(name = "amount") String amount, @Json(name = "title") String title, @Json(name = "image") Themes<String> image) {
        return new CashbackDto(label, amount, title, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashbackDto)) {
            return false;
        }
        CashbackDto cashbackDto = (CashbackDto) other;
        return jl40.l(this.label, cashbackDto.label) && jl40.l(this.amount, cashbackDto.amount) && jl40.l(this.title, cashbackDto.title) && jl40.l(this.image, cashbackDto.image);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.image.hashCode() + unr0.b(unr0.b(this.label.hashCode() * 31, 31, this.amount), 31, this.title);
    }

    public String toString() {
        String str = this.label;
        String str2 = this.amount;
        String str3 = this.title;
        Themes<String> themes = this.image;
        StringBuilder v = b64.v("CashbackDto(label=", str, ", amount=", str2, ", title=");
        v.append(str3);
        v.append(", image=");
        v.append(themes);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
