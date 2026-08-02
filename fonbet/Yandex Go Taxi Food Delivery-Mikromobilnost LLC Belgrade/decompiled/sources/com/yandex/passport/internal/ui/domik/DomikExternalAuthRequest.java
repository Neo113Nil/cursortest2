package com.yandex.passport.internal.ui.domik;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.SocialConfiguration;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/DomikExternalAuthRequest;", "Landroid/os/Parcelable;", "Social", "SamlSso", "Lcom/yandex/passport/internal/ui/domik/DomikExternalAuthRequest$SamlSso;", "Lcom/yandex/passport/internal/ui/domik/DomikExternalAuthRequest$Social;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DomikExternalAuthRequest extends Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/DomikExternalAuthRequest$SamlSso;", "Lcom/yandex/passport/internal/ui/domik/DomikExternalAuthRequest;", "", "authUrl", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/passport/internal/ui/domik/DomikExternalAuthRequest$SamlSso;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAuthUrl", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SamlSso implements DomikExternalAuthRequest {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SamlSso> CREATOR = new Creator();
        private final String authUrl;

        public SamlSso(String str) {
            this.authUrl = str;
        }

        public static /* synthetic */ SamlSso copy$default(SamlSso samlSso, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = samlSso.authUrl;
            }
            return samlSso.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAuthUrl() {
            return this.authUrl;
        }

        public final SamlSso copy(String authUrl) {
            return new SamlSso(authUrl);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SamlSso) && jl40.l(this.authUrl, ((SamlSso) other).authUrl);
        }

        public final String getAuthUrl() {
            return this.authUrl;
        }

        public int hashCode() {
            return this.authUrl.hashCode();
        }

        public String toString() {
            return b64.p(new StringBuilder("SamlSso(authUrl="), this.authUrl, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.authUrl);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SamlSso> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SamlSso createFromParcel(Parcel parcel) {
                return new SamlSso(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SamlSso[] newArray(int i) {
                return new SamlSso[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/DomikExternalAuthRequest$Social;", "Lcom/yandex/passport/internal/ui/domik/DomikExternalAuthRequest;", "Lcom/yandex/passport/internal/SocialConfiguration;", "socialConfig", "<init>", "(Lcom/yandex/passport/internal/SocialConfiguration;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/SocialConfiguration;", "copy", "(Lcom/yandex/passport/internal/SocialConfiguration;)Lcom/yandex/passport/internal/ui/domik/DomikExternalAuthRequest$Social;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/SocialConfiguration;", "getSocialConfig", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Social implements DomikExternalAuthRequest {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Social> CREATOR = new Creator();
        private final SocialConfiguration socialConfig;

        public Social(SocialConfiguration socialConfiguration) {
            this.socialConfig = socialConfiguration;
        }

        public static /* synthetic */ Social copy$default(Social social, SocialConfiguration socialConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                socialConfiguration = social.socialConfig;
            }
            return social.copy(socialConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final SocialConfiguration getSocialConfig() {
            return this.socialConfig;
        }

        public final Social copy(SocialConfiguration socialConfig) {
            return new Social(socialConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Social) && jl40.l(this.socialConfig, ((Social) other).socialConfig);
        }

        public final SocialConfiguration getSocialConfig() {
            return this.socialConfig;
        }

        public int hashCode() {
            return this.socialConfig.hashCode();
        }

        public String toString() {
            return "Social(socialConfig=" + this.socialConfig + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.socialConfig.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Social> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Social createFromParcel(Parcel parcel) {
                return new Social(SocialConfiguration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Social[] newArray(int i) {
                return new Social[i];
            }
        }
    }
}
