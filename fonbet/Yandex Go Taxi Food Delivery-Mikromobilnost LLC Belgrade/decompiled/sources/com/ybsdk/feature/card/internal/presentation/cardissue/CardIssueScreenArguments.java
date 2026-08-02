package com.ybsdk.feature.card.internal.presentation.cardissue;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.card.api.SuccessIssueAction;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J2\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardissue/CardIssueScreenArguments;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/card/api/SuccessIssueAction;", "issueAction", "", "applicationId", "agreementId", "<init>", "(Lcom/ybsdk/feature/card/api/SuccessIssueAction;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/card/api/SuccessIssueAction;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/ybsdk/feature/card/api/SuccessIssueAction;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/card/internal/presentation/cardissue/CardIssueScreenArguments;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/card/api/SuccessIssueAction;", "getIssueAction", "Ljava/lang/String;", "getApplicationId", "getAgreementId", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardIssueScreenArguments implements ScreenParams {
    public static final Parcelable.Creator<CardIssueScreenArguments> CREATOR = new Creator();
    private final String agreementId;
    private final String applicationId;
    private final SuccessIssueAction issueAction;

    public CardIssueScreenArguments(SuccessIssueAction successIssueAction, String str, String str2) {
        this.issueAction = successIssueAction;
        this.applicationId = str;
        this.agreementId = str2;
    }

    public static /* synthetic */ CardIssueScreenArguments copy$default(CardIssueScreenArguments cardIssueScreenArguments, SuccessIssueAction successIssueAction, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            successIssueAction = cardIssueScreenArguments.issueAction;
        }
        if ((i & 2) != 0) {
            str = cardIssueScreenArguments.applicationId;
        }
        if ((i & 4) != 0) {
            str2 = cardIssueScreenArguments.agreementId;
        }
        return cardIssueScreenArguments.copy(successIssueAction, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final SuccessIssueAction getIssueAction() {
        return this.issueAction;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final CardIssueScreenArguments copy(SuccessIssueAction issueAction, String applicationId, String agreementId) {
        return new CardIssueScreenArguments(issueAction, applicationId, agreementId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardIssueScreenArguments)) {
            return false;
        }
        CardIssueScreenArguments cardIssueScreenArguments = (CardIssueScreenArguments) other;
        return this.issueAction == cardIssueScreenArguments.issueAction && jl40.l(this.applicationId, cardIssueScreenArguments.applicationId) && jl40.l(this.agreementId, cardIssueScreenArguments.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final SuccessIssueAction getIssueAction() {
        return this.issueAction;
    }

    public int hashCode() {
        int hashCode = this.issueAction.hashCode() * 31;
        String str = this.applicationId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.agreementId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        SuccessIssueAction successIssueAction = this.issueAction;
        String str = this.applicationId;
        String str2 = this.agreementId;
        StringBuilder sb = new StringBuilder("CardIssueScreenArguments(issueAction=");
        sb.append(successIssueAction);
        sb.append(", applicationId=");
        sb.append(str);
        sb.append(", agreementId=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.issueAction.name());
        dest.writeString(this.applicationId);
        dest.writeString(this.agreementId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardIssueScreenArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardIssueScreenArguments createFromParcel(Parcel parcel) {
            return new CardIssueScreenArguments(SuccessIssueAction.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardIssueScreenArguments[] newArray(int i) {
            return new CardIssueScreenArguments[i];
        }
    }
}
