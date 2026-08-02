package com.yandex.plus.home.repository.api.model.webconfig;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import com.yandex.plus.core.data.common.ColorPair;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.auu0;
import defpackage.b64;
import defpackage.bmu0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.h0v0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.k8u;
import defpackage.o4o;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qv10;
import defpackage.sfc;
import defpackage.sls;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xvz;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0005DEFGHB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010*JB\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010\u001cJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010*R!\u0010?\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@¨\u0006I"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;", "Landroid/os/Parcelable;", "", "name", "id", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription;", "subscription", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo;", "payInfo", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayButton;", "payButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayButton;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayButton;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_domain_repository_api_release", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription;", "component4", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo;", "component5", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayButton;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayButton;)Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getId", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription;", "getSubscription", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo;", "getPayInfo", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayButton;", "getPayButton", "isSilentPaymentEnabled$delegate", "Li3y;", "isSilentPaymentEnabled", "()Z", "isSilentPaymentEnabled$annotations", "()V", "Companion", "Subscription", "PayInfo", "PayButton", "com/yandex/plus/home/repository/api/model/webconfig/a", "h0v0", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SubscriptionConfiguration implements Parcelable {
    private final String id;

    /* renamed from: isSilentPaymentEnabled$delegate, reason: from kotlin metadata */
    private final i3y isSilentPaymentEnabled;
    private final String name;
    private final PayButton payButton;
    private final PayInfo payInfo;
    private final Subscription subscription;
    public static final h0v0 Companion = new h0v0();
    public static final Parcelable.Creator<SubscriptionConfiguration> CREATOR = new Creator();

    public /* synthetic */ SubscriptionConfiguration(int i, String str, String str2, Subscription subscription, PayInfo payInfo, PayButton payButton, psq0 psq0Var) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, a.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.id = str2;
        this.subscription = subscription;
        this.payInfo = payInfo;
        this.payButton = payButton;
        final int i2 = 0;
        this.isSilentPaymentEnabled = kotlin.a.a(new sls(this) { // from class: g0v0
            public final /* synthetic */ SubscriptionConfiguration b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                boolean _init_$lambda$1;
                int i3 = i2;
                SubscriptionConfiguration subscriptionConfiguration = this.b;
                switch (i3) {
                    case 0:
                        _init_$lambda$1 = SubscriptionConfiguration._init_$lambda$1(subscriptionConfiguration);
                        break;
                    default:
                        _init_$lambda$1 = SubscriptionConfiguration.isSilentPaymentEnabled_delegate$lambda$0(subscriptionConfiguration);
                        break;
                }
                return Boolean.valueOf(_init_$lambda$1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(SubscriptionConfiguration subscriptionConfiguration) {
        PayInfo.OneClickLegalInfo oneClickLegalInfo;
        return subscriptionConfiguration.subscription.isSilentPaymentEnabled() && (oneClickLegalInfo = subscriptionConfiguration.payInfo.getOneClickLegalInfo()) != null && oneClickLegalInfo.isValid();
    }

    public static /* synthetic */ SubscriptionConfiguration copy$default(SubscriptionConfiguration subscriptionConfiguration, String str, String str2, Subscription subscription, PayInfo payInfo, PayButton payButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionConfiguration.name;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionConfiguration.id;
        }
        if ((i & 4) != 0) {
            subscription = subscriptionConfiguration.subscription;
        }
        if ((i & 8) != 0) {
            payInfo = subscriptionConfiguration.payInfo;
        }
        if ((i & 16) != 0) {
            payButton = subscriptionConfiguration.payButton;
        }
        PayButton payButton2 = payButton;
        Subscription subscription2 = subscription;
        return subscriptionConfiguration.copy(str, str2, subscription2, payInfo, payButton2);
    }

    public static /* synthetic */ void isSilentPaymentEnabled$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSilentPaymentEnabled_delegate$lambda$0(SubscriptionConfiguration subscriptionConfiguration) {
        PayInfo.OneClickLegalInfo oneClickLegalInfo;
        return subscriptionConfiguration.subscription.isSilentPaymentEnabled() && (oneClickLegalInfo = subscriptionConfiguration.payInfo.getOneClickLegalInfo()) != null && oneClickLegalInfo.isValid();
    }

    public static final /* synthetic */ void write$Self$plus_home_domain_repository_api_release(SubscriptionConfiguration self, yjd output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.name);
        output.o(serialDesc, 1, self.id);
        output.e(serialDesc, 2, j.a, self.subscription);
        output.e(serialDesc, 3, d.a, self.payInfo);
        output.e(serialDesc, 4, b.a, self.payButton);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final Subscription getSubscription() {
        return this.subscription;
    }

    /* renamed from: component4, reason: from getter */
    public final PayInfo getPayInfo() {
        return this.payInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final PayButton getPayButton() {
        return this.payButton;
    }

    public final SubscriptionConfiguration copy(String name, String id, Subscription subscription, PayInfo payInfo, PayButton payButton) {
        return new SubscriptionConfiguration(name, id, subscription, payInfo, payButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionConfiguration)) {
            return false;
        }
        SubscriptionConfiguration subscriptionConfiguration = (SubscriptionConfiguration) other;
        return jl40.l(this.name, subscriptionConfiguration.name) && jl40.l(this.id, subscriptionConfiguration.id) && jl40.l(this.subscription, subscriptionConfiguration.subscription) && jl40.l(this.payInfo, subscriptionConfiguration.payInfo) && jl40.l(this.payButton, subscriptionConfiguration.payButton);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final PayButton getPayButton() {
        return this.payButton;
    }

    public final PayInfo getPayInfo() {
        return this.payInfo;
    }

    public final Subscription getSubscription() {
        return this.subscription;
    }

    public int hashCode() {
        return this.payButton.hashCode() + ((this.payInfo.hashCode() + ((this.subscription.hashCode() + unr0.b(this.name.hashCode() * 31, 31, this.id)) * 31)) * 31);
    }

    public final boolean isSilentPaymentEnabled() {
        return ((Boolean) this.isSilentPaymentEnabled.getValue()).booleanValue();
    }

    public String toString() {
        return "SubscriptionConfiguration(name=" + this.name + ", id=" + this.id + ", subscription=" + this.subscription + ", payInfo=" + this.payInfo + ", payButton=" + this.payButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.id);
        this.subscription.writeToParcel(dest, flags);
        this.payInfo.writeToParcel(dest, flags);
        this.payButton.writeToParcel(dest, flags);
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0004>?@AB1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b(\u0010)JB\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010)¨\u0006B"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$LegalInfo;", "legalInfo", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$OneClickLegalInfo;", "oneClickLegalInfo", "Lcom/yandex/plus/core/data/common/ColorPair;", "textColor", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "<init>", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$LegalInfo;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$OneClickLegalInfo;Lcom/yandex/plus/core/data/common/ColorPair;Lcom/yandex/plus/core/data/common/PlusThemedColor;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$LegalInfo;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$OneClickLegalInfo;Lcom/yandex/plus/core/data/common/ColorPair;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_domain_repository_api_release", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$LegalInfo;", "component2", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$OneClickLegalInfo;", "component3", "()Lcom/yandex/plus/core/data/common/ColorPair;", "component4", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "copy", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$LegalInfo;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$OneClickLegalInfo;Lcom/yandex/plus/core/data/common/ColorPair;Lcom/yandex/plus/core/data/common/PlusThemedColor;)Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$LegalInfo;", "getLegalInfo", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$OneClickLegalInfo;", "getOneClickLegalInfo", "Lcom/yandex/plus/core/data/common/ColorPair;", "getTextColor", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getBackgroundColor", "Companion", "LegalInfo", "OneClickLegalInfo", "com/yandex/plus/home/repository/api/model/webconfig/e", "com/yandex/plus/home/repository/api/model/webconfig/d", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PayInfo implements Parcelable {
        private static final String LINK_PLACEHOLDER = "%%LINK%%";
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final LegalInfo legalInfo;
        private final OneClickLegalInfo oneClickLegalInfo;
        private final ColorPair textColor;
        public static final e Companion = new e();
        public static final Parcelable.Creator<PayInfo> CREATOR = new Creator();
        private static final i3y[] $childSerializers = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bmu0(22))};

        public /* synthetic */ PayInfo(int i, LegalInfo legalInfo, OneClickLegalInfo oneClickLegalInfo, ColorPair colorPair, PlusThemedColor plusThemedColor, psq0 psq0Var) {
            if (15 != (i & 15)) {
                qje.Z(i, 15, d.a.getDescriptor());
                throw null;
            }
            this.legalInfo = legalInfo;
            this.oneClickLegalInfo = oneClickLegalInfo;
            this.textColor = colorPair;
            this.backgroundColor = plusThemedColor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return PlusThemedColor.Companion.serializer(PlusColor.Companion.serializer());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PayInfo copy$default(PayInfo payInfo, LegalInfo legalInfo, OneClickLegalInfo oneClickLegalInfo, ColorPair colorPair, PlusThemedColor plusThemedColor, int i, Object obj) {
            if ((i & 1) != 0) {
                legalInfo = payInfo.legalInfo;
            }
            if ((i & 2) != 0) {
                oneClickLegalInfo = payInfo.oneClickLegalInfo;
            }
            if ((i & 4) != 0) {
                colorPair = payInfo.textColor;
            }
            if ((i & 8) != 0) {
                plusThemedColor = payInfo.backgroundColor;
            }
            return payInfo.copy(legalInfo, oneClickLegalInfo, colorPair, plusThemedColor);
        }

        public static final /* synthetic */ void write$Self$plus_home_domain_repository_api_release(PayInfo self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.g(serialDesc, 0, f.a, self.legalInfo);
            output.g(serialDesc, 1, h.a, self.oneClickLegalInfo);
            output.e(serialDesc, 2, sfc.a, self.textColor);
            output.e(serialDesc, 3, (KSerializer) i3yVarArr[3].getValue(), self.backgroundColor);
        }

        /* renamed from: component1, reason: from getter */
        public final LegalInfo getLegalInfo() {
            return this.legalInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final OneClickLegalInfo getOneClickLegalInfo() {
            return this.oneClickLegalInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final ColorPair getTextColor() {
            return this.textColor;
        }

        public final PlusThemedColor<PlusColor> component4() {
            return this.backgroundColor;
        }

        public final PayInfo copy(LegalInfo legalInfo, OneClickLegalInfo oneClickLegalInfo, ColorPair textColor, PlusThemedColor<PlusColor> backgroundColor) {
            return new PayInfo(legalInfo, oneClickLegalInfo, textColor, backgroundColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PayInfo)) {
                return false;
            }
            PayInfo payInfo = (PayInfo) other;
            return jl40.l(this.legalInfo, payInfo.legalInfo) && jl40.l(this.oneClickLegalInfo, payInfo.oneClickLegalInfo) && jl40.l(this.textColor, payInfo.textColor) && jl40.l(this.backgroundColor, payInfo.backgroundColor);
        }

        public final PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        public final LegalInfo getLegalInfo() {
            return this.legalInfo;
        }

        public final OneClickLegalInfo getOneClickLegalInfo() {
            return this.oneClickLegalInfo;
        }

        public final ColorPair getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            LegalInfo legalInfo = this.legalInfo;
            int hashCode = (legalInfo == null ? 0 : legalInfo.hashCode()) * 31;
            OneClickLegalInfo oneClickLegalInfo = this.oneClickLegalInfo;
            return this.backgroundColor.hashCode() + ((this.textColor.hashCode() + ((hashCode + (oneClickLegalInfo != null ? oneClickLegalInfo.hashCode() : 0)) * 31)) * 31);
        }

        public String toString() {
            return "PayInfo(legalInfo=" + this.legalInfo + ", oneClickLegalInfo=" + this.oneClickLegalInfo + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            LegalInfo legalInfo = this.legalInfo;
            if (legalInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                legalInfo.writeToParcel(dest, flags);
            }
            OneClickLegalInfo oneClickLegalInfo = this.oneClickLegalInfo;
            if (oneClickLegalInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                oneClickLegalInfo.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.textColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
        }

        @gsq0
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ$\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001d¨\u0006."}, d2 = {"Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$LegalInfo;", "Landroid/os/Parcelable;", "", "legalText", "legalUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_domain_repository_api_release", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$LegalInfo;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$LegalInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLegalText", "getLegalUrl", "Companion", "com/yandex/plus/home/repository/api/model/webconfig/f", "com/yandex/plus/home/repository/api/model/webconfig/g", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LegalInfo implements Parcelable {
            private final String legalText;
            private final String legalUrl;
            public static final g Companion = new g();
            public static final Parcelable.Creator<LegalInfo> CREATOR = new Creator();

            public /* synthetic */ LegalInfo(int i, String str, String str2, psq0 psq0Var) {
                if (3 != (i & 3)) {
                    qje.Z(i, 3, f.a.getDescriptor());
                    throw null;
                }
                this.legalText = str;
                this.legalUrl = str2;
            }

            public static /* synthetic */ LegalInfo copy$default(LegalInfo legalInfo, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = legalInfo.legalText;
                }
                if ((i & 2) != 0) {
                    str2 = legalInfo.legalUrl;
                }
                return legalInfo.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$plus_home_domain_repository_api_release(LegalInfo self, yjd output, SerialDescriptor serialDesc) {
                output.o(serialDesc, 0, self.legalText);
                output.o(serialDesc, 1, self.legalUrl);
            }

            /* renamed from: component1, reason: from getter */
            public final String getLegalText() {
                return this.legalText;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLegalUrl() {
                return this.legalUrl;
            }

            public final LegalInfo copy(String legalText, String legalUrl) {
                return new LegalInfo(legalText, legalUrl);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LegalInfo)) {
                    return false;
                }
                LegalInfo legalInfo = (LegalInfo) other;
                return jl40.l(this.legalText, legalInfo.legalText) && jl40.l(this.legalUrl, legalInfo.legalUrl);
            }

            public final String getLegalText() {
                return this.legalText;
            }

            public final String getLegalUrl() {
                return this.legalUrl;
            }

            public int hashCode() {
                return this.legalUrl.hashCode() + (this.legalText.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("LegalInfo(legalText=");
                sb.append(this.legalText);
                sb.append(", legalUrl=");
                return b64.p(sb, this.legalUrl, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.legalText);
                dest.writeString(this.legalUrl);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LegalInfo> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LegalInfo createFromParcel(Parcel parcel) {
                    return new LegalInfo(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LegalInfo[] newArray(int i) {
                    return new LegalInfo[i];
                }
            }

            public LegalInfo(String str, String str2) {
                this.legalText = str;
                this.legalUrl = str2;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001eR!\u00100\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R!\u00107\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b4\u0010/\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010\u001eR!\u0010;\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b8\u0010/\u0012\u0004\b:\u00103\u001a\u0004\b9\u0010\u001e¨\u0006?"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$OneClickLegalInfo;", "Landroid/os/Parcelable;", "", "template", "urlText", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_domain_repository_api_release", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$OneClickLegalInfo;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayInfo$OneClickLegalInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTemplate", "getUrlText", "getUrl", "isValid$delegate", "Li3y;", "isValid", "()Z", "isValid$annotations", "()V", "textBeforePlaceholder$delegate", "getTextBeforePlaceholder", "getTextBeforePlaceholder$annotations", "textBeforePlaceholder", "textAfterPlaceholder$delegate", "getTextAfterPlaceholder", "getTextAfterPlaceholder$annotations", "textAfterPlaceholder", "Companion", "com/yandex/plus/home/repository/api/model/webconfig/h", "com/yandex/plus/home/repository/api/model/webconfig/i", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OneClickLegalInfo implements Parcelable {

            /* renamed from: isValid$delegate, reason: from kotlin metadata */
            private final i3y isValid;
            private final String template;

            /* renamed from: textAfterPlaceholder$delegate, reason: from kotlin metadata */
            private final i3y textAfterPlaceholder;

            /* renamed from: textBeforePlaceholder$delegate, reason: from kotlin metadata */
            private final i3y textBeforePlaceholder;
            private final String url;
            private final String urlText;
            public static final i Companion = new i();
            public static final Parcelable.Creator<OneClickLegalInfo> CREATOR = new Creator();

            public /* synthetic */ OneClickLegalInfo(int i, String str, String str2, String str3, psq0 psq0Var) {
                if (7 != (i & 7)) {
                    qje.Z(i, 7, h.a.getDescriptor());
                    throw null;
                }
                this.template = str;
                this.urlText = str2;
                this.url = str3;
                final int i2 = 0;
                this.isValid = kotlin.a.a(new sls(this) { // from class: i0v0
                    public final /* synthetic */ SubscriptionConfiguration.PayInfo.OneClickLegalInfo b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        boolean _init_$lambda$3;
                        String _init_$lambda$4;
                        String _init_$lambda$5;
                        String textBeforePlaceholder_delegate$lambda$1;
                        String textAfterPlaceholder_delegate$lambda$2;
                        int i3 = i2;
                        SubscriptionConfiguration.PayInfo.OneClickLegalInfo oneClickLegalInfo = this.b;
                        switch (i3) {
                            case 0:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$3(oneClickLegalInfo);
                                break;
                            case 1:
                                _init_$lambda$4 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$4(oneClickLegalInfo);
                                return _init_$lambda$4;
                            case 2:
                                _init_$lambda$5 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$5(oneClickLegalInfo);
                                return _init_$lambda$5;
                            case 3:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.isValid_delegate$lambda$0(oneClickLegalInfo);
                                break;
                            case 4:
                                textBeforePlaceholder_delegate$lambda$1 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textBeforePlaceholder_delegate$lambda$1(oneClickLegalInfo);
                                return textBeforePlaceholder_delegate$lambda$1;
                            default:
                                textAfterPlaceholder_delegate$lambda$2 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textAfterPlaceholder_delegate$lambda$2(oneClickLegalInfo);
                                return textAfterPlaceholder_delegate$lambda$2;
                        }
                        return Boolean.valueOf(_init_$lambda$3);
                    }
                });
                final int i3 = 1;
                this.textBeforePlaceholder = kotlin.a.a(new sls(this) { // from class: i0v0
                    public final /* synthetic */ SubscriptionConfiguration.PayInfo.OneClickLegalInfo b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        boolean _init_$lambda$3;
                        String _init_$lambda$4;
                        String _init_$lambda$5;
                        String textBeforePlaceholder_delegate$lambda$1;
                        String textAfterPlaceholder_delegate$lambda$2;
                        int i32 = i3;
                        SubscriptionConfiguration.PayInfo.OneClickLegalInfo oneClickLegalInfo = this.b;
                        switch (i32) {
                            case 0:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$3(oneClickLegalInfo);
                                break;
                            case 1:
                                _init_$lambda$4 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$4(oneClickLegalInfo);
                                return _init_$lambda$4;
                            case 2:
                                _init_$lambda$5 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$5(oneClickLegalInfo);
                                return _init_$lambda$5;
                            case 3:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.isValid_delegate$lambda$0(oneClickLegalInfo);
                                break;
                            case 4:
                                textBeforePlaceholder_delegate$lambda$1 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textBeforePlaceholder_delegate$lambda$1(oneClickLegalInfo);
                                return textBeforePlaceholder_delegate$lambda$1;
                            default:
                                textAfterPlaceholder_delegate$lambda$2 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textAfterPlaceholder_delegate$lambda$2(oneClickLegalInfo);
                                return textAfterPlaceholder_delegate$lambda$2;
                        }
                        return Boolean.valueOf(_init_$lambda$3);
                    }
                });
                final int i4 = 2;
                this.textAfterPlaceholder = kotlin.a.a(new sls(this) { // from class: i0v0
                    public final /* synthetic */ SubscriptionConfiguration.PayInfo.OneClickLegalInfo b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        boolean _init_$lambda$3;
                        String _init_$lambda$4;
                        String _init_$lambda$5;
                        String textBeforePlaceholder_delegate$lambda$1;
                        String textAfterPlaceholder_delegate$lambda$2;
                        int i32 = i4;
                        SubscriptionConfiguration.PayInfo.OneClickLegalInfo oneClickLegalInfo = this.b;
                        switch (i32) {
                            case 0:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$3(oneClickLegalInfo);
                                break;
                            case 1:
                                _init_$lambda$4 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$4(oneClickLegalInfo);
                                return _init_$lambda$4;
                            case 2:
                                _init_$lambda$5 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$5(oneClickLegalInfo);
                                return _init_$lambda$5;
                            case 3:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.isValid_delegate$lambda$0(oneClickLegalInfo);
                                break;
                            case 4:
                                textBeforePlaceholder_delegate$lambda$1 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textBeforePlaceholder_delegate$lambda$1(oneClickLegalInfo);
                                return textBeforePlaceholder_delegate$lambda$1;
                            default:
                                textAfterPlaceholder_delegate$lambda$2 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textAfterPlaceholder_delegate$lambda$2(oneClickLegalInfo);
                                return textAfterPlaceholder_delegate$lambda$2;
                        }
                        return Boolean.valueOf(_init_$lambda$3);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean _init_$lambda$3(OneClickLegalInfo oneClickLegalInfo) {
                return evu0.y(oneClickLegalInfo.template, PayInfo.LINK_PLACEHOLDER, false) && !evu0.J(oneClickLegalInfo.urlText) && Patterns.WEB_URL.matcher(oneClickLegalInfo.url).matches();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String _init_$lambda$4(OneClickLegalInfo oneClickLegalInfo) {
                String str = oneClickLegalInfo.template;
                return evu0.g0(str, PayInfo.LINK_PLACEHOLDER, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String _init_$lambda$5(OneClickLegalInfo oneClickLegalInfo) {
                String str = oneClickLegalInfo.template;
                return evu0.d0(str, PayInfo.LINK_PLACEHOLDER, str);
            }

            public static /* synthetic */ OneClickLegalInfo copy$default(OneClickLegalInfo oneClickLegalInfo, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = oneClickLegalInfo.template;
                }
                if ((i & 2) != 0) {
                    str2 = oneClickLegalInfo.urlText;
                }
                if ((i & 4) != 0) {
                    str3 = oneClickLegalInfo.url;
                }
                return oneClickLegalInfo.copy(str, str2, str3);
            }

            public static /* synthetic */ void getTextAfterPlaceholder$annotations() {
            }

            public static /* synthetic */ void getTextBeforePlaceholder$annotations() {
            }

            public static /* synthetic */ void isValid$annotations() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean isValid_delegate$lambda$0(OneClickLegalInfo oneClickLegalInfo) {
                return evu0.y(oneClickLegalInfo.template, PayInfo.LINK_PLACEHOLDER, false) && !evu0.J(oneClickLegalInfo.urlText) && Patterns.WEB_URL.matcher(oneClickLegalInfo.url).matches();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String textAfterPlaceholder_delegate$lambda$2(OneClickLegalInfo oneClickLegalInfo) {
                String str = oneClickLegalInfo.template;
                return evu0.d0(str, PayInfo.LINK_PLACEHOLDER, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String textBeforePlaceholder_delegate$lambda$1(OneClickLegalInfo oneClickLegalInfo) {
                String str = oneClickLegalInfo.template;
                return evu0.g0(str, PayInfo.LINK_PLACEHOLDER, str);
            }

            public static final /* synthetic */ void write$Self$plus_home_domain_repository_api_release(OneClickLegalInfo self, yjd output, SerialDescriptor serialDesc) {
                output.o(serialDesc, 0, self.template);
                output.o(serialDesc, 1, self.urlText);
                output.o(serialDesc, 2, self.url);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTemplate() {
                return this.template;
            }

            /* renamed from: component2, reason: from getter */
            public final String getUrlText() {
                return this.urlText;
            }

            /* renamed from: component3, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final OneClickLegalInfo copy(String template, String urlText, String url) {
                return new OneClickLegalInfo(template, urlText, url);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OneClickLegalInfo)) {
                    return false;
                }
                OneClickLegalInfo oneClickLegalInfo = (OneClickLegalInfo) other;
                return jl40.l(this.template, oneClickLegalInfo.template) && jl40.l(this.urlText, oneClickLegalInfo.urlText) && jl40.l(this.url, oneClickLegalInfo.url);
            }

            public final String getTemplate() {
                return this.template;
            }

            public final String getTextAfterPlaceholder() {
                return (String) this.textAfterPlaceholder.getValue();
            }

            public final String getTextBeforePlaceholder() {
                return (String) this.textBeforePlaceholder.getValue();
            }

            public final String getUrl() {
                return this.url;
            }

            public final String getUrlText() {
                return this.urlText;
            }

            public int hashCode() {
                return this.url.hashCode() + unr0.b(this.template.hashCode() * 31, 31, this.urlText);
            }

            public final boolean isValid() {
                return ((Boolean) this.isValid.getValue()).booleanValue();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("OneClickLegalInfo(template=");
                sb.append(this.template);
                sb.append(", urlText=");
                sb.append(this.urlText);
                sb.append(", url=");
                return b64.p(sb, this.url, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.template);
                dest.writeString(this.urlText);
                dest.writeString(this.url);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OneClickLegalInfo> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OneClickLegalInfo createFromParcel(Parcel parcel) {
                    return new OneClickLegalInfo(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OneClickLegalInfo[] newArray(int i) {
                    return new OneClickLegalInfo[i];
                }
            }

            public OneClickLegalInfo(String str, String str2, String str3) {
                this.template = str;
                this.urlText = str2;
                this.url = str3;
                final int i = 3;
                this.isValid = kotlin.a.a(new sls(this) { // from class: i0v0
                    public final /* synthetic */ SubscriptionConfiguration.PayInfo.OneClickLegalInfo b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        boolean _init_$lambda$3;
                        String _init_$lambda$4;
                        String _init_$lambda$5;
                        String textBeforePlaceholder_delegate$lambda$1;
                        String textAfterPlaceholder_delegate$lambda$2;
                        int i32 = i;
                        SubscriptionConfiguration.PayInfo.OneClickLegalInfo oneClickLegalInfo = this.b;
                        switch (i32) {
                            case 0:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$3(oneClickLegalInfo);
                                break;
                            case 1:
                                _init_$lambda$4 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$4(oneClickLegalInfo);
                                return _init_$lambda$4;
                            case 2:
                                _init_$lambda$5 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$5(oneClickLegalInfo);
                                return _init_$lambda$5;
                            case 3:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.isValid_delegate$lambda$0(oneClickLegalInfo);
                                break;
                            case 4:
                                textBeforePlaceholder_delegate$lambda$1 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textBeforePlaceholder_delegate$lambda$1(oneClickLegalInfo);
                                return textBeforePlaceholder_delegate$lambda$1;
                            default:
                                textAfterPlaceholder_delegate$lambda$2 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textAfterPlaceholder_delegate$lambda$2(oneClickLegalInfo);
                                return textAfterPlaceholder_delegate$lambda$2;
                        }
                        return Boolean.valueOf(_init_$lambda$3);
                    }
                });
                final int i2 = 4;
                this.textBeforePlaceholder = kotlin.a.a(new sls(this) { // from class: i0v0
                    public final /* synthetic */ SubscriptionConfiguration.PayInfo.OneClickLegalInfo b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        boolean _init_$lambda$3;
                        String _init_$lambda$4;
                        String _init_$lambda$5;
                        String textBeforePlaceholder_delegate$lambda$1;
                        String textAfterPlaceholder_delegate$lambda$2;
                        int i32 = i2;
                        SubscriptionConfiguration.PayInfo.OneClickLegalInfo oneClickLegalInfo = this.b;
                        switch (i32) {
                            case 0:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$3(oneClickLegalInfo);
                                break;
                            case 1:
                                _init_$lambda$4 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$4(oneClickLegalInfo);
                                return _init_$lambda$4;
                            case 2:
                                _init_$lambda$5 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$5(oneClickLegalInfo);
                                return _init_$lambda$5;
                            case 3:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.isValid_delegate$lambda$0(oneClickLegalInfo);
                                break;
                            case 4:
                                textBeforePlaceholder_delegate$lambda$1 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textBeforePlaceholder_delegate$lambda$1(oneClickLegalInfo);
                                return textBeforePlaceholder_delegate$lambda$1;
                            default:
                                textAfterPlaceholder_delegate$lambda$2 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textAfterPlaceholder_delegate$lambda$2(oneClickLegalInfo);
                                return textAfterPlaceholder_delegate$lambda$2;
                        }
                        return Boolean.valueOf(_init_$lambda$3);
                    }
                });
                final int i3 = 5;
                this.textAfterPlaceholder = kotlin.a.a(new sls(this) { // from class: i0v0
                    public final /* synthetic */ SubscriptionConfiguration.PayInfo.OneClickLegalInfo b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        boolean _init_$lambda$3;
                        String _init_$lambda$4;
                        String _init_$lambda$5;
                        String textBeforePlaceholder_delegate$lambda$1;
                        String textAfterPlaceholder_delegate$lambda$2;
                        int i32 = i3;
                        SubscriptionConfiguration.PayInfo.OneClickLegalInfo oneClickLegalInfo = this.b;
                        switch (i32) {
                            case 0:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$3(oneClickLegalInfo);
                                break;
                            case 1:
                                _init_$lambda$4 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$4(oneClickLegalInfo);
                                return _init_$lambda$4;
                            case 2:
                                _init_$lambda$5 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo._init_$lambda$5(oneClickLegalInfo);
                                return _init_$lambda$5;
                            case 3:
                                _init_$lambda$3 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.isValid_delegate$lambda$0(oneClickLegalInfo);
                                break;
                            case 4:
                                textBeforePlaceholder_delegate$lambda$1 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textBeforePlaceholder_delegate$lambda$1(oneClickLegalInfo);
                                return textBeforePlaceholder_delegate$lambda$1;
                            default:
                                textAfterPlaceholder_delegate$lambda$2 = SubscriptionConfiguration.PayInfo.OneClickLegalInfo.textAfterPlaceholder_delegate$lambda$2(oneClickLegalInfo);
                                return textAfterPlaceholder_delegate$lambda$2;
                        }
                        return Boolean.valueOf(_init_$lambda$3);
                    }
                });
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PayInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PayInfo createFromParcel(Parcel parcel) {
                return new PayInfo(parcel.readInt() == 0 ? null : LegalInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OneClickLegalInfo.CREATOR.createFromParcel(parcel) : null, (ColorPair) parcel.readParcelable(PayInfo.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(PayInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PayInfo[] newArray(int i) {
                return new PayInfo[i];
            }
        }

        public PayInfo(LegalInfo legalInfo, OneClickLegalInfo oneClickLegalInfo, ColorPair colorPair, PlusThemedColor<PlusColor> plusThemedColor) {
            this.legalInfo = legalInfo;
            this.oneClickLegalInfo = oneClickLegalInfo;
            this.textColor = colorPair;
            this.backgroundColor = plusThemedColor;
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0006KLMNOPBG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Be\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b3\u00104J^\u00105\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b7\u00102J\u0010\u00108\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b8\u0010!J\u001a\u0010;\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b\u0006\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u00100R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u00104¨\u0006Q"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription;", "Landroid/os/Parcelable;", "", "", "features", "", "isSilentPaymentEnabled", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$ButtonType;", "buttonType", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$PaymentMethod;", "paymentMethod", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$WidgetType;", "widgetType", "targetId", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$AcquisitionParams;", "acquisitionParams", "<init>", "(Ljava/util/List;ZLcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$ButtonType;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$PaymentMethod;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$WidgetType;Ljava/lang/String;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$AcquisitionParams;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/util/List;ZLcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$ButtonType;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$PaymentMethod;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$WidgetType;Ljava/lang/String;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$AcquisitionParams;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_domain_repository_api_release", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$ButtonType;", "component4", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$PaymentMethod;", "component5", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$WidgetType;", "component6", "()Ljava/lang/String;", "component7", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$AcquisitionParams;", "copy", "(Ljava/util/List;ZLcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$ButtonType;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$PaymentMethod;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$WidgetType;Ljava/lang/String;Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$AcquisitionParams;)Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFeatures", "Z", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$ButtonType;", "getButtonType", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$PaymentMethod;", "getPaymentMethod", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$WidgetType;", "getWidgetType", "Ljava/lang/String;", "getTargetId", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$AcquisitionParams;", "getAcquisitionParams", "Companion", "ButtonType", "PaymentMethod", "WidgetType", "AcquisitionParams", "com/yandex/plus/home/repository/api/model/webconfig/j", "com/yandex/plus/home/repository/api/model/webconfig/m", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Subscription implements Parcelable {
        private static final i3y[] $childSerializers;
        private final AcquisitionParams acquisitionParams;
        private final ButtonType buttonType;
        private final List<String> features;
        private final boolean isSilentPaymentEnabled;
        private final PaymentMethod paymentMethod;
        private final String targetId;
        private final WidgetType widgetType;
        public static final m Companion = new m();
        public static final Parcelable.Creator<Subscription> CREATOR = new Creator();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$ButtonType;", "", "NATIVE", "WEB", "UNKNOWN", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ButtonType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ ButtonType[] $VALUES;
            public static final ButtonType NATIVE;
            public static final ButtonType UNKNOWN;
            public static final ButtonType WEB;

            static {
                ButtonType buttonType = new ButtonType("NATIVE", 0);
                NATIVE = buttonType;
                ButtonType buttonType2 = new ButtonType("WEB", 1);
                WEB = buttonType2;
                ButtonType buttonType3 = new ButtonType("UNKNOWN", 2);
                UNKNOWN = buttonType3;
                ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3};
                $VALUES = buttonTypeArr;
                $ENTRIES = kotlin.enums.a.a(buttonTypeArr);
            }

            public static ButtonType valueOf(String str) {
                return (ButtonType) Enum.valueOf(ButtonType.class, str);
            }

            public static ButtonType[] values() {
                return (ButtonType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$PaymentMethod;", "", "NATIVE", "IN_APP", "UNKNOWN", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PaymentMethod {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ PaymentMethod[] $VALUES;
            public static final PaymentMethod IN_APP;
            public static final PaymentMethod NATIVE;
            public static final PaymentMethod UNKNOWN;

            static {
                PaymentMethod paymentMethod = new PaymentMethod("NATIVE", 0);
                NATIVE = paymentMethod;
                PaymentMethod paymentMethod2 = new PaymentMethod("IN_APP", 1);
                IN_APP = paymentMethod2;
                PaymentMethod paymentMethod3 = new PaymentMethod("UNKNOWN", 2);
                UNKNOWN = paymentMethod3;
                PaymentMethod[] paymentMethodArr = {paymentMethod, paymentMethod2, paymentMethod3};
                $VALUES = paymentMethodArr;
                $ENTRIES = kotlin.enums.a.a(paymentMethodArr);
            }

            public static PaymentMethod valueOf(String str) {
                return (PaymentMethod) Enum.valueOf(PaymentMethod.class, str);
            }

            public static PaymentMethod[] values() {
                return (PaymentMethod[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$WidgetType;", "", "NATIVE_WIDGET", "WEB_WIDGET", "HOST", "ACQUISITION_PLATFORM", "UNKNOWN", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class WidgetType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ WidgetType[] $VALUES;
            public static final WidgetType ACQUISITION_PLATFORM;
            public static final WidgetType HOST;
            public static final WidgetType NATIVE_WIDGET;
            public static final WidgetType UNKNOWN;
            public static final WidgetType WEB_WIDGET;

            static {
                WidgetType widgetType = new WidgetType("NATIVE_WIDGET", 0);
                NATIVE_WIDGET = widgetType;
                WidgetType widgetType2 = new WidgetType("WEB_WIDGET", 1);
                WEB_WIDGET = widgetType2;
                WidgetType widgetType3 = new WidgetType("HOST", 2);
                HOST = widgetType3;
                WidgetType widgetType4 = new WidgetType("ACQUISITION_PLATFORM", 3);
                ACQUISITION_PLATFORM = widgetType4;
                WidgetType widgetType5 = new WidgetType("UNKNOWN", 4);
                UNKNOWN = widgetType5;
                WidgetType[] widgetTypeArr = {widgetType, widgetType2, widgetType3, widgetType4, widgetType5};
                $VALUES = widgetTypeArr;
                $ENTRIES = kotlin.enums.a.a(widgetTypeArr);
            }

            public static WidgetType valueOf(String str) {
                return (WidgetType) Enum.valueOf(WidgetType.class, str);
            }

            public static WidgetType[] values() {
                return (WidgetType[]) $VALUES.clone();
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new bmu0(23)), null, kotlin.a.b(lazyThreadSafetyMode, new bmu0(24)), kotlin.a.b(lazyThreadSafetyMode, new bmu0(25)), kotlin.a.b(lazyThreadSafetyMode, new bmu0(26)), null, null};
        }

        public /* synthetic */ Subscription(int i, List list, boolean z, ButtonType buttonType, PaymentMethod paymentMethod, WidgetType widgetType, String str, AcquisitionParams acquisitionParams, psq0 psq0Var) {
            if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
                qje.Z(i, HProv.PP_VERSION_TIMESTAMP, j.a.getDescriptor());
                throw null;
            }
            this.features = list;
            this.isSilentPaymentEnabled = z;
            this.buttonType = buttonType;
            this.paymentMethod = paymentMethod;
            this.widgetType = widgetType;
            this.targetId = str;
            this.acquisitionParams = acquisitionParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new p53(auu0.a, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_$0() {
            return new o4o("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.Subscription.ButtonType", (Enum[]) ButtonType.values());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_$1() {
            return new o4o("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.Subscription.PaymentMethod", (Enum[]) PaymentMethod.values());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_$2() {
            return new o4o("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.Subscription.WidgetType", (Enum[]) WidgetType.values());
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, List list, boolean z, ButtonType buttonType, PaymentMethod paymentMethod, WidgetType widgetType, String str, AcquisitionParams acquisitionParams, int i, Object obj) {
            if ((i & 1) != 0) {
                list = subscription.features;
            }
            if ((i & 2) != 0) {
                z = subscription.isSilentPaymentEnabled;
            }
            if ((i & 4) != 0) {
                buttonType = subscription.buttonType;
            }
            if ((i & 8) != 0) {
                paymentMethod = subscription.paymentMethod;
            }
            if ((i & 16) != 0) {
                widgetType = subscription.widgetType;
            }
            if ((i & 32) != 0) {
                str = subscription.targetId;
            }
            if ((i & 64) != 0) {
                acquisitionParams = subscription.acquisitionParams;
            }
            String str2 = str;
            AcquisitionParams acquisitionParams2 = acquisitionParams;
            WidgetType widgetType2 = widgetType;
            ButtonType buttonType2 = buttonType;
            return subscription.copy(list, z, buttonType2, paymentMethod, widgetType2, str2, acquisitionParams2);
        }

        public static final /* synthetic */ void write$Self$plus_home_domain_repository_api_release(Subscription self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.e(serialDesc, 0, (KSerializer) i3yVarArr[0].getValue(), self.features);
            output.n(serialDesc, 1, self.isSilentPaymentEnabled);
            output.e(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.buttonType);
            output.e(serialDesc, 3, (KSerializer) i3yVarArr[3].getValue(), self.paymentMethod);
            output.e(serialDesc, 4, (KSerializer) i3yVarArr[4].getValue(), self.widgetType);
            output.o(serialDesc, 5, self.targetId);
            output.g(serialDesc, 6, k.a, self.acquisitionParams);
        }

        public final List<String> component1() {
            return this.features;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSilentPaymentEnabled() {
            return this.isSilentPaymentEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonType getButtonType() {
            return this.buttonType;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component5, reason: from getter */
        public final WidgetType getWidgetType() {
            return this.widgetType;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTargetId() {
            return this.targetId;
        }

        /* renamed from: component7, reason: from getter */
        public final AcquisitionParams getAcquisitionParams() {
            return this.acquisitionParams;
        }

        public final Subscription copy(List<String> features, boolean isSilentPaymentEnabled, ButtonType buttonType, PaymentMethod paymentMethod, WidgetType widgetType, String targetId, AcquisitionParams acquisitionParams) {
            return new Subscription(features, isSilentPaymentEnabled, buttonType, paymentMethod, widgetType, targetId, acquisitionParams);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) other;
            return jl40.l(this.features, subscription.features) && this.isSilentPaymentEnabled == subscription.isSilentPaymentEnabled && this.buttonType == subscription.buttonType && this.paymentMethod == subscription.paymentMethod && this.widgetType == subscription.widgetType && jl40.l(this.targetId, subscription.targetId) && jl40.l(this.acquisitionParams, subscription.acquisitionParams);
        }

        public final AcquisitionParams getAcquisitionParams() {
            return this.acquisitionParams;
        }

        public final ButtonType getButtonType() {
            return this.buttonType;
        }

        public final List<String> getFeatures() {
            return this.features;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final String getTargetId() {
            return this.targetId;
        }

        public final WidgetType getWidgetType() {
            return this.widgetType;
        }

        public int hashCode() {
            int b = unr0.b((this.widgetType.hashCode() + ((this.paymentMethod.hashCode() + ((this.buttonType.hashCode() + unr0.e(this.features.hashCode() * 31, 31, this.isSilentPaymentEnabled)) * 31)) * 31)) * 31, 31, this.targetId);
            AcquisitionParams acquisitionParams = this.acquisitionParams;
            return b + (acquisitionParams == null ? 0 : acquisitionParams.hashCode());
        }

        public final boolean isSilentPaymentEnabled() {
            return this.isSilentPaymentEnabled;
        }

        public String toString() {
            return "Subscription(features=" + this.features + ", isSilentPaymentEnabled=" + this.isSilentPaymentEnabled + ", buttonType=" + this.buttonType + ", paymentMethod=" + this.paymentMethod + ", widgetType=" + this.widgetType + ", targetId=" + this.targetId + ", acquisitionParams=" + this.acquisitionParams + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeStringList(this.features);
            dest.writeInt(this.isSilentPaymentEnabled ? 1 : 0);
            dest.writeString(this.buttonType.name());
            dest.writeString(this.paymentMethod.name());
            dest.writeString(this.widgetType.name());
            dest.writeString(this.targetId);
            AcquisitionParams acquisitionParams = this.acquisitionParams;
            if (acquisitionParams == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                acquisitionParams.writeToParcel(dest, flags);
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J@\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010 R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\"R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010$¨\u00067"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$AcquisitionParams;", "Landroid/os/Parcelable;", "", Constants.KEY_PAGE, "", "places", "", "restrictions", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Set;Ljava/util/Map;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_domain_repository_api_release", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$AcquisitionParams;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Set;", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;)Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$AcquisitionParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPage", "Ljava/util/Set;", "getPlaces", "Ljava/util/Map;", "getRestrictions", "Companion", "com/yandex/plus/home/repository/api/model/webconfig/k", "com/yandex/plus/home/repository/api/model/webconfig/l", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AcquisitionParams implements Parcelable {
            private static final i3y[] $childSerializers;
            private final String page;
            private final Set<String> places;
            private final Map<String, String> restrictions;
            public static final l Companion = new l();
            public static final Parcelable.Creator<AcquisitionParams> CREATOR = new Creator();

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                $childSerializers = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new bmu0(27)), kotlin.a.b(lazyThreadSafetyMode, new bmu0(28))};
            }

            public /* synthetic */ AcquisitionParams(int i, String str, Set set, Map map, psq0 psq0Var) {
                if (7 != (i & 7)) {
                    qje.Z(i, 7, k.a.getDescriptor());
                    throw null;
                }
                this.page = str;
                this.places = set;
                this.restrictions = map;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new p53(auu0.a, 1);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AcquisitionParams copy$default(AcquisitionParams acquisitionParams, String str, Set set, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = acquisitionParams.page;
                }
                if ((i & 2) != 0) {
                    set = acquisitionParams.places;
                }
                if ((i & 4) != 0) {
                    map = acquisitionParams.restrictions;
                }
                return acquisitionParams.copy(str, set, map);
            }

            public static final /* synthetic */ void write$Self$plus_home_domain_repository_api_release(AcquisitionParams self, yjd output, SerialDescriptor serialDesc) {
                i3y[] i3yVarArr = $childSerializers;
                output.o(serialDesc, 0, self.page);
                output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.places);
                output.e(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.restrictions);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPage() {
                return this.page;
            }

            public final Set<String> component2() {
                return this.places;
            }

            public final Map<String, String> component3() {
                return this.restrictions;
            }

            public final AcquisitionParams copy(String page, Set<String> places, Map<String, String> restrictions) {
                return new AcquisitionParams(page, places, restrictions);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AcquisitionParams)) {
                    return false;
                }
                AcquisitionParams acquisitionParams = (AcquisitionParams) other;
                return jl40.l(this.page, acquisitionParams.page) && jl40.l(this.places, acquisitionParams.places) && jl40.l(this.restrictions, acquisitionParams.restrictions);
            }

            public final String getPage() {
                return this.page;
            }

            public final Set<String> getPlaces() {
                return this.places;
            }

            public final Map<String, String> getRestrictions() {
                return this.restrictions;
            }

            public int hashCode() {
                return this.restrictions.hashCode() + g8e.e(this.places, this.page.hashCode() * 31, 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("AcquisitionParams(page=");
                sb.append(this.page);
                sb.append(", places=");
                sb.append(this.places);
                sb.append(", restrictions=");
                return smw0.n(sb, this.restrictions, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.page);
                Set<String> set = this.places;
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
                Iterator x = qv10.x(this.restrictions, dest);
                while (x.hasNext()) {
                    Map.Entry entry = (Map.Entry) x.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AcquisitionParams> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AcquisitionParams createFromParcel(Parcel parcel) {
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    int i = 0;
                    for (int i2 = 0; i2 != readInt; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    int readInt2 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                    while (i != readInt2) {
                        i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                    }
                    return new AcquisitionParams(readString, linkedHashSet, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AcquisitionParams[] newArray(int i) {
                    return new AcquisitionParams[i];
                }
            }

            public AcquisitionParams(String str, Set<String> set, Map<String, String> map) {
                this.page = str;
                this.places = set;
                this.restrictions = map;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Subscription> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Subscription createFromParcel(Parcel parcel) {
                return new Subscription(parcel.createStringArrayList(), parcel.readInt() != 0, ButtonType.valueOf(parcel.readString()), PaymentMethod.valueOf(parcel.readString()), WidgetType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : AcquisitionParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Subscription[] newArray(int i) {
                return new Subscription[i];
            }
        }

        public Subscription(List<String> list, boolean z, ButtonType buttonType, PaymentMethod paymentMethod, WidgetType widgetType, String str, AcquisitionParams acquisitionParams) {
            this.features = list;
            this.isSilentPaymentEnabled = z;
            this.buttonType = buttonType;
            this.paymentMethod = paymentMethod;
            this.widgetType = widgetType;
            this.targetId = str;
            this.acquisitionParams = acquisitionParams;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nBO\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010$JJ\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010$R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010$¨\u00068"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayButton;", "Landroid/os/Parcelable;", "", "trialText", "noTrialText", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "textColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_domain_repository_api_release", "(Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayButton;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;)Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$PayButton;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTrialText", "getNoTrialText", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTextColor", "getBackgroundColor", "Companion", "com/yandex/plus/home/repository/api/model/webconfig/b", "com/yandex/plus/home/repository/api/model/webconfig/c", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayButton implements Parcelable {
        private static final i3y[] $childSerializers;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final String noTrialText;
        private final PlusThemedColor<PlusColor> textColor;
        private final String trialText;
        public static final c Companion = new c();
        public static final Parcelable.Creator<PayButton> CREATOR = new Creator();

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new bmu0(20)), kotlin.a.b(lazyThreadSafetyMode, new bmu0(21))};
        }

        public /* synthetic */ PayButton(int i, String str, String str2, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, psq0 psq0Var) {
            if (15 != (i & 15)) {
                qje.Z(i, 15, b.a.getDescriptor());
                throw null;
            }
            this.trialText = str;
            this.noTrialText = str2;
            this.textColor = plusThemedColor;
            this.backgroundColor = plusThemedColor2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return PlusThemedColor.Companion.serializer(PlusColor.Companion.serializer());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return PlusThemedColor.Companion.serializer(PlusColor.Companion.serializer());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PayButton copy$default(PayButton payButton, String str, String str2, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payButton.trialText;
            }
            if ((i & 2) != 0) {
                str2 = payButton.noTrialText;
            }
            if ((i & 4) != 0) {
                plusThemedColor = payButton.textColor;
            }
            if ((i & 8) != 0) {
                plusThemedColor2 = payButton.backgroundColor;
            }
            return payButton.copy(str, str2, plusThemedColor, plusThemedColor2);
        }

        public static final /* synthetic */ void write$Self$plus_home_domain_repository_api_release(PayButton self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            auu0 auu0Var = auu0.a;
            output.g(serialDesc, 0, auu0Var, self.trialText);
            output.g(serialDesc, 1, auu0Var, self.noTrialText);
            output.e(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.textColor);
            output.g(serialDesc, 3, (KSerializer) i3yVarArr[3].getValue(), self.backgroundColor);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTrialText() {
            return this.trialText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNoTrialText() {
            return this.noTrialText;
        }

        public final PlusThemedColor<PlusColor> component3() {
            return this.textColor;
        }

        public final PlusThemedColor<PlusColor> component4() {
            return this.backgroundColor;
        }

        public final PayButton copy(String trialText, String noTrialText, PlusThemedColor<PlusColor> textColor, PlusThemedColor<PlusColor> backgroundColor) {
            return new PayButton(trialText, noTrialText, textColor, backgroundColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PayButton)) {
                return false;
            }
            PayButton payButton = (PayButton) other;
            return jl40.l(this.trialText, payButton.trialText) && jl40.l(this.noTrialText, payButton.noTrialText) && jl40.l(this.textColor, payButton.textColor) && jl40.l(this.backgroundColor, payButton.backgroundColor);
        }

        public final PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getNoTrialText() {
            return this.noTrialText;
        }

        public final PlusThemedColor<PlusColor> getTextColor() {
            return this.textColor;
        }

        public final String getTrialText() {
            return this.trialText;
        }

        public int hashCode() {
            String str = this.trialText;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.noTrialText;
            int c = vfc.c(this.textColor, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            PlusThemedColor<PlusColor> plusThemedColor = this.backgroundColor;
            return c + (plusThemedColor != null ? plusThemedColor.hashCode() : 0);
        }

        public String toString() {
            return "PayButton(trialText=" + this.trialText + ", noTrialText=" + this.noTrialText + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.trialText);
            dest.writeString(this.noTrialText);
            dest.writeParcelable(this.textColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PayButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PayButton createFromParcel(Parcel parcel) {
                return new PayButton(parcel.readString(), parcel.readString(), (PlusThemedColor) parcel.readParcelable(PayButton.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(PayButton.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PayButton[] newArray(int i) {
                return new PayButton[i];
            }
        }

        public PayButton(String str, String str2, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2) {
            this.trialText = str;
            this.noTrialText = str2;
            this.textColor = plusThemedColor;
            this.backgroundColor = plusThemedColor2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SubscriptionConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubscriptionConfiguration createFromParcel(Parcel parcel) {
            return new SubscriptionConfiguration(parcel.readString(), parcel.readString(), Subscription.CREATOR.createFromParcel(parcel), PayInfo.CREATOR.createFromParcel(parcel), PayButton.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubscriptionConfiguration[] newArray(int i) {
            return new SubscriptionConfiguration[i];
        }
    }

    public SubscriptionConfiguration(String str, String str2, Subscription subscription, PayInfo payInfo, PayButton payButton) {
        this.name = str;
        this.id = str2;
        this.subscription = subscription;
        this.payInfo = payInfo;
        this.payButton = payButton;
        final int i = 1;
        this.isSilentPaymentEnabled = kotlin.a.a(new sls(this) { // from class: g0v0
            public final /* synthetic */ SubscriptionConfiguration b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                boolean _init_$lambda$1;
                int i3 = i;
                SubscriptionConfiguration subscriptionConfiguration = this.b;
                switch (i3) {
                    case 0:
                        _init_$lambda$1 = SubscriptionConfiguration._init_$lambda$1(subscriptionConfiguration);
                        break;
                    default:
                        _init_$lambda$1 = SubscriptionConfiguration.isSilentPaymentEnabled_delegate$lambda$0(subscriptionConfiguration);
                        break;
                }
                return Boolean.valueOf(_init_$lambda$1);
            }
        });
    }
}
