package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$$serializer;
import defpackage.cad0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xpd0;
import defpackage.yjd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0003KLJBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010*Jj\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b6\u00101J\u0010\u00107\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b7\u0010!J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bA\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010-R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u00101R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bH\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bI\u0010*¨\u0006M"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "backgroundImage", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "titleText", "subtitleText", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "offer", "", "Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;", "assets", "", "acceptButtonText", "rejectButtonText", "footerText", "<init>", "(Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component2", "()Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "component3", "component4", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/String;", "component7", "component8", "copy", "(Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getBackgroundImage", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "getTitleText", "getSubtitleText", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "getOffer", "Ljava/util/List;", "getAssets", "Ljava/lang/String;", "getAcceptButtonText", "getRejectButtonText", "getFooterText", "Companion", "ClosingOfferAsset", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayClosingOffer implements Parcelable {
    private final String acceptButtonText;
    private final List<ClosingOfferAsset> assets;
    private final PlusThemedImage backgroundImage;
    private final PlusPayRichText footerText;
    private final PlusPayCompositeOffers.Offer offer;
    private final String rejectButtonText;
    private final PlusPayRichText subtitleText;
    private final PlusPayRichText titleText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PlusPayClosingOffer> CREATOR = new Creator();
    private static final i3y[] $childSerializers = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new cad0(3)), null, null, null};

    public /* synthetic */ PlusPayClosingOffer(int i, PlusThemedImage plusThemedImage, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, PlusPayCompositeOffers.Offer offer, List list, String str, String str2, PlusPayRichText plusPayRichText3, psq0 psq0Var) {
        if (255 != (i & 255)) {
            qje.Z(i, 255, PlusPayClosingOffer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.backgroundImage = plusThemedImage;
        this.titleText = plusPayRichText;
        this.subtitleText = plusPayRichText2;
        this.offer = offer;
        this.assets = list;
        this.acceptButtonText = str;
        this.rejectButtonText = str2;
        this.footerText = plusPayRichText3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new p53(PlusPayClosingOffer$ClosingOfferAsset$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ PlusPayClosingOffer copy$default(PlusPayClosingOffer plusPayClosingOffer, PlusThemedImage plusThemedImage, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, PlusPayCompositeOffers.Offer offer, List list, String str, String str2, PlusPayRichText plusPayRichText3, int i, Object obj) {
        if ((i & 1) != 0) {
            plusThemedImage = plusPayClosingOffer.backgroundImage;
        }
        if ((i & 2) != 0) {
            plusPayRichText = plusPayClosingOffer.titleText;
        }
        if ((i & 4) != 0) {
            plusPayRichText2 = plusPayClosingOffer.subtitleText;
        }
        if ((i & 8) != 0) {
            offer = plusPayClosingOffer.offer;
        }
        if ((i & 16) != 0) {
            list = plusPayClosingOffer.assets;
        }
        if ((i & 32) != 0) {
            str = plusPayClosingOffer.acceptButtonText;
        }
        if ((i & 64) != 0) {
            str2 = plusPayClosingOffer.rejectButtonText;
        }
        if ((i & 128) != 0) {
            plusPayRichText3 = plusPayClosingOffer.footerText;
        }
        String str3 = str2;
        PlusPayRichText plusPayRichText4 = plusPayRichText3;
        List list2 = list;
        String str4 = str;
        return plusPayClosingOffer.copy(plusThemedImage, plusPayRichText, plusPayRichText2, offer, list2, str4, str3, plusPayRichText4);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayClosingOffer self, yjd output, SerialDescriptor serialDesc) {
        i3y[] i3yVarArr = $childSerializers;
        output.e(serialDesc, 0, xpd0.a, self.backgroundImage);
        PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
        output.e(serialDesc, 1, plusPayRichText$$serializer, self.titleText);
        output.g(serialDesc, 2, plusPayRichText$$serializer, self.subtitleText);
        output.e(serialDesc, 3, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, self.offer);
        output.e(serialDesc, 4, (KSerializer) i3yVarArr[4].getValue(), self.assets);
        output.o(serialDesc, 5, self.acceptButtonText);
        output.o(serialDesc, 6, self.rejectButtonText);
        output.g(serialDesc, 7, plusPayRichText$$serializer, self.footerText);
    }

    /* renamed from: component1, reason: from getter */
    public final PlusThemedImage getBackgroundImage() {
        return this.backgroundImage;
    }

    /* renamed from: component2, reason: from getter */
    public final PlusPayRichText getTitleText() {
        return this.titleText;
    }

    /* renamed from: component3, reason: from getter */
    public final PlusPayRichText getSubtitleText() {
        return this.subtitleText;
    }

    /* renamed from: component4, reason: from getter */
    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    public final List<ClosingOfferAsset> component5() {
        return this.assets;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRejectButtonText() {
        return this.rejectButtonText;
    }

    /* renamed from: component8, reason: from getter */
    public final PlusPayRichText getFooterText() {
        return this.footerText;
    }

    public final PlusPayClosingOffer copy(PlusThemedImage backgroundImage, PlusPayRichText titleText, PlusPayRichText subtitleText, PlusPayCompositeOffers.Offer offer, List<ClosingOfferAsset> assets, String acceptButtonText, String rejectButtonText, PlusPayRichText footerText) {
        return new PlusPayClosingOffer(backgroundImage, titleText, subtitleText, offer, assets, acceptButtonText, rejectButtonText, footerText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayClosingOffer)) {
            return false;
        }
        PlusPayClosingOffer plusPayClosingOffer = (PlusPayClosingOffer) other;
        return jl40.l(this.backgroundImage, plusPayClosingOffer.backgroundImage) && jl40.l(this.titleText, plusPayClosingOffer.titleText) && jl40.l(this.subtitleText, plusPayClosingOffer.subtitleText) && jl40.l(this.offer, plusPayClosingOffer.offer) && jl40.l(this.assets, plusPayClosingOffer.assets) && jl40.l(this.acceptButtonText, plusPayClosingOffer.acceptButtonText) && jl40.l(this.rejectButtonText, plusPayClosingOffer.rejectButtonText) && jl40.l(this.footerText, plusPayClosingOffer.footerText);
    }

    public final String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    public final List<ClosingOfferAsset> getAssets() {
        return this.assets;
    }

    public final PlusThemedImage getBackgroundImage() {
        return this.backgroundImage;
    }

    public final PlusPayRichText getFooterText() {
        return this.footerText;
    }

    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    public final String getRejectButtonText() {
        return this.rejectButtonText;
    }

    public final PlusPayRichText getSubtitleText() {
        return this.subtitleText;
    }

    public final PlusPayRichText getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        int hashCode = (this.titleText.hashCode() + (this.backgroundImage.hashCode() * 31)) * 31;
        PlusPayRichText plusPayRichText = this.subtitleText;
        int b = unr0.b(unr0.b(unr0.c((this.offer.hashCode() + ((hashCode + (plusPayRichText == null ? 0 : plusPayRichText.hashCode())) * 31)) * 31, 31, this.assets), 31, this.acceptButtonText), 31, this.rejectButtonText);
        PlusPayRichText plusPayRichText2 = this.footerText;
        return b + (plusPayRichText2 != null ? plusPayRichText2.hashCode() : 0);
    }

    public String toString() {
        return "PlusPayClosingOffer(backgroundImage=" + this.backgroundImage + ", titleText=" + this.titleText + ", subtitleText=" + this.subtitleText + ", offer=" + this.offer + ", assets=" + this.assets + ", acceptButtonText=" + this.acceptButtonText + ", rejectButtonText=" + this.rejectButtonText + ", footerText=" + this.footerText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.backgroundImage, flags);
        this.titleText.writeToParcel(dest, flags);
        PlusPayRichText plusPayRichText = this.subtitleText;
        if (plusPayRichText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayRichText.writeToParcel(dest, flags);
        }
        this.offer.writeToParcel(dest, flags);
        Iterator t = vfc.t(dest, this.assets);
        while (t.hasNext()) {
            ((ClosingOfferAsset) t.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.acceptButtonText);
        dest.writeString(this.rejectButtonText);
        PlusPayRichText plusPayRichText2 = this.footerText;
        if (plusPayRichText2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayRichText2.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J:\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010 ¨\u00068"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "titleText", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "icon", "buttonText", "buttonAdditionalText", "<init>", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "component2", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component3", "component4", "copy", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "getTitleText", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getIcon", "getButtonText", "getButtonAdditionalText", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ClosingOfferAsset implements Parcelable {
        private final PlusPayRichText buttonAdditionalText;
        private final PlusPayRichText buttonText;
        private final PlusThemedImage icon;
        private final PlusPayRichText titleText;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<ClosingOfferAsset> CREATOR = new Creator();

        public /* synthetic */ ClosingOfferAsset(int i, PlusPayRichText plusPayRichText, PlusThemedImage plusThemedImage, PlusPayRichText plusPayRichText2, PlusPayRichText plusPayRichText3, psq0 psq0Var) {
            if (15 != (i & 15)) {
                qje.Z(i, 15, PlusPayClosingOffer$ClosingOfferAsset$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.titleText = plusPayRichText;
            this.icon = plusThemedImage;
            this.buttonText = plusPayRichText2;
            this.buttonAdditionalText = plusPayRichText3;
        }

        public static /* synthetic */ ClosingOfferAsset copy$default(ClosingOfferAsset closingOfferAsset, PlusPayRichText plusPayRichText, PlusThemedImage plusThemedImage, PlusPayRichText plusPayRichText2, PlusPayRichText plusPayRichText3, int i, Object obj) {
            if ((i & 1) != 0) {
                plusPayRichText = closingOfferAsset.titleText;
            }
            if ((i & 2) != 0) {
                plusThemedImage = closingOfferAsset.icon;
            }
            if ((i & 4) != 0) {
                plusPayRichText2 = closingOfferAsset.buttonText;
            }
            if ((i & 8) != 0) {
                plusPayRichText3 = closingOfferAsset.buttonAdditionalText;
            }
            return closingOfferAsset.copy(plusPayRichText, plusThemedImage, plusPayRichText2, plusPayRichText3);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(ClosingOfferAsset self, yjd output, SerialDescriptor serialDesc) {
            PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
            output.e(serialDesc, 0, plusPayRichText$$serializer, self.titleText);
            output.e(serialDesc, 1, xpd0.a, self.icon);
            output.e(serialDesc, 2, plusPayRichText$$serializer, self.buttonText);
            output.g(serialDesc, 3, plusPayRichText$$serializer, self.buttonAdditionalText);
        }

        /* renamed from: component1, reason: from getter */
        public final PlusPayRichText getTitleText() {
            return this.titleText;
        }

        /* renamed from: component2, reason: from getter */
        public final PlusThemedImage getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final PlusPayRichText getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component4, reason: from getter */
        public final PlusPayRichText getButtonAdditionalText() {
            return this.buttonAdditionalText;
        }

        public final ClosingOfferAsset copy(PlusPayRichText titleText, PlusThemedImage icon, PlusPayRichText buttonText, PlusPayRichText buttonAdditionalText) {
            return new ClosingOfferAsset(titleText, icon, buttonText, buttonAdditionalText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClosingOfferAsset)) {
                return false;
            }
            ClosingOfferAsset closingOfferAsset = (ClosingOfferAsset) other;
            return jl40.l(this.titleText, closingOfferAsset.titleText) && jl40.l(this.icon, closingOfferAsset.icon) && jl40.l(this.buttonText, closingOfferAsset.buttonText) && jl40.l(this.buttonAdditionalText, closingOfferAsset.buttonAdditionalText);
        }

        public final PlusPayRichText getButtonAdditionalText() {
            return this.buttonAdditionalText;
        }

        public final PlusPayRichText getButtonText() {
            return this.buttonText;
        }

        public final PlusThemedImage getIcon() {
            return this.icon;
        }

        public final PlusPayRichText getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            int hashCode = (this.buttonText.hashCode() + ((this.icon.hashCode() + (this.titleText.hashCode() * 31)) * 31)) * 31;
            PlusPayRichText plusPayRichText = this.buttonAdditionalText;
            return hashCode + (plusPayRichText == null ? 0 : plusPayRichText.hashCode());
        }

        public String toString() {
            return "ClosingOfferAsset(titleText=" + this.titleText + ", icon=" + this.icon + ", buttonText=" + this.buttonText + ", buttonAdditionalText=" + this.buttonAdditionalText + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.titleText.writeToParcel(dest, flags);
            dest.writeParcelable(this.icon, flags);
            this.buttonText.writeToParcel(dest, flags);
            PlusPayRichText plusPayRichText = this.buttonAdditionalText;
            if (plusPayRichText == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                plusPayRichText.writeToParcel(dest, flags);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$ClosingOfferAsset;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayClosingOffer$ClosingOfferAsset$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClosingOfferAsset> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClosingOfferAsset createFromParcel(Parcel parcel) {
                Parcelable.Creator<PlusPayRichText> creator = PlusPayRichText.CREATOR;
                return new ClosingOfferAsset(creator.createFromParcel(parcel), (PlusThemedImage) parcel.readParcelable(ClosingOfferAsset.class.getClassLoader()), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClosingOfferAsset[] newArray(int i) {
                return new ClosingOfferAsset[i];
            }
        }

        public ClosingOfferAsset(PlusPayRichText plusPayRichText, PlusThemedImage plusThemedImage, PlusPayRichText plusPayRichText2, PlusPayRichText plusPayRichText3) {
            this.titleText = plusPayRichText;
            this.icon = plusThemedImage;
            this.buttonText = plusPayRichText2;
            this.buttonAdditionalText = plusPayRichText3;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayClosingOffer;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return PlusPayClosingOffer$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayClosingOffer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayClosingOffer createFromParcel(Parcel parcel) {
            PlusThemedImage plusThemedImage = (PlusThemedImage) parcel.readParcelable(PlusPayClosingOffer.class.getClassLoader());
            Parcelable.Creator<PlusPayRichText> creator = PlusPayRichText.CREATOR;
            PlusPayRichText createFromParcel = creator.createFromParcel(parcel);
            PlusPayRichText createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            PlusPayCompositeOffers.Offer createFromParcel3 = PlusPayCompositeOffers.Offer.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(ClosingOfferAsset.CREATOR, parcel, arrayList, i, 1);
            }
            return new PlusPayClosingOffer(plusThemedImage, createFromParcel, createFromParcel2, createFromParcel3, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? PlusPayRichText.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayClosingOffer[] newArray(int i) {
            return new PlusPayClosingOffer[i];
        }
    }

    public PlusPayClosingOffer(PlusThemedImage plusThemedImage, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, PlusPayCompositeOffers.Offer offer, List<ClosingOfferAsset> list, String str, String str2, PlusPayRichText plusPayRichText3) {
        this.backgroundImage = plusThemedImage;
        this.titleText = plusPayRichText;
        this.subtitleText = plusPayRichText2;
        this.offer = offer;
        this.assets = list;
        this.acceptButtonText = str;
        this.rejectButtonText = str2;
        this.footerText = plusPayRichText3;
    }
}
