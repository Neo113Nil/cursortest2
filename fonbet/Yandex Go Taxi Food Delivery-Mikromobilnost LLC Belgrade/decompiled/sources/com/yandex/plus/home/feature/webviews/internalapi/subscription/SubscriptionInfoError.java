package com.yandex.plus.home.feature.webviews.internalapi.subscription;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.auu0;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.unr0;
import defpackage.w0v0;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "Landroid/os/Parcelable;", Constants.KEY_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "place", "getPlace", "storyId", "getStoryId", "ParseConfigError", "NoTarget", "NoProductsByTarget", "EmptyProductsByTarget", "InvalidPaymentMethod", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$EmptyProductsByTarget;", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$InvalidPaymentMethod;", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$NoProductsByTarget;", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$NoTarget;", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$ParseConfigError;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SubscriptionInfoError extends Parcelable {
    String getMessage();

    String getPlace();

    String getStoryId();

    @gsq0
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBg\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010#Jb\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010\u001cJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010#R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010)R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u0010#¨\u0006@"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$EmptyProductsByTarget;", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "", Constants.KEY_MESSAGE, "place", "storyId", "targetId", "vendorType", "", "offersIds", "paymentMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_feature_webviews_release", "(Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$EmptyProductsByTarget;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$EmptyProductsByTarget;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getPlace", "getStoryId", "getTargetId", "getVendorType", "Ljava/util/List;", "getOffersIds", "getPaymentMethod", "Companion", "com/yandex/plus/home/feature/webviews/internalapi/subscription/a", "com/yandex/plus/home/feature/webviews/internalapi/subscription/b", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmptyProductsByTarget implements SubscriptionInfoError {
        private final String message;
        private final List<String> offersIds;
        private final String paymentMethod;
        private final String place;
        private final String storyId;
        private final String targetId;
        private final String vendorType;
        public static final b Companion = new b();
        public static final Parcelable.Creator<EmptyProductsByTarget> CREATOR = new Creator();
        private static final i3y[] $childSerializers = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(1)), null};

        public /* synthetic */ EmptyProductsByTarget(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, psq0 psq0Var) {
            if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
                qje.Z(i, HProv.PP_VERSION_TIMESTAMP, a.a.getDescriptor());
                throw null;
            }
            this.message = str;
            this.place = str2;
            this.storyId = str3;
            this.targetId = str4;
            this.vendorType = str5;
            this.offersIds = list;
            this.paymentMethod = str6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new p53(auu0.a, 0);
        }

        public static /* synthetic */ EmptyProductsByTarget copy$default(EmptyProductsByTarget emptyProductsByTarget, String str, String str2, String str3, String str4, String str5, List list, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = emptyProductsByTarget.message;
            }
            if ((i & 2) != 0) {
                str2 = emptyProductsByTarget.place;
            }
            if ((i & 4) != 0) {
                str3 = emptyProductsByTarget.storyId;
            }
            if ((i & 8) != 0) {
                str4 = emptyProductsByTarget.targetId;
            }
            if ((i & 16) != 0) {
                str5 = emptyProductsByTarget.vendorType;
            }
            if ((i & 32) != 0) {
                list = emptyProductsByTarget.offersIds;
            }
            if ((i & 64) != 0) {
                str6 = emptyProductsByTarget.paymentMethod;
            }
            List list2 = list;
            String str7 = str6;
            String str8 = str5;
            String str9 = str3;
            return emptyProductsByTarget.copy(str, str2, str9, str4, str8, list2, str7);
        }

        public static final /* synthetic */ void write$Self$plus_home_feature_webviews_release(EmptyProductsByTarget self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            auu0 auu0Var = auu0.a;
            output.g(serialDesc, 0, auu0Var, self.getMessage());
            output.g(serialDesc, 1, auu0Var, self.getPlace());
            output.g(serialDesc, 2, auu0Var, self.getStoryId());
            output.o(serialDesc, 3, self.targetId);
            output.o(serialDesc, 4, self.vendorType);
            output.e(serialDesc, 5, (KSerializer) i3yVarArr[5].getValue(), self.offersIds);
            output.o(serialDesc, 6, self.paymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlace() {
            return this.place;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStoryId() {
            return this.storyId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTargetId() {
            return this.targetId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getVendorType() {
            return this.vendorType;
        }

        public final List<String> component6() {
            return this.offersIds;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final EmptyProductsByTarget copy(String message, String place, String storyId, String targetId, String vendorType, List<String> offersIds, String paymentMethod) {
            return new EmptyProductsByTarget(message, place, storyId, targetId, vendorType, offersIds, paymentMethod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyProductsByTarget)) {
                return false;
            }
            EmptyProductsByTarget emptyProductsByTarget = (EmptyProductsByTarget) other;
            return jl40.l(this.message, emptyProductsByTarget.message) && jl40.l(this.place, emptyProductsByTarget.place) && jl40.l(this.storyId, emptyProductsByTarget.storyId) && jl40.l(this.targetId, emptyProductsByTarget.targetId) && jl40.l(this.vendorType, emptyProductsByTarget.vendorType) && jl40.l(this.offersIds, emptyProductsByTarget.offersIds) && jl40.l(this.paymentMethod, emptyProductsByTarget.paymentMethod);
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getMessage() {
            return this.message;
        }

        public final List<String> getOffersIds() {
            return this.offersIds;
        }

        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getPlace() {
            return this.place;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getStoryId() {
            return this.storyId;
        }

        public final String getTargetId() {
            return this.targetId;
        }

        public final String getVendorType() {
            return this.vendorType;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.place;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.storyId;
            return this.paymentMethod.hashCode() + unr0.c(unr0.b(unr0.b((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.targetId), 31, this.vendorType), 31, this.offersIds);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("EmptyProductsByTarget(message=");
            sb.append(this.message);
            sb.append(", place=");
            sb.append(this.place);
            sb.append(", storyId=");
            sb.append(this.storyId);
            sb.append(", targetId=");
            sb.append(this.targetId);
            sb.append(", vendorType=");
            sb.append(this.vendorType);
            sb.append(", offersIds=");
            sb.append(this.offersIds);
            sb.append(", paymentMethod=");
            return b64.p(sb, this.paymentMethod, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.message);
            dest.writeString(this.place);
            dest.writeString(this.storyId);
            dest.writeString(this.targetId);
            dest.writeString(this.vendorType);
            dest.writeStringList(this.offersIds);
            dest.writeString(this.paymentMethod);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EmptyProductsByTarget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EmptyProductsByTarget createFromParcel(Parcel parcel) {
                return new EmptyProductsByTarget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EmptyProductsByTarget[] newArray(int i) {
                return new EmptyProductsByTarget[i];
            }
        }

        public EmptyProductsByTarget(String str, String str2, String str3, String str4, String str5, List<String> list, String str6) {
            this.message = str;
            this.place = str2;
            this.storyId = str3;
            this.targetId = str4;
            this.vendorType = str5;
            this.offersIds = list;
            this.paymentMethod = str6;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 JH\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010 ¨\u00067"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$InvalidPaymentMethod;", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "", Constants.KEY_MESSAGE, "place", "storyId", "targetId", "paymentMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_feature_webviews_release", "(Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$InvalidPaymentMethod;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$InvalidPaymentMethod;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getPlace", "getStoryId", "getTargetId", "getPaymentMethod", "Companion", "com/yandex/plus/home/feature/webviews/internalapi/subscription/c", "com/yandex/plus/home/feature/webviews/internalapi/subscription/d", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvalidPaymentMethod implements SubscriptionInfoError {
        private final String message;
        private final String paymentMethod;
        private final String place;
        private final String storyId;
        private final String targetId;
        public static final d Companion = new d();
        public static final Parcelable.Creator<InvalidPaymentMethod> CREATOR = new Creator();

        public /* synthetic */ InvalidPaymentMethod(int i, String str, String str2, String str3, String str4, String str5, psq0 psq0Var) {
            if (31 != (i & 31)) {
                qje.Z(i, 31, c.a.getDescriptor());
                throw null;
            }
            this.message = str;
            this.place = str2;
            this.storyId = str3;
            this.targetId = str4;
            this.paymentMethod = str5;
        }

        public static /* synthetic */ InvalidPaymentMethod copy$default(InvalidPaymentMethod invalidPaymentMethod, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalidPaymentMethod.message;
            }
            if ((i & 2) != 0) {
                str2 = invalidPaymentMethod.place;
            }
            if ((i & 4) != 0) {
                str3 = invalidPaymentMethod.storyId;
            }
            if ((i & 8) != 0) {
                str4 = invalidPaymentMethod.targetId;
            }
            if ((i & 16) != 0) {
                str5 = invalidPaymentMethod.paymentMethod;
            }
            String str6 = str5;
            String str7 = str3;
            return invalidPaymentMethod.copy(str, str2, str7, str4, str6);
        }

        public static final /* synthetic */ void write$Self$plus_home_feature_webviews_release(InvalidPaymentMethod self, yjd output, SerialDescriptor serialDesc) {
            auu0 auu0Var = auu0.a;
            output.g(serialDesc, 0, auu0Var, self.getMessage());
            output.g(serialDesc, 1, auu0Var, self.getPlace());
            output.g(serialDesc, 2, auu0Var, self.getStoryId());
            output.o(serialDesc, 3, self.targetId);
            output.o(serialDesc, 4, self.paymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlace() {
            return this.place;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStoryId() {
            return this.storyId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTargetId() {
            return this.targetId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final InvalidPaymentMethod copy(String message, String place, String storyId, String targetId, String paymentMethod) {
            return new InvalidPaymentMethod(message, place, storyId, targetId, paymentMethod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvalidPaymentMethod)) {
                return false;
            }
            InvalidPaymentMethod invalidPaymentMethod = (InvalidPaymentMethod) other;
            return jl40.l(this.message, invalidPaymentMethod.message) && jl40.l(this.place, invalidPaymentMethod.place) && jl40.l(this.storyId, invalidPaymentMethod.storyId) && jl40.l(this.targetId, invalidPaymentMethod.targetId) && jl40.l(this.paymentMethod, invalidPaymentMethod.paymentMethod);
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getMessage() {
            return this.message;
        }

        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getPlace() {
            return this.place;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getStoryId() {
            return this.storyId;
        }

        public final String getTargetId() {
            return this.targetId;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.place;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.storyId;
            return this.paymentMethod.hashCode() + unr0.b((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.targetId);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("InvalidPaymentMethod(message=");
            sb.append(this.message);
            sb.append(", place=");
            sb.append(this.place);
            sb.append(", storyId=");
            sb.append(this.storyId);
            sb.append(", targetId=");
            sb.append(this.targetId);
            sb.append(", paymentMethod=");
            return b64.p(sb, this.paymentMethod, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.message);
            dest.writeString(this.place);
            dest.writeString(this.storyId);
            dest.writeString(this.targetId);
            dest.writeString(this.paymentMethod);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InvalidPaymentMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvalidPaymentMethod createFromParcel(Parcel parcel) {
                return new InvalidPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvalidPaymentMethod[] newArray(int i) {
                return new InvalidPaymentMethod[i];
            }
        }

        public InvalidPaymentMethod(String str, String str2, String str3, String str4, String str5) {
            this.message = str;
            this.place = str2;
            this.storyId = str3;
            this.targetId = str4;
            this.paymentMethod = str5;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!JT\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010!¨\u0006:"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$NoProductsByTarget;", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "", Constants.KEY_MESSAGE, "place", "storyId", "targetId", ErrorResponseData.JSON_ERROR_MESSAGE, "paymentMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_feature_webviews_release", "(Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$NoProductsByTarget;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$NoProductsByTarget;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getPlace", "getStoryId", "getTargetId", "getErrorMessage", "getPaymentMethod", "Companion", "com/yandex/plus/home/feature/webviews/internalapi/subscription/e", "com/yandex/plus/home/feature/webviews/internalapi/subscription/f", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoProductsByTarget implements SubscriptionInfoError {
        private final String errorMessage;
        private final String message;
        private final String paymentMethod;
        private final String place;
        private final String storyId;
        private final String targetId;
        public static final f Companion = new f();
        public static final Parcelable.Creator<NoProductsByTarget> CREATOR = new Creator();

        public /* synthetic */ NoProductsByTarget(int i, String str, String str2, String str3, String str4, String str5, String str6, psq0 psq0Var) {
            if (63 != (i & 63)) {
                qje.Z(i, 63, e.a.getDescriptor());
                throw null;
            }
            this.message = str;
            this.place = str2;
            this.storyId = str3;
            this.targetId = str4;
            this.errorMessage = str5;
            this.paymentMethod = str6;
        }

        public static /* synthetic */ NoProductsByTarget copy$default(NoProductsByTarget noProductsByTarget, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noProductsByTarget.message;
            }
            if ((i & 2) != 0) {
                str2 = noProductsByTarget.place;
            }
            if ((i & 4) != 0) {
                str3 = noProductsByTarget.storyId;
            }
            if ((i & 8) != 0) {
                str4 = noProductsByTarget.targetId;
            }
            if ((i & 16) != 0) {
                str5 = noProductsByTarget.errorMessage;
            }
            if ((i & 32) != 0) {
                str6 = noProductsByTarget.paymentMethod;
            }
            String str7 = str5;
            String str8 = str6;
            return noProductsByTarget.copy(str, str2, str3, str4, str7, str8);
        }

        public static final /* synthetic */ void write$Self$plus_home_feature_webviews_release(NoProductsByTarget self, yjd output, SerialDescriptor serialDesc) {
            auu0 auu0Var = auu0.a;
            output.g(serialDesc, 0, auu0Var, self.getMessage());
            output.g(serialDesc, 1, auu0Var, self.getPlace());
            output.g(serialDesc, 2, auu0Var, self.getStoryId());
            output.o(serialDesc, 3, self.targetId);
            output.g(serialDesc, 4, auu0Var, self.errorMessage);
            output.o(serialDesc, 5, self.paymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlace() {
            return this.place;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStoryId() {
            return this.storyId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTargetId() {
            return this.targetId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final NoProductsByTarget copy(String message, String place, String storyId, String targetId, String errorMessage, String paymentMethod) {
            return new NoProductsByTarget(message, place, storyId, targetId, errorMessage, paymentMethod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoProductsByTarget)) {
                return false;
            }
            NoProductsByTarget noProductsByTarget = (NoProductsByTarget) other;
            return jl40.l(this.message, noProductsByTarget.message) && jl40.l(this.place, noProductsByTarget.place) && jl40.l(this.storyId, noProductsByTarget.storyId) && jl40.l(this.targetId, noProductsByTarget.targetId) && jl40.l(this.errorMessage, noProductsByTarget.errorMessage) && jl40.l(this.paymentMethod, noProductsByTarget.paymentMethod);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getMessage() {
            return this.message;
        }

        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getPlace() {
            return this.place;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getStoryId() {
            return this.storyId;
        }

        public final String getTargetId() {
            return this.targetId;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.place;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.storyId;
            int b = unr0.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.targetId);
            String str4 = this.errorMessage;
            return this.paymentMethod.hashCode() + ((b + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NoProductsByTarget(message=");
            sb.append(this.message);
            sb.append(", place=");
            sb.append(this.place);
            sb.append(", storyId=");
            sb.append(this.storyId);
            sb.append(", targetId=");
            sb.append(this.targetId);
            sb.append(", errorMessage=");
            sb.append(this.errorMessage);
            sb.append(", paymentMethod=");
            return b64.p(sb, this.paymentMethod, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.message);
            dest.writeString(this.place);
            dest.writeString(this.storyId);
            dest.writeString(this.targetId);
            dest.writeString(this.errorMessage);
            dest.writeString(this.paymentMethod);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoProductsByTarget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoProductsByTarget createFromParcel(Parcel parcel) {
                return new NoProductsByTarget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoProductsByTarget[] newArray(int i) {
                return new NoProductsByTarget[i];
            }
        }

        public NoProductsByTarget(String str, String str2, String str3, String str4, String str5, String str6) {
            this.message = str;
            this.place = str2;
            this.storyId = str3;
            this.targetId = str4;
            this.errorMessage = str5;
            this.paymentMethod = str6;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ>\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001f¨\u00064"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$NoTarget;", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "", Constants.KEY_MESSAGE, "place", "storyId", "paymentMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_feature_webviews_release", "(Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$NoTarget;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$NoTarget;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getPlace", "getStoryId", "getPaymentMethod", "Companion", "com/yandex/plus/home/feature/webviews/internalapi/subscription/g", "com/yandex/plus/home/feature/webviews/internalapi/subscription/h", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoTarget implements SubscriptionInfoError {
        private final String message;
        private final String paymentMethod;
        private final String place;
        private final String storyId;
        public static final h Companion = new h();
        public static final Parcelable.Creator<NoTarget> CREATOR = new Creator();

        public /* synthetic */ NoTarget(int i, String str, String str2, String str3, String str4, psq0 psq0Var) {
            if (15 != (i & 15)) {
                qje.Z(i, 15, g.a.getDescriptor());
                throw null;
            }
            this.message = str;
            this.place = str2;
            this.storyId = str3;
            this.paymentMethod = str4;
        }

        public static /* synthetic */ NoTarget copy$default(NoTarget noTarget, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noTarget.message;
            }
            if ((i & 2) != 0) {
                str2 = noTarget.place;
            }
            if ((i & 4) != 0) {
                str3 = noTarget.storyId;
            }
            if ((i & 8) != 0) {
                str4 = noTarget.paymentMethod;
            }
            return noTarget.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self$plus_home_feature_webviews_release(NoTarget self, yjd output, SerialDescriptor serialDesc) {
            auu0 auu0Var = auu0.a;
            output.g(serialDesc, 0, auu0Var, self.getMessage());
            output.g(serialDesc, 1, auu0Var, self.getPlace());
            output.g(serialDesc, 2, auu0Var, self.getStoryId());
            output.o(serialDesc, 3, self.paymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlace() {
            return this.place;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStoryId() {
            return this.storyId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final NoTarget copy(String message, String place, String storyId, String paymentMethod) {
            return new NoTarget(message, place, storyId, paymentMethod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoTarget)) {
                return false;
            }
            NoTarget noTarget = (NoTarget) other;
            return jl40.l(this.message, noTarget.message) && jl40.l(this.place, noTarget.place) && jl40.l(this.storyId, noTarget.storyId) && jl40.l(this.paymentMethod, noTarget.paymentMethod);
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getMessage() {
            return this.message;
        }

        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getPlace() {
            return this.place;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getStoryId() {
            return this.storyId;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.place;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.storyId;
            return this.paymentMethod.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NoTarget(message=");
            sb.append(this.message);
            sb.append(", place=");
            sb.append(this.place);
            sb.append(", storyId=");
            sb.append(this.storyId);
            sb.append(", paymentMethod=");
            return b64.p(sb, this.paymentMethod, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.message);
            dest.writeString(this.place);
            dest.writeString(this.storyId);
            dest.writeString(this.paymentMethod);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoTarget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoTarget createFromParcel(Parcel parcel) {
                return new NoTarget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoTarget[] newArray(int i) {
                return new NoTarget[i];
            }
        }

        public NoTarget(String str, String str2, String str3, String str4) {
            this.message = str;
            this.place = str2;
            this.storyId = str3;
            this.paymentMethod = str4;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ4\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$ParseConfigError;", "Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError;", "", Constants.KEY_MESSAGE, "place", "storyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_feature_webviews_release", "(Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$ParseConfigError;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/home/feature/webviews/internalapi/subscription/SubscriptionInfoError$ParseConfigError;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getPlace", "getStoryId", "Companion", "com/yandex/plus/home/feature/webviews/internalapi/subscription/i", "com/yandex/plus/home/feature/webviews/internalapi/subscription/j", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ParseConfigError implements SubscriptionInfoError {
        private final String message;
        private final String place;
        private final String storyId;
        public static final j Companion = new j();
        public static final Parcelable.Creator<ParseConfigError> CREATOR = new Creator();

        public /* synthetic */ ParseConfigError(int i, String str, String str2, String str3, psq0 psq0Var) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, i.a.getDescriptor());
                throw null;
            }
            this.message = str;
            this.place = str2;
            this.storyId = str3;
        }

        public static /* synthetic */ ParseConfigError copy$default(ParseConfigError parseConfigError, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = parseConfigError.message;
            }
            if ((i & 2) != 0) {
                str2 = parseConfigError.place;
            }
            if ((i & 4) != 0) {
                str3 = parseConfigError.storyId;
            }
            return parseConfigError.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self$plus_home_feature_webviews_release(ParseConfigError self, yjd output, SerialDescriptor serialDesc) {
            auu0 auu0Var = auu0.a;
            output.g(serialDesc, 0, auu0Var, self.getMessage());
            output.g(serialDesc, 1, auu0Var, self.getPlace());
            output.g(serialDesc, 2, auu0Var, self.getStoryId());
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlace() {
            return this.place;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStoryId() {
            return this.storyId;
        }

        public final ParseConfigError copy(String message, String place, String storyId) {
            return new ParseConfigError(message, place, storyId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParseConfigError)) {
                return false;
            }
            ParseConfigError parseConfigError = (ParseConfigError) other;
            return jl40.l(this.message, parseConfigError.message) && jl40.l(this.place, parseConfigError.place) && jl40.l(this.storyId, parseConfigError.storyId);
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getMessage() {
            return this.message;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getPlace() {
            return this.place;
        }

        @Override // com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError
        public String getStoryId() {
            return this.storyId;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.place;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.storyId;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ParseConfigError(message=");
            sb.append(this.message);
            sb.append(", place=");
            sb.append(this.place);
            sb.append(", storyId=");
            return b64.p(sb, this.storyId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.message);
            dest.writeString(this.place);
            dest.writeString(this.storyId);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ParseConfigError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ParseConfigError createFromParcel(Parcel parcel) {
                return new ParseConfigError(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ParseConfigError[] newArray(int i) {
                return new ParseConfigError[i];
            }
        }

        public ParseConfigError(String str, String str2, String str3) {
            this.message = str;
            this.place = str2;
            this.storyId = str3;
        }
    }
}
