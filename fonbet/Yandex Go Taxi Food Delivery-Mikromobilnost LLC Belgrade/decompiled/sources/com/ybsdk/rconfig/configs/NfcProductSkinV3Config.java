package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.jl40;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J¯\u0001\u0010)\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u00060"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;", "", "raysGradient", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "", "title", "icon", "Lcom/ybsdk/rconfig/model/ThemedImage;", C0553n3.g, "titleColor", "selectionColor", "paymentGradientColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "balanceShimmerColor", "balanceSkeletonColor", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "getRaysGradient", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getTitle", "()Ljava/lang/String;", "getIcon", "()Lcom/ybsdk/rconfig/model/ThemedImage;", "getBackground", "getTitleColor", "getSelectionColor", "getPaymentGradientColor", "getBackgroundColor", "getBalanceShimmerColor", "getBalanceSkeletonColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcProductSkinV3Config {

    @Json(name = C0553n3.g)
    private final ThemedImage background;

    @Json(name = "background_color")
    private final ThemedParameter<String> backgroundColor;

    @Json(name = "balance_shimmer_color")
    private final ThemedParameter<String> balanceShimmerColor;

    @Json(name = "balance_skeleton_color")
    private final ThemedParameter<String> balanceSkeletonColor;

    @Json(name = "icon")
    private final ThemedImage icon;

    @Json(name = "payment_gradient_color")
    private final ThemedParameter<String> paymentGradientColor;

    @Json(name = "rays_gradient")
    private final ThemedParameter<List<String>> raysGradient;

    @Json(name = "selection_color")
    private final ThemedParameter<String> selectionColor;

    @Json(name = "title")
    private final String title;

    @Json(name = "title_color")
    private final ThemedParameter<String> titleColor;

    public /* synthetic */ NfcProductSkinV3Config(ThemedParameter themedParameter, String str, ThemedImage themedImage, ThemedImage themedImage2, ThemedParameter themedParameter2, ThemedParameter themedParameter3, ThemedParameter themedParameter4, ThemedParameter themedParameter5, ThemedParameter themedParameter6, ThemedParameter themedParameter7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(themedParameter, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : themedImage, (i & 8) != 0 ? null : themedImage2, (i & 16) != 0 ? null : themedParameter2, (i & 32) != 0 ? null : themedParameter3, themedParameter4, (i & 128) != 0 ? null : themedParameter5, (i & 256) != 0 ? null : themedParameter6, (i & 512) != 0 ? null : themedParameter7);
    }

    public static /* synthetic */ NfcProductSkinV3Config copy$default(NfcProductSkinV3Config nfcProductSkinV3Config, ThemedParameter themedParameter, String str, ThemedImage themedImage, ThemedImage themedImage2, ThemedParameter themedParameter2, ThemedParameter themedParameter3, ThemedParameter themedParameter4, ThemedParameter themedParameter5, ThemedParameter themedParameter6, ThemedParameter themedParameter7, int i, Object obj) {
        if ((i & 1) != 0) {
            themedParameter = nfcProductSkinV3Config.raysGradient;
        }
        if ((i & 2) != 0) {
            str = nfcProductSkinV3Config.title;
        }
        if ((i & 4) != 0) {
            themedImage = nfcProductSkinV3Config.icon;
        }
        if ((i & 8) != 0) {
            themedImage2 = nfcProductSkinV3Config.background;
        }
        if ((i & 16) != 0) {
            themedParameter2 = nfcProductSkinV3Config.titleColor;
        }
        if ((i & 32) != 0) {
            themedParameter3 = nfcProductSkinV3Config.selectionColor;
        }
        if ((i & 64) != 0) {
            themedParameter4 = nfcProductSkinV3Config.paymentGradientColor;
        }
        if ((i & 128) != 0) {
            themedParameter5 = nfcProductSkinV3Config.backgroundColor;
        }
        if ((i & 256) != 0) {
            themedParameter6 = nfcProductSkinV3Config.balanceShimmerColor;
        }
        if ((i & 512) != 0) {
            themedParameter7 = nfcProductSkinV3Config.balanceSkeletonColor;
        }
        ThemedParameter themedParameter8 = themedParameter6;
        ThemedParameter themedParameter9 = themedParameter7;
        ThemedParameter themedParameter10 = themedParameter4;
        ThemedParameter themedParameter11 = themedParameter5;
        ThemedParameter themedParameter12 = themedParameter2;
        ThemedParameter themedParameter13 = themedParameter3;
        return nfcProductSkinV3Config.copy(themedParameter, str, themedImage, themedImage2, themedParameter12, themedParameter13, themedParameter10, themedParameter11, themedParameter8, themedParameter9);
    }

    public final ThemedParameter<List<String>> component1() {
        return this.raysGradient;
    }

    public final ThemedParameter<String> component10() {
        return this.balanceSkeletonColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemedImage getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final ThemedImage getBackground() {
        return this.background;
    }

    public final ThemedParameter<String> component5() {
        return this.titleColor;
    }

    public final ThemedParameter<String> component6() {
        return this.selectionColor;
    }

    public final ThemedParameter<String> component7() {
        return this.paymentGradientColor;
    }

    public final ThemedParameter<String> component8() {
        return this.backgroundColor;
    }

    public final ThemedParameter<String> component9() {
        return this.balanceShimmerColor;
    }

    public final NfcProductSkinV3Config copy(ThemedParameter<List<String>> raysGradient, String title, ThemedImage icon, ThemedImage background, ThemedParameter<String> titleColor, ThemedParameter<String> selectionColor, ThemedParameter<String> paymentGradientColor, ThemedParameter<String> backgroundColor, ThemedParameter<String> balanceShimmerColor, ThemedParameter<String> balanceSkeletonColor) {
        return new NfcProductSkinV3Config(raysGradient, title, icon, background, titleColor, selectionColor, paymentGradientColor, backgroundColor, balanceShimmerColor, balanceSkeletonColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcProductSkinV3Config)) {
            return false;
        }
        NfcProductSkinV3Config nfcProductSkinV3Config = (NfcProductSkinV3Config) other;
        return jl40.l(this.raysGradient, nfcProductSkinV3Config.raysGradient) && jl40.l(this.title, nfcProductSkinV3Config.title) && jl40.l(this.icon, nfcProductSkinV3Config.icon) && jl40.l(this.background, nfcProductSkinV3Config.background) && jl40.l(this.titleColor, nfcProductSkinV3Config.titleColor) && jl40.l(this.selectionColor, nfcProductSkinV3Config.selectionColor) && jl40.l(this.paymentGradientColor, nfcProductSkinV3Config.paymentGradientColor) && jl40.l(this.backgroundColor, nfcProductSkinV3Config.backgroundColor) && jl40.l(this.balanceShimmerColor, nfcProductSkinV3Config.balanceShimmerColor) && jl40.l(this.balanceSkeletonColor, nfcProductSkinV3Config.balanceSkeletonColor);
    }

    public final ThemedImage getBackground() {
        return this.background;
    }

    public final ThemedParameter<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ThemedParameter<String> getBalanceShimmerColor() {
        return this.balanceShimmerColor;
    }

    public final ThemedParameter<String> getBalanceSkeletonColor() {
        return this.balanceSkeletonColor;
    }

    public final ThemedImage getIcon() {
        return this.icon;
    }

    public final ThemedParameter<String> getPaymentGradientColor() {
        return this.paymentGradientColor;
    }

    public final ThemedParameter<List<String>> getRaysGradient() {
        return this.raysGradient;
    }

    public final ThemedParameter<String> getSelectionColor() {
        return this.selectionColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ThemedParameter<String> getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        int hashCode = this.raysGradient.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ThemedImage themedImage = this.icon;
        int hashCode3 = (hashCode2 + (themedImage == null ? 0 : themedImage.hashCode())) * 31;
        ThemedImage themedImage2 = this.background;
        int hashCode4 = (hashCode3 + (themedImage2 == null ? 0 : themedImage2.hashCode())) * 31;
        ThemedParameter<String> themedParameter = this.titleColor;
        int hashCode5 = (hashCode4 + (themedParameter == null ? 0 : themedParameter.hashCode())) * 31;
        ThemedParameter<String> themedParameter2 = this.selectionColor;
        int hashCode6 = (hashCode5 + (themedParameter2 == null ? 0 : themedParameter2.hashCode())) * 31;
        ThemedParameter<String> themedParameter3 = this.paymentGradientColor;
        int hashCode7 = (hashCode6 + (themedParameter3 == null ? 0 : themedParameter3.hashCode())) * 31;
        ThemedParameter<String> themedParameter4 = this.backgroundColor;
        int hashCode8 = (hashCode7 + (themedParameter4 == null ? 0 : themedParameter4.hashCode())) * 31;
        ThemedParameter<String> themedParameter5 = this.balanceShimmerColor;
        int hashCode9 = (hashCode8 + (themedParameter5 == null ? 0 : themedParameter5.hashCode())) * 31;
        ThemedParameter<String> themedParameter6 = this.balanceSkeletonColor;
        return hashCode9 + (themedParameter6 != null ? themedParameter6.hashCode() : 0);
    }

    public String toString() {
        return "NfcProductSkinV3Config(raysGradient=" + this.raysGradient + ", title=" + this.title + ", icon=" + this.icon + ", background=" + this.background + ", titleColor=" + this.titleColor + ", selectionColor=" + this.selectionColor + ", paymentGradientColor=" + this.paymentGradientColor + ", backgroundColor=" + this.backgroundColor + ", balanceShimmerColor=" + this.balanceShimmerColor + ", balanceSkeletonColor=" + this.balanceSkeletonColor + Extension.C_BRAKE;
    }

    public NfcProductSkinV3Config(ThemedParameter<List<String>> themedParameter, String str, ThemedImage themedImage, ThemedImage themedImage2, ThemedParameter<String> themedParameter2, ThemedParameter<String> themedParameter3, ThemedParameter<String> themedParameter4, ThemedParameter<String> themedParameter5, ThemedParameter<String> themedParameter6, ThemedParameter<String> themedParameter7) {
        this.raysGradient = themedParameter;
        this.title = str;
        this.icon = themedImage;
        this.background = themedImage2;
        this.titleColor = themedParameter2;
        this.selectionColor = themedParameter3;
        this.paymentGradientColor = themedParameter4;
        this.backgroundColor = themedParameter5;
        this.balanceShimmerColor = themedParameter6;
        this.balanceSkeletonColor = themedParameter7;
    }
}
