package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*JP\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010\u001dJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b9\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010*¨\u0006>"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "Landroid/os/Parcelable;", "", "eventSessionId", "title", "", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;", "offers", "Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;", "passedUpsaleSteps", "Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;", "offerSwitchToggle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;)Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventSessionId", "getTitle", "Ljava/util/List;", "getOffers", "getPassedUpsaleSteps", "Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;", "getOfferSwitchToggle", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayAdditionalOffers implements Parcelable {
    private static final i3y[] $childSerializers;
    private final String eventSessionId;
    private final PlusPayOfferSwitchToggle offerSwitchToggle;
    private final List<PlusPayAdditionalOffer> offers;
    private final List<PlusPayUpsaleStep> passedUpsaleSteps;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PlusPayAdditionalOffers> CREATOR = new Creator();

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new cad0(1)), a.b(lazyThreadSafetyMode, new cad0(2)), null};
    }

    public /* synthetic */ PlusPayAdditionalOffers(int i, String str, String str2, List list, List list2, PlusPayOfferSwitchToggle plusPayOfferSwitchToggle, psq0 psq0Var) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, PlusPayAdditionalOffers$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventSessionId = str;
        this.title = str2;
        this.offers = list;
        this.passedUpsaleSteps = list2;
        this.offerSwitchToggle = plusPayOfferSwitchToggle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new p53(PlusPayAdditionalOffer$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new p53(PlusPayUpsaleStep.INSTANCE.serializer(), 0);
    }

    public static /* synthetic */ PlusPayAdditionalOffers copy$default(PlusPayAdditionalOffers plusPayAdditionalOffers, String str, String str2, List list, List list2, PlusPayOfferSwitchToggle plusPayOfferSwitchToggle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayAdditionalOffers.eventSessionId;
        }
        if ((i & 2) != 0) {
            str2 = plusPayAdditionalOffers.title;
        }
        if ((i & 4) != 0) {
            list = plusPayAdditionalOffers.offers;
        }
        if ((i & 8) != 0) {
            list2 = plusPayAdditionalOffers.passedUpsaleSteps;
        }
        if ((i & 16) != 0) {
            plusPayOfferSwitchToggle = plusPayAdditionalOffers.offerSwitchToggle;
        }
        PlusPayOfferSwitchToggle plusPayOfferSwitchToggle2 = plusPayOfferSwitchToggle;
        List list3 = list;
        return plusPayAdditionalOffers.copy(str, str2, list3, list2, plusPayOfferSwitchToggle2);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayAdditionalOffers self, yjd output, SerialDescriptor serialDesc) {
        i3y[] i3yVarArr = $childSerializers;
        output.o(serialDesc, 0, self.eventSessionId);
        output.o(serialDesc, 1, self.title);
        output.e(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.offers);
        output.e(serialDesc, 3, (KSerializer) i3yVarArr[3].getValue(), self.passedUpsaleSteps);
        output.g(serialDesc, 4, PlusPayOfferSwitchToggle$$serializer.INSTANCE, self.offerSwitchToggle);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventSessionId() {
        return this.eventSessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<PlusPayAdditionalOffer> component3() {
        return this.offers;
    }

    public final List<PlusPayUpsaleStep> component4() {
        return this.passedUpsaleSteps;
    }

    /* renamed from: component5, reason: from getter */
    public final PlusPayOfferSwitchToggle getOfferSwitchToggle() {
        return this.offerSwitchToggle;
    }

    public final PlusPayAdditionalOffers copy(String eventSessionId, String title, List<PlusPayAdditionalOffer> offers, List<? extends PlusPayUpsaleStep> passedUpsaleSteps, PlusPayOfferSwitchToggle offerSwitchToggle) {
        return new PlusPayAdditionalOffers(eventSessionId, title, offers, passedUpsaleSteps, offerSwitchToggle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayAdditionalOffers)) {
            return false;
        }
        PlusPayAdditionalOffers plusPayAdditionalOffers = (PlusPayAdditionalOffers) other;
        return jl40.l(this.eventSessionId, plusPayAdditionalOffers.eventSessionId) && jl40.l(this.title, plusPayAdditionalOffers.title) && jl40.l(this.offers, plusPayAdditionalOffers.offers) && jl40.l(this.passedUpsaleSteps, plusPayAdditionalOffers.passedUpsaleSteps) && jl40.l(this.offerSwitchToggle, plusPayAdditionalOffers.offerSwitchToggle);
    }

    public final String getEventSessionId() {
        return this.eventSessionId;
    }

    public final PlusPayOfferSwitchToggle getOfferSwitchToggle() {
        return this.offerSwitchToggle;
    }

    public final List<PlusPayAdditionalOffer> getOffers() {
        return this.offers;
    }

    public final List<PlusPayUpsaleStep> getPassedUpsaleSteps() {
        return this.passedUpsaleSteps;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = unr0.c(unr0.c(unr0.b(this.eventSessionId.hashCode() * 31, 31, this.title), 31, this.offers), 31, this.passedUpsaleSteps);
        PlusPayOfferSwitchToggle plusPayOfferSwitchToggle = this.offerSwitchToggle;
        return c + (plusPayOfferSwitchToggle == null ? 0 : plusPayOfferSwitchToggle.hashCode());
    }

    public String toString() {
        return "PlusPayAdditionalOffers(eventSessionId=" + this.eventSessionId + ", title=" + this.title + ", offers=" + this.offers + ", passedUpsaleSteps=" + this.passedUpsaleSteps + ", offerSwitchToggle=" + this.offerSwitchToggle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.eventSessionId);
        dest.writeString(this.title);
        Iterator t = vfc.t(dest, this.offers);
        while (t.hasNext()) {
            ((PlusPayAdditionalOffer) t.next()).writeToParcel(dest, flags);
        }
        Iterator t2 = vfc.t(dest, this.passedUpsaleSteps);
        while (t2.hasNext()) {
            ((PlusPayUpsaleStep) t2.next()).writeToParcel(dest, flags);
        }
        PlusPayOfferSwitchToggle plusPayOfferSwitchToggle = this.offerSwitchToggle;
        if (plusPayOfferSwitchToggle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayOfferSwitchToggle.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return PlusPayAdditionalOffers$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayAdditionalOffers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayAdditionalOffers createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = oo31.d(PlusPayAdditionalOffer.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = oo31.d(PlusPayUpsaleStep.CREATOR, parcel, arrayList2, i, 1);
            }
            return new PlusPayAdditionalOffers(readString, readString2, arrayList, arrayList2, parcel.readInt() == 0 ? null : PlusPayOfferSwitchToggle.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayAdditionalOffers[] newArray(int i) {
            return new PlusPayAdditionalOffers[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlusPayAdditionalOffers(String str, String str2, List<PlusPayAdditionalOffer> list, List<? extends PlusPayUpsaleStep> list2, PlusPayOfferSwitchToggle plusPayOfferSwitchToggle) {
        this.eventSessionId = str;
        this.title = str2;
        this.offers = list;
        this.passedUpsaleSteps = list2;
        this.offerSwitchToggle = plusPayOfferSwitchToggle;
    }
}
