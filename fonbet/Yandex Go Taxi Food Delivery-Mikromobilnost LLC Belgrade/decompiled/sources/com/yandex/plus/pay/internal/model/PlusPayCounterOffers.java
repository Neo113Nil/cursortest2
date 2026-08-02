package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer$$serializer;
import defpackage.auu0;
import defpackage.bbd0;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0003;<:B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"JP\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b8\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b9\u0010\"¨\u0006="}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "title", "subtitle", "", "Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers$CounterOffer;", "offers", "alternativeActionText", "supportText", "<init>", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "getTitle", "getSubtitle", "Ljava/util/List;", "getOffers", "getAlternativeActionText", "getSupportText", "Companion", "CounterOffer", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayCounterOffers implements Parcelable {
    private final PlusPayRichText alternativeActionText;
    private final List<CounterOffer> offers;
    private final PlusPayRichText subtitle;
    private final PlusPayRichText supportText;
    private final PlusPayRichText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PlusPayCounterOffers> CREATOR = new Creator();
    private static final i3y[] $childSerializers = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new cad0(29)), null, null};

    public /* synthetic */ PlusPayCounterOffers(int i, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, List list, PlusPayRichText plusPayRichText3, PlusPayRichText plusPayRichText4, psq0 psq0Var) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, PlusPayCounterOffers$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = plusPayRichText;
        this.subtitle = plusPayRichText2;
        this.offers = list;
        this.alternativeActionText = plusPayRichText3;
        this.supportText = plusPayRichText4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new p53(PlusPayCounterOffers$CounterOffer$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ PlusPayCounterOffers copy$default(PlusPayCounterOffers plusPayCounterOffers, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, List list, PlusPayRichText plusPayRichText3, PlusPayRichText plusPayRichText4, int i, Object obj) {
        if ((i & 1) != 0) {
            plusPayRichText = plusPayCounterOffers.title;
        }
        if ((i & 2) != 0) {
            plusPayRichText2 = plusPayCounterOffers.subtitle;
        }
        if ((i & 4) != 0) {
            list = plusPayCounterOffers.offers;
        }
        if ((i & 8) != 0) {
            plusPayRichText3 = plusPayCounterOffers.alternativeActionText;
        }
        if ((i & 16) != 0) {
            plusPayRichText4 = plusPayCounterOffers.supportText;
        }
        PlusPayRichText plusPayRichText5 = plusPayRichText4;
        List list2 = list;
        return plusPayCounterOffers.copy(plusPayRichText, plusPayRichText2, list2, plusPayRichText3, plusPayRichText5);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayCounterOffers self, yjd output, SerialDescriptor serialDesc) {
        i3y[] i3yVarArr = $childSerializers;
        PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
        output.g(serialDesc, 0, plusPayRichText$$serializer, self.title);
        output.g(serialDesc, 1, plusPayRichText$$serializer, self.subtitle);
        output.e(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.offers);
        output.g(serialDesc, 3, plusPayRichText$$serializer, self.alternativeActionText);
        output.g(serialDesc, 4, plusPayRichText$$serializer, self.supportText);
    }

    /* renamed from: component1, reason: from getter */
    public final PlusPayRichText getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final PlusPayRichText getSubtitle() {
        return this.subtitle;
    }

    public final List<CounterOffer> component3() {
        return this.offers;
    }

    /* renamed from: component4, reason: from getter */
    public final PlusPayRichText getAlternativeActionText() {
        return this.alternativeActionText;
    }

    /* renamed from: component5, reason: from getter */
    public final PlusPayRichText getSupportText() {
        return this.supportText;
    }

    public final PlusPayCounterOffers copy(PlusPayRichText title, PlusPayRichText subtitle, List<CounterOffer> offers, PlusPayRichText alternativeActionText, PlusPayRichText supportText) {
        return new PlusPayCounterOffers(title, subtitle, offers, alternativeActionText, supportText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayCounterOffers)) {
            return false;
        }
        PlusPayCounterOffers plusPayCounterOffers = (PlusPayCounterOffers) other;
        return jl40.l(this.title, plusPayCounterOffers.title) && jl40.l(this.subtitle, plusPayCounterOffers.subtitle) && jl40.l(this.offers, plusPayCounterOffers.offers) && jl40.l(this.alternativeActionText, plusPayCounterOffers.alternativeActionText) && jl40.l(this.supportText, plusPayCounterOffers.supportText);
    }

    public final PlusPayRichText getAlternativeActionText() {
        return this.alternativeActionText;
    }

    public final List<CounterOffer> getOffers() {
        return this.offers;
    }

    public final PlusPayRichText getSubtitle() {
        return this.subtitle;
    }

    public final PlusPayRichText getSupportText() {
        return this.supportText;
    }

    public final PlusPayRichText getTitle() {
        return this.title;
    }

    public int hashCode() {
        PlusPayRichText plusPayRichText = this.title;
        int hashCode = (plusPayRichText == null ? 0 : plusPayRichText.hashCode()) * 31;
        PlusPayRichText plusPayRichText2 = this.subtitle;
        int c = unr0.c((hashCode + (plusPayRichText2 == null ? 0 : plusPayRichText2.hashCode())) * 31, 31, this.offers);
        PlusPayRichText plusPayRichText3 = this.alternativeActionText;
        int hashCode2 = (c + (plusPayRichText3 == null ? 0 : plusPayRichText3.hashCode())) * 31;
        PlusPayRichText plusPayRichText4 = this.supportText;
        return hashCode2 + (plusPayRichText4 != null ? plusPayRichText4.hashCode() : 0);
    }

    public String toString() {
        return "PlusPayCounterOffers(title=" + this.title + ", subtitle=" + this.subtitle + ", offers=" + this.offers + ", alternativeActionText=" + this.alternativeActionText + ", supportText=" + this.supportText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        PlusPayRichText plusPayRichText = this.title;
        if (plusPayRichText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayRichText.writeToParcel(dest, flags);
        }
        PlusPayRichText plusPayRichText2 = this.subtitle;
        if (plusPayRichText2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayRichText2.writeToParcel(dest, flags);
        }
        Iterator t = vfc.t(dest, this.offers);
        while (t.hasNext()) {
            ((CounterOffer) t.next()).writeToParcel(dest, flags);
        }
        PlusPayRichText plusPayRichText3 = this.alternativeActionText;
        if (plusPayRichText3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayRichText3.writeToParcel(dest, flags);
        }
        PlusPayRichText plusPayRichText4 = this.supportText;
        if (plusPayRichText4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayRichText4.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.JT\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b1\u0010+J\u0010\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b2\u0010\u001eJ\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010'R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b@\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010.¨\u0006E"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers$CounterOffer;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "offer", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "title", "", "benefits", "", "buttonText", "additionalButtonText", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "icon", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers$CounterOffer;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "component2", "()Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;)Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers$CounterOffer;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "getOffer", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "getTitle", "Ljava/util/List;", "getBenefits", "Ljava/lang/String;", "getButtonText", "getAdditionalButtonText", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getIcon", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CounterOffer implements Parcelable {
        private final String additionalButtonText;
        private final List<PlusPayRichText> benefits;
        private final String buttonText;
        private final PlusThemedImage icon;
        private final PlusPayCompositeOffers.Offer offer;
        private final PlusPayRichText title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<CounterOffer> CREATOR = new Creator();
        private static final i3y[] $childSerializers = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new bbd0(0)), null, null, null};

        public /* synthetic */ CounterOffer(int i, PlusPayCompositeOffers.Offer offer, PlusPayRichText plusPayRichText, List list, String str, String str2, PlusThemedImage plusThemedImage, psq0 psq0Var) {
            if (63 != (i & 63)) {
                qje.Z(i, 63, PlusPayCounterOffers$CounterOffer$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.offer = offer;
            this.title = plusPayRichText;
            this.benefits = list;
            this.buttonText = str;
            this.additionalButtonText = str2;
            this.icon = plusThemedImage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new p53(PlusPayRichText$$serializer.INSTANCE, 0);
        }

        public static /* synthetic */ CounterOffer copy$default(CounterOffer counterOffer, PlusPayCompositeOffers.Offer offer, PlusPayRichText plusPayRichText, List list, String str, String str2, PlusThemedImage plusThemedImage, int i, Object obj) {
            if ((i & 1) != 0) {
                offer = counterOffer.offer;
            }
            if ((i & 2) != 0) {
                plusPayRichText = counterOffer.title;
            }
            if ((i & 4) != 0) {
                list = counterOffer.benefits;
            }
            if ((i & 8) != 0) {
                str = counterOffer.buttonText;
            }
            if ((i & 16) != 0) {
                str2 = counterOffer.additionalButtonText;
            }
            if ((i & 32) != 0) {
                plusThemedImage = counterOffer.icon;
            }
            String str3 = str2;
            PlusThemedImage plusThemedImage2 = plusThemedImage;
            return counterOffer.copy(offer, plusPayRichText, list, str, str3, plusThemedImage2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(CounterOffer self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.e(serialDesc, 0, PlusPayCompositeOffers$Offer$$serializer.INSTANCE, self.offer);
            output.e(serialDesc, 1, PlusPayRichText$$serializer.INSTANCE, self.title);
            output.e(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.benefits);
            output.o(serialDesc, 3, self.buttonText);
            output.g(serialDesc, 4, auu0.a, self.additionalButtonText);
            output.e(serialDesc, 5, xpd0.a, self.icon);
        }

        /* renamed from: component1, reason: from getter */
        public final PlusPayCompositeOffers.Offer getOffer() {
            return this.offer;
        }

        /* renamed from: component2, reason: from getter */
        public final PlusPayRichText getTitle() {
            return this.title;
        }

        public final List<PlusPayRichText> component3() {
            return this.benefits;
        }

        /* renamed from: component4, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAdditionalButtonText() {
            return this.additionalButtonText;
        }

        /* renamed from: component6, reason: from getter */
        public final PlusThemedImage getIcon() {
            return this.icon;
        }

        public final CounterOffer copy(PlusPayCompositeOffers.Offer offer, PlusPayRichText title, List<PlusPayRichText> benefits, String buttonText, String additionalButtonText, PlusThemedImage icon) {
            return new CounterOffer(offer, title, benefits, buttonText, additionalButtonText, icon);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CounterOffer)) {
                return false;
            }
            CounterOffer counterOffer = (CounterOffer) other;
            return jl40.l(this.offer, counterOffer.offer) && jl40.l(this.title, counterOffer.title) && jl40.l(this.benefits, counterOffer.benefits) && jl40.l(this.buttonText, counterOffer.buttonText) && jl40.l(this.additionalButtonText, counterOffer.additionalButtonText) && jl40.l(this.icon, counterOffer.icon);
        }

        public final String getAdditionalButtonText() {
            return this.additionalButtonText;
        }

        public final List<PlusPayRichText> getBenefits() {
            return this.benefits;
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final PlusThemedImage getIcon() {
            return this.icon;
        }

        public final PlusPayCompositeOffers.Offer getOffer() {
            return this.offer;
        }

        public final PlusPayRichText getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b = unr0.b(unr0.c((this.title.hashCode() + (this.offer.hashCode() * 31)) * 31, 31, this.benefits), 31, this.buttonText);
            String str = this.additionalButtonText;
            return this.icon.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            return "CounterOffer(offer=" + this.offer + ", title=" + this.title + ", benefits=" + this.benefits + ", buttonText=" + this.buttonText + ", additionalButtonText=" + this.additionalButtonText + ", icon=" + this.icon + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.offer.writeToParcel(dest, flags);
            this.title.writeToParcel(dest, flags);
            Iterator t = vfc.t(dest, this.benefits);
            while (t.hasNext()) {
                ((PlusPayRichText) t.next()).writeToParcel(dest, flags);
            }
            dest.writeString(this.buttonText);
            dest.writeString(this.additionalButtonText);
            dest.writeParcelable(this.icon, flags);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers$CounterOffer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers$CounterOffer;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayCounterOffers$CounterOffer$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CounterOffer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CounterOffer createFromParcel(Parcel parcel) {
                PlusPayCompositeOffers.Offer createFromParcel = PlusPayCompositeOffers.Offer.CREATOR.createFromParcel(parcel);
                PlusPayRichText createFromParcel2 = PlusPayRichText.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(PlusPayRichText.CREATOR, parcel, arrayList, i, 1);
                }
                return new CounterOffer(createFromParcel, createFromParcel2, arrayList, parcel.readString(), parcel.readString(), (PlusThemedImage) parcel.readParcelable(CounterOffer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CounterOffer[] newArray(int i) {
                return new CounterOffer[i];
            }
        }

        public CounterOffer(PlusPayCompositeOffers.Offer offer, PlusPayRichText plusPayRichText, List<PlusPayRichText> list, String str, String str2, PlusThemedImage plusThemedImage) {
            this.offer = offer;
            this.title = plusPayRichText;
            this.benefits = list;
            this.buttonText = str;
            this.additionalButtonText = str2;
            this.icon = plusThemedImage;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCounterOffers;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return PlusPayCounterOffers$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayCounterOffers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayCounterOffers createFromParcel(Parcel parcel) {
            PlusPayRichText createFromParcel = parcel.readInt() == 0 ? null : PlusPayRichText.CREATOR.createFromParcel(parcel);
            PlusPayRichText createFromParcel2 = parcel.readInt() == 0 ? null : PlusPayRichText.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(CounterOffer.CREATOR, parcel, arrayList, i, 1);
            }
            return new PlusPayCounterOffers(createFromParcel, createFromParcel2, arrayList, parcel.readInt() == 0 ? null : PlusPayRichText.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PlusPayRichText.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayCounterOffers[] newArray(int i) {
            return new PlusPayCounterOffers[i];
        }
    }

    public PlusPayCounterOffers(PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, List<CounterOffer> list, PlusPayRichText plusPayRichText3, PlusPayRichText plusPayRichText4) {
        this.title = plusPayRichText;
        this.subtitle = plusPayRichText2;
        this.offers = list;
        this.alternativeActionText = plusPayRichText3;
        this.supportText = plusPayRichText4;
    }
}
