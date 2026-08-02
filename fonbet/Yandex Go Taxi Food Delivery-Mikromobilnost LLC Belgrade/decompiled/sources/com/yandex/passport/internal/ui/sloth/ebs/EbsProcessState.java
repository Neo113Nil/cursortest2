package com.yandex.passport.internal.ui.sloth.ebs;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState;", "Landroid/os/Parcelable;", "ebsState", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;", "<init>", "(Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;)V", "getEbsState", "()Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;", "Common", "Failed", "EsiaConsent", "EsiaBioCreation", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$Common;", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$EsiaBioCreation;", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$EsiaConsent;", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$Failed;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class EbsProcessState implements Parcelable {
    public static final int $stable = 0;
    private final EbsState ebsState;

    private EbsProcessState(EbsState ebsState) {
        this.ebsState = ebsState;
    }

    public final EbsState getEbsState() {
        return this.ebsState;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$Common;", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState;", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;", ClidProvider.STATE, "<init>", "(Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;", "copy", "(Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;)Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$Common;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;", "getState", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Common extends EbsProcessState {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Common> CREATOR = new Creator();
        private final EbsState state;

        public Common(EbsState ebsState) {
            super(ebsState, null);
            this.state = ebsState;
        }

        public static /* synthetic */ Common copy$default(Common common, EbsState ebsState, int i, Object obj) {
            if ((i & 1) != 0) {
                ebsState = common.state;
            }
            return common.copy(ebsState);
        }

        /* renamed from: component1, reason: from getter */
        public final EbsState getState() {
            return this.state;
        }

        public final Common copy(EbsState state) {
            return new Common(state);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Common) && this.state == ((Common) other).state;
        }

        public final EbsState getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Common(state=" + this.state + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.state.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Common> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Common createFromParcel(Parcel parcel) {
                return new Common(EbsState.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Common[] newArray(int i) {
                return new Common[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$EsiaBioCreation;", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState;", "Landroid/net/Uri;", "deeplinkUri", "fallbackUri", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/net/Uri;", "component2", "copy", "(Landroid/net/Uri;Landroid/net/Uri;)Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$EsiaBioCreation;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getDeeplinkUri", "getFallbackUri", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EsiaBioCreation extends EbsProcessState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<EsiaBioCreation> CREATOR = new Creator();
        private final Uri deeplinkUri;
        private final Uri fallbackUri;

        public EsiaBioCreation(Uri uri, Uri uri2) {
            super(EbsState.ESIA_BIO_CREATION_PENDING, null);
            this.deeplinkUri = uri;
            this.fallbackUri = uri2;
        }

        public static /* synthetic */ EsiaBioCreation copy$default(EsiaBioCreation esiaBioCreation, Uri uri, Uri uri2, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = esiaBioCreation.deeplinkUri;
            }
            if ((i & 2) != 0) {
                uri2 = esiaBioCreation.fallbackUri;
            }
            return esiaBioCreation.copy(uri, uri2);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getDeeplinkUri() {
            return this.deeplinkUri;
        }

        /* renamed from: component2, reason: from getter */
        public final Uri getFallbackUri() {
            return this.fallbackUri;
        }

        public final EsiaBioCreation copy(Uri deeplinkUri, Uri fallbackUri) {
            return new EsiaBioCreation(deeplinkUri, fallbackUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EsiaBioCreation)) {
                return false;
            }
            EsiaBioCreation esiaBioCreation = (EsiaBioCreation) other;
            return jl40.l(this.deeplinkUri, esiaBioCreation.deeplinkUri) && jl40.l(this.fallbackUri, esiaBioCreation.fallbackUri);
        }

        public final Uri getDeeplinkUri() {
            return this.deeplinkUri;
        }

        public final Uri getFallbackUri() {
            return this.fallbackUri;
        }

        public int hashCode() {
            Uri uri = this.deeplinkUri;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            Uri uri2 = this.fallbackUri;
            return hashCode + (uri2 != null ? uri2.hashCode() : 0);
        }

        public String toString() {
            return "EsiaBioCreation(deeplinkUri=" + this.deeplinkUri + ", fallbackUri=" + this.fallbackUri + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.deeplinkUri, flags);
            dest.writeParcelable(this.fallbackUri, flags);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EsiaBioCreation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EsiaBioCreation createFromParcel(Parcel parcel) {
                return new EsiaBioCreation((Uri) parcel.readParcelable(EsiaBioCreation.class.getClassLoader()), (Uri) parcel.readParcelable(EsiaBioCreation.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EsiaBioCreation[] newArray(int i) {
                return new EsiaBioCreation[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$EsiaConsent;", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState;", "", ClidProvider.APPLICATION, "consumer", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$EsiaConsent;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplication", "getConsumer", "getScope", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EsiaConsent extends EbsProcessState {
        public static final int $stable = 0;
        public static final Parcelable.Creator<EsiaConsent> CREATOR = new Creator();
        private final String application;
        private final String consumer;
        private final String scope;

        public EsiaConsent(String str, String str2, String str3) {
            super(EbsState.ESIA_CONSENT_PENDING, null);
            this.application = str;
            this.consumer = str2;
            this.scope = str3;
        }

        public static /* synthetic */ EsiaConsent copy$default(EsiaConsent esiaConsent, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = esiaConsent.application;
            }
            if ((i & 2) != 0) {
                str2 = esiaConsent.consumer;
            }
            if ((i & 4) != 0) {
                str3 = esiaConsent.scope;
            }
            return esiaConsent.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getApplication() {
            return this.application;
        }

        /* renamed from: component2, reason: from getter */
        public final String getConsumer() {
            return this.consumer;
        }

        /* renamed from: component3, reason: from getter */
        public final String getScope() {
            return this.scope;
        }

        public final EsiaConsent copy(String application, String consumer, String scope) {
            return new EsiaConsent(application, consumer, scope);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EsiaConsent)) {
                return false;
            }
            EsiaConsent esiaConsent = (EsiaConsent) other;
            return jl40.l(this.application, esiaConsent.application) && jl40.l(this.consumer, esiaConsent.consumer) && jl40.l(this.scope, esiaConsent.scope);
        }

        public final String getApplication() {
            return this.application;
        }

        public final String getConsumer() {
            return this.consumer;
        }

        public final String getScope() {
            return this.scope;
        }

        public int hashCode() {
            return this.scope.hashCode() + unr0.b(this.application.hashCode() * 31, 31, this.consumer);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("EsiaConsent(application=");
            sb.append(this.application);
            sb.append(", consumer=");
            sb.append(this.consumer);
            sb.append(", scope=");
            return b64.p(sb, this.scope, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.application);
            dest.writeString(this.consumer);
            dest.writeString(this.scope);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EsiaConsent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EsiaConsent createFromParcel(Parcel parcel) {
                return new EsiaConsent(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EsiaConsent[] newArray(int i) {
                return new EsiaConsent[i];
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$Failed;", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState;", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;", ClidProvider.STATE, "", CRLReasonCodeExtension.REASON, "<init>", "(Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;Ljava/lang/String;)Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState$Failed;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsState;", "getState", "Ljava/lang/String;", "getReason", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed extends EbsProcessState {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        private final String reason;
        private final EbsState state;

        public Failed(EbsState ebsState, String str) {
            super(ebsState, null);
            this.state = ebsState;
            this.reason = str;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, EbsState ebsState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                ebsState = failed.state;
            }
            if ((i & 2) != 0) {
                str = failed.reason;
            }
            return failed.copy(ebsState, str);
        }

        /* renamed from: component1, reason: from getter */
        public final EbsState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final Failed copy(EbsState state, String reason) {
            return new Failed(state, reason);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return this.state == failed.state && jl40.l(this.reason, failed.reason);
        }

        public final String getReason() {
            return this.reason;
        }

        public final EbsState getState() {
            return this.state;
        }

        public int hashCode() {
            return this.reason.hashCode() + (this.state.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Failed(state=");
            sb.append(this.state);
            sb.append(", reason=");
            return b64.p(sb, this.reason, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.state.writeToParcel(dest, flags);
            dest.writeString(this.reason);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                return new Failed(EbsState.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }
    }

    public /* synthetic */ EbsProcessState(EbsState ebsState, DefaultConstructorMarker defaultConstructorMarker) {
        this(ebsState);
    }
}
