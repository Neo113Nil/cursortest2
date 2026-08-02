package com.yandex.passport.internal.ui.bouncer.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.social.esia.EsiaInternalBindProperties;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData;", "Landroid/os/Parcelable;", "EsiaApp2App", "BrowserOnly", "Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData$BrowserOnly;", "Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData$EsiaApp2App;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SocialContentData extends Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData$BrowserOnly;", "Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData;", "Landroid/net/Uri;", "socialUri", "amUri", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/net/Uri;", "component2", "copy", "(Landroid/net/Uri;Landroid/net/Uri;)Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData$BrowserOnly;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getSocialUri", "getAmUri", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BrowserOnly implements SocialContentData {
        public static final int $stable = 8;
        public static final Parcelable.Creator<BrowserOnly> CREATOR = new Creator();
        private final Uri amUri;
        private final Uri socialUri;

        public BrowserOnly(Uri uri, Uri uri2) {
            this.socialUri = uri;
            this.amUri = uri2;
        }

        public static /* synthetic */ BrowserOnly copy$default(BrowserOnly browserOnly, Uri uri, Uri uri2, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = browserOnly.socialUri;
            }
            if ((i & 2) != 0) {
                uri2 = browserOnly.amUri;
            }
            return browserOnly.copy(uri, uri2);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getSocialUri() {
            return this.socialUri;
        }

        /* renamed from: component2, reason: from getter */
        public final Uri getAmUri() {
            return this.amUri;
        }

        public final BrowserOnly copy(Uri socialUri, Uri amUri) {
            return new BrowserOnly(socialUri, amUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BrowserOnly)) {
                return false;
            }
            BrowserOnly browserOnly = (BrowserOnly) other;
            return jl40.l(this.socialUri, browserOnly.socialUri) && jl40.l(this.amUri, browserOnly.amUri);
        }

        public final Uri getAmUri() {
            return this.amUri;
        }

        public final Uri getSocialUri() {
            return this.socialUri;
        }

        public int hashCode() {
            return this.amUri.hashCode() + (this.socialUri.hashCode() * 31);
        }

        public String toString() {
            return "BrowserOnly(socialUri=" + this.socialUri + ", amUri=" + this.amUri + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.socialUri, flags);
            dest.writeParcelable(this.amUri, flags);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BrowserOnly> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BrowserOnly createFromParcel(Parcel parcel) {
                return new BrowserOnly((Uri) parcel.readParcelable(BrowserOnly.class.getClassLoader()), (Uri) parcel.readParcelable(BrowserOnly.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BrowserOnly[] newArray(int i) {
                return new BrowserOnly[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData$EsiaApp2App;", "Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData;", "Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserUnknownRequest;", "esiaBindProperties", "Landroid/net/Uri;", "amUri", "<init>", "(Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserUnknownRequest;Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserUnknownRequest;", "component2", "()Landroid/net/Uri;", "copy", "(Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserUnknownRequest;Landroid/net/Uri;)Lcom/yandex/passport/internal/ui/bouncer/model/SocialContentData$EsiaApp2App;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/social/esia/EsiaInternalBindProperties$UserUnknownRequest;", "getEsiaBindProperties", "Landroid/net/Uri;", "getAmUri", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EsiaApp2App implements SocialContentData {
        public static final int $stable = 8;
        public static final Parcelable.Creator<EsiaApp2App> CREATOR = new Creator();
        private final Uri amUri;
        private final EsiaInternalBindProperties.UserUnknownRequest esiaBindProperties;

        public EsiaApp2App(EsiaInternalBindProperties.UserUnknownRequest userUnknownRequest, Uri uri) {
            this.esiaBindProperties = userUnknownRequest;
            this.amUri = uri;
        }

        public static /* synthetic */ EsiaApp2App copy$default(EsiaApp2App esiaApp2App, EsiaInternalBindProperties.UserUnknownRequest userUnknownRequest, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                userUnknownRequest = esiaApp2App.esiaBindProperties;
            }
            if ((i & 2) != 0) {
                uri = esiaApp2App.amUri;
            }
            return esiaApp2App.copy(userUnknownRequest, uri);
        }

        /* renamed from: component1, reason: from getter */
        public final EsiaInternalBindProperties.UserUnknownRequest getEsiaBindProperties() {
            return this.esiaBindProperties;
        }

        /* renamed from: component2, reason: from getter */
        public final Uri getAmUri() {
            return this.amUri;
        }

        public final EsiaApp2App copy(EsiaInternalBindProperties.UserUnknownRequest esiaBindProperties, Uri amUri) {
            return new EsiaApp2App(esiaBindProperties, amUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EsiaApp2App)) {
                return false;
            }
            EsiaApp2App esiaApp2App = (EsiaApp2App) other;
            return jl40.l(this.esiaBindProperties, esiaApp2App.esiaBindProperties) && jl40.l(this.amUri, esiaApp2App.amUri);
        }

        public final Uri getAmUri() {
            return this.amUri;
        }

        public final EsiaInternalBindProperties.UserUnknownRequest getEsiaBindProperties() {
            return this.esiaBindProperties;
        }

        public int hashCode() {
            return this.amUri.hashCode() + (this.esiaBindProperties.hashCode() * 31);
        }

        public String toString() {
            return "EsiaApp2App(esiaBindProperties=" + this.esiaBindProperties + ", amUri=" + this.amUri + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.esiaBindProperties.writeToParcel(dest, flags);
            dest.writeParcelable(this.amUri, flags);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EsiaApp2App> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EsiaApp2App createFromParcel(Parcel parcel) {
                return new EsiaApp2App(EsiaInternalBindProperties.UserUnknownRequest.CREATOR.createFromParcel(parcel), (Uri) parcel.readParcelable(EsiaApp2App.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EsiaApp2App[] newArray(int i) {
                return new EsiaApp2App[i];
            }
        }
    }
}
