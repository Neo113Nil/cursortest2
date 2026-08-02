package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transfer.version2.api.entities.MiddleNameEntity;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity;", "Landroid/os/Parcelable;", "target", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "getTarget", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "divkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "bic", "getBic", "Legal", "Person", "Hcs", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity$Hcs;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity$Legal;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity$Person;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransferRequisiteResultEntity extends Parcelable {
    String getAccountNumber();

    String getBic();

    DivDataDto getDivkitWidget();

    RequisiteTarget getTarget();

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(Jx\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b:\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010(¨\u0006?"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity$Hcs;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity;", "", "accountNumber", "bic", "inn", "beneficiaryName", "hcsPersonalAccount", "paymentPeriod", "", "vatIncluded", "paymentPurpose", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "target", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divkitWidget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "component9", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "component10", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity$Hcs;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "getBic", "getInn", "getBeneficiaryName", "getHcsPersonalAccount", "getPaymentPeriod", "Z", "getVatIncluded", "getPaymentPurpose", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "getTarget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getDivkitWidget", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Hcs implements TransferRequisiteResultEntity {
        public static final Parcelable.Creator<Hcs> CREATOR = new Creator();
        private final String accountNumber;
        private final String beneficiaryName;
        private final String bic;
        private final DivDataDto divkitWidget;
        private final String hcsPersonalAccount;
        private final String inn;
        private final String paymentPeriod;
        private final String paymentPurpose;
        private final RequisiteTarget target;
        private final boolean vatIncluded;

        public Hcs(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, RequisiteTarget requisiteTarget, DivDataDto divDataDto) {
            this.accountNumber = str;
            this.bic = str2;
            this.inn = str3;
            this.beneficiaryName = str4;
            this.hcsPersonalAccount = str5;
            this.paymentPeriod = str6;
            this.vatIncluded = z;
            this.paymentPurpose = str7;
            this.target = requisiteTarget;
            this.divkitWidget = divDataDto;
        }

        public static /* synthetic */ Hcs copy$default(Hcs hcs, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, RequisiteTarget requisiteTarget, DivDataDto divDataDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hcs.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = hcs.bic;
            }
            if ((i & 4) != 0) {
                str3 = hcs.inn;
            }
            if ((i & 8) != 0) {
                str4 = hcs.beneficiaryName;
            }
            if ((i & 16) != 0) {
                str5 = hcs.hcsPersonalAccount;
            }
            if ((i & 32) != 0) {
                str6 = hcs.paymentPeriod;
            }
            if ((i & 64) != 0) {
                z = hcs.vatIncluded;
            }
            if ((i & 128) != 0) {
                str7 = hcs.paymentPurpose;
            }
            if ((i & 256) != 0) {
                requisiteTarget = hcs.target;
            }
            if ((i & 512) != 0) {
                divDataDto = hcs.divkitWidget;
            }
            RequisiteTarget requisiteTarget2 = requisiteTarget;
            DivDataDto divDataDto2 = divDataDto;
            boolean z2 = z;
            String str8 = str7;
            String str9 = str5;
            String str10 = str6;
            return hcs.copy(str, str2, str3, str4, str9, str10, z2, str8, requisiteTarget2, divDataDto2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component10, reason: from getter */
        public final DivDataDto getDivkitWidget() {
            return this.divkitWidget;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBic() {
            return this.bic;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInn() {
            return this.inn;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBeneficiaryName() {
            return this.beneficiaryName;
        }

        /* renamed from: component5, reason: from getter */
        public final String getHcsPersonalAccount() {
            return this.hcsPersonalAccount;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPaymentPeriod() {
            return this.paymentPeriod;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getVatIncluded() {
            return this.vatIncluded;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPaymentPurpose() {
            return this.paymentPurpose;
        }

        /* renamed from: component9, reason: from getter */
        public final RequisiteTarget getTarget() {
            return this.target;
        }

        public final Hcs copy(String accountNumber, String bic, String inn, String beneficiaryName, String hcsPersonalAccount, String paymentPeriod, boolean vatIncluded, String paymentPurpose, RequisiteTarget target, DivDataDto divkitWidget) {
            return new Hcs(accountNumber, bic, inn, beneficiaryName, hcsPersonalAccount, paymentPeriod, vatIncluded, paymentPurpose, target, divkitWidget);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hcs)) {
                return false;
            }
            Hcs hcs = (Hcs) other;
            return jl40.l(this.accountNumber, hcs.accountNumber) && jl40.l(this.bic, hcs.bic) && jl40.l(this.inn, hcs.inn) && jl40.l(this.beneficiaryName, hcs.beneficiaryName) && jl40.l(this.hcsPersonalAccount, hcs.hcsPersonalAccount) && jl40.l(this.paymentPeriod, hcs.paymentPeriod) && this.vatIncluded == hcs.vatIncluded && jl40.l(this.paymentPurpose, hcs.paymentPurpose) && jl40.l(this.target, hcs.target) && jl40.l(this.divkitWidget, hcs.divkitWidget);
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getBeneficiaryName() {
            return this.beneficiaryName;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public String getBic() {
            return this.bic;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public DivDataDto getDivkitWidget() {
            return this.divkitWidget;
        }

        public final String getHcsPersonalAccount() {
            return this.hcsPersonalAccount;
        }

        public final String getInn() {
            return this.inn;
        }

        public final String getPaymentPeriod() {
            return this.paymentPeriod;
        }

        public final String getPaymentPurpose() {
            return this.paymentPurpose;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public RequisiteTarget getTarget() {
            return this.target;
        }

        public final boolean getVatIncluded() {
            return this.vatIncluded;
        }

        public int hashCode() {
            int b = unr0.b(unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.accountNumber.hashCode() * 31, 31, this.bic), 31, this.inn), 31, this.beneficiaryName), 31, this.hcsPersonalAccount), 31, this.paymentPeriod), 31, this.vatIncluded), 31, this.paymentPurpose);
            RequisiteTarget requisiteTarget = this.target;
            int hashCode = (b + (requisiteTarget == null ? 0 : requisiteTarget.hashCode())) * 31;
            DivDataDto divDataDto = this.divkitWidget;
            return hashCode + (divDataDto != null ? divDataDto.hashCode() : 0);
        }

        public String toString() {
            String str = this.accountNumber;
            String str2 = this.bic;
            String str3 = this.inn;
            String str4 = this.beneficiaryName;
            String str5 = this.hcsPersonalAccount;
            String str6 = this.paymentPeriod;
            boolean z = this.vatIncluded;
            String str7 = this.paymentPurpose;
            RequisiteTarget requisiteTarget = this.target;
            DivDataDto divDataDto = this.divkitWidget;
            StringBuilder v = b64.v("Hcs(accountNumber=", str, ", bic=", str2, ", inn=");
            g8e.D(v, str3, ", beneficiaryName=", str4, ", hcsPersonalAccount=");
            g8e.D(v, str5, ", paymentPeriod=", str6, ", vatIncluded=");
            unr0.A(", paymentPurpose=", str7, ", target=", v, z);
            v.append(requisiteTarget);
            v.append(", divkitWidget=");
            v.append(divDataDto);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.accountNumber);
            dest.writeString(this.bic);
            dest.writeString(this.inn);
            dest.writeString(this.beneficiaryName);
            dest.writeString(this.hcsPersonalAccount);
            dest.writeString(this.paymentPeriod);
            dest.writeInt(this.vatIncluded ? 1 : 0);
            dest.writeString(this.paymentPurpose);
            RequisiteTarget requisiteTarget = this.target;
            if (requisiteTarget == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                requisiteTarget.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.divkitWidget, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Hcs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Hcs createFromParcel(Parcel parcel) {
                return new Hcs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : RequisiteTarget.CREATOR.createFromParcel(parcel), (DivDataDto) parcel.readParcelable(Hcs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Hcs[] newArray(int i) {
                return new Hcs[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$Jf\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u001a\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010$¨\u00069"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity$Legal;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity;", "", "inn", "beneficiaryName", "", "vatIncluded", "accountNumber", "bic", "paymentPurpose", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "target", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divkitWidget", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "component8", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity$Legal;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInn", "getBeneficiaryName", "Z", "getVatIncluded", "getAccountNumber", "getBic", "getPaymentPurpose", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "getTarget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getDivkitWidget", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Legal implements TransferRequisiteResultEntity {
        public static final Parcelable.Creator<Legal> CREATOR = new Creator();
        private final String accountNumber;
        private final String beneficiaryName;
        private final String bic;
        private final DivDataDto divkitWidget;
        private final String inn;
        private final String paymentPurpose;
        private final RequisiteTarget target;
        private final boolean vatIncluded;

        public Legal(String str, String str2, boolean z, String str3, String str4, String str5, RequisiteTarget requisiteTarget, DivDataDto divDataDto) {
            this.inn = str;
            this.beneficiaryName = str2;
            this.vatIncluded = z;
            this.accountNumber = str3;
            this.bic = str4;
            this.paymentPurpose = str5;
            this.target = requisiteTarget;
            this.divkitWidget = divDataDto;
        }

        public static /* synthetic */ Legal copy$default(Legal legal, String str, String str2, boolean z, String str3, String str4, String str5, RequisiteTarget requisiteTarget, DivDataDto divDataDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = legal.inn;
            }
            if ((i & 2) != 0) {
                str2 = legal.beneficiaryName;
            }
            if ((i & 4) != 0) {
                z = legal.vatIncluded;
            }
            if ((i & 8) != 0) {
                str3 = legal.accountNumber;
            }
            if ((i & 16) != 0) {
                str4 = legal.bic;
            }
            if ((i & 32) != 0) {
                str5 = legal.paymentPurpose;
            }
            if ((i & 64) != 0) {
                requisiteTarget = legal.target;
            }
            if ((i & 128) != 0) {
                divDataDto = legal.divkitWidget;
            }
            RequisiteTarget requisiteTarget2 = requisiteTarget;
            DivDataDto divDataDto2 = divDataDto;
            String str6 = str4;
            String str7 = str5;
            return legal.copy(str, str2, z, str3, str6, str7, requisiteTarget2, divDataDto2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInn() {
            return this.inn;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBeneficiaryName() {
            return this.beneficiaryName;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getVatIncluded() {
            return this.vatIncluded;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBic() {
            return this.bic;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPaymentPurpose() {
            return this.paymentPurpose;
        }

        /* renamed from: component7, reason: from getter */
        public final RequisiteTarget getTarget() {
            return this.target;
        }

        /* renamed from: component8, reason: from getter */
        public final DivDataDto getDivkitWidget() {
            return this.divkitWidget;
        }

        public final Legal copy(String inn, String beneficiaryName, boolean vatIncluded, String accountNumber, String bic, String paymentPurpose, RequisiteTarget target, DivDataDto divkitWidget) {
            return new Legal(inn, beneficiaryName, vatIncluded, accountNumber, bic, paymentPurpose, target, divkitWidget);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Legal)) {
                return false;
            }
            Legal legal = (Legal) other;
            return jl40.l(this.inn, legal.inn) && jl40.l(this.beneficiaryName, legal.beneficiaryName) && this.vatIncluded == legal.vatIncluded && jl40.l(this.accountNumber, legal.accountNumber) && jl40.l(this.bic, legal.bic) && jl40.l(this.paymentPurpose, legal.paymentPurpose) && jl40.l(this.target, legal.target) && jl40.l(this.divkitWidget, legal.divkitWidget);
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getBeneficiaryName() {
            return this.beneficiaryName;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public String getBic() {
            return this.bic;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public DivDataDto getDivkitWidget() {
            return this.divkitWidget;
        }

        public final String getInn() {
            return this.inn;
        }

        public final String getPaymentPurpose() {
            return this.paymentPurpose;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public RequisiteTarget getTarget() {
            return this.target;
        }

        public final boolean getVatIncluded() {
            return this.vatIncluded;
        }

        public int hashCode() {
            int b = unr0.b(unr0.b(unr0.e(unr0.b(this.inn.hashCode() * 31, 31, this.beneficiaryName), 31, this.vatIncluded), 31, this.accountNumber), 31, this.bic);
            String str = this.paymentPurpose;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            RequisiteTarget requisiteTarget = this.target;
            int hashCode2 = (hashCode + (requisiteTarget == null ? 0 : requisiteTarget.hashCode())) * 31;
            DivDataDto divDataDto = this.divkitWidget;
            return hashCode2 + (divDataDto != null ? divDataDto.hashCode() : 0);
        }

        public String toString() {
            String str = this.inn;
            String str2 = this.beneficiaryName;
            boolean z = this.vatIncluded;
            String str3 = this.accountNumber;
            String str4 = this.bic;
            String str5 = this.paymentPurpose;
            RequisiteTarget requisiteTarget = this.target;
            DivDataDto divDataDto = this.divkitWidget;
            StringBuilder v = b64.v("Legal(inn=", str, ", beneficiaryName=", str2, ", vatIncluded=");
            unr0.A(", accountNumber=", str3, ", bic=", v, z);
            g8e.D(v, str4, ", paymentPurpose=", str5, ", target=");
            v.append(requisiteTarget);
            v.append(", divkitWidget=");
            v.append(divDataDto);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.inn);
            dest.writeString(this.beneficiaryName);
            dest.writeInt(this.vatIncluded ? 1 : 0);
            dest.writeString(this.accountNumber);
            dest.writeString(this.bic);
            dest.writeString(this.paymentPurpose);
            RequisiteTarget requisiteTarget = this.target;
            if (requisiteTarget == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                requisiteTarget.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.divkitWidget, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Legal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Legal createFromParcel(Parcel parcel) {
                return new Legal(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RequisiteTarget.CREATOR.createFromParcel(parcel), (DivDataDto) parcel.readParcelable(Legal.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Legal[] newArray(int i) {
                return new Legal[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$Jf\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010$¨\u0006:"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity$Person;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity;", "", "firstName", "lastName", "Lcom/ybsdk/feature/transfer/version2/api/entities/MiddleNameEntity;", "middleName", "accountNumber", "bic", "paymentPurpose", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "target", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divkitWidget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/MiddleNameEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/entities/MiddleNameEntity;", "component4", "component5", "component6", "component7", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "component8", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/MiddleNameEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/TransferRequisiteResultEntity$Person;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstName", "getLastName", "Lcom/ybsdk/feature/transfer/version2/api/entities/MiddleNameEntity;", "getMiddleName", "getAccountNumber", "getBic", "getPaymentPurpose", "Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/RequisiteTarget;", "getTarget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getDivkitWidget", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Person implements TransferRequisiteResultEntity {
        public static final Parcelable.Creator<Person> CREATOR = new Creator();
        private final String accountNumber;
        private final String bic;
        private final DivDataDto divkitWidget;
        private final String firstName;
        private final String lastName;
        private final MiddleNameEntity middleName;
        private final String paymentPurpose;
        private final RequisiteTarget target;

        public Person(String str, String str2, MiddleNameEntity middleNameEntity, String str3, String str4, String str5, RequisiteTarget requisiteTarget, DivDataDto divDataDto) {
            this.firstName = str;
            this.lastName = str2;
            this.middleName = middleNameEntity;
            this.accountNumber = str3;
            this.bic = str4;
            this.paymentPurpose = str5;
            this.target = requisiteTarget;
            this.divkitWidget = divDataDto;
        }

        public static /* synthetic */ Person copy$default(Person person, String str, String str2, MiddleNameEntity middleNameEntity, String str3, String str4, String str5, RequisiteTarget requisiteTarget, DivDataDto divDataDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = person.firstName;
            }
            if ((i & 2) != 0) {
                str2 = person.lastName;
            }
            if ((i & 4) != 0) {
                middleNameEntity = person.middleName;
            }
            if ((i & 8) != 0) {
                str3 = person.accountNumber;
            }
            if ((i & 16) != 0) {
                str4 = person.bic;
            }
            if ((i & 32) != 0) {
                str5 = person.paymentPurpose;
            }
            if ((i & 64) != 0) {
                requisiteTarget = person.target;
            }
            if ((i & 128) != 0) {
                divDataDto = person.divkitWidget;
            }
            RequisiteTarget requisiteTarget2 = requisiteTarget;
            DivDataDto divDataDto2 = divDataDto;
            String str6 = str4;
            String str7 = str5;
            return person.copy(str, str2, middleNameEntity, str3, str6, str7, requisiteTarget2, divDataDto2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* renamed from: component3, reason: from getter */
        public final MiddleNameEntity getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBic() {
            return this.bic;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPaymentPurpose() {
            return this.paymentPurpose;
        }

        /* renamed from: component7, reason: from getter */
        public final RequisiteTarget getTarget() {
            return this.target;
        }

        /* renamed from: component8, reason: from getter */
        public final DivDataDto getDivkitWidget() {
            return this.divkitWidget;
        }

        public final Person copy(String firstName, String lastName, MiddleNameEntity middleName, String accountNumber, String bic, String paymentPurpose, RequisiteTarget target, DivDataDto divkitWidget) {
            return new Person(firstName, lastName, middleName, accountNumber, bic, paymentPurpose, target, divkitWidget);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Person)) {
                return false;
            }
            Person person = (Person) other;
            return jl40.l(this.firstName, person.firstName) && jl40.l(this.lastName, person.lastName) && jl40.l(this.middleName, person.middleName) && jl40.l(this.accountNumber, person.accountNumber) && jl40.l(this.bic, person.bic) && jl40.l(this.paymentPurpose, person.paymentPurpose) && jl40.l(this.target, person.target) && jl40.l(this.divkitWidget, person.divkitWidget);
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public String getBic() {
            return this.bic;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public DivDataDto getDivkitWidget() {
            return this.divkitWidget;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final MiddleNameEntity getMiddleName() {
            return this.middleName;
        }

        public final String getPaymentPurpose() {
            return this.paymentPurpose;
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity
        public RequisiteTarget getTarget() {
            return this.target;
        }

        public int hashCode() {
            int b = unr0.b(unr0.b((this.middleName.hashCode() + unr0.b(this.firstName.hashCode() * 31, 31, this.lastName)) * 31, 31, this.accountNumber), 31, this.bic);
            String str = this.paymentPurpose;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            RequisiteTarget requisiteTarget = this.target;
            int hashCode2 = (hashCode + (requisiteTarget == null ? 0 : requisiteTarget.hashCode())) * 31;
            DivDataDto divDataDto = this.divkitWidget;
            return hashCode2 + (divDataDto != null ? divDataDto.hashCode() : 0);
        }

        public String toString() {
            String str = this.firstName;
            String str2 = this.lastName;
            MiddleNameEntity middleNameEntity = this.middleName;
            String str3 = this.accountNumber;
            String str4 = this.bic;
            String str5 = this.paymentPurpose;
            RequisiteTarget requisiteTarget = this.target;
            DivDataDto divDataDto = this.divkitWidget;
            StringBuilder v = b64.v("Person(firstName=", str, ", lastName=", str2, ", middleName=");
            v.append(middleNameEntity);
            v.append(", accountNumber=");
            v.append(str3);
            v.append(", bic=");
            g8e.D(v, str4, ", paymentPurpose=", str5, ", target=");
            v.append(requisiteTarget);
            v.append(", divkitWidget=");
            v.append(divDataDto);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.firstName);
            dest.writeString(this.lastName);
            dest.writeParcelable(this.middleName, flags);
            dest.writeString(this.accountNumber);
            dest.writeString(this.bic);
            dest.writeString(this.paymentPurpose);
            RequisiteTarget requisiteTarget = this.target;
            if (requisiteTarget == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                requisiteTarget.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.divkitWidget, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Person> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Person createFromParcel(Parcel parcel) {
                return new Person(parcel.readString(), parcel.readString(), (MiddleNameEntity) parcel.readParcelable(Person.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RequisiteTarget.CREATOR.createFromParcel(parcel), (DivDataDto) parcel.readParcelable(Person.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Person[] newArray(int i) {
                return new Person[i];
            }
        }
    }
}
