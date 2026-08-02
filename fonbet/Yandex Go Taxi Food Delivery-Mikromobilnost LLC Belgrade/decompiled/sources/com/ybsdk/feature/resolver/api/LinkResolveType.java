package com.ybsdk.feature.resolver.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/resolver/api/LinkResolveType;", "Landroid/os/Parcelable;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "OnboardingDeeplink", "ShortLink", "LandingFromStartSession", "Lcom/ybsdk/feature/resolver/api/LinkResolveType$LandingFromStartSession;", "Lcom/ybsdk/feature/resolver/api/LinkResolveType$OnboardingDeeplink;", "Lcom/ybsdk/feature/resolver/api/LinkResolveType$ShortLink;", "feature-link-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class LinkResolveType implements Parcelable {
    private final String url;

    private LinkResolveType(String str) {
        this.url = str;
    }

    public final String getUrl() {
        return this.url;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/resolver/api/LinkResolveType$LandingFromStartSession;", "Lcom/ybsdk/feature/resolver/api/LinkResolveType;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "feature-link-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LandingFromStartSession extends LinkResolveType {
        public static final LandingFromStartSession INSTANCE = new LandingFromStartSession();
        public static final Parcelable.Creator<LandingFromStartSession> CREATOR = new Creator();

        private LandingFromStartSession() {
            super("registration_landing", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LandingFromStartSession> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LandingFromStartSession createFromParcel(Parcel parcel) {
                parcel.readInt();
                return LandingFromStartSession.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LandingFromStartSession[] newArray(int i) {
                return new LandingFromStartSession[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/resolver/api/LinkResolveType$OnboardingDeeplink;", "Lcom/ybsdk/feature/resolver/api/LinkResolveType;", "", "onboardingUrl", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/resolver/api/LinkResolveType$OnboardingDeeplink;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOnboardingUrl", "feature-link-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnboardingDeeplink extends LinkResolveType {
        public static final Parcelable.Creator<OnboardingDeeplink> CREATOR = new Creator();
        private final String onboardingUrl;

        public OnboardingDeeplink(String str) {
            super(str, null);
            this.onboardingUrl = str;
        }

        public static /* synthetic */ OnboardingDeeplink copy$default(OnboardingDeeplink onboardingDeeplink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onboardingDeeplink.onboardingUrl;
            }
            return onboardingDeeplink.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOnboardingUrl() {
            return this.onboardingUrl;
        }

        public final OnboardingDeeplink copy(String onboardingUrl) {
            return new OnboardingDeeplink(onboardingUrl);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnboardingDeeplink) && jl40.l(this.onboardingUrl, ((OnboardingDeeplink) other).onboardingUrl);
        }

        public final String getOnboardingUrl() {
            return this.onboardingUrl;
        }

        public int hashCode() {
            return this.onboardingUrl.hashCode();
        }

        public String toString() {
            return oyr.p("OnboardingDeeplink(onboardingUrl=", this.onboardingUrl, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.onboardingUrl);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OnboardingDeeplink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnboardingDeeplink createFromParcel(Parcel parcel) {
                return new OnboardingDeeplink(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnboardingDeeplink[] newArray(int i) {
                return new OnboardingDeeplink[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/resolver/api/LinkResolveType$ShortLink;", "Lcom/ybsdk/feature/resolver/api/LinkResolveType;", "", "shortUrl", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/resolver/api/LinkResolveType$ShortLink;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShortUrl", "feature-link-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShortLink extends LinkResolveType {
        public static final Parcelable.Creator<ShortLink> CREATOR = new Creator();
        private final String shortUrl;

        public ShortLink(String str) {
            super(str, null);
            this.shortUrl = str;
        }

        public static /* synthetic */ ShortLink copy$default(ShortLink shortLink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shortLink.shortUrl;
            }
            return shortLink.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getShortUrl() {
            return this.shortUrl;
        }

        public final ShortLink copy(String shortUrl) {
            return new ShortLink(shortUrl);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShortLink) && jl40.l(this.shortUrl, ((ShortLink) other).shortUrl);
        }

        public final String getShortUrl() {
            return this.shortUrl;
        }

        public int hashCode() {
            return this.shortUrl.hashCode();
        }

        public String toString() {
            return oyr.p("ShortLink(shortUrl=", this.shortUrl, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.shortUrl);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShortLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShortLink createFromParcel(Parcel parcel) {
                return new ShortLink(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShortLink[] newArray(int i) {
                return new ShortLink[i];
            }
        }
    }

    public /* synthetic */ LinkResolveType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
