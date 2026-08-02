package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/AccountDetailsDataDto;", "", "layoutId", "", "title", "action", "buttons", "", "Lcom/ybsdk/feature/savings/internal/network/dto/AccountDetailsElementDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLayoutId", "()Ljava/lang/String;", "getTitle", "getAction", "getButtons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountDetailsDataDto {
    private final String action;
    private final List<AccountDetailsElementDto> buttons;
    private final String layoutId;
    private final String title;

    public AccountDetailsDataDto(@Json(name = "layout_id") String str, @Json(name = "title") String str2, @Json(name = "action") String str3, @Json(name = "data") List<AccountDetailsElementDto> list) {
        this.layoutId = str;
        this.title = str2;
        this.action = str3;
        this.buttons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountDetailsDataDto copy$default(AccountDetailsDataDto accountDetailsDataDto, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountDetailsDataDto.layoutId;
        }
        if ((i & 2) != 0) {
            str2 = accountDetailsDataDto.title;
        }
        if ((i & 4) != 0) {
            str3 = accountDetailsDataDto.action;
        }
        if ((i & 8) != 0) {
            list = accountDetailsDataDto.buttons;
        }
        return accountDetailsDataDto.copy(str, str2, str3, list);
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

    public final List<AccountDetailsElementDto> component4() {
        return this.buttons;
    }

    public final AccountDetailsDataDto copy(@Json(name = "layout_id") String layoutId, @Json(name = "title") String title, @Json(name = "action") String action, @Json(name = "data") List<AccountDetailsElementDto> buttons) {
        return new AccountDetailsDataDto(layoutId, title, action, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountDetailsDataDto)) {
            return false;
        }
        AccountDetailsDataDto accountDetailsDataDto = (AccountDetailsDataDto) other;
        return jl40.l(this.layoutId, accountDetailsDataDto.layoutId) && jl40.l(this.title, accountDetailsDataDto.title) && jl40.l(this.action, accountDetailsDataDto.action) && jl40.l(this.buttons, accountDetailsDataDto.buttons);
    }

    public final String getAction() {
        return this.action;
    }

    public final List<AccountDetailsElementDto> getButtons() {
        return this.buttons;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttons.hashCode() + unr0.b(unr0.b(this.layoutId.hashCode() * 31, 31, this.title), 31, this.action);
    }

    public String toString() {
        String str = this.layoutId;
        String str2 = this.title;
        return tse0.j(this.action, ", buttons=", Extension.C_BRAKE, b64.v("AccountDetailsDataDto(layoutId=", str, ", title=", str2, ", action="), this.buttons);
    }
}
