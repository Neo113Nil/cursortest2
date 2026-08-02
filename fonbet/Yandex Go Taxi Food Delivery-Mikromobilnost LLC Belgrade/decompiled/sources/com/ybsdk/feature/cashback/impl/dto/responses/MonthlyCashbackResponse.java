package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.n;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/MonthlyCashbackResponse;", "", "title", "", "subtitle", "image", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "plus", "Lcom/ybsdk/feature/cashback/impl/dto/responses/PlusResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/cashback/impl/dto/responses/PlusResponse;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImage$annotations", "()V", "getImage", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getPlus", "()Lcom/ybsdk/feature/cashback/impl/dto/responses/PlusResponse;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MonthlyCashbackResponse {
    private final String image;
    private final Money money;
    private final PlusResponse plus;
    private final String subtitle;
    private final Themes<String> themedImage;
    private final String title;

    public MonthlyCashbackResponse(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "image") String str3, @Json(name = "themed_image") Themes<String> themes, @Json(name = "money") Money money, @Json(name = "plus") PlusResponse plusResponse) {
        this.title = str;
        this.subtitle = str2;
        this.image = str3;
        this.themedImage = themes;
        this.money = money;
        this.plus = plusResponse;
    }

    public static /* synthetic */ MonthlyCashbackResponse copy$default(MonthlyCashbackResponse monthlyCashbackResponse, String str, String str2, String str3, Themes themes, Money money, PlusResponse plusResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = monthlyCashbackResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = monthlyCashbackResponse.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = monthlyCashbackResponse.image;
        }
        if ((i & 8) != 0) {
            themes = monthlyCashbackResponse.themedImage;
        }
        if ((i & 16) != 0) {
            money = monthlyCashbackResponse.money;
        }
        if ((i & 32) != 0) {
            plusResponse = monthlyCashbackResponse.plus;
        }
        Money money2 = money;
        PlusResponse plusResponse2 = plusResponse;
        return monthlyCashbackResponse.copy(str, str2, str3, themes, money2, plusResponse2);
    }

    @jxi
    public static /* synthetic */ void getImage$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final Themes<String> component4() {
        return this.themedImage;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component6, reason: from getter */
    public final PlusResponse getPlus() {
        return this.plus;
    }

    public final MonthlyCashbackResponse copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "image") String image, @Json(name = "themed_image") Themes<String> themedImage, @Json(name = "money") Money money, @Json(name = "plus") PlusResponse plus) {
        return new MonthlyCashbackResponse(title, subtitle, image, themedImage, money, plus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthlyCashbackResponse)) {
            return false;
        }
        MonthlyCashbackResponse monthlyCashbackResponse = (MonthlyCashbackResponse) other;
        return jl40.l(this.title, monthlyCashbackResponse.title) && jl40.l(this.subtitle, monthlyCashbackResponse.subtitle) && jl40.l(this.image, monthlyCashbackResponse.image) && jl40.l(this.themedImage, monthlyCashbackResponse.themedImage) && jl40.l(this.money, monthlyCashbackResponse.money) && jl40.l(this.plus, monthlyCashbackResponse.plus);
    }

    public final String getImage() {
        return this.image;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final PlusResponse getPlus() {
        return this.plus;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image);
        Themes<String> themes = this.themedImage;
        int hashCode = (b + (themes == null ? 0 : themes.hashCode())) * 31;
        Money money = this.money;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        PlusResponse plusResponse = this.plus;
        return hashCode2 + (plusResponse != null ? plusResponse.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.image;
        Themes<String> themes = this.themedImage;
        Money money = this.money;
        PlusResponse plusResponse = this.plus;
        StringBuilder v = b64.v("MonthlyCashbackResponse(title=", str, ", subtitle=", str2, ", image=");
        n.B(v, str3, ", themedImage=", themes, ", money=");
        v.append(money);
        v.append(", plus=");
        v.append(plusResponse);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
