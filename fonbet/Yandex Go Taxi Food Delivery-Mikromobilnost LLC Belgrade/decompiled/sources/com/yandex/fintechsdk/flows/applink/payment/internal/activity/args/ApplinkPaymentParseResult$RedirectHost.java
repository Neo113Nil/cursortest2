package com.yandex.fintechsdk.flows.applink.payment.internal.activity.args;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.jl40;
import defpackage.n23;
import defpackage.o23;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001+B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"com/yandex/fintechsdk/flows/applink/payment/internal/activity/args/ApplinkPaymentParseResult$RedirectHost", "Lo23;", "Landroid/os/Parcelable;", "", "appLink", "Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;", WebViewActivity.KEY_ENVIRONMENT, "Lcom/yandex/fintechsdk/entities/region/Region;", "region", "<init>", "(Ljava/lang/String;Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;Lcom/yandex/fintechsdk/entities/region/Region;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;", "component3", "()Lcom/yandex/fintechsdk/entities/region/Region;", "Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/args/ApplinkPaymentParseResult$RedirectHost;", "copy", "(Ljava/lang/String;Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;Lcom/yandex/fintechsdk/entities/region/Region;)Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/args/ApplinkPaymentParseResult$RedirectHost;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppLink", "Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;", "getEnvironment", "Lcom/yandex/fintechsdk/entities/region/Region;", "getRegion", "Companion", "n23", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ApplinkPaymentParseResult$RedirectHost implements o23, Parcelable {
    public static final String PATH_PREFIX = "/redirect-host";
    private final String appLink;
    private final PayEnvironment environment;
    private final Region region;
    public static final n23 Companion = new n23();
    public static final Parcelable.Creator<ApplinkPaymentParseResult$RedirectHost> CREATOR = new Creator();

    public ApplinkPaymentParseResult$RedirectHost(String str, PayEnvironment payEnvironment, Region region) {
        this.appLink = str;
        this.environment = payEnvironment;
        this.region = region;
    }

    public static /* synthetic */ ApplinkPaymentParseResult$RedirectHost copy$default(ApplinkPaymentParseResult$RedirectHost applinkPaymentParseResult$RedirectHost, String str, PayEnvironment payEnvironment, Region region, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applinkPaymentParseResult$RedirectHost.appLink;
        }
        if ((i & 2) != 0) {
            payEnvironment = applinkPaymentParseResult$RedirectHost.environment;
        }
        if ((i & 4) != 0) {
            region = applinkPaymentParseResult$RedirectHost.region;
        }
        return applinkPaymentParseResult$RedirectHost.copy(str, payEnvironment, region);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppLink() {
        return this.appLink;
    }

    /* renamed from: component2, reason: from getter */
    public final PayEnvironment getEnvironment() {
        return this.environment;
    }

    /* renamed from: component3, reason: from getter */
    public final Region getRegion() {
        return this.region;
    }

    public final ApplinkPaymentParseResult$RedirectHost copy(String appLink, PayEnvironment environment, Region region) {
        return new ApplinkPaymentParseResult$RedirectHost(appLink, environment, region);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplinkPaymentParseResult$RedirectHost)) {
            return false;
        }
        ApplinkPaymentParseResult$RedirectHost applinkPaymentParseResult$RedirectHost = (ApplinkPaymentParseResult$RedirectHost) other;
        return jl40.l(this.appLink, applinkPaymentParseResult$RedirectHost.appLink) && this.environment == applinkPaymentParseResult$RedirectHost.environment && this.region == applinkPaymentParseResult$RedirectHost.region;
    }

    public final String getAppLink() {
        return this.appLink;
    }

    public final PayEnvironment getEnvironment() {
        return this.environment;
    }

    public final Region getRegion() {
        return this.region;
    }

    public int hashCode() {
        return this.region.hashCode() + ((this.environment.hashCode() + (this.appLink.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "RedirectHost(appLink=" + this.appLink + ", environment=" + this.environment + ", region=" + this.region + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.appLink);
        dest.writeString(this.environment.name());
        dest.writeString(this.region.name());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ApplinkPaymentParseResult$RedirectHost> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApplinkPaymentParseResult$RedirectHost createFromParcel(Parcel parcel) {
            return new ApplinkPaymentParseResult$RedirectHost(parcel.readString(), PayEnvironment.valueOf(parcel.readString()), Region.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApplinkPaymentParseResult$RedirectHost[] newArray(int i) {
            return new ApplinkPaymentParseResult$RedirectHost[i];
        }
    }
}
