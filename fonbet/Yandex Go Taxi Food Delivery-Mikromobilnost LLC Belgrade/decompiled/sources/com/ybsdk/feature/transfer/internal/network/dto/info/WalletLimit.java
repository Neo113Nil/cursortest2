package com.ybsdk.feature.transfer.internal.network.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/info/WalletLimit;", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getDescription", "()Ljava/lang/String;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletLimit {
    private final String description;
    private final Money money;

    public WalletLimit(@Json(name = "description") String str, @Json(name = "money") Money money) {
        this.description = str;
        this.money = money;
    }

    public static /* synthetic */ WalletLimit copy$default(WalletLimit walletLimit, String str, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletLimit.description;
        }
        if ((i & 2) != 0) {
            money = walletLimit.money;
        }
        return walletLimit.copy(str, money);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    public final WalletLimit copy(@Json(name = "description") String description, @Json(name = "money") Money money) {
        return new WalletLimit(description, money);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletLimit)) {
            return false;
        }
        WalletLimit walletLimit = (WalletLimit) other;
        return jl40.l(this.description, walletLimit.description) && jl40.l(this.money, walletLimit.money);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Money getMoney() {
        return this.money;
    }

    public int hashCode() {
        return this.money.hashCode() + (this.description.hashCode() * 31);
    }

    public String toString() {
        return "WalletLimit(description=" + this.description + ", money=" + this.money + Extension.C_BRAKE;
    }
}
