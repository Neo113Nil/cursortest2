package com.ybsdk.feature.resolver.internal.screens.empty;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.resolver.api.LinkResolveType;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/resolver/internal/screens/empty/EmptyLinkResolverParams;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/navigation/ScreenParams;", "initialLink", "", "<init>", "(Ljava/lang/String;)V", "getInitialLink", "()Ljava/lang/String;", "Common", Constants.LOGTAG, "Lcom/ybsdk/feature/resolver/internal/screens/empty/EmptyLinkResolverParams$Adjust;", "Lcom/ybsdk/feature/resolver/internal/screens/empty/EmptyLinkResolverParams$Common;", "feature-link-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EmptyLinkResolverParams implements Parcelable, ScreenParams {
    private final String initialLink;

    private EmptyLinkResolverParams(String str) {
        this.initialLink = str;
    }

    public final String getInitialLink() {
        return this.initialLink;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/resolver/internal/screens/empty/EmptyLinkResolverParams$Adjust;", "Lcom/ybsdk/feature/resolver/internal/screens/empty/EmptyLinkResolverParams;", "", "shortLink", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/resolver/internal/screens/empty/EmptyLinkResolverParams$Adjust;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShortLink", "feature-link-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Adjust extends EmptyLinkResolverParams {
        public static final Parcelable.Creator<Adjust> CREATOR = new Creator();
        private final String shortLink;

        public Adjust(String str) {
            super(str, null);
            this.shortLink = str;
        }

        public static /* synthetic */ Adjust copy$default(Adjust adjust, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = adjust.shortLink;
            }
            return adjust.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getShortLink() {
            return this.shortLink;
        }

        public final Adjust copy(String shortLink) {
            return new Adjust(shortLink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Adjust) && jl40.l(this.shortLink, ((Adjust) other).shortLink);
        }

        public final String getShortLink() {
            return this.shortLink;
        }

        public int hashCode() {
            return this.shortLink.hashCode();
        }

        public String toString() {
            return oyr.p("Adjust(shortLink=", this.shortLink, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.shortLink);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Adjust> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Adjust createFromParcel(Parcel parcel) {
                return new Adjust(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Adjust[] newArray(int i) {
                return new Adjust[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/resolver/internal/screens/empty/EmptyLinkResolverParams$Common;", "Lcom/ybsdk/feature/resolver/internal/screens/empty/EmptyLinkResolverParams;", "Lcom/ybsdk/feature/resolver/api/LinkResolveType;", "linkResolveType", "<init>", "(Lcom/ybsdk/feature/resolver/api/LinkResolveType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/resolver/api/LinkResolveType;", "copy", "(Lcom/ybsdk/feature/resolver/api/LinkResolveType;)Lcom/ybsdk/feature/resolver/internal/screens/empty/EmptyLinkResolverParams$Common;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/resolver/api/LinkResolveType;", "getLinkResolveType", "feature-link-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Common extends EmptyLinkResolverParams {
        public static final Parcelable.Creator<Common> CREATOR = new Creator();
        private final LinkResolveType linkResolveType;

        public Common(LinkResolveType linkResolveType) {
            super(linkResolveType.getUrl(), null);
            this.linkResolveType = linkResolveType;
        }

        public static /* synthetic */ Common copy$default(Common common, LinkResolveType linkResolveType, int i, Object obj) {
            if ((i & 1) != 0) {
                linkResolveType = common.linkResolveType;
            }
            return common.copy(linkResolveType);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkResolveType getLinkResolveType() {
            return this.linkResolveType;
        }

        public final Common copy(LinkResolveType linkResolveType) {
            return new Common(linkResolveType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Common) && jl40.l(this.linkResolveType, ((Common) other).linkResolveType);
        }

        public final LinkResolveType getLinkResolveType() {
            return this.linkResolveType;
        }

        public int hashCode() {
            return this.linkResolveType.hashCode();
        }

        public String toString() {
            return "Common(linkResolveType=" + this.linkResolveType + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.linkResolveType, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Common> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Common createFromParcel(Parcel parcel) {
                return new Common((LinkResolveType) parcel.readParcelable(Common.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Common[] newArray(int i) {
                return new Common[i];
            }
        }
    }

    public /* synthetic */ EmptyLinkResolverParams(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
