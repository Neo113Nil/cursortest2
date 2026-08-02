package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.auu0;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.psq0;
import defpackage.qje;
import defpackage.yjd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ&\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001d¨\u0006-"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;", "Landroid/os/Parcelable;", "", "text", "badgeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getBadgeText", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayOfferSwitchToggle implements Parcelable {
    private final String badgeText;
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PlusPayOfferSwitchToggle> CREATOR = new Creator();

    public /* synthetic */ PlusPayOfferSwitchToggle(int i, String str, String str2, psq0 psq0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, PlusPayOfferSwitchToggle$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        this.badgeText = str2;
    }

    public static /* synthetic */ PlusPayOfferSwitchToggle copy$default(PlusPayOfferSwitchToggle plusPayOfferSwitchToggle, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayOfferSwitchToggle.text;
        }
        if ((i & 2) != 0) {
            str2 = plusPayOfferSwitchToggle.badgeText;
        }
        return plusPayOfferSwitchToggle.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayOfferSwitchToggle self, yjd output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.text);
        output.g(serialDesc, 1, auu0.a, self.badgeText);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    public final PlusPayOfferSwitchToggle copy(String text, String badgeText) {
        return new PlusPayOfferSwitchToggle(text, badgeText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayOfferSwitchToggle)) {
            return false;
        }
        PlusPayOfferSwitchToggle plusPayOfferSwitchToggle = (PlusPayOfferSwitchToggle) other;
        return jl40.l(this.text, plusPayOfferSwitchToggle.text) && jl40.l(this.badgeText, plusPayOfferSwitchToggle.badgeText);
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.badgeText;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusPayOfferSwitchToggle(text=");
        sb.append(this.text);
        sb.append(", badgeText=");
        return b64.p(sb, this.badgeText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeString(this.badgeText);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayOfferSwitchToggle;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return PlusPayOfferSwitchToggle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayOfferSwitchToggle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayOfferSwitchToggle createFromParcel(Parcel parcel) {
            return new PlusPayOfferSwitchToggle(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayOfferSwitchToggle[] newArray(int i) {
            return new PlusPayOfferSwitchToggle[i];
        }
    }

    public PlusPayOfferSwitchToggle(String str, String str2) {
        this.text = str;
        this.badgeText = str2;
    }
}
